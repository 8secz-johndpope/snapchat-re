package defpackage;

import com.looksery.sdk.LSCoreManagerWrapper;

/* renamed from: mpn */
public final class mpn {
    final long a;
    final LSCoreManagerWrapper b;

    public mpn(LSCoreManagerWrapper lSCoreManagerWrapper) {
        akcr.b(lSCoreManagerWrapper, "value");
        this.b = lSCoreManagerWrapper;
        Object currentThread = Thread.currentThread();
        akcr.a(currentThread, "currentThread()");
        this.a = currentThread.getId();
    }

    public final boolean a() {
        long j = this.a;
        Object currentThread = Thread.currentThread();
        akcr.a(currentThread, "currentThread()");
        return j == currentThread.getId();
    }
}
