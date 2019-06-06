package defpackage;

import java.util.Arrays;

/* renamed from: bwu */
public final class bwu {
    public final int a;
    public final bwt[] b;
    private int c;

    public bwu(bwt... bwtArr) {
        this.b = bwtArr;
        this.a = bwtArr.length;
    }

    public final bwt[] a() {
        return (bwt[]) this.b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((bwu) obj).b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 527;
        }
        return this.c;
    }
}
