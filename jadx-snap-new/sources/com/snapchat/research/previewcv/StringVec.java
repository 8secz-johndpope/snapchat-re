package com.snapchat.research.previewcv;

public class StringVec {
    private transient long a;
    private transient boolean b;

    public StringVec() {
        this(PreviewCVInterfaceJNI.new_StringVec__SWIG_0());
    }

    private StringVec(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                PreviewCVInterfaceJNI.delete_StringVec(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
