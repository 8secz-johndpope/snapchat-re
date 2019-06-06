package defpackage;

import android.opengl.GLES20;
import android.os.SystemClock;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ebf.a;
import java.util.Collection;

/* renamed from: dyr */
public final class dyr implements dyq {
    private final eda a = new dyx();
    private final adie b = new adie();

    public final void a() {
    }

    public final void a(dxz dxz, aipn<ebf> aipn, dzb dzb, int i, float[] fArr, int i2, long j, long j2, adie adie, Collection<dvl> collection, boolean z, boolean z2, boolean z3, boolean z4, float f) {
        adie adie2;
        Object obj;
        int i3;
        boolean a;
        int b;
        Object obj2;
        adie e;
        adie adie3;
        int i4 = i;
        this.a.e();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        adic adic = adic.EXTERNAL_OES;
        boolean z5 = false;
        if (dzb.a()) {
            adie2 = adie;
            obj = fArr;
            i3 = i2;
            a = dzb.a(i3, adic, obj, adie2.b);
        } else {
            dzb dzb2 = dzb;
            obj = fArr;
            i3 = i2;
            adie2 = adie;
            a = false;
        }
        if (a) {
            b = dzb.b();
            adic = dzb.c();
            obj2 = dzb.d().b;
            e = dzb.e();
        } else {
            e = adie2;
            obj2 = obj;
            b = i3;
        }
        Object obj3 = (((ebf) aipn.get()).e() && ((ebf) aipn.get()).f()) ? 1 : null;
        Object obj4 = (((ebf) aipn.get()).g() && ((ebf) aipn.get()).f()) ? 1 : null;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (obj3 != null) {
            adie3 = e;
            ((ebf) aipn.get()).a(b, adic == adic.EXTERNAL_OES ? 36197 : 3553, j, obj2, e.b, z2, z3, z4);
        } else {
            adie3 = e;
        }
        this.a.a(SystemClock.elapsedRealtime() - elapsedRealtime2);
        boolean h = ((ebf) aipn.get()).h();
        for (dvl dvl : collection) {
            try {
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                eda eda = this.a;
                Object obj5 = (!dvl.a.c || obj4 == null) ? null : 1;
                dvl.b.b();
                dyo dyo;
                adic adic2;
                adie adie4;
                int i5;
                boolean z6;
                adie a2;
                if (i4 == 3) {
                    GLES20.glClearColor(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f);
                    GLES20.glClear(16384);
                    aipn.get();
                    dyo = dvl.c;
                    adic2 = adic.TEXTURE_2D;
                    adie4 = i;
                    dyo.a(-1, adic2, j2, adie4, adie4, !z4, eda, z, MapboxConstants.MINIMUM_ZOOM);
                } else if (h && obj5 != null) {
                    a aVar;
                    int a3;
                    adie adie5;
                    if (!dvl.a.e) {
                        if (!z4) {
                            aVar = a.Preview;
                            a3 = ((ebf) aipn.get()).a(aVar, z5);
                            if (a3 == 0 && aVar == a.Preview) {
                                aVar = a.Default;
                                a3 = ((ebf) aipn.get()).a(aVar, z5);
                            }
                            i5 = a3;
                            ((ebf) aipn.get()).a(aVar, this.b.b, z5, true);
                            dyo = dvl.c;
                            adic2 = adic.TEXTURE_2D;
                            adie5 = this.b;
                            adie4 = i;
                            z6 = i4 == 2 && !z4;
                            dyo.a(i5, adic2, j2, adie5, adie4, z6, eda, z, MapboxConstants.MINIMUM_ZOOM);
                        }
                    }
                    aVar = a.Default;
                    a3 = ((ebf) aipn.get()).a(aVar, z5);
                    aVar = a.Default;
                    a3 = ((ebf) aipn.get()).a(aVar, z5);
                    i5 = a3;
                    ((ebf) aipn.get()).a(aVar, this.b.b, z5, true);
                    dyo = dvl.c;
                    adic2 = adic.TEXTURE_2D;
                    adie5 = this.b;
                    adie4 = i;
                    if (i4 == 2) {
                    }
                    dyo.a(i5, adic2, j2, adie5, adie4, z6, eda, z, MapboxConstants.MINIMUM_ZOOM);
                } else if (a) {
                    i5 = dzb.b();
                    dyo dyo2 = dvl.c;
                    adic2 = adic.TEXTURE_2D;
                    a2 = new adie((float[]) obj2.clone()).a(-0.5f, -0.5f).b(2.0f, 2.0f).d().b(0.5f, 0.5f).a(0.5f, 0.5f);
                    z6 = (i4 == 2 || z4) ? false : true;
                    dyo2.a(i5, adic2, j2, a2, adie3, z6, eda, z, MapboxConstants.MINIMUM_ZOOM);
                } else {
                    aipn.get();
                    dyo dyo3 = dvl.c;
                    adic2 = adic.EXTERNAL_OES;
                    a2 = new adie((float[]) obj2.clone()).a(-0.5f, -0.5f).d().a(0.5f, 0.5f);
                    z6 = (i4 == 2 || z4) ? false : true;
                    dyo3.a(b, adic2, j2, a2, adie3, z6, eda, z, MapboxConstants.MINIMUM_ZOOM);
                }
                this.a.c(dvl.a.a, SystemClock.elapsedRealtime() - elapsedRealtime3);
                z5 = false;
            } catch (dxx e2) {
                this.a.c(dvl.a.a, -1);
                this.a.b(dvl.a.a, -1);
                throw new dxx(String.format("error in rendering, surfaceType %s", new Object[]{dvl.a.a}), e2);
            }
        }
        aipn.get();
        for (dvl a4 : collection) {
            a4.a(this.a, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
    }
}
