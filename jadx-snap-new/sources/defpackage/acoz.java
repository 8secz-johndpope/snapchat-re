package defpackage;

import android.app.Activity;
import android.view.Window;
import defpackage.acpa.a;

/* renamed from: acoz */
public final class acoz implements a {
    private final ajwy<Activity> a;

    public acoz(ajwy<Activity> ajwy) {
        this.a = ajwy;
    }

    public final void a(boolean z) {
        Activity activity;
        if (z) {
            activity = (Activity) this.a.get();
            if (activity != null) {
                final Window window = activity.getWindow();
                if (window != null) {
                    if (((window.getAttributes().flags & 128) != 128 ? 1 : null) != null) {
                        activity.runOnUiThread(new Runnable() {
                            private /* synthetic */ int b = 128;

                            public final void run() {
                                window.addFlags(this.b);
                            }
                        });
                    }
                }
            }
            return;
        }
        activity = (Activity) this.a.get();
        if (activity != null) {
            Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.clearFlags(128);
            }
        }
    }
}
