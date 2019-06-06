package com.snapchat.research.libdnn;

public class StringVector {
    private transient long a;
    private transient boolean b;

    public StringVector() {
        this(libdnnJNI.new_StringVector__SWIG_0());
    }

    private StringVector(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                libdnnJNI.delete_StringVector(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
