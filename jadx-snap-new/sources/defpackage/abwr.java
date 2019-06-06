package defpackage;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: abwr */
public final class abwr implements abwx {
    public akbk<ajxw> a;
    private final List<RectF> b = new ArrayList();

    public final void a(RectF rectF) {
        akcr.b(rectF, "area");
        this.b.add(rectF);
    }

    public final boolean a(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        return true;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        Object obj;
        akcr.b(view, "view");
        akcr.b(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        Iterable<RectF> iterable = this.b;
        if (!((Collection) iterable).isEmpty()) {
            for (RectF contains : iterable) {
                if (contains.contains(motionEvent.getX(), motionEvent.getY())) {
                    obj = null;
                    break;
                }
            }
        }
        obj = 1;
        if (obj == null && actionMasked != 0 && actionMasked == 1) {
            akbk akbk = this.a;
            if (akbk != null) {
                akbk.invoke();
                return true;
            }
        }
        return false;
    }
}
