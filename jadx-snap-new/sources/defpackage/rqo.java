package defpackage;

/* renamed from: rqo */
public final class rqo implements dpn {
    private final adie a = new adie();

    public final adie a(abtl abtl, abtl abtl2) {
        akcr.b(abtl, "normalizedResolution");
        akcr.b(abtl2, "surfaceResolution");
        this.a.b();
        double f = abtl.f();
        double f2 = abtl2.f();
        if (f >= f2) {
            this.a.b((float) (f / f2), 1.0f);
        } else {
            this.a.b(1.0f, (float) (f2 / f));
        }
        return this.a;
    }
}
