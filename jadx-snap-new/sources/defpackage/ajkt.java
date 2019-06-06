package defpackage;

import defpackage.ajkq.b;
import defpackage.ajkq.c;

/* renamed from: ajkt */
public final class ajkt<T> extends ajim<T, T> {
    private ajfc<? super ajde<Throwable>, ? extends akuw<?>> c;

    /* renamed from: ajkt$a */
    static final class a<T> extends c<T, Throwable> {
        a(akux<? super T> akux, ajvq<Throwable> ajvq, akuy akuy) {
            super(akux, ajvq, akuy);
        }

        public final void a() {
            this.b.b();
            this.a.a();
        }

        public final void a(Throwable th) {
            b(th);
        }
    }

    public ajkt(ajde<T> ajde, ajfc<? super ajde<Throwable>, ? extends akuw<?>> ajfc) {
        super(ajde);
        this.c = ajfc;
    }

    public final void a_(akux<? super T> akux) {
        ajwx ajwx = new ajwx(akux);
        ajvq k = ajvu.m().k();
        try {
            akuw akuw = (akuw) ajfv.a(this.c.apply(k), "handler returned a null Publisher");
            b bVar = new b(this.b);
            akuy aVar = new a(ajwx, k, bVar);
            bVar.a = aVar;
            akux.a(aVar);
            akuw.a(bVar);
            bVar.a(Integer.valueOf(0));
        } catch (Throwable th) {
            ajep.a(th);
            ajuf.a(th, akux);
        }
    }
}
