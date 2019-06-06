package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.column.MessageClientStatus;

/* renamed from: adpo */
public final class adpo extends adpl<aevu> {
    final ajwy<ftl> a;
    private final ajxe b;
    private final ajxe c = ajxh.a(new a(this));
    private final aipn<hyq> d;
    private final ajwy<qus> e;
    private final qvi f;
    private final ajwy<qpb> g;
    private final ajwy<qvj> h;

    /* renamed from: adpo$b */
    static final class b extends akcq implements akbk<iqz> {
        b(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (iqz) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: adpo$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ adpo a;

        a(adpo adpo) {
            this.a = adpo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((ftl) this.a.a.get()).a((fth) qpy.ENABLE_SNAP_DATA_REFACTOR));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(adpo.class), "friendmojiRepository", "getFriendmojiRepository()Lcom/snap/identity/api/FriendmojiApi;"), new akdc(akde.a(adpo.class), "enableSnapRefactor", "getEnableSnapRefactor()Z")};
    }

    public adpo(ihh ihh, gpb gpb, aipn<qvd> aipn, aipn<quk> aipn2, aipn<iqx> aipn3, aipn<qup> aipn4, aipn<iqz> aipn5, aipn<hyq> aipn6, ajwy<qus> ajwy, qvi qvi, ajwy<ftl> ajwy2, ajwy<qpb> ajwy3, ajwy<qvo> ajwy4, ajwy<qvj> ajwy5) {
        aipn<iqz> aipn7 = aipn5;
        aipn<hyq> aipn8 = aipn6;
        ajwy<qus> ajwy6 = ajwy;
        qvi qvi2 = qvi;
        ajwy<ftl> ajwy7 = ajwy2;
        ajwy<qpb> ajwy8 = ajwy3;
        ajwy<qvj> ajwy9 = ajwy5;
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        gpb gpb2 = gpb;
        akcr.b(gpb2, "userAuth");
        aipn<qvd> aipn9 = aipn;
        akcr.b(aipn9, "messagingRepositoryLazy");
        aipn<quk> aipn10 = aipn2;
        akcr.b(aipn10, "conversationsRepositoryLazy");
        aipn<iqx> aipn11 = aipn3;
        akcr.b(aipn11, "friendRepositoryLazy");
        aipn<qup> aipn12 = aipn4;
        akcr.b(aipn12, "friendsFeedSnapDbLoggerLazy");
        akcr.b(aipn7, "friendmojiRepositoryLazy");
        akcr.b(aipn8, "fideliusManager");
        akcr.b(ajwy6, "interactionMessagesRepository");
        akcr.b(qvi2, "networkMessageProcessor");
        akcr.b(ajwy7, "configProvider");
        akcr.b(ajwy8, "receivedSnapMetricsController");
        ajwy<qvo> ajwy10 = ajwy4;
        akcr.b(ajwy10, "sequenceNumberRepository");
        akcr.b(ajwy9, "networkMessageRepository");
        super(ihh2, gpb2, aipn9, aipn10, aipn11, aipn12, ajwy10);
        this.d = aipn8;
        this.e = ajwy6;
        this.f = qvi2;
        this.a = ajwy7;
        this.g = ajwy8;
        this.h = ajwy9;
        this.b = ajxh.a(new b(aipn7));
    }

    private final boolean c() {
        return ((Boolean) this.c.b()).booleanValue();
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aevu> adpd, long j, long j2) {
        DbTransaction dbTransaction2 = dbTransaction;
        adpd<? extends aevu> adpd2 = adpd;
        long j3 = j;
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd2, ErrorFields.MESSAGE);
        aevu aevu = (aevu) adpd2.d;
        String str = "suppress_sccp";
        hyy g = ((hyq) this.d.get()).g(str);
        icj a = g != null ? g.a(aevu) : null;
        if (a != null && a.b) {
            ((hyq) this.d.get()).b(str);
        }
        Object obj = (a == null || !a.a) ? null : 1;
        if (obj != null) {
            return -1;
        }
        aevu = (aevu) adpd2.d;
        String str2 = "receiver$0";
        akcr.b(aevu, str2);
        if (!akcr.a(aevu.d, aevu.C)) {
            return -1;
        }
        boolean c = c();
        String str3 = ((aevu) adpd2.d).d;
        akcr.a((Object) str3, "message.message.snapId");
        if (c ? ((qvj) this.h.get()).a(qwh.a(str3), j3) : a().a(str3, j3)) {
            return -1;
        }
        ((iqz) this.b.b()).a((aevu) adpd2.d);
        aevu aevu2 = (aevu) adpd2.d;
        akcr.b(aevu2, str2);
        aenb aenb = new aenb();
        aenb.O = aevu2.d;
        aenb.R = aevu2.b;
        aenb.S = aevu2.a;
        aenb.X = aevu2.a;
        aenb.P = aevu2.c;
        aenb.Q = aevu2.r;
        aenb.T = aevu2.e;
        aenb.a = aevu2.i.a;
        aenb.c = aevu2.s;
        aenb.m = aevu2.t;
        aenb.s = aevu2.u;
        aenb.t = aevu2.v;
        aenb.E = aevu2.E;
        aenb.F = aevu2.F;
        aenb.I = aevu2.L;
        aenb.C = aevu2.B;
        aenb.w = aevu2.x;
        aenb.M = aevu2.P;
        aenb.g = Integer.valueOf(0);
        aenb.t = aevu2.v;
        aenb.Y = aevu2.M;
        aenb.N = aevu2.R;
        aeyn aeyn = aevu2.U;
        if (aeyn == null) {
            aeyn = new aeyn();
        }
        aenb.W = aeyn;
        aenb.W.k = aevu2.H;
        aenb.W.p = aevu2.T;
        ((qpb) this.g.get()).a(aenb);
        long a2 = c() ? this.f.a(aenb, j, j2, dbTransaction) : a().a(aenb, j, j2, MessageClientStatus.OK, dbTransaction);
        ((qus) this.e.get()).a(dbTransaction, qvv.SINGLE_UPDATE, j3);
        return a2;
    }
}
