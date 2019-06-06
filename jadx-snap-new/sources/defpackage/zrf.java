package defpackage;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.zrj.d;

/* renamed from: zrf */
public final class zrf implements cin {
    final ajxe a;
    final ajxe b;
    private final ajxe c;
    private final ajdx<iha> d;

    /* renamed from: zrf$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zpy.a.callsite("GtqAuthPayloadProcessor"));
        }
    }

    /* renamed from: zrf$c */
    static final class c extends akcs implements akbk<ihh> {
        private /* synthetic */ aipn a;

        c(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.get();
        }
    }

    /* renamed from: zrf$d */
    static final class d extends akcs implements akbk<tnj> {
        private /* synthetic */ aipn a;

        d(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tnj) this.a.get();
        }
    }

    /* renamed from: zrf$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;
        private /* synthetic */ zrf b;

        a(String str, zrf zrf) {
            this.a = str;
            this.b = zrf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            iha iha = (iha) obj;
            akcr.b(iha, "helper");
            return iha.b(new abrj(this.a, ((ihh) this.b.a.b()).a()));
        }
    }

    /* renamed from: zrf$b */
    static final class b<T> implements ajfb<String> {
        private /* synthetic */ String a;
        private /* synthetic */ zrf b;

        b(String str, zrf zrf) {
            this.a = str;
            this.b = zrf;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((tnj) this.b.b.b()).b().a((fth) zpt.GTQ_AUTH_PAYLOAD, (String) obj).b();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zrf.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(zrf.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(zrf.class), "preferences", "getPreferences()Lcom/snap/prefs/Preferences;")};
    }

    public zrf(aipn<ihh> aipn, aipn<tnj> aipn2, zgb zgb, ajdx<iha> ajdx) {
        akcr.b(aipn, "clockLazy");
        akcr.b(aipn2, "preferencesLazy");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajdx, "serializationHelperSingle");
        this.d = ajdx;
        this.c = ajxh.a(new e(zgb));
        this.a = ajxh.a(new c(aipn));
        this.b = ajxh.a(new d(aipn2));
    }

    public final void a(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        afeq afeq = aecy.c;
        if (afeq != null) {
            aich aich = afeq.ci;
            if (aich != null) {
                String str = aich.a;
                if (!(str == null || str == null)) {
                    Object d = this.d.f(new a(str, this)).b((ajdw) ((zfw) this.c.b()).b()).c((ajfb) new b(str, this)).d();
                    akcr.a(d, "serializationHelperSingl…         .toCompletable()");
                    d = d.a((ajfb) new d("GtqAuthPayloadProcessor")).a(ajfu.g);
                    akcr.a(d, "doOnError {\n    if (fals…ge}\")\n}.onErrorComplete()");
                    d.e();
                }
            }
        }
    }
}
