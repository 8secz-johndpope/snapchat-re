package defpackage;

/* renamed from: lqm */
final class lqm implements ajey {
    private final /* synthetic */ akbw a;

    lqm(akbw akbw) {
        this.a = akbw;
    }

    public final /* synthetic */ boolean test(Object obj, Object obj2) {
        obj = this.a.invoke(obj, obj2);
        akcr.a(obj, "invoke(...)");
        return ((Boolean) obj).booleanValue();
    }
}
