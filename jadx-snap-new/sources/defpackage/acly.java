package defpackage;

import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: acly */
public final class acly {
    public final HashSet<String> a = new HashSet();
    public final dis b;
    final ajwy<ncn> c;
    public final ajei d;
    private final ajxe e = ajxh.a(new g(this));
    private zgb f;

    /* renamed from: acly$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acly$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ acly a;

        b(acly acly) {
            this.a = acly;
        }

        public final /* synthetic */ Object call() {
            return (ncn) this.a.c.get();
        }
    }

    /* renamed from: acly$d */
    public static final class d<V> implements Callable<T> {
        private /* synthetic */ acly a;
        private /* synthetic */ String b;

        public d(acly acly, String str) {
            this.a = acly;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(((ncn) this.a.c.get()).a(this.b));
        }
    }

    /* renamed from: acly$c */
    static final class c<T> implements ajfb<ncn> {
        private /* synthetic */ acly a;
        private /* synthetic */ nch b;
        private /* synthetic */ aaqx c;
        private /* synthetic */ acmc d;
        private /* synthetic */ abbd e;

        c(acly acly, nch nch, aaqx aaqx, acmc acmc, abbd abbd) {
            this.a = acly;
            this.b = nch;
            this.c = aaqx;
            this.d = acmc;
            this.e = abbd;
        }

        public final /* synthetic */ void accept(Object obj) {
            aclp aclp;
            obj = (ncn) obj;
            nch nch = this.b;
            akcr.a(obj, "nycSharingManager");
            String str = null;
            if (obj.b()) {
                if (!(nch == null || nch == nch.NONE || obj.e())) {
                    int i = aclz.a[nch.ordinal()];
                    if (i == 1) {
                        aclp = aclp.CUSTOM;
                    } else if (i == 2) {
                        aclp = aclp.BLACKLIST;
                    } else if (i == 3) {
                        aclp = aclp.ALL;
                    }
                }
                aclp = aclp.GHOST;
            } else {
                aclp = null;
            }
            if (aclp != null) {
                this.c.b(aclp.toString());
            }
            aaqx aaqx = this.c;
            acmc acmc = this.d;
            if (acmc != null) {
                str = acmc.toString();
            }
            aaqx.a(str);
            this.c.a(this.e);
            this.a.b.a(this.c);
        }
    }

    /* renamed from: acly$e */
    public static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ acly a;
        private /* synthetic */ boolean b;
        private /* synthetic */ acmd c;

        public e(acly acly, boolean z, acmd acmd) {
            this.a = acly;
            this.b = z;
            this.c = acmd;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            aaqz aaqz = new aaqz();
            aaqz.a(Boolean.valueOf(this.b));
            aaqz.a(this.c.toString());
            aaqz.b(bool);
            this.a.b.a(aaqz);
        }
    }

    /* renamed from: acly$f */
    public static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acly$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ acly a;

        g(acly acly) {
            this.a = acly;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(adcw.b, "MapLocationShareMessageAnalytics");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acly.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public acly(dis dis, ajwy<ncn> ajwy, zgb zgb, ajei ajei) {
        akcr.b(dis, "eventLogger");
        akcr.b(ajwy, "nycSharingManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajei, "compositeDisposable");
        this.b = dis;
        this.c = ajwy;
        this.f = zgb;
        this.d = ajei;
    }

    public final zfw a() {
        return (zfw) this.e.b();
    }

    public final void a(acmd acmd, abbd abbd) {
        akcr.b(acmd, "shareMessageType");
        akcr.b(abbd, "sourceType");
        aara aara = new aara();
        aara.a(acmd.toString());
        aara.a(Boolean.FALSE);
        aara.a(abbd);
        this.b.a(aara);
    }

    public final void a(boolean z, boolean z2, nch nch, acmc acmc, abbd abbd) {
        aaqx aaqx = new aaqx();
        aaqx.b(Boolean.valueOf(z));
        aaqx.a(Boolean.valueOf(z2));
        Object e = ajdx.c((Callable) new b(this)).b((ajdw) a().b()).e((ajfb) new c(this, nch, aaqx, acmc, abbd));
        akcr.a(e, "Single.fromCallable {\n  …logEvent(event)\n        }");
        std.a(e, this.d);
    }
}
