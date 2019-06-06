package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.dnk.e.a;
import java.util.List;

/* renamed from: lhm */
public final class lhm implements gvn {
    private final ImmutableList<String> a = ImmutableList.of("snapchat://lens_studio.*");
    private final akbw<zjm, acih, ajcx> b;

    public lhm(akbw<? super zjm, ? super acih, ? extends ajcx> akbw) {
        akcr.b(akbw, "navigate");
        this.b = akbw;
    }

    public final /* bridge */ /* synthetic */ List a() {
        return this.a;
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object queryParameter = uri.getQueryParameter("lens_id");
        akbw akbw = this.b;
        zjm zjm = dnh.a;
        akcr.a(queryParameter, "id");
        return (ajcx) akbw.invoke(zjm, new a(queryParameter));
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
