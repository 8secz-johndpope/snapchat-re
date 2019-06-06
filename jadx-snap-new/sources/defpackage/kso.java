package defpackage;

import com.google.common.base.Supplier;
import com.snap.core.db.record.StorySnapModel;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: kso */
public final class kso implements kss {
    final Supplier<iha> a;
    final ajws<kqr> b;
    private final zfw c;
    private final ajei d;

    /* renamed from: kso$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ kso a;
        private /* synthetic */ kqi b;

        a(kso kso, kqi kqi) {
            this.a = kso;
            this.b = kqi;
        }

        public final /* synthetic */ Object call() {
            kso kso = this.a;
            kqi kqi = this.b;
            akcr.b(kqi, "sessionData");
            iha iha = (iha) kso.a.get();
            Map[] mapArr = new Map[1];
            aapm aapm = new aapm();
            aapm.a(kqi.b.a.a);
            aapm.a(kqi.f);
            aapm.a(kqi.g);
            aapm.b(kqi.j);
            aapm.a(Long.valueOf(kqi.c));
            aapm.b(Long.valueOf(kqi.d));
            aapm.c(Long.valueOf(kqi.l));
            aapm.d(Long.valueOf(kqi.m));
            mapArr[0] = aapm.a();
            Object a = iha.a(ajym.d(mapArr), ksp.a);
            String str = StorySnapModel.LENSMETADATA;
            akcr.a(a, str);
            akcr.b(a, str);
            String str2 = kqi.a;
            String str3 = kqi.j;
            Long valueOf = Long.valueOf(kqi.c);
            Long valueOf2 = Long.valueOf(kqi.d);
            Long valueOf3 = Long.valueOf(kqi.l);
            Long valueOf4 = Long.valueOf(kqi.m);
            aapp aapp = kqi.g;
            return new kqr(str2, str3, valueOf, valueOf2, valueOf3, valueOf4, a, aapp != null ? aapp.name() : null, kqi.k.a(), Long.valueOf(kqi.e), kqi.h, kqi.b.a());
        }
    }

    /* renamed from: kso$b */
    static final class b extends akcs implements akbl<kqr, ajxw> {
        private /* synthetic */ kso a;

        b(kso kso) {
            this.a = kso;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.b.a((Object) (kqr) obj);
            return ajxw.a;
        }
    }

    /* renamed from: kso$c */
    static final class c extends akcs implements akbl<Throwable, ajxw> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    public kso(Supplier<iha> supplier, zfw zfw, ajei ajei, ajws<kqr> ajws) {
        akcr.b(supplier, "serializationHelper");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(ajws, "lensAnalyticsInfoSubject");
        this.a = supplier;
        this.c = zfw;
        this.d = ajei;
        this.b = ajws;
    }

    public final void a(kqi kqi) {
        akcr.b(kqi, "sessionData");
        Object b = ajdx.c((Callable) new a(this, kqi)).a((ajdw) this.c.h()).b((ajdw) this.c.h());
        akcr.a(b, "Single.fromCallable {\n  …dulers.userInteractive())");
        kry.a(b, new b(this), c.a, this.d);
    }
}
