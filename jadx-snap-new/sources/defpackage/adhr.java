package defpackage;

import android.opengl.EGLSurface;
import android.view.Surface;
import com.google.common.base.Preconditions;

/* renamed from: adhr */
public final class adhr implements adhp {
    private final EGLSurface a;
    private final Surface b;
    private final adhg c;
    private final adhk d;
    private adhu e;
    private boolean f;

    public adhr(Surface surface, adhg adhg) {
        this(surface, adhg, true);
    }

    private adhr(Surface surface, adhg adhg, adhk adhk, boolean z) {
        this.f = true;
        this.c = (adhg) Preconditions.checkNotNull(adhg);
        this.d = adhk;
        this.b = (Surface) Preconditions.checkNotNull(surface);
        this.f = z;
        this.a = this.c.a(this.b);
        int[] iArr = new int[2];
        this.c.a(this.a, iArr);
        this.e = new adhu(iArr[0], iArr[1], 0, new int[]{0, 0, iArr[0], iArr[1]}, null);
    }

    public adhr(Surface surface, adhg adhg, boolean z) {
        this(surface, adhg, adhk.a, z);
    }

    public final void a() {
        this.c.c(this.a);
        if (this.f) {
            this.b.release();
            this.f = false;
        }
    }

    public final void a(long j) {
        this.c.a(this.a, j);
    }

    public final adhu b() {
        int[] iArr = new int[2];
        this.c.a(this.a, iArr);
        if (iArr[0] > 0 && iArr[1] > 0 && !(iArr[0] == this.e.a && iArr[1] == this.e.b)) {
            this.e = new adhu(iArr[0], iArr[1], 0, new int[]{0, 0, iArr[0], iArr[1]}, null);
        }
        return this.e;
    }

    public final void c() {
        this.c.a(this.a);
    }

    public final void d() {
        this.c.a();
    }

    public final boolean e() {
        adhk.a("swapBuffers");
        return this.c.b(this.a);
    }
}
