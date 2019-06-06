package defpackage;

/* renamed from: apu */
public final class apu {
    int a;
    long b;
    private boolean c = false;

    private apu(long j, int i) {
        this.b = j;
        this.a = i;
    }

    public static apu a(String str, int i) {
        if (1 >= i) {
            return null;
        }
        long j = 0;
        int i2 = 1;
        while (i2 < i) {
            char charAt = str.charAt(i2);
            if (charAt < '0' || charAt > '9') {
                int i3;
                if (charAt < 'A' || charAt > 'F') {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j <<= 4;
                    i3 = charAt - 97;
                } else {
                    j <<= 4;
                    i3 = charAt - 65;
                }
                j = (j + ((long) i3)) + 10;
            } else {
                j = (j << 4) + ((long) (charAt - 48));
            }
            if (j > 4294967295L) {
                return null;
            }
            i2++;
        }
        return i2 == 1 ? null : new apu(j, i2);
    }
}
