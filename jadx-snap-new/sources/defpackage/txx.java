package defpackage;

/* renamed from: txx */
public final class txx implements ajfl {
    private final /* synthetic */ akbl a;

    public txx(akbl akbl) {
        this.a = akbl;
    }

    public final /* synthetic */ boolean test(Object obj) {
        obj = this.a.invoke(obj);
        akcr.a(obj, "invoke(...)");
        return ((Boolean) obj).booleanValue();
    }
}
