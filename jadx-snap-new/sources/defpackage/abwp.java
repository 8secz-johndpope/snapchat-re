package defpackage;

import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: abwp */
public final class abwp implements abwk {
    public abwk a;
    public boolean b;
    public int c;
    public int d;
    public akbk<ajxw> e;
    private int f;
    private int g;

    public final void a(View view, abxs abxs, int i, int i2) {
        akcr.b(abxs, "returnedDimensions");
        this.g = MeasureSpec.getSize(i);
        this.d = MeasureSpec.getSize(i2);
        if (this.b) {
            i2 = MeasureSpec.makeMeasureSpec(0, 0);
        }
        abwk abwk = this.a;
        if (abwk == null) {
            akcr.a("strategy");
        }
        abwk.a(view, abxs, i, i2);
        this.f = abxs.a;
        this.c = abxs.b;
    }

    public final void a(View view, boolean z, int i, int i2, int i3, int i4) {
        abwk abwk = this.a;
        if (abwk == null) {
            akcr.a("strategy");
        }
        abwk.a(view, z, i, i2, i3, i4);
        akbk akbk = this.e;
        if (akbk != null) {
            akbk.invoke();
        }
    }
}
