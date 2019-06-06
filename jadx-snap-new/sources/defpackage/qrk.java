package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.snap.core.db.record.FeedMemberRecord.ForFeed;
import com.snap.core.db.record.FeedModel;
import com.snapchat.android.R;
import defpackage.qqk.a;
import defpackage.qqk.b;
import defpackage.qro.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qrk */
public final class qrk implements a {
    final zfw a = zgb.a(qql.a, "CreateGroupPresenter");
    final RecyclerView b = this.d.a();
    final achb<zjm, zjk> c;
    final b d;
    final qvd e;
    final qqm f;
    final qrg g;
    private ajei h;
    private zkf i;
    private zmg j;
    private final zms k = new zms(qrl.class);
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final ajdp<String> m = this.g.f();
    private final qsd n = new qsd(this.g.b);
    private final qro o;
    private final qqq p;
    private final ajwy<pqg> q;
    private final ahbd r;

    /* renamed from: qrk$i */
    static final class i<V> implements Callable<T> {
        private /* synthetic */ qrk a;
        private /* synthetic */ qsi b;

        i(qrk qrk, qsi qsi) {
            this.a = qrk;
            this.b = qsi;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.g.b(((qsj) this.b).e));
        }
    }

    /* renamed from: qrk$a */
    static final class a implements ajev {
        private /* synthetic */ qrk a;
        private /* synthetic */ qqp b;

        a(qrk qrk, qqp qqp) {
            this.a = qrk;
            this.b = qqp;
        }

        public final void run() {
            if (this.a.f != null) {
                this.a.c.e();
                this.a.f.a(this.b);
            }
        }
    }

    /* renamed from: qrk$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ qrk a;

        b(qrk qrk) {
            this.a = qrk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            pqh pqh = (pqh) obj;
            akcr.b(pqh, "chatContext");
            Object g = this.a.e.g(pqh.b);
            String str = pqh.b;
            akcr.a(g, "groupName");
            return new qqp(str, g, pqh.a);
        }
    }

    /* renamed from: qrk$c */
    static final class c<T, R> implements ajfc<qqp, ajdb> {
        private /* synthetic */ qrk a;

        c(qrk qrk) {
            this.a = qrk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            qqp qqp = (qqp) obj;
            akcr.b(qqp, "localGroupInfo");
            obj = ajcx.a((ajev) new a(this.a, qqp));
            akcr.a(obj, "Completable.fromAction {…)\n            }\n        }");
            return obj;
        }
    }

    /* renamed from: qrk$d */
    static final class d implements ajev {
        private /* synthetic */ qrk a;

        d(qrk qrk) {
            this.a = qrk;
        }

        public final void run() {
            this.a.e();
        }
    }

    /* renamed from: qrk$e */
    static final class e implements ajev {
        public static final e a = new e();

        e() {
        }

        public final void run() {
        }
    }

    /* renamed from: qrk$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qrk$g */
    static final class g implements ajev {
        public static final g a = new g();

        g() {
        }

        public final void run() {
        }
    }

    /* renamed from: qrk$h */
    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qrk$j */
    static final class j<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ qrk a;
        final /* synthetic */ qsi b;

        /* renamed from: qrk$j$1 */
        static final class 1 implements ajev {
            private /* synthetic */ j a;

            1(j jVar) {
                this.a = jVar;
            }

            public final void run() {
                Toast.makeText(this.a.a.b.getContext(), R.string.too_many_participants, 0).show();
            }
        }

        /* renamed from: qrk$j$2 */
        static final class 2 implements ajev {
            private /* synthetic */ j a;

            2(j jVar) {
                this.a = jVar;
            }

            public final void run() {
                this.a.a.g.b.a(this.a.b, true);
            }
        }

        /* renamed from: qrk$j$3 */
        static final class 3 implements ajev {
            private /* synthetic */ j a;

            3(j jVar) {
                this.a = jVar;
            }

            public final void run() {
                Toast.makeText(this.a.a.b.getContext(), R.string.not_added_back, 0).show();
            }
        }

        j(qrk qrk, qsi qsi) {
            this.a = qrk;
            this.b = qsi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "canAdd");
            if (!bool.booleanValue()) {
                return ajcx.a((ajev) new 3(this));
            }
            return ajcx.a((ajev) (this.a.g.b.a.size() >= 31 ? 1 : null) != null ? new 1(this) : new 2(this));
        }
    }

    /* renamed from: qrk$k */
    static final class k<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ qrk a;

        /* renamed from: qrk$k$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ k a;

            1(k kVar) {
                this.a = kVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "groupMembers");
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    ForFeed forFeed = (ForFeed) next;
                    qrg qrg = this.a.a.g;
                    Object username = forFeed.username();
                    akcr.a(username, "it.username()");
                    if (qrg.b(username)) {
                        arrayList.add(next);
                    }
                }
                Iterable<ForFeed> iterable = (List) arrayList;
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (ForFeed forFeed2 : iterable) {
                    long friendRowId = forFeed2.friendRowId();
                    Object username2 = forFeed2.username();
                    akcr.a(username2, "member.username()");
                    arrayList2.add(qqr.a(friendRowId, username2, forFeed2.displayName()));
                }
                return ajdp.b((Iterable) (List) arrayList2);
            }
        }

        k(qrk qrk) {
            this.a = qrk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (qqs) obj;
            akcr.b(obj, "recipient");
            return ((obj instanceof qqu) && this.a.g.b(((qqu) obj).b)) ? ajdp.b(obj) : obj instanceof qqt ? this.a.e.g(((qsk) ((qqt) obj).a).d).b((ajdw) this.a.a.i()).k((ajfc) new 1(this)) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: qrk$l */
    static final class l<T> implements ajfb<qqu> {
        private /* synthetic */ qrk a;

        l(qrk qrk) {
            this.a = qrk;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.g.b.a(((qqu) obj).a, true);
        }
    }

    /* renamed from: qrk$m */
    static final class m implements ajev {
        private /* synthetic */ qrk a;

        m(qrk qrk) {
            this.a = qrk;
        }

        public final void run() {
            this.a.d.b();
        }
    }

    public qrk(qro qro, zgb zgb, achb<zjm, zjk> achb, b bVar, qvd qvd, qqm qqm, qqq qqq, qrg qrg, ajwy<pqg> ajwy, ahbd ahbd) {
        akcr.b(qro, "dataProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(bVar, "createGroupView");
        akcr.b(qvd, "messagingRepository");
        akcr.b(qrg, "presenterDelegate");
        akcr.b(ajwy, "chatCommands");
        akcr.b(ahbd, FeedModel.SOURCEPAGE);
        this.o = qro;
        this.c = achb;
        this.d = bVar;
        this.e = qvd;
        this.f = qqm;
        this.p = qqq;
        this.g = qrg;
        this.q = ajwy;
        this.r = ahbd;
    }

    public final String a(int i) {
        return this.g.a(i);
    }

    public final void a() {
        if (!this.l.getAndSet(true)) {
            Object c = this.g.b.c();
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
            List list = (List) arrayList;
            ajcx ajcx = null;
            if (list.size() > 1) {
                ajcx = ((pqg) this.q.get()).a(list, this.r).a((ajdw) this.a.i()).f(new b(this)).a((ajdw) this.a.l()).e((ajfc) new c(this));
            }
            if (ajcx != null) {
                ajej a = ajcx.f(new d(this)).a((ajev) e.a, (ajfb) f.a);
                akcr.a((Object) a, "createGroupCompletable.d…w group.\")\n            })");
                ajei ajei = this.h;
                if (ajei == null) {
                    akcr.a("disposables");
                }
                ajvv.a(a, ajei);
                return;
            }
            e();
        }
    }

    public final void a(String str) {
        akcr.b(str, "username");
        this.g.a(str);
    }

    public final void b() {
        this.g.b();
    }

    public final void c() {
        this.g.c();
    }

    public final qrm d() {
        return this.g.b;
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        this.l.set(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x006b  */
    @defpackage.akqq
    public final void onSelectionEvent(defpackage.qrq r3) {
        /*
        r2 = this;
        r0 = "event";
        defpackage.akcr.b(r3, r0);
        r0 = r3.a;
        r3 = r3.b;
        if (r3 != 0) goto L_0x0014;
    L_0x000b:
        r3 = r2.g;
        r3 = r3.b;
        r1 = 0;
        r3.a(r0, r1);
        goto L_0x004b;
    L_0x0014:
        r3 = r0 instanceof defpackage.qsj;
        if (r3 == 0) goto L_0x004b;
    L_0x0018:
        r3 = new qrk$i;
        r3.<init>(r2, r0);
        r3 = (java.util.concurrent.Callable) r3;
        r3 = defpackage.ajdx.c(r3);
        r1 = r2.a;
        r1 = r1.i();
        r1 = (defpackage.ajdw) r1;
        r3 = r3.b(r1);
        r1 = r2.a;
        r1 = r1.l();
        r1 = (defpackage.zfr) r1;
        r1 = (defpackage.ajdw) r1;
        r3 = r3.a(r1);
        r1 = new qrk$j;
        r1.<init>(r2, r0);
        r1 = (defpackage.ajfc) r1;
        r3 = r3.e(r1);
        r0 = "Single.fromCallable { pr…                        }";
        goto L_0x0053;
    L_0x004b:
        r3 = defpackage.ajhn.a;
        r3 = defpackage.ajvo.a(r3);
        r0 = "Completable.complete()";
    L_0x0053:
        defpackage.akcr.a(r3, r0);
        r0 = defpackage.qrk.g.a;
        r0 = (defpackage.ajev) r0;
        r1 = defpackage.qrk.h.a;
        r1 = (defpackage.ajfb) r1;
        r3 = r3.a(r0, r1);
        r0 = "processSelection(event.m…Error selecting item\") })";
        defpackage.akcr.a(r3, r0);
        r0 = r2.h;
        if (r0 != 0) goto L_0x0070;
    L_0x006b:
        r1 = "disposables";
        defpackage.akcr.a(r1);
    L_0x0070:
        defpackage.ajvv.a(r3, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrk.onSelectionEvent(qrq):void");
    }

    public final ajej start() {
        this.h = new ajei();
        ajej start = this.g.start();
        ajei ajei = this.h;
        String str = "disposables";
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        this.d.a(this);
        this.d.c();
        b bVar = this.d;
        String string = this.b.getContext().getString(R.string.create_group_send_to_hint_text);
        akcr.a((Object) string, "recyclerView.context.get…_group_send_to_hint_text)");
        bVar.a(string);
        this.i = new zkf();
        zkf zkf = this.i;
        string = "bus";
        if (zkf == null) {
            akcr.a(string);
        }
        zkf.a(this);
        zkf = this.i;
        if (zkf == null) {
            akcr.a(string);
        }
        start = zkf;
        ajei ajei2 = this.h;
        if (ajei2 == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei2);
        Builder builder = ImmutableList.builder();
        builder.add(new qru());
        a aVar = this;
        builder.add(new qrw(aVar, this.o.a(), this.m));
        qro qro = this.o;
        ajdp a = ajdp.a((ajdt) qro.b, (ajdt) qro.c(), (ajex) new l(qro));
        if (a == null) {
            akcr.a();
        }
        Object b = a.b((ajdw) qro.a.h());
        akcr.a(b, "Observables.combineLates…dulers.userInteractive())");
        builder.add(new qry(aVar, b, this.m, this.g.e()));
        builder.add(new qrt(aVar, this.o.f(), this.m));
        builder.add(new qsb(aVar, this.o.f(), this.m, this.n));
        ImmutableList build = builder.build();
        zms zms = this.k;
        zkf zkf2 = this.i;
        if (zkf2 == null) {
            akcr.a(string);
        }
        this.j = new zmg(zms, zkf2.a(), this.a.b(), build);
        zmg zmg = this.j;
        string = "adapter";
        if (zmg == null) {
            akcr.a(string);
        }
        start = zmg.c();
        akcr.a((Object) start, "adapter.subscribe()");
        ajei2 = this.h;
        if (ajei2 == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei2);
        RecyclerView recyclerView = this.b;
        zmg zmg2 = this.j;
        if (zmg2 == null) {
            akcr.a(string);
        }
        recyclerView.setAdapter(zmg2.a());
        start = ajek.a((ajev) new m(this));
        akcr.a((Object) start, "Disposables.fromAction {…upView.detach()\n        }");
        ajei = this.h;
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        qqq qqq = this.p;
        this.g.b.a.clear();
        if (qqq != null) {
            start = ajdp.b((Iterable) qqq.a).a((ajdw) this.a.h()).k((ajfc) new k(this)).c(31).a((ajdw) this.a.l()).f((ajfb) new l(this));
            akcr.a((Object) start, "Observable.fromIterable(…ue)\n                    }");
            ajei = this.h;
            if (ajei == null) {
                akcr.a(str);
            }
            ajvv.a(start, ajei);
        }
        ajei ajei3 = this.h;
        if (ajei3 == null) {
            akcr.a(str);
        }
        return ajei3;
    }
}
