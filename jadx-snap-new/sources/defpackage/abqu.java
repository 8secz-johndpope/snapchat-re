package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.Random;

/* renamed from: abqu */
public final class abqu implements abqs {
    private final Random a;
    private final int b;
    private final int c;

    public abqu() {
        this(new Random());
    }

    private abqu(Random random) {
        this.b = MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
        this.c = 60000;
        this.a = random;
    }

    public final long a(long j) {
        if (j <= 0) {
            return 0;
        }
        j = (1 << ((int) Math.min(j - 1, 29))) * 1000;
        if (j <= 0) {
            j = 60000;
        }
        j = Math.min(j, 60000) / 2;
        return j + Math.abs(this.a.nextLong() % j);
    }
}
