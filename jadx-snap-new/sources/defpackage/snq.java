package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.widget.ImageView;
import com.google.common.base.Strings;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.siw.a;
import defpackage.siw.c;
import defpackage.szc.b;

/* renamed from: snq */
public class snq extends slm {
    final View a;
    final sjc b;
    boolean c;
    sjn d;
    int e;
    private final absl f;
    private final ImageView g;
    private final LoadingSpinnerView h;
    private final View i;
    private boolean j;
    private String k;
    private int l;
    private int m;
    private a n;
    private final b o;

    /* renamed from: snq$1 */
    class 1 implements AnimatorUpdateListener {
        1() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            snq.this.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: snq$2 */
    class 2 implements a {
        2() {
        }

        public final void a(String str, ImageView imageView, int i, int i2, c cVar) {
            snq.this.b.b(cVar);
            snq.this.d = sjn.FULLY_DISPLAYED;
            snq.this.z().m();
            snq.this.z().n();
        }

        public final void a(String str, ImageView imageView, Exception exception) {
            sqf sqf = (sqf) snq.this.H.a(sqh.cv);
            if (sqf != null && sqf.c) {
                snq.this.z().b(szw.a(skj.w, exception != null ? exception.getMessage() : "Unknown reason", skj.x, abyh.MEDIA_ERROR_MISSING_FILE));
            }
        }
    }

    /* renamed from: snq$3 */
    class 3 implements b {
        3() {
        }

        public final void T_() {
        }

        public final void a(int i, float f, PointF pointF, float f2) {
            if (snq.this.c && snq.this.a.getBackground() != null && snq.this.I.a(sqh.bl) == sqa.LOADED) {
                double abs = (double) Math.abs(f * ((float) snq.this.e));
                if (abs < 0.15d) {
                    snq snq = snq.this;
                    Double.isNaN(abs);
                    snq.d((float) (abs / 0.15d));
                    return;
                }
                snq.this.d(1.0f);
            }
        }

        public final void a(int i, int i2, Point point) {
        }

        public final void a(int i, int i2, boolean z) {
            snq.this.e = i2;
        }
    }

    private snq(absl absl, View view) {
        this.c = false;
        this.d = sjn.NONE;
        this.n = new 2();
        this.o = new 3();
        this.f = absl;
        this.i = view;
        this.g = (ImageView) view.findViewById(R.id.logo_view_horizontal);
        this.g.setMinimumWidth(this.f.a() / 3);
        this.g.setMaxWidth(this.f.a() / 3);
        this.g.setMinimumHeight(1);
        this.i.setBackgroundColor(-16777216);
        this.h = (LoadingSpinnerView) view.findViewById(R.id.loading_screen_progress_bar);
        this.a = view.findViewById(R.id.logo_layout);
        this.b = new sjc("LogoLayerViewController");
    }

    public snq(Context context) {
        this(new absl(context), View.inflate(context, R.layout.logo_view, null));
    }

    private void m() {
        this.j = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) (this.m / 168), MapboxConstants.MINIMUM_ZOOM});
        ofFloat.addUpdateListener(new 1());
        ofFloat.setStartDelay(300);
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    private boolean n() {
        return this.h.getAlpha() > MapboxConstants.MINIMUM_ZOOM;
    }

    public final sjn E() {
        return this.d;
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        this.l = sqh.a(sqh.g, -16777216);
        if (this.a.getBackground() == null) {
            this.a.setBackgroundColor(this.l);
            d(1.0f);
        }
        if (Strings.isNullOrEmpty(this.k)) {
            this.k = this.H.d(sqh.ac);
            if (!Strings.isNullOrEmpty(this.k)) {
                this.b.a();
                this.b.a(D().a(this.k, null, this.g, this.n));
            }
        }
        if (this.I.a(sqh.bl) == sqa.LOADING) {
            this.h.b(1);
            d(1.0f);
        } else if (this.j || !this.c) {
            this.h.setAlpha(MapboxConstants.MINIMUM_ZOOM);
            this.i.getBackground().setAlpha(0);
        } else {
            m();
        }
    }

    public final void a(szw szw) {
        this.j = false;
        if (!this.c && this.I.a(sqh.bl) == sqa.LOADED) {
            m();
        }
        this.c = true;
    }

    public final void ae_() {
        this.l = this.H.a(sqh.g, -16777216);
        this.a.setBackgroundColor(this.l);
        this.k = this.H.d(sqh.ac);
        this.c = false;
        if (!Strings.isNullOrEmpty(this.k)) {
            this.b.a(D().a(this.k, null, this.g, this.n));
        }
        d(1.0f);
        this.a.setVisibility(0);
        z().a(this.o);
    }

    public final void b() {
        super.b();
        this.b.b();
        D().a(this.g);
        this.d = sjn.NONE;
        z().b(this.o);
    }

    public final void b(szw szw) {
        this.c = false;
        d(1.0f);
    }

    /* Access modifiers changed, original: final */
    public final void d(float f) {
        this.m = (int) (168.0f * f);
        this.a.getBackground().setAlpha(this.m);
        this.g.setAlpha(f);
        if (n()) {
            this.h.setAlpha(f);
            this.i.getBackground().setAlpha((int) (f * 255.0f));
            return;
        }
        this.h.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        this.i.getBackground().setAlpha(0);
    }

    public final View e() {
        return this.i;
    }

    public final String f() {
        return "LOGO";
    }

    public final boolean h() {
        return true;
    }
}
