package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;

/* renamed from: acoy */
public final class acoy {
    public ImageView a;
    public boolean b = false;
    private double c;

    /* renamed from: acoy$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            if (acoy.this.a != null) {
                acoy.this.a.setVisibility(8);
            }
        }
    }

    private /* synthetic */ void a(View view, aclg aclg, boolean z, OnClickListener onClickListener, double d, Boolean bool) {
        view = view.findViewById(bool.booleanValue() ? R.id.v2_map_compass : R.id.map_compass);
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        if (view instanceof ImageView) {
            this.a = (ImageView) view;
            this.a.setOnClickListener(onClickListener);
            acmj j = aclg.a.j();
            if (j != null && aclg.a.e()) {
                j.g();
            }
            a(z, d);
            this.b = z;
            this.c = d;
            return;
        }
        throw new IllegalStateException("You must have an ImageView in your view tree for the map compass");
    }

    public final void a(long j) {
        this.a.clearAnimation();
        this.a.setVisibility(0);
        this.a.animate().alpha(1.0f).setDuration(j).withLayer();
    }

    public final void a(View view, aclg aclg, boolean z, OnClickListener onClickListener, ajdx<Boolean> ajdx, zfw zfw, ajei ajei) {
        ajdw f = zfw.f();
        ajei.a(ajdx.b(f).a((ajdw) zfw.l()).a(new -$$Lambda$acoy$NSjT0f2LEE8sq1khn8gXu8tbJiA(this, view, aclg, z, onClickListener, 10.0d), -$$Lambda$acoy$_cORcSfo_opyePC4fzdy86xZ8Pc.INSTANCE));
    }

    public final void a(boolean z, double d) {
        if (!(z == this.b && Double.compare(this.c, d) == 0)) {
            if (z) {
                b(500);
            } else {
                a(500);
            }
        }
        this.b = z;
        this.c = d;
    }

    public final void b(long j) {
        this.a.clearAnimation();
        this.a.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(j).withLayer().withEndAction(new 1());
    }
}
