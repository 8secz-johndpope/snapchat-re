package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.LocalMessageActionModel.ConversationIdChangedAction;
import com.snap.core.db.record.LocalMessageActionModel.DeletePersistedPreserveStateChanges;
import com.snap.core.db.record.LocalMessageActionModel.DeletePersistedReleaseActions;
import com.snap.core.db.record.LocalMessageActionModel.DeletePersistedSaveStateChanges;
import com.snap.core.db.record.LocalMessageActionModel.MarkAsReleasedAction;
import com.snap.core.db.record.LocalMessageActionModel.MessageActionPersistedToServer;
import com.snap.core.db.record.LocalMessageActionModel.MessagePreserveStateUpdateAction;
import com.snap.core.db.record.LocalMessageActionModel.MessageSaveStateUpdateAction;
import com.snap.core.db.record.LocalMessageActionModel.MessageSendBeginAction;
import com.snap.core.db.record.LocalMessageActionModel.MessageSendUpdateAction;
import com.snap.core.db.record.LocalMessageActionModel.UpdateRecipients;
import com.snap.core.db.record.LocalMessageActionRecord;
import com.snap.core.model.MessageRecipient;
import defpackage.qdu.a;
import java.util.List;

/* renamed from: quw */
public final class quw {
    public final DbClient a = this.b.getDbClient(this.c);
    public final SnapDb b;
    private final idd c = pry.a.callsite("LocalMessageActionRepository");
    private final ajxe d = ajxh.a(new k(this));
    private final ajxe e = ajxh.a(new l(this));
    private final ajxe f = ajxh.a(new b(this));
    private final ajxe g = ajxh.a(new j(this));
    private final ajxe h = ajxh.a(new g(this));
    private final ajxe i = ajxh.a(new i(this));
    private final ajxe j = ajxh.a(new h(this));
    private final ajxe k = ajxh.a(new e(this));
    private final ajxe l = ajxh.a(new c(this));
    private final ajxe m = ajxh.a(new d(this));
    private final ajxe n = ajxh.a(new m(this));
    private final gpb o;
    private final ajwy<ihh> p;
    private final ajwy<gqr> q;

    /* renamed from: quw$k */
    static final class k extends akcs implements akbk<MessageSendBeginAction> {
        private /* synthetic */ quw a;

        k(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MessageSendBeginAction(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$l */
    static final class l extends akcs implements akbk<MessageSendUpdateAction> {
        private /* synthetic */ quw a;

        l(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MessageSendUpdateAction(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$b */
    static final class b extends akcs implements akbk<ConversationIdChangedAction> {
        private /* synthetic */ quw a;

        b(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConversationIdChangedAction(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$j */
    static final class j extends akcs implements akbk<MessageSaveStateUpdateAction> {
        private /* synthetic */ quw a;

        j(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MessageSaveStateUpdateAction(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$g */
    static final class g extends akcs implements akbk<MarkAsReleasedAction> {
        private /* synthetic */ quw a;

        g(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MarkAsReleasedAction(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$i */
    static final class i extends akcs implements akbk<MessagePreserveStateUpdateAction> {
        private /* synthetic */ quw a;

        i(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MessagePreserveStateUpdateAction(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$h */
    static final class h extends akcs implements akbk<MessageActionPersistedToServer> {
        private /* synthetic */ quw a;

        h(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MessageActionPersistedToServer(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$e */
    static final class e extends akcs implements akbk<DeletePersistedSaveStateChanges> {
        private /* synthetic */ quw a;

        e(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeletePersistedSaveStateChanges(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$c */
    static final class c extends akcs implements akbk<DeletePersistedPreserveStateChanges> {
        private /* synthetic */ quw a;

        c(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeletePersistedPreserveStateChanges(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$d */
    static final class d extends akcs implements akbk<DeletePersistedReleaseActions> {
        private /* synthetic */ quw a;

        d(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeletePersistedReleaseActions(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$m */
    static final class m extends akcs implements akbk<UpdateRecipients> {
        private /* synthetic */ quw a;

        m(quw quw) {
            this.a = quw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateRecipients(this.a.a.getWritableDatabase(), LocalMessageActionRecord.FACTORY);
        }
    }

    /* renamed from: quw$a */
    public static final class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }
    }

    /* renamed from: quw$f */
    public static final class f extends akcs implements akbl<MessageRecipient, Boolean> {
        private /* synthetic */ String a;

        public f(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MessageRecipient messageRecipient = (MessageRecipient) obj;
            akcr.b(messageRecipient, "it");
            return Boolean.valueOf(akcr.a(messageRecipient.getId(), this.a));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(quw.class), "messageSendInsert", "getMessageSendInsert()Lcom/snap/core/db/record/LocalMessageActionModel$MessageSendBeginAction;"), new akdc(akde.a(quw.class), "messageSendUpdate", "getMessageSendUpdate()Lcom/snap/core/db/record/LocalMessageActionModel$MessageSendUpdateAction;"), new akdc(akde.a(quw.class), "conversationIdChanged", "getConversationIdChanged()Lcom/snap/core/db/record/LocalMessageActionModel$ConversationIdChangedAction;"), new akdc(akde.a(quw.class), "messageSaveStateUpdateInsert", "getMessageSaveStateUpdateInsert()Lcom/snap/core/db/record/LocalMessageActionModel$MessageSaveStateUpdateAction;"), new akdc(akde.a(quw.class), "markAsReleasedInsert", "getMarkAsReleasedInsert()Lcom/snap/core/db/record/LocalMessageActionModel$MarkAsReleasedAction;"), new akdc(akde.a(quw.class), "messagePreserveStateUpdateInsert", "getMessagePreserveStateUpdateInsert()Lcom/snap/core/db/record/LocalMessageActionModel$MessagePreserveStateUpdateAction;"), new akdc(akde.a(quw.class), "messageActionPersistedToServer", "getMessageActionPersistedToServer()Lcom/snap/core/db/record/LocalMessageActionModel$MessageActionPersistedToServer;"), new akdc(akde.a(quw.class), "deletePersistedSaveStateUpdates", "getDeletePersistedSaveStateUpdates()Lcom/snap/core/db/record/LocalMessageActionModel$DeletePersistedSaveStateChanges;"), new akdc(akde.a(quw.class), "deletePersistedPreserveStateUpdates", "getDeletePersistedPreserveStateUpdates()Lcom/snap/core/db/record/LocalMessageActionModel$DeletePersistedPreserveStateChanges;"), new akdc(akde.a(quw.class), "deletePersistedReleaseStateDelete", "getDeletePersistedReleaseStateDelete()Lcom/snap/core/db/record/LocalMessageActionModel$DeletePersistedReleaseActions;"), new akdc(akde.a(quw.class), "updateRecipients", "getUpdateRecipients()Lcom/snap/core/db/record/LocalMessageActionModel$UpdateRecipients;")};
    }

    public quw(SnapDb snapDb, gpb gpb, ajwy<ihh> ajwy, ajwy<gqr> ajwy2) {
        akcr.b(snapDb, "snapDb");
        akcr.b(gpb, "userAuthStore");
        akcr.b(ajwy, "clock");
        akcr.b(ajwy2, "exceptionTracker");
        this.b = snapDb;
        this.o = gpb;
        this.p = ajwy;
        this.q = ajwy2;
    }

    private final int a(String str, gci gci) {
        h().bind(gci, str);
        Object obj = this.a;
        akcr.a(obj, "briteDatabase");
        return BriteDatabaseExtensionsKt.executeDelete(obj, h());
    }

    private final MessageSendBeginAction f() {
        return (MessageSendBeginAction) this.d.b();
    }

    private final MessageSendUpdateAction g() {
        return (MessageSendUpdateAction) this.e.b();
    }

    private final MessageActionPersistedToServer h() {
        return (MessageActionPersistedToServer) this.j.b();
    }

    private final DeletePersistedSaveStateChanges i() {
        return (DeletePersistedSaveStateChanges) this.k.b();
    }

    private final DeletePersistedReleaseActions j() {
        return (DeletePersistedReleaseActions) this.m.b();
    }

    public final int a(String str, gcm gcm) {
        akcr.b(str, "messageId");
        akcr.b(gcm, "savedStates");
        aewk aewk = (aewk) gcm.a.get(this.o.b());
        if (aewk == null) {
            return 0;
        }
        i().bind(str, gci.SAVE_STATE_UPDATE, aewk.b);
        Object obj = this.a;
        akcr.a(obj, "briteDatabase");
        return BriteDatabaseExtensionsKt.executeDelete(obj, i());
    }

    public final int a(qdr qdr) {
        akcr.b(qdr, "networkMessage");
        this.b.throwIfNotDbScheduler();
        int a = a(qdr.a, gci.MESSAGE_SEND);
        int a2 = a(qdr.a, gci.CONVERSATION_ID_CHANGED);
        gcm gcm = qdr.j;
        return (a + a2) + (gcm != null ? a(qdr.a, gcm) : 0);
    }

    public final long a(String str, MessageClientStatus messageClientStatus, byte[] bArr, byte[] bArr2, DbTransaction dbTransaction) {
        akcr.b(str, "messageId");
        akcr.b(messageClientStatus, "status");
        akcr.b(bArr, "content");
        akcr.b(dbTransaction, "tx");
        this.b.throwIfNotDbScheduler();
        g().bind(messageClientStatus, bArr, bArr2, gci.MESSAGE_SEND, str);
        return this.a.executeInsert(g(), dbTransaction);
    }

    public final long a(qei qei, DbTransaction dbTransaction) {
        qei qei2 = qei;
        DbTransaction dbTransaction2 = dbTransaction;
        akcr.b(qei2, "messageSend");
        akcr.b(dbTransaction2, "tx");
        this.b.throwIfNotDbScheduler();
        try {
            if (!qnj.b(qei2.h)) {
                pul.a(qei2.h, qei2.i);
            }
            f().bind(gci.MESSAGE_SEND, qei2.b, qei2.a, qei2.d, Long.valueOf(qei2.b), Long.valueOf(qei2.e), gcj.INITIAL, qei2.g, qei2.h, qei2.i, qei2.j, qei2.k);
            return this.a.executeInsert(f(), dbTransaction2);
        } catch (Exception e) {
            ieg.a("PLEASE SHAKE: Message Serialization issue", true, 0);
            ((gqr) this.q.get()).a(gqt.HIGH, e, this.c);
            return -1;
        }
    }

    /* Access modifiers changed, original: final */
    public final MessageSaveStateUpdateAction a() {
        return (MessageSaveStateUpdateAction) this.g.b();
    }

    public final void a(String str) {
        akcr.b(str, "messageId");
        this.b.throwIfNotDbScheduler();
        a(str, gci.MESSAGE_SEND);
        a(str, gci.CONVERSATION_ID_CHANGED);
    }

    public final void a(String str, long j, long j2) {
        akcr.b(str, "conversationId");
        j().bind(str, Long.valueOf(j2), Long.valueOf(j), gci.RELEASED);
        Object obj = this.a;
        akcr.a(obj, "briteDatabase");
        BriteDatabaseExtensionsKt.executeDelete(obj, j());
    }

    public final MarkAsReleasedAction b() {
        return (MarkAsReleasedAction) this.h.b();
    }

    public final qdp b(String str) {
        String str2 = str;
        akcr.b(str2, "messageId");
        Object updatesToMessageByAction = LocalMessageActionRecord.FACTORY.getUpdatesToMessageByAction(str2, gci.MESSAGE_SEND);
        akcr.a(updatesToMessageByAction, "LocalMessageActionRecord…eActionType.MESSAGE_SEND)");
        DbClient dbClient = this.a;
        Object obj = LocalMessageActionRecord.FACTORY;
        akcr.a(obj, "LocalMessageActionRecord.FACTORY");
        obj = obj.getUpdatesToMessageMapper();
        akcr.a(obj, "LocalMessageActionRecord…RY.updatesToMessageMapper");
        LocalMessageActionRecord localMessageActionRecord = (LocalMessageActionRecord) dbClient.queryFirst(updatesToMessageByAction, (ainw) obj);
        if (localMessageActionRecord == null) {
            return null;
        }
        qei qei = (qei) qee.a(localMessageActionRecord);
        if (qei.k.isEmpty()) {
            return null;
        }
        try {
            puk qdu;
            if (qnj.b(qei.h)) {
                byte[] bArr = qei.i;
                akcr.b(bArr, "bytes");
                String str3 = new String(bArr, akfp.a);
                aeie aeie = (aeie) a.a().a(str3, aeie.class);
                if (aeie == null) {
                    akcr.a();
                }
                Class a = adqs.a(aesm.a.a(aeie.o));
                if (a == null) {
                    akcr.a();
                }
                akcr.a((Object) a, "ServerMessageUtils.getMe…rsationMessage!!.type))!!");
                aesm aesm = (aesm) a.a().a(str3, a);
                if (aesm != null) {
                    qdu = new qdu((aeie) aesm);
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snapchat.soju.android.ConversationMessage");
                }
            }
            qdu = pul.a(qei.h, qei.i);
            puk puk = qdu;
            String str4 = qei.d;
            String b = this.o.b();
            akcr.a((Object) b, "userAuthStore.username");
            long a2 = ((ihh) this.p.get()).a();
            long j = qei.b;
            List list = qei.k;
            byte[] bArr2 = qei.j;
            obj = this.q.get();
            akcr.a(obj, "exceptionTracker.get()");
            return new qdp(str4, puk, b, a2, j, list, pth.a.a(bArr2, (gqr) obj), null, null, 768);
        } catch (Exception e) {
            ieg.a("PLEASE SHAKE: Message Serialization issue", true, 0);
            ((gqr) this.q.get()).a(gqt.HIGH, e, this.c);
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final MessagePreserveStateUpdateAction c() {
        return (MessagePreserveStateUpdateAction) this.i.b();
    }

    /* Access modifiers changed, original: final */
    public final DeletePersistedPreserveStateChanges d() {
        return (DeletePersistedPreserveStateChanges) this.l.b();
    }

    public final UpdateRecipients e() {
        return (UpdateRecipients) this.n.b();
    }
}
