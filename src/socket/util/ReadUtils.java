package socket.util;

import com.mingJiang.util.EncodeUtil;
import com.mingJiang.util.Util;
import data.StaticInfo;
import java.util.List;

import socket.msg.basic.Message;
import socket.msg.constant.WireType;

public class ReadUtils {

    public static void skip(ByteArray buff, int type) {
        int num = 0;
        switch (type) {
            case WireType.VARINT:
                while (buff.get() >= 128) {
                }
                break;

            case WireType.FIXED_64_BIT:
                buff.getInt();
                buff.getInt();
                break;

            case WireType.LENGTH_DELIMITED:
                num = read$TYPE_UINT32(buff);
                while (num-- != 0) {
                    buff.get();
                }
                break;

            case WireType.FIXED_32_BIT:
                buff.getInt();
                break;

            default:
            	//TODO  do something
                //throw new IOError("Invalid wire type: " + limit);
                break;
        }
        return;
    }

    public static double read$TYPE_DOUBLE(ByteArray buff) {
        return buff.getDouble();
    }

    public static float read$TYPE_FLOAT(ByteArray buff) {
        return buff.getFloat();
    }

    public static long read$TYPE_INT64(ByteArray buff) {
        return buff.getLong();
    }

    public static long read$TYPE_UINT64(ByteArray buff) {
        return buff.getLong();
    }

    public static int read$TYPE_INT32(ByteArray buff) {
        return read$TYPE_UINT32(buff);
    }

    public static long read$TYPE_FIXED64(ByteArray buff) {
        return buff.getLong();
    }

    public static int read$TYPE_FIXED32(ByteArray buff) {
        return buff.getInt();
    }

    public static boolean read$TYPE_BOOL(ByteArray buff) {
        return buff.get() == 1;
    }

    public static String read$TYPE_STRING(ByteArray buff) {
        int length = read$TYPE_UINT32(buff);
        byte[] tmp = new byte[length];
        buff.get(tmp);
        return EncodeUtil.decode(new String(tmp));
    }

    public static ByteArray read$TYPE_BYTES(ByteArray buff) {
        //TODO  can be simplify?
        ByteArray _loc_2;
        int length = read$TYPE_UINT32(buff);
        _loc_2 = new ByteArray(length);
        if (length > 0) {
            byte[] tmp = new byte[length];
            buff.get(tmp, 0, length);
            _loc_2 = new ByteArray(tmp);
        }
        return _loc_2;
    }

    public static int read$TYPE_UINT32(ByteArray buff) {
        int byteVal = 0;
        int value = 0;
        int byteNum = 0;
        while (true) {
            byteVal = buff.get() & 0xff;
            //System.out.println("byteVal: "+byteVal);
            if (byteNum < 32) {
                if (byteVal >= 128) {
                    value = value | (byteVal & 127) << byteNum;
                } else {
                    value = value | byteVal << byteNum;
                    break;
                }
            } else {
                while (buff.get() >= 128) {
                }
                break;
            }
            byteNum = byteNum + 7;
        }
        return value;
    }

    public static int read$TYPE_ENUM(ByteArray buff) {
        return read$TYPE_INT32(buff);
    }

    public static Message read$TYPE_MESSAGE(ByteArray buff, Message msg) {
        int length = read$TYPE_UINT32(buff);
        if (buff.remaining() < length) {
           // StaticInfo.debug("read util read message. remain less");
            return msg;
            //throw new IOError("Invalid message length: " + _loc_3);
        }
        int upLimit = buff.remaining() - length;
        msg.readFromSlice(buff, upLimit);

        return msg;
    }

    public static void readPackedRepeated$TYPE_ENUM(ByteArray buff, List<Integer> list) {
        int length = ReadUtils.read$TYPE_UINT32(buff);
        if (buff.remaining() < length) {
            StaticInfo.debug("Invalid message length: " + length);
        }

        int readLimit = buff.remaining() - length;
        while (buff.remaining() > readLimit) {
            list.add(ReadUtils.read$TYPE_ENUM(buff));
        }
        if (buff.remaining() != readLimit) {
            StaticInfo.debug("Invalid packed repeated data");
        }
    }

    public static void readPackedRepeated$TYPE_INT32(ByteArray buff, List<Integer> list) {
        int length = ReadUtils.read$TYPE_UINT32(buff);
        if (buff.remaining() < length) {
            StaticInfo.debug("Invalid message length: " + length);
        }

        int readLimit = buff.remaining() - length;
        while (buff.remaining() > readLimit) {
            list.add(ReadUtils.read$TYPE_INT32(buff));
        }
        if (buff.remaining() != readLimit) {
            StaticInfo.debug("Invalid packed repeated data");
        }
    }

}
