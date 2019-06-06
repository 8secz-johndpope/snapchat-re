package defpackage;

import com.snap.core.db.record.MessageMediaRefModel;

/* renamed from: mwl */
public final class mwl implements mwh {
    public static final mwl a = new mwl();

    private mwl() {
    }

    public final miq a(mux mux) {
        akcr.b(mux, "lens");
        return mux.g;
    }

    public final mux a(mux mux, miq miq) {
        mux mux2 = mux;
        miq miq2 = miq;
        akcr.b(mux, "lens");
        akcr.b(miq, MessageMediaRefModel.URI);
        return mux.a(mux2, null, null, null, null, null, null, miq2, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 2097087);
    }

    public final String toString() {
        return "OverlayImageLensUriHelper";
    }
}
