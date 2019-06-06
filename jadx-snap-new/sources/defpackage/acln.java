package defpackage;

import android.os.SystemClock;
import defpackage.acup.a;
import defpackage.acup.b;

/* renamed from: acln */
public final class acln implements a {
    private final acxj a;
    private final aclo b;
    private final acwr c;
    private long d;
    private boolean e = false;

    public acln(acxj acxj, acwr acwr, aclo aclo) {
        this.a = acxj;
        this.b = aclo;
        this.c = acwr;
        this.d = System.currentTimeMillis();
    }

    public final Object a(cgi cgi, float f, float f2) {
        return null;
    }

    public final void a() {
        this.d = -1;
        this.e = false;
    }

    public final void a(acmj acmj, b bVar) {
        if (this.d == -1) {
            this.d = System.currentTimeMillis();
        }
        if (!this.e) {
            acxj acxj = this.a;
            if (acxj.b.c.a()) {
                this.e = true;
            } else {
                acxj.b.a();
            }
            this.c.d();
        }
        aclo aclo = this.b;
        if (aclo.N) {
            aclo.N = false;
        } else {
            aclo.J = false;
        }
        aclo.L++;
        aclo.M += SystemClock.elapsedRealtime() - aclo.K;
    }

    public final String b() {
        return "TopRenderer";
    }

    public final boolean c() {
        return true;
    }
}
