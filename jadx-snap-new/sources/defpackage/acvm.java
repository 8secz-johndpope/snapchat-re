package defpackage;

/* renamed from: acvm */
public final class acvm implements Comparable<acvm> {
    public final String a;
    public final acvr b;
    public double c;
    public double d;
    public long e;
    public final acwi f;
    final acvn g;
    public d h;
    public final boolean i;
    int j;
    public acqw k;

    /* renamed from: acvm$a */
    public interface a {
        int a(acvr acvr, String str);

        acua a();

        boolean a(acvr acvr);

        String b();
    }

    /* renamed from: acvm$b */
    public static class b {
        public double a;
        public double b;
        public String c;
        public a d;
        public long e;
        public int f = 1;
        public boolean g = true;
        public acvn h;
        public acvs i;
        public acqw j;

        public final b a() {
            this.b = 0.0d;
            return this;
        }

        public final b a(a aVar) {
            this.d = aVar;
            return this;
        }

        public final b a(String str) {
            this.c = str;
            return this;
        }

        public final b b() {
            this.a = 0.0d;
            return this;
        }

        public final acvm c() {
            return new acvm(this.b, this.a, this.e, this.c, this.d, this.f, this.g, this.h, this.i, this.j);
        }
    }

    /* renamed from: acvm$c */
    public enum c {
        LEFT("10220700"),
        RIGHT("10220701");
        
        public final String mDefaultStandingStickerId;

        private c(String str) {
            this.mDefaultStandingStickerId = str;
        }

        public final String a() {
            return this.mDefaultStandingStickerId;
        }
    }

    /* renamed from: acvm$d */
    public interface d {
        String a();

        String b();

        String c();

        String d();
    }

    /* renamed from: acvm$e */
    public enum e {
        ;

        static {
            a = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    /* renamed from: acvm$f */
    public interface f extends a {
        boolean c();
    }

    /* synthetic */ acvm(double d, double d2, long j, String str, a aVar, int i, boolean z, acvn acvn, acvs acvs, acqw acqw) {
        this(d, d2, j, str, null, aVar, i, z, acvn, acvs, acqw);
    }

    private acvm(double d, double d2, long j, String str, d dVar, a aVar, int i, boolean z, acvn acvn, acvs acvs, acqw acqw) {
        this.f = new acwi(0);
        this.c = d;
        this.d = d2;
        this.e = j;
        this.a = str;
        this.h = null;
        this.i = z;
        this.b = new acvr(this, i, aVar);
        if (acvn == null) {
            acvn = new acvo();
        }
        this.g = acvn;
        this.b.q = acvs;
        this.k = acqw;
    }

    public final String a() {
        d dVar = this.h;
        return dVar != null ? dVar.b() : null;
    }

    public final String b() {
        d dVar = this.h;
        return dVar != null ? dVar.c() : null;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((acvm) obj).a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof acvm) && this.a.equals(((acvm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
