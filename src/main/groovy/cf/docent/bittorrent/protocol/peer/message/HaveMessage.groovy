package cf.docent.bittorrent.protocol.peer.message

import cf.docent.bittorrent.protocol.peer.PeerMessage

class HaveMessage implements PeerMessage {

    byte[] messageBytes

    public HaveMessage(byte[] messageBytes) {
        this.messageBytes = messageBytes
    }

    @Override
    byte[] getMessageBytes() {
        return messageBytes
    }

    @Override
    String toString() {
        "HaveMessage for index #${intFromBytes()}"
    }
}
