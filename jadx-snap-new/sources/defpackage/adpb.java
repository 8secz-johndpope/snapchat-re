package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.column.MessageClientStatus;

/* renamed from: adpb */
public final class adpb extends adpl<aegj> {
    final ajwy<ftl> a;
    private final ajxe b = ajxh.a(new a(this));
    private final aipn<qvi> c;

    /* renamed from: adpb$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ adpb a;

        a(adpb adpb) {
            this.a = adpb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((ftl) this.a.a.get()).a((fth) qpy.ENABLE_SNAP_DATA_REFACTOR));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(adpb.class), "isSnapDataRefactorEnabled", "isSnapDataRefactorEnabled()Z");
    }

    public adpb(ihh ihh, gpb gpb, aipn<qvd> aipn, aipn<quk> aipn2, aipn<iqx> aipn3, aipn<qup> aipn4, aipn<qvi> aipn5, ajwy<ftl> ajwy, ajwy<qvo> ajwy2) {
        aipn<qvi> aipn6 = aipn5;
        ajwy<ftl> ajwy3 = ajwy;
        ihh ihh2 = ihh;
        akcr.b(ihh, "clock");
        gpb gpb2 = gpb;
        akcr.b(gpb, "userAuth");
        aipn<qvd> aipn7 = aipn;
        akcr.b(aipn, "messagingRepositoryLazy");
        aipn<quk> aipn8 = aipn2;
        akcr.b(aipn2, "conversationsRepositoryLazy");
        aipn<iqx> aipn9 = aipn3;
        akcr.b(aipn9, "friendRepositoryLazy");
        aipn<qup> aipn10 = aipn4;
        akcr.b(aipn10, "friendsFeedSnapDbLoggerLazy");
        akcr.b(aipn6, "networkMessageProcessor");
        akcr.b(ajwy3, "configProvider");
        ajwy<qvo> ajwy4 = ajwy2;
        akcr.b(ajwy4, "sequenceNumberRepository");
        super(ihh2, gpb2, aipn7, aipn8, aipn9, aipn10, ajwy4);
        this.c = aipn6;
        this.a = ajwy3;
    }

    private final boolean c() {
        return ((Boolean) this.b.b()).booleanValue();
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aegj> adpd, long j) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        return ((qvi) this.c.get()).a((aegj) adpd.d, j, dbTransaction);
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aegj> adpd, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        return ((qvi) this.c.get()).a((aegj) adpd.d, j2, dbTransaction);
    }

    public final long a(DbTransaction dbTransaction, adph<? extends aegj> adph, long j, long j2) {
        DbTransaction dbTransaction2 = dbTransaction;
        adph<? extends aegj> adph2 = adph;
        long j3 = j2;
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        if (c()) {
            return ((qvi) this.c.get()).a((aegj) adph2.d, j3, dbTransaction);
        }
        if (!adox.a((aegj) adph2.d)) {
            return ((qvi) this.c.get()).a((aegj) adph2.d, j3, dbTransaction);
        }
        long j4 = j;
        a().b(((aegj) adph2.d).a.a.a, j);
        return a().a(Boolean.valueOf(adph2.b), (aegj) adph2.d, j4, j2, MessageClientStatus.OK, dbTransaction);
    }

    public final long b(DbTransaction dbTransaction, adph<? extends aegj> adph, long j, long j2) {
        DbTransaction dbTransaction2 = dbTransaction;
        adph<? extends aegj> adph2 = adph;
        long j3 = j2;
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        if (c()) {
            return ((qvi) this.c.get()).a((aegj) adph2.d, j3, dbTransaction);
        }
        if (!adox.a((aegj) adph2.d)) {
            return ((qvi) this.c.get()).a((aegj) adph2.d, j3, dbTransaction);
        }
        qvd a = a();
        Boolean valueOf = Boolean.valueOf(adph2.b);
        aegj aegj = (aegj) adph2.d;
        return a.a(valueOf, aegj, j, j2, MessageClientStatus.OK, dbTransaction);
    }
}
