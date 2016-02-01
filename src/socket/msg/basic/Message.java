package socket.msg.basic;

import java.lang.reflect.Field;
import java.util.List;

import socket.util.ByteArray;
import socket.util.WritingBuffer;

import component.User;
import data.StaticInfo;
import socket.ClientSocket;

public abstract class Message {

    protected boolean _empty = false;
    protected User user;

    public Message(User user) {
        this.user = user;
    }

    public boolean checkEmpty() {
        return this._empty;
    }

    public void mergeFrom(ByteArray buff) {
        readFromSlice(buff, 0);
    }

    final public void writeTo(ByteArray data) {
        WritingBuffer buff = new WritingBuffer();
        writeToBuffer(buff);
        buff.toNormal(data);
    }

    public void readFromSlice(ByteArray data, int limit) {
        readFromBuffer(data, limit);
        //	System.out.println(this);
        if(user!=null)
        	action();
    }

    public void show(String msg) {
        
        if (user != null) {
            user.log(this.getClass() + ": " + msg);
        }else
            StaticInfo.debug(this.getClass() + ": " + msg);
    }

    public void show(String format, Object... args) {
        show(String.format(format, args));
    }

    public String toString(String indent) {
        String startIndent = indent;
        StringBuilder sb = new StringBuilder(startIndent + this.getClass().getSimpleName() + "{\n");
        indent = indent + "\t";
        for (Field f : this.getClass().getFields()) {
            try {
                if (f.getType() == List.class) {
                    sb.append(indent).append(f.getName()).append(" =[");
                    @SuppressWarnings("unchecked")
                    List<Object> list = (List<Object>) f.get(this);
                    for (Object o : list) {
                        if (o instanceof Message) {
                            sb.append(((Message) o).toString(indent + "\t")).append("," + "\n");
                        } else if (o instanceof String) {
                            sb.append(o.toString()).append(",\n");
                        } else {
                            sb.append(indent).append("\t").append(o).append(", ");
                        }
                    }
                    if (list.size() > 0) {
                        sb.append(indent);
                    }
                    sb.append("]\n");
                } else {
                    Object obj = f.get(this);
                    if (obj instanceof Message) {
                        sb.append(indent).append(f.getName()).append(" =\n")
                                .append(((Message) f.get(this)).toString(indent + "\t"));
                    } else {
                        sb.append(indent).append(f.getName()).append(" = ").append(obj).append("\n");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sb.append(startIndent).append("}\n").toString();
    }

    @Override
    public String toString() {
        return toString("");
    }

    public void setMsg(Object msg) {
        setMsg(msg.toString());
    }

    public void setMsg(String msg) {
        if (user != null) {
            user.setMsg(msg);
        } else {
            StaticInfo.debug(msg);
        }
    }
       
    public void error(String msg, ByteArray data) {
        //ClientSocket.printBytes(this.getClass() + ": " + msg, data.data());
    }


    /**
     * read server respond into local field, and call action();
     *
     * @param data
     * @param limit
     */
    protected abstract void readFromBuffer(ByteArray data, int limit);

    /**
     * called from readFromSlice(), start the routine after extract all data
     * from the server response.
     *
     */
    protected abstract void action();

    /**
     * write local field into buffer.
     *
     * @param data
     */
    public abstract void writeToBuffer(WritingBuffer data);
}
