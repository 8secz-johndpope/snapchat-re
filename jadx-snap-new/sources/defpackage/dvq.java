package defpackage;

import android.os.Handler;
import com.google.common.base.Supplier;
import java.util.Iterator;

/* renamed from: dvq */
public final class dvq {
    public final abpx<dot> a = new abpx();
    public final abpx<dow> b = new abpx();
    private final Supplier<Handler> c;

    public dvq(Supplier<Handler> supplier) {
        this.c = supplier;
    }

    public final void a(final ecd ecd) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final dot dot = (dot) it.next();
            ((Handler) this.c.get()).post(new Runnable() {
                public final void run() {
                    dot.a(ecd);
                }
            });
        }
    }

    public final void a(final boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            final dow dow = (dow) it.next();
            ((Handler) this.c.get()).post(new Runnable() {
                public final void run() {
                    dow.a(z);
                }
            });
        }
    }
}
