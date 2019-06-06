package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: ajfm */
public final class ajfm extends AtomicReferenceArray<ajej> implements ajej {
    public ajfm() {
        super(2);
    }

    public final boolean a(int i, ajej ajej) {
        ajej ajej2;
        do {
            ajej2 = (ajej) get(i);
            if (ajej2 == ajfp.DISPOSED) {
                ajej.dispose();
                return false;
            }
        } while (!compareAndSet(i, ajej2, ajej));
        if (ajej2 != null) {
            ajej2.dispose();
        }
        return true;
    }

    public final void dispose() {
        int i = 0;
        if (get(0) != ajfp.DISPOSED) {
            int length = length();
            while (i < length) {
                if (((ajej) get(i)) != ajfp.DISPOSED) {
                    ajej ajej = (ajej) getAndSet(i, ajfp.DISPOSED);
                    if (!(ajej == ajfp.DISPOSED || ajej == null)) {
                        ajej.dispose();
                    }
                }
                i++;
            }
        }
    }

    public final boolean isDisposed() {
        return get(0) == ajfp.DISPOSED;
    }
}
