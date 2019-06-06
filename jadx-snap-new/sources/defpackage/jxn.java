package defpackage;

import android.graphics.Bitmap;
import com.google.common.base.Preconditions;

/* renamed from: jxn */
public final class jxn implements jwj {
    private Bitmap a;
    private volatile boolean b = false;

    public jxn(Bitmap bitmap) {
        this.a = (Bitmap) Preconditions.checkNotNull(bitmap);
    }

    public final Bitmap a() {
        if (!this.b) {
            return this.a;
        }
        throw new IllegalStateException("Bitmap has been disposed");
    }

    public final void dispose() {
        this.b = true;
    }

    public final boolean isDisposed() {
        return this.b;
    }
}
