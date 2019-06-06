package defpackage;

import android.graphics.SurfaceTexture;

/* renamed from: dyn */
public final class dyn implements dym {
    public final SurfaceTexture a;

    public dyn(SurfaceTexture surfaceTexture) {
        this.a = surfaceTexture;
    }

    public final void a() {
        this.a.updateTexImage();
    }

    public final void a(int i, int i2) {
        this.a.setDefaultBufferSize(i, i2);
    }

    public final void a(float[] fArr) {
        this.a.getTransformMatrix(fArr);
    }

    public final long b() {
        return this.a.getTimestamp();
    }

    public final void c() {
        this.a.release();
    }
}
