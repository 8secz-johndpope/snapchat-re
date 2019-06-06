package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: ejn */
public final class ejn implements OnTouchListener {
    private final dpd a;

    public ejn(dpd dpd) {
        this.a = dpd;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a.h();
            return true;
        } else if (actionMasked != 1 && actionMasked != 3) {
            return false;
        } else {
            this.a.i();
            return true;
        }
    }
}
