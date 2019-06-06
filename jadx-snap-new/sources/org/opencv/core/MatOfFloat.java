package org.opencv.core;

import java.util.Arrays;
import java.util.List;

public class MatOfFloat extends Mat {
    private static final int _channels = 1;
    private static final int _depth = 5;

    protected MatOfFloat(long j) {
        super(j);
        if (!empty() && checkVector(1, 5) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfFloat(Mat mat) {
        super(mat, Range.all());
        if (!empty() && checkVector(1, 5) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfFloat(float... fArr) {
        fromArray(fArr);
    }

    public static MatOfFloat fromNativeAddr(long j) {
        return new MatOfFloat(j);
    }

    public void alloc(int i) {
        if (i > 0) {
            super.create(i, 1, CvType.makeType(5, 1));
        }
    }

    public void fromArray(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            alloc(fArr.length);
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
        int checkVector = checkVector(1, 5);
        if (checkVector >= 0) {
            float[] fArr = new float[checkVector];
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
