package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: ackp */
public final class ackp implements Runnable {
    private final WeakReference<adbv> a;

    public ackp(WeakReference<adbv> weakReference) {
        this.a = weakReference;
    }

    public final void run() {
        adbv adbv = (adbv) this.a.get();
        if (adbv != null) {
            acmj j = adbv.j();
            aclm aclm = (j == null || j.f()) ? aclm.DONE : aclm.ERROR;
            adbv.a(aclm);
        }
    }
}
