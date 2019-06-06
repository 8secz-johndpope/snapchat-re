package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: adin */
public final class adin extends adiv {
    private final adiv a;
    private adie b;
    private adie c;
    private int d;
    private int e;
    private adic f;
    private adne g;
    private adhz h;
    private boolean i = false;
    private boolean j = false;

    public adin(adiv adiv) {
        this.a = (adiv) Preconditions.checkNotNull(adiv);
    }

    public final void a(int i, int i2, adic adic) {
        this.d = i;
        this.e = i2;
        this.f = adic;
        this.j = true;
    }

    public final void a(int i, long j, adie adie, adhu adhu) {
        if (!this.i) {
            try {
                this.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                this.i = true;
                this.j = false;
            } catch (adkd e) {
                throw new adkc(e);
            }
        }
        if (this.j) {
            try {
                this.a.a(this.d, this.e, this.f);
                this.j = false;
            } catch (adkd e2) {
                throw new adkc(e2);
            }
        }
        this.a.a(i, j, adie, adhu);
    }

    public final void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        this.b = adie;
        this.c = adie2;
        this.d = i;
        this.e = i2;
        this.f = adic;
        this.g = adne;
        this.h = adhz;
    }

    public final void e() {
        if (this.i) {
            this.a.e();
        }
    }
}
