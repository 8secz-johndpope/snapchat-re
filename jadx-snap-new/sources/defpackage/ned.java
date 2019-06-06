package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: ned */
public final class ned implements aiqc<Resources> {
    private final ajwy<Context> a;

    public static Resources a(Context context) {
        return (Resources) aiqf.a(context.getResources(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ned.a((Context) this.a.get());
    }
}
