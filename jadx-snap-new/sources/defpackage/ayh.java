package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: ayh */
public final class ayh {
    final aye a;
    public auq<Bitmap> b;
    public List<auq<Bitmap>> c;
    public int d;

    public ayh(aye aye) {
        this.a = aye;
    }

    public final ayg a() {
        try {
            ayg ayg = new ayg(this);
            return ayg;
        } finally {
            auq.c(this.b);
            this.b = null;
            auq.a(this.c);
            this.c = null;
        }
    }
}
