package defpackage;

import android.content.Context;
import defpackage.kwd.a;

/* renamed from: kug */
public final class kug implements aiqc<a> {
    private final ajwy<Context> a;
    private final ajwy<jwb> b;
    private final ajwy<jwe> c;

    public static a a(Context context, jwb jwb, jwe jwe) {
        return (a) aiqf.a(ktz.a.a(context, jwb, jwe), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kug.a((Context) this.a.get(), (jwb) this.b.get(), (jwe) this.c.get());
    }
}
