package defpackage;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: abwd */
public final class abwd implements abvv {
    private final List<abvv> a = new ArrayList();

    public abwd(abvv... abvvArr) {
        akcr.b(abvvArr, "drawStrategies");
        ajyr.a((Collection) this.a, (Object[]) abvvArr);
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        for (abvv a : this.a) {
            a.a(view, canvas, abxs);
        }
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        for (abvv b : ajyu.h((Iterable) this.a)) {
            b.b(view, canvas, abxs);
        }
    }
}
