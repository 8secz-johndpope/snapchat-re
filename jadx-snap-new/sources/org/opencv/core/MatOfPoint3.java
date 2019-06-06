package org.opencv.core;

import java.util.Arrays;
import java.util.List;

public class MatOfPoint3 extends Mat {
    private static final int _channels = 3;
    private static final int _depth = 4;

    protected MatOfPoint3(long j) {
        super(j);
        if (!empty() && checkVector(3, 4) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfPoint3(Mat mat) {
        super(mat, Range.all());
        if (!empty() && checkVector(3, 4) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfPoint3(Point3... point3Arr) {
        fromArray(point3Arr);
    }

    public static MatOfPoint3 fromNativeAddr(long j) {
        return new MatOfPoint3(j);
    }

    public void alloc(int i) {
        if (i > 0) {
            super.create(i, 1, CvType.makeType(4, 3));
        }
    }

    public void fromArray(Point3... point3Arr) {
        if (point3Arr != null && point3Arr.length != 0) {
            int length = point3Arr.length;
            alloc(length);
            int[] iArr = new int[(length * 3)];
            for (int i = 0; i < length; i++) {
                Point3 point3 = point3Arr[i];
                int i2 = i * 3;
                iArr[i2] = (int) point3.x;
                iArr[i2 + 1] = (int) point3.y;
                iArr[i2 + 2] = (int) point3.z;
            }
            put(0, 0, iArr);
        }
    }

    public void fromList(List<Point3> list) {
        fromArray((Point3[]) list.toArray(new Point3[0]));
    }

    public Point3[] toArray() {
        int total = (int) total();
        Point3[] point3Arr = new Point3[total];
        if (total == 0) {
            return point3Arr;
        }
        int[] iArr = new int[(total * 3)];
        int i = 0;
        get(0, 0, iArr);
        while (i < total) {
            int i2 = i * 3;
            point3Arr[i] = new Point3((double) iArr[i2], (double) iArr[i2 + 1], (double) iArr[i2 + 2]);
            i++;
        }
        return point3Arr;
    }

    public List<Point3> toList() {
        return Arrays.asList(toArray());
    }
}
