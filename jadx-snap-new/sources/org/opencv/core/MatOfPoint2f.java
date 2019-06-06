package org.opencv.core;

import java.util.Arrays;
import java.util.List;

public class MatOfPoint2f extends Mat {
    private static final int _channels = 2;
    private static final int _depth = 5;

    protected MatOfPoint2f(long j) {
        super(j);
        if (!empty() && checkVector(2, 5) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfPoint2f(Mat mat) {
        super(mat, Range.all());
        if (!empty() && checkVector(2, 5) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfPoint2f(Point... pointArr) {
        fromArray(pointArr);
    }

    public static MatOfPoint2f fromNativeAddr(long j) {
        return new MatOfPoint2f(j);
    }

    public void alloc(int i) {
        if (i > 0) {
            super.create(i, 1, CvType.makeType(5, 2));
        }
    }

    public void fromArray(Point... pointArr) {
        if (pointArr != null && pointArr.length != 0) {
            int length = pointArr.length;
            alloc(length);
            float[] fArr = new float[(length << 1)];
            for (int i = 0; i < length; i++) {
                Point point = pointArr[i];
                int i2 = i * 2;
                fArr[i2] = (float) point.x;
                fArr[i2 + 1] = (float) point.y;
            }
            put(0, 0, fArr);
        }
    }

    public void fromList(List<Point> list) {
        fromArray((Point[]) list.toArray(new Point[0]));
    }

    public Point[] toArray() {
        int total = (int) total();
        Point[] pointArr = new Point[total];
        if (total == 0) {
            return pointArr;
        }
        float[] fArr = new float[(total << 1)];
        int i = 0;
        get(0, 0, fArr);
        while (i < total) {
            int i2 = i << 1;
            pointArr[i] = new Point((double) fArr[i2], (double) fArr[i2 + 1]);
            i++;
        }
        return pointArr;
    }

    public List<Point> toList() {
        return Arrays.asList(toArray());
    }
}
