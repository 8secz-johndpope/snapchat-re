package defpackage;

import android.os.Handler;
import android.view.Surface;
import com.google.common.base.Preconditions;
import defpackage.adjk.b;
import defpackage.adls.a;
import defpackage.adlu.c;
import defpackage.adlu.d;

/* renamed from: adlx */
public final class adlx {
    final b a;
    public adlv b;
    public volatile a c;
    private adls d;
    private volatile boolean e;
    private String f;
    private final adlt g;
    private final kpc h;
    private adlr i;

    /* renamed from: adlx$a */
    public enum a {
        INVALID,
        CONFIG_ERROR,
        RUNNING,
        FAILED,
        SUCCESS
    }

    /* renamed from: adlx$b */
    public interface b {
        void a(adlu adlu);

        void a(Surface surface);

        void b(long j);

        void l();
    }

    /* renamed from: adlx$1 */
    class 1 implements a {
        1() {
        }

        public final void a() {
            adlx.this.a.a(new adlu.a(""));
        }

        public final void a(String str) {
            adni.c("%s ends with exception : %s", "videoRecording-VideoRecordingProxy", str);
            adlx.this.c = a.FAILED;
            adlx.this.a.a(new c(str));
        }
    }

    public adlx(Handler handler, String str, adjc adjc, adjc adjc2, adlt adlt, b bVar, kpc kpc) {
        this(handler, str, adjc, adjc2, false, true, null, 0, adlt, bVar, false, kpc);
    }

    public adlx(Handler handler, String str, adjc adjc, adjc adjc2, boolean z, boolean z2, adfh adfh, int i, adlt adlt, b bVar, boolean z3, kpc kpc) {
        this.e = false;
        this.c = a.INVALID;
        this.f = (String) Preconditions.checkNotNull(str);
        this.g = adlt;
        this.d = new adls(adjc, adjc2, adfh, handler, i, z3);
        adls adls = this.d;
        adls.m = z;
        adls.n = z2;
        this.a = bVar;
        this.h = kpc;
    }

    private void a(adkd adkd) {
        this.c = a.CONFIG_ERROR;
        this.d.c();
        throw adkd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0190 A:{ExcHandler: adjy (e adjy), Splitter:B:8:0x0023} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0189 A:{ExcHandler: adkd (e adkd), Splitter:B:8:0x0023} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:25:0x00bb, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:52:0x0185, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:53:0x0186, code skipped:
            r1 = r21;
     */
    /* JADX WARNING: Missing block: B:54:0x0189, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:55:0x018a, code skipped:
            r1 = r21;
     */
    /* JADX WARNING: Missing block: B:56:0x018c, code skipped:
            r1.a(r0);
     */
    /* JADX WARNING: Missing block: B:57:0x018f, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:58:0x0190, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:60:0x0195, code skipped:
            if (r0.a() != false) goto L_0x0197;
     */
    /* JADX WARNING: Missing block: B:61:0x0197, code skipped:
            r1.h.a(defpackage.koj.RECORDING, defpackage.adfa.a.callsite("videoRecording-VideoRecordingProxy"));
     */
    /* JADX WARNING: Missing block: B:62:0x01a6, code skipped:
            r1.a(r0);
     */
    /* JADX WARNING: Missing block: B:63:0x01a9, code skipped:
            return;
     */
    public final void a() {
        /*
        r21 = this;
        r1 = r21;
        r0 = r1.e;
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r1.c;
        r2 = defpackage.adlx.a.INVALID;
        r3 = 1;
        r4 = 0;
        if (r0 != r2) goto L_0x0011;
    L_0x000f:
        r0 = 1;
        goto L_0x0012;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        r2 = "Cannot prepare. Already prepared.";
        com.google.common.base.Preconditions.checkState(r0, r2);
        r0 = r1.d;
        r2 = r1.f;
        r2 = com.google.common.base.Preconditions.checkNotNull(r2);
        r2 = (java.lang.String) r2;
        r0.f = r2;
        r0 = r1.d;	 Catch:{ adjy -> 0x0190, adkd -> 0x0189 }
        r2 = r0.f;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        com.google.common.base.Preconditions.checkNotNull(r2);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r6 = new defpackage.admp.a[r3];	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r2 = new admp$a;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r5 = r0.f;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r7 = -1;
        r2.<init>(r5, r7);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r6[r4] = r2;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r16 = java.lang.System.currentTimeMillis();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r2 = new adjj;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r7 = 1;
        r5 = r0.a();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        if (r5 == 0) goto L_0x0046;
    L_0x0044:
        r8 = 1;
        goto L_0x0047;
    L_0x0046:
        r8 = 0;
    L_0x0047:
        r9 = r0.e;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r10 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r5 = r2;
        r5.<init>(r6, r7, r8, r9, r10, r12, r13, r14, r15);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r5 = "MediaRecorder";
        r2.a(r5);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r15 = new adlw;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r7 = r0.b;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r8 = r0.m;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r15.<init>(r2, r7, r8);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r18 = java.lang.System.currentTimeMillis();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r7 = r0.a();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r8 = 0;
        if (r7 == 0) goto L_0x00be;
    L_0x0070:
        r20 = new adff;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r9 = r0.c;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r10 = 0;
        r11 = r0.r;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r12 = 500000; // 0x7a120 float:7.00649E-40 double:2.47033E-318;
        r14 = 0;
        r7 = r20;
        r8 = r2;
        r7.<init>(r8, r9, r10, r11, r12, r14);	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r9 = r0.c;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r9 = r9.a;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r9 = r9.value;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r10 = "audio/amr-wb";
        r9 = android.text.TextUtils.equals(r9, r10);	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        if (r9 == 0) goto L_0x00a5;
    L_0x0093:
        r9 = new adfo;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r10 = r0.c;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r10 = r10.b;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r11 = "sample-rate";
        r10 = r10.getInteger(r11);	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r11 = r0.d;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r9.<init>(r10, r11);	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        goto L_0x00af;
    L_0x00a5:
        r9 = new adfo;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r10 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        r11 = r0.d;	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r9.<init>(r10, r11);	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
    L_0x00af:
        r0.b();	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r10 = java.lang.System.currentTimeMillis();	 Catch:{ adjy -> 0x0190, adkd -> 0x00bb }
        r12 = r9;
        r9 = r10;
        r11 = r20;
        goto L_0x00c5;
    L_0x00bb:
        r0 = move-exception;
        goto L_0x018c;
    L_0x00be:
        r9 = java.lang.System.currentTimeMillis();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r11 = r8;
        r12 = r11;
        r7 = r9;
    L_0x00c5:
        r13 = r5 - r16;
        r5 = r18 - r5;
        r3 = r7 - r18;
        r9 = r9 - r7;
        r7 = new java.lang.StringBuilder;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r7.<init>();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r8 = r0.l;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r7.append(r8);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r8 = "mixer_init_delay: %d, venc_init_delay: %d, aenc_init_delay: %d, arec_init_delay %d, noise_suppressor_enabled: %b";
        r1 = 5;
        r1 = new java.lang.Object[r1];	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r18 = java.lang.Long.valueOf(r13);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r17 = 0;
        r1[r17] = r18;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r17 = java.lang.Long.valueOf(r5);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r16 = 1;
        r1[r16] = r17;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r16 = 2;
        r17 = java.lang.Long.valueOf(r3);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1[r16] = r17;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r16 = 3;
        r17 = java.lang.Long.valueOf(r9);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1[r16] = r17;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r16 = 4;
        r17 = r12;
        r12 = r0.o;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r12 = java.lang.Boolean.valueOf(r12);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1[r16] = r12;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = java.lang.String.format(r8, r1);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r7.append(r1);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = r7.toString();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r0.l = r1;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = r0.w;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1.a = r13;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = r0.w;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1.b = r5;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = r0.w;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1.c = r3;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = r0.w;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1.d = r9;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = r0.w;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r3 = r0.o;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1.e = r3;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r0.h = r2;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r0.i = r15;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = r0.i;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = r1.a;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r0.g = r1;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        if (r11 == 0) goto L_0x0149;
    L_0x0136:
        r0.j = r11;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r8 = r17;
        r0.k = r8;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = r0.k;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r2 = r0.j;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r3 = r2.a;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        if (r3 == 0) goto L_0x0146;
    L_0x0144:
        r2 = r2.a;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
    L_0x0146:
        r1.b = r2;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        goto L_0x014f;
    L_0x0149:
        r1 = r0.a();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        if (r1 != 0) goto L_0x017d;
    L_0x014f:
        r1 = r0.t;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        if (r1 != 0) goto L_0x015a;
    L_0x0153:
        r1 = new adls$1;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1.<init>();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r0.t = r1;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
    L_0x015a:
        r1 = r0.u;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        if (r1 != 0) goto L_0x016b;
    L_0x015e:
        r1 = r0.a();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        if (r1 == 0) goto L_0x016b;
    L_0x0164:
        r1 = new adls$2;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1.<init>();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r0.u = r1;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
    L_0x016b:
        r1 = r0.v;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        if (r1 != 0) goto L_0x017c;
    L_0x016f:
        r1 = r0.a();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        if (r1 == 0) goto L_0x017c;
    L_0x0175:
        r1 = new adls$3;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1.<init>();	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r0.v = r1;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
    L_0x017c:
        return;
    L_0x017d:
        r0 = new adkd;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        r1 = "The AudioEncoder or AudioRecorder can not be null, when the recorder should record audio";
        r0.<init>(r1);	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
        throw r0;	 Catch:{ adjy -> 0x0185, adkd -> 0x0189 }
    L_0x0185:
        r0 = move-exception;
        r1 = r21;
        goto L_0x0191;
    L_0x0189:
        r0 = move-exception;
        r1 = r21;
    L_0x018c:
        r1.a(r0);
        return;
    L_0x0190:
        r0 = move-exception;
    L_0x0191:
        r2 = r0.a();
        if (r2 == 0) goto L_0x01a6;
    L_0x0197:
        r2 = r1.h;
        r3 = defpackage.koj.RECORDING;
        r4 = defpackage.adfa.a;
        r5 = "videoRecording-VideoRecordingProxy";
        r4 = r4.callsite(r5);
        r2.a(r3, r4);
    L_0x01a6:
        r1.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlx.a():void");
    }

    public final void b() {
        if (!this.e) {
            Preconditions.checkNotNull(this.d);
            this.a.a(this.d.g);
            adls adls = this.d;
            1 1 = new 1();
            adls.z = this.g;
            Preconditions.checkState(adls.p ^ 1, "Cannot start. Already started.");
            adls.p = true;
            Preconditions.checkNotNull(adls.t);
            adls.y = 1;
            if (adls.v != null) {
                adls.a.execute(adls.v);
            }
            adls.a.execute(adls.t);
            if (adls.u != null) {
                adls.a.execute(adls.u);
            }
            this.c = a.RUNNING;
            this.a.l();
        }
    }

    public final void c() {
        if (!this.e) {
            this.e = true;
            adjk d = this.d.d();
            if (d instanceof adjk.c) {
                this.a.b(this.d.s / 1000);
            } else if (d instanceof adjk.a) {
                this.a.a(new d(d.a));
            } else if (d instanceof b) {
                this.a.a(new adlu.b(d.a));
            } else {
                throw new IllegalStateException("unexpected error".concat(String.valueOf(d)));
            }
        }
    }

    public final void d() {
        this.d.q = true;
    }

    public final void e() {
        adls adls = this.d;
        if (adls != null) {
            adls.c();
            this.b = this.d.w;
            this.i = this.d.x;
            this.d = null;
        }
    }

    public final void f() {
        adni.c("Signal first frame available, status: %s, mAborted: %b", this.c.name(), Boolean.valueOf(this.e));
        if (this.c != a.FAILED && this.c != a.SUCCESS && !this.e) {
            if (this.c == a.RUNNING) {
                adls adls = this.d;
                if (adls != null) {
                    if (adls.k != null) {
                        adls.k.c();
                    }
                    return;
                }
            }
            throw new adkc("signal first frame before the task runs");
        }
    }
}
