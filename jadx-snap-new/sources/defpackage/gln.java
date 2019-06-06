package defpackage;

/* renamed from: gln */
public final class gln implements idm {
    private final ajwl<idl> a;
    private volatile idl b = new glp();

    public gln() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<UiPage>()");
        this.a = ajwl;
    }

    public final ajdp<idl> a() {
        Object j = this.a.j();
        akcr.a(j, "activePageSubject.serialize()");
        return j;
    }

    public final void a(idl idl) {
        akcr.b(idl, "value");
        this.a.a((Object) idl);
        this.b = idl;
    }

    public final idl b() {
        return this.b;
    }
}
