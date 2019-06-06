package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* renamed from: dxz */
public final class dxz {
    public dyc a;
    public final boolean b;
    private final int c;
    private final adhk d;
    private int e;
    private SurfaceTexture f;
    private dya g;

    public dxz(adhk adhk) {
        this(abss.a().c(), adhk);
    }

    private dxz(boolean z, adhk adhk) {
        this.c = 36197;
        this.b = z;
        this.d = adhk;
    }

    public static void a(int i) {
        try {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        } catch (adjw e) {
            throw new dxx(e);
        }
    }

    public static int d() {
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            return i;
        } catch (adjw e) {
            throw new dxx(e);
        }
    }

    public final dya a(Surface surface) {
        return new dxw(surface, this.a);
    }

    public final void a() {
        this.a = new dyc(dqt.a().b(), new adhi(this.b));
        this.e = dxz.d();
        this.f = new SurfaceTexture(this.e);
        this.g = new dxw(this.f, this.a);
        b();
    }

    public final void b() {
        this.g.b();
    }

    public final void c() {
        dya dya = this.g;
        if (dya != null) {
            dya.c();
            this.g.d();
            this.g = null;
        }
        SurfaceTexture surfaceTexture = this.f;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f = null;
        }
        dxz.a(this.e);
        dyc dyc = this.a;
        if (dyc != null) {
            dyc.a();
            this.a.b();
            this.a = null;
        }
    }
}
