package defpackage;

import android.graphics.Bitmap;
import com.google.common.base.Preconditions;

/* renamed from: adgs */
public final class adgs extends adgv {
    public final Bitmap a;
    public final long b;

    public adgs(Bitmap bitmap, long j, adie adie, adiv adiv) {
        super(adie, adiv);
        this.a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.b = j;
        Preconditions.checkArgument(j > 0);
    }

    public final long a() {
        return this.b;
    }
}
