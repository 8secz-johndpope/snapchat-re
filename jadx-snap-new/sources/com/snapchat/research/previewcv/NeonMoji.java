package com.snapchat.research.previewcv;

public class NeonMoji {
    private transient long a;
    private transient boolean b;

    public NeonMoji() {
        this(PreviewCVInterfaceJNI.new_NeonMoji());
    }

    private NeonMoji(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                PreviewCVInterfaceJNI.delete_NeonMoji(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
