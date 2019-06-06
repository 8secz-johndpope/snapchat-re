package defpackage;

/* renamed from: acqo */
public final class acqo {
    final aclg a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: acqo$a */
    static final class a extends akcs implements akbk<acqx> {
        private /* synthetic */ acqo a;

        a(acqo acqo) {
            this.a = acqo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object g = this.a.a.g();
            akcr.a(g, "snapMap.appResources");
            return new acqx(g, new ihl());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acqo.class), "formatter", "getFormatter()Lcom/snapchat/map/feature/friends/TimeAgoFormatter;");
    }

    public acqo(aclg aclg) {
        akcr.b(aclg, "snapMap");
        this.a = aclg;
    }

    private final acqx a() {
        return (acqx) this.b.b();
    }

    public final String a(long j) {
        return a().a(j);
    }
}
