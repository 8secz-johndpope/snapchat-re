package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: pqm */
public final class pqm {
    static final acis a = new a();
    static final acis b = new b();

    /* renamed from: pqm$a */
    public static final class a implements acis {
        a() {
        }

        public final acis a() {
            return pqm.b;
        }

        public final void a(View view, achi<?, ?> achi) {
            akcr.b(view, "parentView");
            akcr.b(achi, "navigationEvent");
            float f = achi.i;
            float width = (float) view.getWidth();
            if ((achi.d == acgw.PRESENT ? 1 : null) != null) {
                f -= 1.0f;
            }
            pqm.a(achi, width * f);
        }

        public final void b(View view, achi<?, ?> achi) {
            akcr.b(view, "parentView");
            akcr.b(achi, "navigationEvent");
            int i = 0;
            if ((achi.d == acgw.PRESENT ? 1 : null) == null) {
                i = view.getWidth();
            }
            pqm.a(achi, (float) i);
        }

        public final void c(View view, achi<?, ?> achi) {
            akcr.b(view, "parentView");
            akcr.b(achi, "navigationEvent");
            int i = 0;
            if ((achi.d == acgw.PRESENT ? 1 : null) != null) {
                i = view.getWidth();
            }
            pqm.a(achi, (float) i);
        }
    }

    /* renamed from: pqm$b */
    public static final class b implements acis {
        b() {
        }

        public final acis a() {
            return pqm.a;
        }

        public final void a(View view, achi<?, ?> achi) {
            akcr.b(view, "parentView");
            akcr.b(achi, "navigationEvent");
            float f = achi.i;
            pqm.a(achi, ((float) view.getWidth()) * ((achi.d == acgw.PRESENT ? 1 : null) != null ? (-f) + 1.0f : -f));
        }

        public final void b(View view, achi<?, ?> achi) {
            akcr.b(view, "parentView");
            akcr.b(achi, "navigationEvent");
            int i = 0;
            if ((achi.d == acgw.PRESENT ? 1 : null) == null) {
                i = -view.getWidth();
            }
            pqm.a(achi, (float) i);
        }

        public final void c(View view, achi<?, ?> achi) {
            akcr.b(view, "parentView");
            akcr.b(achi, "navigationEvent");
            int i = 0;
            if ((achi.d == acgw.PRESENT ? 1 : null) != null) {
                i = -view.getWidth();
            }
            pqm.a(achi, (float) i);
        }
    }

    public static final /* synthetic */ void a(achi achi, float f) {
        View c = achi.a.c();
        if (!(c instanceof ViewGroup)) {
            c = null;
        }
        ViewGroup viewGroup = (ViewGroup) c;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 1; i < childCount; i++) {
                Object childAt = viewGroup.getChildAt(i);
                akcr.a(childAt, "it.getChildAt(i)");
                childAt.setTranslationX(f);
            }
        }
    }
}
