package org.opencv.core;

import java.util.Arrays;
import java.util.List;

public class MatOfFloat6 extends Mat {
    private static final int _channels = 6;
    private static final int _depth = 5;

    protected MatOfFloat6(long j) {
        super(j);
        if (!empty() && checkVector(6, 5) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfFloat6(Mat mat) {
        super(mat, Range.all());
        if (!empty() && checkVector(6, 5) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfFloat6(float... fArr) {
        fromArray(fArr);
    }

    public static MatOfFloat6 fromNativeAddr(long j) {
        return new MatOfFloat6(j);
    }

    public void alloc(int i) {
        if (i > 0) {
            super.create(i, 1, CvType.makeType(5, 6));
        }
    }

    public void fromArray(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            alloc(fArr.length / 6);
            put(0, 0, fArr);
        }
    }

    public void fromList(List<Float> list) {
        if (list != null && list.size() != 0) {
            int i = 0;
            Float[] fArr = (Float[]) list.toArray(new Float[0]);
            float[] fArr2 = new float[fArr.length];
            while (i < fArr.length) {
                fArr2[i] = fArr[i].floatValue();
                i++;
            }
            fromArray(fArr2);
        }
    }

    public float[] toArray() {
        int checkVector = checkVector(6, 5);
        if (checkVector >= 0) {
            float[] fArr = new float[(checkVector * 6)];
            if (checkVector == 0) {
                return fArr;
            }
            get(0, 0, fArr);
            return fArr;
        }
        StringBuilder stringBuilder = new StringBuilder("Native Mat has unexpected type or size: ");
        stringBuilder.append(toString());
        throw new RuntimeException(stringBuilder.toString());
    }

    public List<Float> toList() {
        float[] toArray = toArray();
        Float[] fArr = new Float[toArray.length];
        for (int i = 0; i < toArray.length; i++) {
            fArr[i] = Float.valueOf(toArray[i]);
        }
        return Arrays.asList(fArr);
    }
}
