package defpackage;

import defpackage.gfr.a;
import defpackage.moc.a.c;

/* renamed from: lca */
public final class lca implements lci {
    public final /* synthetic */ Object invoke(Object obj) {
        moc moc = (moc) obj;
        akcr.b(moc, "resourceRequest");
        if (!(moc instanceof c)) {
            moc = null;
        }
        c cVar = (c) moc;
        return cVar != null ? a.b().buildUpon().appendPath("bitmoji_lens_metadata").appendPath(akgc.a(cVar.c, (CharSequence) "/")).appendPath(cVar.d.name()).appendPath(cVar.a.a).appendPath(cVar.b.a).build() : null;
    }
}
