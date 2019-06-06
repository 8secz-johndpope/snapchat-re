package xyz.danoz.recyclerviewfastscroller.vertical;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.altc;
import defpackage.altf;
import defpackage.altg;
import defpackage.alti;
import defpackage.altj;
import defpackage.altk;

public class VerticalRecyclerViewFastScroller extends altc {
    private altk d;
    private altg e;

    public VerticalRecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private VerticalRecyclerViewFastScroller(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
    }

    public final void a(float f) {
        if (this.e != null) {
            View view = this.b;
            altg altg = this.e;
            view.setY(Math.max(altg.a.a, Math.min(f * altg.a.b, altg.a.b)));
        }
    }

    public final void b() {
        altf altf = new altf(this.a.getY(), (this.a.getY() + ((float) this.a.getHeight())) - ((float) this.b.getHeight()));
        this.d = new altj(altf);
        this.e = new altg(altf);
    }

    public final alti c() {
        return this.d;
    }
}
