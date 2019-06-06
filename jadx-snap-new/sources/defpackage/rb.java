package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: rb */
public final class rb extends qz<qu> {
    private static final String d = pq.a("NetworkMeteredCtrlr");

    public rb(Context context) {
        super(rl.a(context).c);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(rv rvVar) {
        return rvVar.k.b == pr.METERED;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ boolean b(Object obj) {
        qu quVar = (qu) obj;
        if (VERSION.SDK_INT >= 26) {
            return (quVar.a && quVar.c) ? false : true;
        } else {
            pq.a().a(d, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !quVar.a;
        }
    }
}
