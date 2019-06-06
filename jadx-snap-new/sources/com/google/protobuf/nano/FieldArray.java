package com.google.protobuf.nano;

public final class FieldArray implements Cloneable {
    private static final FieldData DELETED = new FieldData();
    private FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage;
    private int mSize;

    FieldArray() {
        this(10);
    }

    FieldArray(int i) {
        this.mGarbage = false;
        i = idealIntArraySize(i);
        this.mFieldNumbers = new int[i];
        this.mData = new FieldData[i];
        this.mSize = 0;
    }

    private boolean arrayEquals(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean arrayEquals(FieldData[] fieldDataArr, FieldData[] fieldDataArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!fieldDataArr[i2].equals(fieldDataArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private int binarySearch(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.mFieldNumbers[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    private void gc() {
        int i = this.mSize;
        int[] iArr = this.mFieldNumbers;
        FieldData[] fieldDataArr = this.mData;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            FieldData fieldData = fieldDataArr[i3];
            if (fieldData != DELETED) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    fieldDataArr[i2] = fieldData;
                    fieldDataArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    private int idealByteArraySize(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    private int idealIntArraySize(int i) {
        return idealByteArraySize(i << 2) / 4;
    }

    public final FieldArray clone() {
        int size = size();
        FieldArray fieldArray = new FieldArray(size);
        int i = 0;
        System.arraycopy(this.mFieldNumbers, 0, fieldArray.mFieldNumbers, 0, size);
        while (i < size) {
            FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[i] != null) {
                fieldArray.mData[i] = fieldDataArr[i].clone();
            }
            i++;
        }
        fieldArray.mSize = size;
        return fieldArray;
    }

    /* Access modifiers changed, original: final */
    public final FieldData dataAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mData[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldArray)) {
            return false;
        }
        FieldArray fieldArray = (FieldArray) obj;
        return size() == fieldArray.size() && arrayEquals(this.mFieldNumbers, fieldArray.mFieldNumbers, this.mSize) && arrayEquals(this.mData, fieldArray.mData, this.mSize);
    }

    /* Access modifiers changed, original: final */
    public final FieldData get(int i) {
        i = binarySearch(i);
        if (i >= 0) {
            FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[i] != DELETED) {
                return fieldDataArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        if (this.mGarbage) {
            gc();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.mFieldNumbers[i2]) * 31) + this.mData[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* Access modifiers changed, original: final */
    public final void put(int i, FieldData fieldData) {
        int binarySearch = binarySearch(i);
        if (binarySearch >= 0) {
            this.mData[binarySearch] = fieldData;
            return;
        }
        FieldData[] fieldDataArr;
        int[] iArr;
        binarySearch ^= -1;
        if (binarySearch < this.mSize) {
            fieldDataArr = this.mData;
            if (fieldDataArr[binarySearch] == DELETED) {
                this.mFieldNumbers[binarySearch] = i;
                fieldDataArr[binarySearch] = fieldData;
                return;
            }
        }
        if (this.mGarbage && this.mSize >= this.mFieldNumbers.length) {
            gc();
            binarySearch = binarySearch(i) ^ -1;
        }
        int i2 = this.mSize;
        if (i2 >= this.mFieldNumbers.length) {
            i2 = idealIntArraySize(i2 + 1);
            iArr = new int[i2];
            fieldDataArr = new FieldData[i2];
            int[] iArr2 = this.mFieldNumbers;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            FieldData[] fieldDataArr2 = this.mData;
            System.arraycopy(fieldDataArr2, 0, fieldDataArr, 0, fieldDataArr2.length);
            this.mFieldNumbers = iArr;
            this.mData = fieldDataArr;
        }
        i2 = this.mSize;
        if (i2 - binarySearch != 0) {
            iArr = this.mFieldNumbers;
            int i3 = binarySearch + 1;
            System.arraycopy(iArr, binarySearch, iArr, i3, i2 - binarySearch);
            fieldDataArr = this.mData;
            System.arraycopy(fieldDataArr, binarySearch, fieldDataArr, i3, this.mSize - binarySearch);
        }
        this.mFieldNumbers[binarySearch] = i;
        this.mData[binarySearch] = fieldData;
        this.mSize++;
    }

    /* Access modifiers changed, original: final */
    public final void remove(int i) {
        i = binarySearch(i);
        if (i >= 0) {
            FieldData[] fieldDataArr = this.mData;
            FieldData fieldData = fieldDataArr[i];
            FieldData fieldData2 = DELETED;
            if (fieldData != fieldData2) {
                fieldDataArr[i] = fieldData2;
                this.mGarbage = true;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }
}
