package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: ev */
final class ev implements ew {
    private final ViewGroupOverlay a;

    ev(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public final void a(View view) {
        this.a.add(view);
    }

    public final void b(View view) {
        this.a.remove(view);
    }
}
