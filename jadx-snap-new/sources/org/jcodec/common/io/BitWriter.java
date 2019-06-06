package org.jcodec.common.io;

import java.nio.ByteBuffer;

public class BitWriter {
    private int _curBit;
    private final ByteBuffer buf;
    private int curInt;
    private int initPos;

    public BitWriter(ByteBuffer byteBuffer) {
        this.buf = byteBuffer;
        this.initPos = byteBuffer.position();
    }

    private final void putInt(int i) {
        this.buf.put((byte) (i >>> 24));
        this.buf.put((byte) (i >> 16));
        this.buf.put((byte) (i >> 8));
        this.buf.put((byte) i);
    }

    public void flush() {
        int i = (this._curBit + 7) >> 3;
        for (int i2 = 0; i2 < i; i2++) {
            this.buf.put((byte) (this.curInt >>> 24));
            this.curInt <<= 8;
        }
    }

    public final void writeNBit(int i, int i2) {
        if (i2 > 32) {
            throw new IllegalArgumentException("Max 32 bit to write");
        } else if (i2 != 0) {
            i &= -1 >>> (32 - i2);
            int i3 = this._curBit;
            if (32 - i3 >= i2) {
                this.curInt = (i << ((32 - i3) - i2)) | this.curInt;
                this._curBit = i3 + i2;
                if (this._curBit == 32) {
                    putInt(this.curInt);
                    this._curBit = 0;
                    this.curInt = 0;
                    return;
                }
            }
            i2 -= 32 - i3;
            this.curInt |= i >>> i2;
            putInt(this.curInt);
            this.curInt = i << (32 - i2);
            this._curBit = i2;
        }
    }
}
