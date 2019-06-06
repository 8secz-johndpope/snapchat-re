package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: rdn */
final class rdn implements OnLongClickListener {
    private final /* synthetic */ akbl a;

    rdn(akbl akbl) {
        this.a = akbl;
    }

    public final /* synthetic */ boolean onLongClick(View view) {
        Object invoke = this.a.invoke(view);
        akcr.a(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
