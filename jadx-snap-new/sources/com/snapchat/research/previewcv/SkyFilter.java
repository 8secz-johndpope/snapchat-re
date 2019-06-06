package com.snapchat.research.previewcv;

import org.opencv.core.Mat;

public class SkyFilter extends ContextFilter {
    private transient long b;

    public static final class a {
        public static final a a = new a("DAYTIME");
        public static final a b = new a("SUNSET");
        public static final a c = new a("EVENING");
        private static a e = new a("SKY_REPLACE");
        private static a f = new a("SKY_OVERLAY");
        private static int g = 0;
        final int d;
        private final String h;

        static {
            a[] aVarArr = new a[]{a, b, c, e, f};
        }

        private a(String str) {
            this.h = str;
            int i = g;
            g = i + 1;
            this.d = i;
        }

        public final String toString() {
            return this.h;
        }
    }

    private SkyFilter(long j) {
        super(PreviewCVInterfaceJNI.SkyFilter_SWIGUpcast(j));
        this.b = j;
    }

    public SkyFilter(String str, com.snapchat.research.previewcv.SnapFillBase.a aVar) {
        this(PreviewCVInterfaceJNI.new_SkyFilter__SWIG_2(str, aVar.b));
    }

    public final Mat a(Mat mat, Mat mat2, Mat mat3, String[] strArr) {
        return new Mat(PreviewCVInterfaceJNI.SkyFilter_run__SWIG_0(this.b, this, mat.getNativeObjAddr(), mat2.getNativeObjAddr(), mat3.getNativeObjAddr(), strArr));
    }

    public final synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                this.a = false;
                PreviewCVInterfaceJNI.delete_SkyFilter(this.b);
            }
            this.b = 0;
        }
        super.a();
    }

    public final void a(a aVar) {
        PreviewCVInterfaceJNI.SkyFilter_setColorMode(this.b, this, aVar.d);
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
