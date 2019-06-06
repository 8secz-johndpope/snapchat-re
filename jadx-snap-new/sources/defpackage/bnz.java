package defpackage;

/* renamed from: bnz */
abstract class bnz {
    protected final bnu b;

    /* renamed from: bnz$a */
    public static final class a extends bln {
        public a(String str) {
            super(str);
        }
    }

    protected bnz(bnu bnu) {
        this.b = bnu;
    }

    public abstract void a(bzc bzc, long j);

    public abstract boolean a(bzc bzc);

    public final void b(bzc bzc, long j) {
        if (a(bzc)) {
            a(bzc, j);
        }
    }
}
