package defpackage;

import java.io.Closeable;

/* renamed from: drc */
public final class drc<T, A> implements czq<A> {
    private final ajdp<T> a;
    private final ajfc<T, czq<A>> b;

    public drc(ajdp<T> ajdp, ajfc<T, czq<A>> ajfc) {
        this.a = ajdp;
        this.b = ajfc;
    }

    private /* synthetic */ ajdb a(czo czo, Object obj) {
        return ajcx.a(new -$$Lambda$drc$N-mAys1vT89d69e4ed_VKJ-_knE(this, obj, czo));
    }

    private /* synthetic */ void a(Object obj, czo czo, ajcy ajcy) {
        if (!ajcy.isDisposed()) {
            Closeable a = ((czq) this.b.apply(obj)).a(czo);
            a.getClass();
            ajcy.a(ajek.a(new -$$Lambda$xm5th_Pz9Sgvtm0laEPz0sIwI3A(a)));
        }
    }

    public final Closeable a(czo<A> czo) {
        ajej e = this.a.v(new -$$Lambda$drc$It_wFuOxORfbqtAtwUF2x1z6uuU(this, czo)).e();
        e.getClass();
        return new -$$Lambda$PW0d8wJt_jANpghhi4nShp5HuF4(e);
    }
}
