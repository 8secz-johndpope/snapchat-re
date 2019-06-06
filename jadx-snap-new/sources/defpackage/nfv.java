package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.nbo.a;

/* renamed from: nfv */
public final class nfv {
    private final ncn a;
    private final nbo b;

    public nfv(ncn ncn, nbo nbo) {
        this.a = ncn;
        this.b = nbo;
    }

    public final void a(long j) {
        boolean b = this.a.b();
        if (this.b.c() <= 0 && b && j >= 0) {
            final int i = ((int) j) * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
            this.b.a(2, new a() {
                public final int a() {
                    return i;
                }
            });
        }
    }
}
