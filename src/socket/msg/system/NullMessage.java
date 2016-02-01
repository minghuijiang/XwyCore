package socket.msg.system;

import socket.msg.basic.Message;
import socket.util.ByteArray;
import socket.util.WritingBuffer;
import component.User;

public class NullMessage extends Message {

    public NullMessage(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
    }

    @Override
    protected void action() {
		// TODO Auto-generated method stub

    }

    @Override
    public void writeToBuffer(WritingBuffer buff) {
		// TODO Auto-generated method stub

    }

}
