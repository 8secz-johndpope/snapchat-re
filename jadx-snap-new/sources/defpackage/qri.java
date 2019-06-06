package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.snap.core.db.record.FeedModel;
import com.snapchat.android.R;
import defpackage.qqk.a;
import defpackage.qqk.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qri */
public final class qri implements a {
    final zfw a = zgb.a(qql.a, "CreateChatPresenter");
    final RecyclerView b = this.e.a();
    final AtomicBoolean c = new AtomicBoolean(false);
    final achb<zjm, zjk> d;
    final b e;
    final gvl f;
    final qvd g;
    final qqo h;
    final qrg i;
    final ajwy<pqg> j;
    final ahbd k;
    private ajei l;
    private zkf m;
    private zmg n;
    private final zms o = new zms(qrl.class);
    private final ajdp<String> p = this.i.f();
    private final qsd q = new qsd(this.i.b);
    private final qro r;
    private final qqq s;

    /* renamed from: qri$h */
    static final class h<V> implements Callable<T> {
        private /* synthetic */ qri a;
        private /* synthetic */ String b;

        h(qri qri, String str) {
            this.a = qri;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            return Long.valueOf(this.a.g.f(this.b));
        }
    }

    /* renamed from: qri$j */
    static final class j<V> implements Callable<T> {
        private /* synthetic */ qri a;
        private /* synthetic */ qsi b;

        j(qri qri, qsi qsi) {
            this.a = qri;
            this.b = qsi;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.i.b(((qsj) this.b).e));
        }
    }

    /* renamed from: qri$a */
    static final class a implements ajev {
        private /* synthetic */ qri a;
        private /* synthetic */ pqh b;

        a(qri qri, pqh pqh) {
            this.a = qri;
            this.b = pqh;
        }

        public final void run() {
            if (this.a.h != null) {
                this.a.d.e();
                this.a.h.a(this.b);
                return;
            }
            this.a.f.a(qvz.a("snapchat://notification/chat_on_friendsfeed/", this.b), false);
        }
    }

    /* renamed from: qri$c */
    static final class c implements ajev {
        private /* synthetic */ qri a;

        c(qri qri) {
            this.a = qri;
        }

        public final void run() {
            this.a.c.set(false);
        }
    }

    /* renamed from: qri$d */
    static final class d implements ajev {
        public static final d a = new d();

        d() {
        }

        public final void run() {
        }
    }

    /* renamed from: qri$e */
    static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qri$f */
    static final class f implements ajev {
        public static final f a = new f();

        f() {
        }

        public final void run() {
        }
    }

    /* renamed from: qri$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qri$i */
    static final class i<T, R> implements ajfc<Long, ajdb> {
        private /* synthetic */ qri a;
        private /* synthetic */ String b;

        i(qri qri, String str) {
            this.a = qri;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "feedId");
            return qri.a(this.a, new pqh(l.longValue(), this.b, true));
        }
    }

    /* renamed from: qri$k */
    static final class k<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ qri a;
        final /* synthetic */ qsi b;
        private /* synthetic */ boolean c;

        /* renamed from: qri$k$1 */
        static final class 1 implements ajev {
            private /* synthetic */ k a;

            1(k kVar) {
                this.a = kVar;
            }

            public final void run() {
                Toast.makeText(this.a.a.b.getContext(), R.string.too_many_participants, 0).show();
            }
        }

        /* renamed from: qri$k$2 */
        static final class 2 implements ajev {
            private /* synthetic */ k a;

            2(k kVar) {
                this.a = kVar;
            }

            public final void run() {
                this.a.a.i.b.a(this.a.b, true);
            }
        }

        /* renamed from: qri$k$4 */
        static final class 4 implements ajev {
            private /* synthetic */ k a;

            4(k kVar) {
                this.a = kVar;
            }

            public final void run() {
                Toast.makeText(this.a.a.b.getContext(), R.string.not_added_back, 0).show();
            }
        }

        k(qri qri, qsi qsi, boolean z) {
            this.a = qri;
            this.b = qsi;
            this.c = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "canAdd");
            if (bool.booleanValue()) {
                return ajcx.a((ajev) (this.a.i.b.a.size() >= 31 ? 1 : null) != null ? new 1(this) : new 2(this));
            }
            return this.c ? ((pqg) this.a.j.get()).a(ajyl.a(Long.valueOf(((qsj) this.b).d)), this.a.k).a((ajdw) this.a.a.l()).e((ajfc) new qrj(new akbl<pqh, ajcx>(this.a) {
                public final String getName() {
                    return "launchChat";
                }

                public final akej getOwner() {
                    return akde.a(qri.class);
                }

                public final String getSignature() {
                    return "launchChat(Lcom/snap/messaging/api/ChatContext;)Lio/reactivex/Completable;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    pqh pqh = (pqh) obj;
                    akcr.b(pqh, "p1");
                    return qri.a((qri) this.receiver, pqh);
                }
            })) : ajcx.a((ajev) new 4(this));
        }
    }

    /* renamed from: qri$l */
    static final class l implements ajev {
        public static final l a = new l();

        l() {
        }

        public final void run() {
        }
    }

    /* renamed from: qri$m */
    static final class m<T> implements ajfb<Throwable> {
        public static final m a = new m();

        m() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qri$n */
    static final class n implements ajev {
        private /* synthetic */ qri a;

        n(qri qri) {
            this.a = qri;
        }

        public final void run() {
            this.a.e.b();
        }
    }

    /* renamed from: qri$b */
    static final class b extends akcq implements akbl<pqh, ajcx> {
        b(qri qri) {
            super(1, qri);
        }

        public final String getName() {
            return "launchChat";
        }

        public final akej getOwner() {
            return akde.a(qri.class);
        }

        public final String getSignature() {
            return "launchChat(Lcom/snap/messaging/api/ChatContext;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            pqh pqh = (pqh) obj;
            akcr.b(pqh, "p1");
            return qri.a((qri) this.receiver, pqh);
        }
    }

    public qri(qro qro, zgb zgb, achb<zjm, zjk> achb, b bVar, gvl gvl, qvd qvd, qqo qqo, qqq qqq, qrg qrg, ajwy<pqg> ajwy, ahbd ahbd) {
        akcr.b(qro, "dataProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(bVar, "createChatView");
        akcr.b(gvl, "deepLinkDispatcher");
        akcr.b(qvd, "messagingRepository");
        akcr.b(qrg, "presenterDelegate");
        akcr.b(ajwy, "chatCommands");
        akcr.b(ahbd, FeedModel.SOURCEPAGE);
        this.r = qro;
        this.d = achb;
        this.e = bVar;
        this.f = gvl;
        this.g = qvd;
        this.h = qqo;
        this.s = qqq;
        this.i = qrg;
        this.j = ajwy;
        this.k = ahbd;
    }

    private final ajcx a(qsi qsi, boolean z) {
        String str = "Completable.complete()";
        Object e;
        if (z) {
            z = this.i.b.b();
            if (qsi instanceof qsk) {
                String str2 = ((qsk) qsi).e;
                e = ajdx.c((Callable) new h(this, str2)).b((ajdw) this.a.i()).a((ajdw) this.a.l()).e((ajfc) new i(this, str2));
                akcr.a(e, "Single.fromCallable { me…e))\n                    }");
                return e;
            } else if (qsi instanceof qsj) {
                e = ajdx.c((Callable) new j(this, qsi)).b((ajdw) this.a.i()).a((ajdw) this.a.l()).e((ajfc) new k(this, qsi, z));
                akcr.a(e, "Single.fromCallable { pr…  }\n                    }");
                return e;
            } else {
                e = ajvo.a(ajhn.a);
                akcr.a(e, str);
                return e;
            }
        }
        this.i.b.a(qsi, false);
        e = ajvo.a(ajhn.a);
        akcr.a(e, str);
        return e;
    }

    public final String a(int i) {
        return this.i.a(i);
    }

    public final void a() {
        if (!this.c.getAndSet(true)) {
            Object c = this.i.b.c();
            akcr.a(c, "getSelectionState()\n                .toList()");
            Iterable<qqs> iterable = (Iterable) c;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (qqs qqs : iterable) {
                qsi qsi = qqs.a;
                if (qsi != null) {
                    arrayList.add(Long.valueOf(((qsj) qsi).d));
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snap.messaging.createchat.ui.viewmodel.ChatSelectionFriendViewModel");
                }
            }
            ajej a = ((pqg) this.j.get()).a((List) arrayList, this.k).a((ajdw) this.a.l()).e((ajfc) new qrj(new b(this))).f(new c(this)).a((ajev) d.a, (ajfb) e.a);
            akcr.a((Object) a, "chatCommands.get()\n     …ew chat.\")\n            })");
            ajei ajei = this.l;
            if (ajei == null) {
                akcr.a("disposables");
            }
            ajvv.a(a, ajei);
        }
    }

    public final void a(String str) {
        akcr.b(str, "username");
        this.i.a(str);
    }

    public final void b() {
        this.i.b();
    }

    public final void c() {
        this.i.c();
    }

    public final qrm d() {
        return this.i.b;
    }

    @akqq
    public final void onSelectionEvent(qrq qrq) {
        akcr.b(qrq, "event");
        ajej a = a(qrq.a, qrq.b).a((ajev) f.a, (ajfb) g.a);
        akcr.a((Object) a, "processSelection(event.m…Error selecting item\") })");
        ajei ajei = this.l;
        if (ajei == null) {
            akcr.a("disposables");
        }
        ajvv.a(a, ajei);
    }

    public final ajej start() {
        this.l = new ajei();
        ajej start = this.i.start();
        ajei ajei = this.l;
        String str = "disposables";
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        this.e.a(this);
        this.m = new zkf();
        zkf zkf = this.m;
        String str2 = "bus";
        if (zkf == null) {
            akcr.a(str2);
        }
        zkf.a(this);
        zkf = this.m;
        if (zkf == null) {
            akcr.a(str2);
        }
        start = zkf;
        ajei ajei2 = this.l;
        if (ajei2 == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei2);
        Builder builder = ImmutableList.builder();
        builder.add(new qru());
        a aVar = this;
        builder.add(new qrw(aVar, this.r.a(), this.p));
        builder.add(new qry(aVar, this.r.c(), this.p, this.i.e()));
        builder.add(new qrx(aVar, this.r.d(), this.p, this.i.e()));
        builder.add(new qrt(aVar, this.r.b(), this.p));
        builder.add(new qsb(aVar, this.r.b(), this.p, this.q));
        builder.add((Object) new qsc(aVar, this.r.d(), this.p, this.i.e(), this.q));
        ImmutableList build = builder.build();
        zms zms = this.o;
        zkf zkf2 = this.m;
        if (zkf2 == null) {
            akcr.a(str2);
        }
        this.n = new zmg(zms, zkf2.a(), this.a.b(), build);
        zmg zmg = this.n;
        str2 = "adapter";
        if (zmg == null) {
            akcr.a(str2);
        }
        start = zmg.c();
        akcr.a((Object) start, "adapter.subscribe()");
        ajei2 = this.l;
        if (ajei2 == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei2);
        RecyclerView recyclerView = this.b;
        zmg zmg2 = this.n;
        if (zmg2 == null) {
            akcr.a(str2);
        }
        recyclerView.setAdapter(zmg2.a());
        qqq qqq = this.s;
        this.i.b.a.clear();
        if (qqq != null) {
            ajcx ajcx = null;
            for (qqs qqs : qqq.a) {
                ajcx = ajcx == null ? a(qqs.a, true) : ajcx.b((ajdb) a(qqs.a, true));
            }
            if (ajcx != null) {
                start = ajcx.a((ajev) l.a, (ajfb) m.a);
                ajei = this.l;
                if (ajei == null) {
                    akcr.a(str);
                }
                ajvv.a(start, ajei);
            }
        }
        start = ajek.a((ajev) new n(this));
        akcr.a((Object) start, "Disposables.fromAction {…atView.detach()\n        }");
        ajei = this.l;
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        ajei ajei3 = this.l;
        if (ajei3 == null) {
            akcr.a(str);
        }
        return ajei3;
    }
}
