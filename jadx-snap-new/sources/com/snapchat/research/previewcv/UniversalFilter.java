package com.snapchat.research.previewcv;

public class UniversalFilter extends SnapFillBase {
    private transient long b;

    public UniversalFilter() {
        this(PreviewCVInterfaceJNI.new_UniversalFilter__SWIG_1());
    }

    private UniversalFilter(long j) {
        super(PreviewCVInterfaceJNI.UniversalFilter_SWIGUpcast(j), true);
        this.b = j;
    }

    public final synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                this.a = false;
                PreviewCVInterfaceJNI.delete_UniversalFilter(this.b);
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
