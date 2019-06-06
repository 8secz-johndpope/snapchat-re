package defpackage;

/* renamed from: aizf */
public final class aizf {
    static final a a = new a(aizd.a);
    public final aizd b;
    public long c;
    public b d;
    public long e;
    public long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private final aixz k;
    private volatile long l;

    /* renamed from: aizf$a */
    public static final class a {
        public aizd a;

        public a(aizd aizd) {
            this.a = aizd;
        }
    }

    /* renamed from: aizf$b */
    public interface b {
    }

    public aizf() {
        this.k = aiya.a();
        this.b = aizd.a;
    }

    private aizf(aizd aizd) {
        this.k = aiya.a();
        this.b = aizd;
    }

    public /* synthetic */ aizf(aizd aizd, byte b) {
        this(aizd);
    }

    public final void a() {
        this.g++;
        this.h = this.b.a();
    }

    public final void a(boolean z) {
        if (z) {
            this.i++;
        } else {
            this.j++;
        }
    }

    public final void b() {
        this.k.a();
        this.l = this.b.a();
    }
}
