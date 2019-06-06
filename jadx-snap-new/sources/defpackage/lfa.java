package defpackage;

import defpackage.gfr.a;
import defpackage.moc.c.b;

/* renamed from: lfa */
public final class lfa implements lci {
    private final lcq a;

    public lfa(lcq lcq) {
        akcr.b(lcq, "registry");
        this.a = lcq;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        moc moc = (moc) obj;
        akcr.b(moc, "resourceRequest");
        if (!(moc instanceof b)) {
            moc = null;
        }
        b bVar = (b) moc;
        return bVar != null ? a.b().buildUpon().appendPath("user_generated_assets").appendPath(bVar.a.a).appendPath(this.a.a(bVar.b).a).appendPath(String.valueOf(bVar.c)).build() : null;
    }
}
