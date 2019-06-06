package defpackage;

import android.os.Bundle;
import defpackage.ebp.a;

/* renamed from: wjr */
public final class wjr implements igx {
    wjv a;
    akbk<? extends ajxm<? extends ebp, Long>> b;
    private final ihh c;

    public wjr(ihh ihh) {
        akcr.b(ihh, "clock");
        this.c = ihh;
    }

    public final void a(Bundle bundle) {
        akcr.b(bundle, "savedInstanceState");
        akbk akbk = this.b;
        if (akbk != null) {
            ajxm ajxm = (ajxm) akbk.invoke();
            if (ajxm != null) {
                ebp ebp = (ebp) ajxm.a;
                long longValue = ((Number) ajxm.b).longValue();
                Bundle bundle2 = new Bundle();
                ebp.a(bundle2);
                bundle.putBundle("com.snap.sendflow.recoverableMediaTypeConfig", bundle2);
                bundle.putLong("com.snap.sendflow.recoverableMediaExpirationTime", this.c.a() + longValue);
            }
        }
    }

    public final void b(Bundle bundle) {
        wjv wjv;
        akcr.b(bundle, "savedInstanceState");
        Bundle bundle2 = bundle.getBundle("com.snap.sendflow.recoverableMediaTypeConfig");
        if (bundle2 != null) {
            if ((bundle.getLong("com.snap.sendflow.recoverableMediaExpirationTime", -1) >= this.c.a() ? 1 : null) != null) {
                wjv = new wjv(a.a(bundle2));
                this.a = wjv;
            }
        }
        wjv = null;
        this.a = wjv;
    }
}
