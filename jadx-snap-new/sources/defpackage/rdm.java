package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: rdm */
final class rdm implements OnClickListener {
    private final /* synthetic */ akbl a;

    rdm(akbl akbl) {
        this.a = akbl;
    }

    public final /* synthetic */ void onClick(View view) {
        akcr.a(this.a.invoke(view), "invoke(...)");
    }
}
