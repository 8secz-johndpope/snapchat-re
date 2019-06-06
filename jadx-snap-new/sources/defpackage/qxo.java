package defpackage;

/* renamed from: qxo */
public final class qxo extends ide {
    public static final zjm a;
    public static final qxo b;
    private static final acgu<zjm> c;
    private static final acgu<zjm> d;
    private static final acgu<zjm> e;
    private static final acgu<zjm> f;

    static {
        qxo qxo = new qxo();
        b = qxo;
        a = new zjm(qxo, "FriendsFeed", true, true, false, true, zik.FEED, false, false, true, false, null, 3472);
        Object d = acgu.k().a(acgw.PRESENT).a(achr.LEFT_TO_RIGHT).a((acis) acir.a(acis.a, acjb.b(), new aciq(-15815169))).b((achg) a).a(true).d();
        String str = "NavigationAction.builder…                 .build()";
        akcr.a(d, str);
        c = d;
        d = d.j();
        akcr.a(d, "FRIENDS_FEED_PRESENT_DEFAULT.reverse()");
        d = d;
        d = acgu.k().a(acgw.PRESENT).a(achr.LEFT_TO_RIGHT).a((acis) acir.a(acis.a, acjb.b())).b((achg) a).a(true).d();
        akcr.a(d, str);
        e = d;
        d = d.j();
        akcr.a(d, "FRIENDS_FEED_PRESENT_V11.reverse()");
        f = d;
    }

    private qxo() {
        super("FriendsFeed", idi.FRIENDS_FEED);
    }

    public static acgu<zjm> a(boolean z) {
        return z ? e : c;
    }

    public static acgu<zjm> b(boolean z) {
        return z ? f : d;
    }
}
