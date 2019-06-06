package defpackage;

import android.view.View;
import com.snap.ui.autofocus.AutofocusTapView;
import com.snapchat.android.R;
import defpackage.edv.b;

/* renamed from: edz */
public final class edz implements b {
    private final abur<AutofocusTapView> a;

    public edz(View view) {
        this.a = new abur(view, (int) R.id.autofocus_tapspot_stub, (int) R.id.autofocus_tapspot);
    }

    public final void a(int i, int i2) {
        ((AutofocusTapView) this.a.a()).a((float) i, (float) i2);
    }
}
