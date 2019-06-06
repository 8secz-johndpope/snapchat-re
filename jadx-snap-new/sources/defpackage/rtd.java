package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.brightcove.player.event.Event;

/* renamed from: rtd */
public final class rtd implements aiqc<abpi> {
    private final ajwy<Context> a;

    public static abpi a(Context context) {
        abpi abpi = new abpi();
        abpi.a = (ActivityManager) context.getSystemService(Event.ACTIVITY);
        return (abpi) aiqf.a(abpi, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return rtd.a((Context) this.a.get());
    }
}
