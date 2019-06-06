package defpackage;

/* renamed from: sct */
public final class sct implements ajfl {
    private final /* synthetic */ akbl a;

    public sct(akbl akbl) {
        this.a = akbl;
    }

    public final /* synthetic */ boolean test(Object obj) {
        obj = this.a.invoke(obj);
        akcr.a(obj, "invoke(...)");
        return ((Boolean) obj).booleanValue();
    }
}
