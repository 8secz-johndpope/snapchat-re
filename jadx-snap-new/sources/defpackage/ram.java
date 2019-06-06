package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.igh.b;
import defpackage.yic.a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: ram */
public final class ram extends ajed implements ran {
    private ajws<Boolean> A;
    private ajwl<Boolean> B;
    private final ajxe C;
    private final ajxe D;
    private final prd E;
    private final raf F;
    private final ajdx<prx> G;
    private final ajdx<qxl> H;
    private final ajwy<usd> I;
    private final ajwy<zhn> J;
    private final ajwy<upx> K;
    private final ajwy<pqn> L;
    private final qzm M;
    private final rbn N;
    private final ajwy<iqy> O;
    private final qup P;
    private final ajws<psh> Q;
    private final iqs R;
    private final ajwy<qxc> S;
    private final eyo T;
    final ajei a = new ajei();
    final ajei b = new ajei();
    qwi c;
    rbp d;
    final Context e;
    final qwy f;
    final ajwy<pwc> g;
    final achb<zjm, zjk> h;
    final ajwy<sku> i;
    final ajwy<rcv> j;
    final ajwy<rct> k;
    final qzm l;
    final hmm m;
    final qzs n;
    final ajwy<psm> o;
    final yhl p;
    final ajwy<gqr> q;
    final qzq r;
    final aipn<qxh> s;
    final rah t;
    final ajwy<ihh> u;
    private final ajxe v = ajxh.a(c.a);
    private final ajxe w = ajxh.a(new i(this));
    private final ajxe x = ajxh.a(new ae(this));
    private final ajxe y = ajxh.a(new d(this));
    private final ajxe z;

    /* renamed from: ram$c */
    static final class c extends akcs implements akbk<idd> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return qxo.b.callsite("FriendsFeedEventDispatcher");
        }
    }

    /* renamed from: ram$i */
    static final class i extends akcs implements akbk<rcv> {
        private /* synthetic */ ram a;

        i(ram ram) {
            this.a = ram;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rcv) this.a.j.get();
        }
    }

    /* renamed from: ram$ae */
    static final class ae extends akcs implements akbk<sku> {
        private /* synthetic */ ram a;

        ae(ram ram) {
            this.a = ram;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (sku) this.a.i.get();
        }
    }

    /* renamed from: ram$d */
    static final class d extends akcs implements akbk<rct> {
        private /* synthetic */ ram a;

        d(ram ram) {
            this.a = ram;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            rct rct = (rct) this.a.k.get();
            ajei ajei = this.a.b;
            akcr.b(ajei, "<set-?>");
            rct.g = ajei;
            return rct;
        }
    }

    /* renamed from: ram$ak */
    static final class ak extends akcs implements akbk<zfw> {
        private /* synthetic */ ram a;
        private /* synthetic */ zgb b;

        ak(ram ram, zgb zgb) {
            this.a = ram;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(((idd) this.a.v.b()));
        }
    }

    /* renamed from: ram$b */
    static final class b extends akcs implements akbk<qww> {
        private /* synthetic */ ram a;

        b(ram ram) {
            this.a = ram;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.a.e;
            zfw c = this.a.c();
            ajei ajei = this.a.a;
            Object obj = this.a.g.get();
            akcr.a(obj, "conversationManager.get()");
            return new qww(context, c, ajei, (pwc) obj, this.a.h);
        }
    }

    /* renamed from: ram$a */
    static final class a extends akcs implements akbk<qxh> {
        private /* synthetic */ ram a;

        a(ram ram) {
            this.a = ram;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (qxh) this.a.s.get();
        }
    }

    /* renamed from: ram$k */
    static final class k<V> implements Callable<T> {
        private /* synthetic */ ram a;
        private /* synthetic */ rdt b;

        k(ram ram, rdt rdt) {
            this.a = ram;
            this.b = rdt;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return ajxw.a;
        }
    }

    /* renamed from: ram$o */
    static final class o<V> implements Callable<T> {
        private /* synthetic */ ram a;
        private /* synthetic */ rck b;

        o(ram ram, rck rck) {
            this.a = ram;
            this.b = rck;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.l.c(this.b.a));
        }
    }

    /* renamed from: ram$ab */
    static final class ab<T, R> implements ajfc<T, R> {
        private /* synthetic */ ram a;
        private /* synthetic */ rck b;

        ab(ram ram, rck rck) {
            this.a = ram;
            this.b = rck;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0014 A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0014 A:{SYNTHETIC} */
        /* JADX WARNING: Missing block: B:15:0x005f, code skipped:
            if (r3.longValue() != 0) goto L_0x0080;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r13) {
            /*
            r12 = this;
            r13 = (java.util.List) r13;
            r0 = "storiesList";
            defpackage.akcr.b(r13, r0);
            r13 = (java.lang.Iterable) r13;
            r0 = new java.util.ArrayList;
            r0.<init>();
            r0 = (java.util.Collection) r0;
            r13 = r13.iterator();
        L_0x0014:
            r1 = r13.hasNext();
            if (r1 == 0) goto L_0x00d5;
        L_0x001a:
            r1 = r13.next();
            r1 = (com.snap.core.db.query.LegacyFriendsFeedQueries.PlayableStoryRecord) r1;
            r2 = r12.b;
            r3 = r2.a;
            r3 = r3.T;
            r2 = r2.a;
            r2 = r2.L;
            r4 = r2._id();
            r2 = 0;
            if (r3 == 0) goto L_0x0080;
        L_0x0031:
            r3 = r1.friendStoryUsername();
            r6 = "friendStoryUsername()";
            defpackage.akcr.a(r3, r6);
            r3 = (java.lang.CharSequence) r3;
            r3 = r3.length();
            r7 = 0;
            if (r3 <= 0) goto L_0x0045;
        L_0x0043:
            r3 = 1;
            goto L_0x0046;
        L_0x0045:
            r3 = 0;
        L_0x0046:
            if (r3 == 0) goto L_0x0080;
        L_0x0048:
            r8 = r1.feedId();
            r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            if (r3 == 0) goto L_0x0061;
        L_0x0050:
            r3 = r1.friendStoryIsViewed();
            if (r3 != 0) goto L_0x0057;
        L_0x0056:
            goto L_0x0080;
        L_0x0057:
            r8 = r3.longValue();
            r10 = 0;
            r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
            if (r3 != 0) goto L_0x0080;
        L_0x0061:
            r3 = r1.friendStoryDisplayName();
            if (r3 != 0) goto L_0x006b;
        L_0x0067:
            r3 = r1.friendStoryUsername();
        L_0x006b:
            r4 = "friendStoryDisplayName() ?: friendStoryUsername()";
            defpackage.akcr.a(r3, r4);
            r4 = new yoj$a;
            r5 = r1.friendStoryUsername();
            defpackage.akcr.a(r5, r6);
            r4.<init>(r5, r3, r7);
            r3 = r4;
            r3 = (defpackage.yoj) r3;
            goto L_0x00c0;
        L_0x0080:
            r3 = r1.storyRowId();
            if (r3 == 0) goto L_0x00bf;
        L_0x0086:
            r6 = r1.feedId();
            r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
            if (r3 == 0) goto L_0x009a;
        L_0x008e:
            r3 = r1.storyViewed();
            r4 = java.lang.Boolean.FALSE;
            r3 = defpackage.akcr.a(r3, r4);
            if (r3 == 0) goto L_0x00bf;
        L_0x009a:
            r3 = new yoj$c;
            r4 = r1.storyRowId();
            if (r4 != 0) goto L_0x00a5;
        L_0x00a2:
            defpackage.akcr.a();
        L_0x00a5:
            r5 = "storyRowId()!!";
            defpackage.akcr.a(r4, r5);
            r5 = r4.longValue();
            r7 = r1.storyId();
            r8 = r1.storyUsername();
            r9 = 8;
            r4 = r3;
            r4.<init>(r5, r7, r8, r9);
            r3 = (defpackage.yoj) r3;
            goto L_0x00c0;
        L_0x00bf:
            r3 = r2;
        L_0x00c0:
            if (r3 == 0) goto L_0x00ce;
        L_0x00c2:
            r1 = r1.feedId();
            r1 = java.lang.Long.valueOf(r1);
            r2 = defpackage.ajxs.a(r1, r3);
        L_0x00ce:
            if (r2 == 0) goto L_0x0014;
        L_0x00d0:
            r0.add(r2);
            goto L_0x0014;
        L_0x00d5:
            r0 = (java.util.List) r0;
            r0 = (java.lang.Iterable) r0;
            r13 = defpackage.ajzm.a(r0);
            return r13;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ram$ab.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ram$ac */
    static final class ac<T, R> implements ajfc<T, R> {
        final /* synthetic */ ram a;
        private /* synthetic */ rck b;
        private /* synthetic */ ssi c;

        /* renamed from: ram$ac$1 */
        static final class 1 extends akcs implements akbk<ajxw> {
            private /* synthetic */ ac a;

            1(ac acVar) {
                this.a = acVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.a.a.t.a();
                return ajxw.a;
            }
        }

        ac(ram ram, rck rck, ssi ssi) {
            this.a = ram;
            this.b = rck;
            this.c = ssi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            akcr.b(map, "it");
            if ((map.isEmpty() ^ 1) != 0) {
                this.a.b().e = this.a.c;
                this.a.l.d(this.b.a);
                return this.a.b().a(map, this.b, this.c, (akbk) new 1(this));
            }
            throw new IllegalStateException("Story list is empty");
        }
    }

    /* renamed from: ram$ad */
    static final class ad<T, R> implements ajfc<Throwable, ajej> {
        private /* synthetic */ ram a;

        ad(ram ram) {
            this.a = ram;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            ieg.a("Unable to play stories", true, 0);
            this.a.t.a();
            return ajek.a(ajfu.b);
        }
    }

    /* renamed from: ram$af */
    static final class af<T, R> implements ajfc<T, R> {
        private /* synthetic */ rdt a;

        af(rdt rdt) {
            this.a = rdt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "api");
            return prx.a(this.a.b());
        }
    }

    /* renamed from: ram$ag */
    static final class ag<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final ag a = new ag();

        ag() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "failedMessageId");
            return list;
        }
    }

    /* renamed from: ram$ah */
    static final class ah<T, R> implements ajfc<String, ajdb> {
        private /* synthetic */ ram a;
        private /* synthetic */ rdt b;

        ah(ram ram, rdt rdt) {
            this.a = ram;
            this.b = rdt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "failedMessageId");
            return ((psm) this.a.o.get()).b(str, this.b.b());
        }
    }

    /* renamed from: ram$ai */
    static final class ai implements ajev {
        public static final ai a = new ai();

        ai() {
        }

        public final void run() {
        }
    }

    /* renamed from: ram$al */
    static final class al<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final al a = new al();

        al() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "it");
            return prx.a();
        }
    }

    /* renamed from: ram$e */
    static final class e<T, R> implements ajfc<qxl, ajdb> {
        private /* synthetic */ rcb a;

        e(rcb rcb) {
            this.a = rcb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            qxl qxl = (qxl) obj;
            akcr.b(qxl, "it");
            return qxl.a(this.a.a);
        }
    }

    /* renamed from: ram$f */
    static final class f implements ajev {
        public static final f a = new f();

        f() {
        }

        public final void run() {
        }
    }

    /* renamed from: ram$g */
    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ ram a;
        private /* synthetic */ rdt b;

        g(ram ram, rdt rdt) {
            this.a = ram;
            this.b = rdt;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            gqr gqr = (gqr) this.a.q.get();
            gqt gqt = gqt.NORMAL;
            akcr.a(obj, "it");
            gqr.a(gqt, obj, ((idd) this.a.v.b()));
        }
    }

    /* renamed from: ram$j */
    static final class j<T> implements ajfl<Throwable> {
        private /* synthetic */ ram a;

        j(ram ram) {
            this.a = ram;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((Throwable) obj, "it");
            this.a.t.a();
            return true;
        }
    }

    /* renamed from: ram$m */
    static final class m<T> implements ajfb<qzi> {
        private /* synthetic */ ram a;
        private /* synthetic */ rbz b;

        m(ram ram, rbz rbz) {
            this.a = ram;
            this.b = rbz;
        }

        public final /* synthetic */ void accept(Object obj) {
            qzi qzi = (qzi) obj;
            qxh b = ((qxh) this.a.D.b());
            aakh b2 = this.b.a.b();
            aakg aakg = aakg.TAP;
            long j = (long) qzi.e;
            rbp rbp = this.a.d;
            if (rbp == null) {
                akcr.a();
            }
            b.a(b2, aakg, j, (long) rbp.e, (long) qzi.f);
        }
    }

    /* renamed from: ram$n */
    static final class n<T> implements ajfb<Throwable> {
        public static final n a = new n();

        n() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ram$p */
    static final class p<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ String a;
        private /* synthetic */ ram b;
        private /* synthetic */ rck c;

        p(String str, ram ram, rck rck) {
            this.a = str;
            this.b = ram;
            this.c = rck;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "isPrefetched");
            if (bool.booleanValue()) {
                a = ajvo.a(ajhn.a);
            } else {
                if (this.b.m.f) {
                    this.b.n.a(this.a);
                }
                a = this.b.l.b(this.c.a);
            }
            return a;
        }
    }

    /* renamed from: ram$q */
    static final class q implements ajev {
        private /* synthetic */ String a;
        private /* synthetic */ ram b;
        private /* synthetic */ rck c;

        q(String str, ram ram, rck rck) {
            this.a = str;
            this.b = ram;
            this.c = rck;
        }

        public final void run() {
            if (this.b.m.f) {
                this.b.r.a("");
                this.b.r.a(this.a, a.NOT_STARTED);
            }
        }
    }

    /* renamed from: ram$r */
    static final class r implements ajev {
        private /* synthetic */ String a;
        private /* synthetic */ long b;
        private /* synthetic */ long c;
        private /* synthetic */ ram d;
        private /* synthetic */ rck e;

        r(String str, long j, long j2, ram ram, rck rck) {
            this.a = str;
            this.b = j;
            this.c = j2;
            this.d = ram;
            this.e = rck;
        }

        public final void run() {
            if (this.d.m.f) {
                this.d.n.a(this.a);
            }
            ram ram = this.d;
            rck rck = this.e;
            long j = this.b;
            long j2 = this.c;
            in.a("");
            try {
                if (ram.t.a(rak.PLAY_STORY)) {
                    psa psa = new psa(aahb.FEED, aajy.STORY, rck.a.c() == FeedKind.GROUP ? aajz.GROUP_STORY : aajz.USER_STORY, null);
                    ssi[] ssiArr = new ssi[2];
                    sku a = ram.a();
                    akcr.a((Object) a, "playbackPerformanceAnalytics");
                    ssiArr[0] = new sks(a, aaug.TAP, j, j2, psa);
                    ssiArr[1] = ram.p.a(((ihh) ram.u.get()).a(), aahb.FEED, (fvk) ram.b().f.b());
                    Object g = ram.f.a(rck.a.L._id()).f(new ab(ram, rck)).a((ajdw) ram.c().h()).f(new ac(ram, rck, new ssi.a(ssiArr))).g(new ad(ram));
                    akcr.a(g, "friendsFeedDataProvider.…empty()\n                }");
                    ajfo ajfo = ram.a;
                    akcr.b(g, "receiver$0");
                    akcr.b(ajfo, "container");
                    AtomicReference atomicReference = new AtomicReference(null);
                    Object b = g.b((ajfb) new igh.a(atomicReference, ajfo)).b((ajev) new b(atomicReference, ajfo));
                    akcr.a(b, "this.doOnSubscribe {\n   …ntainer.delete(it)}\n    }");
                    b.c();
                    in.a();
                }
            } finally {
                in.a();
            }
        }
    }

    /* renamed from: ram$s */
    static final class s<T> implements ajfb<Throwable> {
        private /* synthetic */ ram a;
        private /* synthetic */ rck b;

        s(ram ram, rck rck) {
            this.a = ram;
            this.b = rck;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.t.a();
        }
    }

    /* renamed from: ram$t */
    static final class t<T> implements ajfb<qzi> {
        private /* synthetic */ ram a;
        private /* synthetic */ rca b;

        t(ram ram, rca rca) {
            this.a = ram;
            this.b = rca;
        }

        public final /* synthetic */ void accept(Object obj) {
            qzi qzi = (qzi) obj;
            qxh b = ((qxh) this.a.D.b());
            aakh b2 = this.b.a.b();
            aakg aakg = aakg.EXIT;
            long j = (long) qzi.e;
            rbp rbp = this.a.d;
            if (rbp == null) {
                akcr.a();
            }
            b.a(b2, aakg, j, (long) rbp.e, (long) qzi.f);
        }
    }

    /* renamed from: ram$u */
    static final class u<T> implements ajfb<Throwable> {
        public static final u a = new u();

        u() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ram$w */
    static final class w<T, R> implements ajfc<T, R> {
        private /* synthetic */ rcl a;

        w(rcl rcl) {
            this.a = rcl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "api");
            return prx.a(this.a.a.a);
        }
    }

    /* renamed from: ram$x */
    static final class x<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final x a = new x();

        x() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "messageId");
            return list;
        }
    }

    /* renamed from: ram$y */
    static final class y<T, R> implements ajfc<String, ajdb> {
        private /* synthetic */ ram a;
        private /* synthetic */ rcl b;

        y(ram ram, rcl rcl) {
            this.a = ram;
            this.b = rcl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return ((psm) this.a.o.get()).b(str, this.b.a.a);
        }
    }

    /* renamed from: ram$z */
    static final class z implements ajev {
        private /* synthetic */ rcl a;

        z(rcl rcl) {
            this.a = rcl;
        }

        public final void run() {
        }
    }

    /* renamed from: ram$h */
    static final class h extends akcs implements akbk<ajxw> {
        private /* synthetic */ ram a;
        private /* synthetic */ rcd b;
        private /* synthetic */ long c;
        private /* synthetic */ long d;

        h(ram ram, rcd rcd, long j, long j2) {
            this.a = ram;
            this.b = rcd;
            this.c = j;
            this.d = j2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.t.a();
            return ajxw.a;
        }
    }

    /* renamed from: ram$l */
    static final class l extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ ram a;
        private /* synthetic */ rcd b;

        l(ram ram, rcd rcd) {
            this.a = ram;
            this.b = rcd;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a(this.b, ((Boolean) obj).booleanValue());
            return ajxw.a;
        }
    }

    /* renamed from: ram$v */
    static final class v extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ ram a;
        private /* synthetic */ rcf b;

        v(ram ram, rcf rcf) {
            this.a = ram;
            this.b = rcf;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a(this.b, ((Boolean) obj).booleanValue());
            return ajxw.a;
        }
    }

    /* renamed from: ram$aa */
    static final class aa extends akcq implements akbl<Throwable, ajxw> {
        aa(ram ram) {
            super(1, ram);
        }

        public final String getName() {
            return "onSendRetryError";
        }

        public final akej getOwner() {
            return akde.a(ram.class);
        }

        public final String getSignature() {
            return "onSendRetryError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            return ajxw.a;
        }
    }

    /* renamed from: ram$aj */
    static final class aj extends akcq implements akbl<Throwable, ajxw> {
        aj(ram ram) {
            super(1, ram);
        }

        public final String getName() {
            return "onSendRetryError";
        }

        public final akej getOwner() {
            return akde.a(ram.class);
        }

        public final String getSignature() {
            return "onSendRetryError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ram.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(ram.class), "messagingOperaViewer", "getMessagingOperaViewer()Lcom/snap/messaging/friendsfeed/ui/opera/Opera2MessagingViewer;"), new akdc(akde.a(ram.class), "playbackPerformanceAnalytics", "getPlaybackPerformanceAnalytics()Lcom/snap/opera/extensions/api/analytics/PlaybackPerformanceAnalytics;"), new akdc(akde.a(ram.class), "feedOperaViewer", "getFeedOperaViewer()Lcom/snap/messaging/friendsfeed/ui/opera/Opera2FeedStoryViewer;"), new akdc(akde.a(ram.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ram.class), "blockedUserAlertHandler", "getBlockedUserAlertHandler()Lcom/snap/messaging/friendsfeed/BlockedUserAlertHandler;"), new akdc(akde.a(ram.class), LocalMessageActionModel.ANALYTICS, "getAnalytics()Lcom/snap/messaging/friendsfeed/analytics/ScalableFeedHeaderPromptAnalytics;")};
    }

    public ram(Context context, zgb zgb, qwy qwy, ajwy<pwc> ajwy, achb<zjm, zjk> achb, prd prd, raf raf, ajwy<sku> ajwy2, ajwy<rcv> ajwy3, ajwy<rct> ajwy4, ajdx<prx> ajdx, ajdx<qxl> ajdx2, ajwy<usd> ajwy5, ajwy<zhn> ajwy6, ajwy<upx> ajwy7, ajwy<pqn> ajwy8, qzm qzm, qzm qzm2, hmm hmm, qzs qzs, rbn rbn, ajwy<psm> ajwy9, ajwy<iqy> ajwy10, qup qup, ajws<psh> ajws, iqs iqs, yhl yhl, ajwy<qxc> ajwy11, ajwy<gqr> ajwy12, eyo eyo, qzq qzq, aipn<qxh> aipn, rah rah, ajwy<ihh> ajwy13) {
        Context context2 = context;
        zgb zgb2 = zgb;
        qwy qwy2 = qwy;
        ajwy<pwc> ajwy14 = ajwy;
        achb<zjm, zjk> achb2 = achb;
        prd prd2 = prd;
        raf raf2 = raf;
        ajwy<sku> ajwy15 = ajwy2;
        ajwy<rcv> ajwy16 = ajwy3;
        ajwy<rct> ajwy17 = ajwy4;
        ajdx<prx> ajdx3 = ajdx;
        ajdx<qxl> ajdx4 = ajdx2;
        ajwy<usd> ajwy18 = ajwy5;
        ajwy<zhn> ajwy19 = ajwy6;
        ajwy<upx> ajwy20 = ajwy7;
        ajwy<pqn> ajwy21 = ajwy8;
        akcr.b(context2, "appContext");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(qwy2, "friendsFeedDataProvider");
        akcr.b(ajwy14, "conversationManager");
        akcr.b(achb2, "navigationHost");
        akcr.b(prd2, "feedNavTracker");
        akcr.b(raf2, "tooltipRepository");
        akcr.b(ajwy15, "playbackPerformanceAnalyticsProvider");
        akcr.b(ajwy16, "opera2MessagingViewer");
        akcr.b(ajwy17, "opera2FeedStoryViewer");
        akcr.b(ajdx3, "messagingApi");
        akcr.b(ajdx4, "friendsFeedApi");
        akcr.b(ajwy18, "unifiedProfileLauncher");
        akcr.b(ajwy19, "actionMenuLauncher");
        akcr.b(ajwy20, "profileActionMenuDataProvider");
        akcr.b(ajwy8, "chatLauncher");
        akcr.b(qzm, "chatSnapFetcher");
        akcr.b(qzm2, "storySnapFetcher");
        akcr.b(hmm, "storyPrefetchConfiguration");
        akcr.b(qzs, "storyPrefetcher");
        akcr.b(rbn, "topPromptClickHandler");
        akcr.b(ajwy9, "sendMessageApi");
        akcr.b(ajwy10, "friendingApi");
        akcr.b(qup, "friendsFeedSnapDbLogger");
        akcr.b(ajws, "quickReplyEventSubject");
        akcr.b(iqs, "friendActionDispatcher");
        akcr.b(yhl, "storySnapOperaAnalyticsFactory");
        akcr.b(ajwy11, "friendsFeedMetricsController");
        akcr.b(ajwy12, "exceptionTracker");
        akcr.b(eyo, "cognacFragmentService");
        akcr.b(qzq, "fetchStoryStateStore");
        akcr.b(aipn, "analyticsLazy");
        akcr.b(rah, "clickGuard");
        akcr.b(ajwy13, "clockProvider");
        ajwy<pqn> ajwy22 = ajwy8;
        this.e = context2;
        this.f = qwy2;
        this.g = ajwy14;
        this.h = achb2;
        this.E = prd2;
        this.F = raf2;
        this.i = ajwy15;
        this.j = ajwy16;
        this.k = ajwy17;
        this.G = ajdx3;
        this.H = ajdx4;
        this.I = ajwy18;
        this.J = ajwy19;
        this.K = ajwy20;
        this.L = ajwy22;
        qzm qzm3 = qzm2;
        this.M = qzm;
        this.l = qzm3;
        qzs qzs2 = qzs;
        this.m = hmm;
        this.n = qzs2;
        ajwy<psm> ajwy23 = ajwy9;
        this.N = rbn;
        this.o = ajwy23;
        qup qup2 = qup;
        this.O = ajwy10;
        this.P = qup2;
        iqs iqs2 = iqs;
        this.Q = ajws;
        this.R = iqs2;
        ajwy<qxc> ajwy24 = ajwy11;
        this.p = yhl;
        this.S = ajwy24;
        eyo eyo2 = eyo;
        this.q = ajwy12;
        this.T = eyo2;
        aipn<qxh> aipn2 = aipn;
        this.r = qzq;
        this.s = aipn2;
        ajwy<ihh> ajwy25 = ajwy13;
        this.t = rah;
        this.u = ajwy25;
        this.z = ajxh.a(new ak(this, zgb));
        Object i = ajwl.i(Boolean.FALSE);
        String str = "BehaviorSubject.createDefault(false)";
        akcr.a(i, str);
        this.A = (ajws) i;
        i = ajwl.i(Boolean.FALSE);
        akcr.a(i, str);
        this.B = i;
        this.C = ajxh.a(new b(this));
        this.D = ajxh.a(new a(this));
    }

    private final ajej a(rcd rcd, long j, long j2) {
        rcd rcd2 = rcd;
        String str = "";
        in.a(str);
        try {
            aahb aahb = aahb.FEED;
            aajy aajy = aajy.CHAT;
            aajz aajz = aajz.DIRECT_CHAT_SNAP;
            String e = rcd2.a.e();
            if (e != null) {
                str = e;
            }
            psa psa = new psa(aahb, aajy, aajz, str);
            Object a = a();
            akcr.a(a, "playbackPerformanceAnalytics");
            sks sks = new sks(a, aaug.TAP, j, j2, psa);
            i().e = this.c;
            Object obj = (Boolean) this.B.p();
            if (obj == null) {
                obj = Boolean.FALSE;
            }
            akcr.a(obj, "isPrefetchSnapStackInOperaEnabled.value ?: false");
            ajej a2 = i().a(rcd2, sks, obj.booleanValue(), new h(this, rcd, j, j2));
            return a2;
        } finally {
            in.a();
        }
    }

    private final void a(rdt rdt, gcn gcn) {
        pri pri;
        if (rdt.L.isGroup()) {
            pri = new pri(rdt.b(), rdt.m(), gcn);
        } else if (rdt.t == null) {
            ieg.a("Failed to launch reply Camera, please shake2Report.", true, 0);
            return;
        } else {
            String str = rdt.o;
            if (str == null) {
                str = "";
            }
            pri = new psv(str, rdt.t, rdt.m(), gcn);
        }
        this.Q.a((Object) new psh(pri, null, null, false, null, 28));
    }

    private final boolean a(rdt rdt) {
        qwi qwi = this.c;
        if (qwi == null || !qwi.a(rdt.L._id())) {
            qwi = this.c;
            if ((qwi == null || !qwi.b(rdt.L._id())) && !rdt.l.a()) {
                return false;
            }
        }
        return true;
    }

    private final void b(rdt rdt) {
        if (this.t.a(rak.OPEN_CHAT)) {
            abmr.a();
            ajcx a = ((pqn) this.L.get()).b(rdt.L._id(), abbd.CHAT).a((ajfl) new j(this));
            akcr.a((Object) a, "chatLauncher.get().launc…   true\n                }");
            igh.a(a, (ajfo) this.a).e();
            ajdp b = ajdp.b((Callable) new k(this, rdt)).b((ajdw) c().b());
            akcr.a((Object) b, "Observable.fromCallable …schedulers.computation())");
            igh.a(b, (ajfo) this.a).l();
        }
    }

    private static usq c(rdt rdt) {
        String valueOf;
        usg usg = rdt.L.isGroup() ? usg.GROUP_PROFILE : usg.FRIEND_PROFILE;
        if (rdt.L.isGroup()) {
            valueOf = String.valueOf(rdt.L._id());
        } else {
            valueOf = rdt.t;
            if (valueOf == null) {
                akcr.a();
            }
        }
        return new usq(usg, valueOf, null, abbd.FEED, null, 20);
    }

    private final rcv i() {
        return (rcv) this.w.b();
    }

    private final qww j() {
        return (qww) this.C.b();
    }

    public final ajcx a(rcb rcb) {
        akcr.b(rcb, "event");
        Object e = this.H.e((ajfc) new e(rcb));
        akcr.a(e, "friendsFeedApi.flatMapCo….friendsFeedUpdateType) }");
        return e;
    }

    /* Access modifiers changed, original: final */
    public final sku a() {
        return (sku) this.x.b();
    }

    public final void a(ajwl<Boolean> ajwl) {
        akcr.b(ajwl, "<set-?>");
        this.B = ajwl;
    }

    public final void a(ajws<Boolean> ajws) {
        akcr.b(ajws, "<set-?>");
        this.A = ajws;
    }

    public final void a(isi isi) {
        akcr.b(isi, "event");
    }

    public final void a(isk isk) {
        akcr.b(isk, "event");
    }

    public final void a(isr isr) {
        akcr.b(isr, "event");
        ((usd) this.I.get()).a(new usq(usg.FRIEND_PROFILE, isr.a, null, abbd.FEED, null, 20));
    }

    public final void a(isu isu) {
        akcr.b(isu, "event");
        this.R.a(isu);
        this.A.a((Object) Boolean.FALSE);
    }

    public final void a(qwi qwi) {
        this.c = qwi;
    }

    public final void a(rbp rbp) {
        this.d = rbp;
    }

    public final void a(rby rby) {
        akcr.b(rby, "event");
    }

    /* JADX WARNING: Missing block: B:8:0x003d, code skipped:
            android.widget.Toast.makeText(r0, r1, 1).show();
     */
    /* JADX WARNING: Missing block: B:25:0x0179, code skipped:
            defpackage.akcr.a((java.lang.Object) r2, r3);
            r0.a(r1, r2, null);
     */
    /* JADX WARNING: Missing block: B:26:0x017f, code skipped:
            r0 = r9.d;
     */
    /* JADX WARNING: Missing block: B:27:0x0181, code skipped:
            if (r0 != null) goto L_0x0186;
     */
    /* JADX WARNING: Missing block: B:28:0x0183, code skipped:
            defpackage.akcr.a();
     */
    /* JADX WARNING: Missing block: B:29:0x0186, code skipped:
            r0.i.a((defpackage.ajdw) c().f()).c(1).a((defpackage.ajfb) new defpackage.ram.m(r9, r10), (defpackage.ajfb) defpackage.ram.n.a);
     */
    /* JADX WARNING: Missing block: B:30:0x01aa, code skipped:
            return;
     */
    public final void a(defpackage.rbz r10) {
        /*
        r9 = this;
        r0 = "event";
        defpackage.akcr.b(r10, r0);
        r0 = r9.d;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        if (r0 != 0) goto L_0x000f;
    L_0x000c:
        defpackage.akcr.a();
    L_0x000f:
        r1 = r10.a;
        r0.a(r1);
        r0 = r9.N;
        r1 = r10.a;
        r2 = "promptType";
        defpackage.akcr.b(r1, r2);
        r2 = defpackage.rbo.a;
        r3 = r1.ordinal();
        r2 = r2[r3];
        r3 = 1;
        r4 = 0;
        switch(r2) {
            case 1: goto L_0x0145;
            case 2: goto L_0x0123;
            case 3: goto L_0x00f9;
            case 4: goto L_0x00cd;
            case 5: goto L_0x004d;
            case 6: goto L_0x0048;
            default: goto L_0x002a;
        };
    L_0x002a:
        r0 = r0.a;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r1);
        r1 = " prompts not expected";
        r2.append(r1);
        r1 = r2.toString();
    L_0x003d:
        r1 = (java.lang.CharSequence) r1;
        r0 = android.widget.Toast.makeText(r0, r1, r3);
        r0.show();
        goto L_0x017f;
    L_0x0048:
        r0 = r0.a;
        r1 = "TODO: Create suicide prevention fragment";
        goto L_0x003d;
    L_0x004d:
        r1 = r0.a;
        r1 = defpackage.gr.a(r1);
        r1 = r1.b();
        if (r1 == 0) goto L_0x0066;
    L_0x0059:
        r1 = r0.a;
        r0 = r0.f;
        r0 = r0.a();
        r1.startActivity(r0);
        goto L_0x017f;
    L_0x0066:
        r1 = new android.content.Intent;
        r1.<init>();
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 21;
        if (r2 < r3) goto L_0x00a1;
    L_0x0071:
        r2 = "android.settings.APP_NOTIFICATION_SETTINGS";
        r1.setAction(r2);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 26;
        if (r2 < r3) goto L_0x0088;
    L_0x007c:
        r2 = r0.a;
        r2 = r2.getPackageName();
        r3 = "android.provider.extra.APP_PACKAGE";
        r1.putExtra(r3, r2);
        goto L_0x00c6;
    L_0x0088:
        r2 = r0.a;
        r2 = r2.getPackageName();
        r3 = "app_package";
        r1.putExtra(r3, r2);
        r2 = r0.a;
        r2 = r2.getApplicationInfo();
        r2 = r2.uid;
        r3 = "app_uid";
        r1.putExtra(r3, r2);
        goto L_0x00c6;
    L_0x00a1:
        r2 = "android.settings.APPLICATION_DETAILS_SETTINGS";
        r1.setAction(r2);
        r2 = "android.intent.category.DEFAULT";
        r1.addCategory(r2);
        r2 = new java.lang.StringBuilder;
        r3 = "package:";
        r2.<init>(r3);
        r3 = r0.a;
        r3 = r3.getPackageName();
        r2.append(r3);
        r2 = r2.toString();
        r2 = android.net.Uri.parse(r2);
        r1.setData(r2);
    L_0x00c6:
        r0 = r0.a;
        r0.startActivity(r1);
        goto L_0x017f;
    L_0x00cd:
        r1 = new zjf;
        r2 = defpackage.irc.g;
        r3 = new com.snap.identity.ui.profile.ContactsFragment;
        r3.<init>();
        r3 = (com.snap.ui.deck.MainPageFragment) r3;
        r5 = defpackage.acgv.a();
        r6 = defpackage.irc.i;
        r5 = r5.a(r6);
        r5 = r5.a();
        r1.<init>(r2, r3, r5);
        r0 = r0.c;
        r0 = r0.get();
        r0 = (defpackage.achb) r0;
        r1 = (defpackage.achd) r1;
        r2 = defpackage.irc.h;
        r3 = "IdentityFeature.PROFILE_…_CONTACTS_PRESENT_DEFAULT";
        goto L_0x0179;
    L_0x00f9:
        r1 = new zjf;
        r2 = defpackage.itz.a;
        r3 = r0.b;
        r3 = r3.c();
        r5 = defpackage.acgv.a();
        r6 = defpackage.itz.c;
        r5 = r5.a(r6);
        r5 = r5.a();
        r1.<init>(r2, r3, r5);
        r0 = r0.c;
        r0 = r0.get();
        r0 = (defpackage.achb) r0;
        r1 = (defpackage.achd) r1;
        r2 = defpackage.itz.b;
        r3 = "SettingsEmailFeature.SET…NGS_EMAIL_PRESENT_DEFAULT";
        goto L_0x0179;
    L_0x0123:
        r1 = r0.d;
        r1 = r1.get();
        r2 = r1;
        r2 = (defpackage.iqy) r2;
        r0 = r0.c;
        r0 = r0.get();
        r1 = "navHost.get()";
        defpackage.akcr.a(r0, r1);
        r3 = r0;
        r3 = (defpackage.achb) r3;
        r4 = 0;
        r5 = 1;
        r6 = defpackage.ith.TOP_PROMPT_ON_FRIENDS_FEED;
        r7 = 0;
        r8 = 18;
        defpackage.iqy.a.a(r2, r3, r4, r5, r6, r7, r8);
        goto L_0x017f;
    L_0x0145:
        r1 = r0.e;
        r2 = defpackage.jic.ENABLE_BIRTHDAY_PARTY;
        r2 = (defpackage.fth) r2;
        r3 = java.lang.Boolean.TRUE;
        r1.a(r2, r3);
        r1 = new zjf;
        r2 = defpackage.itw.a;
        r3 = r0.b;
        r3 = r3.b();
        r5 = defpackage.acgv.a();
        r6 = defpackage.itw.c;
        r5 = r5.a(r6);
        r5 = r5.a();
        r1.<init>(r2, r3, r5);
        r0 = r0.c;
        r0 = r0.get();
        r0 = (defpackage.achb) r0;
        r1 = (defpackage.achd) r1;
        r2 = defpackage.itw.b;
        r3 = "SettingsBirthdayFeature.…_BIRTHDAY_PRESENT_DEFAULT";
    L_0x0179:
        defpackage.akcr.a(r2, r3);
        r0.a(r1, r2, r4);
    L_0x017f:
        r0 = r9.d;
        if (r0 != 0) goto L_0x0186;
    L_0x0183:
        defpackage.akcr.a();
    L_0x0186:
        r0 = r0.i;
        r1 = r9.c();
        r1 = r1.f();
        r1 = (defpackage.ajdw) r1;
        r0 = r0.a(r1);
        r1 = 1;
        r0 = r0.c(r1);
        r1 = new ram$m;
        r1.<init>(r9, r10);
        r1 = (defpackage.ajfb) r1;
        r10 = defpackage.ram.n.a;
        r10 = (defpackage.ajfb) r10;
        r0.a(r1, r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ram.a(rbz):void");
    }

    public final void a(rca rca) {
        akcr.b(rca, "event");
        rbp rbp = this.d;
        if (rbp != null) {
            if (rbp == null) {
                akcr.a();
            }
            rbp.a(rca.a);
            rbp = this.d;
            if (rbp == null) {
                akcr.a();
            }
            rbp.i.a((ajdw) c().f()).c(1).a((ajfb) new t(this, rca), (ajfb) u.a);
        }
    }

    public final void a(rcc rcc) {
        akcr.b(rcc, "event");
        ((usd) this.I.get()).a(ram.c(rcc.a));
    }

    public final void a(rcd rcd) {
        akcr.b(rcd, "event");
        if (rcd.a.L.isGroup()) {
            j().a(rcd.a, new l(this, rcd));
        } else {
            a(rcd, false);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:40:0x0112 in {4, 9, 12, 13, 18, 19, 23, 25, 26, 32, 34, 36, 39} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final void a(defpackage.rcd r10, boolean r11) {
        /*
        r9 = this;
        r0 = "";
        defpackage.in.a(r0);
        r0 = r9.a();	 Catch:{ all -> 0x010d }
        r3 = r0.b();	 Catch:{ all -> 0x010d }
        r0 = r9.a();	 Catch:{ all -> 0x010d }
        r5 = r0.c();	 Catch:{ all -> 0x010d }
        r0 = r10.a;	 Catch:{ all -> 0x010d }
        r1 = r9.F;	 Catch:{ all -> 0x010d }
        r2 = defpackage.rag.FEED_SNAP_TOOLTIP;	 Catch:{ all -> 0x010d }
        r7 = "tooltipType";	 Catch:{ all -> 0x010d }
        defpackage.akcr.b(r2, r7);	 Catch:{ all -> 0x010d }
        r7 = r1.b;	 Catch:{ all -> 0x010d }
        r8 = r2.configurationKey;	 Catch:{ all -> 0x010d }
        r7.a(r8);	 Catch:{ all -> 0x010d }
        r1 = r1.a;	 Catch:{ all -> 0x010d }
        r1.a(r2);	 Catch:{ all -> 0x010d }
        if (r11 == 0) goto L_0x0033;	 Catch:{ all -> 0x010d }
        r9.b(r0);	 Catch:{ all -> 0x010d }
        goto L_0x0109;	 Catch:{ all -> 0x010d }
        r11 = r0.e;	 Catch:{ all -> 0x010d }
        if (r11 != 0) goto L_0x002e;	 Catch:{ all -> 0x010d }
        r11 = r0.k;	 Catch:{ all -> 0x010d }
        if (r11 == 0) goto L_0x003c;	 Catch:{ all -> 0x010d }
        goto L_0x002e;	 Catch:{ all -> 0x010d }
        r11 = r0.l;	 Catch:{ all -> 0x010d }
        r11 = r11.h();	 Catch:{ all -> 0x010d }
        r1 = 0;	 Catch:{ all -> 0x010d }
        if (r11 == 0) goto L_0x009d;	 Catch:{ all -> 0x010d }
        r10 = r9.G;	 Catch:{ all -> 0x010d }
        r11 = new ram$af;	 Catch:{ all -> 0x010d }
        r11.<init>(r0);	 Catch:{ all -> 0x010d }
        r11 = (defpackage.ajfc) r11;	 Catch:{ all -> 0x010d }
        r10 = r10.f(r11);	 Catch:{ all -> 0x010d }
        r10 = r10.i();	 Catch:{ all -> 0x010d }
        r11 = defpackage.ram.ag.a;	 Catch:{ all -> 0x010d }
        r11 = (defpackage.ajfc) r11;	 Catch:{ all -> 0x010d }
        r10 = r10.l(r11);	 Catch:{ all -> 0x010d }
        r11 = new ram$ah;	 Catch:{ all -> 0x010d }
        r11.<init>(r9, r0);	 Catch:{ all -> 0x010d }
        r11 = (defpackage.ajfc) r11;	 Catch:{ all -> 0x010d }
        r10 = r10.a(r11, r1);	 Catch:{ all -> 0x010d }
        r11 = r9.c();	 Catch:{ all -> 0x010d }
        r11 = r11.f();	 Catch:{ all -> 0x010d }
        r11 = (defpackage.ajdw) r11;	 Catch:{ all -> 0x010d }
        r10 = r10.b(r11);	 Catch:{ all -> 0x010d }
        r11 = "messagingApi\n           …scribeOn(schedulers.io())";	 Catch:{ all -> 0x010d }
        defpackage.akcr.a(r10, r11);	 Catch:{ all -> 0x010d }
        r11 = r9.a;	 Catch:{ all -> 0x010d }
        r11 = (defpackage.ajfo) r11;	 Catch:{ all -> 0x010d }
        r10 = defpackage.igh.a(r10, r11);	 Catch:{ all -> 0x010d }
        r11 = defpackage.ram.ai.a;	 Catch:{ all -> 0x010d }
        r11 = (defpackage.ajev) r11;	 Catch:{ all -> 0x010d }
        r0 = new ram$aj;	 Catch:{ all -> 0x010d }
        r1 = r9;	 Catch:{ all -> 0x010d }
        r1 = (defpackage.ram) r1;	 Catch:{ all -> 0x010d }
        r0.<init>(r1);	 Catch:{ all -> 0x010d }
        r0 = (defpackage.akbl) r0;	 Catch:{ all -> 0x010d }
        r1 = new rao;	 Catch:{ all -> 0x010d }
        r1.<init>(r0);	 Catch:{ all -> 0x010d }
        r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x010d }
        r10.a(r11, r1);	 Catch:{ all -> 0x010d }
        goto L_0x0109;	 Catch:{ all -> 0x010d }
        r11 = r0.l;	 Catch:{ all -> 0x010d }
        r11 = r11.a();	 Catch:{ all -> 0x010d }
        r2 = 1;	 Catch:{ all -> 0x010d }
        if (r11 == 0) goto L_0x00b0;	 Catch:{ all -> 0x010d }
        r11 = r9.M;	 Catch:{ all -> 0x010d }
        r11 = r11.c(r0);	 Catch:{ all -> 0x010d }
        if (r11 != 0) goto L_0x00b0;	 Catch:{ all -> 0x010d }
        r11 = 1;	 Catch:{ all -> 0x010d }
        goto L_0x00b1;	 Catch:{ all -> 0x010d }
        r11 = 0;	 Catch:{ all -> 0x010d }
        if (r11 == 0) goto L_0x00e3;	 Catch:{ all -> 0x010d }
        r10 = r9.S;	 Catch:{ all -> 0x010d }
        r10 = r10.get();	 Catch:{ all -> 0x010d }
        r10 = (defpackage.qxc) r10;	 Catch:{ all -> 0x010d }
        r11 = defpackage.qwz.LOAD;	 Catch:{ all -> 0x010d }
        r10.a(r11);	 Catch:{ all -> 0x010d }
        r10 = r0.v;	 Catch:{ all -> 0x010d }
        if (r10 != 0) goto L_0x00c5;	 Catch:{ all -> 0x010d }
        r1 = 1;	 Catch:{ all -> 0x010d }
        if (r1 == 0) goto L_0x00c9;	 Catch:{ all -> 0x010d }
        goto L_0x002e;	 Catch:{ all -> 0x010d }
        r10 = r9.M;	 Catch:{ all -> 0x010d }
        r10 = r10.b(r0);	 Catch:{ all -> 0x010d }
        r11 = r9.a;	 Catch:{ all -> 0x010d }
        r11 = (defpackage.ajfo) r11;	 Catch:{ all -> 0x010d }
        r10 = defpackage.igh.a(r10, r11);	 Catch:{ all -> 0x010d }
        r11 = defpackage.ram.f.a;	 Catch:{ all -> 0x010d }
        r11 = (defpackage.ajev) r11;	 Catch:{ all -> 0x010d }
        r1 = new ram$g;	 Catch:{ all -> 0x010d }
        r1.<init>(r9, r0);	 Catch:{ all -> 0x010d }
        r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x010d }
        goto L_0x0099;	 Catch:{ all -> 0x010d }
        r11 = r9.a(r0);	 Catch:{ all -> 0x010d }
        if (r11 == 0) goto L_0x002e;	 Catch:{ all -> 0x010d }
        r11 = r9.t;	 Catch:{ all -> 0x010d }
        r0 = defpackage.rak.PLAY_SNAP;	 Catch:{ all -> 0x010d }
        r11 = r11.a(r0);	 Catch:{ all -> 0x010d }
        if (r11 != 0) goto L_0x00f7;
        defpackage.in.a();
        return;
        r11 = r9.S;	 Catch:{ all -> 0x010d }
        r11 = r11.get();	 Catch:{ all -> 0x010d }
        r11 = (defpackage.qxc) r11;	 Catch:{ all -> 0x010d }
        r0 = defpackage.qwz.VIEW;	 Catch:{ all -> 0x010d }
        r11.a(r0);	 Catch:{ all -> 0x010d }
        r1 = r9;	 Catch:{ all -> 0x010d }
        r2 = r10;	 Catch:{ all -> 0x010d }
        r1.a(r2, r3, r5);	 Catch:{ all -> 0x010d }
        defpackage.in.a();
        return;
        r10 = move-exception;
        defpackage.in.a();
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ram.a(rcd, boolean):void");
    }

    public final void a(rce rce) {
        akcr.b(rce, "event");
        fgk fgk = rce.a.j;
        if (fgk != null) {
            this.T.a(fgk.c, fgk.e, fgk.f, fgk.d, fgk.i, fgk.g, "CONVERSATION", ImmutableList.of(), eza.COGNAC_OPENED_FROM_FEED);
        }
    }

    public final void a(rcf rcf) {
        akcr.b(rcf, "event");
        if (rcf.a.L.isGroup()) {
            j().a(rcf.a, new v(this, rcf));
        } else {
            a(rcf, false);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(rcf rcf, boolean z) {
        if (z) {
            b(rcf.a);
        } else if (a(rcf.a)) {
            if (this.t.a(rak.PLAY_SNAP)) {
                ((qxc) this.S.get()).a(qwz.VIEW);
                a(new rcd(rcf.a, rcf.b), a().b(), a().c());
            }
        } else if (rcf.a.l.i()) {
            b(rcf.a);
        } else {
            a(rcf.a, gcn.FEED_DOUBLE_TAP);
        }
    }

    public final void a(rcg rcg) {
        akcr.b(rcg, "event");
        a(rcg.a, gcn.FEED_REPLY_BUTTON);
    }

    public final void a(rch rch) {
        akcr.b(rch, "event");
        iqy.a.a((iqy) this.O.get(), this.h, 0, true, ith.ADD_FRIENDS_CTA_BUTTON_ON_FRIENDS_FEED, null, 18);
    }

    public final void a(rci rci) {
        akcr.b(rci, "event");
        this.E.b = new pqh(rci.a, rci.b, rci.c == FeedKind.GROUP);
        this.E.d = true;
    }

    public final void a(rcj rcj) {
        rcj rcj2 = rcj;
        akcr.b(rcj2, "event");
        qwi qwi = this.c;
        iin iin = null;
        if (qwi != null) {
            long _id = rcj2.a.L._id();
            if (qwi.j.get(Long.valueOf(_id)) != null) {
                qwl qwl = (qwl) qwi.j.get(Long.valueOf(_id));
                if (qwl != null && qwl.c) {
                    qwl = (qwl) qwi.j.get(Long.valueOf(_id));
                    if (qwl != null) {
                        qwl.d = true;
                        qwl.c = false;
                        qwl.a = false;
                    }
                    Set<Number> set = (Set) qwi.n.get(Long.valueOf(_id));
                    if (set != null) {
                        for (Number longValue : set) {
                            long longValue2 = longValue.longValue();
                            qwl qwl2 = (qwl) qwi.o.get(Long.valueOf(longValue2));
                            if (qwl2 != null && qwl2.c) {
                                qwl2 = (qwl) qwi.o.get(Long.valueOf(longValue2));
                                if (qwl2 != null) {
                                    qwl2.c = false;
                                }
                                qwl qwl3 = (qwl) qwi.o.get(Long.valueOf(longValue2));
                                if (qwl3 != null) {
                                    qwl3.d = true;
                                }
                            }
                        }
                    }
                    qwi.b();
                    qwl = (qwl) qwi.j.get(Long.valueOf(_id));
                    if (qwl != null && qwl.d) {
                        rge rge = (rge) qwi.i.get(Long.valueOf(_id));
                        if (rge != null) {
                            iin = rge.a;
                        }
                    }
                }
            }
        }
        if (iin == null) {
            rdt rdt = rcj2.a;
            if (rcj2.a.L.isGroup()) {
                upv upv = new upv(rdt.b(), rdt.L._id(), rdt.m(), rdt.L.participantsSize(), rdt.i(), ram.c(rdt), aaua.PROFILE_ACTION_MENU);
            } else {
                Long valueOf = Long.valueOf(rdt.L._id());
                String str = rdt.o;
                String str2 = rdt.t;
                if (str2 != null) {
                    upy upu = new upu(valueOf, str, str2, rdt.m(), rdt.i(), ram.c(rdt), aaua.PROFILE_ACTION_MENU, rdt.i, rdt.j(), null, null, null, false, 7680);
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            upy upy = r1;
            zhn zhn = (zhn) this.J.get();
            zjm zjm = r3;
            zjm zjm2 = new zjm(qxo.b, "FriendsFeedEventDispatcher", false, false, true, false, null, false, false, false, false, null, 4076);
            zhn.a(zjm, ((upx) this.K.get()).a(upy, qxo.a));
        }
    }

    public final void a(rck rck) {
        akcr.b(rck, "event");
        in.a("");
        try {
            if (!this.t.b(rak.PLAY_STORY)) {
                String e = rck.a.e();
                if (e == null) {
                    in.a();
                    return;
                }
                long b = a().b();
                long c = a().c();
                ajcx b2 = ajdx.c((Callable) new o(this, rck)).e((ajfc) new p(e, this, rck)).b((ajdw) c().g());
                akcr.a((Object) b2, "Single.fromCallable { st…eOn(schedulers.network())");
                igh.a(b2, (ajfo) rck.b).f(new q(e, this, rck)).a((ajev) new r(e, b, c, this, rck), (ajfb) new s(this, rck));
                in.a();
            }
        } finally {
            in.a();
        }
    }

    public final void a(rcl rcl) {
        akcr.b(rcl, "event");
        if (rcl.a.a().h()) {
            this.G.f(new w(rcl)).i().l(x.a).a((ajfc) new y(this, rcl), false).b((ajdw) c().f()).a((ajev) new z(rcl), (ajfb) new rao(new aa(this)));
        }
    }

    /* Access modifiers changed, original: final */
    public final rct b() {
        return (rct) this.y.b();
    }

    /* Access modifiers changed, original: final */
    public final zfw c() {
        return (zfw) this.z.b();
    }

    public final void d() {
        this.a.a();
    }

    public final void e() {
        this.t.a();
        this.b.a();
    }

    public final void f() {
        this.E.d = false;
    }

    public final ajdx<Boolean> g() {
        Object a = this.G.a((ajfc) al.a);
        akcr.a(a, "messagingApi.flatMap { i…tchOlderConversations() }");
        return a;
    }

    public final void h() {
        this.t.a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        this.R.a(isj);
    }

    public final void onDispose() {
        this.a.dispose();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendClickAvatarIconEvent(iso iso) {
        akcr.b(iso, "event");
        this.R.a(iso);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onHideFriendEvent(ist ist) {
        akcr.b(ist, "event");
        this.R.a(ist);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLaunchAddFriendsPageEvent(isx isx) {
        akcr.b(isx, "event");
        iqy.a.a((iqy) this.O.get(), this.h, 0, false, ith.QUICK_ADD_CAROUSEL_HEADER_ON_FRIENDS_FEED, null, 22);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onRemoveFriendEvent(itc itc) {
        akcr.b(itc, "event");
        this.R.a(itc);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onStartReplyCameraEvent(ite ite) {
        akcr.b(ite, "event");
        this.R.a(ite);
    }
}
