package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: ra */
public final class ra extends qz<qu> {
    public ra(Context context) {
        super(rl.a(context).c);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(rv rvVar) {
        return rvVar.k.b == pr.CONNECTED;
    }

    /* Access modifiers changed, original: final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        qu quVar = (qu) obj;
        return VERSION.SDK_INT >= 26 ? (quVar.a && quVar.b) ? false : true : !quVar.a;
    }
}
