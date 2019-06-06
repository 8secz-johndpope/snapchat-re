package defpackage;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: kz */
public final class kz {
    private static final b a = (VERSION.SDK_INT >= 21 ? new a() : new b());

    /* renamed from: kz$b */
    static class b {
        b() {
        }

        public void a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: kz$a */
    static class a extends b {
        a() {
        }

        public final void a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        a.a(edgeEffect, f, f2);
    }
}
