package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: abwt */
public final class abwt implements abwx {
    public final List<abww> a = new ArrayList();
    private final List<abwx> b;
    private abwx c;

    public abwt(abwx... abwxArr) {
        akcr.b(abwxArr, "touchStrategies");
        this.b = ajym.c((abwx[]) Arrays.copyOf(abwxArr, abwxArr.length));
    }

    public final boolean a(MotionEvent motionEvent) {
        boolean z;
        akcr.b(motionEvent, "event");
        for (abww a : this.a) {
            a.a(motionEvent);
        }
        Iterable<abwx> iterable = this.b;
        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            for (abwx a2 : iterable) {
                if (a2.a(motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        for (abww b : this.a) {
            b.b(motionEvent);
        }
        return z;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        akcr.b(view, "view");
        akcr.b(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0) {
            this.c = null;
        }
        for (abww a : this.a) {
            a.a(motionEvent);
        }
        abwx abwx = this.c;
        if (abwx != null) {
            abwx.a(view, motionEvent);
            for (abww b : this.a) {
                b.b(motionEvent);
            }
            return true;
        }
        for (Object obj : this.b) {
            if (obj.a(view, motionEvent)) {
                this.c = obj;
                int action = motionEvent.getAction();
                motionEvent.setAction(3);
                for (Object obj2 : this.b) {
                    if (!akcr.a(obj2, obj)) {
                        obj2.a(view, motionEvent);
                    }
                }
                motionEvent.setAction(action);
                for (abww b2 : this.a) {
                    b2.b(motionEvent);
                }
                return true;
            }
        }
        for (abww b22 : this.a) {
            b22.b(motionEvent);
        }
        return false;
    }
}
