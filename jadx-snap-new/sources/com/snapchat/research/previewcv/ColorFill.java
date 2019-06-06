package com.snapchat.research.previewcv;

public class ColorFill extends SnapFillBase {
    private transient long b;

    public ColorFill() {
        this(PreviewCVInterfaceJNI.new_ColorFill__SWIG_2());
    }

    private ColorFill(long j) {
        super(PreviewCVInterfaceJNI.ColorFill_SWIGUpcast(j), true);
        this.b = j;
    }

    public final synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                this.a = false;
                PreviewCVInterfaceJNI.delete_ColorFill(this.b);
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
