package defpackage;

/* renamed from: dvd */
public final class dvd implements dou {
    public final ajws<Double> a = new ajwo();
    private final ihh b;
    private long c = 0;
    private int d = 0;
    private String e = null;

    public dvd(ihh ihh) {
        this.b = ihh;
    }

    private void a() {
        this.d = 0;
        this.c = 0;
    }

    public final void a(long j, String str) {
        j = this.b.a();
        String str2 = this.e;
        if (!(str2 == null || str2.equals(str)) || this.d == 10000) {
            a();
        }
        this.e = str;
        if (this.d == 0) {
            this.c = j;
        }
        this.d++;
        int i = this.d;
        if (i >= 2) {
            j -= this.c;
            if (j >= 2000) {
                double d = (double) (i - 1);
                Double.isNaN(d);
                d *= 1000.0d;
                double d2 = (double) j;
                Double.isNaN(d2);
                this.a.a((Object) Double.valueOf(d / d2));
            }
        }
    }

    public final void b() {
        a();
    }

    public final boolean c() {
        return true;
    }
}
