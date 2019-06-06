package defpackage;

import defpackage.ahn.c;
import defpackage.jf.a;

/* renamed from: aaw */
final class aaw<Z> implements aax<Z>, c {
    private static final a<aaw<?>> a = ahn.a(20, new 1());
    private final aho b = new aho.a();
    private aax<Z> c;
    private boolean d;
    private boolean e;

    /* renamed from: aaw$1 */
    class 1 implements ahn.a<aaw<?>> {
        1() {
        }

        public final /* synthetic */ Object a() {
            return new aaw();
        }
    }

    aaw() {
    }

    static <Z> aaw<Z> a(aax<Z> aax) {
        aaw aaw = (aaw) ahl.a((aaw) a.a(), "Argument must not be null");
        aaw.b(aax);
        return aaw;
    }

    private void b(aax<Z> aax) {
        this.e = false;
        this.d = true;
        this.c = aax;
    }

    public final Class<Z> a() {
        return this.c.a();
    }

    public final Z b() {
        return this.c.b();
    }

    public final aho b_() {
        return this.b;
    }

    public final int c() {
        return this.c.c();
    }

    public final synchronized void d() {
        this.b.a();
        this.e = true;
        if (!this.d) {
            this.c.d();
            this.c = null;
            a.a(this);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void e() {
        this.b.a();
        if (this.d) {
            this.d = false;
            if (this.e) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
