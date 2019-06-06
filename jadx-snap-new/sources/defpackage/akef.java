package defpackage;

/* renamed from: akef */
public class akef extends akee {
    public static final akdy a(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? akdy.d : new akdy(i, i2 - 1);
    }

    public static final Integer a(float f) {
        return (f < -2.14748365E9f || f > 2.14748365E9f) ? null : Integer.valueOf((int) f);
    }

    public static final boolean a(akdv<Integer> akdv, float f) {
        akcr.b(akdv, "receiver$0");
        Integer a = akef.a(f);
        return a != null ? akdv.a(a) : false;
    }

    public static final int b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final int c(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final int d(int i, int i2) {
        if (i2 >= 0) {
            return i < 0 ? 0 : i > i2 ? i2 : i;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            stringBuilder.append(i2);
            stringBuilder.append(" is less than minimum 0.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
