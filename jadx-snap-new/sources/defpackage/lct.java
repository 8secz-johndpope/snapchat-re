package defpackage;

import android.net.Uri.Builder;
import defpackage.miq.f;
import defpackage.moc.b.a;

/* renamed from: lct */
public final class lct implements lci {
    public final /* synthetic */ Object invoke(Object obj) {
        moc moc = (moc) obj;
        akcr.b(moc, "resourceRequest");
        if (!(moc instanceof a)) {
            moc = null;
        }
        a aVar = (a) moc;
        if (aVar == null) {
            return null;
        }
        Builder appendPath = gfr.a.b().buildUpon().appendPath("lens_content");
        f fVar = aVar.b;
        if (fVar != null) {
            return appendPath.appendPath(fVar.a()).appendPath(aVar.c).appendPath(aVar.a.a).build();
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.lenses.common.Uri.Remote");
    }
}
