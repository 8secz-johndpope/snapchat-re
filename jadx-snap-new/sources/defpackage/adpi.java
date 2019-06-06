package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;

/* renamed from: adpi */
public final class adpi extends adpl<aetd> {
    private final aipn<qvi> a;

    public adpi(ihh ihh, gpb gpb, aipn<qvd> aipn, aipn<quk> aipn2, aipn<iqx> aipn3, aipn<qup> aipn4, aipn<qvi> aipn5, ajwy<qvo> ajwy) {
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

    private final long a(adph<? extends aetd> adph, long j, long j2, DbTransaction dbTransaction) {
        aetf a = ((aetd) adph.d).a();
        if (a != null && adpj.a[a.ordinal()] == 1) {
            a().a(j, ((aetd) adph.d).r);
        }
        return ((qvi) this.a.get()).a((aegj) adph.d, j2, dbTransaction);
    }

    public final long a(DbTransaction dbTransaction, adph<? extends aetd> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        return a((adph) adph, j, j2, dbTransaction);
    }

    public final long b(DbTransaction dbTransaction, adph<? extends aetd> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        return a((adph) adph, j, j2, dbTransaction);
    }
}
