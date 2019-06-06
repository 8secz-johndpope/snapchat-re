package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: dxw */
public final class dxw implements dya {
    private EGLSurface a;
    private Surface b;
    private final abtl c;
    private final boolean d;
    private final dyc e;
    private final boolean f;

    public dxw(SurfaceTexture surfaceTexture, dyc dyc) {
        this(new Surface(surfaceTexture), dyc, true, false);
    }

    public dxw(Surface surface, dyc dyc) {
        this(surface, dyc, false, false);
    }

    public dxw(Surface surface, dyc dyc, byte b) {
        this(surface, dyc, false, true);
    }

    private dxw(Surface surface, dyc dyc, boolean z, boolean z2) {
        this.e = dyc;
        this.b = surface;
        this.a = dyc.a(this.b);
        this.d = z;
        this.f = z2;
        int[] iArr = new int[2];
        dyc = this.e;
        try {
            dyc.a.a(this.a, iArr);
            this.c = new abtl(iArr[0], iArr[1]);
        } catch (RuntimeException e) {
            throw new dxx(e);
        }
    }

    public final abtl a() {
        return this.c;
    }

    public final void a(long j) {
        this.e.a(this.a, j);
    }

    public final void b() {
        this.e.a(this.a);
    }

    public final void c() {
        this.e.a();
    }

    public final void d() {
        this.e.c(this.a);
        this.a = null;
        if (this.d) {
            this.b.release();
        }
        if (this.f) {
            this.e.b();
        }
        this.b = null;
    }

    public final boolean e() {
        return true;
    }

    public final int f() {
        return 0;
    }

    public final void g() {
        this.e.b(this.a);
    }
}
