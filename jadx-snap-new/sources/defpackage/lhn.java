package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.dnk.e.b;
import java.util.List;

/* renamed from: lhn */
public final class lhn implements gvn {
    private final List<String> a = ajym.b((Object[]) new String[]{"snapchat://lenses", "snapchat://lenses/..*"});
    private final akbw<zjm, acih, ajcx> b;

    public lhn(akbw<? super zjm, ? super acih, ? extends ajcx> akbw) {
        akcr.b(akbw, "navigate");
        this.b = akbw;
    }

    public final List<String> a() {
        return this.a;
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return (ajcx) this.b.invoke(dnh.a, b.a);
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
