package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hmm */
public final class hmm {
    final ConcurrentHashMap<hbj, Integer> a = new ConcurrentHashMap();
    final ConcurrentHashMap<hbj, Float> b = new ConcurrentHashMap();
    volatile int c = 4;
    public volatile int d;
    public volatile boolean e;
    public volatile boolean f;
    private final zfw g;

    /* renamed from: hmm$a */
    static final class a extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ hmm a;

        a(hmm hmm) {
            this.a = hmm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Integer) obj;
            Map map = this.a.a;
            hbj hbj = hbj.FRIEND_STORY_CARD;
            akcr.a(obj, "it");
            map.put(hbj, obj);
            return ajxw.a;
        }
    }

    /* renamed from: hmm$d */
    static final class d extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ hmm a;

        d(hmm hmm) {
            this.a = hmm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Integer) obj;
            hmm hmm = this.a;
            akcr.a(obj, "it");
            hmm.d = obj.intValue();
            return ajxw.a;
        }
    }

    /* renamed from: hmm$f */
    static final class f extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ hmm a;

        f(hmm hmm) {
            this.a = hmm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Integer) obj;
            hmm hmm = this.a;
            akcr.a(obj, "it");
            hmm.c = obj.intValue();
            return ajxw.a;
        }
    }

    /* renamed from: hmm$c */
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

    /* renamed from: hmm$e */
    static final class e extends akcs implements akbl<Throwable, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: hmm$g */
    static final class g extends akcs implements akbl<Throwable, ajxw> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: hmm$i */
    static final class i extends akcs implements akbl<Throwable, ajxw> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: hmm$b */
    static final class b extends akcs implements akbl<Throwable, ajxw> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: hmm$h */
    static final class h extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ hmm a;

        h(hmm hmm) {
            this.a = hmm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Boolean) obj;
            hmm hmm = this.a;
            akcr.a(obj, "it");
            hmm.e = obj.booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: hmm$j */
    static final class j extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ hmm a;

        j(hmm hmm) {
            this.a = hmm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Boolean) obj;
            hmm hmm = this.a;
            akcr.a(obj, "it");
            hmm.f = obj.booleanValue();
            return ajxw.a;
        }
    }

    public hmm(ftl ftl, gpu gpu, zfw zfw) {
        akcr.b(ftl, "configurationProvider");
        akcr.b(gpu, "userSession");
        akcr.b(zfw, "schedulers");
        this.g = zfw;
        for (hbj hbj : hbj.values()) {
            Map map;
            float f;
            switch (hmn.a[hbj.ordinal()]) {
                case 1:
                    this.a.put(hbj, Integer.valueOf(2));
                    map = this.b;
                    f = 1.0f;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    this.a.put(hbj, Integer.valueOf(1));
                    map = this.b;
                    f = 0.8f;
                    break;
                case 8:
                case 9:
                case 10:
                    this.a.put(hbj, Integer.valueOf(0));
                    map = this.b;
                    f = MapboxConstants.MINIMUM_ZOOM;
                    break;
                default:
                    break;
            }
            map.put(hbj, Float.valueOf(f));
        }
        ajdp b = ftl.s(gvt.FRIEND_STORY_SNAP_PREFETCH_COUNT).b((ajdw) this.g.b());
        String str = "configurationProvider\n  …schedulers.computation())";
        akcr.a((Object) b, str);
        gpv.a(b, (akbl) new a(this), (akbl) c.a, gpu);
        b = ftl.s(gvt.OVERFLOW_FRIEND_STORY_PREFETCH_COUNT).b((ajdw) this.g.b());
        akcr.a((Object) b, str);
        gpv.a(b, (akbl) new d(this), (akbl) e.a, gpu);
        b = ftl.s(gvt.MAX_PARALLEL_DOWNLOAD_COUNT).b((ajdw) this.g.b());
        akcr.a((Object) b, str);
        gpv.a(b, (akbl) new f(this), (akbl) g.a, gpu);
        b = ftl.p(gvt.SHARED_STORY_PREFETCHING_LOGIC_ENABLED).b((ajdw) this.g.b());
        akcr.a((Object) b, str);
        gpv.a(b, (akbl) new h(this), (akbl) i.a, gpu);
        ajdp b2 = ftl.p(gvt.FF_STORY_IMPRESSION_PREFETCHING_ENABLED).b((ajdw) this.g.b());
        akcr.a((Object) b2, str);
        gpv.a(b2, (akbl) new j(this), (akbl) b.a, gpu);
    }
}
