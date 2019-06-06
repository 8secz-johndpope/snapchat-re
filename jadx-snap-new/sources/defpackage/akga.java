package defpackage;

/* renamed from: akga */
public class akga extends akfz {
    public static final Integer d(String str) {
        akcr.b(str, "receiver$0");
        return akga.e(str);
    }

    public static final Integer e(String str) {
        akcr.b(str, "receiver$0");
        int length = str.length();
        if (length == 0) {
            return null;
        }
        Object obj;
        int i = 0;
        char charAt = str.charAt(0);
        int i2 = -2147483647;
        int i3 = 1;
        if (charAt >= '0') {
            obj = null;
            i3 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i2 = Integer.MIN_VALUE;
                obj = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                obj = null;
            }
        }
        length--;
        if (i3 <= length) {
            while (true) {
                int digit = Character.digit(str.charAt(i3), 10);
                if (digit >= 0 && i >= -214748364) {
                    i *= 10;
                    if (i >= i2 + digit) {
                        i -= digit;
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    } else {
                        return null;
                    }
                }
                return null;
            }
        }
        return obj != null ? Integer.valueOf(i) : Integer.valueOf(-i);
    }

    public static final Long f(String str) {
        akcr.b(str, "receiver$0");
        return akga.g(str);
    }

    public static final Long g(String str) {
        akcr.b(str, "receiver$0");
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        int i2 = 1;
        if (charAt >= '0') {
            i2 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i = 1;
            } else if (charAt != '+') {
                return null;
            }
        }
        long j2 = 0;
        length--;
        if (i2 <= length) {
            while (true) {
                int digit = Character.digit(str.charAt(i2), 10);
                if (digit >= 0 && j2 >= -922337203685477580L) {
                    j2 *= 10;
                    long j3 = (long) digit;
                    if (j2 >= j + j3) {
                        j2 -= j3;
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    } else {
                        return null;
                    }
                }
                return null;
            }
        }
        return i != 0 ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
