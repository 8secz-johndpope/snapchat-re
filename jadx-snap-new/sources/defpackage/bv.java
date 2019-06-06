package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: bv */
public final class bv extends bw {
    float a = MapboxConstants.MINIMUM_ZOOM;

    public final void a(int i) {
        if (this.f == 0 || this.a != ((float) i)) {
            this.a = (float) i;
            if (this.f == 1) {
                c();
            }
            d();
        }
    }

    public final void b() {
        super.b();
        this.a = MapboxConstants.MINIMUM_ZOOM;
    }
}
