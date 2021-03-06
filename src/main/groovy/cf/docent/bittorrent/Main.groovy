package cf.docent.bittorrent
import cf.docent.bittorrent.conf.ContextConfiguration
import org.springframework.context.annotation.AnnotationConfigApplicationContext

def context = new AnnotationConfigApplicationContext(ContextConfiguration)
def torrentManager = context.getBean(TorrentManager)
def torrent = torrentManager.addTorrent(new File("/Users/docent/Downloads/[rutor.org]Poslednij.ohotnik.na.vedm_The.Last.Witch.Hunter.20.torrent" +
        ""))
//def torrent = torrentManager.addTorrent(new File("/Users/docent/Downloads/ubuntu-15.10-desktop-amd64.iso.torrent"))
//def torrent = torrentManager.addTorrent(new File("/Users/docent/Downloads/[rutor.org]3B3P3Ct.2015.D.WEB-DL.720p.mkv.torrent"))
println torrent
torrent.connectPeers()

torrent.listTorrentFiles().get(0)

println "Read some data?"
System.in.read()

def data = torrent.getFileData(torrent.listTorrentFiles().get(0))
println "Data read"

new File("/Users/docent/" + torrent.listTorrentFiles().get(0).fileName).append data