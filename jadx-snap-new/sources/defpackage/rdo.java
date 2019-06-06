package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: rdo */
public final class rdo implements OnTouchListener {
    private final /* synthetic */ akbw a;

    public rdo(akbw akbw) {
        this.a = akbw;
    }

    public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        Object invoke = this.a.invoke(view, motionEvent);
        akcr.a(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
