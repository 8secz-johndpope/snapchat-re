package defpackage;

import com.snap.core.db.column.FeatureType;
import defpackage.hgg.a;
import defpackage.hgg.b;
import defpackage.hgg.g;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hks */
public final class hks implements hko {
    final hgg a;
    private final ajwy<gwd> b;
    private final yui c;
    private final zfw d;

    /* renamed from: hks$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hks$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return Long.valueOf(((gwu) ajyu.f(list)).b);
        }
    }

    /* renamed from: hks$d */
    static final class d<T> implements ajfb<Long> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hks$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ vii a;
        private /* synthetic */ hjx b;

        e(vii vii, hjx hjx) {
            this.a = vii;
            this.b = hjx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return new hkt(l.longValue(), this.a, this.b);
        }
    }

    /* renamed from: hks$c */
    static final class c extends akcs implements akbl<Long, ajcx> {
        private /* synthetic */ hks a;
        private /* synthetic */ vii b;

        c(hks hks, vii vii) {
            this.a = hks;
            this.b = vii;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Long) obj;
            hgg hgg = this.a.a;
            akcr.a(obj, "it");
            long longValue = obj.longValue();
            vii vii = this.b;
            akcr.b(vii, "storyCard");
            long a = hgg.a + ((ihh) hgg.c.get()).a();
            obj = ajdx.c((Callable) new a(hgg)).b((ajdw) hgg.a().f()).f(new b(String.valueOf(longValue), vii, a));
            akcr.a(obj, "Single.fromCallable { fi…      }\n                }");
            obj = obj.c((ajfb) new g(hgg, longValue, vii, a)).e();
            akcr.a(obj, "cacheToDisk(storyRowId.t…        }.ignoreElement()");
            return obj;
        }
    }

    static {
        a aVar = new a();
    }

    public hks(ajwy<gwd> ajwy, hgg hgg, yui yui, zfw zfw) {
        akcr.b(ajwy, "publisherStorySnapMediaRepository");
        akcr.b(hgg, "deepLinkStoryRepo");
        akcr.b(yui, "optInNotifConfiguration");
        akcr.b(zfw, "schedulers");
        this.b = ajwy;
        this.a = hgg;
        this.c = yui;
        this.d = zfw;
    }

    public final ajdj<hkx> a(vii vii, hjx hjx) {
        akcr.b(vii, "storyCard");
        akcr.b(hjx, "clientDataModel");
        Object c = vii.c();
        akcr.a(c, "storyCard.storyId");
        Object h = vii.h();
        akcr.a(h, "storyCard.publisherStoryCard");
        ajdx f = ((gwd) this.b.get()).a(ajzl.a(ajxs.a(vii.c(), gwr.a.a(c, h))), FeatureType.DISCOVER_FEED).f(b.a);
        akcr.a((Object) f, "publisherStorySnapMediaR…{ it.first().storyRowId }");
        Object h2 = igs.a(f, (akbl) new c(this, vii)).c((ajfb) d.a).f(new e(vii, hjx)).a((ajdw) this.d.b()).h();
        akcr.a(h2, "publisherStorySnapMediaR…               .toMaybe()");
        return h2;
    }

    public final boolean a(vii vii) {
        akcr.b(vii, "storyCard");
        return vii.g() && this.c.a;
    }
}
