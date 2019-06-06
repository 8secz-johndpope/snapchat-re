package defpackage;

import defpackage.zuk.a;
import java.util.concurrent.Callable;

/* renamed from: zux */
public final class zux implements zud {
    final ajxe a = ajxh.a(a.a);
    final a b = a.TRIM;
    final aipn<ofb> c;

    /* renamed from: zux$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zui.a.callsite("UploadMediaManager:TrimMediaPlugin");
        }
    }

    /* renamed from: zux$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ abyi a;

        b(abyi abyi) {
            this.a = abyi;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: zux$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zux a;
        private /* synthetic */ abyi b;
        private /* synthetic */ idd c;

        c(zux zux, abyi abyi, idd idd) {
            this.a = zux;
            this.b = abyi;
            this.c = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((abyi) obj, "it");
            if (this.b.g != null) {
                return ajdx.b(this.b);
            }
            idd idd = this.c;
            return ((ofb) this.a.c.get()).a(idd != null ? idd.a("UploadMediaManager:TrimMediaPlugin") : (idd) this.a.a.b(), this.b).h(new zuy(new akbl<Throwable, ajdx<abyi>>(this.a) {
                public final String getName() {
                    return "handleException";
                }

                public final akej getOwner() {
                    return akde.a(zux.class);
                }

                public final String getSignature() {
                    return "handleException(Ljava/lang/Throwable;)Lio/reactivex/Single;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    String str;
                    Throwable th = (Throwable) obj;
                    akcr.b(th, "p1");
                    zux zux = (zux) this.receiver;
                    if (th instanceof ofc) {
                        obj = ajdx.b((Throwable) new zuf(zux.b, th.getMessage(), th.getCause(), ((ofc) th).a));
                        str = "Single.error(UploadExcep…se, throwable.retryable))";
                    } else {
                        obj = ajdx.b((Throwable) new zuf(zux.b, th.getMessage(), th, false));
                        str = "Single.error(UploadExcep…ssage, throwable, false))";
                    }
                    akcr.a(obj, str);
                    return obj;
                }
            }));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zux.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;");
    }

    public zux(aipn<ofb> aipn) {
        akcr.b(aipn, "mediaTrimController");
        this.c = aipn;
    }

    public final ajdx<abyi> a(abyi abyi, ajwy<vjo> ajwy, idd idd, String str) {
        akcr.b(abyi, "mediaPackage");
        akcr.b(ajwy, "mediaRenderingSizeHint");
        Object a = ajdx.c((Callable) new b(abyi)).a((ajfc) new c(this, abyi, idd));
        akcr.a(a, "Single.fromCallable {\n  …      }\n                }");
        return a;
    }

    public final a a() {
        return this.b;
    }
}
