package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;

@ftr(a = "ad_snap_content/*")
/* renamed from: cmy */
public final class cmy extends cmz {
    public cmy(cmx cmx, ajwy<gee> ajwy) {
        akcr.b(cmx, "adSnapContentType");
        akcr.b(ajwy, "contentManagerProvider");
        super(cmx, ajwy);
    }

    public final gfl a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return gii.b(null, null, 3);
    }
}
