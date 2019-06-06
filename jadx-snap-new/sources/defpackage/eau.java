package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.common.base.Supplier;
import defpackage.dqw.c;
import defpackage.dqz.j;
import defpackage.eaw.d;
import defpackage.eaw.f;
import defpackage.eaw.g;
import defpackage.eaw.h;
import defpackage.eaw.i;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: eau */
public final class eau implements dnx {
    final dpf a;
    doy b;
    dqw c = null;
    final dny d;
    volatile eaw e = f.a;
    private final ebc f;
    private final dqm g;
    private final Supplier<Handler> h;
    private final dnt i;
    private final ifs j;
    private final Supplier<eca> k;
    private final Supplier<Boolean> l;
    private boolean m = false;
    private final eav n;
    private dou o;
    private a p = null;
    private adfh q;
    private dqr r;
    private final ajwy<dqy> s;
    private final eaq t;
    private File u;
    private boolean v = false;
    private boolean w = false;
    private int x;
    private int y;

    /* renamed from: eau$a */
    class a implements c {
        private WeakReference<dqx> a;

        a(dqx dqx) {
            a(dqx);
        }

        public final void a(long j, long j2) {
            abtl c = eau.this.c.c();
            File g = eau.this.c.g();
            int h = eau.this.c.h();
            boolean i = eau.this.c.i();
            eau.this.b.d();
            WeakReference weakReference = this.a;
            if (weakReference != null) {
                eau.a(eau.this, (dqx) weakReference.get(), Uri.fromFile(g), h, i, c, j2, j);
                return;
            }
            eau.this.a(null, new j("Null callback weakref"));
        }

        public final void a(dqx dqx) {
            this.a = new WeakReference(dqx);
        }

        public final void a(dqz dqz) {
            eau eau = eau.this;
            WeakReference weakReference = this.a;
            eau.c(weakReference != null ? (dqx) weakReference.get() : null);
            WeakReference weakReference2 = this.a;
            if (weakReference2 != null) {
                eau.this.a((dqx) weakReference2.get(), dqz);
            }
        }
    }

    /* renamed from: eau$b */
    class b implements defpackage.dqw.b {
        private final dpp a;

        b(dpp dpp) {
            this.a = dpp;
        }

        public final void a() {
            eau.this.e = h.a;
            eau.this.c(this.a);
        }
    }

    public eau(ebc ebc, dqm dqm, Supplier<Handler> supplier, dnt dnt, dny dny, ifs ifs, Supplier<eca> supplier2, Supplier<Boolean> supplier3, ajwy<dqy> ajwy, dpf dpf, eaq eaq) {
        this.f = ebc;
        this.g = dqm;
        this.j = ifs;
        this.k = supplier2;
        this.l = supplier3;
        this.s = ajwy;
        this.a = dpf;
        HandlerThread handlerThread = new HandlerThread("Video Recording Operation Handler Thread");
        handlerThread.start();
        this.n = new eav(handlerThread.getLooper());
        this.h = supplier;
        this.i = dnt;
        this.d = dny;
        this.b = new ear(this.d);
        this.t = eaq;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01db  */
    private void a(defpackage.dqx r25, defpackage.dpp r26, boolean r27, boolean r28, int r29, defpackage.adfh r30, java.io.File r31) {
        /*
        r24 = this;
        r0 = r24;
        r10 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r31;
        r4 = r0.e;
        r4 = r4 instanceof defpackage.eaw.f;
        if (r4 != 0) goto L_0x002a;
    L_0x0010:
        r4 = r0.e;
        r4 = r4 instanceof defpackage.eaw.e;
        if (r4 != 0) goto L_0x002a;
    L_0x0016:
        r4 = r0.e;
        r4 = r4 instanceof defpackage.eaw.a;
        if (r4 != 0) goto L_0x002a;
    L_0x001c:
        r4 = r0.e;
        r4 = r4 instanceof defpackage.eaw.b;
        if (r4 != 0) goto L_0x002a;
    L_0x0022:
        r4 = r0.e;
        r4 = r4 instanceof defpackage.eaw.c;
        if (r4 != 0) goto L_0x002a;
    L_0x0028:
        r4 = 1;
        goto L_0x002b;
    L_0x002a:
        r4 = 0;
    L_0x002b:
        if (r4 == 0) goto L_0x002e;
    L_0x002d:
        return;
    L_0x002e:
        r4 = defpackage.eaw.e.a;
        r0.e = r4;
        r0.v = r1;
        r0.w = r2;
        r8 = r29;
        r0.x = r8;
        r0.u = r3;
        r4 = r0.g;
        r4 = r4.b();
        if (r3 != 0) goto L_0x0049;
    L_0x0044:
        r1 = defpackage.eaw.c.a;
        r0.e = r1;
        return;
    L_0x0049:
        if (r10 != 0) goto L_0x0055;
    L_0x004b:
        r1 = new eaw$a;
        r2 = "Null cameraProxy";
        r1.<init>(r2);
        r0.e = r1;
        return;
    L_0x0055:
        if (r4 != 0) goto L_0x0061;
    L_0x0057:
        r1 = new eaw$a;
        r2 = "Null previewResolution";
        r1.<init>(r2);
        r0.e = r1;
        return;
    L_0x0061:
        r7 = r0.r;
        if (r7 == 0) goto L_0x009b;
    L_0x0065:
        r9 = r7.b;
        r9 = r9.get();
        r9 = (android.app.Activity) r9;
        if (r9 == 0) goto L_0x0096;
    L_0x006f:
        r7 = r7.a;
        r11 = r7.e();
        if (r11 != 0) goto L_0x0091;
    L_0x0077:
        r11 = android.os.Build.VERSION.SDK_INT;
        r12 = 23;
        if (r11 < r12) goto L_0x0091;
    L_0x007d:
        r11 = defpackage.ifu.CAMERA_VIDEO_RECORD_START;
        r7 = r7.a(r11);
        if (r7 == 0) goto L_0x0091;
    L_0x0085:
        if (r9 == 0) goto L_0x0091;
    L_0x0087:
        r7 = "android.permission.RECORD_AUDIO";
        r7 = defpackage.fq.a(r9, r7);
        if (r7 != 0) goto L_0x0091;
    L_0x008f:
        r7 = 1;
        goto L_0x0092;
    L_0x0091:
        r7 = 0;
    L_0x0092:
        if (r7 == 0) goto L_0x0096;
    L_0x0094:
        r7 = 1;
        goto L_0x0097;
    L_0x0096:
        r7 = 0;
    L_0x0097:
        if (r7 == 0) goto L_0x009b;
    L_0x0099:
        r7 = 1;
        goto L_0x009c;
    L_0x009b:
        r7 = 0;
    L_0x009c:
        r9 = r0.j;
        r9 = r9.e();
        if (r9 != 0) goto L_0x00ab;
    L_0x00a4:
        if (r7 != 0) goto L_0x00ab;
    L_0x00a6:
        r1 = defpackage.eaw.b.a;
        r0.e = r1;
        return;
    L_0x00ab:
        r9 = r0.i;
        r11 = r9.a(r4);
        r4 = new eau$a;
        r9 = r25;
        r4.<init>(r9);
        r0.p = r4;
        r12 = new eau$b;
        r12.<init>(r10);
        r4 = r0.f;
        r14 = r0.n;
        r13 = r0.p;
        r15 = r0.h;
        r5 = r0.k;
        r6 = r0.l;
        r8 = r0.t;
        r9 = r4.a;
        r9 = r9.Y();
        if (r9 == 0) goto L_0x00e7;
    L_0x00d5:
        r9 = 0;
        r9 = android.text.TextUtils.isEmpty(r9);
        if (r9 != 0) goto L_0x00e7;
    L_0x00dc:
        r1 = new eap;
        r2 = r4.a;
        r4 = r4.d;
        r1.<init>(r2, r13, r4, r8);
        goto L_0x01af;
    L_0x00e7:
        r9 = r4.a();
        if (r9 != 0) goto L_0x010d;
    L_0x00ed:
        r1 = new ean;
        r16 = new android.media.MediaRecorder;
        r16.<init>();
        r2 = r4.b;
        r5 = r4.d;
        r4 = r4.e;
        r9 = r15;
        r15 = r1;
        r17 = r13;
        r18 = r2;
        r19 = r9;
        r20 = r5;
        r21 = r4;
        r22 = r8;
        r15.<init>(r16, r17, r18, r19, r20, r21, r22);
        goto L_0x01af;
    L_0x010d:
        r9 = r15;
        r15 = r4.a;
        r15 = r15.A();
        if (r15 == 0) goto L_0x0139;
    L_0x0116:
        r1 = new eas;
        r2 = r4.b;
        r15 = r4.c;
        r10 = r4.d;
        r4 = r4.e;
        r17 = r13;
        r13 = r1;
        r18 = r15;
        r15 = r17;
        r16 = r2;
        r17 = r9;
        r19 = r10;
        r20 = r4;
        r21 = r5;
        r22 = r6;
        r23 = r8;
        r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        goto L_0x01af;
    L_0x0139:
        r17 = r13;
        if (r2 == 0) goto L_0x015e;
    L_0x013d:
        r1 = new eas;
        r2 = r4.b;
        r10 = r4.c;
        r15 = r4.d;
        r4 = r4.e;
        r13 = r1;
        r19 = r15;
        r15 = r17;
        r16 = r2;
        r17 = r9;
        r18 = r10;
        r20 = r4;
        r21 = r5;
        r22 = r6;
        r23 = r8;
        r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        goto L_0x01af;
    L_0x015e:
        if (r1 == 0) goto L_0x0194;
    L_0x0160:
        r1 = defpackage.abnl.b;
        if (r1 == 0) goto L_0x016f;
    L_0x0164:
        r1 = r4.a;
        r1 = r1.E();
        if (r1 == 0) goto L_0x016f;
    L_0x016c:
        r16 = 1;
        goto L_0x0171;
    L_0x016f:
        r16 = 0;
    L_0x0171:
        if (r16 != 0) goto L_0x0194;
    L_0x0173:
        r1 = new eas;
        r2 = r4.b;
        r10 = r4.c;
        r15 = r4.d;
        r4 = r4.e;
        r13 = r1;
        r19 = r15;
        r15 = r17;
        r16 = r2;
        r17 = r9;
        r18 = r10;
        r20 = r4;
        r21 = r5;
        r22 = r6;
        r23 = r8;
        r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        goto L_0x01af;
    L_0x0194:
        r1 = new ean;
        r16 = new android.media.MediaRecorder;
        r16.<init>();
        r2 = r4.b;
        r5 = r4.d;
        r4 = r4.e;
        r15 = r1;
        r18 = r2;
        r19 = r9;
        r20 = r5;
        r21 = r4;
        r22 = r8;
        r15.<init>(r16, r17, r18, r19, r20, r21, r22);
    L_0x01af:
        r0.c = r1;
        r1 = r0.c;
        r1 = r1.k();
        r0.m = r1;
        r1 = r0.c;
        r1.a(r3);
        r8 = r30;
        r0.q = r8;
        r1 = r0.c;
        r4 = r0.g;
        r2 = 1;
        r9 = r7 ^ 1;
        r2 = r11;
        r3 = r25;
        r5 = r26;
        r6 = r12;
        r7 = r30;
        r8 = r29;
        r1 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9);
        r2 = r1.a;
        if (r2 != 0) goto L_0x01e9;
    L_0x01db:
        r2 = new eaw$a;
        r1 = r1.b;
        r1 = android.util.Log.getStackTraceString(r1);
        r2.<init>(r1);
        r0.e = r2;
        return;
    L_0x01e9:
        r1 = r0.b;
        r2 = r26;
        r1.a(r2, r11);
        r1 = defpackage.eaw.d.a;
        r0.e = r1;
        defpackage.dnz.a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eau.a(dqx, dpp, boolean, boolean, int, adfh, java.io.File):void");
    }

    private void a(dqx dqx, dqz dqz) {
        ((Handler) this.h.get()).post(new -$$Lambda$eau$goxJ_svKFRKm66-JQ_3XfEG66oA(this, dqx, dqz));
        this.p = null;
    }

    private void a(String str, String str2) {
        if (this.y == 1) {
            this.d.a(str, aasc.VIDEO, str2);
        }
    }

    private /* synthetic */ void b(dqx dqx, dpp dpp, boolean z, boolean z2, int i, adfh adfh, File file) {
        a(dqx, dpp, z, z2, i, adfh, file);
    }

    private /* synthetic */ void b(dqx dqx, dqz dqz) {
        if (dqx != null) {
            dqx.a(dqz);
        } else {
            a(dog.NULL_FAILURE_CALLBACK.toString(), dqz.a);
        }
    }

    public final void a(dpp dpp) {
        this.n.obtainMessage(3, new -$$Lambda$eau$EbAyBfnyghESdD6881Bkflwhc2Y(this, dpp)).sendToTarget();
    }

    public final void a(dqx dqx) {
        this.n.obtainMessage(2, new -$$Lambda$eau$jx3w5d7CfI7H3Hs7w7iH_cXlGBE(this, dqx)).sendToTarget();
    }

    public final void a(dqx dqx, dpp dpp, String str, boolean z) {
        this.n.obtainMessage(1, new -$$Lambda$eau$AChWrexNEAJgFjRtm3sFqu5X1Yw(this, dqx, dpp, null, null, null, str, z)).sendToTarget();
    }

    public final void a(dqx dqx, dpp dpp, boolean z, boolean z2, adfh adfh, File file, dqr dqr, int i) {
        this.r = dqr;
        this.y = 1;
        this.n.obtainMessage(0, new -$$Lambda$eau$eP6059sQ2FaOK3bNlkVpVS0Ise0(this, dqx, dpp, z, z2, 65000, adfh, file)).sendToTarget();
    }

    public final boolean a() {
        ebc ebc = this.f;
        return ebc.a() && ebc.a.A();
    }

    /* Access modifiers changed, original: final */
    /* renamed from: b */
    public final void c(dpp dpp) {
        if ((this.e instanceof d) || (this.e instanceof h)) {
            this.u = null;
            if (dpp != null) {
                dou dou = this.o;
                if (dou != null) {
                    dou.b();
                    dpp.b(this.o);
                }
                dqw dqw = this.c;
                if (dqw != null) {
                    dqw.d();
                    dpp.b(this.c.i());
                }
                this.b.a(dpp);
            }
            this.v = false;
            this.w = false;
            this.q = null;
            this.r = null;
            dqw dqw2 = this.c;
            if (dqw2 != null) {
                dqw2.f();
                this.c = null;
            }
            this.e = f.a;
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: b */
    public final void c(dqx dqx) {
        if (this.e instanceof g) {
            this.b.c();
            this.e = i.a;
            a aVar = this.p;
            if (aVar != null) {
                aVar.a(dqx);
            }
            this.c.e();
        }
    }
}
