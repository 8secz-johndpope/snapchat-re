package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: dqr */
public final class dqr {
    public final ifs a;
    public final WeakReference<Activity> b;

    public dqr(ifs ifs, Activity activity) {
        this.a = ifs;
        this.b = new WeakReference(activity);
    }
}
