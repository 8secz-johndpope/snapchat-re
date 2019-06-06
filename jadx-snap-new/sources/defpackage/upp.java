package defpackage;

/* renamed from: upp */
public final class upp extends ide {
    public static final idj a;
    public static final zjm b;
    public static final zjm c;
    public static final zjm d;
    public static final acgu<zjm> e = acgu.a(achr.BOTTOM_TO_TOP, acir.a(acis.d, new aciq(1711276032)), b, true);
    public static final acgu<zjm> f = acgu.a(achr.BOTTOM_TO_TOP, acir.a(acis.d, new aciq(1711276032)), d, true);
    public static final acgu<zjm> g = acgu.a(achr.BOTTOM_TO_TOP, acir.a(acis.d, new aciq(1711276032)), c, true);
    public static final upp h;

    static {
        upp upp = new upp();
        h = upp;
        a = upp.getPage();
        ide ide = upp;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aaua.PROFILE.name());
        stringBuilder.append('/');
        stringBuilder.append(aauz.MY.name());
        String str = "Profile";
        ide ide2 = ide;
        ide ide3 = ide;
        b = new zjm(ide2, str, false, false, false, true, zik.PROFILE, false, false, false, false, stringBuilder.toString(), 1932);
        stringBuilder = new StringBuilder();
        stringBuilder.append(aaua.PROFILE.name());
        stringBuilder.append('/');
        stringBuilder.append(aauz.USER.name());
        str = "Profile";
        ide2 = ide3;
        c = new zjm(ide2, str, false, false, false, false, zik.PROFILE, false, false, false, false, stringBuilder.toString(), 1964);
        stringBuilder = new StringBuilder();
        stringBuilder.append(aaua.PROFILE.name());
        stringBuilder.append('/');
        stringBuilder.append(aauz.GROUP_CHAT.name());
        str = "Profile";
        ide2 = ide3;
        d = new zjm(ide2, str, false, false, false, false, zik.PROFILE, false, false, false, false, stringBuilder.toString(), 1964);
    }

    private upp() {
        super("Profile", idi.PRODUCT_EXPERIENCE);
    }

    public static final boolean a(zjm zjm) {
        akcr.b(zjm, "pageType");
        return upp.b(zjm) && !zjm.b;
    }

    public static final boolean b(zjm zjm) {
        akcr.b(zjm, "pageType");
        return zjm.d.c == h;
    }
}
