package defpackage;

import com.snap.core.db.record.UnlockablesModel;
import java.util.Locale;

/* renamed from: emr */
public final class emr implements dod {
    final dug a;
    private a b;
    private final ajdw c = zgb.a(dnh.f, emt.a).f();
    private final ilv d;
    private final ihh e;

    /* renamed from: emr$b */
    static final class b {
        final eca a;
        final ebx b;
        final edi c;
        final gcn d;
        final long e;

        public b(eca eca, ebx ebx, edi edi, gcn gcn, long j) {
            akcr.b(eca, "api");
            akcr.b(ebx, "cameraType");
            akcr.b(edi, "cameraUsageType");
            this.a = eca;
            this.b = ebx;
            this.c = edi;
            this.d = gcn;
            this.e = j;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (akcr.a(this.a, bVar.a) && akcr.a(this.b, bVar.b) && akcr.a(this.c, bVar.c) && akcr.a(this.d, bVar.d)) {
                        if ((this.e == bVar.e ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            eca eca = this.a;
            int i = 0;
            int hashCode = (eca != null ? eca.hashCode() : 0) * 31;
            ebx ebx = this.b;
            hashCode = (hashCode + (ebx != null ? ebx.hashCode() : 0)) * 31;
            edi edi = this.c;
            hashCode = (hashCode + (edi != null ? edi.hashCode() : 0)) * 31;
            gcn gcn = this.d;
            if (gcn != null) {
                i = gcn.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            long j = this.e;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Data(api=");
            stringBuilder.append(this.a);
            stringBuilder.append(", cameraType=");
            stringBuilder.append(this.b);
            stringBuilder.append(", cameraUsageType=");
            stringBuilder.append(this.c);
            stringBuilder.append(", sendSessionSource=");
            stringBuilder.append(this.d);
            stringBuilder.append(", startTime=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: emr$e */
    static final class e implements Runnable {
        private /* synthetic */ emr a;
        private /* synthetic */ b b;

        e(emr emr, b bVar) {
            this.a = emr;
            this.b = bVar;
        }

        public final void run() {
            this.a.a.a(emr.a((aach) new aacg(), this.b));
        }
    }

    /* renamed from: emr$a */
    static abstract class a {

        /* renamed from: emr$a$b */
        public static final class b extends a {
            private final b a;

            public b(b bVar) {
                akcr.b(bVar, UnlockablesModel.DATA);
                super();
                this.a = bVar;
            }

            public final b a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.emr.a.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.emr.a.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.emr.a.b) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.emr$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                return bVar != null ? bVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Opening(data=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: emr$a$a */
        public static final class a extends a {
            final long a;
            private final b b;

            public a(b bVar, long j) {
                akcr.b(bVar, UnlockablesModel.DATA);
                super();
                this.b = bVar;
                this.a = j;
            }

            public final b a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (akcr.a(this.b, aVar.b)) {
                            if ((this.a == aVar.a ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                b bVar = this.b;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                long j = this.a;
                return hashCode + ((int) (j ^ (j >>> 32)));
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Opened(data=");
                stringBuilder.append(this.b);
                stringBuilder.append(", openedTime=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public abstract b a();
    }

    /* renamed from: emr$d */
    static final class d implements Runnable {
        private /* synthetic */ a a;
        private /* synthetic */ long b;
        private /* synthetic */ long c;
        private /* synthetic */ emr d;
        private /* synthetic */ long e;

        d(a aVar, long j, long j2, emr emr, long j3) {
            this.a = aVar;
            this.b = j;
            this.c = j2;
            this.d = emr;
            this.e = j3;
        }

        public final void run() {
            dug dug = this.d.a;
            aacn aacn = new aacn();
            emr.a((aach) aacn, this.a.a());
            aacn.b(Long.valueOf(this.b));
            aacn.c(Long.valueOf(this.c));
            dug.a(aacn);
        }
    }

    /* renamed from: emr$c */
    static final class c implements Runnable {
        private /* synthetic */ emr a;
        private /* synthetic */ a b;
        private /* synthetic */ long c;
        private /* synthetic */ aacl d;

        c(emr emr, a aVar, long j, aacl aacl) {
            this.a = emr;
            this.b = aVar;
            this.c = j;
            this.d = aacl;
        }

        public final void run() {
            dug dug = this.a.a;
            aack aack = new aack();
            emr.a((aach) aack, this.b.a());
            aack.c(Long.valueOf(this.c - this.b.a().e));
            a aVar = this.b;
            if (aVar instanceof a) {
                aack.b(Long.valueOf(((a) aVar).a - this.b.a().e));
            }
            aack.a(this.d);
            dug.a(aack);
        }
    }

    /* renamed from: emr$f */
    static final class f implements Runnable {
        private /* synthetic */ a a;
        private /* synthetic */ long b;
        private /* synthetic */ emr c;
        private /* synthetic */ edl d;

        f(a aVar, long j, emr emr, edl edl) {
            this.a = aVar;
            this.b = j;
            this.c = emr;
            this.d = edl;
        }

        public final void run() {
            aacj aacj;
            dug dug = this.c.a;
            aaci aaci = new aaci();
            emr.a((aach) aaci, this.a.a());
            aaci.b(Long.valueOf(this.b - this.a.a().e));
            switch (ems.a[this.d.ordinal()]) {
                case 1:
                    aacj = aacj.NOT_INIT;
                    break;
                case 2:
                    aacj = aacj.CAMERA_OPEN_FAILURE;
                    break;
                case 3:
                    aacj = aacj.PERMISSION_NOT_GRANTED;
                    break;
                case 4:
                    aacj = aacj.CAMERA_DISABLED;
                    break;
                case 5:
                    aacj = aacj.PERMISSION_NONE;
                    break;
                case 6:
                    aacj = aacj.START_PREVIEW_FAILURE;
                    break;
                default:
                    throw new ajxk();
            }
            aaci.a(aacj);
            dug.a(aaci);
        }
    }

    public emr(dug dug, ilv ilv, ihh ihh, zgb zgb) {
        akcr.b(dug, "cameraTelemetry");
        akcr.b(ilv, "graphene");
        akcr.b(ihh, "clock");
        akcr.b(zgb, "schedulersProvider");
        this.a = dug;
        this.d = ilv;
        this.e = ihh;
    }

    private static ilz a(inq inq, b bVar) {
        ilz a = inq.a("api", emr.a((Enum) bVar.a));
        String a2 = bVar.d == null ? bVar.c == edi.MAIN ? "startup" : emr.a((Enum) bVar.c) : bVar.d == gcn.CAMERA ? "main" : "other";
        return a.a("type", a2);
    }

    private static String a(Enum<?> enumR) {
        String name = enumR.name();
        Object obj = Locale.US;
        akcr.a(obj, "Locale.US");
        if (name != null) {
            Object toLowerCase = name.toLowerCase(obj);
            akcr.a(toLowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return toLowerCase;
        }
        throw new ajxt("null cannot be cast to non-null type java.lang.String");
    }

    private final void a(a aVar, aacl aacl) {
        this.c.a((Runnable) new c(this, aVar, this.e.a(), aacl));
        this.d.c(emr.a(inq.OPEN_INTERRUPT, aVar.a()).a("reason", emr.a((Enum) aacl)), 1);
    }

    public final void a() {
        a aVar = this.b;
        if (aVar != null) {
            a(aVar, aacl.LEFT_CAMERA);
        }
        this.b = null;
    }

    public final void a(long j) {
        a aVar = this.b;
        this.b = aVar instanceof b ? new a(aVar.a(), j) : null;
    }

    public final void a(eca eca, ebx ebx, edi edi, doc doc) {
        gcn gcn;
        akcr.b(eca, "api");
        akcr.b(ebx, "cameraType");
        akcr.b(edi, "cameraUsageType");
        if (doc == null) {
            gcn = null;
        } else if (doc instanceof emq) {
            gcn = ((emq) doc).a;
        } else {
            throw new IllegalStateException("Unrecognized CameraOpenPayload ".concat(String.valueOf(doc)));
        }
        b bVar = new b(eca, ebx, edi, gcn, this.e.a());
        this.b = new b(bVar);
        this.c.a((Runnable) new e(this, bVar));
        this.d.c(emr.a(inq.OPEN_ATTEMPT, bVar), 1);
    }

    public final void a(edl edl) {
        akcr.b(edl, "error");
        a aVar = this.b;
        if (aVar != null) {
            this.c.a((Runnable) new f(aVar, this.e.a(), this, edl));
            this.d.c(emr.a(inq.OPEN_FAILURE, aVar.a()).a("reason", emr.a((Enum) edl)), 1);
        }
        this.b = null;
    }

    public final void b() {
        a aVar = this.b;
        if (aVar != null) {
            a(aVar, aacl.DEVICE_CLOSED);
        }
        this.b = null;
    }

    public final void b(long j) {
        a aVar = this.b;
        if (aVar instanceof a) {
            long j2 = j - aVar.a().e;
            this.c.a((Runnable) new d(aVar, ((a) aVar).a - aVar.a().e, j2, this, j));
            ilz a = emr.a(inq.OPEN_SUCCESS, aVar.a());
            this.d.c(a, 1);
            this.d.a(a, j2);
        }
        this.b = null;
    }
}
