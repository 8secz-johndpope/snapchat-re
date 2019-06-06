package org.opencv.core;

import java.util.Arrays;
import java.util.List;

public class MatOfDouble extends Mat {
    private static final int _channels = 1;
    private static final int _depth = 6;

    protected MatOfDouble(long j) {
        super(j);
        if (!empty() && checkVector(1, 6) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfDouble(Mat mat) {
        super(mat, Range.all());
        if (!empty() && checkVector(1, 6) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfDouble(double... dArr) {
        fromArray(dArr);
    }

    public static MatOfDouble fromNativeAddr(long j) {
        return new MatOfDouble(j);
    }

    public void alloc(int i) {
        if (i > 0) {
            super.create(i, 1, CvType.makeType(6, 1));
        }
    }

    public void fromArray(double... dArr) {
        if (dArr != null && dArr.length != 0) {
            alloc(dArr.length);
            put(0, 0, dArr);
        }
    }

    public void fromList(List<Double> list) {
        if (list != null && list.size() != 0) {
            int i = 0;
            Double[] dArr = (Double[]) list.toArray(new Double[0]);
            double[] dArr2 = new double[dArr.length];
            while (i < dArr.length) {
                dArr2[i] = dArr[i].doubleValue();
                i++;
            }
            fromArray(dArr2);
        }
    }

    public double[] toArray() {
        int checkVector = checkVector(1, 6);
        if (checkVector >= 0) {
            double[] dArr = new double[checkVector];
            if (checkVector == 0) {
                return dArr;
            }
            get(0, 0, dArr);
            return dArr;
        }
        StringBuilder stringBuilder = new StringBuilder("Native Mat has unexpected type or size: ");
        stringBuilder.append(toString());
        throw new RuntimeException(stringBuilder.toString());
    }

    public List<Double> toList() {
        double[] toArray = toArray();
        Double[] dArr = new Double[toArray.length];
        for (int i = 0; i < toArray.length; i++) {
            dArr[i] = Double.valueOf(toArray[i]);
        }
        return Arrays.asList(dArr);
    }
}
