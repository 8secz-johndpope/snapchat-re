package defpackage;

import defpackage.zuk.a;
import java.util.concurrent.Callable;

/* renamed from: zuv */
public final class zuv implements zud {
    final ajxe a = ajxh.a(b.a);
    final a b = a.RENDER;
    final ajwy<vjn> c;

    /* renamed from: zuv$b */
    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zui.a.callsite("UploadMediaManager:RenderMediaPlugin");
        }
    }

    /* renamed from: zuv$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zuv$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ abyi a;

        c(abyi abyi) {
            this.a = abyi;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: zuv$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zuv a;
        private /* synthetic */ abyi b;
        private /* synthetic */ idd c;
        private /* synthetic */ ajwy d;
        private /* synthetic */ String e;

        d(zuv zuv, abyi abyi, idd idd, ajwy ajwy, String str) {
            this.a = zuv;
            this.b = abyi;
            this.c = idd;
            this.d = ajwy;
            this.e = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((abyi) obj, "it");
            if (this.b.g == abyl.RENDERED || this.b.g == abyl.ZIPPED) {
                return ajdx.b(this.b);
            }
            vjn vjn = (vjn) this.a.c.get();
            idd idd = this.c;
            return vjn.a(idd != null ? idd.a("UploadMediaManager:RenderMediaPlugin") : (idd) this.a.a.b(), this.b, this.d, this.e).h(new zuw(new akbl<Throwable, ajdx<abyi>>(this.a) {
                public final String getName() {
                    return "handleException";
                }

                public final akej getOwner() {
                    return akde.a(zuv.class);
                }

                public final String getSignature() {
                    return "handleException(Ljava/lang/Throwable;)Lio/reactivex/Single;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    String str;
                    Throwable th = (Throwable) obj;
                    akcr.b(th, "p1");
                    zuv zuv = (zuv) this.receiver;
                    if (th instanceof ofj) {
                        obj = ajdx.b((Throwable) new zuf(zuv.b, th.getMessage(), th.getCause(), ((ofj) th).a));
                        str = "Single.error(UploadExcep…se, throwable.retryable))";
                    } else {
                        obj = ajdx.b((Throwable) new zuf(zuv.b, th.getMessage(), th, false));
                        str = "Single.error(UploadExcep…ssage, throwable, false))";
                    }
                    akcr.a(obj, str);
                    return obj;
                }
            }));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zuv.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;");
        a aVar = new a();
    }

    public zuv(ajwy<vjn> ajwy) {
        akcr.b(ajwy, "mediaRenderingController");
        this.c = ajwy;
    }

    public final ajdx<abyi> a(abyi abyi, ajwy<vjo> ajwy, idd idd, String str) {
        akcr.b(abyi, "mediaPackage");
        akcr.b(ajwy, "mediaRenderingSizeHint");
        Object a = ajdx.c((Callable) new c(abyi)).a((ajfc) new d(this, abyi, idd, ajwy, str));
        akcr.a(a, "Single.fromCallable {\n  …      }\n                }");
        return a;
    }

    public final a a() {
        return this.b;
    }
}
