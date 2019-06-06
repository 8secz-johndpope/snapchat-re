package defpackage;

import android.net.Uri;
import defpackage.moc.b.a;
import defpackage.moc.b.b;
import defpackage.moc.b.c;
import defpackage.moc.d;
import java.util.Map;

/* renamed from: lcd */
public final class lcd implements lci {
    private final Map<String, lci> a;

    public lcd(Map<String, ? extends lci> map) {
        akcr.b(map, "builderMap");
        this.a = map;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        moc moc = (moc) obj;
        akcr.b(moc, "request");
        Object obj2 = moc instanceof a ? "lens_content" : moc instanceof c ? "lens_overlay_image" : moc instanceof b ? "lens_icon" : moc instanceof d ? "tracking_data" : moc instanceof moc.c.a ? "lens_remote_assets" : moc instanceof moc.c.b ? "user_generated_assets" : moc instanceof moc.a.c ? "bitmoji_lens_metadata" : moc instanceof moc.a.b ? "bitmoji_lens_avatar_asset" : null;
        if (obj2 != null) {
            lci lci = (lci) this.a.get(obj2);
            if (lci != null) {
                Uri uri = (Uri) lci.invoke(moc);
                if (uri != null) {
                    return uri;
                }
            }
        }
        throw new IllegalArgumentException("Can't find uri builder for given ".concat(String.valueOf(moc)));
    }
}
