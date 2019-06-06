package defpackage;

import android.opengl.GLES20;
import com.snapchat.android.R;

/* renamed from: adio */
public final class adio extends adii {
    private final adnq a;
    private adib b;
    private int e;

    public adio(adnq adnq) {
        this.a = adnq;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        adhk.a(this.e, 1);
        this.b.a(1);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        this.e = GLES20.glGetUniformLocation(i, "sMissEtikateLookupTexture");
        if (this.e == -1) {
            throw new adkd("No miss etikate lookup texture uniform");
        }
    }

    public final void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        super.a(adie, adie2, i, i2, adic, adne, adhz);
        this.b = new adib().a(this.a.a(), false);
    }

    /* Access modifiers changed, original: protected|final */
    public final int d() {
        return R.raw.miss_etikate_fragment_shader;
    }

    public final void e() {
        if (this.c == 2) {
            this.b.c();
            super.e();
        }
    }
}
