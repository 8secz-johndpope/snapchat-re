package defpackage;

import android.content.Context;
import com.snap.mushroom.MainActivity;

/* renamed from: ruv */
public final class ruv implements aiqc<Context> {
    private final ajwy<MainActivity> a;

    public static Context a(MainActivity mainActivity) {
        return (Context) aiqf.a(mainActivity, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ruv.a((MainActivity) this.a.get());
    }
}
