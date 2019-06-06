package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Arrays;

/* renamed from: gfu */
public interface gfu {

    /* renamed from: gfu$a */
    public static final class a {
        public static ajcx a(gfu gfu, Uri uri, idl idl, float f) {
            akcr.b(uri, MessageMediaRefModel.URI);
            akcr.b(idl, "page");
            return gfu.a(uri, idl, f, null);
        }

        public static ajdx<gej> a(gfu gfu, Uri uri, idl idl, boolean z, gdy... gdyArr) {
            akcr.b(uri, MessageMediaRefModel.URI);
            akcr.b(idl, "page");
            akcr.b(gdyArr, "cacheAccessControls");
            return gfu.a(uri, idl, z, null, (gdy[]) Arrays.copyOf(gdyArr, gdyArr.length));
        }
    }

    ajcx a(Uri uri, idl idl, float f);

    ajcx a(Uri uri, idl idl, float f, String str);

    ajdx<gej> a(Uri uri, Uri uri2, idl idl, boolean z);

    ajdx<AssetFileDescriptor> a(Uri uri, idl idl);

    ajdx<gej> a(Uri uri, idl idl, boolean z, String str, gdy... gdyArr);

    ajdx<gej> a(Uri uri, idl idl, boolean z, gdy... gdyArr);

    ajdp<gfw> b(Uri uri, idl idl);
}
