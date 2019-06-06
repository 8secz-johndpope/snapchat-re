package defpackage;

/* renamed from: rgr */
public final class rgr extends ide {
    public static final idj a;
    public static final zjm b;
    public static final acgu<zjm> c = acgu.a(acis.b, (achg) b, false);
    public static final rgr d;
    private static final ajxe e = ajxh.a(a.a);

    /* renamed from: rgr$a */
    static final class a extends akcs implements akbk<acgu<zjm>> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return acgu.k().a(acgw.PRESENT).a(acis.d).b((achg) rgr.b).a(true).a(achr.BOTTOM_TO_TOP).d();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rgr.class), "SWIPE_UP_TO_SEND_TO_ACTION", "getSWIPE_UP_TO_SEND_TO_ACTION()Lcom/snapchat/deck/actions/NavigationAction;");
        rgr rgr = new rgr();
        d = rgr;
        a = rgr.getPage();
        b = new zjm(rgr, "SendTo", false, false, false, false, null, false, false, false, false, null, 4092);
    }

    private rgr() {
        super("SendTo", idi.USER_FRIENDS);
    }

    public static acgu<zjm> a() {
        return (acgu) e.b();
    }
}
