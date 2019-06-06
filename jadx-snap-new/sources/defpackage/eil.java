package defpackage;

import defpackage.dpw.a;
import defpackage.dpw.a.b;
import java.util.Objects;

/* renamed from: eil */
public final class eil implements dno {
    boolean a = false;
    public volatile String b = null;
    public boolean c = false;
    private final ajdp<dpx> d;
    private boolean e = false;
    private volatile aepx f = null;

    public eil(ajdp<dpx> ajdp) {
        this.d = ajdp;
    }

    private void a(dpx dpx) {
        String str;
        this.f = dpx.b;
        dpw dpw = dpx.a;
        this.c = dpw instanceof a;
        if (dpw instanceof b) {
            this.a = true;
            this.e = false;
            str = ((b) dpw).a;
        } else {
            this.a = false;
            this.e = false;
            str = null;
        }
        this.b = str;
    }

    public final aepx a(String str) {
        aepx aepx = this.f;
        return (aepx == null || !Objects.equals(aepx.a, str)) ? null : aepx;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        aepx a = a(this.b);
        return a != null && a.l.booleanValue();
    }

    public final ajej start() {
        return this.d.f(new -$$Lambda$eil$vUpQaXEPd_rmrV5UP0veb2V2anE(this));
    }
}
