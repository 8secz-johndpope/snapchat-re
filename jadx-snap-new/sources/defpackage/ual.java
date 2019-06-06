package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.uai.a;

/* renamed from: ual */
public final class ual implements uai {
    private final abur<View> a;
    private long b = -1;

    public ual(FrameLayout frameLayout, int i, int i2) {
        this.a = new abur((View) frameLayout, i, i2);
    }

    public final void a(View view) {
    }

    public final void a(final a aVar) {
        if (this.a.b()) {
            aVar.a(this.a.a());
        } else {
            this.a.a(new abur.a<View>() {
                public final void onViewInflated(View view) {
                    aVar.a(view);
                }
            });
        }
    }

    public final void a(boolean z) {
        this.a.a(0);
        this.b = System.currentTimeMillis();
    }

    public final boolean a() {
        return this.a.c();
    }

    public final void b(boolean z) {
        this.a.a(8);
    }
}
