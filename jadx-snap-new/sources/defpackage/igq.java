package defpackage;

import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: igq */
public final class igq {
    public static final Predicate<Throwable> a = a.a;
    public static final Predicate<Throwable> b = b.a;

    /* renamed from: igq$d */
    static final class d extends akcs implements akbl<Throwable, Boolean> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "throwable");
            return Boolean.valueOf(!(th instanceof akwn));
        }
    }

    /* renamed from: igq$a */
    static final class a<T> implements Predicate<Throwable> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            Throwable th = (Throwable) obj;
            return th instanceof IOException ? true : (th instanceof akwn) && ((akwn) th).a() == 0;
        }
    }

    /* renamed from: igq$b */
    static final class b<T> implements Predicate<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof IOException) {
                return true;
            }
            if (!(th instanceof akwn)) {
                return false;
            }
            akwn akwn = (akwn) th;
            return akwn.a() == 0 || akwn.a() > 499;
        }
    }

    /* renamed from: igq$c */
    static final class c<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ Predicate a;
        private /* synthetic */ defpackage.akdd.c b;
        private /* synthetic */ int c;
        private /* synthetic */ akbl d;
        private /* synthetic */ int e;
        private /* synthetic */ Random f;
        private /* synthetic */ int g;
        private /* synthetic */ int h;
        private /* synthetic */ int i;
        private /* synthetic */ ajdw j;

        c(Predicate predicate, defpackage.akdd.c cVar, int i, akbl akbl, int i2, Random random, int i3, int i4, int i5, ajdw ajdw) {
            this.a = predicate;
            this.b = cVar;
            this.c = i;
            this.d = akbl;
            this.e = i2;
            this.f = random;
            this.g = i3;
            this.h = i4;
            this.i = i5;
            this.j = ajdw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            Predicate predicate = this.a;
            if (predicate == null || !predicate.apply(th) || this.b.a >= this.c) {
                return ajde.b(th);
            }
            long nextInt = ((long) (((Boolean) this.d.invoke(th)).booleanValue() ? this.e : this.f.nextInt(this.g) + this.h)) + ((long) Math.pow(2.0d, (double) Math.min(this.b.a, this.i)));
            defpackage.akdd.c cVar = this.b;
            cVar.a++;
            return ajde.a(nextInt, TimeUnit.SECONDS, this.j);
        }
    }

    public static final <T> ajdx<T> a(ajdx<T> ajdx, igo igo) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(igo, "retryConfig");
        Object a = ajdx.a((ajec) new igp(igo.b, 7, igo.c, igo.d, igo.e, igo.a, d.a));
        akcr.a(a, "this.compose(RandomJitte…Exception\n            }))");
        return a;
    }
}
