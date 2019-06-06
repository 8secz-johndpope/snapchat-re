package defpackage;

/* renamed from: djw */
public final class djw implements aiqc<zyo> {
    private final ajwy<abss> a;

    public static zyo a(abss abss) {
        return (zyo) aiqf.a(abss.l() ? zyo.STAGING : zyo.PROD, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return djw.a((abss) this.a.get());
    }
}
