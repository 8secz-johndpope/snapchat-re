package defpackage;

/* renamed from: tjq */
public final class tjq implements tfz {
    private final tnj a;
    private final ftl b;

    public tjq(tnj tnj, ftl ftl) {
        akcr.b(tnj, "preferences");
        akcr.b(ftl, "configProvider");
        this.a = tnj;
        this.b = ftl;
    }

    public final ajcx a(String str) {
        akcr.b(str, "commerceSessionId");
        Object c = this.a.b().a((fth) tgt.COMMERCE_SESSION_ID, (Object) str).c();
        akcr.a(c, "preferences.edit()\n     …       .applyWithResult()");
        return c;
    }

    public final String a() {
        return this.b.j(tgt.COMMERCE_SESSION_ID);
    }
}
