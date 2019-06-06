package defpackage;

import com.snap.core.db.column.FriendLinkType;
import defpackage.qxz.a;
import java.util.List;

/* renamed from: qzv */
public final class qzv implements itr {
    final ajwy<ilv> a;
    final yhz b;
    private final idd c = pry.a.callsite("FriendsFeedFriendUpdateProcessor");
    private final zfw d = zgb.a(this.c);
    private final ajei e = new ajei();
    private final gpb f;
    private final reg g;
    private final ajwy<qxz> h;
    private final ajwy<pvy> i;
    private final ajwy<iqw> j;

    /* renamed from: qzv$a */
    static final class a implements ajev {
        public static final a a = new a();

        a() {
        }

        public final void run() {
        }
    }

    /* renamed from: qzv$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qzv$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ qzv a;
        private /* synthetic */ String b;

        c(qzv qzv, String str) {
            this.a = qzv;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            pqv pqv = (pqv) obj;
            akcr.b(pqv, "conversation");
            Long l = pqv.e;
            if ((l != null ? l.longValue() : 0) > 0) {
                return pqv;
            }
            StringBuilder stringBuilder = new StringBuilder("Conversation ");
            stringBuilder.append(this.b);
            stringBuilder.append(" not ready to be fetched on server.");
            String stringBuilder2 = stringBuilder.toString();
            ((ilv) this.a.a.get()).c((ily) ioc.MUTUAL_FRIEND_CONVO_NOT_READY, 1);
            throw new IllegalStateException(stringBuilder2);
        }
    }

    /* renamed from: qzv$d */
    static final class d<T, R> implements ajfc<pqv, ajdb> {
        private /* synthetic */ qzv a;

        d(qzv qzv) {
            this.a = qzv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((pqv) obj, "it");
            return this.a.b.a();
        }
    }

    /* renamed from: qzv$e */
    static final class e implements ajev {
        private /* synthetic */ String a;

        e(String str) {
            this.a = str;
        }

        public final void run() {
        }
    }

    /* renamed from: qzv$f */
    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ String a;

        f(String str) {
            this.a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qzv$g */
    static final class g implements ajev {
        public static final g a = new g();

        g() {
        }

        public final void run() {
        }
    }

    /* renamed from: qzv$h */
    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public qzv(zgb zgb, gpb gpb, reg reg, ajwy<ilv> ajwy, ajwy<qxz> ajwy2, ajwy<pvy> ajwy3, ajwy<iqw> ajwy4, yhz yhz) {
        akcr.b(zgb, "qualifiedSchedulers");
        akcr.b(gpb, "userAuth");
        akcr.b(reg, "newlyAddedFriendProcessorUtil");
        akcr.b(ajwy, "graphene");
        akcr.b(ajwy2, "friendsFeedClient");
        akcr.b(ajwy3, "conversationFetcher");
        akcr.b(ajwy4, "friendApi");
        akcr.b(yhz, "storiesNetworkApi");
        this.f = gpb;
        this.g = reg;
        this.a = ajwy;
        this.h = ajwy2;
        this.i = ajwy3;
        this.j = ajwy4;
        this.b = yhz;
    }

    public final void a(aelf aelf, String str) {
        akcr.b(aelf, "friend");
        akcr.b(str, "source");
        iqw iqw = (iqw) this.j.get();
        String str2 = aelf.a;
        String str3 = "friend.name";
        akcr.a((Object) str2, str3);
        Object obj = iqw.b(str2) == FriendLinkType.MUTUAL ? 1 : null;
        if (!(this.g.a() || aelf.M.booleanValue())) {
            qxz qxz = (qxz) this.h.get();
            ajxm[] ajxmArr = new ajxm[]{new ajxm(aelf.a, aelf.f)};
            akcr.b(ajxmArr, "friendsAndLastInteractionTimes");
            Object scheduleRunInTransaction = qxz.d().scheduleRunInTransaction("FriendsFeedClient::addConversation", new a(qxz, ajxmArr));
            akcr.a(scheduleRunInTransaction, "snapDb.scheduleRunInTran…teractionTimes)\n        }");
            scheduleRunInTransaction.a((ajev) a.a, (ajfb) b.a);
        }
        if (obj != null) {
            str = this.f.b();
            if (str == null) {
                akcr.a();
            }
            String str4 = aelf.a;
            akcr.a((Object) str4, str3);
            str4 = pvg.a(str, str4);
            ajdx f = ((pvy) this.i.get()).a(str4, false, aeib.MISSING_CONVERSATION).f(new c(this, str4));
            akcr.a((Object) f, "conversationFetcher.get(…ion\n                    }");
            ajcx e = ign.a(f, (ajdw) this.d.b()).e((ajfc) new d(this));
            akcr.a((Object) e, "conversationFetcher.get(…ostedAndFriendStories() }");
            igh.a(e, (ajfo) this.e).a((ajev) new e(str4), (ajfb) new f(str4));
        }
    }

    public final void a(String str, String str2) {
        akcr.b(str2, "source");
        igh.a(this.b.a(), (ajfo) this.e).a((ajev) g.a, (ajfb) h.a);
    }

    public final void a(List<aelf> list, String str) {
        akcr.b(str, "source");
    }
}
