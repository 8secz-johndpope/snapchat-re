package defpackage;

import java.io.Serializable;

/* renamed from: akqy */
public final class akqy extends aksh implements akru, Serializable {

    /* renamed from: akqy$a */
    public static final class a extends aktf {
        private akqy a;
        private akqz b;

        public a(akqy akqy, akqz akqz) {
            this.a = akqy;
            this.b = akqz;
        }

        public final akqz a() {
            return this.b;
        }

        public final long b() {
            return this.a.a;
        }

        public final akqx c() {
            return this.a.b;
        }
    }

    public akqy(int i, int i2, int i3, int i4, int i5, int i6, int i7, akqx akqx) {
        super(i, i2, i3, i4, i5, i6, i7, akqx);
    }

    public akqy(long j) {
        super(j);
    }

    public akqy(long j, akqx akqx) {
        super(j, akqx);
    }

    public akqy(long j, akrc akrc) {
        super(j, akrc);
    }

    public akqy(akrc akrc) {
        super(akrc);
    }

    public final akqy a() {
        return b_(this.b.f().a(this.a, 60));
    }

    public final akqy a(int i) {
        return i == 0 ? this : b_(this.b.l().a(this.a, i));
    }

    public final akqy a(akrc akrc) {
        akqx a = akrb.a(this.b.a(akrc));
        return a == this.b ? this : new akqy(this.a, a);
    }

    public final akrl au_() {
        return new akrl(this.a, this.b);
    }

    public final a av_() {
        return new a(this, this.b.C());
    }

    public final akqy b(int i) {
        return b_(this.b.c().a(this.a, 60000));
    }

    public final akqy b(long j) {
        return j == 0 ? this : b_(this.b.a(this.a, j, 1));
    }

    public final akqy b_(long j) {
        return j == this.a ? this : new akqy(j, this.b);
    }

    public final akqy c(int i) {
        return i == 0 ? this : b_(this.b.s().b(this.a, i));
    }
}
