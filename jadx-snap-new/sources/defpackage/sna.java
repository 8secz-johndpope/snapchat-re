package defpackage;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.Runnables;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.opera.view.FitWidthImageView;
import com.snap.opera.view.OperaScalableCircleMaskFrameLayout;
import defpackage.siw.a;
import defpackage.siw.c;

/* renamed from: sna */
public abstract class sna extends slm {
    private Runnable A;
    private int B;
    private a C;
    private final sxj D;
    private final OnClickListener E;
    private final tah.a L;
    protected final Context a;
    protected final OperaScalableCircleMaskFrameLayout b;
    protected final abth c;
    final FitWidthImageView d;
    final absp e;
    final sll f;
    final sjc g;
    boolean h;
    sjn i;
    long j;
    boolean k;
    szj.a l;
    szj.a m;
    Runnable n;
    protected sxn o;
    final Runnable p;
    private absl q;
    private final tah r;
    private final ski s;
    private final tcj t;
    private tac u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private float z;

    /* renamed from: sna$3 */
    class 3 implements sxj {
        3() {
        }

        public final void a() {
            if (sna.this.F.a()) {
                sna.this.a((int) sna.this.o.n, (int) sna.this.o.o);
                sna.this.C().a("VIDEO_PREPARED", sna.this.H);
            }
        }

        public final void a(long j) {
            try {
                if (sna.this.K) {
                    szw szw = new szw();
                    if (j != 0) {
                        szw.b(skj.v, Long.valueOf(j));
                    }
                    sna.this.C().a("VIDEO_PLAYBACK_STOPPED", sna.this.H, szw);
                }
            } catch (Exception unused) {
            }
        }

        public final void a(abyh abyh, String str) {
            if (sna.this.F.a()) {
                sqf sqf = (sqf) sna.this.I.a(sqh.n);
                sna sna = sna.this;
                sna.h = true;
                sna.c(sna);
                szw szw = new szw();
                szw.b(skj.w, str);
                szw.b(skj.x, abyh);
                if (sqf != null) {
                    szw.b(skj.n, Boolean.valueOf(sqf.a()));
                    szw.b(skj.p, sna.a(sqf));
                }
                szw.a(sna.this.M());
                sna.this.z().b(szw);
            }
        }

        public final void b() {
            sna.this.R();
            if (sna.this.F.a()) {
                sna.this.C().a("VIDEO_PLAYBACK_COMPLETED", sna.this.H);
            }
        }

        public final void c() {
            if (sna.this.F.a()) {
                if (sna.this.i == sjn.NONE) {
                    sna.this.i = sjn.MINIMALLY_DISPLAYED;
                    sna.this.o();
                }
                sna.this.C().a("VIDEO_FIRST_FRAME_RENDERED", sna.this.H);
            }
        }

        public final void d() {
            if (sna.this.F.a()) {
                if (sna.j(sna.this.I)) {
                    absp absp = sna.this.e;
                    if (absp.a.requestAudioFocus(absp.b, 3, 2) == 1) {
                        absp.c = true;
                    }
                }
                String str = "VIDEO_PLAYBACK_STARTED";
                sna.this.C().a(str, sna.this.H, szw.a(skj.c, Long.valueOf((long) sna.this.o.l), skj.l, Long.valueOf(System.currentTimeMillis() - sna.this.j)));
                sna.this.d.setVisibility(8);
                sna.this.z().n();
                sna.this.i = sjn.FULLY_DISPLAYED;
                sna.this.o();
                sna.this.L();
            }
        }

        public final void e() {
            if (sna.this.F.a()) {
                sna.this.C().a("VIDEO_PLAYBACK_LOOPED", sna.this.H, szw.a(skj.c, Long.valueOf((long) sna.this.o.l)));
            }
        }

        public final void f() {
            sna.this.a(true);
            sna.this.z().k();
            sna.this.C().a("VIDEO_MEDIA_BUFFERING_START", sna.this.H);
        }

        public final void g() {
            sna.this.a(false);
            sna.this.z().l();
            sna.this.C().a("VIDEO_MEDIA_BUFFERING_COMPLETE", sna.this.H);
        }
    }

    /* renamed from: sna$1 */
    class 1 implements ski {
        1() {
        }

        private /* synthetic */ void a() {
            sna.a(sna.this);
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            sna.this.f.a((sqo) szw2.a(sqh.cN));
            sna.this.n = new -$$Lambda$sna$1$cmEn_0E9LnFT-WwfOJaZ7MLFiN4(this);
        }
    }

    /* renamed from: sna$2 */
    class 2 implements a {
        2() {
        }

        public final void a(String str, ImageView imageView, int i, int i2, c cVar) {
            sna sna;
            szj.a aVar;
            if (Strings.isNullOrEmpty(str)) {
                sna = sna.this;
                aVar = szj.a.ON_SUCCESS_WITH_NULL;
            } else {
                sna = sna.this;
                aVar = szj.a.DONE;
            }
            sna.m = aVar;
            sna.this.g.b(cVar);
            sna.this.d.setImageBitmap(cVar.c());
            sna = sna.this;
            sna.k = false;
            sna.d.removeCallbacks(sna.this.p);
            if (sna.this.i == sjn.NONE) {
                sna = sna.this;
                if (sna.P()) {
                    Object obj = (i <= 0 || i2 <= 0) ? null : 1;
                    if (obj != null) {
                        new soc(i, i2, sna.d, ((sps) sna.I.c(sqh.v, sps.MIDDLE_CENTER)).a()).a();
                        sna.d.b(false);
                        ((LayoutParams) sna.d.getLayoutParams()).gravity = ((sps) sna.I.c(sqh.v, sps.MIDDLE_CENTER)).a();
                    }
                }
                sna.this.a(i, i2);
                sna.this.i = sjn.MINIMALLY_DISPLAYED;
                sna.this.d.setVisibility(0);
                sna.this.o();
            }
            if (sna.this.F.a()) {
                sna.this.b(false);
            }
            sna.this.q();
        }

        public final void a(String str, ImageView imageView, Exception exception) {
            sna sna = sna.this;
            sna.k = false;
            sna.d.removeCallbacks(sna.this.p);
            sna.this.m = szj.a.ON_FAILED;
            if (sna.this.i == sjn.NONE) {
                sna.this.i = sjn.MINIMALLY_DISPLAYED;
                sna.this.o();
            }
            if (sna.this.F.a()) {
                sna.this.b(false);
            }
            sna.this.q();
        }
    }

    /* renamed from: sna$4 */
    class 4 implements OnClickListener {
        4() {
        }

        public final void onClick(View view) {
            sna.this.C().a("VIEW_CLOSE_REQUESTED", sna.this.H);
        }
    }

    /* renamed from: sna$5 */
    class 5 implements tah.a {
        5() {
        }

        /* JADX WARNING: Missing block: B:10:0x006a, code skipped:
            if (r4.a.K != false) goto L_0x006c;
     */
        /* JADX WARNING: Missing block: B:18:0x00be, code skipped:
            if (r4.a.K != false) goto L_0x006c;
     */
        public final void onDecryptionFinished(defpackage.spq r5) {
            /*
            r4 = this;
            r0 = defpackage.sna.this;
            r0 = r0.I;
            r1 = defpackage.sqh.n;
            r0 = r0.a(r1);
            r0 = (defpackage.sqf) r0;
            r1 = r5.b;
            r2 = 1;
            if (r1 == 0) goto L_0x0076;
        L_0x0011:
            r1 = defpackage.sna.this;
            r3 = defpackage.szj.a.ON_CALLBACK_EX;
            r1.l = r3;
            r1 = defpackage.sna.this;
            r1.h = r2;
            defpackage.sna.c(r1);
            r1 = new szw;
            r1.<init>();
            r2 = defpackage.skj.w;
            r3 = r5.b;
            r3 = r3.getMessage();
            r1.b(r2, r3);
            r2 = defpackage.skj.z;
            r1.b(r2, r5);
            r2 = r5.b;
            r2 = r2 instanceof defpackage.tak;
            if (r2 == 0) goto L_0x003e;
        L_0x0039:
            r2 = defpackage.skj.x;
            r3 = defpackage.abyh.MEDIA_ERROR_MISSING_FILE;
            goto L_0x0042;
        L_0x003e:
            r2 = defpackage.skj.x;
            r3 = defpackage.abyh.MEDIA_ERROR_DECRYPTION;
        L_0x0042:
            r1.b(r2, r3);
            if (r0 == 0) goto L_0x005d;
        L_0x0047:
            r2 = defpackage.skj.n;
            r3 = r0.a();
            r3 = java.lang.Boolean.valueOf(r3);
            r1.b(r2, r3);
            r2 = defpackage.skj.p;
            r0 = defpackage.sna.a(r0);
            r1.b(r2, r0);
        L_0x005d:
            r0 = defpackage.sna.this;
            r0 = r0.M();
            r1.a(r0);
            r0 = defpackage.sna.this;
            r0 = r0.K;
            if (r0 == 0) goto L_0x00da;
        L_0x006c:
            r0 = defpackage.sna.this;
            r0 = r0.z();
            r0.b(r1);
            goto L_0x00da;
        L_0x0076:
            r1 = r5.a;
            if (r1 != 0) goto L_0x00c1;
        L_0x007a:
            r1 = defpackage.sna.this;
            r1.h = r2;
            defpackage.sna.c(r1);
            r1 = new szw;
            r1.<init>();
            r2 = defpackage.skj.w;
            r3 = "Decrypted uri is null";
            r1.b(r2, r3);
            r2 = defpackage.skj.x;
            r3 = defpackage.abyh.MEDIA_ERROR_DECRYPTION_NULL_URI;
            r1.b(r2, r3);
            r2 = defpackage.skj.z;
            r1.b(r2, r5);
            if (r0 == 0) goto L_0x00b1;
        L_0x009b:
            r2 = defpackage.skj.n;
            r3 = r0.a();
            r3 = java.lang.Boolean.valueOf(r3);
            r1.b(r2, r3);
            r2 = defpackage.skj.p;
            r0 = defpackage.sna.a(r0);
            r1.b(r2, r0);
        L_0x00b1:
            r0 = defpackage.sna.this;
            r0 = r0.M();
            r1.a(r0);
            r0 = defpackage.sna.this;
            r0 = r0.K;
            if (r0 == 0) goto L_0x00da;
        L_0x00c0:
            goto L_0x006c;
        L_0x00c1:
            r0 = r5.a;
            r0 = com.google.common.base.Strings.isNullOrEmpty(r0);
            if (r0 == 0) goto L_0x00ce;
        L_0x00c9:
            r0 = defpackage.sna.this;
            r1 = defpackage.szj.a.ON_CALLBACK_NULL;
            goto L_0x00d2;
        L_0x00ce:
            r0 = defpackage.sna.this;
            r1 = defpackage.szj.a.DONE;
        L_0x00d2:
            r0.l = r1;
            r0 = defpackage.sna.this;
            r1 = 0;
            r0.b(r1);
        L_0x00da:
            r5 = r5.c;
            if (r5 == 0) goto L_0x00fb;
        L_0x00de:
            r5 = defpackage.sna.this;
            r5 = r5.F;
            r0 = defpackage.sjo.DESTROYED;
            if (r5 == r0) goto L_0x00fb;
        L_0x00e6:
            r5 = defpackage.sna.this;
            r5 = r5.K;
            if (r5 == 0) goto L_0x00fb;
        L_0x00ec:
            r5 = defpackage.sna.this;
            r5 = r5.C();
            r0 = defpackage.sna.this;
            r0 = r0.H;
            r1 = "MEMORIES_ORIGINAL_MEDIA_UNENCRYPTED";
            r5.a(r1, r0);
        L_0x00fb:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.sna$5.onDecryptionFinished(spq):void");
        }
    }

    /* renamed from: sna$6 */
    class 6 implements Runnable {
        6() {
        }

        public final void run() {
            sna.this.q();
            if (sna.this.F.a()) {
                if (sna.this.i == sjn.NONE) {
                    sna.this.i = sjn.MINIMALLY_DISPLAYED;
                    sna.this.o();
                }
                sna sna = sna.this;
                sna.k = false;
                sna.b(false);
            }
        }
    }

    /* renamed from: sna$7 */
    static /* synthetic */ class 7 {
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.sna$7.<clinit>():void");
        }
    }

    public sna(Context context) {
        this(context, new absl(context), new FitWidthImageView(context), new tah(), absp.a.a, new abth(context));
    }

    sna(Context context, absl absl, FitWidthImageView fitWidthImageView, tah tah, absp absp, abth abth) {
        this.s = new 1();
        this.h = false;
        this.i = sjn.NONE;
        this.v = false;
        this.j = 0;
        this.k = false;
        this.l = szj.a.NONE;
        this.m = szj.a.NONE;
        this.x = false;
        this.y = false;
        this.z = 1.0f;
        this.n = Runnables.doNothing();
        this.A = Runnables.doNothing();
        this.B = -1;
        this.C = new 2();
        this.D = new 3();
        this.E = new 4();
        this.L = new 5();
        this.p = new 6();
        this.a = context;
        this.q = absl;
        this.b = new OperaScalableCircleMaskFrameLayout(context);
        this.c = abth;
        this.d = fitWidthImageView;
        this.r = tah;
        this.e = absp;
        this.t = new tcj(this.c);
        this.g = new sjc("BaseVideoLayerViewController");
        this.b.addView(this.c);
        this.c.setBackgroundColor(0);
        this.f = new sll(context, this, this.c, this.b, this.q);
        this.d.setScaleType(ScaleType.FIT_CENTER);
        this.d.setAdjustViewBounds(true);
        this.c.addView(this.d, new LayoutParams(-1, -1));
    }

    private szw Q() {
        szw szw = new szw();
        szw.b(skj.H, this.o.i);
        szw.b(skj.c, Long.valueOf((long) this.o.l));
        szw.b(skj.E, Integer.valueOf((int) this.o.n));
        szw.b(skj.D, Integer.valueOf((int) this.o.o));
        szw.b(skj.aC, Long.valueOf(this.o.c()));
        if (this.o.j() != null) {
            szw.b(skj.F, this.o.j());
        }
        return szw;
    }

    private void R() {
        this.b.removeCallbacks(this.A);
        this.A = Runnables.doNothing();
    }

    private boolean S() {
        return szv.a(this.a) >= 2013;
    }

    private boolean b(sqf sqf) {
        if (Strings.isNullOrEmpty(sqf.a) || sqf.a()) {
            return false;
        }
        abnb abnb = sqf.b;
        return (abnb == null || (abnb instanceof abng)) ? false : p();
    }

    private void d(float f) {
        abth abth = this.c;
        abth.setScaleX(this.z * f);
        abth.setScaleY(this.z * f);
        this.b.a(f);
    }

    static boolean j(szw szw) {
        return ((Boolean) szw.c(sqh.y, Boolean.TRUE)).booleanValue();
    }

    private static sql k(szw szw) {
        return (sql) szw.a(sqh.p, sql.LOOPING);
    }

    private static boolean l(szw szw) {
        return ((spn) szw.a(sqh.a, spn.NO_AUTO_ADVANCE)) == spn.VIDEO_COMPLETION;
    }

    public void C_() {
        this.o.b(false);
    }

    public final sjn E() {
        return this.i;
    }

    public final boolean H() {
        sqf sqf = (sqf) this.I.a(sqh.n);
        return sqf != null && sqf.c;
    }

    public final ViewGroup I() {
        return this.b;
    }

    public final View J() {
        return this.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final int K() {
        sxn sxn = this.o;
        return sxn == null ? -1 : sxn.k();
    }

    /* Access modifiers changed, original: protected|final */
    public final void L() {
        int intValue = ((Integer) this.I.c(sqh.r, Integer.valueOf(0))).intValue();
        if (intValue <= 0 || sna.k(this.I) == sql.LOOPING) {
            this.b.removeCallbacks(this.A);
            this.A = Runnables.doNothing();
            return;
        }
        int k = this.o.k();
        int max = Math.max(16, ((k + intValue) - this.o.k()) / 2);
        this.A = new -$$Lambda$sna$78g3uljWcFILVjQA-9bCR-lqRzM(this, k, intValue);
        this.b.postDelayed(this.A, (long) max);
    }

    /* Access modifiers changed, original: protected|final */
    public final szw M() {
        sxn sxn = this.o;
        Object i = sxn != null ? sxn.i() : aaun.UNKNOWN;
        szw szw = new szw();
        szw.b(skj.C, i);
        szw.b(skj.A, aasc.VIDEO);
        sxn = this.o;
        if (sxn == null) {
            i = null;
        } else {
            sra j = sxn.j();
            String str = "duration";
            ToStringHelper add = MoreObjects.toStringHelper(skj.B.a).add("width", this.o.n).add("height", this.o.o).add(str, this.o.l);
            if (j != null) {
                add.add("bitrate", j.b);
            }
            i = add;
        }
        if (i != null) {
            szw.b(skj.B, i);
        }
        return szw;
    }

    /* Access modifiers changed, original: protected */
    public void N() {
        this.o.a(false);
    }

    /* Access modifiers changed, original: protected */
    public void O() {
        this.o.c(false);
    }

    /* Access modifiers changed, original: final */
    public final boolean P() {
        return !((Boolean) this.I.c(sqh.cc, Boolean.FALSE)).booleanValue() && this.G.b.z.b;
    }

    public final void a(float f) {
        sln.a(this.b, MapboxConstants.MINIMUM_ZOOM, f);
    }

    public final void a(float f, float f2) {
        if (this.y && f < 1.0f) {
            this.b.a();
        }
        if (this.x) {
            f = f2;
        }
        d(f);
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) MoreObjects.firstNonNull((LayoutParams) this.c.getLayoutParams(), new LayoutParams(-1, -1));
        Object obj = (i2 <= 0 || i <= 0) ? null : 1;
        if (!P() || obj == null) {
            abtg.a aVar = (abtg.a) this.H.c(sqh.z, abtg.a.FIT_CENTER);
            if (obj == null || !this.I.a(sqh.bZ, false)) {
                this.c.a(false);
                LayoutParams layoutParams3 = (obj == null || aVar != abtg.a.FILL_WIDTH) ? new LayoutParams(-1, -1) : new LayoutParams(-1, MeasureSpec.makeMeasureSpec((int) (((float) i2) * (((float) this.q.a()) / ((float) i))), AudioPlayer.INFINITY_LOOP_COUNT));
                layoutParams3.gravity = ((sps) this.I.a(sqh.o, sps.TOP_CENTER)).a();
                layoutParams = layoutParams3;
            } else {
                this.c.a(true);
                layoutParams = new LayoutParams(-1, -1);
            }
        } else {
            sod sod = new sod(i, i2);
            if (sod.a.a()) {
                layoutParams = sod.a.b() ? sod.a.c() : sod.a.d();
            } else {
                layoutParams = sod.a.d();
                layoutParams.gravity = sps.MIDDLE_CENTER.a();
            }
            layoutParams.gravity = ((sps) this.I.a(sqh.o, sps.TOP_CENTER)).a();
        }
        if (obj == null || !this.I.a(sqh.bZ, false)) {
            this.c.a(false);
            layoutParams2.setMargins(0, 0, 0, 0);
        } else {
            this.c.a(true);
            int a = this.q.a();
            int c = this.q.c();
            MarginLayoutParams a2 = abti.a(this.a, a, c, i, i2, a, c);
            layoutParams2.setMargins(a2.leftMargin, a2.topMargin, a2.rightMargin, a2.bottomMargin);
        }
        this.c.setLayoutParams(layoutParams2);
        a(layoutParams);
        this.d.requestLayout();
    }

    public abstract void a(LayoutParams layoutParams);

    public void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        A();
        this.w = false;
        if (this.F == sjo.STARTED) {
            if (this.h) {
                this.o.b();
                this.r.a();
                this.h = false;
            }
            if (!this.o.m) {
                b(false);
            }
        }
    }

    /* JADX WARNING: Missing block: B:5:0x001f, code skipped:
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:7:0x0023, code skipped:
            if (r3.l < 0) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:9:0x0028, code skipped:
            if (r3.l > 0) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:10:0x002a, code skipped:
            r3 = r3.l;
     */
    /* JADX WARNING: Missing block: B:12:0x002f, code skipped:
            if (r3.i < 0) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:14:0x0034, code skipped:
            if (r3.i > 0) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:15:0x0036, code skipped:
            r3 = r3.i;
     */
    /* JADX WARNING: Missing block: B:17:0x003b, code skipped:
            if (r3.k > 0) goto L_0x0042;
     */
    /* JADX WARNING: Missing block: B:19:0x0040, code skipped:
            if (r3.k < 0) goto L_0x0042;
     */
    /* JADX WARNING: Missing block: B:20:0x0042, code skipped:
            r3 = r3.k;
     */
    /* JADX WARNING: Missing block: B:22:0x0047, code skipped:
            if (r3.j < 0) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:24:0x004c, code skipped:
            if (r3.j > 0) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:25:0x004e, code skipped:
            r3 = r3.j;
     */
    /* JADX WARNING: Missing block: B:26:0x0050, code skipped:
            r3 = java.lang.Math.abs(r3);
     */
    /* JADX WARNING: Missing block: B:27:0x0054, code skipped:
            r0 = true;
     */
    /* JADX WARNING: Missing block: B:28:0x0055, code skipped:
            if (r3 != 1) goto L_0x0058;
     */
    /* JADX WARNING: Missing block: B:29:0x0058, code skipped:
            r0 = false;
     */
    /* JADX WARNING: Missing block: B:30:0x0059, code skipped:
            r2.v = r0;
     */
    /* JADX WARNING: Missing block: B:31:0x005d, code skipped:
            if (r2.v == false) goto L_0x0063;
     */
    /* JADX WARNING: Missing block: B:32:0x005f, code skipped:
            b(false);
     */
    /* JADX WARNING: Missing block: B:33:0x0062, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:34:0x0063, code skipped:
            r2.o.b();
     */
    /* JADX WARNING: Missing block: B:35:0x0068, code skipped:
            return;
     */
    public final void a(defpackage.szb.c r3) {
        /*
        r2 = this;
        r0 = r2.A();
        r0 = r0.b;
        r0 = r0.o;
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r0 = r2.A();
        r0 = r0.b;
        r0 = r0.o;
        r1 = defpackage.szb.8.a;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 0;
        switch(r0) {
            case 1: goto L_0x004a;
            case 2: goto L_0x0045;
            case 3: goto L_0x003e;
            case 4: goto L_0x0039;
            case 5: goto L_0x0032;
            case 6: goto L_0x002d;
            case 7: goto L_0x0026;
            case 8: goto L_0x0021;
            default: goto L_0x001f;
        };
    L_0x001f:
        r3 = 0;
        goto L_0x0054;
    L_0x0021:
        r0 = r3.l;
        if (r0 >= 0) goto L_0x001f;
    L_0x0025:
        goto L_0x002a;
    L_0x0026:
        r0 = r3.l;
        if (r0 <= 0) goto L_0x001f;
    L_0x002a:
        r3 = r3.l;
        goto L_0x0050;
    L_0x002d:
        r0 = r3.i;
        if (r0 >= 0) goto L_0x001f;
    L_0x0031:
        goto L_0x0036;
    L_0x0032:
        r0 = r3.i;
        if (r0 <= 0) goto L_0x001f;
    L_0x0036:
        r3 = r3.i;
        goto L_0x0050;
    L_0x0039:
        r0 = r3.k;
        if (r0 <= 0) goto L_0x001f;
    L_0x003d:
        goto L_0x0042;
    L_0x003e:
        r0 = r3.k;
        if (r0 >= 0) goto L_0x001f;
    L_0x0042:
        r3 = r3.k;
        goto L_0x0050;
    L_0x0045:
        r0 = r3.j;
        if (r0 >= 0) goto L_0x001f;
    L_0x0049:
        goto L_0x004e;
    L_0x004a:
        r0 = r3.j;
        if (r0 <= 0) goto L_0x001f;
    L_0x004e:
        r3 = r3.j;
    L_0x0050:
        r3 = java.lang.Math.abs(r3);
    L_0x0054:
        r0 = 1;
        if (r3 != r0) goto L_0x0058;
    L_0x0057:
        goto L_0x0059;
    L_0x0058:
        r0 = 0;
    L_0x0059:
        r2.v = r0;
        r3 = r2.v;
        if (r3 == 0) goto L_0x0063;
    L_0x005f:
        r2.b(r1);
        return;
    L_0x0063:
        r3 = r2.o;
        r3.b();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sna.a(szb$c):void");
    }

    public final void a(szj szj) {
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append("glide:");
        stringBuilder.append(this.m);
        stringBuilder.append(" decrypt:");
        stringBuilder.append(this.l);
        stringBuilder.append(" cryptTask:false");
        szj.a(this.J.toString(), stringBuilder.toString());
    }

    public void a(szo szo) {
        super.a(szo);
        if (this.y) {
            this.b.b();
        }
    }

    public void a(szw szw) {
        this.j = System.currentTimeMillis();
        b(true);
        this.t.c();
        C().a("FOLD_LAYER_CONTENT_INTO_SHAPE", this.s);
    }

    /* Access modifiers changed, original: protected */
    public void a(boolean z) {
    }

    public final void a_(szw szw) {
        if (szw.c(skb.d)) {
            int i = 7.a[(this.F == sjo.PAUSED ? sqb.PAUSE : (sqb) szw.a(skb.d, sqb.PLAY)).ordinal()];
            if (i == 1) {
                this.o.e = sna.k(this.I);
                this.o.f = sna.l(this.I);
                O();
            } else if (i == 2) {
                this.o.e = sql.LOOPING;
                this.o.f = false;
            } else if (i == 3) {
                this.o.e = sql.PAUSED;
                sxn sxn = this.o;
                sxn.f = false;
                sxn.b(true);
            }
        }
    }

    public void ae_() {
        this.m = szj.a.NONE;
        this.l = szj.a.NONE;
        sqf sqf = (sqf) this.I.a(sqh.u);
        boolean z = true;
        if (sqf != null) {
            this.B = zgo.a();
            this.m = szj.a.START;
            this.d.setVisibility(4);
            this.k = true;
            this.d.postDelayed(this.p, 2000);
            this.u = new tac(this.C);
            this.g.a(D().a(sqf.a, sqf.b, 0, 0, this.u));
        } else {
            this.d.setVisibility(8);
            this.i = sjn.MINIMALLY_DISPLAYED;
        }
        if (!P()) {
            LayoutParams layoutParams;
            if (((abtg.a) this.H.c(sqh.z, abtg.a.FILL_WIDTH)) == abtg.a.FILL_WIDTH) {
                this.d.c = true;
                layoutParams = new LayoutParams(-1, -2);
            } else {
                this.d.c = false;
                layoutParams = new LayoutParams(-1, -1);
            }
            this.d.b(false);
            layoutParams.gravity = ((sps) this.I.c(sqh.v, sps.MIDDLE_CENTER)).a();
            this.d.setLayoutParams(layoutParams);
        }
        m();
        this.o.e = sna.k(this.I);
        this.o.f = sna.l(this.I);
        this.o.g = this.I.a(sqh.x, false);
        sxn sxn = this.o;
        if (sna.j(this.I)) {
            z = false;
        }
        sxn.j = z;
        sxn.n();
        this.o.a(this.D);
        this.o.a(this.E);
        b(false);
        this.y = this.I.a(sqh.ca, false);
        this.x = ((Boolean) this.I.c(sqh.X, Boolean.FALSE)).booleanValue();
        this.n = Runnables.doNothing();
        if (this.x) {
            this.b.setBackgroundColor(-16777216);
        }
        if (this.y) {
            this.z = ((Float) this.I.c(sqh.Y, Float.valueOf(1.0f))).floatValue();
            this.b.c();
            this.t.a();
        } else {
            this.b.b();
            this.b.d();
        }
        this.b.e();
        this.b.a(A().b.y, "BVLVC");
    }

    public void b() {
        super.b();
        this.d.c = true;
        this.g.b();
        tac tac = this.u;
        if (tac != null) {
            tac.a();
            this.u = null;
        }
        this.d.removeCallbacks(this.p);
        this.b.removeCallbacks(this.A);
        this.o.b();
        this.o = null;
        this.r.a();
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        this.d.setLayoutParams(layoutParams);
        this.d.setVisibility(0);
        D().a(this.d);
        this.c.setLayoutParams(layoutParams);
        this.c.a(false);
        this.c.a = false;
        a(layoutParams);
        if (this.y) {
            this.t.b();
        }
        this.z = 1.0f;
        d(1.0f);
        this.b.b();
        this.b.d();
        this.b.e();
        this.i = sjn.NONE;
        this.h = false;
        this.v = false;
        this.k = false;
        this.f.a();
        q();
    }

    public final void b(float f) {
        OperaScalableCircleMaskFrameLayout operaScalableCircleMaskFrameLayout = this.b;
        sln.a(operaScalableCircleMaskFrameLayout, (float) operaScalableCircleMaskFrameLayout.getWidth(), f);
    }

    public final void b(Canvas canvas, int i) {
        if (i != 2 || !this.o.d() || this.o.f() <= 0 || this.o.e() <= 0) {
            i = this.d.getVisibility();
            this.d.setVisibility(0);
            this.b.draw(canvas);
            this.d.setVisibility(i);
            return;
        }
        c a = D().a(this.o.f(), this.o.e(), Config.ARGB_8888);
        this.o.a(a.c());
        canvas.drawBitmap(a.c(), (float) this.o.h(), (float) this.o.g(), null);
        a.b();
    }

    public void b(szw szw) {
        this.n.run();
        if (this.i != sjn.NONE) {
            this.i = sjn.MINIMALLY_DISPLAYED;
        }
        this.h = false;
        this.d.setVisibility(0);
        f(szw);
        this.o.b();
        C().c(this.s);
        if (szw != null) {
            szw.b(skj.av, Float.valueOf(this.t.b));
            szw.b(skj.au, Float.valueOf(this.t.c));
        }
        if (szw == null) {
            szw = Q();
        }
        C().a("VIDEO_PLAYBACK_INFO_COLLECTED", this.H, szw);
        z().a((Object) this);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A:{RETURN} */
    public final void b(boolean r11) {
        /*
        r10 = this;
        r0 = r10.h;	 Catch:{ all -> 0x00e2 }
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r10.k;	 Catch:{ all -> 0x00e2 }
        r1 = 1;
        r2 = 0;
        if (r0 != 0) goto L_0x0015;
    L_0x000b:
        if (r11 != 0) goto L_0x0013;
    L_0x000d:
        r0 = r10.F;	 Catch:{ all -> 0x00e2 }
        r3 = defpackage.sjo.STARTED;	 Catch:{ all -> 0x00e2 }
        if (r0 != r3) goto L_0x0015;
    L_0x0013:
        r0 = 1;
        goto L_0x0016;
    L_0x0015:
        r0 = 0;
    L_0x0016:
        if (r0 != 0) goto L_0x0027;
    L_0x0018:
        if (r11 != 0) goto L_0x0027;
    L_0x001a:
        r11 = r10.v;	 Catch:{ all -> 0x00e2 }
        if (r11 == 0) goto L_0x0025;
    L_0x001e:
        r11 = r10.S();	 Catch:{ all -> 0x00e2 }
        if (r11 == 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0027;
    L_0x0025:
        r11 = 0;
        goto L_0x0028;
    L_0x0027:
        r11 = 1;
    L_0x0028:
        r3 = r10.I;	 Catch:{ all -> 0x00e2 }
        r4 = defpackage.sqh.n;	 Catch:{ all -> 0x00e2 }
        r3 = r3.a(r4);	 Catch:{ all -> 0x00e2 }
        r3 = (defpackage.sqf) r3;	 Catch:{ all -> 0x00e2 }
        if (r3 != 0) goto L_0x0035;
    L_0x0034:
        return;
    L_0x0035:
        r4 = r3.a;	 Catch:{ all -> 0x00e2 }
        r4 = com.google.common.base.Strings.isNullOrEmpty(r4);	 Catch:{ all -> 0x00e2 }
        if (r4 == 0) goto L_0x004d;
    L_0x003d:
        r10.h = r1;	 Catch:{ all -> 0x00e2 }
        r11 = defpackage.sjn.ERROR;	 Catch:{ all -> 0x00e2 }
        r10.i = r11;	 Catch:{ all -> 0x00e2 }
        r11 = r10.D;	 Catch:{ all -> 0x00e2 }
        r0 = defpackage.abyh.MEDIA_ERROR_VALIDATION;	 Catch:{ all -> 0x00e2 }
        r1 = "NULL URI";
        r11.a(r0, r1);	 Catch:{ all -> 0x00e2 }
        return;
    L_0x004d:
        r1 = r10.b(r3);	 Catch:{ all -> 0x00e2 }
        if (r1 == 0) goto L_0x0073;
    L_0x0053:
        r1 = defpackage.szj.a.START;	 Catch:{ all -> 0x00e2 }
        r10.l = r1;	 Catch:{ all -> 0x00e2 }
        r4 = r10.r;	 Catch:{ all -> 0x00e2 }
        r5 = r3.a;	 Catch:{ all -> 0x00e2 }
        r6 = r3.b;	 Catch:{ all -> 0x00e2 }
        r7 = r10.L;	 Catch:{ all -> 0x00e2 }
        r1 = r10.J;	 Catch:{ all -> 0x00e2 }
        r8 = r1.toString();	 Catch:{ all -> 0x00e2 }
        r1 = r10.G;	 Catch:{ all -> 0x00e2 }
        r1 = r1.b;	 Catch:{ all -> 0x00e2 }
        r9 = r1.w;	 Catch:{ all -> 0x00e2 }
        r4.a(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00e2 }
        r1 = r10.r;	 Catch:{ all -> 0x00e2 }
        r1 = r1.a;	 Catch:{ all -> 0x00e2 }
        goto L_0x0075;
    L_0x0073:
        r1 = r3.a;	 Catch:{ all -> 0x00e2 }
    L_0x0075:
        r4 = com.google.common.base.Strings.isNullOrEmpty(r1);	 Catch:{ all -> 0x00e2 }
        if (r4 == 0) goto L_0x007c;
    L_0x007b:
        return;
    L_0x007c:
        r10.A();	 Catch:{ all -> 0x00e2 }
        r4 = r10.o;	 Catch:{ all -> 0x00e2 }
        r4.p = r2;	 Catch:{ all -> 0x00e2 }
        r4 = r10.o;	 Catch:{ all -> 0x00e2 }
        r5 = r3.b;	 Catch:{ all -> 0x00e2 }
        r4.c = r5;	 Catch:{ all -> 0x00e2 }
        r4 = r10.o;	 Catch:{ all -> 0x00e2 }
        r5 = r10.I;	 Catch:{ all -> 0x00e2 }
        r6 = defpackage.sqh.cS;	 Catch:{ all -> 0x00e2 }
        r5 = r5.a(r6);	 Catch:{ all -> 0x00e2 }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x00e2 }
        r4.d = r5;	 Catch:{ all -> 0x00e2 }
        r4 = r3.a();	 Catch:{ all -> 0x00e2 }
        r5 = 0;
        if (r4 == 0) goto L_0x00ad;
    L_0x009e:
        r4 = r10.o;	 Catch:{ all -> 0x00e2 }
        r3 = r3.d;	 Catch:{ all -> 0x00e2 }
        r3 = r3.a;	 Catch:{ all -> 0x00e2 }
        r4.q = r3;	 Catch:{ all -> 0x00e2 }
        r3 = r10.o;	 Catch:{ all -> 0x00e2 }
        r10.A();	 Catch:{ all -> 0x00e2 }
        r3.r = r5;	 Catch:{ all -> 0x00e2 }
    L_0x00ad:
        if (r11 == 0) goto L_0x00d3;
    L_0x00af:
        r11 = r10.o;	 Catch:{ all -> 0x00e2 }
        r11 = r11.m;	 Catch:{ all -> 0x00e2 }
        if (r11 != 0) goto L_0x00d3;
    L_0x00b5:
        r11 = r10.I;	 Catch:{ all -> 0x00e2 }
        r3 = defpackage.sqh.q;	 Catch:{ all -> 0x00e2 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x00e2 }
        r11 = r11.c(r3, r2);	 Catch:{ all -> 0x00e2 }
        r11 = (java.lang.Integer) r11;	 Catch:{ all -> 0x00e2 }
        r11 = r11.intValue();	 Catch:{ all -> 0x00e2 }
        if (r11 <= 0) goto L_0x00ce;
    L_0x00c9:
        r2 = r10.o;	 Catch:{ all -> 0x00e2 }
        r2.b(r11);	 Catch:{ all -> 0x00e2 }
    L_0x00ce:
        r11 = r10.o;	 Catch:{ all -> 0x00e2 }
        r11.a(r1, r5);	 Catch:{ all -> 0x00e2 }
    L_0x00d3:
        if (r0 == 0) goto L_0x00e1;
    L_0x00d5:
        r11 = r10.o;	 Catch:{ all -> 0x00e2 }
        r11 = r11.m;	 Catch:{ all -> 0x00e2 }
        if (r11 == 0) goto L_0x00e1;
    L_0x00db:
        r10.N();	 Catch:{ all -> 0x00e2 }
        r10.n();	 Catch:{ all -> 0x00e2 }
    L_0x00e1:
        return;
    L_0x00e2:
        r11 = move-exception;
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sna.b(boolean):void");
    }

    public void c(szw szw) {
        b(true);
        O();
    }

    public final /* bridge */ /* synthetic */ View e() {
        return this.b;
    }

    public final void e(szw szw) {
        super.e(szw);
        if (this.y) {
            this.b.a();
        }
    }

    public void f(szw szw) {
        if (szw != null) {
            szw.a(Q());
        }
    }

    public boolean h() {
        return true;
    }

    public abstract void m();

    /* Access modifiers changed, original: protected */
    public void n() {
    }

    /* Access modifiers changed, original: final */
    public final void o() {
        if (this.K) {
            z().m();
        }
    }

    public abstract boolean p();

    /* Access modifiers changed, original: final */
    public final void q() {
        int i = this.B;
        if (i != -1) {
            zgo.a(i);
            this.B = -1;
        }
    }
}
