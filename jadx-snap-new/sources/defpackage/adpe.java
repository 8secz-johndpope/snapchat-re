package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;

/* renamed from: adpe */
public final class adpe extends adpl<aesr> {
    private final aipn<qvi> a;

    public adpe(ihh ihh, gpb gpb, aipn<qvd> aipn, aipn<quk> aipn2, aipn<iqx> aipn3, aipn<qup> aipn4, aipn<qvi> aipn5, ajwy<qvo> ajwy) {
        aipn<qvi> aipn6 = aipn5;
        ihh ihh2 = ihh;
        akcr.b(ihh, "clock");
        gpb gpb2 = gpb;
        akcr.b(gpb, "userAuth");
        aipn<qvd> aipn7 = aipn;
        akcr.b(aipn, "messagingRepositoryLazy");
        aipn<quk> aipn8 = aipn2;
        akcr.b(aipn2, "conversationsRepositoryLazy");
        aipn<iqx> aipn9 = aipn3;
        akcr.b(aipn3, "friendRepositoryLazy");
        aipn<qup> aipn10 = aipn4;
        akcr.b(aipn10, "friendsFeedSnapDbLoggerLazy");
        akcr.b(aipn6, "networkMessageProcessor");
        ajwy<qvo> ajwy2 = ajwy;
        akcr.b(ajwy2, "sequenceNumberRepository");
        super(ihh2, gpb2, aipn7, aipn8, aipn9, aipn10, ajwy2);
        this.a = aipn6;
    }

    private final void a(aesr aesr, DbTransaction dbTransaction) {
        qvi qvi = (qvi) this.a.get();
        String str = aesr.a;
        akcr.a((Object) str, "eraseMessage.chatMessageId");
        qvi.a(str, dbTransaction);
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aesr> adpd, long j) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        a((aesr) adpd.d, dbTransaction);
        return -1;
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aesr> adpd, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        a((aesr) adpd.d, dbTransaction);
        return -1;
    }

    public final long a(DbTransaction dbTransaction, adph<? extends aesr> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        a((aesr) adph.d, dbTransaction);
        return -1;
    }

    public final long b(DbTransaction dbTransaction, adph<? extends aesr> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        a((aesr) adph.d, dbTransaction);
        return -1;
    }
}
