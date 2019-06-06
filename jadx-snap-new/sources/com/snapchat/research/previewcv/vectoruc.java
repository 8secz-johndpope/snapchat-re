package com.snapchat.research.previewcv;

public class vectoruc {
    private transient long a;
    private transient boolean b;

    public vectoruc() {
        this(PreviewCVInterfaceJNI.new_vectoruc__SWIG_0());
    }

    private vectoruc(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                PreviewCVInterfaceJNI.delete_vectoruc(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
