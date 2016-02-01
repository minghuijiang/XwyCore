package socket.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteArray {

    protected ByteBuffer bb;
    public int pos;
    public int size;
    public boolean createFromArray;

    public ByteArray(int size) {
        this.size = size;
        this.pos = 0;
        bb = ByteBuffer.allocate(size);
        bb.order(ByteOrder.LITTLE_ENDIAN);
        createFromArray = false;
    }

    public ByteArray(byte[] wrap) {
        this.size = wrap.length;
        this.pos = size;
        bb = ByteBuffer.wrap(wrap);
        createFromArray = true;
        pos = wrap.length;
        bb.order(ByteOrder.LITTLE_ENDIAN);
    }

    public byte[] data() {
        //	System.out.println("pos: "+bb.position()+" "+pos+"  limit: "+bb.capacity());
        byte[] data = new byte[createFromArray ? pos : bb.position()];
        System.arraycopy(bb.array(), 0, data, 0, createFromArray ? pos : bb.position());
        return data;
    }
    
    public byte[] getData(){
        System.out.println("length: "+bb.array().length);

    	 byte[] data = new byte[bb.array().length];
         System.arraycopy(bb.array(), 0, data, 0, bb.array().length);
         return data;
    }

    public void writeBoolean(boolean val) {
        bb.put((byte) (val ? 1 : 0));
    }

    public void writeByte(int val) {
        bb.put((byte) val);
    }

    public void writeByte(byte val) {
        bb.put(val);
    }

    public void writeBytes(byte[] val, int offset, int length) {
        bb.put(val, offset, length);
    }

    public void writeDouble(double val) {
        bb.putDouble(val);
    }

    public void writeInt(int val) {
        bb.putInt(val);
    }

    public void writeShort(short val) {
        bb.putShort(val);
    }

    public void writeUnsignedInt(int val) {
        bb.putInt(val);
    }

    public void writeUTF(String val) {
        byte[] data = val.getBytes();
        bb.putShort((short) data.length);
        bb.put(data);
    }

    public void writeUTFBytes(String val) {
        bb.put(val.getBytes());
    }

    public void writeFloat(float val) {
        bb.putFloat(val);
    }

    public byte get() {
        return bb.get();
    }

    public short getShort() {
        return bb.getShort();
    }

    public void get(byte[] tmp) {
    	try{
    		bb.get(tmp);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }

    public void get(byte[] tmp, int i, int _loc_3) {
        bb.get(tmp, i, _loc_3);
    }

    public int getInt() {
        return bb.getInt();
    }

    public long getLong() {
        return bb.getLong();
    }

    public double getDouble() {
        // TODO Auto-generated method stub
        return bb.getDouble();
    }

    public float getFloat() {
        return bb.getFloat();
    }

    public int remaining() {
        return bb.remaining();
    }

    public int position() {
        // TODO Auto-generated method stub
        return bb.position();
    }
}
