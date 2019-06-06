package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import defpackage.xhs.b;

/* renamed from: xhy */
public final class xhy implements aiqc<xbd> {
    private final ajwy<Context> a;
    private final ajwy<xaz> b;
    private final ajwy<Optional<xck>> c;
    private final ajwy<xoz> d;

    public static xbd a(Context context, xaz xaz, Optional<xck> optional, xoz xoz) {
        return (xbd) aiqf.a(b.a(context, xaz, optional, xoz), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xhy.a((Context) this.a.get(), (xaz) this.b.get(), (Optional) this.c.get(), (xoz) this.d.get());
    }
}
