package defpackage;

import android.net.Uri.Builder;
import defpackage.miq.e;
import defpackage.moc.c.a;

/* renamed from: lcl */
public final class lcl implements lci {
    public final /* synthetic */ Object invoke(Object obj) {
        moc moc = (moc) obj;
        akcr.b(moc, "resourceRequest");
        String str = null;
        if (!(moc instanceof a)) {
            moc = null;
        }
        a aVar = (a) moc;
        if (aVar != null) {
            muc muc = aVar.a;
            if (muc != null) {
                Builder appendPath = gfr.a.b().buildUpon().appendPath("lens_remote_assets");
                miq miq = muc.b;
                if (!(miq instanceof e)) {
                    miq = null;
                }
                e eVar = (e) miq;
                if (eVar != null) {
                    str = eVar.a();
                }
                if (str == null) {
                    str = "";
                }
                appendPath = appendPath.appendPath(str);
                str = muc.c;
                if (str == null) {
                    str = "EMPTY_SIGNATURE";
                }
                return appendPath.appendPath(str).appendPath(muc.a.a).build();
            }
        }
        return null;
    }
}
