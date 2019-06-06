package com.snapchat.research.previewcv;

public class SnapFill extends SnapFillBase {
    private transient long b;

    public SnapFill() {
        this(PreviewCVInterfaceJNI.new_SnapFill__SWIG_2());
    }

    private SnapFill(long j) {
        super(PreviewCVInterfaceJNI.SnapFill_SWIGUpcast(j), true);
        this.b = j;
    }

    public final synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                this.a = false;
                PreviewCVInterfaceJNI.delete_SnapFill(this.b);
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
