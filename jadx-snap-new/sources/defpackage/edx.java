package defpackage;

import android.content.Context;

/* renamed from: edx */
public final class edx implements aiqc<dok> {
    private final ajwy<Context> a;
    private final ajwy<zgb> b;

    public static dok a(Context context) {
        return (dok) aiqf.a(new dok(context, zgb.a(dnh.f.callsite("AutofocusRotation")).k(), zfw.r()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        Context context = (Context) ajwy.get();
        this.b.get();
        return edx.a(context);
    }
}
