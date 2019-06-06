package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;

@ftr(a = "ad_asset/*")
/* renamed from: cmt */
public final class cmt extends cmz {
    public cmt(cms cms, ajwy<gee> ajwy) {
        akcr.b(cms, "adRemoteAssetContentType");
        akcr.b(ajwy, "contentManagerProvider");
        super(cms, ajwy);
    }

    public final gfl a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return gii.a(ckf.a(uri));
    }
}
