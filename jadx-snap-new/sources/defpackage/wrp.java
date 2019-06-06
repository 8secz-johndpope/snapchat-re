package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.brightcove.player.event.Event;
import java.lang.ref.WeakReference;

/* renamed from: wrp */
public final class wrp implements wqz {
    public final ajdx<kaz<jwj>> a(WeakReference<Activity> weakReference, jwa jwa, ajei ajei) {
        akcr.b(weakReference, "activityRef");
        akcr.b(jwa, "bitmapFactory");
        akcr.b(ajei, "compositeDisposable");
        throw new IllegalStateException("Device does not support system screenshot, regular screenshot should have been triggered instead.");
    }

    public final void a(Activity activity, int i, Intent intent) {
        akcr.b(activity, Event.ACTIVITY);
    }
}
