package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jzz */
final class jzz implements jwj {
    private final AtomicBoolean a = new AtomicBoolean(false);

    public final Bitmap a() {
        throw new UnsupportedOperationException();
    }

    public final void dispose() {
        this.a.set(true);
    }

    public final boolean isDisposed() {
        return this.a.get();
    }
}
