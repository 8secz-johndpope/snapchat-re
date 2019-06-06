package defpackage;

import defpackage.ygm.b;
import java.util.HashSet;

/* renamed from: gjc */
public final class gjc implements gdx {
    final HashSet<String> a = new HashSet();
    final ygi b;
    private final ihh c;

    /* renamed from: gjc$c */
    static final class c extends akcs implements akbk<b<ygk, ygh>> {
        private /* synthetic */ ygk a;
        private /* synthetic */ String b;
        private /* synthetic */ gjc c;
        private /* synthetic */ gea d;
        private /* synthetic */ String e;

        c(ygk ygk, String str, gjc gjc, gea gea, String str2) {
            this.a = ygk;
            this.b = str;
            this.c = gjc;
            this.d = gea;
            this.e = str2;
            super(0);
        }

        private b<ygk, ygh> a() {
            Object obj = this.a;
            akcr.a(obj, "fileType");
            akcr.a(sbi.a("FlashCache", "acquireLeaseForFile", obj.a()), "traceNameOf(\"FlashCache\"…rFile\", fileType.fileKey)");
            obj = this.c.b.l(this.a, this.b);
            akcr.a(obj, "fileCache.acquireLeaseFo…fileType, transformedKey)");
            akcr.a(obj, "trace(traceNameOf(\"Flash…medKey)\n                }");
            return obj;
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: gjc$d */
    static final class d extends akcs implements akbk<yeu> {
        private /* synthetic */ String a;
        private /* synthetic */ ygk b;
        private /* synthetic */ gjc c;
        private /* synthetic */ gea d;
        private /* synthetic */ String e;

        d(String str, ygk ygk, gjc gjc, gea gea, String str2) {
            this.a = str;
            this.b = ygk;
            this.c = gjc;
            this.d = gea;
            this.e = str2;
            super(0);
        }

        private yeu a() {
            long f = this.c.a.contains(this.a) ? -1 : this.d.f();
            Object obj = this.b;
            akcr.a(obj, "fileType");
            akcr.a(sbi.a("FlashCache", "getFileReadOnly", obj.a()), "traceNameOf(\"FlashCache\"…dOnly\", fileType.fileKey)");
            return this.c.b.a((ygp) this.b, this.a, f);
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: gjc$b */
    static final class b extends akcs implements akbk<defpackage.ygm.b<ygk, ygh>> {
        private /* synthetic */ gjc a;
        private /* synthetic */ ygk b;
        private /* synthetic */ String c;

        b(gjc gjc, ygk ygk, String str) {
            this.a = gjc;
            this.b = ygk;
            this.c = str;
            super(0);
        }

        private defpackage.ygm.b<ygk, ygh> a() {
            Object obj = this.b;
            akcr.a(obj, "fileType");
            akcr.a(sbi.a("FlashCache", "acquireLeaseForFile", obj.a()), "traceNameOf(\"FlashCache\"…rFile\", fileType.fileKey)");
            obj = this.a.b.l(this.b, this.c);
            akcr.a(obj, "fileCache.acquireLeaseFo…fileType, transformedKey)");
            akcr.a(obj, "trace(traceNameOf(\"Flash…sformedKey)\n            }");
            return obj;
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: gjc$a */
    static final class a extends akcs implements akbk<yeu> {
        private /* synthetic */ gjc a;
        private /* synthetic */ ygk b;
        private /* synthetic */ String c;

        a(gjc gjc, ygk ygk, String str) {
            this.a = gjc;
            this.b = ygk;
            this.c = str;
            super(0);
        }

        private yeu a() {
            Object obj = this.b;
            akcr.a(obj, "fileType");
            akcr.a(sbi.a("FlashCache", "getFileReadOnly", obj.a()), "traceNameOf(\"FlashCache\"…dOnly\", fileType.fileKey)");
            return this.a.b.d(this.b, this.c);
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    public gjc(ygi ygi, ihh ihh) {
        akcr.b(ygi, "fileCache");
        akcr.b(ihh, "clock");
        this.b = ygi;
        this.c = ihh;
    }

    public final gdx.b a(String str, gea gea, int i) {
        akcr.b(str, "key");
        akcr.b(gea, "policy");
        String a = gea.c().a(str);
        Object b = gea.b();
        akbk bVar = new b(this, b, a);
        akbk aVar = new a(this, b, a);
        akcr.a(b, "fileType");
        akcr.a(sbi.a("FlashCache", "editFile", b.a()), "traceNameOf(\"FlashCache\"…tFile\", fileType.fileKey)");
        yes.b e = i == -1 ? this.b.e((ygp) b, a) : this.b.a((ygp) b, a, i);
        return e != null ? new gjd(e, a, gea.e(), aVar, bVar) : null;
    }

    public final gez a(String str, gea gea) {
        akcr.b(str, "key");
        akcr.b(gea, "policy");
        Object b = gea.b();
        akcr.a(b, "policy.fileType");
        String str2 = "FlashCache";
        akcr.a(sbi.a(str2, "getEntry", b.a()), "traceNameOf(\"FlashCache\"… policy.fileType.fileKey)");
        String a = gea.c().a(str);
        Object b2 = gea.b();
        akbk cVar = new c(b2, a, this, gea, str);
        akbk dVar = new d(a, b2, this, gea, str);
        b bVar = (b) cVar.invoke();
        yeu yeu = (yeu) dVar.invoke();
        a = "fileType";
        if (yeu != null) {
            akcr.a(b2, a);
            akcr.a(sbi.a(str2, "createFlashLease", b2.a()), "traceNameOf(\"FlashCache\"…Lease\", fileType.fileKey)");
            return new gje(yeu, bVar, dVar, cVar);
        }
        akcr.a(b2, a);
        akcr.a(sbi.a(str2, "lease.release", b2.a()), "traceNameOf(\"FlashCache\"…lease\", fileType.fileKey)");
        bVar.a();
        return null;
    }

    public final boolean b(String str, gea gea) {
        akcr.b(str, "key");
        akcr.b(gea, "policy");
        str = gea.c().a(str);
        Object b = gea.b();
        akcr.a(b, "fileType");
        akcr.a(sbi.a("FlashCache", "isExists", b.a()), "traceNameOf(\"FlashCache\"…xists\", fileType.fileKey)");
        return this.b.a((ygp) b, str, true);
    }
}
