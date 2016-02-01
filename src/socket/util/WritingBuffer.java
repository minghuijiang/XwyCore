package socket.util;

import java.util.Vector;

public class WritingBuffer extends ByteArray {

    public Vector<Integer> slices;

    public WritingBuffer() {
        this(256);
    }

    public WritingBuffer(int size) {
        super(size);
        this.slices = new Vector<Integer>();
    }

    public int beginBlock() {
        int position = bb.position();
        this.slices.add(position);
        int pos = slices.size();
        this.slices.add(0);
        this.slices.add(0);
        this.slices.add(position);
        return pos;
    }

    public void endBlock(int pos) {
        int position = bb.position();
        this.slices.add(position);
        int posVal = this.slices.get(pos + 2);
        this.slices.set(pos, position);
        WriteUtils.write$TYPE_UINT32(this, bb.position() - posVal);
        this.slices.set(pos + 1, bb.position());
        this.slices.add(bb.position());
    }

    public void toNormal(ByteArray by) {
        //printVector();
        byte[] val = new byte[bb.position()];
        System.arraycopy(bb.array(), 0, val, 0, bb.position());

        int _loc_4 = 0;
        int vecPos = 0;
        int _loc_3 = 0;
        while (vecPos < this.slices.size()) {
            _loc_4 = this.slices.get(vecPos);
            vecPos++;
            if (_loc_4 > _loc_3) {
                by.writeBytes(val, _loc_3, _loc_4 - _loc_3);
            }
            _loc_3 = this.slices.get(vecPos);
            vecPos++;
        }
        by.writeBytes(val, _loc_3, bb.position() - _loc_3);
    }

    public void printVector() {
        System.out.println();
        for (int i : slices) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
