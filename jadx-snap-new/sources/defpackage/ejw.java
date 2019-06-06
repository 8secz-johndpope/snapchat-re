package defpackage;

import java.util.EnumMap;

/* renamed from: ejw */
public final class ejw implements dpk {
    private static final b e = new b();
    final EnumMap<ebx, dpk> a = new EnumMap(ebx.class);
    dpk b = e;
    boolean c = false;
    ecc d;

    /* renamed from: ejw$b */
    static final class b implements dpk {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final ajdx<Boolean> a(ecc ecc) {
            return ajdx.b(Boolean.FALSE);
        }

        public final void a() {
        }
    }

    /* renamed from: ejw$a */
    static class a implements dpk {
        private final dqi a;

        a(dqi dqi) {
            this.a = dqi;
        }

        public final ajdx<Boolean> a(ecc ecc) {
            this.a.a(ecc);
            return ajdx.b(Boolean.TRUE);
        }

        public final void a() {
            this.a.a(ecc.OFF);
        }
    }

    public ejw(dqi dqi) {
        this.a.put(ebx.NONE, e);
        this.a.put(ebx.FRONT_FACING, e);
        this.a.put(ebx.BACK_FACING, new a(dqi));
        this.d = ecc.OFF;
    }

    public final ajdx<Boolean> a(ecc ecc) {
        this.d = ecc;
        return this.b.a(ecc);
    }

    public final void a() {
        this.d = ecc.OFF;
        this.b.a();
    }

    public final void a(ebx ebx, dpk dpk) {
        Object dpk2;
        EnumMap enumMap = this.a;
        ebx ebx2 = ebx.FRONT_FACING;
        if (dpk2 == null) {
            dpk2 = e;
        }
        enumMap.put(ebx2, dpk2);
        this.b = (dpk) this.a.get(ebx);
        if (this.d == ecc.TORCH) {
            this.b.a(this.d);
        }
        this.c = true;
    }

    public final void b() {
        this.b.a();
        this.b = e;
        this.a.put(ebx.FRONT_FACING, e);
        this.c = false;
    }
}
