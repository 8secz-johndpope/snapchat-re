package defpackage;

import android.os.SystemClock;

/* renamed from: taf */
public final class taf {
    public String a;
    public sqz b;
    public syu c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public long i;
    public abnb j;
    public String k;
    private final syx l;

    /* renamed from: taf$1 */
    public class 1 extends tae {
        public 1(String str, abnb abnb) {
            super(str, abnb);
        }

        private /* synthetic */ void b(sqz sqz) {
            taf.this.b = sqz;
        }

        /* Access modifiers changed, original: protected|final */
        public final void a(sqz sqz) {
            tal.a.execute(new -$$Lambda$taf$1$Bh582QS3ilomebvN_Bx5-w5bi-s(this, sqz));
        }
    }

    public taf() {
        this(new syx());
    }

    private taf(syx syx) {
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.l = syx;
    }

    private static double a(double d) {
        d = (double) Math.round(d * 100.0d);
        Double.isNaN(d);
        return d / 100.0d;
    }

    public final sra a() {
        if (this.d < 0 || this.i < 0) {
            return null;
        }
        sqz sqz = this.b;
        if (sqz == null) {
            return null;
        }
        double d = (double) sqz.a;
        double d2 = (double) this.i;
        Double.isNaN(d2);
        d2 /= 1000.0d;
        Double.isNaN(d);
        int max = Math.max(0, ((int) (d * d2)) - this.h);
        double d3 = (double) max;
        double d4 = (double) this.i;
        Double.isNaN(d4);
        d4 /= 1000.0d;
        Double.isNaN(d3);
        double a = taf.a(d3 / d4);
        return new sra(this.e, this.i, a, (long) max, (long) this.h, (double) this.b.a, (long) this.b.b, this.b.c);
    }

    public final void a(String str, syu syu) {
        this.a = str;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.d = SystemClock.elapsedRealtime();
        this.c = syu;
    }
}
