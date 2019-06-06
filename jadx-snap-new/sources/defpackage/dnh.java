package defpackage;

/* renamed from: dnh */
public final class dnh extends ide {
    public static final zjm a;
    public static final acgu<zjm> b = acgu.a(achr.RIGHT_TO_LEFT, acir.a(acis.b, acjb.b()), a, false);
    public static final zjm c;
    public static final acgu<zjm> d;
    public static final acgu<zjm> e;
    public static final dnh f;

    static {
        dnh dnh = new dnh();
        f = dnh;
        ide ide = dnh;
        ide ide2 = ide;
        a = new zjm(ide2, "camera_fixed", true, true, false, true, zik.CAMERA, false, false, false, false, null, 3984);
        ide2 = ide;
        c = new zjm(ide2, "camera_stacked", false, false, false, true, zik.CAMERA, false, false, false, false, null, 3996);
        acgu a = acgu.a(achr.BOTTOM_TO_TOP, acir.a(acis.a, acjb.b()), c, false);
        d = a;
        e = a.j();
    }

    private dnh() {
        super("Camera", idi.CORE_CAMERA);
    }

    public static acgu<zjm> a(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        Object a = acgu.a(achr.BOTTOM_TO_TOP, acir.a(new dnw(achb, false), acjb.b()), c, true);
        akcr.a(a, "NavigationAction.present… /* shouldAnimate */true)");
        return a;
    }
}
