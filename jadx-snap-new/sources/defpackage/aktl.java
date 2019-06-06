package defpackage;

/* renamed from: aktl */
public final class aktl {
    public static int a(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        StringBuilder stringBuilder = new StringBuilder("The calculation caused an overflow: ");
        stringBuilder.append(i);
        stringBuilder.append(" + ");
        stringBuilder.append(i2);
        throw new ArithmeticException(stringBuilder.toString());
    }

    public static int a(long j) {
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Value cannot fit in an int: ".concat(String.valueOf(j)));
    }

    public static long a(long j, int i) {
        String str = " * ";
        String str2 = "Multiplication overflows a long: ";
        StringBuilder stringBuilder;
        if (i != -1) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return j;
            }
            long j2 = (long) i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(j);
            stringBuilder.append(str);
            stringBuilder.append(i);
            throw new ArithmeticException(stringBuilder.toString());
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(j);
            stringBuilder.append(str);
            stringBuilder.append(i);
            throw new ArithmeticException(stringBuilder.toString());
        }
    }

    public static long a(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder stringBuilder = new StringBuilder("The calculation caused an overflow: ");
        stringBuilder.append(j);
        stringBuilder.append(" + ");
        stringBuilder.append(j2);
        throw new ArithmeticException(stringBuilder.toString());
    }

    public static void a(akqz akqz, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new akri(akqz.a(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static void a(akra akra, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new akri(akra, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 ? true : (obj == null || obj2 == null) ? false : obj.equals(obj2);
    }

    public static long b(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        StringBuilder stringBuilder = new StringBuilder("The calculation caused an overflow: ");
        stringBuilder.append(j);
        stringBuilder.append(" - ");
        stringBuilder.append(j2);
        throw new ArithmeticException(stringBuilder.toString());
    }
}
