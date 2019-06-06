package defpackage;

import android.view.View;
import defpackage.aciy.a;

/* renamed from: acjb */
public final class acjb implements acis {
    private final boolean f = false;

    acjb() {
    }

    private static void a(View view, boolean z) {
        if (view instanceof aciz) {
            ((aciz) view).a(z);
        }
    }

    public static acis b() {
        return a.a;
    }

    public final acis a() {
        return this;
    }

    public final void a(View view, achi<?, ?> achi) {
        acjb.a(achi.e.d, true);
        acjb.a(achi.f.d, true);
    }

    public final void b(View view, achi<?, ?> achi) {
        acjb.a(achi.f.d, false);
        acjb.a(achi.e.d, false);
    }

    public final void c(View view, achi<?, ?> achi) {
        acjb.a(achi.e.d, false);
        acjb.a(achi.f.d, false);
    }
}
