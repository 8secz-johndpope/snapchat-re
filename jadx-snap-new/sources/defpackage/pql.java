package defpackage;

/* renamed from: pql */
public final class pql extends ide {
    public static final zjm a;
    public static final idl b;
    public static final acgu<zjm> c;
    public static final acgu<zjm> d;
    public static final zjm e;
    public static final acgu<zjm> f = acgu.a(acis.d, (achg) e, false);
    public static final zjm g;
    public static final acgu<zjm> h = acgu.a(acis.d, (achg) g, false);
    public static final zjm i;
    public static final pql j;

    static {
        pql pql = new pql();
        j = pql;
        ide ide = pql;
        ide ide2 = ide;
        zjm zjm = new zjm(ide2, "chat_page", false, false, false, false, zik.CHAT, false, false, false, false, null, 3760);
        a = zjm;
        b = zjm.d.b;
        acgu d = acgu.k().a(acgw.PRESENT).a(achr.LEFT_TO_RIGHT).a(pqm.a).b((achg) a).a(true).d();
        c = d;
        d = d.j();
        e = new zjm(ide, "create_group", false, false, false, false, null, false, false, false, false, null, 4092);
        g = new zjm(ide, "create_chat", false, false, false, false, null, false, false, false, false, null, 4092);
        i = new zjm(ide, "context_card", false, false, false, false, null, false, false, false, false, null, 4092);
    }

    private pql() {
        super("Chat", idi.COMMUNICATIONS);
    }

    public final idl a(idk idk, String str) {
        akcr.b(idk, "typedUiPageFactory");
        akcr.b(str, "snapId");
        return typedUiPage(idk, str);
    }

    public final idl a(idk idk, String str, String str2) {
        akcr.b(idk, "typedUiPageFactory");
        akcr.b(str, "conversationId");
        akcr.b(str2, "mediaId");
        return typedUiPage(idk, str, str2);
    }

    public final /* synthetic */ idl getAttributionFor(String str) {
        akcr.b(str, "callsite");
        throw new IllegalAccessException("Use MainPageType.attribution.uiPage instead by injecting @ChatPageType pageType: MainPageType");
    }
}
