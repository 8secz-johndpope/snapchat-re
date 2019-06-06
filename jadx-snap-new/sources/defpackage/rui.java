package defpackage;

import android.util.DisplayMetrics;
import com.snap.mushroom.MainActivity;

/* renamed from: rui */
public final class rui implements aiqc<DisplayMetrics> {
    private final ajwy<MainActivity> a;

    public static DisplayMetrics a(MainActivity mainActivity) {
        return (DisplayMetrics) aiqf.a(rtw.b(mainActivity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return rui.a((MainActivity) this.a.get());
    }
}
