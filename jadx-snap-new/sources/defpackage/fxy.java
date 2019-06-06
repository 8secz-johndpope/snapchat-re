package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: fxy */
public final class fxy implements aiqc<ContentResolver> {
    private final ajwy<Context> a;

    public static ContentResolver a(Context context) {
        return (ContentResolver) aiqf.a(context.getContentResolver(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fxy.a((Context) this.a.get());
    }
}
