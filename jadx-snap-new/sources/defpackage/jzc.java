package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jzc */
final class jzc implements jyn {
    private final aju a;
    private final AtomicBoolean b;

    public jzc(int i) {
        this(new aju(i));
    }

    private jzc(aju aju) {
        this.b = new AtomicBoolean(false);
        this.a = aju;
    }

    private void a() {
        if (this.b.get()) {
            throw new IllegalStateException("Pool is closed");
        }
    }

    public final Bitmap a(int i, int i2, Config config) {
        a();
        return this.a.a(i, i2, config);
    }

    public final void a(int i) {
        if (i == 5) {
            this.a.a(40);
        } else if (i == 10 || i == 15 || i == 20 || i == 40 || i == 60) {
            this.a.a();
        }
    }

    public final void a(Bitmap bitmap) {
        a();
        this.a.a(bitmap);
    }

    public final void dispose() {
        if (this.b.compareAndSet(false, true)) {
            this.a.a();
        }
    }

    public final boolean isDisposed() {
        return this.b.get();
    }
}
