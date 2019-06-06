package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;
import defpackage.aewe.a;

/* renamed from: adpq */
public final class adpq extends adpl<aeie> {
    private final pru a;

    public adpq(ihh ihh, gpb gpb, aipn<qvd> aipn, aipn<quk> aipn2, aipn<iqx> aipn3, aipn<qup> aipn4, pru pru, ajwy<qvo> ajwy) {
        pru pru2 = pru;
        ihh ihh2 = ihh;
        akcr.b(ihh, "clock");
        gpb gpb2 = gpb;
        akcr.b(gpb, "userAuth");
        aipn<qvd> aipn5 = aipn;
        akcr.b(aipn, "messagingRepositoryLazy");
        aipn<quk> aipn6 = aipn2;
        akcr.b(aipn2, "conversationsRepositoryLazy");
        aipn<iqx> aipn7 = aipn3;
        akcr.b(aipn3, "friendRepositoryLazy");
        aipn<qup> aipn8 = aipn4;
        akcr.b(aipn8, "friendsFeedSnapDbLoggerLazy");
        akcr.b(pru2, "messageReleaseUpdatesProcessor");
        ajwy<qvo> ajwy2 = ajwy;
        akcr.b(ajwy2, "sequenceNumberRepository");
        super(ihh2, gpb2, aipn5, aipn6, aipn7, aipn8, ajwy2);
        this.a = pru2;
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aeie> adpd, long j) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        return -1;
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aeie> adpd, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        aeie aeie = adpd.d;
        if (aeie != null) {
            if (((aewe) aeie).a() == a.RELEASE && adpd.d.k != null) {
                pru pru = this.a;
                Object obj = adpd.b;
                akcr.a(obj, "message.senderUsername");
                Object obj2 = adpd.d.k;
                akcr.a(obj2, "message.message.knownChatSequenceNumbers");
                Object obj3 = adpd.d.n;
                akcr.a(obj3, "message.message.timestamp");
                pru.b(dbTransaction, j, obj, obj2, obj3.longValue());
            }
            return -1;
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.soju.android.ReleaseMessage");
    }

    public final long a(DbTransaction dbTransaction, adph<? extends aeie> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        return -1;
    }

    public final long b(DbTransaction dbTransaction, adph<? extends aeie> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        pru pru = this.a;
        Object obj = adph.c;
        akcr.a(obj, "message.senderUsername");
        Object obj2 = adph.d.k;
        akcr.a(obj2, "message.message.knownChatSequenceNumbers");
        Object obj3 = adph.d.n;
        akcr.a(obj3, "message.message.timestamp");
        pru.a(dbTransaction, j, obj, obj2, obj3.longValue());
        return -1;
    }
}
