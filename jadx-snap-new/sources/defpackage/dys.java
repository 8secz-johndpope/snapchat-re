package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.dyp.2;
import java.util.Collection;
import java.util.Collections;

/* renamed from: dys */
public final class dys {
    public final aipn<ebf> a;
    public final dzb b;
    public final dyp c;
    public float d = 1.0f;
    public float e = MapboxConstants.MINIMUM_ZOOM;
    public int f = 1;
    public adie g = new adie();
    private final absc h;
    private final dyr i;
    private final adhk j;
    private boolean k;
    private dyq l;

    public dys(aipn<ebf> aipn, dzb dzb, gqr gqr, boolean z, absc absc, abre abre, adhk adhk) {
        this.k = z;
        this.a = aipn;
        this.b = dzb;
        this.h = absc;
        this.j = adhk;
        this.i = new dyr();
        this.c = new dyp(gqr, abre, this.j, dpg.a());
        this.l = this.i;
    }

    public static adie a(float f, float f2) {
        return new adie().b(f, f).a(MapboxConstants.MINIMUM_ZOOM, f2);
    }

    public final void a(dxz dxz, float[] fArr, int i, long j, long j2, dvl dvl) {
        this.l.a(dxz, this.a, this.b, 3, fArr, i, j, j2, this.g, Collections.singleton(dvl), false, false, false, false, MapboxConstants.MINIMUM_ZOOM);
    }

    public final void a(dxz dxz, float[] fArr, int i, long j, long j2, Collection<dvl> collection, boolean z, boolean z2, boolean z3, boolean z4) {
        this.l.a(dxz, this.a, this.b, this.f, fArr, i, j, j2, this.g, collection, z, z2, z3, z4, MapboxConstants.MINIMUM_ZOOM);
    }

    public final void a(edf edf) {
        abtl abtl = edf.b;
        ede ede = edf.a;
        ((ebf) this.a.get()).a((ede.c + this.h.a()) % 360);
        ((ebf) this.a.get()).a(ede.a());
        ((ebf) this.a.get()).a(abtl, edf.c, edf.d);
        dyp dyp = this.c;
        int b = abtl.b();
        int c = abtl.c();
        abrd b2 = dyp.c.b();
        abtl abtl2 = new abtl(b, c);
        c = 2.a[b2.ordinal()];
        abtl = c != 1 ? c != 2 ? new abtl(1920, 1080) : new abtl(640, 360) : new abtl(1280, 720);
        double b3 = (double) (abtl.b() * abtl.c());
        double b4 = (double) (abtl2.b() * abtl2.c());
        if (b4 >= b3) {
            Double.isNaN(b3);
            Double.isNaN(b4);
            b3 = Math.sqrt(b3 / b4);
            b4 = (double) abtl2.b();
            Double.isNaN(b4);
            int i = (((int) (b4 * b3)) / 4) << 2;
            double c2 = (double) abtl2.c();
            Double.isNaN(c2);
            abtl2 = new abtl(i, (((int) (c2 * b3)) / 4) << 2);
        }
        if (!(dyp.e == null || abtl2.equals(dyp.e.d))) {
            dyp.b();
        }
        int b5 = abtl2.b();
        int c3 = abtl2.c();
        if (dyp.e == null) {
            dyp.e = new dvx(dyp.b.G(), b5, c3, new dyf(dyp.d), dyp.d, dyp);
            dyp.f = dyp.e.g;
        }
        int i2 = dyp.e.g;
    }

    public final void a(Collection<dvl> collection) {
        if (this.k) {
            Object obj = null;
            for (dvl dvl : collection) {
                if (dvl.e != null) {
                    obj = 1;
                    break;
                }
            }
            dyq dyq = this.l;
            this.l = obj != null ? this.c : this.i;
            if (dyq != this.l) {
                dyq.a();
                this.l.a();
            }
        }
    }
}
