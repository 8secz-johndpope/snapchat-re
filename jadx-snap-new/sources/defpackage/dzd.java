package defpackage;

import android.opengl.GLES20;
import com.snapchat.android.R;

/* renamed from: dzd */
public final class dzd extends adii {
    public adie a = new adie();
    public boolean b = false;
    private int e;

    public final adie a(adie adie, adie adie2) {
        return adie.clone().a(adie2).a(this.a);
    }

    public final void a() {
        adhk.a(this.e, this.b);
    }

    public final void a(int i) {
        this.e = GLES20.glGetUniformLocation(i, "uIsLowLightOn");
        if (this.e == -1) {
            throw new adkd("Could not get attrib location for uIsLowLightOn");
        }
    }

    public final void a(int i, long j, adie adie, adhu adhu) {
        adhu.c();
        super.a(i, j, adie, adhu);
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final int d() {
        return R.raw.frame_to_surface_fragment_shader;
    }
}
