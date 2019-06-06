package defpackage;

import com.snap.ui.view.surfaceview.SurfaceViewManager;

/* renamed from: dun */
public final class dun {
    public dqm a;
    public SurfaceViewManager b;
    public ebr c;
    public eil d;
    public duo<aeew> e;

    /* renamed from: dun$a */
    static class a {
        final float a;
        final float b;

        private a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        /* synthetic */ a(float f, float f2, byte b) {
            this(f, f2);
        }
    }

    private static a a(abtl abtl, int i, int i2, int i3) {
        if (!(i == 90 || i == 270)) {
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        float c = ((float) abtl.c()) / ((float) abtl.b());
        float f = ((float) i2) / ((float) i3);
        return c > f ? new a(f / c, 1.0f, (byte) 0) : new a(1.0f, c / f, (byte) 0);
    }

    /* Access modifiers changed, original: final */
    public final void a(aeew aeew, String str) {
        aeew.f = this.a.g().name();
        aeew.k = Boolean.valueOf(this.a.a());
        aeew.j = Boolean.valueOf(this.c.a);
        aeew.i = Long.valueOf(System.currentTimeMillis());
        aeew.w = this.d.a(str);
        a a = dun.a(this.b.getSurfaceViewResolution(), aeew.b.intValue(), aeew.q.intValue(), aeew.p.intValue());
        aeew.d = Float.valueOf(a.a);
        aeew.e = Float.valueOf(a.b);
        this.e.a((Object) aeew);
    }
}
