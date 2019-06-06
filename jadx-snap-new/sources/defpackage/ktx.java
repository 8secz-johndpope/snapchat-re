package defpackage;

import android.app.Activity;
import com.brightcove.player.event.Event;

/* renamed from: ktx */
public final class ktx implements aiqc<nbd> {
    private final ajwy<Activity> a;
    private final ajwy<zgb> b;

    public static nbd a(Activity activity, zgb zgb) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(zgb, "schedulersProvider");
        zfw a = zgb.a(kus.b.callsite("DefaultWakeLock"));
        Object window = activity.getWindow();
        akcr.a(window, "activity.window");
        return (nbd) aiqf.a(new lnk(window, a), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ktx.a((Activity) this.a.get(), (zgb) this.b.get());
    }
}
