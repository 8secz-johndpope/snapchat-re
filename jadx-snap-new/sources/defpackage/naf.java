package defpackage;

import com.brightcove.player.media.CuePointFields;
import defpackage.miw.b.a;
import defpackage.miw.c;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: naf */
public final class naf implements naj {
    final mhk a;
    final miw b;
    final TimeUnit c;
    private final ajex<Long, Long, Boolean> d;

    /* renamed from: naf$a */
    static final class a<T1, T2, R> implements ajex<Long, Long, Boolean> {
        private /* synthetic */ naf a;

        a(naf naf) {
            this.a = naf;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return Boolean.valueOf(this.a.a.a(TimeUnit.MILLISECONDS) - ((Number) obj).longValue() < ((Number) obj2).longValue());
        }
    }

    /* renamed from: naf$e */
    static final class e<V> implements Callable<ajdb> {
        private /* synthetic */ naf a;

        e(naf naf) {
            this.a = naf;
        }

        public final /* synthetic */ Object call() {
            return this.a.b.a().a((mje) mja.LENSES_ACTIVE_USER_LAST_ACTIVATION, this.a.a.a(TimeUnit.MILLISECONDS)).a();
        }
    }

    /* renamed from: naf$b */
    static final class b<T> implements ajfl<Long> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, CuePointFields.TIME);
            return l.longValue() > 0;
        }
    }

    /* renamed from: naf$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ naf a;

        c(naf naf) {
            this.a = naf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "expirationTimeMinutes");
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(l.longValue(), this.a.c));
        }
    }

    /* renamed from: naf$d */
    static final class d<T> implements ajfl<Long> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "timestamp");
            return l.longValue() > 0;
        }
    }

    public /* synthetic */ naf(mhk mhk, miw miw) {
        this(mhk, miw, TimeUnit.MINUTES);
    }

    private naf(mhk mhk, miw miw, TimeUnit timeUnit) {
        akcr.b(mhk, "clock");
        akcr.b(miw, "configurationRepository");
        akcr.b(timeUnit, "lensesExpirationTimeUnit");
        this.a = mhk;
        this.b = miw;
        this.c = timeUnit;
        this.d = new a(this);
    }

    public final ajdx<Boolean> a() {
        c a = this.b.a(a.a);
        Object c = ajdp.a((ajdt) a.e(mja.LENSES_ACTIVE_USER_EXPIRATION_TIME_IN_MINUTES).c(1).a((ajfl) b.a).p(new c(this)), (ajdt) a.e(mja.LENSES_ACTIVE_USER_LAST_ACTIVATION).c(1).a((ajfl) d.a), this.d).c(Boolean.FALSE);
        akcr.a(c, "Observable.combineLatest…   .defaultIfEmpty(false)");
        c = c.e();
        akcr.a(c, "Observable.combineLatest…          .firstOrError()");
        return c;
    }

    public final ajcx b() {
        Object a = ajcx.a((Callable) new e(this));
        akcr.a(a, "Completable.defer {\n    …           .apply()\n    }");
        return a;
    }
}
