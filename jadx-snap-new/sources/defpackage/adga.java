package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: adga */
final class adga {
    boolean a = false;
    int b = 1;
    int c = 1;
    WeakReference<Activity> d = new WeakReference(null);

    adga() {
    }

    public final void a(Activity activity) {
        int i = this.a ? this.b : this.c;
        if (activity != null) {
            this.d = new WeakReference(activity);
            activity.setVolumeControlStream(i);
        }
    }
}
