package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.snap.scan.core.SnapScanResult;
import defpackage.dnk.e;
import defpackage.dnk.e.c;
import defpackage.vpb.b;
import defpackage.vso.i;
import defpackage.vso.j;
import defpackage.vso.k.a;
import defpackage.vso.m;

/* renamed from: txv */
public final class txv {
    final ajxe a;
    final ajwy<vsm> b;
    final vpc c;
    final vvi d;
    final ajwy<achb<zjm, zjk>> e;
    final ajws<dpz> f;
    private final ajxe g;

    /* renamed from: txv$d */
    static final class d extends akcq implements akbl<vvd, Boolean> {
        d(vvi vvi) {
            super(1, vvi);
        }

        public final String getName() {
            return "hasValidSnapcode";
        }

        public final akej getOwner() {
            return akde.a(vvi.class);
        }

        public final String getSignature() {
            return "hasValidSnapcode(Lcom/snap/scan/scannable/ScanResult;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(((vvi) this.receiver).a((vvd) obj));
        }
    }

    /* renamed from: txv$e */
    static final class e extends akcq implements akbl<vso, ajxw> {
        e(txv txv) {
            super(1, txv);
        }

        public final String getName() {
            return "observeScanCardEvents";
        }

        public final akej getOwner() {
            return akde.a(txv.class);
        }

        public final String getSignature() {
            return "observeScanCardEvents(Lcom/snap/scan/events/ScanCardEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            vso vso = (vso) obj;
            akcr.b(vso, "p1");
            txv txv = (txv) this.receiver;
            if (vso instanceof a) {
                ajws ajws = txv.f;
                a aVar = (a) vso;
                String str = aVar.c;
                obj = Uri.parse(aVar.d);
                akcr.a(obj, "Uri.parse(event.previewUrl)");
                ajws.a((Object) new dpz.a(str, obj));
            } else {
                String str2;
                if (vso instanceof m.a) {
                    str2 = ((m.a) vso).b;
                } else if (vso instanceof j) {
                    str2 = ((j) vso).b;
                } else if (vso instanceof i.a) {
                    achb.a((achb) txv.e.get(), dnh.a, false, c.a, 2);
                }
                txv.a(str2);
            }
            return ajxw.a;
        }
    }

    /* renamed from: txv$a */
    static final class a extends akcs implements akbk<idd> {
        private /* synthetic */ toc a;

        a(toc toc) {
            this.a = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.callsite("ScanController");
        }
    }

    /* renamed from: txv$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ txv a;
        private /* synthetic */ zgb b;

        g(txv txv, zgb zgb) {
            this.a = txv;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a((idd) this.a.a.b());
        }
    }

    /* renamed from: txv$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ txv a;

        b(txv txv) {
            this.a = txv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            akcr.b(bitmap, "bitmap");
            return ((vsm) this.a.b.get()).a(bitmap);
        }
    }

    /* renamed from: txv$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ txv a;

        c(txv txv) {
            this.a = txv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SnapScanResult snapScanResult = (SnapScanResult) obj;
            akcr.b(snapScanResult, "snapScanResult");
            return this.a.c.a(b.a(snapScanResult, aayb.CAMERA_PREVIEW));
        }
    }

    /* renamed from: txv$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(txv.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(txv.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public txv(ajwy<vsm> ajwy, vpc vpc, vvi vvi, ajwy<achb<zjm, zjk>> ajwy2, ajws<dpz> ajws, toc toc, zgb zgb) {
        akcr.b(ajwy, "snapScan");
        akcr.b(vpc, "scanCardsClient");
        akcr.b(vvi, "snapcodeValidator");
        akcr.b(ajwy2, "navigationHostProvider");
        akcr.b(ajws, "scanSendToEventConsumer");
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulerProvider");
        this.b = ajwy;
        this.c = vpc;
        this.d = vvi;
        this.e = ajwy2;
        this.f = ajws;
        this.a = ajxh.a(new a(toc));
        this.g = ajxh.a(new g(this, zgb));
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.g.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        achb.a((achb) this.e.get(), dnh.a, false, new e.a(str), 2);
    }
}
