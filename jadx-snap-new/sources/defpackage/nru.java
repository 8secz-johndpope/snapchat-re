package defpackage;

import org.greenrobot.eventbus.ThreadMode;

/* renamed from: nru */
public final class nru {
    final nme a;

    /* renamed from: nru$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            nru.this.a.r().f.c.a();
        }
    }

    public nru(nme nme) {
        this.a = nme;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void handleEvent(ngg ngg) {
        this.a.r().r.a(new 1(), 300);
    }
}
