package com.snapchat.research.libdnn;

public class IntVector {
    private transient long a;
    private transient boolean b;

    public IntVector() {
        this(libdnnJNI.new_IntVector__SWIG_0());
    }

    private IntVector(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                libdnnJNI.delete_IntVector(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
