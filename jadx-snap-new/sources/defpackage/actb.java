package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: actb */
public final class actb {
    public static final Interpolator a = new a();
    final int b;
    int c;
    int d;
    public final cgi e;
    acuh f;
    acuh g;
    private final long h;
    private final List<Float> i = new ArrayList();

    /* renamed from: actb$a */
    public static class a implements Interpolator {
        public final float getInterpolation(float f) {
            return (2.0f * f) - (f * f);
        }
    }

    public actb(cgi cgi, long j, int i) {
        this.e = cgi;
        this.h = j;
        this.b = i;
    }

    public final List<Float> a(long j) {
        this.i.clear();
        j -= this.h;
        double d = (double) j;
        Double.isNaN(d);
        j -= ((long) Math.floor(d / 1600.0d)) * 1600;
        long j2 = 0;
        int i = 0;
        while (((long) i) < 3 && j2 <= j) {
            this.i.add(Float.valueOf((((float) j) - ((float) j2)) / 1000.0f));
            i++;
            j2 += 200;
        }
        return this.i;
    }

    public final void a(acuh acuh) {
        this.f = acuh;
    }

    public final void b(acuh acuh) {
        this.g = acuh;
    }
}
