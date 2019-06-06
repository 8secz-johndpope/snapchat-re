package defpackage;

/* renamed from: bmu */
public abstract class bmu {
    public int a;

    public void a() {
        this.a = 0;
    }

    public final void a(int i) {
        this.a = i | this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(int i) {
        return (this.a & i) == i;
    }

    public final boolean c() {
        return b(4);
    }

    public final boolean d() {
        return b(1);
    }

    public final boolean m_() {
        return b(Integer.MIN_VALUE);
    }
}
