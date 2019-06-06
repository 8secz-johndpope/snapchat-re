package defpackage;

/* renamed from: dlb */
public final class dlb extends djc {
    private final fwt a;

    public dlb(fwt fwt) {
        this.a = fwt;
    }

    public final boolean a(aajt aajt, zym zym) {
        return this.a.a(Math.max(aajt.getPerUserSamplingRate(), zym.f == null ? 0.0d : zym.f.doubleValue()));
    }
}
