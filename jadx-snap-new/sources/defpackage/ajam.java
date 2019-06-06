package defpackage;

/* renamed from: ajam */
public final class ajam {
    int a;
    int b;
    int c;
    public final int[] d = new int[10];

    /* Access modifiers changed, original: final */
    public final int a() {
        return (this.a & 2) != 0 ? this.d[1] : -1;
    }

    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }
}
