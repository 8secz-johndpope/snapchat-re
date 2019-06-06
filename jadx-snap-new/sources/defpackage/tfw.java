package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: tfw */
public final class tfw {
    private final ajxe a;

    /* renamed from: tfw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: tfw$b */
    static final class b extends akcs implements akbk<ilv> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(tfw.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;");
        a aVar = new a();
    }

    public tfw(ajwy<ilv> ajwy) {
        akcr.b(ajwy, "grapheneProvider");
        this.a = ajxh.a(new b(ajwy));
    }

    private final ilv a() {
        return (ilv) this.a.b();
    }

    public final void a(tgn tgn, long j) {
        akcr.b(tgn, "restAction");
        String str = "action";
        String str2 = "endpoint";
        a().c(ins.REQUEST_SUCCESS.a(str, (Enum) tgn.b).a(str2, (Enum) tgn.a), 1);
        a().a(ins.REQUEST_LATENCY.a(str, (Enum) tgn.b).a(str2, (Enum) tgn.a), j);
    }

    public final void a(tgn tgn, String str, long j) {
        akcr.b(tgn, "restAction");
        akcr.b(str, Event.ERROR_CODE);
        String str2 = "action";
        String str3 = "endpoint";
        a().c(ins.REQUEST_FAILURE.a(str2, (Enum) tgn.b).a(str3, (Enum) tgn.a).a("error_code", str), 1);
        a().a(ins.REQUEST_LATENCY.a(str2, (Enum) tgn.b).a(str3, (Enum) tgn.a), j);
    }
}
