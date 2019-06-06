package com.snapchat.research.libdnn;

public class LibdnnInterface {
    private transient long a;
    private transient boolean b;

    public LibdnnInterface() {
        this(libdnnJNI.new_LibdnnInterface());
    }

    private LibdnnInterface(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                libdnnJNI.delete_LibdnnInterface(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
