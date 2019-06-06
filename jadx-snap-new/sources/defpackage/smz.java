package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.Runnables;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.opera.view.OperaScalableCircleMaskFrameLayout;
import defpackage.siw.c;
import defpackage.szj.a;
import java.io.IOException;
import java.util.Locale;

/* renamed from: smz */
public abstract class smz extends slm {
    protected final abth a;
    protected final sjc b;
    final OperaScalableCircleMaskFrameLayout c;
    protected boolean d;
    protected int e;
    protected int f;
    sjn g;
    Runnable h;
    a i;
    final sll j;
    private Context k;
    private final absl l;
    private sjn m;
    private tcj n;
    private boolean o;
    private float p;
    private tac q;
    private int r;
    private boolean s;
    private final ski t;
    private ski u;
    private siw.a v;

    /* renamed from: smz$1 */
    class 1 implements ski {
        1() {
        }

        private /* synthetic */ void a() {
            smz.a(smz.this);
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            smz.this.j.a((sqo) szw2.a(sqh.cN));
            smz.this.h = new -$$Lambda$smz$1$jIuC1_VClQRQKXSuyl0C0gxQ-PY(this);
        }
    }

    /* renamed from: smz$2 */
    class 2 implements siw.a {
        2() {
        }

        public final void a(String str, ImageView imageView, int i, int i2, c cVar) {
            smz.this.b.b(cVar);
            smz smz = smz.this;
            smz.f = i;
            smz.e = i2;
            OperaScalableCircleMaskFrameLayout operaScalableCircleMaskFrameLayout = smz.c;
            iia iia = new iia(smz.this.f, smz.this.e);
            akcr.b(iia, MapboxEvent.KEY_RESOLUTION);
            operaScalableCircleMaskFrameLayout.a = iia;
            if (Strings.isNullOrEmpty(str)) {
                smz.this.i = a.ON_SUCCESS_WITH_NULL;
                smz.this.g = sjn.ERROR;
                smz.this.m();
                smz.this.z().b(szw.a(skj.A, aasc.IMAGE, skj.w, "Glide - On Success With Null", skj.x, abyh.MEDIA_ERROR_VALIDATION));
                return;
            }
            smz.this.i = a.DONE;
            smz.this.a(cVar);
            smz.this.p();
        }

        public final void a(String str, ImageView imageView, Exception exception) {
            smz.this.i = a.ON_FAILED;
            smz.this.a(exception);
            smz.this.p();
        }
    }

    /* renamed from: smz$a */
    class a extends tac {
        private int b;
        private int c;

        a(defpackage.siw.a aVar, int i, int i2) {
            super(aVar);
            this.b = i;
            this.c = i2;
        }

        public final void a(String str, ImageView imageView, int i, int i2, c cVar) {
            if (!this.a && smz.this.G.b.z.g && (i > smz.this.c.getWidth() || i2 > smz.this.c.getHeight())) {
                smz.this.A().b.y.report(new RuntimeException("Fetched a Bitmap with too high resolution for this device"), String.format(Locale.US, "highRes:%dx%d, hint:%dx%d, container:%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(smz.this.c.getWidth()), Integer.valueOf(smz.this.c.getHeight())}));
            }
            super.a(str, imageView, i, i2, cVar);
        }
    }

    private smz(absl absl, Context context, OperaScalableCircleMaskFrameLayout operaScalableCircleMaskFrameLayout, abth abth) {
        this.g = sjn.NONE;
        this.m = sjn.NONE;
        this.o = false;
        this.p = 1.0f;
        this.h = Runnables.doNothing();
        this.i = a.NONE;
        this.r = -1;
        this.s = false;
        this.t = new 1();
        this.u = new -$$Lambda$smz$anCrgKi71ElCMmF3ck56r7d_CEE(this);
        this.v = new 2();
        this.k = context;
        this.l = absl;
        this.a = abth;
        this.c = operaScalableCircleMaskFrameLayout;
        this.j = new sll(context, this, this.a, operaScalableCircleMaskFrameLayout, this.l);
        this.b = new sjc("BaseImageLayerViewController");
        this.c.addView(this.a);
    }

    smz(Context context) {
        this(new absl(context), context, new OperaScalableCircleMaskFrameLayout(context), new abth(context));
    }

    private void K() {
        if (L()) {
            Object obj = 1;
            int i = 0;
            Object obj2 = (this.m == sjn.FULLY_DISPLAYED || this.m == sjn.ERROR) ? 1 : null;
            if (obj2 == null && !this.s) {
                obj = null;
            }
            abth abth = this.a;
            if (obj == null) {
                i = 8;
            }
            abth.setVisibility(i);
        }
    }

    private boolean L() {
        if (!this.K) {
            return false;
        }
        Object obj = (!this.I.c(sqh.K) || z().a((slm) this)) ? null : 1;
        return obj != null && A().b.z.k;
    }

    private /* synthetic */ void a(String str, szw szw, szw szw2) {
        if (!this.s) {
            this.s = true;
            K();
        }
    }

    private void d(float f) {
        this.a.setScaleX(this.p * f);
        this.a.setScaleY(this.p * f);
        this.c.a(f);
    }

    public final sjn E() {
        return this.g;
    }

    public final boolean H() {
        sqf sqf = (sqf) this.I.a(sqh.cv);
        return sqf != null && sqf.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final void I() {
        LayoutParams layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) MoreObjects.firstNonNull((LayoutParams) this.a.getLayoutParams(), new LayoutParams(-1, -1));
        if (this.I.a(sqh.bZ, false)) {
            this.a.a(true);
            if (this.I.c(sqh.K)) {
                this.a.a = false;
            } else {
                this.a.a = true;
            }
            int a = this.l.a();
            int c = this.l.c();
            MarginLayoutParams a2 = abti.a(this.k, a, c, this.f, this.e, a, c);
            layoutParams2.setMargins(a2.leftMargin, a2.topMargin, a2.rightMargin, a2.bottomMargin);
            layoutParams = new LayoutParams(-1, -1);
        } else {
            this.a.a(false);
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams = new LayoutParams(-1, -1);
        }
        layoutParams.gravity = ((sps) this.I.a(sqh.cw, sps.TOP_CENTER)).a();
        this.a.setLayoutParams(layoutParams2);
        if (!J()) {
            a(layoutParams);
        }
        z().n();
        this.g = sjn.FULLY_DISPLAYED;
        m();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean J() {
        return this.G.b.z.a;
    }

    public final void a(float f) {
        sln.a(this.c, MapboxConstants.MINIMUM_ZOOM, f);
    }

    public final void a(float f, float f2) {
        if (this.o) {
            if (f < 1.0f) {
                this.c.a();
            }
            d(f2);
            return;
        }
        d(f);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view) {
        new soc(this.f, this.e, view, ((sps) this.I.a(sqh.cw, sps.MIDDLE_CENTER)).a()).a();
    }

    public abstract void a(LayoutParams layoutParams);

    /* Access modifiers changed, original: protected|final */
    public final void a(Exception exception) {
        sjn sjn;
        sqf sqf = (sqf) this.I.a(sqh.cv);
        if (sqf == null || !sqf.c) {
            if (this.g == sjn.NONE) {
                sjn = sjn.FULLY_DISPLAYED;
            }
            m();
        }
        z().b(szw.a(skj.A, aasc.IMAGE, skj.w, exception != null ? exception.getMessage() : "Unknown reason", skj.x, exception instanceof IOException ? abyh.a((IOException) exception) : abyh.MEDIA_ERROR_PLAYBACK));
        sjn = sjn.ERROR;
        this.g = sjn;
        m();
    }

    public abstract void a(c cVar);

    public abstract void a(sqf sqf, int i, int i2, siw.a aVar);

    public final void a(szj szj) {
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append("glide:");
        stringBuilder.append(this.i);
        stringBuilder.append(" isCritical:");
        stringBuilder.append(H());
        szj.a(this.J.toString(), stringBuilder.toString());
    }

    public final void a(szo szo) {
        super.a(szo);
        if (this.o) {
            this.c.b();
        }
    }

    public void a(szw szw) {
        super.a(szw);
        C().a("FOLD_LAYER_CONTENT_INTO_SHAPE_IMAGE", this.t);
        if (L()) {
            C().a("VIDEO_FIRST_FRAME_RENDERED", this.u);
            C().a("VIDEO_PLAYBACK_STARTED", this.u);
        }
        tcj tcj = this.n;
        if (tcj != null) {
            tcj.c();
        }
        this.c.e();
    }

    public final void a_(szw szw) {
        if (szw.c(skb.p)) {
            sjn sjn = this.m;
            sjn sjn2 = (sjn) szw.a(skb.p);
            if (sjn == sjn.ERROR || sjn2 == sjn.ERROR) {
                sjn = sjn.ERROR;
            } else if (sjn.ordinal() <= sjn2.ordinal()) {
                sjn = sjn2;
            }
            this.m = sjn;
            K();
        }
    }

    public void ae_() {
        this.h = Runnables.doNothing();
        this.c.a(this.G.b.y, "BILVC");
        n();
        K();
    }

    public void b() {
        super.b();
        this.b.b();
        this.g = sjn.NONE;
        this.m = sjn.NONE;
        this.s = false;
        tac tac = this.q;
        if (tac != null) {
            tac.a();
            this.q = null;
        }
        this.e = 0;
        this.f = 0;
        this.j.a();
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        abth abth = this.a;
        abth.a = false;
        abth.a(false);
        this.a.setLayoutParams(layoutParams);
        this.a.setVisibility(0);
        this.p = 1.0f;
        this.c.b();
        this.c.d();
        tcj tcj = this.n;
        if (tcj != null) {
            tcj.b();
            this.n = null;
        }
        d(1.0f);
        p();
    }

    public final void b(float f) {
        OperaScalableCircleMaskFrameLayout operaScalableCircleMaskFrameLayout = this.c;
        sln.a(operaScalableCircleMaskFrameLayout, (float) operaScalableCircleMaskFrameLayout.getWidth(), f);
    }

    public void b(szw szw) {
        super.b(szw);
        this.h.run();
        C().c(this.u);
        C().c(this.t);
        p();
    }

    public final View e() {
        return this.c;
    }

    public final void e(szw szw) {
        super.e(szw);
        if (this.o) {
            this.c.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void m() {
        z().m();
    }

    /* Access modifiers changed, original: protected */
    public void n() {
        this.r = zgo.a();
        szw szw = this.I;
        this.i = a.NONE;
        sqf sqf = (sqf) this.I.a(sqh.cv);
        this.d = ((Boolean) this.I.c(sqh.C, Boolean.FALSE)).booleanValue();
        this.g = sjn.NONE;
        m();
        if (sqf != null) {
            this.i = a.START;
            int a = szw.a(sqh.D, 0);
            int a2 = szw.a(sqh.E, 0);
            if (this.G.b.z.h && a == 0 && a2 == 0) {
                a = this.c.getWidth() == 0 ? 1080 : this.c.getWidth();
                a2 = this.c.getHeight() == 0 ? 1920 : this.c.getHeight();
            }
            this.q = new a(this.v, a, a2);
            a(sqf, a, a2, this.q);
        } else {
            this.g = sjn.FULLY_DISPLAYED;
            m();
        }
        this.o = ((Boolean) this.I.c(sqh.cd, Boolean.FALSE)).booleanValue();
        if (this.o) {
            this.p = ((Float) this.I.c(sqh.Y, Float.valueOf(1.0f))).floatValue();
            this.c.c();
            this.n = new tcj(this.a);
            this.n.a();
            return;
        }
        this.c.b();
        this.c.d();
    }

    /* Access modifiers changed, original: protected|final */
    public final abyc o() {
        soc soc = new soc(this.f, this.e, (byte) 0);
        return soc.a.a() ? soc.a.b() ? abyc.CENTER_INSIDE : abyc.CENTER_CROP : abyc.CENTER_CROP;
    }

    /* Access modifiers changed, original: final */
    public final void p() {
        int i = this.r;
        if (i != -1) {
            zgo.a(i);
            this.r = -1;
        }
    }

    /* Access modifiers changed, original: final */
    public final void q() {
        this.g = sjn.MINIMALLY_DISPLAYED;
        m();
    }
}
