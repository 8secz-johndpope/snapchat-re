package defpackage;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: abwa */
public final class abwa implements abvv {
    private final List<abvv> a = new ArrayList();

    public abwa(abvv... abvvArr) {
        akcr.b(abvvArr, "drawStrategies");
        ajyr.a((Collection) this.a, (Object[]) abvvArr);
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        for (abvv abvv : this.a) {
            abvv.a(view, canvas, abxs);
            abvv.b(view, canvas, abxs);
        }
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
    }
}
