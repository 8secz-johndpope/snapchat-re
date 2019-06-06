package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: grt */
public final class grt {
    public final aipn<ilv> a;
    private final aipn<dib> b;

    /* renamed from: grt$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public grt(aipn<ilv> aipn, aipn<dib> aipn2) {
        akcr.b(aipn, "graphene");
        akcr.b(aipn2, "blizzardEventLogger");
        this.a = aipn;
        this.b = aipn2;
    }

    private static aaal a(ailp ailp) {
        int i = gru.a[ailp.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? aaal.JAVA : aaal.ANR : aaal.NATIVE : aaal.JAVA;
    }

    public final void a(String str, aaal aaal, aaam aaam, String str2, String str3, String str4, String str5) {
        aabf aabf = new aabf();
        aabf.a(aaal);
        aabf.a(aaam);
        aabf.b(str2);
        aabf.a(str3);
        aabf.c(str4);
        aabf.e(str);
        aabf.d(str5);
        ((dib) this.b.get()).a((aajt) aabf);
    }

    public final void a(String str, ailp ailp, String str2) {
        akcr.b(str, "crashId");
        akcr.b(ailp, "crashType");
        akcr.b(str2, Event.ERROR_MESSAGE);
        aahn aahn = new aahn();
        aahn.a(str);
        aahn.b(str2);
        aahn.a(grt.a(ailp));
        ((dib) this.b.get()).a((aajt) aahn);
    }

    public final void b(String str, ailp ailp, String str2) {
        akcr.b(ailp, "crashType");
        akcr.b(str2, Event.ERROR_MESSAGE);
        aahm aahm = new aahm();
        if (str == null) {
            str = "";
        }
        aahm.a(str);
        aahm.b(str2);
        aahm.a(grt.a(ailp));
        ((dib) this.b.get()).a((aajt) aahm);
    }
}
