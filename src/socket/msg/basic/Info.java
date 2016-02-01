package socket.msg.basic;

import socket.util.ByteArray;
import component.User;

public abstract class Info extends Respond {

    public Info(User user) {
        super(user);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected abstract void readFromBuffer(ByteArray data, int limit);

    @Override
    protected void action() {
    }

}
