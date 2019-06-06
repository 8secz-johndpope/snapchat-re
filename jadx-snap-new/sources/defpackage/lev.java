package defpackage;

import defpackage.gfr.a;
import defpackage.moc.d;

/* renamed from: lev */
public final class lev implements lci {
    public final /* synthetic */ Object invoke(Object obj) {
        moc moc = (moc) obj;
        akcr.b(moc, "resourceRequest");
        if (!(moc instanceof d)) {
            moc = null;
        }
        d dVar = (d) moc;
        return dVar != null ? a.b().buildUpon().appendPath("tracking_data").appendPath(dVar.a).appendPath(dVar.b).build() : null;
    }
}
