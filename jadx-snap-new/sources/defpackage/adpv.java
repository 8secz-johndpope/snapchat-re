package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.column.UpdateStatus;

/* renamed from: adpv */
public final class adpv extends adpl<aeie> {
    final ajwy<ftl> a;
    private final ajxe b = ajxh.a(new a(this));
    private final aipn<hyq> c;
    private final aipn<qvi> d;

    /* renamed from: adpv$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ adpv a;

        a(adpv adpv) {
            this.a = adpv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((ftl) this.a.a.get()).a((fth) qpy.ENABLE_SNAP_DATA_REFACTOR));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(adpv.class), "enableSnapDataRefactor", "getEnableSnapDataRefactor()Z");
    }

    public adpv(ihh ihh, gpb gpb, aipn<qvd> aipn, aipn<quk> aipn2, aipn<iqx> aipn3, aipn<qup> aipn4, aipn<hyq> aipn5, aipn<qvi> aipn6, ajwy<ftl> ajwy, ajwy<qvo> ajwy2) {
        aipn<hyq> aipn7 = aipn5;
        aipn<qvi> aipn8 = aipn6;
        ajwy<ftl> ajwy3 = ajwy;
        ihh ihh2 = ihh;
        akcr.b(ihh, "clock");
        gpb gpb2 = gpb;
        akcr.b(gpb, "userAuth");
        aipn<qvd> aipn9 = aipn;
        akcr.b(aipn, "messagingRepositoryLazy");
        aipn<quk> aipn10 = aipn2;
        akcr.b(aipn10, "conversationsRepositoryLazy");
        aipn<iqx> aipn11 = aipn3;
        akcr.b(aipn11, "friendRepositoryLazy");
        aipn<qup> aipn12 = aipn4;
        akcr.b(aipn12, "friendsFeedSnapDbLoggerLazy");
        akcr.b(aipn7, "fideliusManager");
        akcr.b(aipn8, "networkMessageProcessor");
        akcr.b(ajwy3, "configProvider");
        ajwy<qvo> ajwy4 = ajwy2;
        akcr.b(ajwy4, "sequenceNumberRepository");
        super(ihh2, gpb2, aipn9, aipn10, aipn11, aipn12, ajwy4);
        this.c = aipn7;
        this.d = aipn8;
        this.a = ajwy3;
    }

    private final long a(aeie aeie, long j, DbTransaction dbTransaction) {
        if (adpv.a(aeie)) {
            if (!c()) {
                String b = adpv.b(aeie);
                b().a(aeie, j);
                a().a(b, UpdateStatus.SERVER_UPDATED);
            } else if (aeie instanceof aehb) {
                ((qvi) this.d.get()).a((aehb) aeie, j, dbTransaction);
            } else if (aeie instanceof aeyr) {
                ((qvi) this.d.get()).a((aeyr) aeie, j, dbTransaction);
            }
        }
        return -1;
    }

    private static boolean a(aeie aeie) {
        if (aeie instanceof aeyr) {
            return adox.a((aeyr) aeie);
        }
        if (aeie instanceof aehb) {
            return adox.a((aehb) aeie);
        }
        StringBuilder stringBuilder = new StringBuilder("message ");
        stringBuilder.append(adox.a(aeie));
        stringBuilder.append(" is not a snap state message");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static String b(aeie aeie) {
        if (aeie instanceof aeyr) {
            return ((aeyr) aeie).a;
        }
        if (aeie instanceof aehb) {
            return ((aehb) aeie).a;
        }
        StringBuilder stringBuilder = new StringBuilder("message ");
        stringBuilder.append(adox.a(aeie));
        stringBuilder.append(" is not a snap state message");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private final boolean c() {
        return ((Boolean) this.b.b()).booleanValue();
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aeie> adpd, long j) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        return a(adpd.d, j, dbTransaction);
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aeie> adpd, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        aeie aeie = adpd.d;
        if (aeie != null) {
            aeyr aeyr = (aeyr) aeie;
            aeie aeie2 = aeyr;
            if (adpv.a(aeie2)) {
                String b = adpv.b(aeie2);
                if (c()) {
                    ((qvi) this.d.get()).a(aeyr, j2, dbTransaction);
                } else {
                    b().a(aeie2, j2);
                }
                hyx e = ((hyq) this.c.get()).e("sek_remove");
                if (e != null) {
                    e.a(b);
                }
            }
            return -1;
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.soju.android.SnapStateMessage");
    }

    public final long a(DbTransaction dbTransaction, adph<? extends aeie> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        return a(adph.d, j2, dbTransaction);
    }

    public final long b(DbTransaction dbTransaction, adph<? extends aeie> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        if (!c()) {
            b().a(adph.d, j2);
        } else if (adph.d instanceof aehb) {
            ((qvi) this.d.get()).a((aehb) adph.d, j2, dbTransaction);
        }
        return -1;
    }
}
