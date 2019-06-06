package defpackage;

import java.io.InputStream;
import java.util.List;

/* renamed from: ghx */
public final class ghx implements gej {
    private final gey a;
    private final gff b;

    /* renamed from: ghx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static gej a(geg geg) {
            akcr.b(geg, "request");
            StringBuilder stringBuilder = new StringBuilder("Request was canceled through the ContentRequestController. ");
            stringBuilder.append(ghy.a(geg));
            return new ghx(new gey(-2, new gex(stringBuilder.toString(), null, 2)), new gff(gfc.CANCELED, false, 0, null, null, null, null, 254));
        }

        public static gej a(geg geg, long j) {
            gex gex;
            akcr.b(geg, "request");
            if (ggu.a(geg)) {
                StringBuilder stringBuilder = new StringBuilder("Content was not in cache, and no NetworkRequest was provided. ");
                stringBuilder.append(ghy.a(geg));
                gex = new gex(stringBuilder.toString(), null, 2);
            } else {
                gex = new gex("Content was not in cache, create temp failure result.", null, 2);
            }
            return new ghx(new gey(-1, gex), new gff(gfc.CACHE, false, j, null, new gdz(0, j, false, 1), null, null, 234));
        }

        public static gej a(geg geg, sat<sai> sat, gff gff) {
            Throwable gex;
            akcr.b(geg, "request");
            akcr.b(sat, "result");
            akcr.b(gff, "metrics");
            Object a = sat.a();
            String str = "result.response";
            akcr.a(a, str);
            int a2 = a.a();
            Object a3 = sat.a();
            akcr.a(a3, str);
            Throwable d = a3.d();
            String str2 = "Empty payload, status:";
            Object a4;
            if (d != null) {
                StringBuilder stringBuilder = new StringBuilder(str2);
                a4 = sat.a();
                akcr.a(a4, str);
                stringBuilder.append(a4.a());
                stringBuilder.append(' ');
                stringBuilder.append(ghy.a(geg));
                stringBuilder.append(',');
                stringBuilder.append(" caused by ");
                stringBuilder.append(d.getMessage());
                gex = new gex(stringBuilder.toString(), d);
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(str2);
                a4 = sat.a();
                akcr.a(a4, str);
                stringBuilder2.append(a4.a());
                stringBuilder2.append(' ');
                stringBuilder2.append(ghy.a(geg));
                gex = new gex(stringBuilder2.toString(), null, 2);
            }
            Object a5 = sat.a();
            akcr.a(a5, str);
            return new ghx(new gey(a2, gex, a5.e()), gff);
        }

        public static gej a(Throwable th, long j) {
            akcr.b(th, "e");
            return a.a(th, new gff(gfc.CACHE, false, j, null, new gdz(0, j, false, 1), null, null, 234));
        }

        public static gej a(Throwable th, gff gff) {
            akcr.b(th, "e");
            return new ghx(new gey(0, th), gff);
        }

        public static boolean a(gej gej) {
            akcr.b(gej, "contentResult");
            if (!gej.a()) {
                Object e = gej.e();
                akcr.a(e, "contentResult.failureReason");
                if (e.a() == -2) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        a aVar = new a();
    }

    public /* synthetic */ ghx(gey gey) {
        this(gey, null);
    }

    public ghx(gey gey, gff gff) {
        akcr.b(gey, "failureReason");
        this.a = gey;
        this.b = gff;
    }

    public final boolean a() {
        return false;
    }

    public final InputStream b() {
        StringBuilder stringBuilder = new StringBuilder("The result was unsuccessful: ");
        stringBuilder.append(this.a.a());
        throw new gex(stringBuilder.toString(), this.a.c());
    }

    public final List<gdt> c() {
        StringBuilder stringBuilder = new StringBuilder("The result was unsuccessful: ");
        stringBuilder.append(this.a.a());
        throw new gex(stringBuilder.toString(), this.a.c());
    }

    public final void close() {
    }

    public final gej d() {
        return this;
    }

    public final gey e() {
        return this.a;
    }

    public final gff f() {
        gff gff = this.b;
        return gff == null ? new gff(gfc.UNKNOWN, false, 0, null, null, null, null, 254) : gff;
    }
}
