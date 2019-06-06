package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: bmj */
final class bmj {
    final a a;
    AudioTrack b;
    int c;
    int d;
    bmi e;
    int f;
    boolean g;
    long h;
    long i;
    boolean j;
    boolean k;
    long l;
    long m;
    long n;
    long o;
    long p;
    long q;
    long r;
    private final long[] s;
    private long t;
    private long u;
    private Method v;
    private long w;
    private int x;
    private int y;

    /* renamed from: bmj$a */
    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j, long j2, long j3, long j4);
    }

    public bmj(a aVar) {
        this.a = (a) byo.a((Object) aVar);
        if (bzo.a >= 18) {
            try {
                this.v = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.s = new long[10];
    }

    private long e() {
        return c(d());
    }

    public final int a(long j) {
        return this.d - ((int) (j - (d() * ((long) this.c))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARNING: Missing block: B:35:0x00b1, code skipped:
            if (r3 != false) goto L_0x00c9;
     */
    /* JADX WARNING: Missing block: B:37:0x00b5, code skipped:
            if (r3 == false) goto L_0x00c9;
     */
    public final long a(boolean r23) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r0.b;
        r1 = r1.getPlayState();
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = 3;
        r5 = 2;
        r7 = 1;
        if (r1 != r4) goto L_0x0183;
    L_0x000f:
        r15 = r22.e();
        r13 = 0;
        r1 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1));
        if (r1 == 0) goto L_0x0183;
    L_0x0019:
        r8 = java.lang.System.nanoTime();
        r11 = r8 / r2;
        r8 = r0.u;
        r8 = r11 - r8;
        r17 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1));
        if (r1 < 0) goto L_0x0059;
    L_0x0029:
        r1 = r0.s;
        r8 = r0.x;
        r9 = r15 - r11;
        r1[r8] = r9;
        r8 = r8 + r7;
        r1 = 10;
        r8 = r8 % r1;
        r0.x = r8;
        r8 = r0.y;
        if (r8 >= r1) goto L_0x003e;
    L_0x003b:
        r8 = r8 + r7;
        r0.y = r8;
    L_0x003e:
        r0.u = r11;
        r0.t = r13;
        r1 = 0;
    L_0x0043:
        r8 = r0.y;
        if (r1 >= r8) goto L_0x0059;
    L_0x0047:
        r9 = r0.t;
        r6 = r0.s;
        r18 = r6[r1];
        r13 = (long) r8;
        r18 = r18 / r13;
        r9 = r9 + r18;
        r0.t = r9;
        r1 = r1 + 1;
        r13 = 0;
        goto L_0x0043;
    L_0x0059:
        r1 = r0.g;
        if (r1 != 0) goto L_0x0183;
    L_0x005d:
        r1 = r0.e;
        r6 = r1.a;
        r18 = 500000; // 0x7a120 float:7.00649E-40 double:2.47033E-318;
        if (r6 == 0) goto L_0x00f2;
    L_0x0066:
        r8 = r1.e;
        r8 = r11 - r8;
        r2 = r1.d;
        r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r6 >= 0) goto L_0x0072;
    L_0x0070:
        goto L_0x00f2;
    L_0x0072:
        r1.e = r11;
        r2 = r1.a;
        r3 = r2.a;
        r6 = r2.b;
        r3 = r3.getTimestamp(r6);
        if (r3 == 0) goto L_0x009c;
    L_0x0080:
        r6 = r2.b;
        r8 = r6.framePosition;
        r13 = r2.d;
        r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x0092;
    L_0x008a:
        r13 = r2.c;
        r20 = 1;
        r13 = r13 + r20;
        r2.c = r13;
    L_0x0092:
        r2.d = r8;
        r13 = r2.c;
        r10 = 32;
        r13 = r13 << r10;
        r8 = r8 + r13;
        r2.e = r8;
    L_0x009c:
        r2 = r1.b;
        if (r2 == 0) goto L_0x00cd;
    L_0x00a0:
        if (r2 == r7) goto L_0x00b8;
    L_0x00a2:
        if (r2 == r5) goto L_0x00b4;
    L_0x00a4:
        if (r2 == r4) goto L_0x00b0;
    L_0x00a6:
        r6 = 4;
        if (r2 != r6) goto L_0x00aa;
    L_0x00a9:
        goto L_0x00f4;
    L_0x00aa:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x00b0:
        r6 = 4;
        if (r3 == 0) goto L_0x00f4;
    L_0x00b3:
        goto L_0x00c9;
    L_0x00b4:
        r6 = 4;
        if (r3 != 0) goto L_0x00f4;
    L_0x00b7:
        goto L_0x00c9;
    L_0x00b8:
        r6 = 4;
        if (r3 == 0) goto L_0x00c9;
    L_0x00bb:
        r2 = r1.a;
        r8 = r2.e;
        r13 = r1.f;
        r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1));
        if (r2 <= 0) goto L_0x00f4;
    L_0x00c5:
        r1.a(r5);
        goto L_0x00f4;
    L_0x00c9:
        r1.a();
        goto L_0x00f4;
    L_0x00cd:
        r6 = 4;
        if (r3 == 0) goto L_0x00e6;
    L_0x00d0:
        r2 = r1.a;
        r8 = r2.a();
        r13 = r1.c;
        r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1));
        if (r2 < 0) goto L_0x00f3;
    L_0x00dc:
        r2 = r1.a;
        r8 = r2.e;
        r1.f = r8;
        r1.a(r7);
        goto L_0x00f4;
    L_0x00e6:
        r8 = r1.c;
        r8 = r11 - r8;
        r2 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1));
        if (r2 <= 0) goto L_0x00f4;
    L_0x00ee:
        r1.a(r4);
        goto L_0x00f4;
    L_0x00f2:
        r6 = 4;
    L_0x00f3:
        r3 = 0;
    L_0x00f4:
        r1 = 5000000; // 0x4c4b40 float:7.006492E-39 double:2.470328E-317;
        if (r3 == 0) goto L_0x013e;
    L_0x00f9:
        r3 = r0.e;
        r3 = r3.b();
        r8 = r0.e;
        r9 = r8.c();
        r13 = r3 - r11;
        r13 = java.lang.Math.abs(r13);
        r8 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1));
        if (r8 <= 0) goto L_0x011d;
    L_0x010f:
        r8 = r0.a;
        r13 = r11;
        r11 = r3;
        r3 = r13;
        r8.b(r9, r11, r13, r15);
    L_0x0117:
        r8 = r0.e;
        r8.a(r6);
        goto L_0x013f;
    L_0x011d:
        r13 = r11;
        r11 = r0.c(r9);
        r11 = r11 - r15;
        r11 = java.lang.Math.abs(r11);
        r8 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1));
        if (r8 <= 0) goto L_0x0133;
    L_0x012b:
        r8 = r0.a;
        r11 = r3;
        r3 = r13;
        r8.a(r9, r11, r13, r15);
        goto L_0x0117;
    L_0x0133:
        r3 = r13;
        r8 = r0.e;
        r9 = r8.b;
        if (r9 != r6) goto L_0x013f;
    L_0x013a:
        r8.a();
        goto L_0x013f;
    L_0x013e:
        r3 = r11;
    L_0x013f:
        r6 = r0.k;
        if (r6 == 0) goto L_0x0183;
    L_0x0143:
        r6 = r0.v;
        if (r6 == 0) goto L_0x0183;
    L_0x0147:
        r8 = r0.w;
        r11 = r3 - r8;
        r8 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1));
        if (r8 < 0) goto L_0x0183;
    L_0x014f:
        r8 = 0;
        r9 = r0.b;	 Catch:{ Exception -> 0x017f }
        r6 = r6.invoke(r9, r8);	 Catch:{ Exception -> 0x017f }
        r6 = (java.lang.Integer) r6;	 Catch:{ Exception -> 0x017f }
        r6 = r6.intValue();	 Catch:{ Exception -> 0x017f }
        r9 = (long) r6;	 Catch:{ Exception -> 0x017f }
        r11 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r9 = r9 * r11;
        r11 = r0.h;	 Catch:{ Exception -> 0x017f }
        r9 = r9 - r11;
        r0.i = r9;	 Catch:{ Exception -> 0x017f }
        r9 = r0.i;	 Catch:{ Exception -> 0x017f }
        r11 = 0;
        r9 = java.lang.Math.max(r9, r11);	 Catch:{ Exception -> 0x017f }
        r0.i = r9;	 Catch:{ Exception -> 0x017f }
        r9 = r0.i;	 Catch:{ Exception -> 0x017f }
        r6 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1));
        if (r6 <= 0) goto L_0x0181;
    L_0x0175:
        r1 = r0.a;	 Catch:{ Exception -> 0x017f }
        r9 = r0.i;	 Catch:{ Exception -> 0x017f }
        r1.a(r9);	 Catch:{ Exception -> 0x017f }
        r0.i = r11;	 Catch:{ Exception -> 0x017f }
        goto L_0x0181;
    L_0x017f:
        r0.v = r8;
    L_0x0181:
        r0.w = r3;
    L_0x0183:
        r1 = java.lang.System.nanoTime();
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r1 / r3;
        r3 = r0.e;
        r4 = r3.b;
        if (r4 == r7) goto L_0x0197;
    L_0x0190:
        r3 = r3.b;
        if (r3 != r5) goto L_0x0195;
    L_0x0194:
        goto L_0x0197;
    L_0x0195:
        r3 = 0;
        goto L_0x0198;
    L_0x0197:
        r3 = 1;
    L_0x0198:
        if (r3 == 0) goto L_0x01bb;
    L_0x019a:
        r3 = r0.e;
        r3 = r3.c();
        r3 = r0.c(r3);
        r6 = r0.e;
        r6 = r6.b;
        if (r6 != r5) goto L_0x01ad;
    L_0x01aa:
        r17 = 1;
        goto L_0x01af;
    L_0x01ad:
        r17 = 0;
    L_0x01af:
        if (r17 != 0) goto L_0x01b2;
    L_0x01b1:
        return r3;
    L_0x01b2:
        r5 = r0.e;
        r5 = r5.b();
        r1 = r1 - r5;
        r3 = r3 + r1;
        return r3;
    L_0x01bb:
        r3 = r0.y;
        if (r3 != 0) goto L_0x01c4;
    L_0x01bf:
        r1 = r22.e();
        goto L_0x01c7;
    L_0x01c4:
        r3 = r0.t;
        r1 = r1 + r3;
    L_0x01c7:
        if (r23 != 0) goto L_0x01cc;
    L_0x01c9:
        r3 = r0.i;
        r1 = r1 - r3;
    L_0x01cc:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmj.a(boolean):long");
    }

    public final boolean a() {
        return this.b.getPlayState() == 3;
    }

    public final void b() {
        c();
        this.b = null;
        this.e = null;
    }

    public final boolean b(long j) {
        if (j <= d()) {
            Object obj = (this.g && this.b.getPlayState() == 2 && d() == 0) ? 1 : null;
            return obj != null;
        }
    }

    /* Access modifiers changed, original: final */
    public final long c(long j) {
        return (j * 1000000) / ((long) this.f);
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        this.t = 0;
        this.y = 0;
        this.x = 0;
        this.u = 0;
    }

    /* Access modifiers changed, original: final */
    public final long d() {
        if (this.o != -9223372036854775807L) {
            return Math.min(this.r, this.q + ((((SystemClock.elapsedRealtime() * 1000) - this.o) * ((long) this.f)) / 1000000));
        }
        int playState = this.b.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.b.getPlaybackHeadPosition());
        if (this.g) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.n = this.l;
            }
            playbackHeadPosition += this.n;
        }
        if (bzo.a <= 28) {
            if (playbackHeadPosition == 0 && this.l > 0 && playState == 3) {
                if (this.p == -9223372036854775807L) {
                    this.p = SystemClock.elapsedRealtime();
                }
                return this.l;
            }
            this.p = -9223372036854775807L;
        }
        if (this.l > playbackHeadPosition) {
            this.m++;
        }
        this.l = playbackHeadPosition;
        return playbackHeadPosition + (this.m << 32);
    }
}
