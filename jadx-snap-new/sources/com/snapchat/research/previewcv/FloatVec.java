package com.snapchat.research.previewcv;

public class FloatVec {
    private transient long a;
    private transient boolean b;

    public FloatVec() {
        this(PreviewCVInterfaceJNI.new_FloatVec__SWIG_0());
    }

    private FloatVec(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                PreviewCVInterfaceJNI.delete_FloatVec(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
