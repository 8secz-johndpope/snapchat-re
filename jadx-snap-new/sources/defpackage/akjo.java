package defpackage;

/* renamed from: akjo */
public final class akjo {
    int a;
    final int[] b = new int[10];

    /* Access modifiers changed, original: final */
    public final int a() {
        return (this.a & 2) != 0 ? this.b[1] : -1;
    }

    /* Access modifiers changed, original: final */
    public final akjo a(int i, int i2) {
        if (i >= 0 && i < 10) {
            this.a = (1 << i) | this.a;
            this.b[i] = i2;
        }
        return this;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final int b() {
        return (this.a & 128) != 0 ? this.b[7] : 65535;
    }
}
