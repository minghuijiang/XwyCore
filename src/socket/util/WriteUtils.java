package socket.util;

import socket.msg.basic.Message;

public class WriteUtils {

    public static void write$TYPE_MESSAGE(WritingBuffer buff, Message msg) {

        int index = buff.beginBlock();
        msg.writeToBuffer(buff);
        buff.endBlock(index);
    }

    public static void writeTag(WritingBuffer buff, int type, int value) {
        write$TYPE_UINT32(buff, value << 3 | type);
    }

    public static void write$TYPE_UINT32(WritingBuffer buff, int value) {
        while (true) {
            if (value < 128) {
                buff.writeByte((byte) value);
                return;
            }
            buff.writeByte((byte) (value & 127 | 128));
            value = value >>> 7;
        }
    }

    public static void write$TYPE_BOOL(WritingBuffer buff, boolean value) {
        buff.writeByte(value ? (1) : (0));
    }

    public static void write$TYPE_DOUBLE(WritingBuffer buff, double value) {
        buff.writeDouble(value);
    }

    public static void write$TYPE_FLOAT(WritingBuffer buff, float value) {
        buff.writeFloat(value);
    }

    public static void writeVarint64(WritingBuffer buff, int value, long param3) {
        //TODO skipped
        int _loc_4 = 0;
        if (param3 == 0) {
            write$TYPE_UINT32(buff, value);
        } else {
            _loc_4 = 0;
            while (_loc_4 < 4) {

                buff.writeByte(value & 127 | 128);
                value = value >>> 7;
                _loc_4 = _loc_4 + 1;
            }
            if ((param3 & 268435455 << 3) == 0) {
                buff.writeByte((byte) (param3 << 4 | value));
            } else {
                buff.writeByte((byte) ((param3 << 4 | value) & 127 | 128));
                write$TYPE_UINT32(buff, (int) (param3 >>> 3));
            }
        }
    }

    public static void write$TYPE_INT32(WritingBuffer buff, int value) {
        if (value < 0) {
            writeVarint64(buff, value, 4294967295L);
        } else {
            write$TYPE_UINT32(buff, value);
        }
    }

    public static void write$TYPE_FIXED32(WritingBuffer buff, int value) {
        buff.writeUnsignedInt(value);
    }

    public static void write$TYPE_STRING(WritingBuffer buff, String value) {
        int index = buff.beginBlock();
        buff.writeUTFBytes(value);
        buff.endBlock(index);
    }

    /*    public static function write$TYPE_BYTES(WritingBuffer buff, limit:ByteArray) : void
     {
     write$TYPE_UINT32(buff, limit.length);
     buff.writeBytes(limit);
        
     }// end function
     */
    public static void write$TYPE_ENUM(WritingBuffer buff, int value) {
        write$TYPE_INT32(buff, value);
    }

    public static void write$TYPE_SFIXED32(WritingBuffer buff, int value) {
        buff.writeInt(value);
    }

}
