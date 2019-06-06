package defpackage;

import android.net.Uri.Builder;
import defpackage.gfr.a;
import defpackage.miq.f;
import defpackage.moc.b.b;

/* renamed from: lcw */
public final class lcw implements lci {
    public final /* synthetic */ Object invoke(Object obj) {
        moc moc = (moc) obj;
        akcr.b(moc, "resourceRequest");
        if (!(moc instanceof b)) {
            moc = null;
        }
        b bVar = (b) moc;
        if (bVar == null) {
            return null;
        }
        Builder appendPath = a.b().buildUpon().appendPath("lens_icon");
        f fVar = bVar.a;
        if (fVar != null) {
            return appendPath.appendPath(fVar.a()).build();
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.lenses.common.Uri.NonEmpty");
    }
}
