package org.opencv.core;

import java.util.Arrays;
import java.util.List;

public class MatOfByte extends Mat {
    private static final int _channels = 1;
    private static final int _depth = 0;

    protected MatOfByte(long j) {
        super(j);
        if (!empty() && checkVector(1, 0) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfByte(Mat mat) {
        super(mat, Range.all());
        if (!empty() && checkVector(1, 0) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfByte(byte... bArr) {
        fromArray(bArr);
    }

    public static MatOfByte fromNativeAddr(long j) {
        return new MatOfByte(j);
    }

    public void alloc(int i) {
        if (i > 0) {
            super.create(i, 1, CvType.makeType(0, 1));
        }
    }

    public void fromArray(byte... bArr) {
        if (bArr != null && bArr.length != 0) {
            alloc(bArr.length);
            put(0, 0, bArr);
        }
    }

    public void fromList(List<Byte> list) {
        if (list != null && list.size() != 0) {
            int i = 0;
            Byte[] bArr = (Byte[]) list.toArray(new Byte[0]);
            byte[] bArr2 = new byte[bArr.length];
            while (i < bArr.length) {
                bArr2[i] = bArr[i].byteValue();
                i++;
            }
            fromArray(bArr2);
        }
    }

    public byte[] toArray() {
        int checkVector = checkVector(1, 0);
        if (checkVector >= 0) {
            byte[] bArr = new byte[checkVector];
            if (checkVector == 0) {
                return bArr;
            }
            get(0, 0, bArr);
            return bArr;
        }
        StringBuilder stringBuilder = new StringBuilder("Native Mat has unexpected type or size: ");
        stringBuilder.append(toString());
        throw new RuntimeException(stringBuilder.toString());
    }

    public List<Byte> toList() {
        byte[] toArray = toArray();
        Byte[] bArr = new Byte[toArray.length];
        for (int i = 0; i < toArray.length; i++) {
            bArr[i] = Byte.valueOf(toArray[i]);
        }
        return Arrays.asList(bArr);
    }
}
