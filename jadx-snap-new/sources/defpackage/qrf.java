package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.snap.core.db.record.FeedRecord.BasicFeedInfo;
import com.snapchat.android.R;
import defpackage.pwc.c;
import defpackage.qqk.a;
import defpackage.qqk.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qrf */
public final class qrf implements a {
    final RecyclerView a = this.f.a();
    final AtomicBoolean b = new AtomicBoolean(false);
    final achb<zjm, zjk> c;
    final pwc d;
    final iqw e;
    final b f;
    final int g;
    final qrg h;
    private ajei i;
    private zkf j;
    private zmg k;
    private final zms l = new zms(qrl.class);
    private final zfw m = zgb.a(qql.a, "AddMemberPresenter");
    private final ajdp<String> n = this.h.f();
    private final qsd o = new qsd(this.h.b);
    private final qro p;
    private final qvd q;
    private final long r;

    /* renamed from: qrf$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ qrf a;
        private /* synthetic */ List b;

        e(qrf qrf, List list) {
            this.a = qrf;
            this.b = list;
        }

        public final /* synthetic */ Object call() {
            Iterable<qsi> iterable = this.b;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (qsi qsi : iterable) {
                iqw iqw = this.a.e;
                if (qsi != null) {
                    String a = iqw.a(((qsj) qsi).e);
                    if (a == null) {
                        akcr.a();
                    }
                    arrayList.add(a);
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snap.messaging.createchat.ui.viewmodel.ChatSelectionFriendViewModel");
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: qrf$h */
    static final class h<V> implements Callable<T> {
        private /* synthetic */ qrf a;
        private /* synthetic */ qsj b;

        h(qrf qrf, qsj qsj) {
            this.a = qrf;
            this.b = qsj;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.h.b(this.b.e));
        }
    }

    /* renamed from: qrf$a */
    static final class a implements ajev {
        private /* synthetic */ qrf a;

        a(qrf qrf) {
            this.a = qrf;
        }

        public final void run() {
            this.a.b.set(false);
        }
    }

    /* renamed from: qrf$b */
    static final class b implements ajev {
        private /* synthetic */ qrf a;

        b(qrf qrf) {
            this.a = qrf;
        }

        public final void run() {
            this.a.c.e();
        }
    }

    /* renamed from: qrf$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ qrf a;

        c(qrf qrf) {
            this.a = qrf;
        }

        public final /* synthetic */ void accept(Object obj) {
            Toast.makeText(this.a.a.getContext(), R.string.add_member_error_message, 0).show();
        }
    }

    /* renamed from: qrf$d */
    static final class d<T, R> implements ajfc<ajxm<? extends BasicFeedInfo, ? extends List<? extends String>>, ajdb> {
        private /* synthetic */ qrf a;

        d(qrf qrf) {
            this.a = qrf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            Object obj2 = (BasicFeedInfo) ajxm.a;
            obj = (List) ajxm.b;
            akcr.a(obj2, "feedInfo");
            if (obj2.isGroup()) {
                pwc pwc = this.a.d;
                String str = "userIds";
                akcr.a(obj, str);
                obj2 = obj2.key();
                akcr.a(obj2, "feedInfo.key()");
                akcr.b(obj, str);
                akcr.b(obj2, "groupId");
                obj = pwc.c.a((ajfc) new pwc.a(pwc, obj, obj2)).a((ajfc) pwc.b.a).e((ajfc) new c(pwc)).a((ajdw) pwc.a.b());
                akcr.a(obj, "messagingHttpInterface\n …schedulers.computation())");
                return obj;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: qrf$f */
    static final class f implements ajev {
        public static final f a = new f();

        f() {
        }

        public final void run() {
        }
    }

    /* renamed from: qrf$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qrf$i */
    static final class i<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ qrf a;
        final /* synthetic */ qsj b;

        /* renamed from: qrf$i$1 */
        static final class 1 implements ajev {
            private /* synthetic */ i a;

            1(i iVar) {
                this.a = iVar;
            }

            public final void run() {
                Toast.makeText(this.a.a.a.getContext(), R.string.too_many_participants, 0).show();
            }
        }

        /* renamed from: qrf$i$2 */
        static final class 2 implements ajev {
            private /* synthetic */ i a;

            2(i iVar) {
                this.a = iVar;
            }

            public final void run() {
                this.a.a.h.b.a(this.a.b, true);
            }
        }

        i(qrf qrf, qsj qsj) {
            this.a = qrf;
            this.b = qsj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "canAdd");
            if (!bool.booleanValue()) {
                return ajvo.a(ajhn.a);
            }
            qrf qrf = this.a;
            return ajcx.a((ajev) (qrf.h.b.a.size() + qrf.g >= 31 ? 1 : null) != null ? new 1(this) : new 2(this));
        }
    }

    /* renamed from: qrf$j */
    static final class j implements ajev {
        private /* synthetic */ qrf a;

        j(qrf qrf) {
            this.a = qrf;
        }

        public final void run() {
            this.a.f.b();
        }
    }

    public qrf(qro qro, zgb zgb, achb<zjm, zjk> achb, pwc pwc, iqw iqw, qvd qvd, long j, b bVar, int i, qrg qrg) {
        akcr.b(qro, "dataProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(pwc, "conversationManager");
        akcr.b(iqw, "friendApi");
        akcr.b(qvd, "messagingRepository");
        akcr.b(bVar, "addMemberView");
        akcr.b(qrg, "presenterDelegate");
        this.p = qro;
        this.c = achb;
        this.d = pwc;
        this.e = iqw;
        this.q = qvd;
        this.r = j;
        this.f = bVar;
        this.g = i;
        this.h = qrg;
    }

    public final String a(int i) {
        return this.h.a(i);
    }

    public final void a() {
        if (!this.b.getAndSet(true)) {
            Object c = this.h.b.c();
            akcr.a(c, "getSelectionState().toList()");
            Iterable<qqs> iterable = (Iterable) c;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (qqs qqs : iterable) {
                arrayList.add(qqs.a);
            }
            List list = (List) arrayList;
            if ((list.isEmpty() ^ 1) != 0) {
                c = this.q.a(this.r);
                Object c2 = ajdx.c((Callable) new e(this, list));
                akcr.a(c2, "Single.fromCallable {\n  …      }\n                }");
                akcr.a(c, "feedInfo");
                c = ajwc.a((ajeb) c, (ajeb) c2).b((ajdw) this.m.i()).e((ajfc) new d(this));
            } else {
                c = ajvo.a(ajhn.a);
            }
            akcr.a(c, "when {\n            selec…)\n            }\n        }");
            ajej a = c.f(new a(this)).a((ajdw) this.m.l()).a((ajev) new b(this), (ajfb) new c(this));
            akcr.a((Object) a, "completable.doFinally { …show()\n                })");
            ajei ajei = this.i;
            if (ajei == null) {
                akcr.a("disposables");
            }
            ajvv.a(a, ajei);
        }
    }

    public final void a(String str) {
        akcr.b(str, "username");
        this.h.a(str);
    }

    public final void b() {
        this.h.b();
    }

    public final void c() {
        this.h.c();
    }

    public final qrm d() {
        return this.h.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0071  */
    @defpackage.akqq
    public final void onSelectionEvent(defpackage.qrq r3) {
        /*
        r2 = this;
        r0 = "event";
        defpackage.akcr.b(r3, r0);
        r0 = r3.a;
        if (r0 == 0) goto L_0x007a;
    L_0x0009:
        r0 = (defpackage.qsj) r0;
        r3 = r3.b;
        if (r3 != 0) goto L_0x001a;
    L_0x000f:
        r3 = r2.h;
        r3 = r3.b;
        r0 = (defpackage.qsi) r0;
        r1 = 0;
        r3.a(r0, r1);
        goto L_0x0051;
    L_0x001a:
        r3 = r0.h;
        if (r3 != 0) goto L_0x0051;
    L_0x001e:
        r3 = new qrf$h;
        r3.<init>(r2, r0);
        r3 = (java.util.concurrent.Callable) r3;
        r3 = defpackage.ajdx.c(r3);
        r1 = r2.m;
        r1 = r1.i();
        r1 = (defpackage.ajdw) r1;
        r3 = r3.b(r1);
        r1 = r2.m;
        r1 = r1.l();
        r1 = (defpackage.zfr) r1;
        r1 = (defpackage.ajdw) r1;
        r3 = r3.a(r1);
        r1 = new qrf$i;
        r1.<init>(r2, r0);
        r1 = (defpackage.ajfc) r1;
        r3 = r3.e(r1);
        r0 = "Single.fromCallable { pr…  }\n                    }";
        goto L_0x0059;
    L_0x0051:
        r3 = defpackage.ajhn.a;
        r3 = defpackage.ajvo.a(r3);
        r0 = "Completable.complete()";
    L_0x0059:
        defpackage.akcr.a(r3, r0);
        r0 = defpackage.qrf.f.a;
        r0 = (defpackage.ajev) r0;
        r1 = defpackage.qrf.g.a;
        r1 = (defpackage.ajfb) r1;
        r3 = r3.a(r0, r1);
        r0 = "processSelection(event.m…Error selecting item\") })";
        defpackage.akcr.a(r3, r0);
        r0 = r2.i;
        if (r0 != 0) goto L_0x0076;
    L_0x0071:
        r1 = "disposables";
        defpackage.akcr.a(r1);
    L_0x0076:
        defpackage.ajvv.a(r3, r0);
        return;
    L_0x007a:
        r3 = new ajxt;
        r0 = "null cannot be cast to non-null type com.snap.messaging.createchat.ui.viewmodel.ChatSelectionFriendViewModel";
        r3.<init>(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrf.onSelectionEvent(qrq):void");
    }

    public final ajej start() {
        this.i = new ajei();
        ajej start = this.h.start();
        ajei ajei = this.i;
        String str = "disposables";
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        this.f.a(this);
        Context context = this.a.getContext();
        b bVar = this.f;
        String string = context.getString(R.string.add_member_hint_text);
        akcr.a((Object) string, "context.getString(R.string.add_member_hint_text)");
        bVar.a(string);
        this.j = new zkf();
        zkf zkf = this.j;
        String str2 = "bus";
        if (zkf == null) {
            akcr.a(str2);
        }
        zkf.a(this);
        zkf = this.j;
        if (zkf == null) {
            akcr.a(str2);
        }
        start = zkf;
        ajei ajei2 = this.i;
        if (ajei2 == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei2);
        Builder builder = ImmutableList.builder();
        builder.add(new qru());
        a aVar = this;
        builder.add(new qrr(aVar, this.p.e(), this.p.a(this.r), this.n));
        builder.add((Object) new qrs(aVar, this.p.b(), this.p.a(this.r), this.n, this.o));
        ImmutableList build = builder.build();
        zms zms = this.l;
        zkf zkf2 = this.j;
        if (zkf2 == null) {
            akcr.a(str2);
        }
        this.k = new zmg(zms, zkf2.a(), this.m.b(), build);
        zmg zmg = this.k;
        str2 = "adapter";
        if (zmg == null) {
            akcr.a(str2);
        }
        start = zmg.c();
        akcr.a((Object) start, "adapter.subscribe()");
        ajei2 = this.i;
        if (ajei2 == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei2);
        RecyclerView recyclerView = this.a;
        zmg zmg2 = this.k;
        if (zmg2 == null) {
            akcr.a(str2);
        }
        recyclerView.setAdapter(zmg2.a());
        start = ajek.a((ajev) new j(this));
        akcr.a((Object) start, "Disposables.fromAction {…erView.detach()\n        }");
        ajei = this.i;
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        ajei ajei3 = this.i;
        if (ajei3 == null) {
            akcr.a(str);
        }
        return ajei3;
    }
}
