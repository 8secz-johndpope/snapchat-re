package defpackage;

/* renamed from: dpo */
public final class dpo {
    private final dpn a;
    private adie b;

    public dpo(dpn dpn) {
        this.a = dpn;
    }

    public final adie a() {
        adie adie = this.b;
        if (adie != null) {
            return adie;
        }
        throw new IllegalStateException("updateTransformation not called yet");
    }

    public final void a(abtl abtl, abtl abtl2) {
        this.b = this.a.a(abtl, abtl2);
    }
}
