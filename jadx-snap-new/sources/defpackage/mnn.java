package defpackage;

/* renamed from: mnn */
final class mnn implements ajfl {
    private final /* synthetic */ akbl a;

    mnn(akbl akbl) {
        this.a = akbl;
    }

    public final /* synthetic */ boolean test(Object obj) {
        obj = this.a.invoke(obj);
        akcr.a(obj, "invoke(...)");
        return ((Boolean) obj).booleanValue();
    }
}
