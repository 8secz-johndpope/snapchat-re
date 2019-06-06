package defpackage;

import android.media.MediaPlayer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: absr */
public final class absr extends MediaPlayer {
    private final String a;
    private final AtomicBoolean b = new AtomicBoolean();

    public absr(String str) {
        this.a = str;
        absq absq = absq.a;
        absq.b.add(this.a);
    }

    public final void a() {
        if (this.b.compareAndSet(false, true)) {
            absq.a.a(this.a);
        }
    }

    public final void release() {
        super.release();
        a();
    }
}
