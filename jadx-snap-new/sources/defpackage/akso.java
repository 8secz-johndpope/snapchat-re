package defpackage;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.core.db.DbConstantsKt;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.aksm.a;
import java.util.Locale;
import org.opencv.imgproc.Imgproc;

/* renamed from: akso */
abstract class akso extends aksm {
    private static final akqz A = new aktp(akra.q, s, o);
    private static final akqz B = new aktp(akra.n, s, n);
    private static final akqz C = new aktw(A, akra.p);
    private static final akqz D = new aktw(B, akra.o);
    private static final akqz E = new a();
    static final akrf n = new aktr(akrg.h, 43200000);
    static final akrf o = new aktr(akrg.g, 86400000);
    private static final akrf p = aktn.a;
    private static final akrf q = new aktr(akrg.k, 1000);
    private static final akrf r = new aktr(akrg.j, 60000);
    private static final akrf s = new aktr(akrg.i, 3600000);
    private static final akrf t = new aktr(akrg.f, 604800000);
    private static final akqz u = new aktp(akra.w, p, q);
    private static final akqz v = new aktp(akra.v, p, o);
    private static final akqz w = new aktp(akra.u, q, r);
    private static final akqz x = new aktp(akra.t, q, o);
    private static final akqz y = new aktp(akra.s, r, s);
    private static final akqz z = new aktp(akra.r, r, o);
    private final transient b[] F = new b[Imgproc.INTER_TAB_SIZE2];
    private final int G;

    /* renamed from: akso$a */
    static class a extends aktp {
        a() {
            super(akra.m, akso.n, akso.o);
        }

        public final int a(Locale locale) {
            return aksy.a(locale).m;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0020 in {6, 8} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final long a(long r3, java.lang.String r5, java.util.Locale r6) {
            /*
            r2 = this;
            r6 = defpackage.aksy.a(r6);
            r6 = r6.f;
            r0 = r6.length;
            r0 = r0 + -1;
            if (r0 < 0) goto L_0x0018;
            r1 = r6[r0];
            r1 = r1.equalsIgnoreCase(r5);
            if (r1 == 0) goto L_0x0007;
            r3 = r2.b(r3, r0);
            return r3;
            r3 = new akri;
            r4 = defpackage.akra.m;
            r3.<init>(r4, r5);
            throw r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akso$a.a(long, java.lang.String, java.util.Locale):long");
        }

        public final String a(int i, Locale locale) {
            return aksy.a(locale).f[i];
        }
    }

    /* renamed from: akso$b */
    static class b {
        public final int a;
        public final long b;

        b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    akso(akqx akqx, Object obj, int i) {
        super(akqx, null);
        if (i <= 0 || i > 7) {
            throw new IllegalArgumentException("Invalid min days in first week: ".concat(String.valueOf(i)));
        } else {
            this.G = i;
        }
    }

    private long b(int i, int i2, int i3) {
        aktl.a(akra.e, i, -292275055, 292278994);
        aktl.a(akra.g, i2, 1, 12);
        aktl.a(akra.h, i3, 1, b(i, i2));
        long a = a(i, i2, i3);
        return (a >= 0 || i != 292278994) ? (a <= 0 || i != -292275055) ? a : Long.MIN_VALUE : Long.MAX_VALUE;
    }

    private long b(int i, int i2, int i3, int i4) {
        long b = b(i, i2, i3);
        if (b == Long.MIN_VALUE) {
            b = b(i, i2, i3 + 1);
            i4 -= 86400000;
        }
        long j = ((long) i4) + b;
        return (j >= 0 || b <= 0) ? (j <= 0 || b >= 0) ? j : Long.MIN_VALUE : Long.MAX_VALUE;
    }

    static int d(long j) {
        if (j >= 0) {
            j /= 86400000;
        } else {
            j = (j - 86399999) / 86400000;
            if (j < -3) {
                return ((int) ((j + 4) % 7)) + 7;
            }
        }
        return ((int) ((j + 3) % 7)) + 1;
    }

    static int e(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    private int e(long j, int i) {
        long e = e(i);
        return j < e ? a(i - 1) : j >= e(i + 1) ? 1 : ((int) ((j - e) / 604800000)) + 1;
    }

    private long e(int i) {
        long b = b(i);
        i = akso.d(b);
        return i > 8 - this.G ? b + (((long) (8 - i)) * 86400000) : b - (((long) (i - 1)) * 86400000);
    }

    private b f(int i) {
        int i2 = i & 1023;
        b bVar = this.F[i2];
        if (bVar != null && bVar.a == i) {
            return bVar;
        }
        bVar = new b(i, d(i));
        this.F[i2] = bVar;
        return bVar;
    }

    /* Access modifiers changed, original: final */
    public final int a(int i) {
        return (int) ((e(i + 1) - e(i)) / 604800000);
    }

    /* Access modifiers changed, original: final */
    public final int a(long j) {
        long j2 = (j >> 1) + 31083597720000L;
        if (j2 < 0) {
            j2 = (j2 - 15778476000L) + 1;
        }
        int i = (int) (j2 / 15778476000L);
        long b = b(i);
        long j3 = j - b;
        if (j3 < 0) {
            return i - 1;
        }
        long j4 = 31536000000L;
        if (j3 < 31536000000L) {
            return i;
        }
        if (c(i)) {
            j4 = 31622400000L;
        }
        return b + j4 <= j ? i + 1 : i;
    }

    public abstract int a(long j, int i);

    /* Access modifiers changed, original: final */
    public final int a(long j, int i, int i2) {
        return ((int) ((j - (b(i) + c(i, i2))) / 86400000)) + 1;
    }

    /* Access modifiers changed, original: final */
    public final long a(int i, int i2) {
        return b(i) + c(i, i2);
    }

    /* Access modifiers changed, original: final */
    public final long a(int i, int i2, int i3) {
        return (b(i) + c(i, i2)) + (((long) (i3 - 1)) * 86400000);
    }

    public final long a(int i, int i2, int i3, int i4) {
        akqx akqx = this.a;
        if (akqx != null) {
            return akqx.a(i, i2, i3, i4);
        }
        aktl.a(akra.v, i4, 0, 86399999);
        return b(i, i2, i3, i4);
    }

    public final long a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        akqx akqx = this.a;
        if (akqx != null) {
            return akqx.a(i, i2, i3, i4, i5, i6, i7);
        }
        aktl.a(akra.q, i4, 0, 23);
        aktl.a(akra.s, i5, 0, 59);
        aktl.a(akra.u, i6, 0, 59);
        aktl.a(akra.w, i7, 0, (int) DbConstantsKt.MAX_QUERY_VARIABLE_COUNT);
        return b(i, i2, i3, (int) ((long) ((((i4 * TelemetryConstants.ONE_HOUR_IN_MS) + (i5 * 60000)) + (i6 * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL)) + i7)));
    }

    public abstract long a(long j, long j2);

    public final akrc a() {
        akqx akqx = this.a;
        return akqx != null ? akqx.a() : akrc.a;
    }

    /* Access modifiers changed, original: protected */
    public void a(a aVar) {
        aVar.a = p;
        aVar.b = q;
        aVar.c = r;
        aVar.d = s;
        aVar.e = n;
        aVar.f = o;
        aVar.g = t;
        aVar.m = u;
        aVar.n = v;
        aVar.o = w;
        aVar.p = x;
        aVar.q = y;
        aVar.r = z;
        aVar.s = A;
        aVar.u = B;
        aVar.t = C;
        aVar.v = D;
        aVar.w = E;
        aVar.E = new aksv(this);
        aVar.F = new akta(aVar.E, this);
        aVar.H = new aktk(new akto(aVar.F), akra.c);
        aVar.k = aVar.H.d();
        aVar.G = new akto(new akts((aktk) aVar.H), akra.d);
        aVar.I = new aksx(this);
        aVar.x = new aksw(this, aVar.f);
        aVar.y = new aksp(this, aVar.f);
        aVar.z = new aksq(this, aVar.f);
        aVar.D = new aksz(this);
        aVar.B = new aksu(this);
        aVar.A = new akst(this, aVar.g);
        aVar.C = new akto(new akts(aVar.B, aVar.k, akra.i), akra.i);
        aVar.j = aVar.E.d();
        aVar.i = aVar.D.d();
        aVar.h = aVar.B.d();
    }

    public abstract int b(int i, int i2);

    /* Access modifiers changed, original: final */
    public final int b(long j) {
        int a = a(j);
        int e = e(j, a);
        if (e == 1) {
            j += 604800000;
        } else if (e <= 51) {
            return a;
        } else {
            j -= 1209600000;
        }
        return a(j);
    }

    /* Access modifiers changed, original: final */
    public final int b(long j, int i) {
        return ((int) ((j - b(i)) / 86400000)) + 1;
    }

    /* Access modifiers changed, original: final */
    public final long b(int i) {
        return f(i).b;
    }

    /* Access modifiers changed, original: final */
    public final int c(long j) {
        return e(j, a(j));
    }

    /* Access modifiers changed, original: 0000 */
    public int c(long j, int i) {
        return f(j);
    }

    public abstract long c(int i, int i2);

    public abstract boolean c(int i);

    public abstract long d(int i);

    public abstract long d(long j, int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            akso akso = (akso) obj;
            return this.G == akso.G && a().equals(akso.a());
        }
    }

    /* Access modifiers changed, original: final */
    public final int f(long j) {
        int a = a(j);
        return b(a, a(j, a));
    }

    /* Access modifiers changed, original: 0000 */
    public boolean g(long j) {
        return false;
    }

    public int hashCode() {
        return ((getClass().getName().hashCode() * 11) + a().hashCode()) + this.G;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        stringBuilder.append(name);
        stringBuilder.append('[');
        akrc a = a();
        if (a != null) {
            stringBuilder.append(a.b);
        }
        if (this.G != 4) {
            stringBuilder.append(",mdfw=");
            stringBuilder.append(this.G);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
