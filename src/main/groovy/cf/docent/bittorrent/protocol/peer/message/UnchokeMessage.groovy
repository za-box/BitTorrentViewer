package cf.docent.bittorrent.protocol.peer.message

import cf.docent.bittorrent.protocol.peer.PeerMessage

/**
 * Created by docent on 01.12.15.
 */
class UnchokeMessage implements PeerMessage {

    @Override
    byte[] getMessageBytes() {
        return new byte[0]
    }

    @Override
    byte getMessageId() {
        return 1
    }
}
