package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import defpackage.bsm.b;
import defpackage.bxr.a;
import defpackage.bxr.c;
import defpackage.bxr.d;
import java.util.Arrays;

/* renamed from: bse */
final class bse implements bnm, bsi, b, a<a>, d {
    private final bxe A;
    private final bwy B;
    private final b C;
    private final Runnable D;
    private int[] E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private long J;
    private boolean K;
    private int L;
    final int a;
    final bsk.a b;
    final c c;
    final String d;
    final long e;
    final bxr f = new bxr("Loader:ExtractorMediaPeriod");
    final byt g;
    final Runnable h;
    final Handler i;
    bsi.a j;
    bns k;
    bsm[] l;
    boolean m;
    boolean n;
    int o;
    bss p;
    long q;
    boolean[] r;
    boolean[] s;
    boolean[] t;
    boolean u;
    long v;
    long w;
    boolean x;
    boolean y;
    private final Uri z;

    /* renamed from: bse$c */
    interface c {
        void a(long j, boolean z);
    }

    /* renamed from: bse$a */
    final class a implements c {
        long a;
        bxh b;
        long c = -1;
        long d;
        private final Uri e;
        private final bxe f;
        private final b g;
        private final byt h;
        private final bnr i = new bnr();
        private volatile boolean j;
        private boolean k = true;

        public a(Uri uri, bxe bxe, b bVar, byt byt) {
            this.e = (Uri) byo.a((Object) uri);
            this.f = (bxe) byo.a((Object) bxe);
            this.g = (b) byo.a((Object) bVar);
            this.h = byt;
        }

        public final void a() {
            this.j = true;
        }

        public final void a(long j, long j2) {
            this.i.a = j;
            this.a = j2;
            this.k = true;
        }

        public final void b() {
            Throwable th;
            bnl bnl;
            int i = 0;
            while (i == 0 && !this.j) {
                try {
                    long j = this.i.a;
                    this.b = new bxh(this.e, j, -1, bse.this.d);
                    this.c = this.f.open(this.b);
                    if (this.c != -1) {
                        this.c += j;
                    }
                    bnl bnh = new bnh(this.f, j, this.c);
                    try {
                        bnk a = this.g.a(bnh, this.f.getUri());
                        if (this.k) {
                            a.a(j, this.a);
                            this.k = false;
                        }
                        while (i == 0 && !this.j) {
                            this.h.c();
                            i = a.a(bnh, this.i);
                            if (bnh.c() > bse.this.e + j) {
                                j = bnh.c();
                                this.h.b();
                                bse.this.i.post(bse.this.h);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.i.a = bnh.c();
                            this.d = this.i.a - this.b.c;
                        }
                        bzo.a(this.f);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!(i == 1 || bnl == null)) {
                            this.i.a = bnl.c();
                            this.d = this.i.a - this.b.c;
                        }
                        bzo.a(this.f);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bnl = null;
                    this.i.a = bnl.c();
                    this.d = this.i.a - this.b.c;
                    bzo.a(this.f);
                    throw th;
                }
            }
        }
    }

    /* renamed from: bse$d */
    final class d implements bsn {
        final int a;

        public d(int i) {
            this.a = i;
        }

        public final int a(blh blh, bmy bmy, boolean z) {
            bse bse = bse.this;
            int i = this.a;
            if (bse.g()) {
                return -3;
            }
            int a = bse.l[i].a(blh, bmy, z, bse.x, bse.w);
            if (a == -4) {
                bse.a(i);
            } else if (a == -3) {
                bse.b(i);
            }
            return a;
        }

        public final boolean a() {
            bse bse = bse.this;
            return !bse.g() && (bse.x || bse.l[this.a].a.c());
        }

        public final int a_(long j) {
            bse bse = bse.this;
            int i = this.a;
            int i2 = 0;
            if (bse.g()) {
                return 0;
            }
            bsm bsm = bse.l[i];
            if (!bse.x || j <= bsm.a.e()) {
                int a = bsm.a(j, true);
                if (a != -1) {
                    i2 = a;
                }
            } else {
                i2 = bsm.a.h();
            }
            if (i2 > 0) {
                bse.a(i);
            } else {
                bse.b(i);
            }
            return i2;
        }

        public final void b() {
        }
    }

    /* renamed from: bse$b */
    static final class b {
        bnk a;
        private final bnk[] b;
        private final bnm c;

        public b(bnk[] bnkArr, bnm bnm) {
            this.b = bnkArr;
            this.c = bnm;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x004f in {2, 10, 13, 14, 15, 19, 21} preds:[]
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
        public final defpackage.bnk a(defpackage.bnl r6, android.net.Uri r7) {
            /*
            r5 = this;
            r0 = r5.a;
            if (r0 == 0) goto L_0x0005;
            return r0;
            r0 = r5.b;
            r1 = r0.length;
            r2 = 0;
            if (r2 >= r1) goto L_0x0024;
            r3 = r0[r2];
            r4 = r3.a(r6);	 Catch:{ EOFException -> 0x001e, all -> 0x0019 }
            if (r4 == 0) goto L_0x001e;	 Catch:{ EOFException -> 0x001e, all -> 0x0019 }
            r5.a = r3;	 Catch:{ EOFException -> 0x001e, all -> 0x0019 }
            r6.a();
            goto L_0x0024;
            r7 = move-exception;
            r6.a();
            throw r7;
            r6.a();
            r2 = r2 + 1;
            goto L_0x0009;
            r6 = r5.a;
            if (r6 == 0) goto L_0x0030;
            r7 = r5.c;
            r6.a(r7);
            r6 = r5.a;
            return r6;
            r6 = new bst;
            r0 = new java.lang.StringBuilder;
            r1 = "None of the available extractors (";
            r0.<init>(r1);
            r1 = r5.b;
            r1 = defpackage.bzo.a(r1);
            r0.append(r1);
            r1 = ") could read the stream.";
            r0.append(r1);
            r0 = r0.toString();
            r6.<init>(r0, r7);
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bse$b.a(bnl, android.net.Uri):bnk");
        }
    }

    /* renamed from: bse$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            bse bse = bse.this;
            if (!bse.y && !bse.n && bse.k != null && bse.m) {
                bsm[] bsmArr = bse.l;
                int length = bsmArr.length;
                int i = 0;
                while (i < length) {
                    if (bsmArr[i].a.d() != null) {
                        i++;
                    } else {
                        return;
                    }
                }
                bse.g.b();
                int length2 = bse.l.length;
                bsr[] bsrArr = new bsr[length2];
                bse.s = new boolean[length2];
                bse.r = new boolean[length2];
                bse.t = new boolean[length2];
                bse.q = bse.k.b();
                i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= length2) {
                        break;
                    }
                    bsrArr[i] = new bsr(bse.l[i].a.d());
                    String str = r6.f;
                    if (!(byz.b(str) || byz.a(str))) {
                        z = false;
                    }
                    bse.s[i] = z;
                    bse.u = z | bse.u;
                    i++;
                }
                bse.p = new bss(bsrArr);
                if (bse.a == -1 && bse.v == -1 && bse.k.b() == -9223372036854775807L) {
                    bse.o = 6;
                }
                bse.n = true;
                bse.c.a(bse.q, bse.k.k_());
                bse.j.a(bse);
            }
        }
    }

    /* renamed from: bse$2 */
    class 2 implements Runnable {
        2() {
        }

        public final void run() {
            if (!bse.this.y) {
                bse.this.j.a(bse.this);
            }
        }
    }

    public bse(Uri uri, bxe bxe, bnk[] bnkArr, int i, bsk.a aVar, c cVar, bwy bwy, String str, int i2) {
        this.z = uri;
        this.A = bxe;
        this.a = i;
        this.b = aVar;
        this.c = cVar;
        this.B = bwy;
        this.d = str;
        this.e = (long) i2;
        this.C = new b(bnkArr, this);
        this.g = new byt();
        this.D = new 1();
        this.h = new 2();
        this.i = new Handler();
        this.E = new int[0];
        this.l = new bsm[0];
        this.J = -9223372036854775807L;
        this.v = -1;
        this.q = -9223372036854775807L;
        if (i == -1) {
            i = 3;
        }
        this.o = i;
        aVar.a();
    }

    private void a(a aVar) {
        if (this.v == -1) {
            this.v = aVar.c;
        }
    }

    private boolean d(long j) {
        int length = this.l.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            bsm bsm = this.l[i];
            bsm.a();
            if (bsm.a(j, false) == -1) {
                z = false;
            }
            if (z || (!this.s[i] && this.u)) {
                i++;
            }
        }
        return false;
    }

    private void i() {
        a aVar = new a(this.z, this.A, this.C, this.g);
        if (this.n) {
            byo.b(l());
            long j = this.q;
            if (j == -9223372036854775807L || this.J < j) {
                aVar.a(this.k.b(this.J).a.c, this.J);
                this.J = -9223372036854775807L;
            } else {
                this.x = true;
                this.J = -9223372036854775807L;
                return;
            }
        }
        this.L = j();
        long a = this.f.a(aVar, this, this.o);
        this.b.a(aVar.b, 1, -1, null, 0, null, aVar.a, this.q, a);
    }

    private int j() {
        int i = 0;
        for (bsm bsm : this.l) {
            i += bsm.a.a();
        }
        return i;
    }

    private long k() {
        long j = Long.MIN_VALUE;
        for (bsm bsm : this.l) {
            j = Math.max(j, bsm.a.e());
        }
        return j;
    }

    private boolean l() {
        return this.J != -9223372036854775807L;
    }

    public final long a(long j, blw blw) {
        if (!this.k.k_()) {
            return 0;
        }
        bns.a b = this.k.b(j);
        return bzo.a(j, blw, b.a.b, b.b.b);
    }

    public final long a(bwt[] bwtArr, boolean[] zArr, bsn[] bsnArr, boolean[] zArr2, long j) {
        byo.b(this.n);
        int i = this.I;
        int i2 = 0;
        int i3 = 0;
        while (i3 < bwtArr.length) {
            if (bsnArr[i3] != null && (bwtArr[i3] == null || !zArr[i3])) {
                int i4 = ((d) bsnArr[i3]).a;
                byo.b(this.r[i4]);
                this.I--;
                this.r[i4] = false;
                bsnArr[i3] = null;
            }
            i3++;
        }
        Object obj = (this.F ? i != 0 : j == 0) ? null : 1;
        Object obj2 = obj;
        int i5 = 0;
        while (i5 < bwtArr.length) {
            if (bsnArr[i5] == null && bwtArr[i5] != null) {
                bwt bwt = bwtArr[i5];
                byo.b(bwt.e() == 1);
                byo.b(bwt.b(0) == 0);
                i3 = this.p.a(bwt.d());
                byo.b(this.r[i3] ^ 1);
                this.I++;
                this.r[i3] = true;
                bsnArr[i5] = new d(i3);
                zArr2[i5] = true;
                if (obj2 == null) {
                    bsm bsm = this.l[i3];
                    bsm.a();
                    obj2 = (bsm.a(j, true) != -1 || bsm.a.b() == 0) ? null : 1;
                }
            }
            i5++;
        }
        if (this.I == 0) {
            this.K = false;
            this.G = false;
            if (this.f.a()) {
                bsm[] bsmArr = this.l;
                i5 = bsmArr.length;
                while (i2 < i5) {
                    bsmArr[i2].b();
                    i2++;
                }
                this.f.b();
            } else {
                for (bsm a : this.l) {
                    a.a(false);
                }
            }
        } else if (obj2 != null) {
            j = b(j);
            while (i2 < bsnArr.length) {
                if (bsnArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.F = true;
        return j;
    }

    public final bnu a(int i, int i2) {
        i2 = this.l.length;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.E[i3] == i) {
                return this.l[i3];
            }
        }
        bsm bsm = new bsm(this.B);
        bsm.c = this;
        int i4 = i2 + 1;
        this.E = Arrays.copyOf(this.E, i4);
        this.E[i2] = i;
        this.l = (bsm[]) Arrays.copyOf(this.l, i4);
        this.l[i2] = bsm;
        return bsm;
    }

    public final void a() {
        this.m = true;
        this.i.post(this.D);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (!this.t[i]) {
            blg blg = this.p.c[i].b[0];
            this.b.a(byz.g(blg.f), blg, 0, null, this.w);
            this.t[i] = true;
        }
    }

    public final void a(long j) {
    }

    public final void a(long j, boolean z) {
        int length = this.l.length;
        for (int i = 0; i < length; i++) {
            this.l[i].a(j, z, this.r[i]);
        }
    }

    public final void a(bns bns) {
        this.k = bns;
        this.i.post(this.D);
    }

    public final void a(bsi.a aVar, long j) {
        this.j = aVar;
        this.g.a();
        i();
    }

    public final /* synthetic */ void a(c cVar, long j, long j2) {
        a aVar = (a) cVar;
        if (this.q == -9223372036854775807L) {
            long k = k();
            this.q = k == Long.MIN_VALUE ? 0 : k + TelemetryConstants.FLUSH_DELAY_MS;
            this.c.a(this.q, this.k.k_());
        }
        this.b.a(aVar.b, 1, -1, null, 0, null, aVar.a, this.q, j, j2, aVar.d);
        a(aVar);
        this.x = true;
        this.j.a(this);
    }

    public final long b(long j) {
        if (!this.k.k_()) {
            j = 0;
        }
        this.w = j;
        this.G = false;
        if (!l() && d(j)) {
            return j;
        }
        this.K = false;
        this.J = j;
        this.x = false;
        if (this.f.a()) {
            this.f.b();
        } else {
            for (bsm a : this.l) {
                a.a(false);
            }
        }
        return j;
    }

    public final bss b() {
        return this.p;
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        if (this.K && this.s[i] && !this.l[i].a.c()) {
            this.J = 0;
            this.K = false;
            this.G = true;
            this.w = 0;
            this.L = 0;
            for (bsm a : this.l) {
                a.a(false);
            }
            this.j.a(this);
        }
    }

    public final long c() {
        if (!this.H) {
            this.b.c();
            this.H = true;
        }
        if (!this.G || (!this.x && j() <= this.L)) {
            return -9223372036854775807L;
        }
        this.G = false;
        return this.w;
    }

    public final boolean c(long j) {
        if (this.x || this.K || (this.n && this.I == 0)) {
            return false;
        }
        boolean a = this.g.a();
        if (!this.f.a()) {
            i();
            a = true;
        }
        return a;
    }

    public final long d() {
        if (this.x) {
            return Long.MIN_VALUE;
        }
        if (l()) {
            return this.J;
        }
        long j;
        if (this.u) {
            j = Long.MAX_VALUE;
            int length = this.l.length;
            for (int i = 0; i < length; i++) {
                if (this.s[i]) {
                    j = Math.min(j, this.l[i].a.e());
                }
            }
        } else {
            j = k();
        }
        return j == Long.MIN_VALUE ? this.w : j;
    }

    public final long e() {
        return this.I == 0 ? Long.MIN_VALUE : d();
    }

    public final void f() {
        for (bsm a : this.l) {
            a.a(false);
        }
        b bVar = this.C;
        if (bVar.a != null) {
            bVar.a = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean g() {
        return this.G || l();
    }

    public final void h() {
        this.i.post(this.D);
    }

    public final void l_() {
    }
}
