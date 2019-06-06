package defpackage;

import com.snap.lenses.app.data.LensesHttpInterface;
import defpackage.lgx.c;

/* renamed from: lgp */
public final class lgp implements aiqc<c> {
    private final ajwy<LensesHttpInterface> a;
    private final ajwy<miw> b;

    public static c a(aipn<LensesHttpInterface> aipn, miw miw) {
        return (c) aiqf.a(lfv.a((aipn) aipn, miw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lgp.a(aiqb.b(this.a), (miw) this.b.get());
    }
}
