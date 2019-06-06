package defpackage;

import android.content.Context;
import com.snap.core.db.record.FeedRecord.BasicFeedInfo;
import com.snap.messaging.api.reply.InputBarControllerFragment;
import com.snap.messaging.chat.ChatFragment;
import com.snap.messaging.chat.features.storyreply.InputBarFragment;
import defpackage.pqn.a;
import java.util.concurrent.Callable;

/* renamed from: pve */
public final class pve implements pqn {
    final aipn<achb<zjm, zjk>> a;
    final aipn<quk> b;
    private final ajxe c = ajxh.a(new g(this));
    private final ajdx<prx> d;
    private final zgb e;
    private final aipn<icz> f;
    private final ihh g;

    /* renamed from: pve$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ pve a;

        g(pve pve) {
            this.a = pve;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(pql.j.callsite("ChatLauncherImpl"));
        }
    }

    /* renamed from: pve$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ pve a;
        private /* synthetic */ String b;

        c(pve pve, String str) {
            this.a = pve;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            return Long.valueOf(quk.a((quk) this.a.b.get(), this.b, null, null, false, 14));
        }
    }

    /* renamed from: pve$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ long a;

        a(long j) {
            this.a = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "api");
            return prx.a(this.a);
        }
    }

    /* renamed from: pve$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ abbd a;

        b(abbd abbd) {
            this.a = abbd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            BasicFeedInfo basicFeedInfo = (BasicFeedInfo) obj;
            akcr.b(basicFeedInfo, "feedRecord");
            long _id = basicFeedInfo._id();
            Object key = basicFeedInfo.key();
            akcr.a(key, "feedRecord.key()");
            return new pqh(_id, key, basicFeedInfo.isGroup(), this.a);
        }
    }

    /* renamed from: pve$d */
    static final class d<T> implements ajfb<Long> {
        private /* synthetic */ pve a;
        private /* synthetic */ abbd b;

        d(pve pve, abbd abbd) {
            this.a = pve;
            this.b = abbd;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            pve pve = this.a;
            akcr.a(obj, "feedId");
            pve.a(obj.longValue(), this.b);
        }
    }

    /* renamed from: pve$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ pve a;
        private /* synthetic */ abbd b;

        e(pve pve, abbd abbd) {
            this.a = pve;
            this.b = abbd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            pqh pqh = (pqh) obj;
            akcr.b(pqh, "chatContext");
            ((achb) this.a.a.get()).b(a.a(this.a, pqh, null, this.b, 2));
            return ajxw.a;
        }
    }

    /* renamed from: pve$f */
    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ long a;

        f(long j) {
            this.a = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            StringBuilder stringBuilder = new StringBuilder("ERROR PLEASE SHAKE: Failed to launch chat for ");
            stringBuilder.append(this.a);
            stringBuilder.append(". Enabling db dump before shaking will be helpful.");
            ieg.a(stringBuilder.toString(), true, 0);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(pve.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public pve(aipn<achb<zjm, zjk>> aipn, aipn<quk> aipn2, ajdx<prx> ajdx, zgb zgb, aipn<icz> aipn3, ihh ihh) {
        akcr.b(aipn, "navigationHostLazy");
        akcr.b(aipn2, "conversationsRepositoryLazy");
        akcr.b(ajdx, "messagingApi");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn3, "pageLoadMetricReporter");
        akcr.b(ihh, "clock");
        this.a = aipn;
        this.b = aipn2;
        this.d = ajdx;
        this.e = zgb;
        this.f = aipn3;
        this.g = ihh;
    }

    private final zfw a() {
        return (zfw) this.c.b();
    }

    private final ajcx c(String str, zfw zfw, abbd abbd) {
        Object d = ajdx.c((Callable) new c(this, str)).b((ajdw) zfw.m()).a((ajdw) zfw.l()).c((ajfb) new d(this, abbd)).d();
        akcr.a(d, "Single.fromCallable {\n  …         .toCompletable()");
        return d;
    }

    public final acig<zjm, zjk> a(pqh pqh, pqf pqf, abbd abbd) {
        akcr.b(pqh, "chatContext");
        zjr a = zjr.a.a(pql.a.d, this.f, this.g, abbd);
        ChatFragment chatFragment = new ChatFragment();
        chatFragment.U = a;
        Object obj = this.a.get();
        akcr.a(obj, "navigationHostLazy.get()");
        achb achb = (achb) obj;
        achd zjf = new zjf(pql.a, chatFragment, acgv.a().a(pql.d).a());
        Object obj2 = pql.c;
        akcr.a(obj2, "ChatFeature.CHAT_PRESENT_DEFAULT");
        return new acip(achb, zjf, obj2, new pqj(pqh, pqf));
    }

    public final ajcx a(String str, zfw zfw, abbd abbd) {
        akcr.b(str, "username");
        akcr.b(zfw, "schedulers");
        akcr.b(abbd, "navigateToChatSource");
        return c(str, zfw, abbd);
    }

    public final InputBarControllerFragment a(long j, String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, zjm zjm, pva pva) {
        String str6 = str;
        String str7 = str2;
        boolean z3 = z2;
        zjm zjm2 = zjm;
        pva pva2 = pva;
        String str8 = "conversationId";
        akcr.b(str, str8);
        String str9 = "snapId";
        akcr.b(str2, str9);
        String str10 = "pageType";
        akcr.b(zjm2, str10);
        String str11 = "inputBarFragmentEventListener";
        akcr.b(pva2, str11);
        InputBarFragment inputBarFragment = new InputBarFragment();
        akcr.b(pva2, str11);
        inputBarFragment.m = pva2;
        akcr.b(str, str8);
        akcr.b(str2, str9);
        inputBarFragment.o = z3;
        inputBarFragment.p = str7;
        inputBarFragment.q = str3;
        inputBarFragment.r = str4;
        inputBarFragment.s = str5;
        inputBarFragment.n = new pqh(j, str, z, z3 ? abbd.CONTEXT_CARDS : abbd.STORY);
        ajws ajws = inputBarFragment.k;
        pqh pqh = inputBarFragment.n;
        if (pqh == null) {
            akcr.a("chatContext");
        }
        ajws.a((Object) pqh);
        akcr.b(zjm2, str10);
        inputBarFragment.l = zjm2;
        return inputBarFragment;
    }

    public final psi a(Context context, puz puz) {
        akcr.b(context, "context");
        akcr.b(puz, "inputBarCardEventListener");
        return new qbz(context, puz);
    }

    public final void a(long j, abbd abbd) {
        akcr.b(abbd, "navigateToChatSource");
        b(j, abbd).e();
    }

    public final ajcx b(long j, abbd abbd) {
        akcr.b(abbd, "navigateToChatSource");
        Object e = c(j, abbd).a((ajdw) a().l()).f(new e(this, abbd)).d((ajfb) new f(j)).e();
        akcr.a(e, "getChatContextFromFeedId…         .ignoreElement()");
        return e;
    }

    public final ajcx b(String str, zfw zfw, abbd abbd) {
        akcr.b(str, "username");
        akcr.b(zfw, "schedulers");
        akcr.b(abbd, "navigateToChatSource");
        return c(str, zfw, abbd);
    }

    public final ajdx<pqh> c(long j, abbd abbd) {
        akcr.b(abbd, "navigateToChatSource");
        Object f = this.d.a((ajfc) new a(j)).b((ajdw) a().b()).f(new b(abbd));
        akcr.a(f, "messagingApi\n           …, navigateToChatSource) }");
        return f;
    }
}
