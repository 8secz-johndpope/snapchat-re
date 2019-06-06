package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: abws */
public final class abws implements abwx {
    private Runnable a;

    public final void a(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a(MotionEvent motionEvent) {
        return true;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
                return true;
            }
        }
        return false;
    }
}
