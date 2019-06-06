package defpackage;

import android.graphics.Color;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: aciq */
public final class aciq implements acis {
    private final int f;

    public aciq(int i) {
        this.f = i;
    }

    private void a(View view, float f) {
        int i = this.f;
        view.setBackgroundColor(Color.argb((int) (f * ((float) Color.alpha(i))), Color.red(i), Color.green(i), Color.blue(i)));
    }

    public final acis a() {
        return this;
    }

    public final void a(View view, achi<?, ?> achi) {
        view = achi.a.d;
        float f = achi.i;
        if ((achi.d == acgw.PRESENT ? 1 : null) == null) {
            f = 1.0f - f;
        }
        a(view, f);
    }

    public final void b(View view, achi<?, ?> achi) {
        view = achi.a.d;
        if (!achi.a.e().a()) {
            a(view, (float) MapboxConstants.MINIMUM_ZOOM);
        }
    }

    public final void c(View view, achi<?, ?> achi) {
        view = achi.a.d;
        if (!achi.a.e().a()) {
            a(view, (float) MapboxConstants.MINIMUM_ZOOM);
        }
    }
}
