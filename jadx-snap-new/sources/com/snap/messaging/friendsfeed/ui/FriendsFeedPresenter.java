package com.snap.messaging.friendsfeed.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnFlingListener;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.LayoutInflater;
import android.view.View;
import com.brightcove.player.event.Event;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.query.LegacyFriendsFeedQueries.WithFriendAndStory;
import com.snap.core.db.record.InteractionMessagesRecord;
import com.snap.core.db.record.MultiRecipientSendingSnapRecord;
import com.snap.core.db.record.MultiRecipientSendingSnapRecord.SendingMessage;
import com.snap.ui.avatar.AvatarCache;
import com.snap.ui.view.emoji.SnapEmojiSpanFactory;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.achb;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajfq;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.ajwa;
import defpackage.ajwl;
import defpackage.ajwm;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.ajzl;
import defpackage.ajzm;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akez;
import defpackage.akff;
import defpackage.akfh;
import defpackage.eyn;
import defpackage.ftl;
import defpackage.fxi;
import defpackage.gpb;
import defpackage.gqr;
import defpackage.hmm;
import defpackage.idj;
import defpackage.igk;
import defpackage.ihi;
import defpackage.iqs;
import defpackage.iqt;
import defpackage.iqy;
import defpackage.iqz;
import defpackage.ith;
import defpackage.itp;
import defpackage.jri;
import defpackage.jtg;
import defpackage.jth;
import defpackage.jur;
import defpackage.jut;
import defpackage.kcl;
import defpackage.prd;
import defpackage.prx;
import defpackage.qus;
import defpackage.qvg;
import defpackage.qwi;
import defpackage.qwk;
import defpackage.qwy;
import defpackage.qxa;
import defpackage.qxb;
import defpackage.qxk;
import defpackage.qxl;
import defpackage.qxo;
import defpackage.qxt;
import defpackage.qzl;
import defpackage.qzm;
import defpackage.qzn;
import defpackage.qzq;
import defpackage.qzs;
import defpackage.rad;
import defpackage.rai;
import defpackage.raj;
import defpackage.ral;
import defpackage.ran;
import defpackage.raq;
import defpackage.rar;
import defpackage.ras;
import defpackage.rbe;
import defpackage.rbj;
import defpackage.rbk;
import defpackage.rbp;
import defpackage.rbr;
import defpackage.rcb;
import defpackage.rcx;
import defpackage.rcy;
import defpackage.rcz;
import defpackage.rdc;
import defpackage.rdd;
import defpackage.rdf;
import defpackage.rdg;
import defpackage.rdh;
import defpackage.rdt;
import defpackage.sea;
import defpackage.tnj;
import defpackage.yhu;
import defpackage.yic;
import defpackage.yig;
import defpackage.ypo;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgm;
import defpackage.zgo;
import defpackage.ziv;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zlk;
import defpackage.zll;
import defpackage.zlv;
import defpackage.zlx;
import defpackage.zmh;
import defpackage.zms;
import defpackage.zmu;
import defpackage.zmy;
import defpackage.znh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FriendsFeedPresenter extends zll<zlk> implements defpackage.k {
    public final ajwl<Boolean> A;
    public final jth B;
    public final jth C;
    final raj D;
    ajej E;
    final ajxe F;
    final ajxe G;
    final ajxe H;
    final ajxe I;
    final ajxe J;
    final qwy K;
    public final qzn L;
    final qwk M;
    final qzq N;
    final hmm O;
    public final qzs P;
    public final yhu Q;
    public final qzl R;
    final AvatarCache S;
    public final gpb T;
    final rad U;
    final rbp V;
    final ihi W;
    final rbe X;
    public final qwi Y;
    final rbk Z;
    public final zfw a = zgb.a(qxo.b.callsite("Presenter"));
    private final kcl aA;
    final prd aa;
    final qzm ab;
    final qzm ac;
    public final qxa ad;
    public final sea ae;
    public final ajdx<qxl> af;
    final ajwy<fxi> ag;
    final ajwy<SnapEmojiSpanFactory> ah;
    final ajwy<gqr> ai;
    public final ajwy<eyn> aj;
    final achb<zjm, zjk> ak;
    final ajwy<iqy> al;
    private final ajxe am;
    private final ajxe an;
    private final ajxe ao;
    private final ajxe ap;
    private final ajxe aq;
    private boolean ar;
    private final ajcx as;
    private final ajcx at;
    private ajcx au;
    private final n av;
    private final p aw;
    private final q ax;
    private final zgb ay;
    private final qxk az;
    ajcx b;
    ral c;
    zms d;
    zkf e;
    public zmh f;
    ItemDecoration g;
    ItemAnimator h;
    final ajxe i;
    final ajxe j;
    final ajxe k;
    int l;
    public zmu m;
    public boolean n;
    final ajwm o;
    boolean p;
    public final ajwl<Boolean> q;
    public final ajwl<Boolean> r;
    ajwl<Integer> s;
    ajwo<Integer> t;
    rcz u;
    long v;
    boolean w;
    boolean x;
    int y;
    public ajei z;

    static final class a extends akcq implements akbk<ftl> {
        a(ajwy ajwy) {
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
            return (ftl) ((ajwy) this.receiver).get();
        }
    }

    static final class ad extends akcq implements akbk<ypo> {
        ad(ajwy ajwy) {
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
            return (ypo) ((ajwy) this.receiver).get();
        }
    }

    static final class am extends akcq implements akbk<yig> {
        am(ajwy ajwy) {
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
            return (yig) ((ajwy) this.receiver).get();
        }
    }

    static final class al<T, R> implements ajfc<prx, ajdb> {
        public static final al a = new al();

        al() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "api");
            return prx.b();
        }
    }

    public static final class h implements raj {
        final /* synthetic */ FriendsFeedPresenter a;

        static final class a extends akcs implements akbl<Integer, Integer> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Integer.valueOf(((Number) obj).intValue() + 1);
            }
        }

        static final class b extends akcs implements akbl<Integer, zmy> {
            private /* synthetic */ h a;

            b(h hVar) {
                this.a = hVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return FriendsFeedPresenter.a(this.a.a).a(((Number) obj).intValue());
            }
        }

        h(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        public final long a(long j) {
            int i = 0;
            Integer valueOf = Integer.valueOf(0);
            int i2 = 0;
            for (Object next : akfh.c(akfh.b(akff.a(valueOf, a.a), FriendsFeedPresenter.a(this.a).getItemCount()), new b(this))) {
                if (i2 < 0) {
                    ajym.a();
                }
                zmy zmy = (zmy) next;
                Object next2 = ((zmy instanceof rdt) && ((rdt) zmy).L._id() == j) ? 1 : null;
                if (next2 != null) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            FriendsFeedPresenter friendsFeedPresenter = this.a;
            akez a = akff.a(valueOf, k.a);
            zmh zmh = friendsFeedPresenter.f;
            if (zmh == null) {
                akcr.a("adapter");
            }
            for (Object next3 : akfh.c(akfh.b(a, zmh.getItemCount()), new l(friendsFeedPresenter))) {
                if (i < 0) {
                    ajym.a();
                }
                if (((zmy) next3) instanceof rdt) {
                    break;
                }
                i++;
            }
            i = -1;
            return (long) (i2 - i);
        }
    }

    static final class b extends akcs implements akbk<ajdp<znh<WithFriendAndStory>>> {
        final /* synthetic */ FriendsFeedPresenter a;

        /* renamed from: com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$b$1 */
        static final class AnonymousClass1<T> implements ajfb<Integer> {
            private /* synthetic */ b a;

            AnonymousClass1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (this.a.a.o.i()) {
                    this.a.a.r.a(Boolean.TRUE);
                }
            }
        }

        /* renamed from: com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$b$3 */
        static final class AnonymousClass3<T> implements ajfb<List<? extends WithFriendAndStory>> {
            private /* synthetic */ b a;

            AnonymousClass3(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                List list = (List) obj;
                this.a.a.l = list.size();
                this.a.a.p = true;
            }
        }

        /* renamed from: com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$b$4 */
        static final class AnonymousClass4<T> implements ajfb<List<? extends WithFriendAndStory>> {
            private /* synthetic */ b a;

            AnonymousClass4(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (this.a.a.o.i()) {
                    this.a.a.r.a(Boolean.FALSE);
                }
            }
        }

        b(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.s.b((ajdw) this.a.a.i()).d((ajfb) new AnonymousClass1(this)).u(new rar(new akbl<Integer, ajdp<List<? extends WithFriendAndStory>>>(this.a.K) {
                public final String getName() {
                    return "getLatest";
                }

                public final akej getOwner() {
                    return akde.a(qwy.class);
                }

                public final String getSignature() {
                    return "getLatest(I)Lio/reactivex/Observable;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return ((qwy) this.receiver).a(((Number) obj).intValue());
                }
            })).d((ajfb) new AnonymousClass3(this)).b((ajfb) new AnonymousClass4(this)).p(AnonymousClass5.a);
        }
    }

    static final class u extends akcs implements akbk<ajdp<znh<SendingMessage>>> {
        private /* synthetic */ FriendsFeedPresenter a;

        u(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            qvg qvg = this.a.K.b;
            Object obj = MultiRecipientSendingSnapRecord.FACTORY;
            akcr.a(obj, "MultiRecipientSendingSnapRecord.FACTORY");
            obj = obj.getSendingMessages();
            akcr.a(obj, "MultiRecipientSendingSna…d.FACTORY.sendingMessages");
            Object p = qvg.b.queryAndMapToList("ff:multi", obj, new defpackage.qvg.c(MultiRecipientSendingSnapRecord.SENDING_MESSAGE_ROW_MAPPER)).p(new defpackage.qvg.d(qvg));
            akcr.a(p, "briteDatabase.queryAndMa…oList()\n                }");
            return p.p(AnonymousClass1.a);
        }
    }

    static final class ai extends akcs implements akbk<ajdp<znh<itp>>> {
        private /* synthetic */ FriendsFeedPresenter a;

        ai(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.K.a(FriendSuggestionPlacement.FEED_PAGE).b((ajdw) this.a.a.i()).a((ajdw) this.a.a.i()).p(AnonymousClass1.a);
        }
    }

    static final class ah extends akcs implements akbk<ajdp<znh<itp>>> {
        private /* synthetic */ FriendsFeedPresenter a;

        ah(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.K.a(FriendSuggestionPlacement.FEED_PAGE_HORIZONTAL).b((ajdw) this.a.a.i()).a((ajdw) this.a.a.i()).p(AnonymousClass1.a);
        }
    }

    static final class v extends akcs implements akbk<ajdp<Long>> {
        private /* synthetic */ FriendsFeedPresenter a;

        v(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.K.b().i().b((ajdw) this.a.a.i()).a((ajdw) this.a.a.i());
        }
    }

    public static final class n extends OnScrollListener {
        final /* synthetic */ FriendsFeedPresenter a;

        static final class a implements Runnable {
            private /* synthetic */ n a;
            private /* synthetic */ long b;

            a(n nVar, long j) {
                this.a = nVar;
                this.b = j;
            }

            public final void run() {
                qxb b = this.a.a.b();
                zgm zgm = b.a;
                if (zgm != null) {
                    zgm.a();
                }
                b.a = null;
            }
        }

        n(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:49:0x00d6 in {8, 14, 21, 22, 23, 25, 26, 28, 29, 31, 37, 38, 43, 46, 48} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void onScrolled(android.support.v7.widget.RecyclerView r9, int r10, int r11) {
            /*
            r8 = this;
            r0 = "recyclerView";
            defpackage.akcr.b(r9, r0);
            r9 = r8.a;
            r9 = r9.w;
            r0 = 0;
            if (r9 != 0) goto L_0x00ab;
            r9 = r8.a;
            r1 = r9.o;
            r1 = r1.i();
            r2 = 0;
            r3 = 1;
            if (r1 == 0) goto L_0x007c;
            r4 = r9.v;
            r6 = 0;
            r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r1 <= 0) goto L_0x007c;
            r1 = java.lang.Integer.valueOf(r2);
            r4 = com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter.i.a;
            r4 = (defpackage.akbl) r4;
            r1 = defpackage.akff.a(r1, r4);
            r4 = r9.f;
            if (r4 != 0) goto L_0x0035;
            r5 = "adapter";
            defpackage.akcr.a(r5);
            r4 = r4.getItemCount();
            r1 = defpackage.akfh.b(r1, r4);
            r4 = new com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$j;
            r4.<init>(r9);
            r4 = (defpackage.akbl) r4;
            r9 = defpackage.akfh.c(r1, r4);
            r9 = r9.iterator();
            r1 = r9.hasNext();
            if (r1 == 0) goto L_0x0078;
            r1 = r9.next();
            r1 = (defpackage.zlv) r1;
            r4 = r1 instanceof defpackage.ras;
            if (r4 != 0) goto L_0x005d;
            r1 = r0;
            r1 = (defpackage.ras) r1;
            if (r1 == 0) goto L_0x0073;
            r1 = (defpackage.ras) r1;
            r4 = defpackage.ras.FEED_LIST_ITEM;
            if (r1 == r4) goto L_0x006e;
            r4 = defpackage.ras.FEED_LIST_ITEM_SDL;
            if (r1 != r4) goto L_0x006c;
            goto L_0x006e;
            r1 = 0;
            goto L_0x006f;
            r1 = 1;
            if (r1 != r3) goto L_0x0073;
            r1 = 1;
            goto L_0x0074;
            r1 = 0;
            if (r1 == 0) goto L_0x004c;
            r9 = 1;
            goto L_0x0079;
            r9 = 0;
            if (r9 == 0) goto L_0x007c;
            r2 = 1;
            if (r2 == 0) goto L_0x00ab;
            if (r10 != 0) goto L_0x00ab;
            if (r11 != 0) goto L_0x00ab;
            r9 = android.os.SystemClock.elapsedRealtime();
            r11 = r8.a;
            r11 = r11.getTarget();
            r11 = (defpackage.zlk) r11;
            if (r11 == 0) goto L_0x0093;
            r11.w();
            r11 = r8.a;
            r11 = r11.a;
            r11 = r11.b();
            r11 = (defpackage.ajdw) r11;
            r1 = new com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$n$a;
            r1.<init>(r8, r9);
            r1 = (java.lang.Runnable) r1;
            r11.a(r1);
            r9 = r8.a;
            r9.w = r3;
            r9 = r8.a;
            r9 = r9.getTarget();
            r9 = (defpackage.zlk) r9;
            if (r9 == 0) goto L_0x00bf;
            r9 = r9.d();
            if (r9 == 0) goto L_0x00bf;
            r0 = r9.getLayoutManager();
            if (r0 == 0) goto L_0x00ce;
            r0 = (android.support.v7.widget.LinearLayoutManager) r0;
            r9 = r0.findFirstVisibleItemPosition();
            r10 = r8.a;
            r10 = r10.M;
            r10.a = r9;
            return;
            r9 = new ajxt;
            r10 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager";
            r9.<init>(r10);
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$n.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
        }
    }

    public static final class p extends OnFlingListener {
        private /* synthetic */ FriendsFeedPresenter a;

        p(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        public final boolean onFling(int i, int i2) {
            if (this.a.p) {
                Object p = this.a.r.p();
                if (p == null) {
                    akcr.a();
                }
                if (!((Boolean) p).booleanValue() && (!(i == 0 && i2 == 0) && i2 >= 7500)) {
                    if (this.a.x) {
                        this.a.x = false;
                    } else {
                        FriendsFeedPresenter friendsFeedPresenter = this.a;
                        friendsFeedPresenter.x = true;
                        FriendsFeedPresenter.b(friendsFeedPresenter);
                    }
                }
            }
            return false;
        }
    }

    public static final class q extends OnScrollListener {
        private /* synthetic */ FriendsFeedPresenter a;

        q(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            akcr.b(recyclerView, "recyclerView");
            if (i != 0) {
                this.a.e();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            akcr.b(recyclerView, "recyclerView");
            if (this.a.p) {
                Object p = this.a.r.p();
                if (p == null) {
                    akcr.a();
                }
                if (!(((Boolean) p).booleanValue() || (i == 0 && i2 == 0))) {
                    Object p2 = this.a.s.p();
                    if (p2 == null) {
                        akcr.a();
                    }
                    akcr.a(p2, "queryLimitSubject.value!!");
                    i = ((Number) p2).intValue();
                    LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        Object obj = this.a.l - ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() < 5 ? 1 : null;
                        if (obj == null || this.a.x) {
                            if ((obj == null || !this.a.x) && obj == null) {
                                this.a.x = false;
                            }
                            return;
                        }
                        if (i <= this.a.l) {
                            this.a.s.a(Integer.valueOf(i + 20));
                        }
                        FriendsFeedPresenter friendsFeedPresenter = this.a;
                        friendsFeedPresenter.x = true;
                        FriendsFeedPresenter.b(friendsFeedPresenter);
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                }
            }
        }
    }

    static final class w<V> implements Callable<Object> {
        private /* synthetic */ FriendsFeedPresenter a;
        private /* synthetic */ Activity b;

        w(FriendsFeedPresenter friendsFeedPresenter, Activity activity) {
            this.a = friendsFeedPresenter;
            this.b = activity;
        }

        private ajej a() {
            Throwable th;
            String str = Event.CONFIGURATION;
            String str2 = "bus.eventDispatcher";
            try {
                FriendsFeedPresenter friendsFeedPresenter = this.a;
                FriendsFeedPresenter friendsFeedPresenter2 = this.a;
                Context context = this.b;
                rbk rbk = friendsFeedPresenter2.Z;
                qzm qzm = friendsFeedPresenter2.ab;
                qzm qzm2 = friendsFeedPresenter2.ac;
                ajdp ajdp = friendsFeedPresenter2.q;
                qzn qzn = friendsFeedPresenter2.L;
                yic yic = friendsFeedPresenter2.N;
                rbe rbe = friendsFeedPresenter2.X;
                ihi ihi = friendsFeedPresenter2.W;
                ajdp ajdp2 = (ajdp) friendsFeedPresenter2.F.b();
                ajwo ajwo = friendsFeedPresenter2.t;
                String str3 = str;
                ajwm ajwm = friendsFeedPresenter2.o;
                ajwo ajwo2 = ajwo;
                ajdp c = friendsFeedPresenter2.T.c();
                String str4 = str2;
                akcr.a((Object) c, "userAuth.observeUserSession()");
                ajcx ajcx = friendsFeedPresenter2.b;
                FriendsFeedPresenter friendsFeedPresenter3 = friendsFeedPresenter;
                zfw zfw = friendsFeedPresenter2.a;
                ajdp ajdp3 = c;
                ajdp a = ((iqz) friendsFeedPresenter2.K.a.b()).a();
                qwi qwi = friendsFeedPresenter2.Y;
                Object obj = friendsFeedPresenter2.ah.get();
                try {
                    zms zms;
                    akcr.a(obj, "snapEmojiSpanFactory.get()");
                    SnapEmojiSpanFactory snapEmojiSpanFactory = (SnapEmojiSpanFactory) obj;
                    ajwy ajwy = friendsFeedPresenter2.ai;
                    obj = friendsFeedPresenter2.aj.get();
                    ajwy ajwy2 = ajwy;
                    akcr.a(obj, "cognacFeedDataProvider.get()");
                    qwi qwi2 = qwi;
                    rcz rcz = r6;
                    rcz rcz2 = new rcz(context, rbk, qzm, qzm2, ajdp, qzn, yic, rbe, ihi, ajdp2, ajwo2, ajwm, ajdp3, ajcx, zfw, a, qwi2, snapEmojiSpanFactory, ajwy2, (eyn) obj, friendsFeedPresenter2.O, ((yig) friendsFeedPresenter2.k.b()).d());
                    igk.a(rcz.c().l(), this.a.z);
                    friendsFeedPresenter3.u = rcz;
                    this.a.c = (ral) igk.a(new ral(this.a.S, this.a.a, this.a.U, this.a.W, this.a.D, this.a.aa, this.a.ab, this.a.ac, this.a.L, this.a.N), this.a.z);
                    FriendsFeedPresenter friendsFeedPresenter4 = this.a;
                    ral ral = this.a.c;
                    if (ral == null) {
                        akcr.a("bindingContext");
                    }
                    friendsFeedPresenter4.d = new zms((zlx) ral, (Collection) ajym.d(ras.class, jri.class));
                    friendsFeedPresenter4 = this.a;
                    FriendsFeedPresenter friendsFeedPresenter5 = this.a;
                    Context context2 = this.b;
                    String str5 = "viewFactory";
                    if (friendsFeedPresenter5.m == null) {
                        zms = friendsFeedPresenter5.d;
                        if (zms == null) {
                            akcr.a(str5);
                        }
                        ajdw h = friendsFeedPresenter5.a.h();
                        Object from = LayoutInflater.from(context2);
                        akcr.a(from, "LayoutInflater.from(context)");
                        RecyclerView recyclerView = new RecyclerView(context2);
                        recyclerView.setLayoutManager(new LinearLayoutManager(context2));
                        friendsFeedPresenter5.m = new zmu(zms, h, from, recyclerView);
                    }
                    zms = friendsFeedPresenter5.d;
                    if (zms == null) {
                        akcr.a(str5);
                    }
                    zmu zmu = friendsFeedPresenter5.m;
                    if (zmu == null) {
                        akcr.a("viewPrefetcher");
                    }
                    zms.setViewHolderPrefetcher(zmu);
                    int b = abtp.b(context2);
                    friendsFeedPresenter5.y = context2.getResources().getDimensionPixelOffset(R.dimen.neon_header_height);
                    Object a2 = friendsFeedPresenter5.Z.a().a((ajfc) new aa(friendsFeedPresenter5, (int) ((float) Math.ceil((double) (((float) (b - friendsFeedPresenter5.y)) / context2.getResources().getDimension(R.dimen.ff_feed_list_item_height))))), false);
                    akcr.a(a2, "friendsFeedConfig.observ…ews\") }\n                }");
                    a2 = a2.d();
                    akcr.a(a2, "preloadViews(context).cache()");
                    friendsFeedPresenter4.b = a2;
                    igk.a(this.a.b.e(), this.a.z);
                    this.a.e = (zkf) igk.a(new zkf(), this.a.z);
                    friendsFeedPresenter4 = this.a;
                    Activity activity = this.b;
                    try {
                        zfw = zgb.a(qxo.b.callsite("Adapter"));
                        zms zms2 = friendsFeedPresenter4.d;
                        if (zms2 == null) {
                            akcr.a(str5);
                        }
                        zkf zkf = friendsFeedPresenter4.e;
                        String str6 = "bus";
                        if (zkf == null) {
                            akcr.a(str6);
                        }
                        zke a3 = zkf.a();
                        String str7 = str4;
                        akcr.a((Object) a3, str7);
                        ajdw h2 = zfw.h();
                        ajdw l = zfw.l();
                        List arrayList = new ArrayList();
                        arrayList.add(new rdf());
                        arrayList.add(new rdg(activity, friendsFeedPresenter4.V));
                        arrayList.add(new rdd(activity, (ajdp) friendsFeedPresenter4.G.b()));
                        Context baseContext = activity.getBaseContext();
                        akcr.a((Object) baseContext, "activity.baseContext");
                        zms zms3 = friendsFeedPresenter4.d;
                        if (zms3 == null) {
                            akcr.a(str5);
                        }
                        zkf zkf2 = friendsFeedPresenter4.e;
                        if (zkf2 == null) {
                            akcr.a(str6);
                        }
                        zke a4 = zkf2.a();
                        akcr.a((Object) a4, str7);
                        ajdp ajdp4 = (ajdp) friendsFeedPresenter4.I.b();
                        ajdp ajdp5 = friendsFeedPresenter4.Z.a;
                        zlv zlv = jri.FRIENDS_FEED_QUICK_ADD_CAROUSEL;
                        zlv zlv2 = jri.FRIENDS_FEED_QUICK_ADD_CAROUSEL_ITEM;
                        idj page = qxo.b.getPage();
                        String name = qxo.b.getName();
                        ajdp ajdp6 = friendsFeedPresenter4.q;
                        jth jth = friendsFeedPresenter4.C;
                        zkf zkf3 = friendsFeedPresenter4.e;
                        if (zkf3 == null) {
                            akcr.a(str6);
                        }
                        ftl c2 = friendsFeedPresenter4.c();
                        ajdw ajdw = l;
                        String str8 = str3;
                        akcr.a((Object) c2, str8);
                        ajdw ajdw2 = h2;
                        jur jur = new jur(baseContext, zms3, a4, ajdp4, ajdp5, zlv, zlv2, page, name, ajdp6, jth, zkf3, c2, friendsFeedPresenter4.a);
                        rcz rcz3 = friendsFeedPresenter4.u;
                        if (rcz3 == null) {
                            akcr.a("friendsFeedItemsSection");
                        }
                        arrayList.add(new rcx(rcz3, jur, friendsFeedPresenter4.o));
                        akcr.b(activity, Event.ACTIVITY);
                        Context context3 = activity;
                        ajcx ajcx2 = friendsFeedPresenter4.o;
                        ajdp ajdp7 = (ajdp) friendsFeedPresenter4.H.b();
                        a = friendsFeedPresenter4.Z.d;
                        jth jth2 = friendsFeedPresenter4.B;
                        ajdp ajdp8 = friendsFeedPresenter4.q;
                        idj page2 = qxo.b.getPage();
                        String name2 = qxo.b.getName();
                        iqt iqt = iqt.FRIENDS_FEED;
                        ith ith = ith.QUICK_ADD_LIST_ON_FRIENDS_FEED;
                        zfw zfw2 = friendsFeedPresenter4.a;
                        ftl c3 = friendsFeedPresenter4.c();
                        akcr.a((Object) c3, str8);
                        ypo ypo = (ypo) friendsFeedPresenter4.j.b();
                        akcr.a((Object) ypo, "publicUserStoriesSyncableSection");
                        jut jut = new jut(context3, ajcx2, ajdp7, a, jth2, ajdp8, page2, name2, iqt, ith, zfw2, c3, null, null, false, null, null, false, false, ypo, 389120);
                        arrayList.add(jut);
                        zkf zkf4 = friendsFeedPresenter4.e;
                        if (zkf4 == null) {
                            akcr.a(str6);
                        }
                        zkf4.a(jut);
                        arrayList.add(new rcy(activity, friendsFeedPresenter4.o, (ajdp) friendsFeedPresenter4.J.b(), friendsFeedPresenter4.V, friendsFeedPresenter4.A, friendsFeedPresenter4.Z.c));
                        arrayList.add(new rdc(friendsFeedPresenter4.r));
                        friendsFeedPresenter4.f = new zmh(zms2, a3, ajdw2, ajdw, arrayList, 32);
                        zmh zmh = friendsFeedPresenter4.f;
                        if (zmh == null) {
                            akcr.a("adapter");
                        }
                        igk.a(zmh.e(), friendsFeedPresenter4.z);
                        zlk zlk = (zlk) friendsFeedPresenter4.getTarget();
                        if (zlk != null) {
                            zlk.e();
                        }
                        m mVar = new m(friendsFeedPresenter4, activity);
                        Drawable drawable = ContextCompat.getDrawable(activity, R.drawable.ff_stories_list_divider);
                        if (drawable == null) {
                            akcr.a();
                        }
                        mVar.a(drawable);
                        friendsFeedPresenter4.g = mVar;
                        friendsFeedPresenter4.h = ((fxi) friendsFeedPresenter4.ag.get()).c ? null : new ziv("FriendsFeedPresenter");
                        this.a.a().a(this.a.Y);
                        this.a.a().a(this.a.V);
                        this.a.a().a((ajws) this.a.Z.a);
                        this.a.a().a(this.a.Z.f);
                        igk.a(this.a.U, this.a.z);
                        zkf zkf5 = this.a.e;
                        if (zkf5 == null) {
                            akcr.a(str6);
                        }
                        Object a5 = this.a.a();
                        akcr.a(a5, "friendsFeedEventDispatcherInterface");
                        return zkf5.a(new rai(a5));
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    static final class ab<T> implements ajfb<ajej> {
        private /* synthetic */ FriendsFeedPresenter a;

        ab(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            qxb b = this.a.b();
            b.d = b.g.c();
        }
    }

    static final class ac implements ajev {
        private /* synthetic */ FriendsFeedPresenter a;

        ac(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        public final void run() {
            qxb b = this.a.b();
            b.e = b.g.c();
        }
    }

    static final class aa<T, R> implements ajfc<rbj, ajdb> {
        private /* synthetic */ FriendsFeedPresenter a;
        private /* synthetic */ int b;

        /* renamed from: com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$aa$1 */
        static final class AnonymousClass1 implements ajev {
            private /* synthetic */ aa a;

            AnonymousClass1(aa aaVar) {
                this.a = aaVar;
            }

            public final void run() {
            }
        }

        aa(FriendsFeedPresenter friendsFeedPresenter, int i) {
            this.a = friendsFeedPresenter;
            this.b = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            rbj rbj = (rbj) obj;
            akcr.b(rbj, "config");
            igk.a(this.a.o.b(1000, TimeUnit.MILLISECONDS, this.a.a.l()).b((ajdb) this.a.d().a(ajzl.a(ajxs.a(rbj.d ? ras.FEED_LIST_ITEM_SDL : ras.FEED_LIST_ITEM, Integer.valueOf(5))))).e(), this.a.z);
            return this.a.d().a(ajzm.a(ajxs.a(ras.ANCHOR, Integer.valueOf(1)), ajxs.a(ras.LOADING, Integer.valueOf(1)), ajxs.a(ras.BOTTOM_PADDING, Integer.valueOf(1)), ajxs.a(rbj.d ? ras.FEED_LIST_ITEM_SDL : ras.FEED_LIST_ITEM, Integer.valueOf(this.b)))).b((ajev) new AnonymousClass1(this));
        }
    }

    static final class i extends akcs implements akbl<Integer, Integer> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue() + 1);
        }
    }

    static final class ag<T> implements ajfb<ajxm<? extends Boolean, ? extends Boolean>> {
        private /* synthetic */ FriendsFeedPresenter a;

        ag(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            Object obj2 = (Boolean) ajxm.a;
            boolean booleanValue = ((Boolean) ajxm.b).booleanValue();
            akcr.a(obj2, "isVisible");
            if (obj2.booleanValue() && booleanValue) {
                ((iqy) this.a.al.get()).a(this.a.ak);
            }
        }
    }

    static final class j extends akcs implements akbl<Integer, zlv> {
        private /* synthetic */ FriendsFeedPresenter a;

        j(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return FriendsFeedPresenter.a(this.a).b(((Number) obj).intValue());
        }
    }

    static final class aj extends akcq implements akbk<ajxw> {
        aj(FriendsFeedPresenter friendsFeedPresenter) {
            super(0, friendsFeedPresenter);
        }

        public final String getName() {
            return "showLoadingIfNeeded";
        }

        public final akej getOwner() {
            return akde.a(FriendsFeedPresenter.class);
        }

        public final String getSignature() {
            return "showLoadingIfNeeded()V";
        }

        public final /* synthetic */ Object invoke() {
            FriendsFeedPresenter friendsFeedPresenter = (FriendsFeedPresenter) this.receiver;
            if (!friendsFeedPresenter.o.i()) {
                friendsFeedPresenter.r.a(Boolean.TRUE);
            }
            return ajxw.a;
        }
    }

    static final class ak extends akcq implements akbk<ajxw> {
        ak(FriendsFeedPresenter friendsFeedPresenter) {
            super(0, friendsFeedPresenter);
        }

        public final String getName() {
            return "onPrepared";
        }

        public final akej getOwner() {
            return akde.a(FriendsFeedPresenter.class);
        }

        public final String getSignature() {
            return "onPrepared()V";
        }

        public final /* synthetic */ Object invoke() {
            FriendsFeedPresenter friendsFeedPresenter = (FriendsFeedPresenter) this.receiver;
            qxb b = friendsFeedPresenter.b();
            b.b = b.g.c();
            zlk zlk = (zlk) friendsFeedPresenter.getTarget();
            if (zlk != null) {
                defpackage.j lifecycle = zlk.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.a(friendsFeedPresenter);
                }
            }
            qxb b2 = friendsFeedPresenter.b();
            b2.c = b2.g.c();
            return ajxw.a;
        }
    }

    public static final class m extends rdh {
        private /* synthetic */ FriendsFeedPresenter a;
        private /* synthetic */ Activity b;

        m(FriendsFeedPresenter friendsFeedPresenter, Activity activity) {
            this.a = friendsFeedPresenter;
            this.b = activity;
        }

        public final boolean a(View view, RecyclerView recyclerView) {
            akcr.b(view, "view");
            akcr.b(recyclerView, "parent");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != 0) {
                Adapter adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    akcr.a();
                }
                if (childAdapterPosition != adapter.getItemCount() - 1) {
                    return true;
                }
            }
            return false;
        }
    }

    static final class z extends akcq implements akbk<tnj> {
        z(ajwy ajwy) {
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
            return (tnj) ((ajwy) this.receiver).get();
        }
    }

    static final class g extends akcq implements akbk<ran> {
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
            return (ran) ((ajwy) this.receiver).get();
        }
    }

    static final class e extends akcq implements akbk<iqs> {
        e(ajwy ajwy) {
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
            return (iqs) ((ajwy) this.receiver).get();
        }
    }

    static final class o extends akcq implements akbk<qus> {
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
            return (qus) ((ajwy) this.receiver).get();
        }
    }

    static final class f extends akcq implements akbk<qxb> {
        f(ajwy ajwy) {
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
            return (qxb) ((ajwy) this.receiver).get();
        }
    }

    static final class r<V> implements Callable<Object> {
        private /* synthetic */ FriendsFeedPresenter a;
        private /* synthetic */ int b;

        r(FriendsFeedPresenter friendsFeedPresenter, int i) {
            this.a = friendsFeedPresenter;
            this.b = i;
        }

        public final /* synthetic */ Object call() {
            this.a.a(this.b);
            return ajxw.a;
        }
    }

    public static final class x<V> implements Callable<T> {
        private /* synthetic */ FriendsFeedPresenter a;

        public x(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        public final /* synthetic */ Object call() {
            DbClient dbClient = ((qus) this.a.i.b()).a;
            Object newContentFeedPosition = InteractionMessagesRecord.Companion.getFACTORY().getNewContentFeedPosition(LocalMessageBodyType.SILENT_LOCAL_MESSAGE_BODY_TYPES);
            akcr.a(newContentFeedPosition, "InteractionMessagesRecor…LOCAL_MESSAGE_BODY_TYPES)");
            Object newContentFeedPositionMapper = InteractionMessagesRecord.Companion.getFACTORY().getNewContentFeedPositionMapper();
            akcr.a(newContentFeedPositionMapper, "InteractionMessagesRecor…ContentFeedPositionMapper");
            return Integer.valueOf((int) ((Number) dbClient.queryFirst(newContentFeedPosition, newContentFeedPositionMapper, Long.valueOf(0))).longValue());
        }
    }

    public static final class af<T, R> implements ajfc<qxl, ajdb> {
        public static final af a = new af();

        af() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            qxl qxl = (qxl) obj;
            akcr.b(qxl, "it");
            return qxl.a(qxt.PULL_TO_REFRESH);
        }
    }

    static final class c<T> implements ajfb<Boolean> {
        final /* synthetic */ FriendsFeedPresenter a;

        /* renamed from: com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$c$1 */
        static final class AnonymousClass1<T> implements ajfl<Throwable> {
            private /* synthetic */ c a;

            AnonymousClass1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ boolean test(Object obj) {
                akcr.b((Throwable) obj, "it");
                return false;
            }
        }

        /* renamed from: com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$c$2 */
        static final class AnonymousClass2 implements ajev {
            private /* synthetic */ c a;

            AnonymousClass2(c cVar) {
                this.a = cVar;
            }

            public final void run() {
                this.a.a.r.a(Boolean.FALSE);
                int i = this.a.a.l;
                Object p = this.a.a.s.p();
                if (p == null) {
                    akcr.a();
                }
                akcr.a(p, "queryLimitSubject.value!!");
                int intValue = ((Number) p).intValue();
                if (intValue <= i || intValue - i < 20) {
                    intValue += 20;
                }
                this.a.a.s.a(Integer.valueOf(intValue));
            }
        }

        c(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "it");
            if (obj.booleanValue()) {
                this.a.E.dispose();
                FriendsFeedPresenter friendsFeedPresenter = this.a;
                Object a = friendsFeedPresenter.a().a(new rcb(qxt.PAGINATION)).b((ajdw) this.a.a.g()).a((ajdw) this.a.a.l()).a((ajfl) new AnonymousClass1(this)).a((ajev) new AnonymousClass2(this), (ajfb) AnonymousClass3.a);
                akcr.a(a, "friendsFeedEventDispatch…ble, \"Error on sync.\") })");
                friendsFeedPresenter.E = a;
                return;
            }
            if (this.a.o.i()) {
                this.a.r.a(Boolean.FALSE);
            }
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ FriendsFeedPresenter a;

        d(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.r.a(Boolean.FALSE);
        }
    }

    static final class s<T> implements ajfb<ajej> {
        private /* synthetic */ FriendsFeedPresenter a;
        private /* synthetic */ int b;

        s(FriendsFeedPresenter friendsFeedPresenter, int i) {
            this.a = friendsFeedPresenter;
            this.b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.s.a(Integer.valueOf(this.b));
        }
    }

    static final class t implements ajev {
        private /* synthetic */ FriendsFeedPresenter a;
        private /* synthetic */ int b;

        t(FriendsFeedPresenter friendsFeedPresenter, int i) {
            this.a = friendsFeedPresenter;
            this.b = i;
        }

        public final void run() {
            this.a.a(this.b + 1 < FriendsFeedPresenter.a(this.a).getItemCount() ? this.b + 1 : this.b);
        }
    }

    public static final class ae extends akcs implements akbl<Throwable, ajxw> {
        public static final ae a = new ae();

        ae() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "throwable");
            return ajxw.a;
        }
    }

    static final class k extends akcs implements akbl<Integer, Integer> {
        public static final k a = new k();

        k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue() + 1);
        }
    }

    static final class l extends akcs implements akbl<Integer, zmy> {
        private /* synthetic */ FriendsFeedPresenter a;

        l(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = friendsFeedPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return FriendsFeedPresenter.a(this.a).a(((Number) obj).intValue());
        }
    }

    public static final class y extends akcq implements akbl<Integer, ajcx> {
        public y(FriendsFeedPresenter friendsFeedPresenter) {
            super(1, friendsFeedPresenter);
        }

        public final String getName() {
            return "loadAndScrollToPosition";
        }

        public final akej getOwner() {
            return akde.a(FriendsFeedPresenter.class);
        }

        public final String getSignature() {
            return "loadAndScrollToPosition(I)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            int intValue = ((Number) obj).intValue();
            FriendsFeedPresenter friendsFeedPresenter = (FriendsFeedPresenter) this.receiver;
            zmh zmh = friendsFeedPresenter.f;
            if (zmh == null) {
                akcr.a("adapter");
            }
            if (intValue < zmh.getItemCount()) {
                obj = ajcx.b((Callable) new r(friendsFeedPresenter, intValue));
                str = "Completable.fromCallable…et(pos)\n                }";
            } else {
                obj = friendsFeedPresenter.t.c(1).e((ajfb) new s(friendsFeedPresenter, ((intValue / 20) + 1) * 20)).a((ajdw) friendsFeedPresenter.a.l()).c((ajev) new t(friendsFeedPresenter, intValue)).g();
                str = "feedItemViewModelsSubjec…        .ignoreElements()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(FriendsFeedPresenter.class), "preferences", "getPreferences()Lcom/snap/prefs/Preferences;"), new akdc(akde.a(FriendsFeedPresenter.class), "friendsFeedEventDispatcherInterface", "getFriendsFeedEventDispatcherInterface()Lcom/snap/messaging/friendsfeed/ui/FriendsFeedEventDispatcherInterface;"), new akdc(akde.a(FriendsFeedPresenter.class), "friendActionDispatcher", "getFriendActionDispatcher()Lcom/snap/identity/api/FriendActionDispatchInterface;"), new akdc(akde.a(FriendsFeedPresenter.class), "interactionMessagesRepository", "getInteractionMessagesRepository()Lcom/snap/messaging/db/InteractionMessagesRepository;"), new akdc(akde.a(FriendsFeedPresenter.class), "friendsFeedAnalytics", "getFriendsFeedAnalytics()Lcom/snap/messaging/friendsfeed/analytics/FriendsFeedAnalytics;"), new akdc(akde.a(FriendsFeedPresenter.class), Event.CONFIGURATION, "getConfiguration()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(FriendsFeedPresenter.class), "publicUserStoriesSyncableSection", "getPublicUserStoriesSyncableSection()Lcom/snap/stories/ui/PublicUserStoriesSyncableSection;"), new akdc(akde.a(FriendsFeedPresenter.class), "userStorySettings", "getUserStorySettings()Lcom/snap/stories/api/UserStorySettings;"), new akdc(akde.a(FriendsFeedPresenter.class), "expandingFeedList", "getExpandingFeedList()Lio/reactivex/Observable;"), new akdc(akde.a(FriendsFeedPresenter.class), "multiRecipientList", "getMultiRecipientList()Lio/reactivex/Observable;"), new akdc(akde.a(FriendsFeedPresenter.class), "suggestedFriendsForQuickAddListSectionAllTab", "getSuggestedFriendsForQuickAddListSectionAllTab()Lio/reactivex/Observable;"), new akdc(akde.a(FriendsFeedPresenter.class), "suggestedFriendsForQuickAddCarouselSectionAllTab", "getSuggestedFriendsForQuickAddCarouselSectionAllTab()Lio/reactivex/Observable;"), new akdc(akde.a(FriendsFeedPresenter.class), "mutualFriendsCount", "getMutualFriendsCount()Lio/reactivex/Observable;")};
    }

    public FriendsFeedPresenter(qwy qwy, qzn qzn, qwk qwk, qzq qzq, hmm hmm, qzs qzs, yhu yhu, ajwy<ran> ajwy, qzl qzl, AvatarCache avatarCache, gpb gpb, rad rad, rbp rbp, ihi ihi, rbe rbe, qwi qwi, jtg jtg, zgb zgb, rbk rbk, ajwy<tnj> ajwy2, prd prd, qzm qzm, qzm qzm2, qxk qxk, ajwy<iqs> ajwy3, qxa qxa, ajwy<qus> ajwy4, ajdx<prx> ajdx, sea sea, ajdx<qxl> ajdx2, ajwy<fxi> ajwy5, ajwy<SnapEmojiSpanFactory> ajwy6, ajwy<qxb> ajwy7, ajwy<gqr> ajwy8, ajwy<eyn> ajwy9, ajwy<ftl> ajwy10, achb<zjm, zjk> achb, ajwy<iqy> ajwy11, ajwy<ypo> ajwy12, kcl kcl, ajwy<yig> ajwy13) {
        qwy qwy2 = qwy;
        qzn qzn2 = qzn;
        qwk qwk2 = qwk;
        qzq qzq2 = qzq;
        hmm hmm2 = hmm;
        qzs qzs2 = qzs;
        yhu yhu2 = yhu;
        ajwy<ran> ajwy14 = ajwy;
        qzl qzl2 = qzl;
        AvatarCache avatarCache2 = avatarCache;
        gpb gpb2 = gpb;
        rad rad2 = rad;
        rbp rbp2 = rbp;
        ihi ihi2 = ihi;
        rbe rbe2 = rbe;
        qwi qwi2 = qwi;
        akcr.b(qwy2, "friendsFeedDataProvider");
        akcr.b(qzn2, "fetchSnapStateStore");
        akcr.b(qwk2, "friendsFeedSharedDataStore");
        akcr.b(qzq2, "fetchStoryStateStore");
        akcr.b(hmm2, "storyPrefetchConfiguration");
        akcr.b(qzs2, "storyPrefetcher");
        akcr.b(yhu2, "expiredStoryCleaner");
        akcr.b(ajwy14, "_friendsFeedEventDispatcherInterface");
        akcr.b(qzl2, "friendsFeedNotificationController");
        akcr.b(avatarCache2, "avatarCache");
        akcr.b(gpb2, "userAuth");
        akcr.b(rad2, "tooltipManager");
        akcr.b(rbp2, "topPromptDataSource");
        akcr.b(ihi2, "dateTimeUtils");
        akcr.b(rbe2, "activeConversationManager");
        akcr.b(qwi, "operaSessionManager");
        akcr.b(jtg, "addedMeAndQuickAddSeenListener");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(rbk, "friendsFeedConfig");
        akcr.b(ajwy2, "_preferences");
        akcr.b(prd, "navTracker");
        akcr.b(qzm, "chatSnapFetcher");
        akcr.b(qzm2, "storySnapFetcher");
        akcr.b(qxk, "createChatPresenter");
        akcr.b(ajwy3, "_friendActionDispatcher");
        akcr.b(qxa, "feedAnalytics");
        akcr.b(ajwy4, "_interactionMessagesRepository");
        akcr.b(ajdx, "messagingApi");
        akcr.b(sea, "notificationRemover");
        akcr.b(ajdx2, "friendsFeedApi");
        akcr.b(ajwy5, "lowEndDeviceConfiguration");
        akcr.b(ajwy6, "snapEmojiSpanFactory");
        akcr.b(ajwy7, "friendsFeedAnalyticsProvider");
        akcr.b(ajwy8, "exceptionTracker");
        akcr.b(ajwy9, "cognacFeedDataProvider");
        akcr.b(ajwy10, "_configuration");
        akcr.b(achb, "navigationHost");
        akcr.b(ajwy11, "friendingApi");
        akcr.b(ajwy12, "publicUserStoriesSyncableSectionProvider");
        akcr.b(kcl, "impalaStudySettings");
        akcr.b(ajwy13, "userStorySettingsProvider");
        qwi qwi3 = qwi;
        this.K = qwy2;
        this.L = qzn2;
        this.M = qwk2;
        this.N = qzq2;
        this.O = hmm2;
        this.P = qzs2;
        this.Q = yhu2;
        this.R = qzl2;
        this.S = avatarCache2;
        this.T = gpb2;
        this.U = rad2;
        this.V = rbp2;
        this.W = ihi2;
        this.X = rbe2;
        this.Y = qwi3;
        rbk rbk2 = rbk;
        this.ay = zgb;
        this.Z = rbk2;
        qzm qzm3 = qzm;
        this.aa = prd;
        this.ab = qzm3;
        qxk qxk2 = qxk;
        this.ac = qzm2;
        this.az = qxk2;
        ajwy<qus> ajwy15 = ajwy4;
        this.ad = qxa;
        ajdx<qxl> ajdx3 = ajdx2;
        this.ae = sea;
        this.af = ajdx3;
        ajwy<SnapEmojiSpanFactory> ajwy16 = ajwy6;
        this.ag = ajwy5;
        this.ah = ajwy16;
        ajwy<eyn> ajwy17 = ajwy9;
        this.ai = ajwy8;
        this.aj = ajwy17;
        ajwy<iqy> ajwy18 = ajwy11;
        this.ak = achb;
        this.al = ajwy18;
        ajwy<yig> ajwy19 = ajwy13;
        this.aA = kcl;
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        this.b = a;
        this.am = ajxh.a(new z(ajwy2));
        this.an = ajxh.a(new g(ajwy));
        this.ao = ajxh.a(new e(ajwy3));
        this.i = ajxh.a(new o(ajwy15));
        this.ap = ajxh.a(new f(ajwy7));
        this.aq = ajxh.a(new a(ajwy10));
        this.j = ajxh.a(new ad(ajwy12));
        this.k = ajxh.a(new am(ajwy19));
        a = new ajwm();
        akcr.a(a, "CompletableSubject.create()");
        this.o = a;
        a = ajwl.i(Boolean.FALSE);
        String str = "BehaviorSubject.createDefault(false)";
        akcr.a(a, str);
        this.q = a;
        a = ajwl.i(Boolean.FALSE);
        akcr.a(a, str);
        this.r = a;
        a = ajwl.i(Integer.valueOf(20));
        akcr.a(a, "BehaviorSubject.createDefault(PAGE_SIZE)");
        this.s = a;
        a = new ajwo();
        akcr.a(a, "PublishSubject.create()");
        this.t = a;
        boolean z = true;
        this.ar = true;
        this.z = new ajei();
        this.as = ajvo.a(ajhn.a).b((ajdw) this.a.h()).b(500, TimeUnit.MILLISECONDS);
        Object e = ajdx.e((ajfc) al.a);
        akcr.a(e, "messagingApi\n           …dSnapMessagesAsViewed() }");
        this.at = e;
        this.Z.a().b((ajdw) this.a.h()).l();
        if (this.T.a().e == null) {
            z = false;
        }
        a = ajwl.i(Boolean.valueOf(z));
        akcr.a(a, "BehaviorSubject.createDe…serSession.phone != null)");
        this.A = a;
        jtg jtg2 = jtg;
        this.B = new jth(FriendSuggestionPlacement.FEED_PAGE, jtg2);
        this.C = new jth(FriendSuggestionPlacement.FEED_PAGE_HORIZONTAL, jtg2);
        this.D = new h(this);
        a = ajfq.INSTANCE;
        akcr.a(a, "Disposables.disposed()");
        this.E = a;
        this.F = ajxh.a(new b(this));
        this.G = ajxh.a(new u(this));
        this.H = ajxh.a(new ai(this));
        this.I = ajxh.a(new ah(this));
        this.J = ajxh.a(new v(this));
        this.av = new n(this);
        this.aw = new p(this);
        this.ax = new q(this);
    }

    public static final /* synthetic */ void b(FriendsFeedPresenter friendsFeedPresenter) {
        friendsFeedPresenter.r.a(Boolean.TRUE);
        friendsFeedPresenter.a().g().a((ajdw) friendsFeedPresenter.a.l()).a((ajfb) new c(friendsFeedPresenter), (ajfb) new d(friendsFeedPresenter));
    }

    public final synchronized ajcx a(Activity activity) {
        ajcx ajcx;
        akcr.b(activity, "context");
        if (this.au == null) {
            Object b = ajcx.b((Callable) new w(this, activity));
            akcr.a(b, "Completable.fromCallable…terface))\n        }\n    }");
            this.au = b.c((ajfb) new ab(this)).b((ajev) new ac(this)).b((ajdw) this.a.h()).d();
        }
        ajcx = this.au;
        if (ajcx == null) {
            akcr.a();
        }
        return ajcx;
    }

    public final ran a() {
        return (ran) this.an.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    public final void a(int r4) {
        /*
        r3 = this;
        r0 = r3.getTarget();
        r0 = (defpackage.zlk) r0;
        r1 = 0;
        if (r0 == 0) goto L_0x0014;
    L_0x0009:
        r0 = r0.d();
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r0.getLayoutManager();
        goto L_0x0015;
    L_0x0014:
        r0 = r1;
    L_0x0015:
        r2 = r0 instanceof android.support.v7.widget.LinearLayoutManager;
        if (r2 != 0) goto L_0x001a;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        r0 = (android.support.v7.widget.LinearLayoutManager) r0;
        if (r0 == 0) goto L_0x0023;
    L_0x001e:
        r1 = r3.y;
        r0.scrollToPositionWithOffset(r4, r1);
    L_0x0023:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter.a(int):void");
    }

    /* Access modifiers changed, original: final */
    public final qxb b() {
        return (qxb) this.ap.b();
    }

    /* Access modifiers changed, original: final */
    public final ftl c() {
        return (ftl) this.aq.b();
    }

    public final zmu d() {
        zmu zmu = this.m;
        if (zmu == null) {
            akcr.a("viewPrefetcher");
        }
        return zmu;
    }

    public void dropTarget() {
        this.z.a();
        zlk zlk = (zlk) getTarget();
        if (zlk != null) {
            defpackage.j lifecycle = zlk.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
        a().a(null);
    }

    public final void e() {
        a().f();
    }

    @defpackage.s(a = defpackage.j.a.ON_DESTROY)
    public final void onFragmentDestroy() {
        a().e();
    }

    @defpackage.s(a = defpackage.j.a.ON_PAUSE)
    public final void onFragmentPause() {
        this.at.e();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:46:0x0174 in {3, 6, 7, 9, 16, 19, 20, 22, 27, 29, 32, 35, 40, 41, 43, 45} preds:[]
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
    @defpackage.s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        /*
        r12 = this;
        r0 = r12.ar;	 Catch:{ all -> 0x0172 }
        if (r0 == 0) goto L_0x0009;	 Catch:{ all -> 0x0172 }
        r0 = r12.at;	 Catch:{ all -> 0x0172 }
        r0.e();	 Catch:{ all -> 0x0172 }
        r0 = r12.getTarget();	 Catch:{ all -> 0x0172 }
        r0 = (defpackage.zlk) r0;	 Catch:{ all -> 0x0172 }
        r1 = 0;	 Catch:{ all -> 0x0172 }
        if (r0 == 0) goto L_0x0017;	 Catch:{ all -> 0x0172 }
        r0 = r0.d();	 Catch:{ all -> 0x0172 }
        goto L_0x0018;	 Catch:{ all -> 0x0172 }
        r0 = r1;	 Catch:{ all -> 0x0172 }
        if (r0 != 0) goto L_0x001d;	 Catch:{ all -> 0x0172 }
        defpackage.akcr.a();	 Catch:{ all -> 0x0172 }
        r2 = r0.getAdapter();	 Catch:{ all -> 0x0172 }
        r3 = 0;	 Catch:{ all -> 0x0172 }
        if (r2 != 0) goto L_0x016f;	 Catch:{ all -> 0x0172 }
        r2 = r12.f;	 Catch:{ all -> 0x0172 }
        r4 = "adapter";
        if (r2 != 0) goto L_0x002d;
        defpackage.akcr.a(r4);	 Catch:{ all -> 0x0172 }
        r2 = (android.support.v7.widget.RecyclerView.Adapter) r2;	 Catch:{ all -> 0x0172 }
        r0.setAdapter(r2);	 Catch:{ all -> 0x0172 }
        r2 = r12.h;	 Catch:{ all -> 0x0172 }
        r0.setItemAnimator(r2);	 Catch:{ all -> 0x0172 }
        r2 = r12.U;	 Catch:{ all -> 0x0172 }
        r5 = r12.getTarget();	 Catch:{ all -> 0x0172 }
        r5 = (defpackage.zlk) r5;	 Catch:{ all -> 0x0172 }
        if (r5 == 0) goto L_0x0046;	 Catch:{ all -> 0x0172 }
        r5 = r5.e();	 Catch:{ all -> 0x0172 }
        goto L_0x0047;	 Catch:{ all -> 0x0172 }
        r5 = r1;	 Catch:{ all -> 0x0172 }
        if (r5 != 0) goto L_0x004c;	 Catch:{ all -> 0x0172 }
        defpackage.akcr.a();	 Catch:{ all -> 0x0172 }
        r6 = r12.q;	 Catch:{ all -> 0x0172 }
        r7 = "activity";	 Catch:{ all -> 0x0172 }
        defpackage.akcr.b(r5, r7);	 Catch:{ all -> 0x0172 }
        r7 = "rv";	 Catch:{ all -> 0x0172 }
        defpackage.akcr.b(r0, r7);	 Catch:{ all -> 0x0172 }
        r7 = "visibleSubject";	 Catch:{ all -> 0x0172 }
        defpackage.akcr.b(r6, r7);	 Catch:{ all -> 0x0172 }
        r2.b = r0;	 Catch:{ all -> 0x0172 }
        r7 = r2.k;	 Catch:{ all -> 0x0172 }
        r7 = (android.support.v7.widget.RecyclerView.OnScrollListener) r7;	 Catch:{ all -> 0x0172 }
        r0.addOnScrollListener(r7);	 Catch:{ all -> 0x0172 }
        r7 = 2131429718; // 0x7f0b0956 float:1.8481117E38 double:1.0530662E-314;	 Catch:{ all -> 0x0172 }
        r5 = r5.findViewById(r7);	 Catch:{ all -> 0x0172 }
        r5 = (android.view.ViewGroup) r5;	 Catch:{ all -> 0x0172 }
        r2.a = r5;	 Catch:{ all -> 0x0172 }
        r5 = r2.a;	 Catch:{ all -> 0x0172 }
        r5 = r5 instanceof com.snapchat.android.framework.ui.views.PullToRefreshLayout;	 Catch:{ all -> 0x0172 }
        if (r5 == 0) goto L_0x008d;	 Catch:{ all -> 0x0172 }
        r5 = r2.a;	 Catch:{ all -> 0x0172 }
        if (r5 == 0) goto L_0x0085;	 Catch:{ all -> 0x0172 }
        r5 = (com.snapchat.android.framework.ui.views.PullToRefreshLayout) r5;	 Catch:{ all -> 0x0172 }
        r7 = r2.j;	 Catch:{ all -> 0x0172 }
        r7 = (com.snapchat.android.framework.ui.views.PullToRefreshLayout.a) r7;	 Catch:{ all -> 0x0172 }
        r5.a(r7);	 Catch:{ all -> 0x0172 }
        goto L_0x008d;	 Catch:{ all -> 0x0172 }
        r0 = new ajxt;	 Catch:{ all -> 0x0172 }
        r1 = "null cannot be cast to non-null type com.snapchat.android.framework.ui.views.PullToRefreshLayout";	 Catch:{ all -> 0x0172 }
        r0.<init>(r1);	 Catch:{ all -> 0x0172 }
        throw r0;	 Catch:{ all -> 0x0172 }
        r5 = r2.m;	 Catch:{ all -> 0x0172 }
        r5 = r5.a;	 Catch:{ all -> 0x0172 }
        r7 = r2.e;	 Catch:{ all -> 0x0172 }
        r7 = r7.l();	 Catch:{ all -> 0x0172 }
        r7 = (defpackage.zfr) r7;	 Catch:{ all -> 0x0172 }
        r7 = (defpackage.ajdw) r7;	 Catch:{ all -> 0x0172 }
        r5 = r5.a(r7);	 Catch:{ all -> 0x0172 }
        r7 = new rad$c;	 Catch:{ all -> 0x0172 }
        r7.<init>(r2);	 Catch:{ all -> 0x0172 }
        r7 = (defpackage.ajfb) r7;	 Catch:{ all -> 0x0172 }
        r5 = r5.f(r7);	 Catch:{ all -> 0x0172 }
        r7 = "tooltipRepository.toolti….subscribe{ dismiss(it) }";	 Catch:{ all -> 0x0172 }
        defpackage.akcr.a(r5, r7);	 Catch:{ all -> 0x0172 }
        r7 = r2.h;	 Catch:{ all -> 0x0172 }
        defpackage.ajvv.a(r5, r7);	 Catch:{ all -> 0x0172 }
        r5 = defpackage.rag.values();	 Catch:{ all -> 0x0172 }
        r7 = r5.length;	 Catch:{ all -> 0x0172 }
        r8 = 0;	 Catch:{ all -> 0x0172 }
        if (r8 >= r7) goto L_0x00cb;	 Catch:{ all -> 0x0172 }
        r9 = r5[r8];	 Catch:{ all -> 0x0172 }
        r10 = r2.d;	 Catch:{ all -> 0x0172 }
        r11 = -1;	 Catch:{ all -> 0x0172 }
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x0172 }
        r10.put(r9, r11);	 Catch:{ all -> 0x0172 }
        r8 = r8 + 1;	 Catch:{ all -> 0x0172 }
        goto L_0x00ba;	 Catch:{ all -> 0x0172 }
        r5 = new rad$d;	 Catch:{ all -> 0x0172 }
        r5.<init>(r2, r0);	 Catch:{ all -> 0x0172 }
        r5 = (defpackage.ajfb) r5;	 Catch:{ all -> 0x0172 }
        r5 = r6.f(r5);	 Catch:{ all -> 0x0172 }
        r6 = "visibleSubject.subscribe…}\n            }\n        }";	 Catch:{ all -> 0x0172 }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x0172 }
        r6 = r2.h;	 Catch:{ all -> 0x0172 }
        defpackage.ajvv.a(r5, r6);	 Catch:{ all -> 0x0172 }
        r5 = r2.g;	 Catch:{ all -> 0x0172 }
        r6 = r2.e;	 Catch:{ all -> 0x0172 }
        r6 = r6.l();	 Catch:{ all -> 0x0172 }
        r6 = (defpackage.zfr) r6;	 Catch:{ all -> 0x0172 }
        r6 = (defpackage.ajdw) r6;	 Catch:{ all -> 0x0172 }
        r5 = r5.a(r6);	 Catch:{ all -> 0x0172 }
        r6 = new rad$e;	 Catch:{ all -> 0x0172 }
        r6.<init>(r2);	 Catch:{ all -> 0x0172 }
        r6 = (defpackage.ajfc) r6;	 Catch:{ all -> 0x0172 }
        r5 = r5.p(r6);	 Catch:{ all -> 0x0172 }
        r6 = 1;	 Catch:{ all -> 0x0172 }
        r8 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0172 }
        r5 = r5.e(r6, r8);	 Catch:{ all -> 0x0172 }
        r6 = r2.e;	 Catch:{ all -> 0x0172 }
        r6 = r6.l();	 Catch:{ all -> 0x0172 }
        r6 = (defpackage.zfr) r6;	 Catch:{ all -> 0x0172 }
        r6 = (defpackage.ajdw) r6;	 Catch:{ all -> 0x0172 }
        r5 = r5.a(r6);	 Catch:{ all -> 0x0172 }
        r6 = new rad$f;	 Catch:{ all -> 0x0172 }
        r6.<init>(r2);	 Catch:{ all -> 0x0172 }
        r6 = (defpackage.ajfb) r6;	 Catch:{ all -> 0x0172 }
        r5 = r5.f(r6);	 Catch:{ all -> 0x0172 }
        r6 = "displaySubject.observeOn…      }\n                }";	 Catch:{ all -> 0x0172 }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x0172 }
        r2 = r2.h;	 Catch:{ all -> 0x0172 }
        defpackage.ajvv.a(r5, r2);	 Catch:{ all -> 0x0172 }
        r2 = r12.ax;	 Catch:{ all -> 0x0172 }
        r2 = (android.support.v7.widget.RecyclerView.OnScrollListener) r2;	 Catch:{ all -> 0x0172 }
        r0.addOnScrollListener(r2);	 Catch:{ all -> 0x0172 }
        r2 = r12.av;	 Catch:{ all -> 0x0172 }
        r2 = (android.support.v7.widget.RecyclerView.OnScrollListener) r2;	 Catch:{ all -> 0x0172 }
        r0.addOnScrollListener(r2);	 Catch:{ all -> 0x0172 }
        r2 = r12.aw;	 Catch:{ all -> 0x0172 }
        r2 = (android.support.v7.widget.RecyclerView.OnFlingListener) r2;	 Catch:{ all -> 0x0172 }
        r0.setOnFlingListener(r2);	 Catch:{ all -> 0x0172 }
        r2 = r12.g;	 Catch:{ all -> 0x0172 }
        if (r2 != 0) goto L_0x0144;	 Catch:{ all -> 0x0172 }
        r5 = "dividerItemDecoration";	 Catch:{ all -> 0x0172 }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x0172 }
        r0.addItemDecoration(r2);	 Catch:{ all -> 0x0172 }
        r2 = r12.R;	 Catch:{ all -> 0x0172 }
        r5 = "recyclerView";	 Catch:{ all -> 0x0172 }
        defpackage.akcr.b(r0, r5);	 Catch:{ all -> 0x0172 }
        r2.a = r0;	 Catch:{ all -> 0x0172 }
        r2 = r12.O;	 Catch:{ all -> 0x0172 }
        r2 = r2.f;	 Catch:{ all -> 0x0172 }
        if (r2 == 0) goto L_0x016f;	 Catch:{ all -> 0x0172 }
        r2 = new hpa;	 Catch:{ all -> 0x0172 }
        r5 = r12.f;	 Catch:{ all -> 0x0172 }
        if (r5 != 0) goto L_0x015f;	 Catch:{ all -> 0x0172 }
        defpackage.akcr.a(r4);	 Catch:{ all -> 0x0172 }
        r2.<init>(r0, r5, r1);	 Catch:{ all -> 0x0172 }
        r0 = r12.P;	 Catch:{ all -> 0x0172 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0172 }
        r1 = r12.z;	 Catch:{ all -> 0x0172 }
        r1 = (defpackage.ajfo) r1;	 Catch:{ all -> 0x0172 }
        defpackage.igk.a(r0, r1);	 Catch:{ all -> 0x0172 }
        r12.ar = r3;	 Catch:{ all -> 0x0172 }
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter.onFragmentStart():void");
    }

    @defpackage.s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
        a().d();
    }

    public /* synthetic */ void takeTarget(Object obj) {
        zlk zlk = (zlk) obj;
        akcr.b(zlk, "target");
        this.v = SystemClock.elapsedRealtime();
        qxb b = b();
        long j = this.v;
        b.a = zgo.a("SWIPE_TO_FRIENDS_FEED_VIEW_READY");
        b.f = j;
        super.takeTarget(zlk);
        igk.a(this.as.g(new raq(new aj(this))), this.z);
        rbp rbp = this.V;
        ajdp ajdp = this.q;
        akcr.b(ajdp, "source");
        rbp.d.dispose();
        Object f = ajdp.a((ajdw) rbp.b.f()).f((ajfb) new rbr(new defpackage.rbp.i(rbp.c)));
        akcr.a(f, "source.observeOn(schedul…visibilitySource::onNext)");
        rbp.d = f;
        Activity e = zlk.e();
        if (e == null) {
            akcr.a();
        }
        igk.a(a(e).a((ajdw) this.a.l()).g(new raq(new ak(this))), this.z);
        this.az.a();
        igk.a(ajwa.a(this.q, ((iqy) this.al.get()).e()).b((ajdw) this.a.i()).a((ajdw) this.a.l()).f((ajfb) new ag(this)), this.z);
    }
}
