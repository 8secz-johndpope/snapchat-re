package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: acym */
final class acym implements OnTouchListener {
    private final /* synthetic */ akbw a;

    acym(akbw akbw) {
        this.a = akbw;
    }

    public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        Object invoke = this.a.invoke(view, motionEvent);
        akcr.a(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
