package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.opera.view.FitWidthImageView;
import com.snap.opera.view.OperaScalableCircleMaskFrameLayout;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.siw.a;
import defpackage.siw.c;

/* renamed from: sno */
public class sno extends slm {
    public static final Predicate<sqh> c = -$$Lambda$sno$0KgViKIgFi56c9cguQpI3ow6zFc.INSTANCE;
    private OnClickListener A;
    private a B;
    private ViewGroup a;
    protected sjn b;
    protected final ViewGroup d;
    final sjc e;
    protected ObjectAnimator f;
    protected ObjectAnimator g;
    int h;
    private ViewGroup i;
    private final Button j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private View n;
    private TextView o;
    private TextView p;
    private final LoadingSpinnerView q;
    private final FitWidthImageView r;
    private final OperaScalableCircleMaskFrameLayout s;
    private final LayoutParams t;
    private final tcj u;
    private boolean v;
    private float w;
    private final szq x;
    private boolean y;
    private final Runnable z;

    /* renamed from: sno$3 */
    class 3 implements OnClickListener {
        3() {
        }

        public final void onClick(View view) {
            sno.this.b = sjn.PREPARING;
            sno.this.n();
            sno sno = sno.this;
            sno.a("LOADING_RETRY_CLICKED", sno.H);
        }
    }

    /* renamed from: sno$4 */
    class 4 implements a {
        4() {
        }

        public final void a(String str, ImageView imageView, int i, int i2, c cVar) {
            sno.this.e.b(cVar);
            sno.this.b = sjn.MINIMALLY_DISPLAYED;
            sno sno = sno.this;
            sno.h = 3;
            sno.n();
            sno.this.p();
        }

        public final void a(String str, ImageView imageView, Exception exception) {
            sno.this.b = sjn.MINIMALLY_DISPLAYED;
            sno.this.n();
        }
    }

    /* renamed from: sno$2 */
    class 2 extends abtx {
        2() {
        }

        public final void onAnimationEnd(Animator animator) {
            sno.this.d.setVisibility(8);
        }
    }

    public sno(Context context) {
        this((ViewGroup) View.inflate(context, R.layout.loading_screen_layout, null));
    }

    private sno(ViewGroup viewGroup) {
        this.b = sjn.NONE;
        this.v = false;
        this.w = 1.0f;
        this.h = 1;
        this.x = new szq();
        this.y = false;
        this.z = new -$$Lambda$sno$fRAMOMrz8aoHtT7XrEnn4Mg9kYo(this);
        this.A = new 3();
        this.B = new 4();
        this.d = viewGroup;
        this.i = (ViewGroup) viewGroup.findViewById(R.id.loading_layout);
        this.a = (ViewGroup) viewGroup.findViewById(R.id.error_layout);
        this.j = (Button) viewGroup.findViewById(R.id.loading_error_button);
        this.k = (TextView) viewGroup.findViewById(R.id.loading_error_text);
        this.l = (TextView) viewGroup.findViewById(R.id.loading_error_subtext);
        this.m = (TextView) viewGroup.findViewById(R.id.loading_screen_subtext);
        this.q = (LoadingSpinnerView) viewGroup.findViewById(R.id.loading_screen_progress_bar);
        this.r = (FitWidthImageView) viewGroup.findViewById(R.id.loading_background_image);
        this.s = (OperaScalableCircleMaskFrameLayout) viewGroup.findViewById(R.id.loading_background_image_container);
        this.t = this.r.getLayoutParams();
        this.u = new tcj(this.r);
        this.e = new sjc("LoadingLayerViewController");
        this.q.b(3);
        this.n = viewGroup.findViewById(R.id.loading_debug_error_container);
        this.o = (TextView) viewGroup.findViewById(R.id.loading_debug_error_text);
        this.p = (TextView) viewGroup.findViewById(R.id.loading_debug_error_description);
    }

    private void I() {
        int a = (!sno.a(this.H) || sno.f(this.I) || sno.j(this.I)) ? this.I.a(sqh.bn, -16777216) : 0;
        a(a);
    }

    private /* synthetic */ void J() {
        this.y = true;
        a((Float) this.I.a(sqh.bm));
        this.y = false;
    }

    private void a(int i) {
        this.d.setBackgroundColor(i);
    }

    private static boolean a(sqh sqh) {
        return ((String) sqh.a(sqh.bq)) != null;
    }

    private static boolean b(sqh sqh, szw szw) {
        return ((((sjv) szw.a(sqh.bw)) == sjv.HIDE_ON_MEDIA_LOADED ? 1 : null) != null && (sno.f(szw) || sno.j(szw))) || sno.a(sqh);
    }

    private void d(float f) {
        FitWidthImageView fitWidthImageView = this.r;
        fitWidthImageView.setScaleX(this.w * f);
        fitWidthImageView.setScaleY(this.w * f);
        this.s.a(f);
    }

    private static boolean f(szw szw) {
        return ((sqa) szw.a(sqh.bl)) == sqa.LOADING;
    }

    private static boolean j(szw szw) {
        return ((sqa) szw.a(sqh.bl)) == sqa.RETRYABLE_ERROR;
    }

    private void q() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f = null;
        }
        objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.g = null;
        }
    }

    public final void C_() {
        if (VERSION.SDK_INT > 19) {
            ObjectAnimator objectAnimator = this.f;
            if (objectAnimator != null) {
                objectAnimator.pause();
            }
            objectAnimator = this.g;
            if (objectAnimator != null) {
                objectAnimator.pause();
            }
        }
        this.q.b(3);
    }

    public final sjn E() {
        return this.b;
    }

    public final void a(float f) {
        sln.a(this.d, MapboxConstants.MINIMUM_ZOOM, f);
    }

    public final void a(float f, float f2) {
        if (((Boolean) this.H.c(sqh.X, Boolean.FALSE)).booleanValue()) {
            f = f2;
        }
        d(f);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(AnimatorListener animatorListener) {
        this.f = ObjectAnimator.ofFloat(this.d, View.ALPHA, new float[]{this.d.getAlpha(), MapboxConstants.MINIMUM_ZOOM});
        this.f.setDuration(this.I.a(sqh.bC, 500));
        this.f.setInterpolator(new AccelerateInterpolator(1.5f));
        this.f.addListener(animatorListener);
        this.f.start();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Float f) {
        if (sno.f(this.I)) {
            if (f != null) {
                float floatValue = f.floatValue();
                LoadingSpinnerView loadingSpinnerView = this.q;
                float floatValue2 = loadingSpinnerView.b != null ? loadingSpinnerView.b.floatValue() : MapboxConstants.MINIMUM_ZOOM;
                if (floatValue2 != floatValue) {
                    if (floatValue2 == MapboxConstants.MINIMUM_ZOOM) {
                        loadingSpinnerView = this.q;
                        if (!(loadingSpinnerView.b != null && loadingSpinnerView.b.doubleValue() == ((double) floatValue) && loadingSpinnerView.a == 1)) {
                            loadingSpinnerView.a = 1;
                            loadingSpinnerView.b = Float.valueOf(floatValue);
                            loadingSpinnerView.postInvalidateOnAnimation();
                        }
                    } else {
                        this.g = ObjectAnimator.ofFloat(this.q, "progress", new float[]{floatValue2, floatValue});
                        this.g.setDuration(100);
                        this.g.setAutoCancel(true);
                        this.g.start();
                    }
                }
            } else {
                this.q.b(1);
            }
            this.m.setText(this.I.d(sqh.bo));
            if (this.h != 1) {
                this.s.setVisibility(0);
            } else {
                Bitmap bitmap = (Bitmap) this.H.a(sqh.bu);
                sqf sqf = (sqf) this.H.a(sqh.bs);
                if (bitmap != null) {
                    this.h = 3;
                    this.s.setVisibility(0);
                    this.r.setImageBitmap(bitmap);
                    this.b = sjn.MINIMALLY_DISPLAYED;
                    n();
                } else if (!(sqf == null || Strings.isNullOrEmpty(sqf.a))) {
                    this.h = 2;
                    this.s.setVisibility(0);
                    ((Integer) this.H.c(sqh.bt, Integer.valueOf(0))).intValue();
                    this.e.a(D().a(sqf.a, sqf.b, this.r, 0, 0, this.B));
                }
                Boolean bool = (Boolean) this.H.a(sqh.w);
                if (bool != null && bool.booleanValue()) {
                    this.u.a();
                }
                sps sps = (sps) this.H.a(sqh.v);
                if (sps != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.t);
                    layoutParams.gravity = sps.a();
                    this.r.setLayoutParams(layoutParams);
                }
            }
            p();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, szw szw) {
        C().a(str, szw);
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        this.m.setTextColor(szw.a(sqh.bB, -1));
        this.d.setBackgroundColor(szw.a(sqh.bn, -16777216));
        if (this.F.a()) {
            m();
        }
        Object obj = (((sqa) sqh.a(sqh.bl)) == sqa.RETRYABLE_ERROR && ((Boolean) sqh.c(sqh.bp, Boolean.FALSE)).booleanValue()) ? 1 : null;
        if (obj != null) {
            a("LOADING_NON_RETRYABLE_ERROR", this.H);
        }
    }

    public final void a(szo szo) {
        super.a(szo);
        if (this.v) {
            this.s.b();
        }
    }

    public final void a(szw szw) {
        m();
    }

    public final void ae_() {
        this.d.setAlpha(1.0f);
        this.d.setVisibility(0);
        I();
        this.r.b(false);
        this.v = this.I.a(sqh.ca, false);
        if (this.G != null) {
            this.s.a(this.G.b.y, "LLVC");
        }
        if (this.v) {
            this.w = ((Float) this.I.c(sqh.Y, Float.valueOf(1.0f))).floatValue();
            this.s.a();
            this.s.c();
            return;
        }
        this.s.b();
        this.s.d();
    }

    public final void b() {
        super.b();
        this.b = sjn.NONE;
        this.e.b();
        D().a(this.r);
        this.w = 1.0f;
        this.v = false;
        d(1.0f);
        this.s.b();
        this.s.d();
        this.r.setLayoutParams(this.t);
        this.h = 1;
        this.u.b();
        this.q.b(3);
        LoadingSpinnerView loadingSpinnerView = this.q;
        if (loadingSpinnerView.b != null) {
            loadingSpinnerView.b = null;
            loadingSpinnerView.postInvalidateOnAnimation();
        }
        q();
    }

    public final void b(float f) {
        ViewGroup viewGroup = this.d;
        sln.a(viewGroup, (float) viewGroup.getWidth(), f);
    }

    public final void b(szw szw) {
        this.x.removeCallbacks(this.z);
        q();
    }

    public final void b(final szw szw, final sjp sjp) {
        this.x.removeCallbacks(this.z);
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator == null || !(objectAnimator.isStarted() || this.g.isRunning())) {
            super.b(szw, sjp);
        } else {
            a(new abtx() {
                public final void onAnimationEnd(Animator animator) {
                    sno.this.d.setVisibility(8);
                    super.b(szw, sjp);
                }
            });
        }
    }

    public final void c(szw szw) {
        if (VERSION.SDK_INT > 19) {
            ObjectAnimator objectAnimator = this.f;
            if (objectAnimator != null) {
                objectAnimator.resume();
            }
            objectAnimator = this.g;
            if (objectAnimator != null) {
                objectAnimator.resume();
            }
        }
        this.q.b(1);
    }

    public final View e() {
        return this.d;
    }

    public final void e(szw szw) {
        super.e(szw);
        if (this.v) {
            this.s.a();
        }
    }

    public final String f() {
        return "LOADING";
    }

    public final boolean h() {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void m() {
        this.I.a(sqh.bl);
        I();
        if (sno.f(this.I) || sno.j(this.I) || sno.a(this.H)) {
            ObjectAnimator objectAnimator = this.f;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f = null;
            }
            objectAnimator = this.g;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.g = null;
            }
            this.d.setAlpha(1.0f);
            this.d.setVisibility(0);
            this.a.setVisibility(8);
            this.j.setClickable(false);
            this.i.setVisibility(8);
            this.s.setVisibility(8);
            this.n.setVisibility(8);
            if (sno.f(this.I) && !this.y) {
                this.x.postDelayed(this.z, 500);
            }
            if (sno.j(this.I)) {
                o();
            }
            if (sno.a(this.H)) {
                this.n.setVisibility(0);
                String str = "";
                this.o.setText((CharSequence) this.H.c(sqh.bq, str));
                this.p.setText((CharSequence) this.H.c(sqh.br, str));
            }
        }
        if (!sno.b(this.H, this.I)) {
            if (this.F != sjo.STARTED) {
                this.d.setVisibility(8);
            } else if (this.f == null) {
                a(new 2());
            }
            this.b = sjn.PREPARING;
            n();
        }
    }

    /* Access modifiers changed, original: protected */
    public void n() {
        if (this.K) {
            z().m();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void o() {
        this.a.setVisibility(0);
        String d = this.I.d(sqh.bA);
        if (Strings.isNullOrEmpty(d)) {
            this.j.setVisibility(8);
        } else {
            this.j.setText(d);
            this.j.setOnClickListener(this.A);
        }
        String str = "";
        this.k.setText(this.I.a(sqh.by, str));
        this.l.setText(this.I.a(sqh.bz, str));
        a("LOADING_RETRY_DISPLAYED", this.H);
        this.b = sjn.FULLY_DISPLAYED;
        n();
    }

    /* Access modifiers changed, original: final */
    public final void p() {
        if (sno.f(this.I)) {
            ViewGroup viewGroup;
            int i;
            Boolean bool = (Boolean) this.H.a(sqh.bv);
            if (bool != null && bool.booleanValue() && this.h == 3) {
                viewGroup = this.i;
                i = 8;
            } else {
                viewGroup = this.i;
                i = 0;
            }
            viewGroup.setVisibility(i);
        }
    }
}
