package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;

/* renamed from: adan */
public final class adan implements OnClickListener {
    private final WeakReference<Activity> a;

    public adan(Activity activity) {
        this.a = new WeakReference(activity);
    }

    public final void onClick(View view) {
        Activity activity = (Activity) this.a.get();
        if (activity != null && !activity.isDestroyed()) {
            activity.onBackPressed();
        }
    }
}
