package com.snapchat.research.libdnn;

public class VectorOfIntVector {
    private transient long a;
    private transient boolean b;

    public VectorOfIntVector() {
        this(libdnnJNI.new_VectorOfIntVector__SWIG_0());
    }

    private VectorOfIntVector(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                libdnnJNI.delete_VectorOfIntVector(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
