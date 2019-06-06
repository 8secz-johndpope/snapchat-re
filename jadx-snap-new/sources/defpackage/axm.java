package defpackage;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.axg.b;
import java.util.List;

/* renamed from: axm */
public final class axm {
    private static b r = b.f;
    private static b s = b.g;
    Resources a;
    int b = MapboxConstants.ANIMATION_DURATION;
    public float c = MapboxConstants.MINIMUM_ZOOM;
    Drawable d = null;
    b e;
    Drawable f;
    b g;
    Drawable h;
    b i;
    Drawable j;
    b k;
    b l;
    Drawable m;
    List<Drawable> n;
    Drawable o;
    axp p;
    boolean q;
    private Matrix t;
    private PointF u;
    private ColorFilter v;

    public axm(Resources resources) {
        this.a = resources;
        b bVar = r;
        this.e = bVar;
        this.f = null;
        this.g = bVar;
        this.h = null;
        this.i = bVar;
        this.j = null;
        this.k = bVar;
        this.l = s;
        this.t = null;
        this.u = null;
        this.v = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public final axl a() {
        List<Object> list = this.n;
        if (list != null) {
            for (Object a : list) {
                auh.a(a);
            }
        }
        return new axl(this);
    }

    public final axm a(b bVar) {
        this.l = bVar;
        this.t = null;
        return this;
    }
}
