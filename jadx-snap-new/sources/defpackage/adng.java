package defpackage;

/* renamed from: adng */
public final class adng {
    public long a = -1;
    private int b;
    private int c;
    private int d;
    private final boolean e;

    /* renamed from: adng$a */
    public enum a {
        ;
        
        public static final int a = 0;
        public static final int b = 0;

        static {
            int[] iArr = new int[]{1, 2};
            a = 1;
            b = 2;
            c = iArr;
        }

        public static int[] a() {
            return (int[]) c.clone();
        }
    }

    public adng(boolean z) {
        this.e = z;
    }

    private final boolean a(long j) {
        return j <= this.a;
    }

    private final void b() {
        this.d++;
    }

    public final int a(long j, boolean z) {
        this.b++;
        if (a(j)) {
            this.c++;
            if (this.e && !z) {
                b();
                return 2;
            }
        }
        this.a = j;
        return 1;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.a = -1;
    }
}
