package defpackage;

/* renamed from: hbn */
public final class hbn extends ide {
    public static final zjm a;
    public static final zjm b;
    public static final acgu<zjm> c;
    public static final acgu<zjm> d;
    public static final zjm e;
    public static final hbn f;
    private static final acgu<zjm> g;
    private static final acgu<zjm> h;
    private static final acgu<zjm> i;
    private static final acgu<zjm> j;

    static {
        hbn hbn = new hbn();
        f = hbn;
        ide ide = hbn;
        ide ide2 = ide;
        a = new zjm(ide2, "DiscoverFeed", true, true, false, true, zik.DISCOVER_FEED, false, false, true, false, null, 3472);
        Object d = acgu.k().a(acgw.PRESENT).a(achr.RIGHT_TO_LEFT).a((acis) acir.a(acis.b, acjb.b(), new aciq(-6267443))).b((achg) a).a(true).d();
        String str = "NavigationAction.builder…                 .build()";
        akcr.a(d, str);
        g = d;
        d = d.j();
        akcr.a(d, "DISCOVER_FEED_PRESENT_DEFAULT.reverse()");
        h = d;
        d = acgu.k().a(acgw.PRESENT).a(achr.RIGHT_TO_LEFT).a((acis) acir.a(acis.b, acjb.b())).b((achg) a).a(true).d();
        akcr.a(d, str);
        i = d;
        d = d.j();
        akcr.a(d, "DISCOVER_FEED_PRESENT_V11.reverse()");
        j = d;
        b = new zjm(ide, "DiscoverFeedChannelPageType", false, false, false, false, null, false, false, false, false, null, 4092);
        acgu a = acgu.a(achr.BOTTOM_TO_TOP, acir.a(acis.d, new aciq(-872415232)), b, true);
        c = a;
        d = a.j();
        e = new zjm(ide, "StoryProfilePageType", false, false, true, false, null, false, false, false, false, null, 4076);
    }

    private hbn() {
        super("DiscoverFeed", idi.DISCOVER_FEED);
    }

    public static acgu<zjm> a(boolean z) {
        return z ? i : g;
    }

    public static acgu<zjm> b(boolean z) {
        return z ? j : h;
    }
}
