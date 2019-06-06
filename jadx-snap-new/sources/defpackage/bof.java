package defpackage;

/* renamed from: bof */
final class bof {
    final bzc a = new bzc(8);
    int b;

    /* Access modifiers changed, original: final */
    public final long a(bnl bnl) {
        int i = 0;
        bnl.c(this.a.a, 0, 1);
        int i2 = this.a.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        i2 &= i3 ^ -1;
        bnl.c(this.a.a, 1, i4);
        while (i < i4) {
            i++;
            i2 = (this.a.a[i] & 255) + (i2 << 8);
        }
        this.b += i4 + 1;
        return (long) i2;
    }
}
