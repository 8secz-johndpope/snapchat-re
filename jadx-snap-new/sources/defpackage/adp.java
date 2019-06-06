package defpackage;

/* renamed from: adp */
public abstract class adp {
    public static final adp a = new e();
    public static final adp b = new b();
    public static final adp c = new c();
    public static final adp d = new f();
    public static final adp e = g;
    public static final ze<adp> f = ze.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", e);
    private static adp g = new d();

    /* renamed from: adp$a */
    static class a extends adp {
        a() {
        }

        public final float a(int i, int i2, int i3, int i4) {
            i = Math.min(i2 / i4, i / i3);
            return i == 0 ? 1.0f : 1.0f / ((float) Integer.highestOneBit(i));
        }

        public final int a() {
            return 2;
        }
    }

    /* renamed from: adp$b */
    static class b extends adp {
        b() {
        }

        public final float a(int i, int i2, int i3, int i4) {
            i = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            i3 = 1;
            i2 = Math.max(1, Integer.highestOneBit(i));
            if (i2 >= i) {
                i3 = 0;
            }
            return 1.0f / ((float) (i2 << i3));
        }

        public final int a() {
            return 1;
        }
    }

    /* renamed from: adp$c */
    static class c extends adp {
        c() {
        }

        public final float a(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, a.a(i, i2, i3, i4));
        }

        public final int a() {
            return 2;
        }
    }

    /* renamed from: adp$d */
    static class d extends adp {
        d() {
        }

        public final float a(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        public final int a() {
            return 2;
        }
    }

    /* renamed from: adp$e */
    static class e extends adp {
        e() {
        }

        public final float a(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        public final int a() {
            return 2;
        }
    }

    /* renamed from: adp$f */
    static class f extends adp {
        f() {
        }

        public final float a(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        public final int a() {
            return 2;
        }
    }

    static {
        a aVar = new a();
    }

    public abstract float a(int i, int i2, int i3, int i4);

    public abstract int a();
}
