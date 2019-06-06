package defpackage;

import defpackage.tnj.a;
import java.util.concurrent.Callable;

/* renamed from: oyi */
public final class oyi implements ygo<ygk> {
    final ajwy<ilv> a;
    final ajwy<ygi> b;
    final ajwy<tnj> c;
    final ajwy<gqr> d;
    final ajwy<ftl> e;
    private final ajxe f;
    private final ajxe g;

    /* renamed from: oyi$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: oyi$d */
    static final class d extends akcs implements akbk<idd> {
        private /* synthetic */ oiy a;

        d(oiy oiy) {
            this.a = oiy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.callsite("MemoriesFileManagerListener");
        }
    }

    /* renamed from: oyi$h */
    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ oyi a;
        private /* synthetic */ zgb b;

        h(oyi oyi, zgb zgb) {
            this.a = oyi;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(((idd) this.a.f.b()));
        }
    }

    /* renamed from: oyi$b */
    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: oyi$c */
    static final class c<T> implements ajfl<Boolean> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: oyi$e */
    static final class e<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ oyi a;
        private /* synthetic */ String b;

        e(oyi oyi, String str) {
            this.a = oyi;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            oyi oyi = this.a;
            String str = this.b;
            obj = ((ftl) oyi.e.get()).b((fth) ojo.HAS_REMOVED_FILE_MANAGER_UNLOCKED_FILES).c((ajfb) new i(str)).a((ajfl) j.a).f(k.a).b((ajdn) ((ftl) oyi.e.get()).b((fth) ojo.FORCE_REMOVE_FILE_MANAGER_UNLOCKED_FILES).c((ajfb) new l(str)).a((ajfl) m.a).f(n.a));
            akcr.a(obj, "configProvider.get()\n   …true) }\n                )");
            return obj;
        }
    }

    /* renamed from: oyi$f */
    static final class f<T, R> implements ajfc<ajxm<? extends Boolean, ? extends Boolean>, ajdb> {
        final /* synthetic */ oyi a;
        final /* synthetic */ ygl b;
        private /* synthetic */ String c;

        /* renamed from: oyi$f$1 */
        static final class 1<V> implements Callable<ajdb> {
            private /* synthetic */ f a;

            1(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ Object call() {
                ygi ygi = (ygi) this.a.a.b.get();
                ygl ygl = this.a.b;
                if (ygl != null) {
                    ojo ojo;
                    ygi.b((ygl) (ygh) ygl);
                    a b = ((tnj) this.a.a.c.get()).b();
                    ygh ygh = (ygh) this.a.b;
                    if (ygh instanceof oyk) {
                        ojo = ojo.HAS_REMOVED_FILE_MANAGER_UNLOCKED_FILES;
                    } else if (ygh instanceof oyl) {
                        ojo = ojo.HAS_REMOVED_FILE_MANAGER_UNLOCKED_THUMBNAILS;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("invalid group ");
                        stringBuilder.append(ygh.e());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    return b.a((fth) ojo, Boolean.TRUE).c();
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.storage.filemanager.FileGroup");
            }
        }

        f(oyi oyi, String str, ygl ygl) {
            this.a = oyi;
            this.c = str;
            this.b = ygl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            final boolean booleanValue = ((Boolean) ajxm.b).booleanValue();
            ilv ilv = (ilv) this.a.a.get();
            String e = this.b.e();
            akcr.a((Object) e, "group.groupKey");
            akcr.b(e, "fileGroup");
            ilv.c(iom.MIGRATE_FM_REMOVE_ATTEMPT.a("file_group", e).a("forced", booleanValue), 1);
            return ajcx.a((Callable) new 1(this)).b((ajev) new ajev(this) {
                private /* synthetic */ f a;

                public final void run() {
                    ilv ilv = (ilv) this.a.a.a.get();
                    Object e = this.a.b.e();
                    akcr.a(e, "group.groupKey");
                    ilv.c(phq.b(e, true, booleanValue), 1);
                }
            }).a((ajfb) new ajfb<Throwable>(this) {
                private /* synthetic */ f a;

                public final /* synthetic */ void accept(Object obj) {
                    ilv ilv = (ilv) this.a.a.a.get();
                    Object e = this.a.b.e();
                    akcr.a(e, "group.groupKey");
                    ilv.c(phq.b(e, false, booleanValue), 1);
                }
            });
        }
    }

    /* renamed from: oyi$g */
    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ oyi a;
        private /* synthetic */ ygl b;

        g(oyi oyi, ygl ygl) {
            this.a = oyi;
            this.b = ygl;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            ilv ilv = (ilv) this.a.a.get();
            String e = this.b.e();
            akcr.a((Object) e, "group.groupKey");
            akcr.b(e, "fileGroup");
            ilv.c(iom.MIGRATE_FM_REMOVE_ERROR.a("file_group", e), 1);
            gqr gqr = (gqr) this.a.d.get();
            gqt gqt = gqt.NORMAL;
            akcr.a(obj, "it");
            gqr.a(gqt, obj, ((idd) this.a.f.b()));
        }
    }

    /* renamed from: oyi$i */
    static final class i<T> implements ajfb<Boolean> {
        private /* synthetic */ String a;

        i(String str) {
            this.a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: oyi$j */
    static final class j<T> implements ajfl<Boolean> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return !bool.booleanValue();
        }
    }

    /* renamed from: oyi$k */
    static final class k<T, R> implements ajfc<T, R> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return new ajxm(Boolean.TRUE, Boolean.FALSE);
        }
    }

    /* renamed from: oyi$l */
    static final class l<T> implements ajfb<Boolean> {
        private /* synthetic */ String a;

        l(String str) {
            this.a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: oyi$m */
    static final class m<T> implements ajfl<Boolean> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: oyi$n */
    static final class n<T, R> implements ajfc<T, R> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            Boolean bool = Boolean.TRUE;
            return new ajxm(bool, bool);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(oyi.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(oyi.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
        a aVar = new a();
    }

    public oyi(oiy oiy, zgb zgb, ajwy<ilv> ajwy, ajwy<ygi> ajwy2, ajwy<tnj> ajwy3, ajwy<gqr> ajwy4, ajwy<ftl> ajwy5) {
        akcr.b(oiy, "feature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "graphene");
        akcr.b(ajwy2, "fileManager");
        akcr.b(ajwy3, "prefs");
        akcr.b(ajwy4, "exceptionTracker");
        akcr.b(ajwy5, "configProvider");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
        this.e = ajwy5;
        this.f = ajxh.a(new d(oiy));
        this.g = ajxh.a(new h(this, zgb));
    }

    public final void a(ygl<ygk> ygl) {
        akcr.b(ygl, "group");
        StringBuilder stringBuilder = new StringBuilder("[onInitialized][");
        stringBuilder.append(ygl.e());
        stringBuilder.append(']');
        String stringBuilder2 = stringBuilder.toString();
        Object a = ((ftl) this.e.get()).b((fth) ojo.ALLOW_REMOVE_FILE_MANAGER_UNLOCKED_FILES).c((ajfb) new b(stringBuilder2)).a((ajfl) c.a);
        akcr.a(a, "configProvider.get()\n   …           .filter { it }");
        a.a((ajfc) new e(this, stringBuilder2)).e(new f(this, stringBuilder2, ygl)).a((ajfb) new g(this, ygl)).a(ajfu.g).b((ajdw) ((zfw) this.g.b()).i()).e();
    }
}
