package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import com.google.common.base.Predicate;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.elq.b;

/* renamed from: elw */
public final class elw implements b {
    private static final int a = 2131427738;
    private static final int b = 2131427737;
    private final ihx<ImageView> c;
    private final float d;
    private final long e;
    private final ajwo<Object> f = new ajwo();
    private final ajwr<Boolean> g = new ajwr();
    private eea h;

    public elw(ViewFinder viewFinder, Activity activity) {
        this.c = new ihx(new -$$Lambda$elw$2hDRF1CSBLZ60I8xtPqgb2RAY40(this, viewFinder));
        this.d = -activity.getResources().getDimension(R.dimen.camera_fade_out_animation_translation_y);
        this.e = (long) activity.getResources().getInteger(R.integer.camera_fade_out_animation_duration);
    }

    public final void a() {
        zil.a((View) this.c.get(), 0, 1.0f, MapboxConstants.MINIMUM_ZOOM);
    }

    public final void a(boolean z) {
        ((ImageView) this.c.get()).setSelected(z);
    }

    public final void b() {
        if (this.c.a()) {
            zil.a((View) this.c.get(), this.d, this.e);
        }
    }

    public final ajdp<Object> c() {
        return this.f.f();
    }

    public final ajdx<Boolean> d() {
        return ajvo.a(new ajsj(this.g));
    }

    public final Predicate<Void> e() {
        return this.h;
    }
}
