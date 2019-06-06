package org.opencv.imgproc;

public class Moments {
    public double m00;
    public double m01;
    public double m02;
    public double m03;
    public double m10;
    public double m11;
    public double m12;
    public double m20;
    public double m21;
    public double m30;
    public double mu02;
    public double mu03;
    public double mu11;
    public double mu12;
    public double mu20;
    public double mu21;
    public double mu30;
    public double nu02;
    public double nu03;
    public double nu11;
    public double nu12;
    public double nu20;
    public double nu21;
    public double nu30;

    public Moments() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
    }

    public Moments(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.m00 = d;
        this.m10 = d2;
        this.m01 = d3;
        this.m20 = d4;
        this.m11 = d5;
        this.m02 = d6;
        this.m30 = d7;
        this.m21 = d8;
        this.m12 = d9;
        this.m03 = d10;
        completeState();
    }

    public Moments(double[] dArr) {
        set(dArr);
    }

    /* Access modifiers changed, original: protected */
    public void completeState() {
        double d;
        double d2;
        double d3 = 0.0d;
        if (Math.abs(this.m00) > 1.0E-8d) {
            d3 = 1.0d / this.m00;
            d = this.m10 * d3;
            double d4 = d3;
            d3 = this.m01 * d3;
            d2 = d4;
        } else {
            d = 0.0d;
            d2 = d;
        }
        double d5 = this.m20;
        double d6 = this.m10;
        d5 -= d6 * d;
        double d7 = this.m11 - (d6 * d3);
        double d8 = this.m02;
        double d9 = d2;
        d2 = this.m01;
        d8 -= d2 * d3;
        this.mu20 = d5;
        this.mu11 = d7;
        this.mu02 = d8;
        double d10 = d8;
        this.mu30 = this.m30 - (((d5 * 3.0d) + (d * d6)) * d);
        d7 += d7;
        this.mu21 = (this.m21 - ((d7 + (d * d2)) * d)) - (d5 * d3);
        this.mu12 = (this.m12 - ((d7 + (d6 * d3)) * d3)) - (d * d10);
        this.mu03 = this.m03 - (d3 * ((d10 * 3.0d) + (d2 * d3)));
        d2 = d9 * d9;
        d = Math.sqrt(Math.abs(d9)) * d2;
        this.nu20 = this.mu20 * d2;
        this.nu11 = this.mu11 * d2;
        this.nu02 = this.mu02 * d2;
        this.nu30 = this.mu30 * d;
        this.nu21 = this.mu21 * d;
        this.nu12 = this.mu12 * d;
        this.nu03 = this.mu03 * d;
    }

    public double get_m00() {
        return this.m00;
    }

    public double get_m01() {
        return this.m01;
    }

    public double get_m02() {
        return this.m02;
    }

    public double get_m03() {
        return this.m03;
    }

    public double get_m10() {
        return this.m10;
    }

    public double get_m11() {
        return this.m11;
    }

    public double get_m12() {
        return this.m12;
    }

    public double get_m20() {
        return this.m20;
    }

    public double get_m21() {
        return this.m21;
    }

    public double get_m30() {
        return this.m30;
    }

    public double get_mu02() {
        return this.mu02;
    }

    public double get_mu03() {
        return this.mu03;
    }

    public double get_mu11() {
        return this.mu11;
    }

    public double get_mu12() {
        return this.mu12;
    }

    public double get_mu20() {
        return this.mu20;
    }

    public double get_mu21() {
        return this.mu21;
    }

    public double get_mu30() {
        return this.mu30;
    }

    public double get_nu02() {
        return this.nu02;
    }

    public double get_nu03() {
        return this.nu03;
    }

    public double get_nu11() {
        return this.nu11;
    }

    public double get_nu12() {
        return this.nu12;
    }

    public double get_nu20() {
        return this.nu20;
    }

    public double get_nu21() {
        return this.nu21;
    }

    public double get_nu30() {
        return this.nu30;
    }

    public void set(double[] dArr) {
        double d = 0.0d;
        if (dArr != null) {
            this.m00 = dArr.length > 0 ? (double) ((int) dArr[0]) : 0.0d;
            this.m10 = dArr.length > 1 ? (double) ((int) dArr[1]) : 0.0d;
            this.m01 = dArr.length > 2 ? (double) ((int) dArr[2]) : 0.0d;
            this.m20 = dArr.length > 3 ? (double) ((int) dArr[3]) : 0.0d;
            this.m11 = dArr.length > 4 ? (double) ((int) dArr[4]) : 0.0d;
            this.m02 = dArr.length > 5 ? (double) ((int) dArr[5]) : 0.0d;
            this.m30 = dArr.length > 6 ? (double) ((int) dArr[6]) : 0.0d;
            this.m21 = dArr.length > 7 ? (double) ((int) dArr[7]) : 0.0d;
            this.m12 = dArr.length > 8 ? (double) ((int) dArr[8]) : 0.0d;
            if (dArr.length > 9) {
                d = (double) ((int) dArr[9]);
            }
            this.m03 = d;
            completeState();
            return;
        }
        this.m00 = 0.0d;
        this.m10 = 0.0d;
        this.m01 = 0.0d;
        this.m20 = 0.0d;
        this.m11 = 0.0d;
        this.m02 = 0.0d;
        this.m30 = 0.0d;
        this.m21 = 0.0d;
        this.m12 = 0.0d;
        this.m03 = 0.0d;
        this.mu20 = 0.0d;
        this.mu11 = 0.0d;
        this.mu02 = 0.0d;
        this.mu30 = 0.0d;
        this.mu21 = 0.0d;
        this.mu12 = 0.0d;
        this.mu03 = 0.0d;
        this.nu20 = 0.0d;
        this.nu11 = 0.0d;
        this.nu02 = 0.0d;
        this.nu30 = 0.0d;
        this.nu21 = 0.0d;
        this.nu12 = 0.0d;
        this.nu03 = 0.0d;
    }

    public void set_m00(double d) {
        this.m00 = d;
    }

    public void set_m01(double d) {
        this.m01 = d;
    }

    public void set_m02(double d) {
        this.m02 = d;
    }

    public void set_m03(double d) {
        this.m03 = d;
    }

    public void set_m10(double d) {
        this.m10 = d;
    }

    public void set_m11(double d) {
        this.m11 = d;
    }

    public void set_m12(double d) {
        this.m12 = d;
    }

    public void set_m20(double d) {
        this.m20 = d;
    }

    public void set_m21(double d) {
        this.m21 = d;
    }

    public void set_m30(double d) {
        this.m30 = d;
    }

    public void set_mu02(double d) {
        this.mu02 = d;
    }

    public void set_mu03(double d) {
        this.mu03 = d;
    }

    public void set_mu11(double d) {
        this.mu11 = d;
    }

    public void set_mu12(double d) {
        this.mu12 = d;
    }

    public void set_mu20(double d) {
        this.mu20 = d;
    }

    public void set_mu21(double d) {
        this.mu21 = d;
    }

    public void set_mu30(double d) {
        this.mu30 = d;
    }

    public void set_nu02(double d) {
        this.nu02 = d;
    }

    public void set_nu03(double d) {
        this.nu03 = d;
    }

    public void set_nu11(double d) {
        this.nu11 = d;
    }

    public void set_nu12(double d) {
        this.nu12 = d;
    }

    public void set_nu20(double d) {
        this.nu20 = d;
    }

    public void set_nu21(double d) {
        this.nu21 = d;
    }

    public void set_nu30(double d) {
        this.nu30 = d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Moments [ \nm00=");
        stringBuilder.append(this.m00);
        stringBuilder.append(", \nm10=");
        stringBuilder.append(this.m10);
        stringBuilder.append(", m01=");
        stringBuilder.append(this.m01);
        stringBuilder.append(", \nm20=");
        stringBuilder.append(this.m20);
        stringBuilder.append(", m11=");
        stringBuilder.append(this.m11);
        stringBuilder.append(", m02=");
        stringBuilder.append(this.m02);
        stringBuilder.append(", \nm30=");
        stringBuilder.append(this.m30);
        stringBuilder.append(", m21=");
        stringBuilder.append(this.m21);
        stringBuilder.append(", m12=");
        stringBuilder.append(this.m12);
        stringBuilder.append(", m03=");
        stringBuilder.append(this.m03);
        stringBuilder.append(", \nmu20=");
        stringBuilder.append(this.mu20);
        stringBuilder.append(", mu11=");
        stringBuilder.append(this.mu11);
        stringBuilder.append(", mu02=");
        stringBuilder.append(this.mu02);
        stringBuilder.append(", \nmu30=");
        stringBuilder.append(this.mu30);
        stringBuilder.append(", mu21=");
        stringBuilder.append(this.mu21);
        stringBuilder.append(", mu12=");
        stringBuilder.append(this.mu12);
        stringBuilder.append(", mu03=");
        stringBuilder.append(this.mu03);
        stringBuilder.append(", \nnu20=");
        stringBuilder.append(this.nu20);
        stringBuilder.append(", nu11=");
        stringBuilder.append(this.nu11);
        stringBuilder.append(", nu02=");
        stringBuilder.append(this.nu02);
        stringBuilder.append(", \nnu30=");
        stringBuilder.append(this.nu30);
        stringBuilder.append(", nu21=");
        stringBuilder.append(this.nu21);
        stringBuilder.append(", nu12=");
        stringBuilder.append(this.nu12);
        stringBuilder.append(", nu03=");
        stringBuilder.append(this.nu03);
        stringBuilder.append(", \n]");
        return stringBuilder.toString();
    }
}
