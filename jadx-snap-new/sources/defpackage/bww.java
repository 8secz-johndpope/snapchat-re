package defpackage;

/* renamed from: bww */
public final class bww {
    public final int a;
    public final blu[] b;
    public final bwu c;
    public final Object d;

    public bww(blu[] bluArr, bwt[] bwtArr, Object obj) {
        this.b = bluArr;
        this.c = new bwu(bwtArr);
        this.d = obj;
        this.a = bluArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }

    public final boolean a(bww bww) {
        if (bww == null || bww.c.a != this.c.a) {
            return false;
        }
        for (int i = 0; i < this.c.a; i++) {
            if (!a(bww, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(bww bww, int i) {
        return bww != null && bzo.a(this.b[i], bww.b[i]) && bzo.a(this.c.b[i], bww.c.b[i]);
    }
}
