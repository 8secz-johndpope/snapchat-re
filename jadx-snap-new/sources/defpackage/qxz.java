package defpackage;

import com.brightcove.player.event.EventType;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.messaging.MessagingHttpInterface;
import com.snap.messaging.friendsfeed.FriendsFeedHttpInterface;
import defpackage.akdd.e;
import defpackage.quq.d;
import defpackage.quq.f;
import defpackage.quq.g;
import defpackage.qus.j;
import defpackage.qxw.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qxz */
public final class qxz implements qxl {
    final idd a = qxo.b.callsite("FriendsFeedClient");
    final zfw b = zgb.a(this.a);
    final ajxe c;
    AtomicBoolean d;
    final ajwy<ilv> e;
    final quq f;
    final ihh g;
    final qxa h;
    final ajwy<pta> i;
    final ajwy<qxm> j;
    final ajwy<gqr> k;
    final ajdx<prx> l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private final ajxe s;
    private final ajxe t;
    private final ajxe u;
    private final pru v;
    private final ajwy<qvd> w;
    private final qzz x;
    private final ajwy<psq> y;
    private final qxw z;

    /* renamed from: qxz$o */
    static final class o extends akcq implements akbk<qvd> {
        o(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (qvd) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$i */
    static final class i extends akcq implements akbk<FriendsFeedHttpInterface> {
        i(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (FriendsFeedHttpInterface) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$u */
    static final class u extends akcq implements akbk<qye> {
        u(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (qye) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$v */
    static final class v extends akcq implements akbk<SnapDb> {
        v(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (SnapDb) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$b */
    static final class b extends akcq implements akbk<quk> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (quk) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$m */
    static final class m extends akcq implements akbk<qus> {
        m(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (qus) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$n */
    static final class n extends akcq implements akbk<MessagingHttpInterface> {
        n(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (MessagingHttpInterface) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$w */
    static final class w extends akcq implements akbk<yhz> {
        w(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yhz) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$h */
    static final class h extends akcq implements akbk<qzy> {
        h(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (qzy) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$g */
    static final class g extends akcq implements akbk<rab> {
        g(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (rab) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qxz$y */
    static final class y extends akcq implements akbl<qxt, ajdx<qxu>> {
        y(qxw qxw) {
            super(1, qxw);
        }

        public final String getName() {
            return "getFeedSyncStrategy";
        }

        public final akej getOwner() {
            return akde.a(qxw.class);
        }

        public final String getSignature() {
            return "getFeedSyncStrategy(Lcom/snap/messaging/friendsfeed/api/FriendsFeedUpdateType;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            qxt qxt = (qxt) obj;
            akcr.b(qxt, "p1");
            qxw qxw = (qxw) this.receiver;
            akcr.b(qxt, "friendsFeedUpdateType");
            obj = ((rbk) qxw.a.get()).a().e().f(new a(qxt));
            akcr.a(obj, "friendsFeedConfigProvide…      }\n                }");
            return obj;
        }
    }

    /* renamed from: qxz$c */
    static final class c extends akcs implements akbk<DbClient> {
        private /* synthetic */ qxz a;

        c(qxz qxz) {
            this.a = qxz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d().getDbClient(this.a.a);
        }
    }

    /* renamed from: qxz$x */
    static final class x<T, R> implements ajfc<T, R> {
        private /* synthetic */ e a;

        x(e eVar) {
            this.a = eVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            if (!bool.booleanValue()) {
                return (qxt) this.a.a;
            }
            this.a.a = qxt.FORCE_FULL_SYNC;
            return qxt.FORCE_FULL_SYNC;
        }
    }

    /* renamed from: qxz$z */
    static final class z<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ qxz a;
        final /* synthetic */ e b;
        final /* synthetic */ int c;
        private /* synthetic */ ihm d;

        /* renamed from: qxz$z$a */
        static final class a<T, R> implements ajfc<Throwable, ajdb> {
            private /* synthetic */ z a;

            a(z zVar) {
                this.a = zVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                akcr.b(th, "it");
                return th instanceof pqa ? qxz.a(this.a.a, (qxt) this.a.b.a, this.a.c) : ajcx.b(th);
            }
        }

        z(qxz qxz, ihm ihm, e eVar, int i) {
            this.a = qxz;
            this.d = ihm;
            this.b = eVar;
            this.c = i;
        }

        /* JADX WARNING: Missing block: B:5:0x002e, code skipped:
            defpackage.akcr.a((java.lang.Object) r2, r3);
     */
        /* JADX WARNING: Missing block: B:11:0x00bb, code skipped:
            r2 = defpackage.ajcx.c(r3);
            defpackage.akcr.a((java.lang.Object) r2, r4);
     */
        /* JADX WARNING: Missing block: B:13:0x00d1, code skipped:
            r19 = r1;
     */
        /* JADX WARNING: Missing block: B:38:0x01f5, code skipped:
            r1 = r2.a((defpackage.ajfc) new defpackage.qxz.z.a(r0));
            defpackage.akcr.a(r1, "when (strategy) {\n      …                        }");
     */
        /* JADX WARNING: Missing block: B:39:0x020b, code skipped:
            return r1.a((java.lang.Object) r19);
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r19) {
            /*
            r18 = this;
            r0 = r18;
            r1 = r19;
            r1 = (defpackage.qxu) r1;
            r2 = "strategy";
            defpackage.akcr.b(r1, r2);
            r2 = r0.d;
            r2.a();
            r2 = defpackage.qya.a;
            r3 = r1.ordinal();
            r2 = r2[r3];
            r3 = "Completable.complete()";
            r4 = "Completable.mergeArrayDe…PostedAndFriendStories())";
            r5 = 2;
            r6 = 0;
            r7 = 1;
            switch(r2) {
                case 1: goto L_0x00d5;
                case 2: goto L_0x00c3;
                case 3: goto L_0x0093;
                case 4: goto L_0x005c;
                case 5: goto L_0x0033;
                case 6: goto L_0x00c3;
                case 7: goto L_0x0028;
                default: goto L_0x0022;
            };
        L_0x0022:
            r1 = new ajxk;
            r1.<init>();
            throw r1;
        L_0x0028:
            r2 = defpackage.ajhn.a;
            r2 = defpackage.ajvo.a(r2);
        L_0x002e:
            defpackage.akcr.a(r2, r3);
            goto L_0x00d1;
        L_0x0033:
            r2 = r0.a;
            r3 = new defpackage.ajdb[r5];
            r5 = r2.i;
            r5 = r5.get();
            r5 = (defpackage.pta) r5;
            r5 = r5.a();
            r8 = defpackage.qxz.af.a;
            r8 = (defpackage.ajfc) r8;
            r5 = r5.e(r8);
            r5 = (defpackage.ajdb) r5;
            r3[r6] = r5;
            r2 = r2.f();
            r2 = r2.a();
            r2 = (defpackage.ajdb) r2;
            r3[r7] = r2;
            goto L_0x00bb;
        L_0x005c:
            r2 = r0.a;
            r4 = r2.d;
            r4 = r4.compareAndSet(r7, r6);
            if (r4 == 0) goto L_0x0028;
        L_0x0066:
            r3 = r2.i;
            r3 = r3.get();
            r3 = (defpackage.pta) r3;
            r3 = r3.a();
            r4 = new qxz$r;
            r4.<init>(r2);
            r4 = (defpackage.ajfc) r4;
            r3 = r3.a(r4);
            r4 = defpackage.qxz.s.a;
            r4 = (defpackage.ajfc) r4;
            r3 = r3.h(r4);
            r4 = new qxz$t;
            r4.<init>(r2);
            r4 = (defpackage.ajfc) r4;
            r2 = r3.e(r4);
            r3 = "chatSessionProvider.get(…                        }";
            goto L_0x002e;
        L_0x0093:
            r2 = r0.a;
            r3 = new defpackage.ajdb[r5];
            r5 = r2.i;
            r5 = r5.get();
            r5 = (defpackage.pta) r5;
            r5 = r5.a();
            r8 = defpackage.qxz.ae.a;
            r8 = (defpackage.ajfc) r8;
            r5 = r5.e(r8);
            r5 = (defpackage.ajdb) r5;
            r3[r6] = r5;
            r2 = r2.f();
            r2 = r2.a();
            r2 = (defpackage.ajdb) r2;
            r3[r7] = r2;
        L_0x00bb:
            r2 = defpackage.ajcx.c(r3);
            defpackage.akcr.a(r2, r4);
            goto L_0x00d1;
        L_0x00c3:
            r2 = r0.a;
            r3 = r0.b;
            r3 = r3.a;
            r3 = (defpackage.qxt) r3;
            r4 = r0.c;
            r2 = defpackage.qxz.a(r2, r3, r4);
        L_0x00d1:
            r19 = r1;
            goto L_0x01f5;
        L_0x00d5:
            r2 = r0.a;
            r3 = r0.b;
            r3 = r3.a;
            r3 = (defpackage.qxt) r3;
            r4 = r0.c;
            r5 = r2.g;
            r8 = r5.c();
            r11 = r2.c();
            r5 = "updateType";
            defpackage.akcr.b(r3, r5);
            r5 = r11.b();
            r10 = "friendsFeedItemRepository";
            defpackage.akcr.a(r5, r10);
            r5 = r5.e();
            if (r5 == 0) goto L_0x0100;
        L_0x00fd:
            r12 = defpackage.qxt.FORCE_FULL_SYNC;
            goto L_0x0101;
        L_0x0100:
            r12 = r3;
        L_0x0101:
            r16 = r11.a(r12);
            r13 = defpackage.qxt.PAGINATION;
            if (r12 != r13) goto L_0x0115;
        L_0x0109:
            r13 = r11.b();
            defpackage.akcr.a(r13, r10);
            r13 = r13.a();
            goto L_0x011b;
        L_0x0115:
            r13 = "";
            r13 = defpackage.ajdx.b(r13);
        L_0x011b:
            r14 = defpackage.qxt.PAGINATION;
            if (r12 != r14) goto L_0x0122;
        L_0x011f:
            r14 = "{}";
            goto L_0x012d;
        L_0x0122:
            r14 = r11.b();
            defpackage.akcr.a(r14, r10);
            r14 = r14.c();
        L_0x012d:
            r15 = r14;
            r14 = r11.b;
            r14 = r14.b();
            r14 = (defpackage.ajwl) r14;
            r14 = r14.p();
            r14 = (java.lang.Boolean) r14;
            if (r14 != 0) goto L_0x0140;
        L_0x013e:
            r14 = java.lang.Boolean.FALSE;
        L_0x0140:
            r6 = "isForceSyncAndClearLocal…ledSubject.value ?: false";
            defpackage.akcr.a(r14, r6);
            r6 = r14.booleanValue();
            if (r6 == 0) goto L_0x014f;
        L_0x014b:
            if (r5 != 0) goto L_0x014f;
        L_0x014d:
            r5 = 1;
            goto L_0x0150;
        L_0x014f:
            r5 = 0;
        L_0x0150:
            if (r5 != r7) goto L_0x0155;
        L_0x0152:
            r5 = 0;
            goto L_0x0160;
        L_0x0155:
            r5 = r11.b();
            defpackage.akcr.a(r5, r10);
            r5 = r5.d();
        L_0x0160:
            r7 = r11.a;
            r7 = r7.b();
            r7 = (defpackage.yid) r7;
            r7 = r7.c();
            r10 = r11.c;
            r10 = r10.g();
            r10 = (defpackage.ajdw) r10;
            r7 = r7.a(r10);
            r7 = (defpackage.ajeb) r7;
            r10 = r11.c;
            r10 = r10.g();
            r10 = (defpackage.ajdw) r10;
            r10 = r13.a(r10);
            r13 = r10;
            r13 = (defpackage.ajeb) r13;
            r17 = new qye$b;
            r10 = r17;
            r19 = r1;
            r1 = r13;
            r13 = r5;
            r10.<init>(r11, r12, r13, r15, r16);
            r5 = r17;
            r5 = (defpackage.ajex) r5;
            r1 = defpackage.ajdx.a(r7, r1, r5);
            r5 = "Single.zip(\n            …     }\n                })";
            defpackage.akcr.a(r1, r5);
            r5 = r2.g;
            r5 = r5.c();
            r7 = r2.h;
            r10 = defpackage.qxa.a.FETCH_DELTA_INFO;
            r5 = r5 - r8;
            r7.a(r10, r5);
            r5 = r2.b;
            r5 = r5.g();
            r5 = (defpackage.ajdw) r5;
            r1 = r1.b(r5);
            r5 = new qxz$ag;
            r6 = r2.b();
            r5.<init>(r6);
            r5 = (defpackage.akbl) r5;
            r6 = new qyb;
            r6.<init>(r5);
            r6 = (defpackage.ajfc) r6;
            r1 = r1.a(r6);
            r5 = r2.b;
            r5 = r5.b();
            r5 = (defpackage.ajdw) r5;
            r1 = r1.a(r5);
            r5 = defpackage.qxz.ah.a;
            r5 = (defpackage.ajfc) r5;
            r1 = r1.f(r5);
            r5 = new qxz$ai;
            r5.<init>(r2, r3, r4);
            r5 = (defpackage.ajfc) r5;
            r2 = r1.e(r5);
            r1 = "createFullSyncRequest(up…rs(it))\n                }";
            defpackage.akcr.a(r2, r1);
        L_0x01f5:
            r1 = new qxz$z$a;
            r1.<init>(r0);
            r1 = (defpackage.ajfc) r1;
            r1 = r2.a(r1);
            r2 = "when (strategy) {\n      …                        }";
            defpackage.akcr.a(r1, r2);
            r2 = r19;
            r1 = r1.a(r2);
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qxz$z.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: qxz$aa */
    static final class aa<T> implements ajfb<qxu> {
        private /* synthetic */ qxz a;
        private /* synthetic */ e b;
        private /* synthetic */ int c;
        private /* synthetic */ ihm d;

        aa(qxz qxz, e eVar, int i, ihm ihm) {
            this.a = qxz;
            this.b = eVar;
            this.c = i;
            this.d = ihm;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2;
            obj = (qxu) obj;
            switch (qxv.a[obj.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    obj2 = 1;
                    break;
                case 5:
                case 6:
                case 7:
                    obj2 = null;
                    break;
                default:
                    throw new ajxk();
            }
            if (obj2 != null) {
                qxz.b(this.a, (qxt) this.b.a, this.c);
            }
            ilv ilv = (ilv) this.a.e.get();
            ioc ioc = ioc.SYNC_LATENCY;
            if (obj == null) {
                akcr.a();
            }
            akcr.a(obj, "feedSyncStrategy!!");
            ilv.a(ioc.a("strategy", (Enum) obj), this.d.c());
        }
    }

    /* renamed from: qxz$ab */
    static final class ab<T> implements ajfb<Throwable> {
        private /* synthetic */ qxz a;

        ab(qxz qxz) {
            this.a = qxz;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            gqr gqr = (gqr) this.a.k.get();
            gqt gqt = gqt.HIGH;
            akcr.a(obj, "it");
            gqr.a(gqt, obj, this.a.a, "sync");
        }
    }

    /* renamed from: qxz$ac */
    static final class ac<T, R> implements ajfc<qxu, ajdb> {
        private /* synthetic */ qxz a;

        ac(qxz qxz) {
            this.a = qxz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((qxu) obj, "it");
            return this.a.h();
        }
    }

    /* renamed from: qxz$ad */
    static final class ad implements ajev {
        private /* synthetic */ e a;
        private /* synthetic */ int b = -1;

        ad(e eVar, int i) {
            this.a = eVar;
        }

        public final void run() {
            new StringBuilder("FriendsFeedClient:sync:").append((qxt) this.a.a);
            zgo.a(this.b);
        }
    }

    /* renamed from: qxz$ag */
    static final class ag extends akcq implements akbl<aelt, ajdx<akxa<aelz>>> {
        ag(FriendsFeedHttpInterface friendsFeedHttpInterface) {
            super(1, friendsFeedHttpInterface);
        }

        public final String getName() {
            return "syncStoriesConversations";
        }

        public final akej getOwner() {
            return akde.a(FriendsFeedHttpInterface.class);
        }

        public final String getSignature() {
            return "syncStoriesConversations(Lcom/snapchat/soju/android/FriendFeedRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aelt aelt = (aelt) obj;
            akcr.b(aelt, "p1");
            return ((FriendsFeedHttpInterface) this.receiver).syncStoriesConversations(aelt);
        }
    }

    /* renamed from: qxz$ah */
    static final class ah<T, R> implements ajfc<T, R> {
        public static final ah a = new ah();

        ah() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "it");
            return (aelz) fst.a(akxa);
        }
    }

    /* renamed from: qxz$ai */
    static final class ai<T, R> implements ajfc<aelz, ajdb> {
        final /* synthetic */ qxz a;
        final /* synthetic */ qxt b;
        final /* synthetic */ int c;

        /* renamed from: qxz$ai$1 */
        static final class 1<V> implements Callable<Object> {
            private /* synthetic */ ai a;

            1(ai aiVar) {
                this.a = aiVar;
            }

            public final /* synthetic */ Object call() {
                qxz.b(this.a.a, this.a.b, this.a.c);
                return ajxw.a;
            }
        }

        ai(qxz qxz, qxt qxt, int i) {
            this.a = qxz;
            this.b = qxt;
            this.c = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object g;
            String str;
            aelz aelz = (aelz) obj;
            akcr.b(aelz, "it");
            qxz qxz = this.a;
            Object g2 = qxz.g();
            String str2 = "friendsFeedItemRepository";
            akcr.a(g2, str2);
            if (g2.d() != 0) {
                if (akcr.a(aelz.i, Boolean.TRUE)) {
                    g = qxz.g();
                    akcr.a(g, str2);
                    g.a(true);
                } else {
                    g2 = qxz.g();
                    akcr.a(g2, str2);
                    if (g2.e()) {
                        g2 = qxz.g();
                        akcr.a(g2, str2);
                        g2.a(false);
                        g = qxz.l.e((ajfc) k.a);
                        str = "messagingApi.flatMapComp…ForceSync()\n            }";
                        akcr.a(g, str);
                        return g.b((ajdb) this.a.a(aelz, this.b)).b((ajdb) ajcx.b((Callable) new 1(this))).b((ajdb) this.a.a(aelz)).b((ajdb) this.a.b(aelz));
                    }
                }
            }
            g = ajvo.a(ajhn.a);
            str = "Completable.complete()";
            akcr.a(g, str);
            return g.b((ajdb) this.a.a(aelz, this.b)).b((ajdb) ajcx.b((Callable) new 1(this))).b((ajdb) this.a.a(aelz)).b((ajdb) this.a.b(aelz));
        }
    }

    /* renamed from: qxz$j */
    static final class j extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ qxz a;
        private /* synthetic */ qxt b;
        private /* synthetic */ aelz c;

        j(qxz qxz, qxt qxt, aelz aelz) {
            this.a = qxz;
            this.b = qxt;
            this.c = aelz;
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:92:0x0198 in {2, 22, 23, 25, 29, 30, 34, 40, 49, 50, 55, 56, 58, 65, 69, 71, 74, 77, 79, 82, 85, 87, 89, 91} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
            /*
            r13 = this;
            r0 = "updates";
            r14 = (com.snap.core.db.api.DbTransaction) r14;
            r1 = "tx";
            defpackage.akcr.b(r14, r1);
            r2 = r13.a;
            r2 = r2.h;
            r2.b();
            r2 = r13.a;
            r3 = defpackage.qxa.a.UFS_REQUEST;
            r4 = r13.b;
            r4 = r4.a();
            if (r4 == 0) goto L_0x0021;
            r2 = r2.h;
            r2.a(r3);
            r2 = r13.a;
            r2 = r2.c;
            r2 = r2.b();
            r2 = (defpackage.qzy) r2;
            r3 = r13.c;
            r4 = r13.b;
            r5 = r13.a;
            r5 = r5.d();
            r6 = "snapDb";
            defpackage.akcr.a(r5, r6);
            r7 = "response";
            defpackage.akcr.b(r3, r7);
            r7 = "updateType";
            defpackage.akcr.b(r4, r7);
            defpackage.akcr.b(r5, r6);
            defpackage.akcr.b(r14, r1);
            r6 = r2.a;	 Catch:{ all -> 0x0194 }
            r6.a(r3, r5, r14);	 Catch:{ all -> 0x0194 }
            r6 = r2.c;	 Catch:{ all -> 0x0192 }
            r6.a(r3, r5, r14);	 Catch:{ all -> 0x0192 }
            r6 = r2.d;	 Catch:{ all -> 0x0190 }
            defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x0190 }
            defpackage.akcr.b(r14, r1);	 Catch:{ all -> 0x0190 }
            r8 = 0;
            if (r3 == 0) goto L_0x00c0;
            r9 = r3.a;	 Catch:{ all -> 0x018e }
            if (r9 == 0) goto L_0x00c0;	 Catch:{ all -> 0x018e }
            r9 = r9.f;	 Catch:{ all -> 0x018e }
            if (r9 == 0) goto L_0x00c0;	 Catch:{ all -> 0x018e }
            r9 = (java.lang.Iterable) r9;	 Catch:{ all -> 0x018e }
            r10 = new java.util.ArrayList;	 Catch:{ all -> 0x018e }
            r10.<init>();	 Catch:{ all -> 0x018e }
            r10 = (java.util.Collection) r10;	 Catch:{ all -> 0x018e }
            r9 = r9.iterator();	 Catch:{ all -> 0x018e }
            r11 = r9.hasNext();	 Catch:{ all -> 0x018e }
            if (r11 == 0) goto L_0x008e;	 Catch:{ all -> 0x018e }
            r11 = r9.next();	 Catch:{ all -> 0x018e }
            r12 = r11;	 Catch:{ all -> 0x018e }
            r12 = (defpackage.ahaz) r12;	 Catch:{ all -> 0x018e }
            r12 = r12.D;	 Catch:{ all -> 0x018e }
            if (r12 == 0) goto L_0x0087;	 Catch:{ all -> 0x018e }
            r12 = 1;	 Catch:{ all -> 0x018e }
            goto L_0x0088;	 Catch:{ all -> 0x018e }
            r12 = 0;	 Catch:{ all -> 0x018e }
            if (r12 == 0) goto L_0x0074;	 Catch:{ all -> 0x018e }
            r10.add(r11);	 Catch:{ all -> 0x018e }
            goto L_0x0074;	 Catch:{ all -> 0x018e }
            r10 = (java.util.List) r10;	 Catch:{ all -> 0x018e }
            r10 = (java.lang.Iterable) r10;	 Catch:{ all -> 0x018e }
            r9 = 10;	 Catch:{ all -> 0x018e }
            r9 = defpackage.ajyn.a(r10, r9);	 Catch:{ all -> 0x018e }
            r9 = defpackage.ajzm.a(r9);	 Catch:{ all -> 0x018e }
            r11 = 16;	 Catch:{ all -> 0x018e }
            r9 = defpackage.akef.b(r9, r11);	 Catch:{ all -> 0x018e }
            r11 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x018e }
            r11.<init>(r9);	 Catch:{ all -> 0x018e }
            r11 = (java.util.Map) r11;	 Catch:{ all -> 0x018e }
            r9 = r10.iterator();	 Catch:{ all -> 0x018e }
            r10 = r9.hasNext();	 Catch:{ all -> 0x018e }
            if (r10 == 0) goto L_0x00c5;	 Catch:{ all -> 0x018e }
            r10 = r9.next();	 Catch:{ all -> 0x018e }
            r12 = r10;	 Catch:{ all -> 0x018e }
            r12 = (defpackage.ahaz) r12;	 Catch:{ all -> 0x018e }
            r12 = r12.D;	 Catch:{ all -> 0x018e }
            r11.put(r12, r10);	 Catch:{ all -> 0x018e }
            goto L_0x00ad;	 Catch:{ all -> 0x018e }
            r9 = defpackage.ajyx.a;	 Catch:{ all -> 0x018e }
            r11 = r9;	 Catch:{ all -> 0x018e }
            r11 = (java.util.Map) r11;	 Catch:{ all -> 0x018e }
            if (r3 == 0) goto L_0x00d4;	 Catch:{ all -> 0x018e }
            r9 = r3.b;	 Catch:{ all -> 0x018e }
            if (r9 == 0) goto L_0x00d4;	 Catch:{ all -> 0x018e }
            r10 = r6.b();	 Catch:{ all -> 0x018e }
            r12 = r3.g;	 Catch:{ all -> 0x018e }
            r10.a(r9, r11, r14, r12);	 Catch:{ all -> 0x018e }
            if (r3 == 0) goto L_0x00e5;	 Catch:{ all -> 0x018e }
            r9 = r3.a;	 Catch:{ all -> 0x018e }
            if (r9 == 0) goto L_0x00e5;	 Catch:{ all -> 0x018e }
            r9 = r9.c;	 Catch:{ all -> 0x018e }
            if (r9 == 0) goto L_0x00e5;	 Catch:{ all -> 0x018e }
            r6 = r6.a();	 Catch:{ all -> 0x018e }
            r6.a(r9, r14);	 Catch:{ all -> 0x018e }
            r6 = r2.b;	 Catch:{ all -> 0x018c }
            r6.a(r3, r5, r14);	 Catch:{ all -> 0x018c }
            r6 = r2.e;	 Catch:{ all -> 0x018a }
            defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x018a }
            defpackage.akcr.b(r4, r7);	 Catch:{ all -> 0x018a }
            r0 = "database";	 Catch:{ all -> 0x018a }
            defpackage.akcr.b(r5, r0);	 Catch:{ all -> 0x018a }
            defpackage.akcr.b(r14, r1);	 Catch:{ all -> 0x018a }
            r0 = defpackage.qze.a(r3);	 Catch:{ all -> 0x018a }
            r1 = r6.b;	 Catch:{ all -> 0x018a }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x018a }
            r5 = new java.lang.String[r8];	 Catch:{ all -> 0x018a }
            r0 = r0.toArray(r5);	 Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x0182;	 Catch:{ all -> 0x018a }
            r0 = (java.lang.String[]) r0;	 Catch:{ all -> 0x018a }
            r5 = r0.length;	 Catch:{ all -> 0x018a }
            r0 = java.util.Arrays.copyOf(r0, r5);	 Catch:{ all -> 0x018a }
            r0 = (java.lang.String[]) r0;	 Catch:{ all -> 0x018a }
            r0 = r1.a(r0);	 Catch:{ all -> 0x018a }
            r1 = r6.a;	 Catch:{ all -> 0x018a }
            r1.a(r0);	 Catch:{ all -> 0x018a }
            r0 = r3.i;	 Catch:{ all -> 0x018a }
            r1 = "updates.forceFullSyncFeedItems";	 Catch:{ all -> 0x018a }
            defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x018a }
            r0 = r0.booleanValue();	 Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x0135;	 Catch:{ all -> 0x018a }
            r0 = r6.a;	 Catch:{ all -> 0x018a }
            r0 = r0.d();	 Catch:{ all -> 0x018a }
            r7 = 0;	 Catch:{ all -> 0x018a }
            r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));	 Catch:{ all -> 0x018a }
            if (r5 != 0) goto L_0x0141;	 Catch:{ all -> 0x018a }
            r0 = r6.a;	 Catch:{ all -> 0x018a }
            r7 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x018a }
            r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x018a }
            r7 = r7 / r9;	 Catch:{ all -> 0x018a }
            r0.a(r7);	 Catch:{ all -> 0x018a }
            r0 = r3.a;	 Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x014c;	 Catch:{ all -> 0x018a }
            r0 = r0.a;	 Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x014c;	 Catch:{ all -> 0x018a }
            r0 = r0.b;	 Catch:{ all -> 0x018a }
            goto L_0x014d;	 Catch:{ all -> 0x018a }
            r0 = 0;	 Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x015a;	 Catch:{ all -> 0x018a }
            r0 = r6.a;	 Catch:{ all -> 0x018a }
            r1 = r3.a;	 Catch:{ all -> 0x018a }
            r1 = r1.a;	 Catch:{ all -> 0x018a }
            r1 = r1.b;	 Catch:{ all -> 0x018a }
            r0.b(r1);	 Catch:{ all -> 0x018a }
            r0 = r3.a;	 Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x016b;	 Catch:{ all -> 0x018a }
            r0 = r0.i;	 Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x016b;	 Catch:{ all -> 0x018a }
            r0 = r0.a;	 Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x016b;	 Catch:{ all -> 0x018a }
            r1 = r6.a;	 Catch:{ all -> 0x018a }
            r1.a(r0);	 Catch:{ all -> 0x018a }
            r0 = defpackage.qxa.a.PROCESS_INDIVIDUAL_SOURCES;	 Catch:{ all -> 0x0196 }
            r1 = r4.a();	 Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x0178;	 Catch:{ all -> 0x0196 }
            r1 = r2.f;	 Catch:{ all -> 0x0196 }
            r1.a(r0);	 Catch:{ all -> 0x0196 }
            r0 = r13.a;
            r1 = r13.c;
            defpackage.qxz.a(r0, r14, r1);
            r14 = defpackage.ajxw.a;
            return r14;
            r14 = new ajxt;	 Catch:{ all -> 0x018a }
            r0 = "null cannot be cast to non-null type kotlin.Array<T>";	 Catch:{ all -> 0x018a }
            r14.<init>(r0);	 Catch:{ all -> 0x018a }
            throw r14;	 Catch:{ all -> 0x018a }
            r14 = move-exception;
            throw r14;	 Catch:{ all -> 0x0196 }
            r14 = move-exception;	 Catch:{ all -> 0x0196 }
            throw r14;	 Catch:{ all -> 0x0196 }
            r14 = move-exception;
            throw r14;	 Catch:{ all -> 0x0190 }
            r14 = move-exception;
            throw r14;	 Catch:{ all -> 0x0196 }
            r14 = move-exception;	 Catch:{ all -> 0x0196 }
            throw r14;	 Catch:{ all -> 0x0196 }
            r14 = move-exception;	 Catch:{ all -> 0x0196 }
            throw r14;	 Catch:{ all -> 0x0196 }
            r14 = move-exception;
            throw r14;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qxz$j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: qxz$p */
    static final class p<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final p a = new p();

        p() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            qvd qvd = (qvd) obj;
            akcr.b(qvd, "repo");
            return qvd.b();
        }
    }

    /* renamed from: qxz$q */
    static final class q<T, R> implements ajfc<List<String>, ajdb> {
        private /* synthetic */ qxz a;

        q(qxz qxz) {
            this.a = qxz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx b;
            List list = (List) obj;
            akcr.b(list, "it");
            if ((list.isEmpty() ^ 1) != 0) {
                qxz qxz = this.a;
                b = qxz.c().a(list).a((ajdw) qxz.b.g()).a((ajfc) new d(qxz)).a((ajdw) qxz.b.b()).f(e.a).e((ajfc) new f(qxz)).b((ajdb) qxz.h());
                akcr.a((Object) b, "requestFactory.groupSync…ithLaterContentForward())");
            } else {
                b = ajvo.a(ajhn.a);
            }
            return b;
        }
    }

    /* renamed from: qxz$a */
    public static final class a<T> implements ajfb<DbTransaction> {
        private /* synthetic */ qxz a;
        private /* synthetic */ ajxm[] b;

        public a(qxz qxz, ajxm[] ajxmArr) {
            this.a = qxz;
            this.b = ajxmArr;
        }

        public final /* synthetic */ void accept(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            qxz qxz = this.a;
            akcr.a((Object) dbTransaction, "it");
            ajxm[] ajxmArr = this.b;
            qxz.a(dbTransaction, (ajxm[]) Arrays.copyOf(ajxmArr, ajxmArr.length));
        }
    }

    /* renamed from: qxz$ae */
    static final class ae<T, R> implements ajfc<psz, ajdb> {
        public static final ae a = new ae();

        ae() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            psz psz = (psz) obj;
            akcr.b(psz, "it");
            return psz.c().a();
        }
    }

    /* renamed from: qxz$af */
    static final class af<T, R> implements ajfc<psz, ajdb> {
        public static final af a = new af();

        af() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            psz psz = (psz) obj;
            akcr.b(psz, "it");
            return psz.c().c();
        }
    }

    /* renamed from: qxz$aj */
    static final class aj<T, R> implements ajfc<T, R> {
        public static final aj a = new aj();

        aj() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "it");
            return (aecy) fst.a(akxa);
        }
    }

    /* renamed from: qxz$ak */
    static final class ak<T, R> implements ajfc<T, R> {
        private /* synthetic */ qxz a;
        private /* synthetic */ qxt b;

        ak(qxz qxz, qxt qxt) {
            this.a = qxz;
            this.b = qxt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aecy aecy = (aecy) obj;
            akcr.b(aecy, "it");
            qxt qxt = this.b;
            akcr.b(aecy, EventType.RESPONSE);
            akcr.b(qxt, "updateType");
            aelz aelz = new aelz();
            aelz.i = Boolean.valueOf(qxt == qxt.FORCE_FULL_SYNC);
            aegb aegb = new aegb();
            aegb.a = aecy.a;
            aegb.b = aecy.b;
            aegb.c = aecy.c;
            aegb.d = aecy.d;
            aegb.e = aecy.f;
            aegb.f = aecy.g;
            aegb.g = aecy.h;
            aegb.h = aecy.i;
            aegb.i = aecy.p;
            aelz.a = aegb;
            return aelz;
        }
    }

    /* renamed from: qxz$al */
    static final class al<T, R> implements ajfc<aelz, ajdb> {
        final /* synthetic */ qxz a;
        final /* synthetic */ qxt b;
        final /* synthetic */ int c;

        /* renamed from: qxz$al$1 */
        static final class 1<V> implements Callable<Object> {
            private /* synthetic */ al a;

            1(al alVar) {
                this.a = alVar;
            }

            public final /* synthetic */ Object call() {
                qxz.b(this.a.a, this.a.b, this.a.c);
                return ajxw.a;
            }
        }

        al(qxz qxz, qxt qxt, int i) {
            this.a = qxz;
            this.b = qxt;
            this.c = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aelz aelz = (aelz) obj;
            akcr.b(aelz, "it");
            return this.a.a(aelz, this.b).b((ajdb) ajcx.b((Callable) new 1(this))).b((ajdb) this.a.a(aelz)).b((ajdb) this.a.b(aelz));
        }
    }

    /* renamed from: qxz$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qxz a;

        d(qxz qxz) {
            this.a = qxz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aelt aelt = (aelt) obj;
            akcr.b(aelt, "req");
            return this.a.b().fetchGroupConversation(aelt);
        }
    }

    /* renamed from: qxz$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "it");
            return (aelz) fst.a(akxa);
        }
    }

    /* renamed from: qxz$f */
    static final class f<T, R> implements ajfc<aelz, ajdb> {
        private /* synthetic */ qxz a;

        f(qxz qxz) {
            this.a = qxz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aelz aelz = (aelz) obj;
            String str = "groupResponse";
            akcr.b(aelz, str);
            qxz qxz = this.a;
            akcr.b(aelz, str);
            return qxz.e().runInTransaction("FriendsFeedClient:fetchGroupConversations", new l(qxz, aelz)).b((ajdb) this.a.a(aelz));
        }
    }

    /* renamed from: qxz$k */
    static final class k<T, R> implements ajfc<prx, ajdb> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "api");
            return prx.c();
        }
    }

    /* renamed from: qxz$r */
    static final class r<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qxz a;

        /* renamed from: qxz$r$1 */
        static final class 1<V> implements Callable<Boolean> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* bridge */ /* synthetic */ Object call() {
                return Boolean.FALSE;
            }
        }

        r(qxz qxz) {
            this.a = qxz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            psz psz = (psz) obj;
            akcr.b(psz, "chatSession");
            Long a = ((qxm) this.a.j.get()).a();
            if (a != null) {
                a.longValue();
                ajdx b = psz.c().b();
                if (b != null) {
                    return b;
                }
            }
            Object c = psz.c().c().c((Callable) 1.a);
            akcr.a(c, "chatSession.feedSyncMana…Feed().toSingle { false }");
            return c;
        }
    }

    /* renamed from: qxz$s */
    static final class s<T, R> implements ajfc<Throwable, ajeb<? extends Boolean>> {
        public static final s a = new s();

        s() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return th instanceof pqa ? ajdx.b(th) : ajdx.b(Boolean.FALSE);
        }
    }

    /* renamed from: qxz$t */
    static final class t<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ qxz a;

        t(qxz qxz) {
            this.a = qxz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "noMoreAvailable");
            this.a.d.set(bool.booleanValue() ^ 1);
            return ajvo.a(ajhn.a);
        }
    }

    /* renamed from: qxz$l */
    static final class l extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ qxz a;
        private /* synthetic */ aelz b;

        l(qxz qxz, aelz aelz) {
            this.a = qxz;
            this.b = aelz;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            quq quq = this.a.f;
            aelz aelz = this.b;
            SnapDb d = this.a.d();
            akcr.a((Object) d, "snapDb");
            quq.a(aelz, d, dbTransaction);
            qxz.a(this.a, dbTransaction, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: qxz$am */
    static final class am extends akcq implements akbl<aeql, ajdx<akxa<aecy>>> {
        am(MessagingHttpInterface messagingHttpInterface) {
            super(1, messagingHttpInterface);
        }

        public final String getName() {
            return "fetchOlderConversations";
        }

        public final akej getOwner() {
            return akde.a(MessagingHttpInterface.class);
        }

        public final String getSignature() {
            return "fetchOlderConversations(Lcom/snapchat/soju/android/LoadConversationsRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aeql aeql = (aeql) obj;
            akcr.b(aeql, "p1");
            return ((MessagingHttpInterface) this.receiver).fetchOlderConversations(aeql);
        }
    }

    /* renamed from: qxz$an */
    static final class an extends akcq implements akbl<aecw, ajdx<akxa<aecy>>> {
        an(MessagingHttpInterface messagingHttpInterface) {
            super(1, messagingHttpInterface);
        }

        public final String getName() {
            return "refreshConversations";
        }

        public final akej getOwner() {
            return akde.a(MessagingHttpInterface.class);
        }

        public final String getSignature() {
            return "refreshConversations(Lcom/snapchat/soju/android/AllUpdatesRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aecw aecw = (aecw) obj;
            akcr.b(aecw, "p1");
            return ((MessagingHttpInterface) this.receiver).refreshConversations(aecw);
        }
    }

    /* renamed from: qxz$ao */
    static final class ao extends akcq implements akbl<aecw, ajdx<akxa<aecy>>> {
        ao(MessagingHttpInterface messagingHttpInterface) {
            super(1, messagingHttpInterface);
        }

        public final String getName() {
            return "refreshConversations";
        }

        public final akej getOwner() {
            return akde.a(MessagingHttpInterface.class);
        }

        public final String getSignature() {
            return "refreshConversations(Lcom/snapchat/soju/android/AllUpdatesRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aecw aecw = (aecw) obj;
            akcr.b(aecw, "p1");
            return ((MessagingHttpInterface) this.receiver).refreshConversations(aecw);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qxz.class), "friendsHttpInterface", "getFriendsHttpInterface()Lcom/snap/messaging/friendsfeed/FriendsFeedHttpInterface;"), new akdc(akde.a(qxz.class), "requestFactory", "getRequestFactory()Lcom/snap/messaging/friendsfeed/client/FriendsFeedRequestFactory;"), new akdc(akde.a(qxz.class), "snapDb", "getSnapDb()Lcom/snap/core/db/api/SnapDb;"), new akdc(akde.a(qxz.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(qxz.class), "conversationsRepository", "getConversationsRepository()Lcom/snap/messaging/db/ConversationsRepository;"), new akdc(akde.a(qxz.class), "interactionMessagesRepository", "getInteractionMessagesRepository()Lcom/snap/messaging/db/InteractionMessagesRepository;"), new akdc(akde.a(qxz.class), "messagingHttpInterface", "getMessagingHttpInterface()Lcom/snap/messaging/MessagingHttpInterface;"), new akdc(akde.a(qxz.class), "storiesNetworkApi", "getStoriesNetworkApi()Lcom/snap/stories/api/StoriesNetworkApi;"), new akdc(akde.a(qxz.class), "friendsFeedProcessor", "getFriendsFeedProcessor()Lcom/snap/messaging/friendsfeed/processor/FriendsFeedProcessor;"), new akdc(akde.a(qxz.class), "friendsFeedItemRepository", "getFriendsFeedItemRepository()Lcom/snap/messaging/friendsfeed/processor/db/FriendsFeedItemRepository;")};
    }

    public qxz(ajwy<MessagingHttpInterface> ajwy, ajwy<FriendsFeedHttpInterface> ajwy2, ajwy<yhz> ajwy3, ajwy<SnapDb> ajwy4, ajwy<qye> ajwy5, ajwy<qzy> ajwy6, ajwy<ilv> ajwy7, quq quq, pru pru, ajwy<qvd> ajwy8, qzz qzz, ihh ihh, qxa qxa, ajwy<quk> ajwy9, ajwy<qus> ajwy10, zgb zgb, ajwy<psq> ajwy11, ajwy<pta> ajwy12, qxw qxw, ajwy<qxm> ajwy13, ajwy<gqr> ajwy14, ajdx<prx> ajdx, ajwy<rab> ajwy15) {
        ajwy<FriendsFeedHttpInterface> ajwy16 = ajwy2;
        ajwy<yhz> ajwy17 = ajwy3;
        ajwy<SnapDb> ajwy18 = ajwy4;
        ajwy<qye> ajwy19 = ajwy5;
        ajwy<qzy> ajwy20 = ajwy6;
        ajwy<ilv> ajwy21 = ajwy7;
        quq quq2 = quq;
        pru pru2 = pru;
        ajwy<qvd> ajwy22 = ajwy8;
        qzz qzz2 = qzz;
        ihh ihh2 = ihh;
        qxa qxa2 = qxa;
        ajwy<quk> ajwy23 = ajwy9;
        ajwy<qus> ajwy24 = ajwy10;
        ajwy<psq> ajwy25 = ajwy11;
        akcr.b(ajwy, "messagingHttpInterface");
        akcr.b(ajwy16, "friendsHttpInterfaceProvider");
        akcr.b(ajwy17, "storiesNetworkApi");
        akcr.b(ajwy18, "snapDbProvider");
        akcr.b(ajwy19, "requestFactoryProvider");
        akcr.b(ajwy20, "friendsFeedProcessorProvider");
        akcr.b(ajwy21, "graphene");
        akcr.b(quq2, "groupProcessor");
        akcr.b(pru2, "messageReleaseUpdatesProcessor");
        akcr.b(ajwy22, "messagingRepositoryProvider");
        akcr.b(qzz2, "friendsFeedRecencyRanking");
        akcr.b(ihh2, "clock");
        akcr.b(qxa2, "feedSyncAnalytics");
        akcr.b(ajwy23, "conversationRepositoryProvider");
        akcr.b(ajwy24, "interactionMessagesRepositoryProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy11, "snapRefactorMigrator");
        ajwy<pta> ajwy26 = ajwy12;
        akcr.b(ajwy26, "chatSessionProvider");
        qxw qxw2 = qxw;
        akcr.b(qxw2, "feedSyncStrategyProvider");
        ajwy<qxm> ajwy27 = ajwy13;
        akcr.b(ajwy27, "friendsFeedDataProvider");
        ajwy<gqr> ajwy28 = ajwy14;
        akcr.b(ajwy28, "exceptionTracker");
        ajdx<prx> ajdx2 = ajdx;
        akcr.b(ajdx2, "messagingApi");
        akcr.b(ajwy15, "friendsFeedItemRepositoryProvider");
        ajwy<psq> ajwy29 = ajwy11;
        this.e = ajwy21;
        this.f = quq2;
        this.v = pru2;
        this.w = ajwy22;
        this.x = qzz2;
        this.g = ihh2;
        this.h = qxa2;
        this.y = ajwy29;
        this.i = ajwy26;
        this.z = qxw2;
        this.j = ajwy27;
        this.k = ajwy28;
        this.l = ajdx2;
        this.m = ajxh.a(new i(ajwy16));
        this.n = ajxh.a(new u(ajwy19));
        ajwy<rab> ajwy30 = ajwy15;
        this.o = ajxh.a(new v(ajwy4));
        this.p = ajxh.a(new c(this));
        this.q = ajxh.a(new b(ajwy9));
        this.r = ajxh.a(new m(ajwy10));
        this.s = ajxh.a(new n(ajwy));
        this.t = ajxh.a(new w(ajwy3));
        this.c = ajxh.a(new h(ajwy6));
        this.u = ajxh.a(new g(ajwy30));
        this.d = new AtomicBoolean(true);
    }

    public static final /* synthetic */ void b(qxz qxz, qxt qxt, int i) {
        if (qxt.a()) {
            qxz.h.a(qxa.a.PROPAGATE_CHANGE_TO_UI);
            qxa qxa = qxz.h;
            qxa.a(qxa.d());
            zgo.a(i);
        }
    }

    private final quk i() {
        return (quk) this.q.b();
    }

    private final qus j() {
        return (qus) this.r.b();
    }

    private final MessagingHttpInterface k() {
        return (MessagingHttpInterface) this.s.b();
    }

    public final ajcx a(aelz aelz) {
        Object e;
        akcr.b(aelz, EventType.RESPONSE);
        aegb aegb = aelz.a;
        if (aegb != null) {
            List list = aegb.f;
            if (list != null) {
                quq quq = this.f;
                akcr.b(list, "groups");
                e = quq.b.callInTransaction("grp:idMap", new f(quq, list)).e((ajfc) new g(quq));
                akcr.a(e, "dbClient.callInTransacti…enceNumbers(it)\n        }");
                if (e != null) {
                    return e;
                }
            }
        }
        e = ajvo.a(ajhn.a);
        akcr.a(e, "Completable.complete()");
        return e;
    }

    public final ajcx a(aelz aelz, qxt qxt) {
        akcr.b(aelz, EventType.RESPONSE);
        akcr.b(qxt, "updateType");
        Object a = e().runInTransaction("FriendsFeedClient:handleFriendFeedResponse", new j(this, qxt, aelz)).a((ajdw) this.b.b());
        akcr.a(a, "dbClient.runInTransactio…Schedulers.computation())");
        return a;
    }

    public final ajcx a(qxt qxt) {
        int i;
        akcr.b(qxt, "updateType");
        if (qxt.a()) {
            i = qya.c[qxt.ordinal()];
            qxi qxi = i != 1 ? i != 2 ? qxi.SOURCE_UNKNOWN : qxi.SOURCE_WARM_START : qxi.SOURCE_COLD_START;
            this.h.a(qxi);
            this.h.a();
            i = zgo.a();
        } else {
            i = Integer.MIN_VALUE;
        }
        ihm ihm = new ihm(this.g);
        "FriendsFeedClient:sync:".concat(String.valueOf(qxt));
        zgo.a();
        e eVar = new e();
        eVar.a = qxt;
        Object d = ((psq) this.y.get()).a().f(new x(eVar)).a((ajfc) new qyb(new y(this.z))).a((ajfc) new z(this, ihm, eVar, i)).c((ajfb) new aa(this, eVar, i, ihm)).d((ajfb) new ab(this)).e((ajfc) new ac(this)).d((ajev) new ad(eVar, -1));
        akcr.a(d, "snapRefactorMigrator.get…pdateType\", syncCookie) }");
        return d;
    }

    public final ajdp<Boolean> a() {
        qus j = j();
        Object j2 = j.b().p(new j(j)).j(ajfu.a);
        akcr.a(j2, "getNewContentInteraction…  .distinctUntilChanged()");
        j2 = j2.b((ajdw) this.b.i());
        akcr.a(j2, "interactionMessagesRepos…snapSchedulers.queries())");
        return j2;
    }

    public final void a(DbTransaction dbTransaction, ajxm<String, Long>... ajxmArr) {
        akcr.b(dbTransaction, "tx");
        akcr.b(ajxmArr, "friendsAndLastInteractionTimes");
        Collection arrayList = new ArrayList(ajxmArr.length);
        int i = 0;
        for (ajxm ajxm : ajxmArr) {
            arrayList.add(Long.valueOf(quk.a(i(), (String) ajxm.a, null, (Long) ajxm.b, false, 8)));
        }
        long[] g = ajyu.g((Collection) (List) arrayList);
        if (g.length == 0) {
            i = 1;
        }
        if ((i ^ 1) != 0) {
            j().a(dbTransaction, qvv.SINGLE_UPDATE, Arrays.copyOf(g, g.length));
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final void a(defpackage.qxt r4, com.snap.core.db.api.DbTransaction r5) {
        /*
        r3 = this;
        r0 = "snapDb";
        r1 = "updateType";
        defpackage.akcr.b(r4, r1);
        r1 = "tx";
        defpackage.akcr.b(r5, r1);
        r5.checkInTransaction();
        r2 = r3.d();	 Catch:{ all -> 0x0050 }
        defpackage.akcr.a(r2, r0);	 Catch:{ all -> 0x0050 }
        defpackage.akcr.b(r2, r0);	 Catch:{ all -> 0x0050 }
        defpackage.akcr.b(r5, r1);	 Catch:{ all -> 0x0050 }
        r5 = defpackage.pry.a;	 Catch:{ all -> 0x004e }
        r0 = "recency";
        r5 = r5.callsite(r0);	 Catch:{ all -> 0x004e }
        r5 = r2.getDbClient(r5);	 Catch:{ all -> 0x004e }
        r0 = r5.getWritableDatabase();	 Catch:{ all -> 0x004e }
        r1 = new com.snap.core.db.record.FriendsFeedScoreModel$ClearAllScores;	 Catch:{ all -> 0x004e }
        r1.<init>(r0);	 Catch:{ all -> 0x004e }
        r1 = (defpackage.ainy) r1;	 Catch:{ all -> 0x004e }
        r5.executeUpdateDelete(r1);	 Catch:{ all -> 0x004e }
        r1 = new com.snap.core.db.record.FriendsFeedScoreModel$SetAllScoresByRecency;	 Catch:{ all -> 0x004e }
        r1.<init>(r0);	 Catch:{ all -> 0x004e }
        r1 = (defpackage.ainy) r1;	 Catch:{ all -> 0x004e }
        r5.executeUpdateDelete(r1);	 Catch:{ all -> 0x004e }
        r5 = defpackage.qxa.a.RANKING;	 Catch:{ all -> 0x0050 }
        r4 = r4.a();	 Catch:{ all -> 0x0050 }
        if (r4 == 0) goto L_0x004d;
    L_0x0048:
        r4 = r3.h;	 Catch:{ all -> 0x0050 }
        r4.a(r5);	 Catch:{ all -> 0x0050 }
    L_0x004d:
        return;
    L_0x004e:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0050 }
    L_0x0050:
        r4 = move-exception;
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxz.a(qxt, com.snap.core.db.api.DbTransaction):void");
    }

    public final ajcx b(aelz aelz) {
        akcr.b(aelz, EventType.RESPONSE);
        aegb aegb = aelz.a;
        if (aegb != null) {
            List list = aegb.f;
            if (list != null) {
                quq quq = this.f;
                akcr.b(list, "emptyGroups");
                ajcx runInTransaction = quq.b.runInTransaction("grp:emptySeq", new d(quq, list));
                if (runInTransaction != null) {
                    return runInTransaction;
                }
            }
        }
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final FriendsFeedHttpInterface b() {
        return (FriendsFeedHttpInterface) this.m.b();
    }

    /* Access modifiers changed, original: final */
    public final qye c() {
        return (qye) this.n.b();
    }

    public final SnapDb d() {
        return (SnapDb) this.o.b();
    }

    /* Access modifiers changed, original: final */
    public final DbClient e() {
        return (DbClient) this.p.b();
    }

    /* Access modifiers changed, original: final */
    public final yhz f() {
        return (yhz) this.t.b();
    }

    /* Access modifiers changed, original: final */
    public final rab g() {
        return (rab) this.u.b();
    }

    public final ajcx h() {
        Object e = ajdx.c((Callable) new qyc(new o(this.w))).a((ajfc) p.a).e((ajfc) new q(this));
        akcr.a(e, "Single.fromCallable(mess…e()\n                    }");
        return e;
    }
}
