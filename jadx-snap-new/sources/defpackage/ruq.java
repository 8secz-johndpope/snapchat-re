package defpackage;

import android.app.Activity;
import java.util.Set;

/* renamed from: ruq */
public final class ruq implements aiqc<tpy> {
    private final ajwy<Activity> a;
    private final ajwy<Set<tpx>> b;
    private final ajwy<zgb> c;

    public static tpy a(Activity activity, Set<tpx> set, zgb zgb) {
        return (tpy) aiqf.a(rtw.a(activity, (Set) set, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ruq.a((Activity) this.a.get(), (Set) this.b.get(), (zgb) this.c.get());
    }
}
