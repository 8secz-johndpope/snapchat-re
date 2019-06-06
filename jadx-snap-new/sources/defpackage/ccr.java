package defpackage;

/* renamed from: ccr */
public final class ccr {
    public ccs a;
    public ccs b;
    public ccs c;
    public ccw d;
    public ccw e;
    public a f;
    public a g;

    /* renamed from: ccr$a */
    public static class a {
        private final int a = 10;
        private int b;

        a() {
        }

        public final void a(boolean z) {
            this.b = !z ? 0 : this.b + 1;
        }

        public final boolean a() {
            return this.b >= 10;
        }
    }

    public ccr() {
        a();
    }

    public final void a() {
        this.d = new ccw();
        this.e = new ccw();
        this.a = new ccs(1.0d);
        this.b = new ccs(10.0d);
        this.c = new ccs(0.15000000596046448d);
        this.f = new a();
        this.g = new a();
    }
}
