package defpackage;

import android.graphics.Bitmap;
import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jyu */
final class jyu implements jwj {
    private final jyn a;
    private final Bitmap b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    jyu(jyn jyn, Bitmap bitmap) {
        this.a = jyn;
        this.b = (Bitmap) Preconditions.checkNotNull(bitmap);
    }

    public final Bitmap a() {
        if (!isDisposed()) {
            return this.b;
        }
        throw new IllegalStateException("Bitmap has been disposed");
    }

    public final void dispose() {
        if (this.c.compareAndSet(false, true)) {
            this.a.a(this.b);
        }
    }

    public final boolean isDisposed() {
        return this.c.get();
    }
}
