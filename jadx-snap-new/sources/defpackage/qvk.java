package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.record.MessageRecord.MessageDifferentialInfo;
import defpackage.adpm.a;

/* renamed from: qvk */
public final class qvk {
    private final String a = "ReceivedMessageProcessor";
    private final ajxe b;
    private final ajxe c;
    private final gpb d;
    private final ajwy<qus> e;
    private final ajwy<qvj> f;

    /* renamed from: qvk$b */
    static final class b extends akcq implements akbk<adpm> {
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
            return (adpm) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: qvk$a */
    static final class a extends akcq implements akbk<qup> {
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
            return (qup) ((aipn) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qvk.class), "messageProcessors", "getMessageProcessors()Lcom/snapchat/messaging/chat/processor/MessageProcessors;"), new akdc(akde.a(qvk.class), "friendsFeedSnapDbLogger", "getFriendsFeedSnapDbLogger()Lcom/snap/messaging/db/FriendsFeedSnapDbLogger;")};
    }

    public qvk(gpb gpb, ajwy<qus> ajwy, aipn<adpm> aipn, aipn<qup> aipn2, ajwy<qvj> ajwy2) {
        akcr.b(gpb, "userAuth");
        akcr.b(ajwy, "interactionMessagesRepository");
        akcr.b(aipn, "messageProcessors");
        akcr.b(aipn2, "friendsFeedSnapDbLogger");
        akcr.b(ajwy2, "networkMessageRepository");
        this.d = gpb;
        this.e = ajwy;
        this.f = ajwy2;
        this.b = ajxh.a(new b(aipn));
        this.c = ajxh.a(new a(aipn2));
    }

    private final adpm a() {
        return (adpm) this.b.b();
    }

    public final void a(DbTransaction dbTransaction, aegj aegj, MessageDifferentialInfo messageDifferentialInfo) {
        akcr.b(dbTransaction, "tx");
        akcr.b(aegj, "chatMessage");
        if (messageDifferentialInfo != null) {
            qvj qvj = (qvj) this.f.get();
            String str = aegj.b;
            akcr.a((Object) str, "chatMessage.chatMessageId");
            qvj.a(str);
        }
        a().a(dbTransaction, aegj);
    }

    public final void a(DbTransaction dbTransaction, aeie aeie) {
        akcr.b(dbTransaction, "tx");
        akcr.b(aeie, ErrorFields.MESSAGE);
        a a = a().a(dbTransaction, aeie);
        ((qus) this.e.get()).a(dbTransaction, qvv.SINGLE_UPDATE, a.a);
    }
}
