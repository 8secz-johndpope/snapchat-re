package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: altd */
final class altd implements OnTouchListener {
    private final altc a;

    public altd(altc altc) {
        this.a = altc;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float a = this.a.a(motionEvent);
        altc altc = this.a;
        altc.c.scrollToPosition((int) (((float) altc.c.getAdapter().getItemCount()) * a));
        this.a.a(a);
        return true;
    }
}
