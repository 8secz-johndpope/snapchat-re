package com.snapchat.research.previewcv;

public class CloudMoji {
    private transient long a;
    private transient boolean b;

    public CloudMoji() {
        this(PreviewCVInterfaceJNI.new_CloudMoji());
    }

    private CloudMoji(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                PreviewCVInterfaceJNI.delete_CloudMoji(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
