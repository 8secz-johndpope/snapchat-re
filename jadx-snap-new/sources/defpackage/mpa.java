package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: mpa */
public interface mpa {

    /* renamed from: mpa$a */
    public static final class a {
        public static boolean a(View view, MotionEvent motionEvent) {
            akcr.b(view, "view");
            akcr.b(motionEvent, "motionEvent");
            return false;
        }
    }

    boolean a();

    boolean a(View view, MotionEvent motionEvent);
}
