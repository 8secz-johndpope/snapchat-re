package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.MessageClientStatus;
import defpackage.adpm.a;

/* renamed from: adpt */
public final class adpt {
    private final DbClient a;
    private final aipn<qvd> b;
    private final aipn<adpm> c;
    private final ajwy<qus> d;

    public adpt(aipn<SnapDb> aipn, aipn<qvd> aipn2, aipn<adpm> aipn3, ajwy<qus> ajwy) {
        this.a = ((SnapDb) aipn.get()).getDbClient(pql.j.callsite("SentMessageProcessor"));
        this.b = aipn2;
        this.c = aipn3;
        this.d = ajwy;
    }

    private /* synthetic */ void a(aesm aesm, DbTransaction dbTransaction) {
        a a = ((adpm) this.c.get()).a(dbTransaction, (aeie) aesm);
        if (a.b != -1) {
            ((qvd) this.b.get()).a(a.b, MessageClientStatus.SENDING);
        }
        if (a.a != -1) {
            ((qus) this.d.get()).a(dbTransaction, qvv.SINGLE_UPDATE, a.a);
        }
    }

    private /* synthetic */ void b(aesm aesm, DbTransaction dbTransaction) {
        a a = ((adpm) this.c.get()).a(dbTransaction, (aeie) aesm);
        if (a.b != -1) {
            ((qvd) this.b.get()).a(a.b, MessageClientStatus.QUEUED);
        }
        if (a.a != -1) {
            ((qus) this.d.get()).a(dbTransaction, qvv.SINGLE_UPDATE, a.a);
        }
    }

    private /* synthetic */ void c(aesm aesm, DbTransaction dbTransaction) {
        aeie aeie = (aeie) aesm;
        adox.a(aeie);
        a a = ((adpm) this.c.get()).a(dbTransaction, aeie);
        if (a.b != -1) {
            ((qvd) this.b.get()).a(a.b, MessageClientStatus.OK);
        }
        if (a.a != -1) {
            ((qus) this.d.get()).a(dbTransaction, qvv.SINGLE_UPDATE, a.a);
        }
    }

    public final void a(aesm aesm) {
        if (!(aesm instanceof aeuw)) {
            this.a.runInTransactionCompat("SentMessageProcessor:onMessageSent", new -$$Lambda$adpt$qIVBCzj4YZDYEbjABJoa_ZY96Zc(this, aesm)).e();
        }
    }

    public final void b(aesm aesm) {
        if (!(aesm instanceof aeuw) && (aesm instanceof aegj)) {
            this.a.runInTransactionCompat("SentMessageProcessor:onMessageQueued", new -$$Lambda$adpt$Ea8m2M5lJfQ1hT9smzwdcFB_9Y4(this, aesm)).e();
        }
    }

    public final void c(aesm aesm) {
        if (!(aesm instanceof aeuw) && (aesm instanceof aegj)) {
            this.a.runInTransactionCompat("SentMessageProcessor:onMessageSendingStarted", new -$$Lambda$adpt$u8jofvhrFHu1q7t8VUk__1GK2Xw(this, aesm)).e();
        }
    }
}
