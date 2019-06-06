package defpackage;

import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.HashSet;
import java.util.Set;

/* renamed from: acuh */
public final class acuh {
    public Interpolator a;
    public float b;
    public float c;
    public long d;
    public float e;
    public int f;
    public boolean g;
    public boolean h;
    public Set<a> i = new HashSet();
    public boolean j;

    /* renamed from: acuh$a */
    public interface a {
        void onAnimationEnd(acuh acuh);
    }

    public acuh(float f, float f2, float f3, Interpolator interpolator) {
        this.b = f;
        this.c = f2;
        this.e = f3;
        this.a = interpolator;
        this.g = false;
        this.f = 1;
    }

    private float a(float f) {
        float f2 = this.b;
        return f2 + ((this.c - f2) * f);
    }

    public static acuh b() {
        acuh acuh = new acuh(1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, acun.a);
        acuh.a(1);
        return acuh;
    }

    public final void a(long j) {
        this.d = j;
        this.j = false;
    }

    public final void a(long j, float f, float f2, Interpolator interpolator) {
        if (a()) {
            this.b = !d(j) ? b(j) : this.c;
            this.c = f;
        }
        this.e = f2;
        this.a = interpolator;
    }

    public final boolean a() {
        return this.d != 0;
    }

    public final float b(long j) {
        return a(this.a.getInterpolation(c(j)));
    }

    public final float c(long j) {
        if (d(j)) {
            return 1.0f;
        }
        long j2 = this.d;
        if (j < j2) {
            return MapboxConstants.MINIMUM_ZOOM;
        }
        float f = ((float) (j - j2)) / this.e;
        return f - ((float) ((int) Math.floor((double) f)));
    }

    public final boolean d(long j) {
        return a() && ((float) (j - this.d)) / this.e >= ((float) this.f);
    }

    public final boolean e(long j) {
        return a() && !d(j);
    }
}
