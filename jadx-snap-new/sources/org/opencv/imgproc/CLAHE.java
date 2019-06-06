package org.opencv.imgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Size;

public class CLAHE extends Algorithm {
    protected CLAHE(long j) {
        super(j);
    }

    private static native void apply_0(long j, long j2, long j3);

    private static native void collectGarbage_0(long j);

    private static native void delete(long j);

    private static native double getClipLimit_0(long j);

    private static native double[] getTilesGridSize_0(long j);

    private static native void setClipLimit_0(long j, double d);

    private static native void setTilesGridSize_0(long j, double d, double d2);

    public void apply(Mat mat, Mat mat2) {
        apply_0(this.nativeObj, mat.nativeObj, mat2.nativeObj);
    }

    public void collectGarbage() {
        collectGarbage_0(this.nativeObj);
    }

    public void finalize() {
        delete(this.nativeObj);
    }

    public double getClipLimit() {
        return getClipLimit_0(this.nativeObj);
    }

    public Size getTilesGridSize() {
        return new Size(getTilesGridSize_0(this.nativeObj));
    }

    public void setClipLimit(double d) {
        setClipLimit_0(this.nativeObj, d);
    }

    public void setTilesGridSize(Size size) {
        setTilesGridSize_0(this.nativeObj, size.width, size.height);
    }
}
