package org.opencv.core;

import java.util.Arrays;
import java.util.List;

public class MatOfInt extends Mat {
    private static final int _channels = 1;
    private static final int _depth = 4;

    protected MatOfInt(long j) {
        super(j);
        if (!empty() && checkVector(1, 4) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfInt(Mat mat) {
        super(mat, Range.all());
        if (!empty() && checkVector(1, 4) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfInt(int... iArr) {
        fromArray(iArr);
    }

    public static MatOfInt fromNativeAddr(long j) {
        return new MatOfInt(j);
    }

    public void alloc(int i) {
        if (i > 0) {
            super.create(i, 1, CvType.makeType(4, 1));
        }
    }

    public void fromArray(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            alloc(iArr.length);
            put(0, 0, iArr);
        }
    }

    public void fromList(List<Integer> list) {
        if (list != null && list.size() != 0) {
            int i = 0;
            Integer[] numArr = (Integer[]) list.toArray(new Integer[0]);
            int[] iArr = new int[numArr.length];
            while (i < numArr.length) {
                iArr[i] = numArr[i].intValue();
                i++;
            }
            fromArray(iArr);
        }
    }

    public int[] toArray() {
        int checkVector = checkVector(1, 4);
        if (checkVector >= 0) {
            int[] iArr = new int[checkVector];
            if (checkVector == 0) {
                return iArr;
            }
            get(0, 0, iArr);
            return iArr;
        }
        StringBuilder stringBuilder = new StringBuilder("Native Mat has unexpected type or size: ");
        stringBuilder.append(toString());
        throw new RuntimeException(stringBuilder.toString());
    }

    public List<Integer> toList() {
        int[] toArray = toArray();
        Integer[] numArr = new Integer[toArray.length];
        for (int i = 0; i < toArray.length; i++) {
            numArr[i] = Integer.valueOf(toArray[i]);
        }
        return Arrays.asList(numArr);
    }
}
