package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fwt */
public final class fwt {
    private final AtomicInteger a = new AtomicInteger(-1);
    private final ajwy<abss> b;
    private final ajwy<fwu> c;

    public fwt(ajwy<abss> ajwy, ajwy<fwu> ajwy2) {
        akcr.b(ajwy, "releaseManager");
        akcr.b(ajwy2, "userUUIDManager");
        this.b = ajwy;
        this.c = ajwy2;
    }

    private final void a() {
        if (this.a.get() == -1) {
            this.a.set(Math.abs(((fwu) this.c.get()).a().hashCode() % MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL));
        }
    }

    public final boolean a(double d) {
        if (((abss) this.b.get()).d()) {
            return true;
        }
        if (this.a.get() == -1) {
            a();
        }
        return ((double) this.a.get()) < d * 1000.0d;
    }
}
