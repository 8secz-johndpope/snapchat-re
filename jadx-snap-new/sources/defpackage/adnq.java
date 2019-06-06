package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

/* renamed from: adnq */
public final class adnq {
    private Bitmap a = null;
    private final adnj b;

    public adnq(adnj adnj) {
        this.b = adnj;
    }

    private Bitmap b() {
        try {
            return BitmapFactory.decodeStream(this.b.a.a.getAssets().open("lookup_miss_etikate.webp"));
        } catch (IOException e) {
            throw new adkd("Can not load missEtikatePng", e);
        }
    }

    public final synchronized Bitmap a() {
        if (this.a == null || this.a.isRecycled()) {
            this.a = b();
        }
        return this.a;
    }
}
