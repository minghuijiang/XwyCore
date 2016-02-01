package socket.msg.chat.rsp;

import socket.msg.constant.ChatType;
import socket.msg.constant.Constant;
import socket.msg.constant.Status;
import socket.util.ByteArray;
import socket.util.ReadUtils;
import component.User;

public class Chat extends socket.msg.basic.Respond {

	public static boolean show = false;
    public int status;
    public int chatType;
    public int userId;
    public String userName;
    public String content;
    public String title;
    public int achieveId;

    public Chat(User user) {
        super(user);
    }

    private String parseChat() {
        if (status != Status.RIGHT) {
            return Constant.chatStatus(status);
        }
        String val = "[" + Constant.chatType(chatType) + "]";
        if (userName.length() > 6) {
            val += "[" + userName.substring(0, 6) + "...]:" + userId + ":\n\t" + content;
        } else {
            val += "[" + userName + "]:" + userId + ":\n\t" + content;
        }
        return val;
    }

    @Override
    protected void readFromBuffer(ByteArray buff, int limit) {
        int _loc_9 = 0;
        while (buff.remaining() > limit) {
            _loc_9 = ReadUtils.read$TYPE_UINT32(buff);

            switch (_loc_9 >> 3) {
                case 1:
                    if (this.status != 0) {
                        show("Bad data format: Chat.status cannot be set twice.");
                    }

                    this.status = ReadUtils.read$TYPE_ENUM(buff);
                    break;
                case 2:
                    if (this.chatType != 0) {
                        show("Bad data format: Chat.chatType cannot be set twice.");
                    }
                    this.chatType = ReadUtils.read$TYPE_ENUM(buff);
                    break;
                case 3:
                    if (this.userId != 0) {
                        show("Bad data format: Chat.userId cannot be set twice.");
                    }

                    this.userId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                case 4:
                    if (this.userName != null) {
                        show("Bad data format: Chat.userName cannot be set twice.");
                    }

                    this.userName = ReadUtils.read$TYPE_STRING(buff);
                    break;
                case 5:
                    if (this.content != null) {
                        show("Bad data format: Chat.content cannot be set twice.");
                    }

                    this.content = ReadUtils.read$TYPE_STRING(buff);
                    break;
                case 6:
                    if (this.title != null) {
                        show("Bad data format: Chat.title cannot be set twice.");
                    }

                    this.title = ReadUtils.read$TYPE_STRING(buff);
                    break;
                case 7:
                    if (this.title != null) {
                    //    show("Bad data format: Chat.title cannot be set twice.");
                    }

                    this.achieveId = ReadUtils.read$TYPE_INT32(buff);
                    break;
                default:
                    error("unknown data", buff);
                    return;
            }
        }
    }

    @Override
    protected void action() {
    	if(show)//&&chatType!=ChatType.SYSTEM)
    		setMsg(parseChat());
    }

}
