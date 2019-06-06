package defpackage;

import android.net.Uri.Builder;
import defpackage.gfr.a;
import defpackage.miq.f;
import defpackage.moc.b.c;

/* renamed from: lcz */
public final class lcz implements lci {
    public final /* synthetic */ Object invoke(Object obj) {
        moc moc = (moc) obj;
        akcr.b(moc, "resourceRequest");
        if (!(moc instanceof c)) {
            moc = null;
        }
        c cVar = (c) moc;
        if (cVar == null) {
            return null;
        }
        Builder appendPath = a.b().buildUpon().appendPath("lens_overlay_image");
        f fVar = cVar.a;
        if (fVar != null) {
            return appendPath.appendPath(fVar.a()).build();
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.lenses.common.Uri.Remote");
    }
}
