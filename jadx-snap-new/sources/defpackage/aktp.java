package defpackage;

/* renamed from: aktp */
public class aktp extends aktq {
    private final int c;
    private final akrf d;

    public aktp(akra akra, akrf akrf, akrf akrf2) {
        super(akra, akrf);
        if (akrf2.c()) {
            this.c = (int) (akrf2.d() / this.a);
            if (this.c >= 2) {
                this.d = akrf2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    public final int a(long j) {
        return j >= 0 ? (int) ((j / this.a) % ((long) this.c)) : (this.c - 1) + ((int) (((j + 1) / this.a) % ((long) this.c)));
    }

    public final long b(long j, int i) {
        aktl.a((akqz) this, i, g(), this.c - 1);
        return j + (((long) (i - a(j))) * this.a);
    }

    public final akrf e() {
        return this.d;
    }

    public final int h() {
        return this.c - 1;
    }
}
