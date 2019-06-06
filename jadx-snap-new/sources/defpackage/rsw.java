package defpackage;

import android.content.Context;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: rsw */
public final class rsw implements aiqc<Context> {
    static {
        rsw rsw = new rsw();
    }

    public static Context a() {
        return (Context) aiqf.a(AppContext.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return rsw.a();
    }
}
