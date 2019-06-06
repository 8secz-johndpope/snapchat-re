package defpackage;

import android.content.Context;
import defpackage.dpt.a;

/* renamed from: kth */
public final class kth implements aiqc<a> {
    private final ajwy<Context> a;
    private final ajwy<kyc.a> b;

    public static a a(Context context, kyc.a aVar) {
        akcr.b(context, "context");
        akcr.b(aVar, "lensesCameraFeatureComponentBuilder");
        Object a = aVar.a(context);
        akcr.a(a, "lensesCameraFeatureCompo…tBuilder.context(context)");
        return (a) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kth.a((Context) this.a.get(), (kyc.a) this.b.get());
    }
}
