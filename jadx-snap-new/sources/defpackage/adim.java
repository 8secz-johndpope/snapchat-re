package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: adim */
public final class adim extends adiv {
    public AtomicReference<adiv> a = new AtomicReference(null);
    private adiv b = new adii();
    private adie c;
    private adie d;
    private int e;
    private int f;
    private adic g;
    private adne h;
    private adhz i;
    private boolean j;
    private boolean k;

    public final void a(int i, int i2, adic adic) {
        this.e = i;
        this.f = i2;
        this.g = adic;
        this.k = true;
    }

    public final void a(int i, long j, adie adie, adhu adhu) {
        adiv adiv = (adiv) this.a.getAndSet(null);
        if (adiv != null) {
            this.b.e();
            this.b = adiv;
            this.j = false;
        }
        if (!this.j) {
            this.b.a(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            this.j = true;
            this.k = false;
        }
        if (this.k) {
            this.b.a(this.e, this.f, this.g);
            this.k = false;
        }
        this.b.a(i, j, adie, adhu);
    }

    public final void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        this.c = adie;
        this.d = adie2;
        this.e = i;
        this.f = i2;
        this.g = adic;
        this.h = adne;
        this.i = adhz;
    }

    public final void e() {
        if (this.j) {
            this.b.e();
            this.j = false;
        }
    }
}
