package defpackage;

/* renamed from: akau */
public final class akau {
    private static final int a(int i, int i2) {
        i %= i2;
        return i >= 0 ? i : i + i2;
    }

    public static final int a(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - akau.b(i2, i, i3);
        } else {
            if (i3 < 0) {
                return i <= i2 ? i2 : i2 + akau.b(i, i2, -i3);
            } else {
                throw new IllegalArgumentException("Step is zero.");
            }
        }
    }

    private static final long a(long j, long j2) {
        j %= j2;
        return j >= 0 ? j : j + j2;
    }

    public static final long a(long j, long j2, long j3) {
        return akau.a(akau.a(j, j3) - akau.a(j2, j3), j3);
    }

    private static final int b(int i, int i2, int i3) {
        return akau.a(akau.a(i, i3) - akau.a(i2, i3), i3);
    }
}
