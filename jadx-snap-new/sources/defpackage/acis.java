package defpackage;

import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: acis */
public interface acis {
    public static final acis a = new 1();
    public static final acis b = new 2();
    public static final acis c = new 3();
    public static final acis d = new 4();
    public static final acis e = new 5();

    /* renamed from: acis$1 */
    static class 1 implements acis {
        1() {
        }

        public final acis a() {
            return b;
        }

        public final void a(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                float f = achi.i;
                float width = (float) view.getWidth();
                if ((achi.d == acgw.PRESENT ? 1 : null) != null) {
                    f -= 1.0f;
                }
                c.setTranslationX(width * f);
            }
        }

        public final void b(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                c.setTranslationX((achi.d == acgw.PRESENT ? 1 : null) != null ? MapboxConstants.MINIMUM_ZOOM : (float) view.getWidth());
            }
        }

        public final void c(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                c.setTranslationX((achi.d == acgw.PRESENT ? 1 : null) != null ? (float) view.getWidth() : MapboxConstants.MINIMUM_ZOOM);
            }
        }
    }

    /* renamed from: acis$2 */
    static class 2 implements acis {
        2() {
        }

        public final acis a() {
            return a;
        }

        public final void a(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                float f = achi.i;
                c.setTranslationX(((float) view.getWidth()) * ((achi.d == acgw.PRESENT ? 1 : null) != null ? (-f) + 1.0f : -f));
            }
        }

        public final void b(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                c.setTranslationX((achi.d == acgw.PRESENT ? 1 : null) != null ? MapboxConstants.MINIMUM_ZOOM : (float) (-view.getWidth()));
            }
        }

        public final void c(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                c.setTranslationX((achi.d == acgw.PRESENT ? 1 : null) != null ? (float) (-view.getWidth()) : MapboxConstants.MINIMUM_ZOOM);
            }
        }
    }

    /* renamed from: acis$3 */
    static class 3 implements acis {
        3() {
        }

        public final acis a() {
            return d;
        }

        public final void a(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                float f = achi.i;
                float height = (float) view.getHeight();
                if ((achi.d == acgw.PRESENT ? 1 : null) != null) {
                    f -= 1.0f;
                }
                c.setTranslationY(height * f);
            }
        }

        public final void b(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                c.setTranslationY((achi.d == acgw.PRESENT ? 1 : null) != null ? MapboxConstants.MINIMUM_ZOOM : (float) view.getHeight());
            }
        }

        public final void c(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                c.setTranslationY((achi.d == acgw.PRESENT ? 1 : null) != null ? (float) view.getHeight() : MapboxConstants.MINIMUM_ZOOM);
            }
        }
    }

    /* renamed from: acis$4 */
    static class 4 implements acis {
        4() {
        }

        public final acis a() {
            return c;
        }

        public final void a(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                float f = achi.i;
                c.setTranslationY(((float) view.getHeight()) * ((achi.d == acgw.PRESENT ? 1 : null) != null ? (-f) + 1.0f : -f));
            }
        }

        public final void b(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                c.setTranslationY((achi.d == acgw.PRESENT ? 1 : null) != null ? MapboxConstants.MINIMUM_ZOOM : (float) (-view.getHeight()));
            }
        }

        public final void c(View view, achi<?, ?> achi) {
            View c = achi.a.c();
            if (c != null) {
                c.setTranslationY((achi.d == acgw.PRESENT ? 1 : null) != null ? (float) (-view.getHeight()) : MapboxConstants.MINIMUM_ZOOM);
            }
        }
    }

    /* renamed from: acis$5 */
    static class 5 implements acis {
        5() {
        }

        public final acis a() {
            return e;
        }

        public final void a(View view, achi<?, ?> achi) {
            view = achi.a.c();
            if (view != null) {
                float f = achi.i;
                if ((achi.d == acgw.PRESENT ? 1 : null) == null) {
                    f = 1.0f - f;
                }
                view.setAlpha(f);
            }
        }

        public final void b(View view, achi<?, ?> achi) {
            view = achi.a.c();
            if (view != null) {
                view.setAlpha((achi.d == acgw.PRESENT ? 1 : null) != null ? 1.0f : MapboxConstants.MINIMUM_ZOOM);
            }
        }

        public final void c(View view, achi<?, ?> achi) {
            view = achi.a.c();
            if (view != null) {
                view.setAlpha((achi.d == acgw.PRESENT ? 1 : null) != null ? MapboxConstants.MINIMUM_ZOOM : 1.0f);
            }
        }
    }

    acis a();

    void a(View view, achi<?, ?> achi);

    void b(View view, achi<?, ?> achi);

    void c(View view, achi<?, ?> achi);
}
