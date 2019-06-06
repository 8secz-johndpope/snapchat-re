package defpackage;

/* renamed from: rvp */
public final class rvp implements achf<zjm, zjk> {
    private final ajwy<fxi> a;

    public rvp(ajwy<fxi> ajwy) {
        akcr.b(ajwy, "deviceConfiguration");
        this.a = ajwy;
    }

    public final boolean a(aciv<zjm, zjk> aciv) {
        akcr.b(aciv, "page");
        return ((fxi) this.a.get()).a ? false : ((zjm) aciv.e()).e;
    }
}
