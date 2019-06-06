package org.opencv.core;

public class TermCriteria {
    public static final int COUNT = 1;
    public static final int EPS = 2;
    public static final int MAX_ITER = 1;
    public double epsilon;
    public int maxCount;
    public int type;

    public TermCriteria() {
        this(0, 0, 0.0d);
    }

    public TermCriteria(int i, int i2, double d) {
        this.type = i;
        this.maxCount = i2;
        this.epsilon = d;
    }

    public TermCriteria(double[] dArr) {
        set(dArr);
    }

    public TermCriteria clone() {
        return new TermCriteria(this.type, this.maxCount, this.epsilon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermCriteria)) {
            return false;
        }
        TermCriteria termCriteria = (TermCriteria) obj;
        return this.type == termCriteria.type && this.maxCount == termCriteria.maxCount && this.epsilon == termCriteria.epsilon;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits((double) this.type);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits((double) this.maxCount);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.epsilon);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void set(double[] dArr) {
        double d = 0.0d;
        int i = 0;
        if (dArr != null) {
            this.type = dArr.length > 0 ? (int) dArr[0] : 0;
            if (dArr.length > 1) {
                i = (int) dArr[1];
            }
            this.maxCount = i;
            if (dArr.length > 2) {
                d = dArr[2];
            }
            this.epsilon = d;
            return;
        }
        this.type = 0;
        this.maxCount = 0;
        this.epsilon = 0.0d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{ type: ");
        stringBuilder.append(this.type);
        stringBuilder.append(", maxCount: ");
        stringBuilder.append(this.maxCount);
        stringBuilder.append(", epsilon: ");
        stringBuilder.append(this.epsilon);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
