package defpackage;

import java.io.Serializable;

/* renamed from: aksh */
public abstract class aksh extends aksc implements akru, Serializable {
    public volatile long a;
    public volatile akqx b;

    public aksh() {
        this(akrb.a(), aktc.b(akrc.a()));
    }

    public aksh(int i, int i2, int i3, int i4, int i5, int i6, int i7, akqx akqx) {
        this.b = akrb.a(akqx);
        long a = this.b.a(i, i2, i3, i4, i5, i6, i7);
        akqx akqx2 = this.b;
        this.a = a;
        j();
    }

    public aksh(long j) {
        this(j, aktc.b(akrc.a()));
    }

    public aksh(long j, akqx akqx) {
        this.b = akrb.a(akqx);
        akqx = this.b;
        this.a = j;
        j();
    }

    public aksh(long j, akrc akrc) {
        this(j, aktc.b(akrc));
    }

    public aksh(akrc akrc) {
        this(akrb.a(), aktc.b(akrc));
    }

    private void j() {
        if (this.a == Long.MIN_VALUE || this.a == Long.MAX_VALUE) {
            this.b = this.b.b();
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(long j) {
        akqx akqx = this.b;
        this.a = j;
    }

    public final long b() {
        return this.a;
    }

    public final akqx c() {
        return this.b;
    }
}
