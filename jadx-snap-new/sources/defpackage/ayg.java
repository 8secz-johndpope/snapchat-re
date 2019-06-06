package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: ayg */
public final class ayg {
    public final aye a;
    private final int b = 0;
    private auq<Bitmap> c;
    private List<auq<Bitmap>> d;

    private ayg(aye aye) {
        this.a = (aye) auh.a((Object) aye);
    }

    ayg(ayh ayh) {
        this.a = (aye) auh.a(ayh.a);
        this.c = auq.b(ayh.b);
        this.d = auq.a(ayh.c);
    }

    public static ayg a(aye aye) {
        return new ayg(aye);
    }

    public final synchronized void a() {
        auq.c(this.c);
        this.c = null;
        auq.a(this.d);
        this.d = null;
    }
}
