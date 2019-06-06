package com.snapchat.research.previewcv;

import org.opencv.core.Mat;

public class ContextFilter extends SnapFillBase {
    private transient long b;

    protected ContextFilter(long j) {
        super(PreviewCVInterfaceJNI.ContextFilter_SWIGUpcast(j), true);
        this.b = j;
    }

    public Mat a(Mat mat, Mat mat2, Mat mat3, String[] strArr) {
        return new Mat(PreviewCVInterfaceJNI.ContextFilter_run(this.b, this, mat.getNativeObjAddr(), mat2.getNativeObjAddr(), mat3.getNativeObjAddr(), strArr));
    }

    public final Mat a(Mat mat, Mat mat2, String[] strArr) {
        return new Mat(PreviewCVInterfaceJNI.ContextFilter_preprocessAsset__SWIG_0(this.b, this, mat.getNativeObjAddr(), mat2.getNativeObjAddr(), strArr, false));
    }

    public synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                this.a = false;
                PreviewCVInterfaceJNI.delete_ContextFilter(this.b);
            }
            this.b = 0;
        }
        super.a();
    }

    public final boolean a(Mat mat, String[] strArr, Mat mat2) {
        return PreviewCVInterfaceJNI.ContextFilter_shouldEnableContextFilter(this.b, this, mat.getNativeObjAddr(), strArr, mat2.getNativeObjAddr());
    }

    public final Mat b(Mat mat, String[] strArr, Mat mat2) {
        return new Mat(PreviewCVInterfaceJNI.ContextFilter_getMask__SWIG_0(this.b, this, mat.getNativeObjAddr(), strArr, mat2.getNativeObjAddr()));
    }

    public final void b() {
        PreviewCVInterfaceJNI.ContextFilter_setSoftmaxThresh(this.b, this, 0.375f);
    }

    public final void c() {
        PreviewCVInterfaceJNI.ContextFilter_setDetectionThresh(this.b, this, 0.1f);
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
