package socket.msg.basic;

import socket.util.ByteArray;
import socket.util.WritingBuffer;
import component.User;

public abstract class Respond extends Message {

    public Respond(User user) {
        super(user);
    }

    @Override
    protected abstract void readFromBuffer(ByteArray buff, int limit);

    @Override
    protected abstract void action();

    @Override
    public void writeToBuffer(WritingBuffer buff) {
        show("This should not be called, write to Buffer.");
    }

}
