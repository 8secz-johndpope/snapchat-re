package defpackage;

import defpackage.mmi.c;
import defpackage.mmi.d;

/* renamed from: kxy */
final class kxy implements mmt {
    final mmt a;
    final ajec<d, d> b;
    private final mmi c = new a(this);

    /* renamed from: kxy$a */
    public static final class a implements mmi {
        private final kwx a;
        private final /* synthetic */ mmi b;
        private /* synthetic */ kxy c;

        a(kxy kxy) {
            this.c = kxy;
            this.b = kxy.a.a();
            this.a = new kwx(kxy.a, kxy.b);
        }

        public final /* bridge */ /* synthetic */ mid a() {
            return this.a;
        }

        public final ajdp<c> b() {
            return this.b.b();
        }

        public final mid<Object, Boolean> c() {
            return this.b.c();
        }

        public final mid<Object, Boolean> d() {
            return this.b.d();
        }
    }

    public kxy(mmt mmt, ajec<d, d> ajec) {
        akcr.b(mmt, "lensCore");
        akcr.b(ajec, "filterRequestTransformer");
        this.a = mmt;
        this.b = ajec;
    }

    public final mmi a() {
        return this.c;
    }

    public final mjf b() {
        return this.a.b();
    }

    public final mjh c() {
        return this.a.c();
    }

    public final mji d() {
        return this.a.d();
    }

    public final mjl e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            kxy kxy = (kxy) obj;
            return (akcr.a(this.a, kxy.a) ^ 1) == 0 && (akcr.a(this.b, kxy.b) ^ 1) == 0;
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.lenses.app.camera.LensCoreWithTransformers");
        }
    }

    public final mjm f() {
        return this.a.f();
    }

    public final mjn g() {
        return this.a.g();
    }

    public final mmg h() {
        return this.a.h();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final mmj i() {
        return this.a.i();
    }

    public final mmk j() {
        return this.a.j();
    }

    public final mnb k() {
        return this.a.k();
    }

    public final mnq l() {
        return this.a.l();
    }

    public final mnt m() {
        return this.a.m();
    }

    public final mnu n() {
        return this.a.n();
    }

    public final mny o() {
        return this.a.o();
    }

    public final mop p() {
        return this.a.p();
    }

    public final mou q() {
        return this.a.q();
    }

    public final mov r() {
        return this.a.r();
    }

    public final mpa s() {
        return this.a.s();
    }

    public final mpb t() {
        return this.a.t();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensCoreWithTransformers(lensCore=");
        stringBuilder.append(this.a);
        stringBuilder.append(", filterRequestTransformer=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final mpl u() {
        return this.a.u();
    }
}
