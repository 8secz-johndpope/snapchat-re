package defpackage;

import defpackage.bry.1;
import defpackage.bry.b;
import defpackage.bsp.a;

/* renamed from: bsh */
public final class bsh extends bry<Void> {
    private final bsj e;
    private final int f;
    private int g;

    /* renamed from: bsh$a */
    static final class a extends bsg {
        public a(bly bly) {
            super(bly);
        }

        public final int a(int i, int i2, boolean z) {
            i = this.b.a(i, i2, z);
            return i == -1 ? b(z) : i;
        }
    }

    /* renamed from: bsh$b */
    static final class b extends brt {
        private final bly b;
        private final int c;
        private final int d;
        private final int e;

        public b(bly bly, int i) {
            super(new a(i));
            this.b = bly;
            this.c = bly.c();
            this.d = bly.b();
            this.e = i;
            int i2 = this.c;
            if (i2 > 0) {
                byo.b(i <= Integer.MAX_VALUE / i2, "LoopingMediaSource contains too many periods");
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final int a(int i) {
            return i / this.c;
        }

        public final int b() {
            return this.d * this.e;
        }

        /* Access modifiers changed, original: protected|final */
        public final int b(int i) {
            return i / this.d;
        }

        /* Access modifiers changed, original: protected|final */
        public final int b(Object obj) {
            return !(obj instanceof Integer) ? -1 : ((Integer) obj).intValue();
        }

        public final int c() {
            return this.c * this.e;
        }

        /* Access modifiers changed, original: protected|final */
        public final int c(int i) {
            return i * this.c;
        }

        /* Access modifiers changed, original: protected|final */
        public final int d(int i) {
            return i * this.d;
        }

        /* Access modifiers changed, original: protected|final */
        public final bly d() {
            return this.b;
        }

        /* Access modifiers changed, original: protected|final */
        public final Object e(int i) {
            return Integer.valueOf(i);
        }
    }

    public bsh(bsj bsj) {
        this(bsj, Integer.MAX_VALUE);
    }

    public bsh(bsj bsj, int i) {
        byo.a(i > 0);
        this.e = bsj;
        this.f = i;
    }

    public final bsi a(bsj.a aVar, bwy bwy) {
        bsj bsj;
        if (this.f != Integer.MAX_VALUE) {
            bsj = this.e;
            aVar = aVar.a(aVar.a % this.g);
        } else {
            bsj = this.e;
        }
        return bsj.a(aVar, bwy);
    }

    public final void a() {
        super.a();
        this.g = 0;
    }

    public final void a(blb blb, boolean z) {
        super.a(blb, z);
        bsj bsj = this.e;
        byo.a(this.b.containsKey(null) ^ 1);
        1 1 = new 1();
        bsk aVar = new bry.a(this);
        this.b.put(null, new b(bsj, 1, aVar));
        bsj.a(this.d, aVar);
        bsj.a(this.c, false, 1);
    }

    public final void a(bsi bsi) {
        this.e.a(bsi);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void b(bly bly, Object obj) {
        this.g = bly.c();
        int i = this.f;
        a(i != Integer.MAX_VALUE ? new b(bly, i) : new a(bly), obj);
    }
}
