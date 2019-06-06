package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;

/* renamed from: ggc */
public interface ggc extends gfu {

    /* renamed from: ggc$a */
    public static final class a {
        public static ajdx<gej> a(ggc ggc, Uri uri, idl idl, boolean z, gdy... gdyArr) {
            akcr.b(uri, MessageMediaRefModel.URI);
            akcr.b(idl, "page");
            akcr.b(gdyArr, "cacheAccessControls");
            return defpackage.gfu.a.a(ggc, uri, idl, z, gdyArr);
        }
    }

    ajdx<gej> a(Uri uri, idl idl, float f, rzc rzc, String str);
}
