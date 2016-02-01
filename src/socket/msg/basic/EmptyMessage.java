package socket.msg.basic;

import data.StaticInfo;
import socket.util.ByteArray;
import socket.util.WritingBuffer;

public class EmptyMessage extends Message {

    // should not need user.
    public EmptyMessage() {
        super(null);
        _empty = true;
    }

    @Override
    protected void readFromBuffer(ByteArray data, int limit) {
        StaticInfo.info("This is an empty message, should not call read from buffer ");

    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
		// TODO Auto-generated method stub

    }

    @Override
    protected void action() {
		// TODO Auto-generated method stub

    }

}
