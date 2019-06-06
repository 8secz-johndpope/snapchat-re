package org.jcodec.common.model;

public class Rational {
    public static final Rational HALF = new Rational(1, 2);
    public static final Rational ONE = new Rational(1, 1);
    public static final Rational ZERO = new Rational(0, 1);
    public final int den;
    public final int num;

    public Rational(int i, int i2) {
        this.num = i;
        this.den = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rational rational = (Rational) obj;
        return this.den == rational.den && this.num == rational.num;
    }

    public int getDen() {
        return this.den;
    }

    public int getNum() {
        return this.num;
    }

    public int hashCode() {
        return ((this.den + 31) * 31) + this.num;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.num);
        stringBuilder.append("/");
        stringBuilder.append(this.den);
        return stringBuilder.toString();
    }
}
