package org.jcodec.common;

public class IntArrayList {
    private int _size;
    private int growAmount;
    private int[] storage;

    public IntArrayList(int i) {
        this.growAmount = i;
        this.storage = new int[i];
    }

    public static IntArrayList createIntArrayList() {
        return new IntArrayList(128);
    }

    public void add(int i) {
        int[] iArr;
        int i2 = this._size;
        int[] iArr2 = this.storage;
        if (i2 >= iArr2.length) {
            iArr = new int[(iArr2.length + this.growAmount)];
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.storage = iArr;
        }
        iArr = this.storage;
        int i3 = this._size;
        this._size = i3 + 1;
        iArr[i3] = i;
    }

    public boolean contains(int i) {
        for (int i2 = 0; i2 < this._size; i2++) {
            if (this.storage[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public void pop() {
        int i = this._size;
        if (i != 0) {
            this._size = i - 1;
        }
    }

    public void push(int i) {
        add(i);
    }
}
