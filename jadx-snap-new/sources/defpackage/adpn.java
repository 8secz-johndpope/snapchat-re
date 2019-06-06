package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;
import defpackage.aesx.a;

/* renamed from: adpn */
public final class adpn extends adpl<aesx> {
    private final aipn<qvi> a;

    public adpn(ihh ihh, gpb gpb, aipn<qvd> aipn, aipn<quk> aipn2, aipn<iqx> aipn3, aipn<qup> aipn4, aipn<qvi> aipn5, ajwy<qvo> ajwy) {
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

    private final void a(adpd<? extends aesx> adpd, DbTransaction dbTransaction) {
        qvi qvi = (qvi) this.a.get();
        String str = ((aesx) adpd.d).a;
        akcr.a((Object) str, "message.message.chatMessageId");
        String str2 = adpd.b;
        akcr.a((Object) str2, "message.senderUsername");
        a a = ((aesx) adpd.d).a();
        akcr.a((Object) a, "message.message.stateEnum");
        Object obj = ((aesx) adpd.d).c;
        String str3 = "message.message.version";
        akcr.a(obj, str3);
        if (!qvi.a(str, gcm.a.a(str2, a, obj.intValue()), dbTransaction)) {
            qvd a2 = a();
            String str4 = ((aesx) adpd.d).a;
            str = adpd.b;
            boolean z = ((aesx) adpd.d).a() == a.SAVED;
            Object obj2 = ((aesx) adpd.d).c;
            akcr.a(obj2, str3);
            a2.a(str4, str, z, obj2.intValue());
        }
    }

    private final void a(adph<? extends aesx> adph, DbTransaction dbTransaction) {
        qvi qvi = (qvi) this.a.get();
        String str = ((aesx) adph.d).a;
        akcr.a((Object) str, "message.message.chatMessageId");
        String str2 = adph.c;
        akcr.a((Object) str2, "message.senderUsername");
        a a = ((aesx) adph.d).a();
        akcr.a((Object) a, "message.message.stateEnum");
        Object obj = ((aesx) adph.d).c;
        String str3 = "message.message.version";
        akcr.a(obj, str3);
        if (!qvi.a(str, gcm.a.a(str2, a, obj.intValue()), dbTransaction)) {
            qvd a2 = a();
            String str4 = ((aesx) adph.d).a;
            str = adph.c;
            boolean z = ((aesx) adph.d).a() == a.SAVED;
            Object obj2 = ((aesx) adph.d).c;
            akcr.a(obj2, str3);
            a2.a(str4, str, z, obj2.intValue());
        }
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aesx> adpd, long j) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        a((adpd) adpd, dbTransaction);
        return -1;
    }

    public final long a(DbTransaction dbTransaction, adpd<? extends aesx> adpd, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        a((adpd) adpd, dbTransaction);
        return -1;
    }

    public final long a(DbTransaction dbTransaction, adph<? extends aesx> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        a((adph) adph, dbTransaction);
        return -1;
    }

    public final long b(DbTransaction dbTransaction, adph<? extends aesx> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        a((adph) adph, dbTransaction);
        return -1;
    }
}
