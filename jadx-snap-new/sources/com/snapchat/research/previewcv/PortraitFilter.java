package com.snapchat.research.previewcv;

import org.opencv.core.Mat;

public class PortraitFilter extends ContextFilter {
    private transient long b;

    public PortraitFilter() {
        this(PreviewCVInterfaceJNI.new_PortraitFilter__SWIG_4());
    }

    private PortraitFilter(long j) {
        super(PreviewCVInterfaceJNI.PortraitFilter_SWIGUpcast(j));
        this.b = j;
    }

    public final Mat a(Mat mat, Mat mat2, Mat mat3, String[] strArr) {
        return new Mat(PreviewCVInterfaceJNI.PortraitFilter_run__SWIG_1(this.b, this, mat.getNativeObjAddr(), mat2.getNativeObjAddr(), mat3.getNativeObjAddr(), strArr));
    }

    public final synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                this.a = false;
                PreviewCVInterfaceJNI.delete_PortraitFilter(this.b);
            }
            this.b = 0;
        }
        super.a();
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
