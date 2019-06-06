package defpackage;

import com.google.common.base.Predicate;
import defpackage.akdd.c;
import java.util.Random;

/* renamed from: igp */
public final class igp<T> implements ajec<T, T> {
    final Random a;
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    final ajdw g;
    final Predicate<Throwable> h;
    final akbl<Throwable, Boolean> i;

    /* renamed from: igp$a */
    static final class a<T, R> implements ajfc<ajde<Throwable>, akuw<?>> {
        private /* synthetic */ igp a;

        a(igp igp) {
            this.a = igp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajde ajde = (ajde) obj;
            akcr.b(ajde, "it");
            Random random = this.a.a;
            int i = this.a.b;
            int i2 = this.a.c;
            int i3 = this.a.d;
            int i4 = this.a.e;
            int i5 = this.a.f;
            ajdw ajdw = this.a.g;
            Predicate predicate = this.a.h;
            akbl akbl = this.a.i;
            c cVar = new c();
            cVar.a = 0;
            obj = ajde.c((ajfc) new igq.c(predicate, cVar, i2, akbl, i5, random, i, i4, i3, ajdw));
            akcr.a(obj, "flowable.flatMap {\n     …error(it)\n        }\n    }");
            return (akuw) obj;
        }
    }

    public igp(int i, int i2, int i3, int i4, ajdw ajdw, Predicate<Throwable> predicate, akbl<? super Throwable, Boolean> akbl) {
        akcr.b(ajdw, "scheduler");
        akcr.b(akbl, "errorUseMaxBackoffJitter");
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = ajdw;
        this.h = predicate;
        this.i = akbl;
        this.a = new Random();
        this.b = (this.f - this.e) + 1;
    }

    public /* synthetic */ igp(int i, int i2, int i3, int i4, Predicate predicate, akbl akbl) {
        Object obj = ajwh.b;
        akcr.a(obj, "Schedulers.computation()");
        this(i, i2, i3, i4, obj, predicate, akbl);
    }

    public final ajeb<T> apply(ajdx<T> ajdx) {
        akcr.b(ajdx, "upstream");
        if (this.c <= 0) {
            return ajdx;
        }
        Object j = ajdx.j(new a(this));
        akcr.a(j, "upstream.retryWhen {\n   …koffJitter)\n            }");
        return (ajeb) j;
    }
}
