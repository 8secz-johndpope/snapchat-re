package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: mub */
final class mub implements akbk<InputStream> {
    private final AssetManager a;
    private final String b;

    public mub(AssetManager assetManager, String str) {
        akcr.b(assetManager, "assetManager");
        akcr.b(str, "assetFilePath");
        this.a = assetManager;
        this.b = str;
    }

    public final /* synthetic */ Object invoke() {
        Object open = this.a.open(this.b);
        akcr.a(open, "assetManager.open(assetFilePath)");
        return open;
    }
}
