package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: igr */
public final class igr implements ajdr<Intent> {
    private final Context a;
    private final IntentFilter b;
    private final a c;

    /* renamed from: igr$a */
    interface a {
        public static final a a = -$$Lambda$igr$a$YtLbTUUj3uKqqD__vNUELwaJ0MA.INSTANCE;

        /* renamed from: igr$a$-CC */
        public final /* synthetic */ class -CC {
        }

        /* renamed from: igr$a$1 */
        static class 1 extends BroadcastReceiver {
            private /* synthetic */ ajdq a;

            1(ajdq ajdq) {
                this.a = ajdq;
            }

            public final void onReceive(Context context, Intent intent) {
                this.a.a((Object) intent);
            }
        }

        BroadcastReceiver create(ajdq<Intent> ajdq);
    }

    private igr(Context context, IntentFilter intentFilter) {
        this(context, intentFilter, a.a);
    }

    private igr(Context context, IntentFilter intentFilter, a aVar) {
        this.a = context.getApplicationContext();
        this.b = intentFilter;
        this.c = aVar;
    }

    public static ajdp<Intent> a(Context context, IntentFilter intentFilter) {
        return ajdp.a(new igr(context, intentFilter)).b(ajwh.c).c(ajwh.c);
    }

    private /* synthetic */ void a(BroadcastReceiver broadcastReceiver) {
        try {
            this.a.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void subscribe(ajdq<Intent> ajdq) {
        ajej ajei = new ajei();
        BroadcastReceiver create = this.c.create(ajdq);
        ajdq.a(ajei);
        Context context = this.a;
        if (context != null) {
            context.registerReceiver(create, this.b);
            ajei.a(ajek.a(new -$$Lambda$igr$LGP0mAcSNb4NelonhCwFChRwiKg(this, create)));
        }
    }
}
