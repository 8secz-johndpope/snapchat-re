package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Callable;

/* renamed from: cfl */
public final class cfl {
    public static ajdp<Object> a(View view) {
        cfg.a(view, "view == null");
        return new cfm(view, true);
    }

    public static ajdp<Object> a(View view, Callable<Boolean> callable) {
        cfg.a(view, "view == null");
        cfg.a(callable, "proceedDrawingPass == null");
        return new cfs(view, callable);
    }

    public static ajdp<Object> b(View view) {
        cfg.a(view, "view == null");
        return new cfm(view, false);
    }

    public static ajdp<Object> c(View view) {
        cfg.a(view, "view == null");
        return new cfn(view);
    }

    public static ajdp<Object> d(View view) {
        cfg.a(view, "view == null");
        return new cfr(view);
    }

    public static ajdp<Object> e(View view) {
        cfg.a(view, "view == null");
        return new cfp(view, cfe.a);
    }

    public static ajdp<MotionEvent> f(View view) {
        cfg.a(view, "view == null");
        return new cfq(view, cfe.b);
    }
}
