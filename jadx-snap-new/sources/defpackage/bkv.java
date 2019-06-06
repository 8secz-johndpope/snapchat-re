package defpackage;

/* renamed from: bkv */
public abstract class bkv implements bls, blt {
    protected blu a;
    protected int b;
    protected int c;
    protected bsn d;
    protected blg[] e;
    protected boolean f = true;
    protected boolean g;
    private final int h;
    private long i;

    public bkv(int i) {
        this.h = i;
    }

    protected static boolean a(bnd<?> bnd, bnb bnb) {
        return bnb == null ? true : bnd == null ? false : bnd.a(bnb);
    }

    public final int a() {
        return this.h;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(blh blh, bmy bmy, boolean z) {
        int a = this.d.a(blh, bmy, z);
        if (a == -4) {
            if (bmy.c()) {
                this.f = true;
                return this.g ? -4 : -3;
            } else {
                bmy.d += this.i;
            }
        } else if (a == -5) {
            blg blg = blh.a;
            if (blg.j != Long.MAX_VALUE) {
                blh.a = blg.a(blg.j + this.i);
            }
        }
        return a;
    }

    public final void a(int i) {
        this.b = i;
    }

    public void a(int i, Object obj) {
    }

    public final void a(long j) {
        this.g = false;
        this.f = false;
        a(j, false);
    }

    /* Access modifiers changed, original: protected */
    public void a(long j, boolean z) {
    }

    public final void a(blu blu, blg[] blgArr, bsn bsn, long j, boolean z, long j2) {
        byo.b(this.c == 0);
        this.a = blu;
        this.c = 1;
        a(z);
        a(blgArr, bsn, j2);
        a(j, z);
    }

    /* Access modifiers changed, original: protected */
    public void a(boolean z) {
    }

    /* Access modifiers changed, original: protected */
    public void a(blg[] blgArr, long j) {
    }

    public final void a(blg[] blgArr, bsn bsn, long j) {
        byo.b(this.g ^ 1);
        this.d = bsn;
        this.f = false;
        this.e = blgArr;
        this.i = j;
        a(blgArr, j);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(long j) {
        return this.d.a_(j - this.i);
    }

    public final blt b() {
        return this;
    }

    public byy c() {
        return null;
    }

    public final bsn f() {
        return this.d;
    }

    public final boolean g() {
        return this.f;
    }

    public final void h() {
        this.g = true;
    }

    public final boolean i() {
        return this.g;
    }

    public final int i_() {
        return this.c;
    }

    public final void j() {
        this.d.b();
    }

    public final void j_() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        byo.b(z);
        this.c = 2;
        n();
    }

    public final void k() {
        byo.b(this.c == 2);
        this.c = 1;
        o();
    }

    public final void l() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        byo.b(z);
        this.c = 0;
        this.d = null;
        this.e = null;
        this.g = false;
        p();
    }

    public int m() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public void n() {
    }

    /* Access modifiers changed, original: protected */
    public void o() {
    }

    /* Access modifiers changed, original: protected */
    public void p() {
    }
}
