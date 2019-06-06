package defpackage;

import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: abwq */
public final class abwq implements abwk {
    public boolean a;
    public boolean b;
    private abwk c;

    public final void a(abwk abwk) {
        akcr.b(abwk, "layoutStrategy");
        this.c = abwk;
    }

    public final void a(View view, abxs abxs, int i, int i2) {
        akcr.b(abxs, "returnedDimensions");
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (this.a) {
            MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        }
        if (this.b) {
            MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        }
        abwk abwk = this.c;
        if (abwk == null) {
            akcr.a("layoutStrategy");
        }
        abwk.a(view, abxs, i, i2);
        if (mode == AudioPlayer.INFINITY_LOOP_COUNT) {
            abxs.a = size;
        } else if (mode == Integer.MIN_VALUE) {
            abxs.a = Math.min(abxs.a, size);
        }
        if (mode2 == AudioPlayer.INFINITY_LOOP_COUNT) {
            abxs.b = size2;
            return;
        }
        if (mode2 == Integer.MIN_VALUE) {
            abxs.b = Math.min(abxs.b, size2);
        }
    }

    public final void a(View view, boolean z, int i, int i2, int i3, int i4) {
        abwk abwk = this.c;
        if (abwk == null) {
            akcr.a("layoutStrategy");
        }
        abwk.a(view, z, i, i2, i3, i4);
    }
}
