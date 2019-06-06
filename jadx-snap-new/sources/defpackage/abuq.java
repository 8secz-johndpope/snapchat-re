package defpackage;

import android.view.MotionEvent;
import android.widget.ScrollView;

/* renamed from: abuq */
public final class abuq extends ScrollView {
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
