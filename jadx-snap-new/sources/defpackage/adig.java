package defpackage;

import com.google.common.base.Preconditions;
import defpackage.adhe.a;

/* renamed from: adig */
public final class adig extends adiv {
    public volatile boolean a;
    private final adiv b;
    private final adiv c;
    private final Integer d;
    private final a e;
    private adhe f;
    private adhd g;
    private adie h;

    private adig(adiv adiv, adiv adiv2, Integer num, a aVar) {
        this.a = false;
        this.b = (adiv) Preconditions.checkNotNull(adiv);
        this.c = new adii();
        this.d = num;
        this.e = aVar;
    }

    public adig(adiv adiv, Integer num) {
        this(adiv, null, num, new a());
    }

    public final void a(int i, int i2, adic adic) {
        this.b.a(i, i2, adic);
    }

    public final void a(int i, long j, adie adie, adhu adhu) {
        adie adie2 = this.h;
        if (adie2 == null || !adie2.equals(adie)) {
            this.a = false;
            this.h = adie;
        }
        if (!this.a) {
            if (this.g == null) {
                int i2;
                int i3;
                if (this.d == null || adhu.b <= this.d.intValue()) {
                    i2 = adhu.a;
                    i3 = adhu.b;
                } else {
                    i2 = (adhu.a * this.d.intValue()) / adhu.b;
                    i3 = this.d.intValue();
                }
                this.f = a.a(i2, i3, 1);
                this.g = this.f.b();
            }
            this.g.a();
            this.b.a(i, j, adie, this.g.d);
            this.g.a(false);
            this.a = true;
        }
        adhu.c();
        this.c.a(this.g.c, j, new adie(), adhu);
    }

    public final void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        this.b.a(adie, adie2, i, i2, adic, adne, adhz);
        this.c.a(new adie().c(), new adie(), i, i2, adic.TEXTURE_2D, adne, adhz);
    }

    public final void e() {
        if (this.a) {
            this.f.a(this.g);
            this.f.c();
            this.a = false;
        }
        this.c.e();
        this.b.e();
    }
}
