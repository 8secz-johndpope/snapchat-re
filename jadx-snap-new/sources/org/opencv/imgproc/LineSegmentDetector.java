package org.opencv.imgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Size;

public class LineSegmentDetector extends Algorithm {
    protected LineSegmentDetector(long j) {
        super(j);
    }

    private static native int compareSegments_0(long j, double d, double d2, long j2, long j3, long j4);

    private static native int compareSegments_1(long j, double d, double d2, long j2, long j3);

    private static native void delete(long j);

    private static native void detect_0(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void detect_1(long j, long j2, long j3);

    private static native void drawSegments_0(long j, long j2, long j3);

    public int compareSegments(Size size, Mat mat, Mat mat2) {
        return compareSegments_1(this.nativeObj, size.width, size.height, mat.nativeObj, mat2.nativeObj);
    }

    public int compareSegments(Size size, Mat mat, Mat mat2, Mat mat3) {
        Size size2 = size;
        return compareSegments_0(this.nativeObj, size2.width, size2.height, mat.nativeObj, mat2.nativeObj, mat3.nativeObj);
    }

    public void detect(Mat mat, Mat mat2) {
        detect_1(this.nativeObj, mat.nativeObj, mat2.nativeObj);
    }

    public void detect(Mat mat, Mat mat2, Mat mat3, Mat mat4, Mat mat5) {
        detect_0(this.nativeObj, mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj, mat5.nativeObj);
    }

    public void drawSegments(Mat mat, Mat mat2) {
        drawSegments_0(this.nativeObj, mat.nativeObj, mat2.nativeObj);
    }

    public void finalize() {
        delete(this.nativeObj);
    }
}
