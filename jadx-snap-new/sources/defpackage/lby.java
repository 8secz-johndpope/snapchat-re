package defpackage;

import defpackage.gfr.a;
import defpackage.moc.a.b;

/* renamed from: lby */
public final class lby implements lci {
    public final /* synthetic */ Object invoke(Object obj) {
        moc moc = (moc) obj;
        akcr.b(moc, "resourceRequest");
        if (!(moc instanceof b)) {
            moc = null;
        }
        b bVar = (b) moc;
        return bVar != null ? a.b().buildUpon().appendPath("bitmoji_lens_avatar_asset").appendPath(akgc.a(bVar.d, (CharSequence) "/")).appendPath(bVar.e.name()).appendPath(bVar.a.a).appendPath(bVar.b.a).appendPath(bVar.c.a).build() : null;
    }
}
