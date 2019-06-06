package defpackage;

import org.greenrobot.eventbus.ThreadMode;

/* renamed from: fls */
public final class fls {
    private final flk a;

    public fls(zkf zkf) {
        this.a = new flk(zkf);
    }

    public final flk a() {
        return this.a;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void loadProductImages(fqw fqw) {
        this.a.a(fqw.a, fqw.b);
    }
}
