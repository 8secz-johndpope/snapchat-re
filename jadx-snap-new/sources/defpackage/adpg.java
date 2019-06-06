package defpackage;

import com.google.common.base.Preconditions;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.ChatAttachmentsModel;

/* renamed from: adpg */
public final class adpg {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;
    private final ajxe d;
    private final gpb e;

    /* renamed from: adpg$b */
    static final class b extends akcq implements akbk<iqx> {
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
            return (iqx) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: adpg$c */
    static final class c extends akcq implements akbk<qvd> {
        c(aipn aipn) {
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
            return (qvd) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: adpg$a */
    static final class a extends akcq implements akbk<quk> {
        a(aipn aipn) {
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
            return (quk) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: adpg$d */
    static final class d extends akcq implements akbk<yid> {
        d(aipn aipn) {
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
            return (yid) ((aipn) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(adpg.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/api/FriendRepositoryApi;"), new akdc(akde.a(adpg.class), "messagingRepository", "getMessagingRepository()Lcom/snap/messaging/db/MessagingRepository;"), new akdc(akde.a(adpg.class), "conversationsRepository", "getConversationsRepository()Lcom/snap/messaging/db/ConversationsRepository;"), new akdc(akde.a(adpg.class), "storyRepository", "getStoryRepository()Lcom/snap/stories/api/StoryRepository;")};
    }

    public adpg(gpb gpb, aipn<iqx> aipn, aipn<qvd> aipn2, aipn<quk> aipn3, aipn<yid> aipn4) {
        akcr.b(gpb, "userAuth");
        akcr.b(aipn, "friendRepositoryLazy");
        akcr.b(aipn2, "messagingRepositoryLazy");
        akcr.b(aipn3, "conversationsRepositoryLazy");
        akcr.b(aipn4, "storyRepositoryLazy");
        this.e = gpb;
        this.a = ajxh.a(new b(aipn));
        this.b = ajxh.a(new c(aipn2));
        this.c = ajxh.a(new a(aipn3));
        this.d = ajxh.a(new d(aipn4));
    }

    private final long a(DbTransaction dbTransaction, aenb aenb, long j, String str) {
        dbTransaction.checkInTransaction();
        return b().a(aenb, j, a().f(str), MessageClientStatus.OK, dbTransaction);
    }

    private final iqx a() {
        return (iqx) this.a.b();
    }

    private final long b(DbTransaction dbTransaction, aenb aenb, long j, String str) {
        dbTransaction.checkInTransaction();
        return b().a(aenb, j, a().f(str), akcr.a(aenb.q, Boolean.TRUE) ? MessageClientStatus.PENDING : MessageClientStatus.OK, dbTransaction);
    }

    private final qvd b() {
        return (qvd) this.b.b();
    }

    private final quk c() {
        return (quk) this.c.b();
    }

    private final yid d() {
        return (yid) this.d.b();
    }

    public final adpu a(DbTransaction dbTransaction, long j, aenb aenb, String str, String str2) {
        Object obj = str;
        akcr.b(dbTransaction, "tx");
        akcr.b(aenb, "genericSnap");
        akcr.b(obj, ChatAttachmentsModel.SENDERUSERNAME);
        akcr.b(str2, "receiverUsername");
        Object obj2 = this.e.a().b;
        if (obj2 == null) {
            akcr.a();
        }
        boolean a = akcr.a(obj, obj2);
        if (j == -1) {
            return new adpu(0, 0, null, 7);
        }
        return new adpu(j, a ? b(dbTransaction, aenb, j, str) : a(dbTransaction, aenb, j, str), null, 4);
    }

    public final adpu a(DbTransaction dbTransaction, aenb aenb, String str, StoryKind storyKind, String str2, MessageClientStatus messageClientStatus) {
        akcr.b(dbTransaction, "tx");
        akcr.b(aenb, "genericSnap");
        akcr.b(str, "storyId");
        akcr.b(storyKind, "storyKind");
        akcr.b(messageClientStatus, "clientStatus");
        Long a = d().a(dbTransaction, aenb, str, storyKind, str2, messageClientStatus);
        if (a == null) {
            return null;
        }
        a.longValue();
        return new adpu(0, 0, a, 3);
    }

    public final adpu a(DbTransaction dbTransaction, aenb aenb, String str, String str2) {
        String str3 = str;
        DbTransaction dbTransaction2 = dbTransaction;
        akcr.b(dbTransaction, "tx");
        akcr.b(aenb, "genericSnap");
        akcr.b(str3, ChatAttachmentsModel.SENDERUSERNAME);
        String str4 = str2;
        akcr.b(str4, "receiverUsername");
        Object obj = this.e.a().b;
        if (obj == null) {
            akcr.a();
        }
        return a(dbTransaction, quk.a(c(), akcr.a((Object) str3, obj) ? str4 : str3, null, null, false, 14), aenb, str, str2);
    }

    public final adpu b(DbTransaction dbTransaction, aenb aenb, String str, String str2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(aenb, "genericSnap");
        akcr.b(str, ChatAttachmentsModel.SENDERUSERNAME);
        akcr.b(str2, "groupId");
        Object obj = this.e.a().b;
        if (obj == null) {
            akcr.a();
        }
        long f = b().f(str2);
        boolean a = akcr.a((Object) str, obj);
        boolean z = f != -1;
        StringBuilder stringBuilder = new StringBuilder("Invalid feedId for ");
        stringBuilder.append(adoy.a(aenb));
        stringBuilder.append(" to ");
        stringBuilder.append(str2);
        Preconditions.checkArgument(z, stringBuilder.toString(), new Object[0]);
        return new adpu(f, a ? b(dbTransaction, aenb, f, str) : a(dbTransaction, aenb, f, str), null, 4);
    }
}
