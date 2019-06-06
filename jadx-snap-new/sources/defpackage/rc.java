package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: rc */
public final class rc extends qz<qu> {
    private static final String d = pq.a("NetworkNotRoamingCtrlr");

    public rc(Context context) {
        super(rl.a(context).c);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(rv rvVar) {
        return rvVar.k.b == pr.NOT_ROAMING;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ boolean b(Object obj) {
        qu quVar = (qu) obj;
        if (VERSION.SDK_INT >= 24) {
            return (quVar.a && quVar.d) ? false : true;
        } else {
            pq.a().a(d, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !quVar.a;
        }
    }
}
