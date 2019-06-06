package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: dza */
public final class dza implements dzb {
    public final List<dzb> a = new CopyOnWriteArrayList();
    public volatile boolean b = false;
    private int c;
    private adic d;
    private float[] e;
    private float[] f;

    public final void a(boolean z) {
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean a(int i, adic adic, float[] fArr, float[] fArr2) {
        this.c = i;
        this.d = adic;
        this.e = (float[]) fArr.clone();
        this.f = (float[]) fArr2.clone();
        boolean z = false;
        for (dzb dzb : this.a) {
            if (dzb.a() && dzb.a(this.c, this.d, this.e, this.f)) {
                this.c = dzb.b();
                this.d = dzb.c();
                this.e = dzb.d().b;
                this.f = dzb.e().b;
                z = true;
            }
        }
        return z;
    }

    public final int b() {
        return this.c;
    }

    public final adic c() {
        return this.d;
    }

    public final adie d() {
        return new adie(this.e);
    }

    public final adie e() {
        return new adie(this.f);
    }

    public final void f() {
        for (dzb f : this.a) {
            f.f();
        }
    }
}
