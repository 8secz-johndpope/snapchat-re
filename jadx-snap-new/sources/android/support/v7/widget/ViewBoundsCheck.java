package android.support.v7.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

final class ViewBoundsCheck {
    private b a;
    private a b = new a();

    interface b {
        int a();

        int a(View view);

        View a(int i);

        int b();

        int b(View view);
    }

    static class a {
        int a = 0;
        private int b;
        private int c;
        private int d;
        private int e;

        a() {
        }

        private static int a(int i, int i2) {
            return i > i2 ? 1 : i == i2 ? 2 : 4;
        }

        /* Access modifiers changed, original: final */
        public final void a(int i) {
            this.a = i | this.a;
        }

        /* Access modifiers changed, original: final */
        public final void a(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        /* Access modifiers changed, original: final */
        public final boolean a() {
            int i = this.a;
            if ((i & 7) != 0 && (i & a(this.d, this.b)) == 0) {
                return false;
            }
            i = this.a;
            if ((i & 112) != 0 && (i & (a(this.d, this.c) << 4)) == 0) {
                return false;
            }
            i = this.a;
            if ((i & 1792) != 0 && (i & (a(this.e, this.b) << 8)) == 0) {
                return false;
            }
            i = this.a;
            return (i & 28672) == 0 || (i & (a(this.e, this.c) << 12)) != 0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    ViewBoundsCheck(b bVar) {
        this.a = bVar;
    }

    /* Access modifiers changed, original: final */
    public final View a(int i, int i2, int i3, int i4) {
        int a = this.a.a();
        int b = this.a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            a aVar;
            View a2 = this.a.a(i);
            this.b.a(a, b, this.a.a(a2), this.a.b(a2));
            if (i3 != 0) {
                aVar = this.b;
                aVar.a = 0;
                aVar.a(i3);
                if (this.b.a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                aVar = this.b;
                aVar.a = 0;
                aVar.a(i4);
                if (this.b.a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(View view) {
        this.b.a(this.a.a(), this.a.b(), this.a.a(view), this.a.b(view));
        a aVar = this.b;
        aVar.a = 0;
        aVar.a(24579);
        return this.b.a();
    }
}
