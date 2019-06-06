package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.animations.ArcView;
import defpackage.abqr.a;

/* renamed from: soj */
public class soj extends slm {
    final abqr a;
    tat b;
    long c;
    boolean d;
    private final int e;
    private final int f;
    private final abqr g;
    private final taq h;
    private final tar i;
    private final View j;
    private final ArcView k;
    private boolean l;
    private abua m;
    private final a n;
    private final a o;
    private final ski p;
    private final ski q;
    private final ski r;

    /* renamed from: soj$1 */
    class 1 implements a {
        1() {
        }

        public final void a() {
        }

        public final void a(long j, float f) {
            soj.this.b.a(soj.this.a.a(j), f);
        }
    }

    /* renamed from: soj$2 */
    class 2 implements a {
        2() {
        }

        public final void a() {
        }

        public final void a(long j, float f) {
            soj.this.b.a(f);
        }
    }

    /* renamed from: soj$3 */
    class 3 implements ski {
        3() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            if (((sqs) soj.this.I.c(sqh.bY, sqs.FIXED_DURATION)) == sqs.TRACK_VIDEO) {
                soj.this.c = ((Long) szw2.c(skj.c, Long.valueOf(-1))).longValue();
            }
        }
    }

    /* renamed from: soj$4 */
    class 4 implements ski {
        4() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            if (((sqs) soj.this.I.c(sqh.bY, sqs.FIXED_DURATION)) == sqs.TRACK_VIDEO) {
                soj soj = soj.this;
                soj.a(soj.c, soj.this.c);
            }
        }
    }

    /* renamed from: soj$5 */
    class 5 implements ski {
        5() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            if (!(soj.this.F == sjo.STOPPED || soj.this.F == sjo.DESTROYED)) {
                soj soj = soj.this;
                soj.d = true;
                if (((sqs) soj.I.c(sqh.bY, sqs.FIXED_DURATION)) == sqs.FIXED_DURATION) {
                    soj.this.m();
                } else {
                    soj = soj.this;
                    soj.a(soj.c, soj.this.c);
                }
            }
        }
    }

    /* renamed from: soj$6 */
    static /* synthetic */ class 6 {
        static final /* synthetic */ int[] a = new int[sqb.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.sqb.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.sqb.PLAY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.sqb.LOOP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.sqb.PAUSE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.soj$6.<clinit>():void");
        }
    }

    soj(Context context) {
        this(context, context.getResources());
    }

    private soj(Context context, Resources resources) {
        this.c = -1;
        this.l = false;
        this.d = false;
        this.n = new 1();
        this.o = new 2();
        this.p = new 3();
        this.q = new 4();
        this.r = new 5();
        this.h = new taq(context);
        this.i = new tar(context);
        this.k = new ArcView(context);
        ArcView arcView = this.k;
        Preconditions.checkArgument(true);
        arcView.f = 15;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.k);
        frameLayout.addView(this.h);
        frameLayout.addView(this.i);
        this.j = frameLayout;
        this.a = new abqr();
        this.g = new abqr();
        this.e = resources.getDimensionPixelSize(R.dimen.timer_top_spacing);
        this.f = resources.getDimensionPixelSize(R.dimen.timer_right_spacing);
    }

    private void b(long j, long j2) {
        tat tat;
        boolean z;
        this.g.a(j2, j, 0);
        if (this.I.a(sqh.bY) != sqs.STATIC) {
            tat = this.b;
            z = true;
        } else {
            tat = this.b;
            z = false;
        }
        tat.a(z);
    }

    private void c(long j, long j2) {
        long d;
        if (this.I.c(sqh.bU)) {
            d = soj.d(this.I.a(sqh.bT, -1.0f));
            this.a.a(soj.d(this.I.a(sqh.bU, -1.0f)), d, d - j2);
            this.b.b(true);
        } else if (this.I.c(sqh.bW)) {
            long j3;
            long j4;
            int a = this.I.a(sqh.bW, 1);
            int a2 = this.I.a(sqh.bX, 0);
            long max = Math.max(1, j2);
            if (j2 >= 0) {
                j3 = ((long) (a2 + 1)) * max;
                j4 = max * ((long) a2);
                d = ((long) a) * max;
            } else {
                d = ((long) a) * 2;
                j3 = 1 + (((long) a2) * 2);
                j4 = j3;
            }
            this.a.a(d, j3, j4);
            this.b.b(true);
        } else {
            this.a.a(j2, j, 0);
            this.b.b(false);
        }
    }

    private static long d(float f) {
        return f < MapboxConstants.MINIMUM_ZOOM ? -1 : (long) (f * 1000.0f);
    }

    /* renamed from: A_ */
    public final tas.a j() {
        tas.a aVar = new tas.a(-2, -2);
        aVar.gravity = 53;
        aVar.topMargin = this.e;
        aVar.rightMargin = this.f;
        return aVar;
    }

    public final void C_() {
        this.g.b();
        this.a.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(long j, long j2) {
        if (this.d) {
            b(j, j2);
            sqs sqs = (sqs) this.I.a(sqh.bY);
            if (this.F == sjo.STARTED && sqs != sqs.STATIC) {
                this.g.a();
            }
            c(j, j2);
            if (this.F == sjo.STARTED && sqs != sqs.STATIC) {
                this.a.a();
            }
            A();
        }
    }

    public final void a(sit sit, sju sju) {
        super.a(sit, sju);
        this.h.b = D();
        this.i.a = D();
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        if (this.F == sjo.STARTED || this.F == sjo.PAUSED) {
            if (((sqs) this.I.c(sqh.bY, sqs.FIXED_DURATION)) == sqs.FIXED_DURATION) {
                m();
            }
            A();
        }
    }

    public final void a(szw szw) {
        this.d = false;
        A().b.d.a("VIDEO_PLAYBACK_STARTED", this.p);
        A().b.d.a("VIDEO_PLAYBACK_LOOPED", this.q);
        A().b.d.a("OPEN_VIEW_DISPLAYED", this.r);
        A();
    }

    /* JADX WARNING: Missing block: B:12:0x004d, code skipped:
            if (r0 != 3) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:14:0x0056, code skipped:
            if (r2 == defpackage.sqs.FIXED_DURATION) goto L_0x0058;
     */
    public final void a_(defpackage.szw r6) {
        /*
        r5 = this;
        r0 = defpackage.skb.b;
        r0 = r6.c(r0);
        if (r0 == 0) goto L_0x001f;
    L_0x0008:
        r0 = r5.z();
        r0 = r0.h();
        if (r0 != 0) goto L_0x001f;
    L_0x0012:
        r0 = defpackage.skb.b;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r6.a(r0, r1);
        r1 = r5.b;
        r1.setAlpha(r0);
    L_0x001f:
        r0 = defpackage.skb.d;
        r0 = r6.c(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0073;
    L_0x0028:
        r0 = defpackage.skb.d;
        r2 = defpackage.sqb.PLAY;
        r0 = r6.a(r0, r2);
        r0 = (defpackage.sqb) r0;
        r2 = r5.I;
        r3 = defpackage.sqh.bY;
        r4 = defpackage.sqs.FIXED_DURATION;
        r2 = r2.c(r3, r4);
        r2 = (defpackage.sqs) r2;
        r3 = defpackage.soj.6.a;
        r0 = r0.ordinal();
        r0 = r3[r0];
        r3 = 1;
        if (r0 == r3) goto L_0x0063;
    L_0x0049:
        r4 = 2;
        if (r0 == r4) goto L_0x0050;
    L_0x004c:
        r2 = 3;
        if (r0 == r2) goto L_0x0058;
    L_0x004f:
        goto L_0x0073;
    L_0x0050:
        r0 = r5.g;
        r0.b = r3;
        r0 = defpackage.sqs.FIXED_DURATION;
        if (r2 != r0) goto L_0x0073;
    L_0x0058:
        r0 = r5.g;
        r0.b();
        r0 = r5.a;
        r0.b();
        goto L_0x0073;
    L_0x0063:
        r0 = r5.g;
        r0.b = r1;
        r2 = r5.d;
        if (r2 == 0) goto L_0x0073;
    L_0x006b:
        r0.c();
        r0 = r5.a;
        r0.c();
    L_0x0073:
        r0 = defpackage.skb.e;
        r0 = r6.c(r0);
        if (r0 == 0) goto L_0x008f;
    L_0x007b:
        r0 = defpackage.skb.e;
        r6 = r6.a(r0, r1);
        if (r6 == 0) goto L_0x0089;
    L_0x0083:
        r6 = r5.b;
        r6.setVisibility(r1);
        return;
    L_0x0089:
        r6 = r5.b;
        r0 = 4;
        r6.setVisibility(r0);
    L_0x008f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.soj.a_(szw):void");
    }

    public final void ae_() {
        if (this.I.a(sqh.bR, squ.CONCENTRIC_TIMER) == squ.COUNTDOWN_TIMER) {
            this.b = this.h;
            this.i.setVisibility(8);
        } else {
            this.b = this.i;
            this.h.setVisibility(8);
        }
        this.b.setVisibility(0);
        this.a.a(this.n);
        this.g.a(this.o);
        this.m = new abua((View) this.b, this.k);
        b(1, 1);
        c(0, 0);
        ArcView arcView = this.k;
        arcView.e = true;
        arcView.b = this.j.getResources().getColor(R.color.black_forty_opacity);
        arcView.a.setColor(arcView.b);
        this.k.a(this.H.a(sqh.bV, -1));
        abua abua = this.m;
        if (abua != null) {
            float random = ((float) Math.random()) * 360.0f;
            abua.c = random;
            if (abua.a != null) {
                abua.a.c = random;
            }
        }
    }

    public final void b() {
        super.b();
        this.a.b(this.n);
        this.g.b(this.o);
        this.b.setAlpha(1.0f);
        taq taq = this.h;
        taq.a();
        taq.b = null;
        tar tar = this.i;
        tar.a();
        tar.a = null;
    }

    public final void b(szw szw) {
        A().b.d.b("VIDEO_PLAYBACK_STARTED", this.p);
        A().b.d.b("VIDEO_PLAYBACK_LOOPED", this.q);
        A().b.d.b("OPEN_VIEW_DISPLAYED", this.r);
        this.g.b();
        this.a.b();
        this.c = -1;
        this.l = false;
        abua abua = this.m;
        if (abua != null) {
            abua.c();
        }
    }

    public final void c(float f) {
        this.b.setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, 1.0f - (f * 4.0f)));
    }

    public final void c(szw szw) {
        if (((sqs) this.I.c(sqh.bY, sqs.FIXED_DURATION)) != sqs.STATIC) {
            this.g.c();
            this.a.c();
        }
    }

    public final View e() {
        return this.j;
    }

    public final void e(szw szw) {
        this.b.setAlpha(1.0f);
    }

    public final String f() {
        return "TIMER";
    }

    public final boolean h() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void m() {
        if (!this.g.a && this.I.a(sqh.bl) == sqa.LOADED) {
            this.c = soj.d(this.I.a(sqh.bS, -1.0f));
            long j = this.c;
            a(j, j);
        }
    }
}
