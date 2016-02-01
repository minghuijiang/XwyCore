package socket.msg.basic;

import data.StaticInfo;
import socket.util.ByteArray;
import socket.util.WritingBuffer;

public abstract class Request extends Message {

    /**
     * There should not be any error or any need of User reference.
     */
    public Request() {
        super(null);
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        StaticInfo.info("This should not be called, read from Buffer.");
    }

    @Override
    protected void action() {
    }

    @Override
    public abstract void writeToBuffer(WritingBuffer buff);

}
