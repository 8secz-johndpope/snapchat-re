package defpackage;

import android.content.Context;
import defpackage.aesm.a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: adqq */
public final class adqq implements adpx, qqd {
    public final Set<adpx> a = new CopyOnWriteArraySet();
    public final adpz b;

    public adqq(ajwy<Context> ajwy, ajwy<gpb> ajwy2, ajwy<iha> ajwy3, ajwy<adqp> ajwy4, ajwy<adqi> ajwy5, ajwy<ifa> ajwy6, ajwy<ilv> ajwy7) {
        this.b = new adqh(ajwy, ajwy2, ajwy3, ajwy4, ajwy5, ajwy6, ajwy7);
        this.b.a((qqd) this);
        this.b.a((adpx) this);
    }

    public final void a() {
        this.b.b();
    }

    public final void a(aesm aesm) {
        a.a(aesm.o);
        for (adpx a : this.a) {
            a.a(aesm);
        }
    }

    public final void a(qqc qqc) {
    }
}
