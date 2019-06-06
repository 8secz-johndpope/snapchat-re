package defpackage;

/* renamed from: vpg */
public final class vpg extends ide {
    public static final zjm a;
    public static final idl b;
    public static final acgu<zjm> c;
    public static final acgu<zjm> d;
    public static final vpg e;

    static {
        vpg vpg = new vpg();
        e = vpg;
        zjm zjm = new zjm(vpg, "ScanFeature", false, false, true, false, null, false, false, false, false, null, 4076);
        a = zjm;
        b = zjm.d.b;
        Object d = acgu.k().a(acgw.PRESENT).a(achr.BOTTOM_TO_TOP).a(acis.e).b((achg) a).a(true).d();
        akcr.a(d, "NavigationAction.builder…                 .build()");
        c = d;
        d = d.j();
        akcr.a(d, "SCAN_FEATURE_PRESENT_DEFAULT.reverse()");
        d = d;
    }

    private vpg() {
        super("ScanFeature", idi.CAMERA_PLATFORM);
    }
}
