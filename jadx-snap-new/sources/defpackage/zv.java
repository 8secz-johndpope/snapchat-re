package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: zv */
public final class zv extends zk<InputStream> {
    public zv(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }
}
