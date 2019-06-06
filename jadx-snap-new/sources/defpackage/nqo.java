package defpackage;

import org.greenrobot.eventbus.ThreadMode;

/* renamed from: nqo */
public final class nqo {
    private final nsp a;
    private final nme b;

    public nqo(nme nme, nsp nsp) {
        this.b = nme;
        this.a = nsp;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void handleEvent(acou acou) {
        this.b.s().a(acou.a, acou.b, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void handleEvent(ntt ntt) {
        this.a.a(ntt.a, ntt.b, ntt.c, true);
    }
}
