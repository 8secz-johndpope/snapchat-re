package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: zq */
public final class zq extends zk<ParcelFileDescriptor> {
    public zq(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
