package defpackage;

import android.content.Context;

/* renamed from: rl */
public final class rl {
    private static rl e;
    public rf a;
    public rg b;
    public rj c;
    public rk d;

    private rl(Context context) {
        context = context.getApplicationContext();
        this.a = new rf(context);
        this.b = new rg(context);
        this.c = new rj(context);
        this.d = new rk(context);
    }

    public static synchronized rl a(Context context) {
        rl rlVar;
        synchronized (rl.class) {
            if (e == null) {
                e = new rl(context);
            }
            rlVar = e;
        }
        return rlVar;
    }
}
