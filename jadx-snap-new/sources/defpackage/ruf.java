package defpackage;

import android.app.Activity;
import com.snap.mushroom.MainActivity;

/* renamed from: ruf */
public final class ruf implements aiqc<Activity> {
    private final ajwy<MainActivity> a;

    public static Activity a(MainActivity mainActivity) {
        return (Activity) aiqf.a(mainActivity, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ruf.a((MainActivity) this.a.get());
    }
}
