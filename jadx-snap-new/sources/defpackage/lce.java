package defpackage;

import android.net.Uri;
import defpackage.gfw.a;
import defpackage.kqe.d;
import defpackage.moc.b;
import java.util.concurrent.Callable;

/* renamed from: lce */
public final class lce implements leq {
    final ajxe a;
    final gfu b;
    final lci c;
    final kqf d;
    private final zfw e;

    /* renamed from: lce$d */
    static final class d extends akcs implements akbk<idj> {
        private /* synthetic */ ide a;

        d(ide ide) {
            this.a = ide;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.getPage();
        }
    }

    /* renamed from: lce$a */
    static final class a<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ lce a;
        private /* synthetic */ moc b;

        a(lce lce, moc moc) {
            this.a = lce;
            this.b = moc;
        }

        public final /* synthetic */ Object call() {
            Uri uri = (Uri) this.a.c.invoke(this.b);
            if (uri != null) {
                return this.a.b.b(uri, (idj) this.a.a.b());
            }
            StringBuilder stringBuilder = new StringBuilder("Can't create request uri for given request!\n");
            stringBuilder.append(this.b);
            Object b = ajdp.b((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            akcr.a(b, "Observable.error<SnapCon…est!\\n$resourceRequest\"))");
            return b;
        }
    }

    /* renamed from: lce$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gfw gfw = (gfw) obj;
            akcr.b(gfw, "status");
            if (!(gfw instanceof a)) {
                gfw = null;
            }
            a aVar = (a) gfw;
            if (aVar != null) {
                gff gff = aVar.a;
                if (gff != null) {
                    if ((gff.a == gfc.NETWORK ? 1 : null) == null) {
                        gff = null;
                    }
                    if (gff != null) {
                        obj = gff.d;
                        if (obj != null) {
                            ajdp b = ajdp.b(obj);
                            if (b != null) {
                                return b;
                            }
                        }
                    }
                }
            }
            return ajvo.a(ajot.a);
        }
    }

    /* renamed from: lce$c */
    static final class c<T, R> implements ajfc<gfj, ajdb> {
        final /* synthetic */ lce a;
        final /* synthetic */ moc b;

        c(lce lce, moc moc) {
            this.a = lce;
            this.b = moc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final gfj gfj = (gfj) obj;
            akcr.b(gfj, "metrics");
            return ajcx.a((Runnable) new Runnable(this) {
                private /* synthetic */ c a;

                public final void run() {
                    lce lce = this.a.a;
                    b.a aVar = (b.a) this.a.b;
                    Object obj = gfj;
                    akcr.a(obj, "metrics");
                    lce.d.a(new d(aVar.a.a, obj.d, (long) obj.e));
                }
            });
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lce.class), "uiPage", "getUiPage()Lcom/snap/framework/attribution/StaticUiPage;");
    }

    public lce(gfu gfu, lci lci, zfw zfw, kqf kqf, ide ide) {
        akcr.b(gfu, "snapContentResolver");
        akcr.b(lci, "uriBuilder");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(kqf, "analyticsEventHandler");
        akcr.b(ide, "attributedFeature");
        this.b = gfu;
        this.c = lci;
        this.e = zfw;
        this.d = kqf;
        this.a = ajxh.a(new d(ide));
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        moc moc = (moc) obj;
        akcr.b(moc, "resourceRequest");
        if (moc instanceof b.a) {
            obj = ajdp.a((Callable) new a(this, moc)).b((ajdw) this.e.b()).a((ajdw) this.e.b()).u(b.a).v(new c(this, moc));
            str = "Observable.defer {\n     …      }\n                }";
        } else {
            obj = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        }
        akcr.a(obj, str);
        return obj;
    }
}
