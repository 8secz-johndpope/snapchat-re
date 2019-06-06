package defpackage;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apj */
public abstract class apj<T extends View, Z> extends aoz<Z> {
    public static boolean a;
    public static Integer b;
    protected final T c;
    private final a d;

    /* renamed from: apj$a */
    static class a {
        final View a;
        final List<apg> b = new ArrayList();
        a c;
        private Point d;

        /* renamed from: apj$a$a */
        static class a implements OnPreDrawListener {
            private final WeakReference<a> a;

            public a(a aVar) {
                this.a = new WeakReference(aVar);
            }

            public final boolean onPreDraw() {
                String str = "ViewTarget";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "OnGlobalLayoutListener called listener=".concat(String.valueOf(this)));
                }
                a aVar = (a) this.a.get();
                if (!(aVar == null || aVar.b.isEmpty())) {
                    int b = aVar.b();
                    int a = aVar.a();
                    if (a.a(b) && a.a(a)) {
                        for (apg a2 : aVar.b) {
                            a2.a(b, a);
                        }
                        aVar.b.clear();
                        ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.c);
                        }
                        aVar.c = null;
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.a = view;
        }

        private int a(int i, boolean z) {
            if (i == -2) {
                Point c = c();
                if (z) {
                    return c.y;
                }
                i = c.x;
            }
            return i;
        }

        static boolean a(int i) {
            return i > 0 || i == -2;
        }

        @TargetApi(13)
        private Point c() {
            Point point = this.d;
            if (point != null) {
                return point;
            }
            Display defaultDisplay = ((WindowManager) this.a.getContext().getSystemService("window")).getDefaultDisplay();
            this.d = new Point();
            defaultDisplay.getSize(this.d);
            return this.d;
        }

        /* Access modifiers changed, original: final */
        public final int a() {
            LayoutParams layoutParams = this.a.getLayoutParams();
            return a.a(this.a.getHeight()) ? this.a.getHeight() : layoutParams != null ? a(layoutParams.height, true) : 0;
        }

        /* Access modifiers changed, original: final */
        public final int b() {
            LayoutParams layoutParams = this.a.getLayoutParams();
            return a.a(this.a.getWidth()) ? this.a.getWidth() : layoutParams != null ? a(layoutParams.width, false) : 0;
        }
    }

    public apj(T t) {
        if (t != null) {
            this.c = t;
            this.d = new a(t);
            return;
        }
        throw new NullPointerException("View must not be null!");
    }

    public final void a(aol aol) {
        Integer num = b;
        if (num == null) {
            a = true;
            this.c.setTag(aol);
            return;
        }
        this.c.setTag(num.intValue(), aol);
    }

    public final void a(apg apg) {
        a aVar = this.d;
        int b = aVar.b();
        int a = aVar.a();
        if (a.a(b) && a.a(a)) {
            apg.a(b, a);
            return;
        }
        if (!aVar.b.contains(apg)) {
            aVar.b.add(apg);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
            aVar.c = new a(aVar);
            viewTreeObserver.addOnPreDrawListener(aVar.c);
        }
    }

    public final T c() {
        return this.c;
    }

    public final aol e() {
        Integer num = b;
        Object tag = num == null ? this.c.getTag() : this.c.getTag(num.intValue());
        if (tag == null) {
            return null;
        }
        if (tag instanceof aol) {
            return (aol) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Target for: ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}
