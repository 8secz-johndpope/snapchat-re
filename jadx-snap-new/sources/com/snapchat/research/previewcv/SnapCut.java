package com.snapchat.research.previewcv;

import org.opencv.core.Mat;

public class SnapCut {
    protected transient boolean a;
    private transient long b;

    public static final class a {
        public static final a a = new a("HIGH_END_DEVICE");
        private static a c = new a("MEDIUM_END_DEVICE");
        private static a d = new a("LOW_END_DEVICE");
        private static int e = 0;
        final int b;
        private final String f;

        static {
            a[] aVarArr = new a[]{a, c, d};
        }

        private a(String str) {
            this.f = str;
            int i = e;
            e = i + 1;
            this.b = i;
        }

        public final String toString() {
            return this.f;
        }
    }

    public SnapCut() {
        this(PreviewCVInterfaceJNI.new_SnapCut__SWIG_2());
    }

    protected SnapCut(long j) {
        this.a = true;
        this.b = j;
    }

    public final Mat a(Mat mat, Mat mat2, Mat mat3) {
        return new Mat(PreviewCVInterfaceJNI.SnapCut_extractCut(this.b, this, mat.getNativeObjAddr(), mat2.getNativeObjAddr(), mat3.getNativeObjAddr()));
    }

    public synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                this.a = false;
                PreviewCVInterfaceJNI.delete_SnapCut(this.b);
            }
            this.b = 0;
        }
    }

    public final int b() {
        return PreviewCVInterfaceJNI.SnapCut_getOffsetX(this.b, this);
    }

    public final int c() {
        return PreviewCVInterfaceJNI.SnapCut_getOffsetY(this.b, this);
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
