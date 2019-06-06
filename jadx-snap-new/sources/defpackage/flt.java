package defpackage;

import android.text.TextUtils;

/* renamed from: flt */
public final class flt {
    private final flv a;
    private final tkb b;

    public flt() {
        this(new flv(), new tkb());
    }

    private flt(flv flv, tkb tkb) {
        this.a = flv;
        this.b = tkb;
    }

    public static aghe a(fiz fiz) {
        aghe aghe = new aghe();
        aghe.b = fiz.d;
        aghe.c = fiz.e;
        aghe.h = fiz.j;
        if (fiz.b != null) {
            aghe.f = flv.a(fiz.b);
        }
        aghe.a = fiz.a;
        if (fiz.i != null) {
            aghe.j = tkb.a(fiz.i);
        }
        if (!TextUtils.isEmpty(fiz.m)) {
            aghe.l = fiz.m;
        }
        aghe.n = fiz.n;
        return aghe;
    }
}
