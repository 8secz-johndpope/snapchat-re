package com.snap.messaging.sendto.internal.ui;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.LegacySendToQueries.Friend;
import com.snap.core.db.query.LegacySendToQueries.PostableStory;
import com.snap.identity.api.sharedui.AlphabeticScrollbar;
import com.snap.messaging.sendto.internal.SendToFragmentImpl;
import com.snap.ui.avatar.AvatarCache;
import com.snap.ui.view.emoji.SnapEmojiSpanFactory;
import com.snap.ui.view.scrollbar.SnapScrollBar;
import com.snap.ui.view.scrollbar.SnapScrollBar.UniformContentHeightLookup;
import com.snapchat.android.R;
import defpackage.abkq;
import defpackage.acgu;
import defpackage.achb;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajex;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajvv;
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
import defpackage.ajyn;
import defpackage.ajyw;
import defpackage.ajzl;
import defpackage.ajzm;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akef;
import defpackage.akej;
import defpackage.aken;
import defpackage.akqq;
import defpackage.fth;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.gqr;
import defpackage.igi;
import defpackage.iqm;
import defpackage.ira;
import defpackage.isa;
import defpackage.iue;
import defpackage.ixj;
import defpackage.jic;
import defpackage.kcl;
import defpackage.ppy;
import defpackage.qqm;
import defpackage.qqp;
import defpackage.qqq;
import defpackage.qum;
import defpackage.rgq;
import defpackage.rgr;
import defpackage.rgs;
import defpackage.rhf;
import defpackage.rhh;
import defpackage.rhi;
import defpackage.rhj;
import defpackage.rhn;
import defpackage.rho;
import defpackage.rhs;
import defpackage.rht;
import defpackage.rhv;
import defpackage.rhx;
import defpackage.rhz;
import defpackage.rib;
import defpackage.rif;
import defpackage.rig;
import defpackage.rio;
import defpackage.rip;
import defpackage.riq;
import defpackage.rir;
import defpackage.ris;
import defpackage.rit;
import defpackage.riu;
import defpackage.riv;
import defpackage.riw;
import defpackage.rix;
import defpackage.riy;
import defpackage.riz;
import defpackage.rjb;
import defpackage.rjc;
import defpackage.rjd;
import defpackage.rjf;
import defpackage.rjg;
import defpackage.rjh;
import defpackage.rji;
import defpackage.rjk;
import defpackage.rjm;
import defpackage.rjn;
import defpackage.rjo;
import defpackage.rjp;
import defpackage.rjv;
import defpackage.rkh;
import defpackage.rki;
import defpackage.rlg;
import defpackage.rmp;
import defpackage.rmr;
import defpackage.yid;
import defpackage.yig;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zlx;
import defpackage.zmh;
import defpackage.zms;
import defpackage.zmu;
import defpackage.zmy;
import defpackage.zpd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;

public final class SendToPresenter extends zll<SendToFragmentImpl> implements defpackage.k, qqm, riq {
    final ajwy<riu> A;
    final ajwy<riw> B;
    final ajwy<rhs> C;
    final ajwy<ira> D;
    final ajwy<isa> E;
    final ajwy<ixj> F;
    final ajwy<qum> G;
    final ajwy<yid> H;
    final ajwy<rjc> I;
    final ajwy<rht> J;
    final ajwy<ftl> K;
    final ajwy<SnapEmojiSpanFactory> L;
    final ajwy<kcl> M;
    private final ajxe N = ajxh.a(new f(this));
    private final ajxe O = ajxh.a(new av(this));
    private final ajxe P = ajxh.a(new at(this));
    private final ajxe Q = ajxh.a(new c(this));
    private final ajxe R = ajxh.a(new z(this));
    private final ajxe S = ajxh.a(new ad(this));
    private final ajxe T = ajxh.a(new aa(this));
    private final ajxe U = ajxh.a(new ag(this));
    private final ajxe V = ajxh.a(new ac(this));
    private final ajxe W = ajxh.a(new r(this));
    private final ajxe X = ajxh.a(new au(this));
    private final ajxe Y = ajxh.a(new k(this));
    private final ajxe Z = ajxh.a(new ap(this));
    final ajxe a = ajxh.a(new g(this));
    private final ajxe aa = ajxh.a(new ab(this));
    private final ajxe ab = ajxh.a(new ae(this));
    private final ajxe ac = ajxh.a(new d(this));
    private final ajxe ad = ajxh.a(new ao(this));
    private final ajxe ae = ajxh.a(new s(this));
    private final ajxe af;
    private final ajxe ag;
    private zms ah;
    private zkf ai;
    private Context aj;
    private final zpd ak;
    private rjb al;
    private zmu am;
    private final ajdp<Boolean> an;
    private Integer ao;
    private final ajxe ap;
    private final ajdx<ajxm<Boolean, Boolean>> aq;
    private final ajdp<Boolean> ar;
    private final ajdp<Boolean> as;
    private final ajdp<Boolean> at;
    private final ajdp<Boolean> au;
    private final ajwy<iqm> av;
    private final zgb aw;
    private final ajwy<achb<zjm, zjk>> ax;
    final ajxe b = ajxh.a(new j(this));
    final ajxe c;
    zmh d;
    public final rir e;
    public final zfw f;
    public final ajwl<String> g;
    final ajwo<ajxw> h;
    iue i;
    public String j;
    final ajwm k;
    final ajwl<Boolean> l;
    boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    final ajxe s;
    final ajwy<DisplayMetrics> t;
    final ajwy<riy> u;
    final ajwy<abkq> v;
    final ajwy<gpb> w;
    final ajwy<AvatarCache> x;
    final ajwy<rix> y;
    final ajwy<riv> z;

    static final class v<V> implements Callable<T> {
        private /* synthetic */ SendToPresenter a;

        v(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x00e6 in {8, 11, 12, 14, 22, 25, 26, 27, 30, 31, 33, 35, 38, 40} preds:[]
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
        public final /* synthetic */ java.lang.Object call() {
            /*
            r12 = this;
            r0 = r12.a;
            r0 = r0.p;
            r1 = 1;
            if (r0 != r1) goto L_0x00d4;
            r0 = r12.a;
            r0 = r0.e;
            r0 = (defpackage.rhf) r0;
            r0 = r0.c();
            r2 = "getSelectionState()\n    …                .toList()";
            defpackage.akcr.a(r0, r2);
            r0 = (java.lang.Iterable) r0;
            r2 = new java.util.ArrayList;
            r2.<init>();
            r2 = (java.util.Collection) r2;
            r0 = r0.iterator();
            r3 = r0.hasNext();
            if (r3 == 0) goto L_0x0048;
            r3 = r0.next();
            r4 = r3;
            r4 = (defpackage.rhn) r4;
            r5 = r4 instanceof defpackage.rhp;
            if (r5 == 0) goto L_0x003b;
            r5 = r4;
            r5 = (defpackage.rhp) r5;
            r5 = r5.c;
            if (r5 != 0) goto L_0x003f;
            r4 = r4 instanceof defpackage.rhi;
            if (r4 == 0) goto L_0x0041;
            r4 = 1;
            goto L_0x0042;
            r4 = 0;
            if (r4 == 0) goto L_0x0023;
            r2.add(r3);
            goto L_0x0023;
            r2 = (java.util.List) r2;
            r2 = (java.lang.Iterable) r2;
            r0 = new java.util.ArrayList;
            r1 = 10;
            r1 = defpackage.ajyn.a(r2, r1);
            r0.<init>(r1);
            r0 = (java.util.Collection) r0;
            r1 = r2.iterator();
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x00cc;
            r2 = r1.next();
            r2 = (defpackage.rhn) r2;
            r3 = r2 instanceof defpackage.rhp;
            if (r3 == 0) goto L_0x008a;
            r3 = r2;
            r3 = (defpackage.rhp) r3;
            r4 = r3.c;
            if (r4 != 0) goto L_0x0077;
            defpackage.akcr.a();
            r4 = r4.longValue();
            r3 = r3.b;
            r2 = r2.f;
            if (r2 == 0) goto L_0x0084;
            r2 = r2.a;
            goto L_0x0085;
            r2 = 0;
            r2 = defpackage.qqr.a(r4, r3, r2);
            goto L_0x00bc;
            r3 = r2 instanceof defpackage.rhi;
            if (r3 == 0) goto L_0x00c2;
            r3 = r12.a;
            r3 = r3.b;
            r3 = r3.b();
            r3 = (defpackage.qum) r3;
            r2 = (defpackage.rhi) r2;
            r4 = r2.a;
            r6 = r3.b(r4);
            r8 = r2.a;
            r10 = "";
            r2 = "groupId";
            defpackage.akcr.b(r8, r2);
            r2 = "myDisplayName";
            defpackage.akcr.b(r10, r2);
            r2 = new qqt;
            r3 = new qsk;
            r11 = 1;
            r9 = "";
            r5 = r3;
            r5.<init>(r6, r8, r9, r10, r11);
            r2.<init>(r3);
            r2 = (defpackage.qqs) r2;
            r0.add(r2);
            goto L_0x005d;
            r0 = new java.lang.IllegalArgumentException;
            r1 = "Unsupported preselected items!";
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            r0 = (java.util.List) r0;
            r1 = new qqq;
            r1.<init>(r0);
            return r1;
            if (r0 != 0) goto L_0x00e0;
            r0 = new qqq;
            r1 = defpackage.ajyw.a;
            r1 = (java.util.List) r1;
            r0.<init>(r1);
            return r0;
            r0 = new ajxk;
            r0.<init>();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.sendto.internal.ui.SendToPresenter$v.call():java.lang.Object");
        }
    }

    public static final class a<T1, T2, R> implements ajex<ajxw, List<? extends zmy>, R> {
        public final R apply(ajxw ajxw, List<? extends zmy> list) {
            Object obj;
            Object<zmy> obj2 = list;
            akcr.a((Object) obj2, "viewModels");
            int i = 0;
            for (zmy zmy : obj2) {
                obj = (((zmy instanceof rmr) && ((rmr) zmy).a() == 16) || ((zmy instanceof rjv) && ((rjv) zmy).e == 16)) ? 1 : null;
                if (obj != null) {
                    break;
                }
                i++;
            }
            i = -1;
            int i2 = 0;
            for (zmy zmy2 : obj2) {
                obj = (((zmy2 instanceof rmr) && ((rmr) zmy2).a() == 2) || ((zmy2 instanceof rjv) && ((rjv) zmy2).e == 2)) ? 1 : null;
                if (obj != null) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i > 0) {
                i2 = i;
            }
            return Integer.valueOf(i2);
        }
    }

    static final class af<T, R> implements ajfc<T, R> {
        public static final af a = new af();

        af() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return Boolean.valueOf(bool.booleanValue() ^ 1);
        }
    }

    static final class an<T, R> implements ajfc<T, R> {
        public static final an a = new an();

        an() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return Boolean.valueOf(bool.booleanValue() ^ 1);
        }
    }

    static final class aq<T, R> implements ajfc<ajxm<? extends Boolean, ? extends Boolean>, ajdb> {
        final /* synthetic */ SendToPresenter a;
        final /* synthetic */ SendToFragmentImpl b;

        aq(SendToPresenter sendToPresenter, SendToFragmentImpl sendToFragmentImpl) {
            this.a = sendToPresenter;
            this.b = sendToFragmentImpl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "sdlConfig");
            SendToPresenter sendToPresenter = this.a;
            Object obj2 = ((Boolean) ajxm.a).booleanValue() ? rit.HEADER_SDL : rit.HEADER;
            Object obj3 = ((Boolean) ajxm.b).booleanValue() ? rit.STORY_LIST_ITEM_SDL : rit.SEND_TO_ITEM;
            Object obj4 = ((Boolean) ajxm.a).booleanValue() ? rit.VIEW_MORE_SDL : rit.FRIENDS_VIEW_MORE;
            Object b = sendToPresenter.k.b(1000, TimeUnit.MILLISECONDS, sendToPresenter.f.l()).b((ajdb) sendToPresenter.a(ajzl.a(ajxs.a(obj3, Integer.valueOf(5)))));
            akcr.a(b, "initialLoadCompletionSub…COUNT))\n                )");
            ajvv.a(rhv.a(b, sendToPresenter.e(), null, null, 6), sendToPresenter.f());
            ajvv.a(rhv.a(sendToPresenter.a(ajzm.a(ajxs.a(obj2, Integer.valueOf(1)), ajxs.a(obj3, Integer.valueOf(1)), ajxs.a(obj4, Integer.valueOf(1)))), this.a.e(), null, null, 6), this.a.f());
            return ajcx.b((Callable) new Callable<Object>(this) {
                private /* synthetic */ aq a;

                public final /* synthetic */ Object call() {
                    Object i;
                    Object a;
                    ajej f;
                    SendToPresenter sendToPresenter = this.a.a;
                    SendToFragmentImpl sendToFragmentImpl = this.a.b;
                    ajxm ajxm = ajxm;
                    akcr.a((Object) ajxm, "sdlConfig");
                    sendToPresenter.a(sendToFragmentImpl, ajxm);
                    String str = "adapter";
                    String str2 = "BehaviorSubject.createDe…List<AdapterViewModel>())";
                    if (this.a.a.n) {
                        this.a.a.i = new iue(SendToPresenter.a(this.a.a), this.a.a.f, this.a.a.f());
                        sendToPresenter = this.a.a;
                        i = ajwl.i(ajyw.a);
                        akcr.a(i, str2);
                        Object p = i.a((ajdw) sendToPresenter.f.b()).p(new u(sendToPresenter));
                        Object obj = (SendToFragmentImpl) sendToPresenter.getTarget();
                        if (obj != null) {
                            iue iue = sendToPresenter.i;
                            if (iue == null) {
                                akcr.a("scrollBarController");
                            }
                            zmh zmh = sendToPresenter.d;
                            if (zmh == null) {
                                akcr.a(str);
                            }
                            akcr.a(p, "indexObservable");
                            akcr.a(obj, "it");
                            iue.a(zmh, p, i, obj.i());
                        }
                    }
                    if (this.a.b.l().t && this.a.a.r) {
                        sendToPresenter = this.a.a;
                        i = ajwl.i(ajyw.a);
                        akcr.a(i, str2);
                        zmh zmh2 = sendToPresenter.d;
                        if (zmh2 == null) {
                            akcr.a(str);
                        }
                        defpackage.iud.a.a(zmh2, (ajws) i, sendToPresenter.f());
                        a = sendToPresenter.h.a((ajdt) i, (ajex) new a());
                        akcr.a(a, "withLatestFrom(other, Bi…combiner.invoke(t, u)  })");
                        f = a.b((ajdw) sendToPresenter.f.b()).a((ajdw) sendToPresenter.f.l()).f((ajfb) new b(sendToPresenter));
                        akcr.a((Object) f, "createGroupSubject.withL…!.recyclerView)\n        }");
                        ajvv.a(f, sendToPresenter.f());
                    }
                    rhs b = this.a.a.b();
                    rgs rgs = this.a.b;
                    if (rgs != null) {
                        f = rgs.g().a((ajdw) b.a.m()).v(new defpackage.rhs.b(b)).e();
                        akcr.a((Object) f, "it.completedEventObserva…            }.subscribe()");
                        ajvv.a(f, b.e);
                    }
                    if (this.a.a.q) {
                        sendToPresenter = this.a.a;
                        a = sendToPresenter.l().a((ajdw) sendToPresenter.f.l());
                        akcr.a(a, "selectionStateObservable…(schedulers.mainThread())");
                        ajvv.a(rhv.a(a, sendToPresenter.e(), new ah(sendToPresenter)), sendToPresenter.f());
                        a = sendToPresenter.l.a((ajdw) sendToPresenter.f.l());
                        akcr.a(a, "sendToSelectionSectionVi…(schedulers.mainThread())");
                        ajvv.a(rhv.a(a, sendToPresenter.e(), new ai(sendToPresenter)), sendToPresenter.f());
                    }
                    sendToPresenter = this.a.a;
                    a = sendToPresenter.c().a().b((ajdw) sendToPresenter.f.i());
                    akcr.a(a, "storyRepository\n        …eOn(schedulers.queries())");
                    ajvv.a(rhv.a(a, sendToPresenter.e(), null, null, 6), sendToPresenter.f());
                    ajvv.a(sendToPresenter.c().b(), sendToPresenter.f());
                    return ajxw.a;
                }
            });
        }
    }

    static final class as<T1, T2, R> implements ajex<Boolean, Boolean, ajxm<? extends Boolean, ? extends Boolean>> {
        public static final as a = new as();

        as() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            akcr.b(bool, "useSdl");
            akcr.b(bool2, "useSdlInStories");
            return new ajxm(bool, bool2);
        }
    }

    static final class b<T> implements ajfb<Integer> {
        private /* synthetic */ SendToPresenter a;

        b(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            akcr.a(obj, "it");
            int intValue = obj.intValue();
            int intValue2 = ((Number) this.a.c.b()).intValue();
            Object obj2 = (SendToFragmentImpl) this.a.getTarget();
            if (obj2 == null) {
                akcr.a();
            }
            akcr.a(obj2, "target!!");
            RecyclerView i = obj2.i();
            akcr.a((Object) i, "target!!.recyclerView");
            defpackage.iud.a.a(intValue, intValue2, i);
        }
    }

    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            List list = (List) ajxm.a;
            boolean booleanValue = ((Boolean) ajxm.b).booleanValue();
            Iterable<PostableStory> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (PostableStory rjd : iterable) {
                arrayList.add(new rjd(rjd));
            }
            Collection arrayList2 = new ArrayList();
            for (Object obj22 : (List) arrayList) {
                Object obj3 = (!((rjd) obj22).j() || booleanValue) ? 1 : null;
                if (obj3 != null) {
                    arrayList2.add(obj22);
                }
            }
            list = (List) arrayList2;
            if (booleanValue) {
                Iterable iterable2 = list;
                for (Object obj222 : iterable2) {
                    if (akcr.a(((rjd) obj222).e(), (Object) "glssubmittolive")) {
                        break;
                    }
                }
                obj222 = null;
                rjd rjd2 = (rjd) obj222;
                for (Object next : iterable2) {
                    if (akcr.a(((rjd) next).e(), ppy.m)) {
                        break;
                    }
                }
                Object next2 = null;
                rjd rjd3 = (rjd) next2;
                if (rjd3 != null) {
                    rjd3.a(rjd2);
                }
            }
            return list;
        }
    }

    public static final class l<T1, T2, R> implements ajex<Boolean, Boolean, R> {
        public final R apply(Boolean bool, Boolean bool2) {
            boolean z;
            Object obj = bool2;
            if (bool.booleanValue()) {
                akcr.a(obj, "it2");
                if (obj.booleanValue()) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    static final class m<T, R> implements ajfc<T, R> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "pair");
            return (Integer) ajxm.b;
        }
    }

    static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<riz> iterable = list;
            Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
            for (riz riz : iterable) {
                ajxm a = ajxs.a(riz.b, riz);
                linkedHashMap.put(a.a, a.b);
            }
            return new rki(linkedHashMap);
        }
    }

    static final class p<T, R> implements ajfc<T, R> {
        private /* synthetic */ SendToPresenter a;

        p(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            List list = (List) obj;
            akcr.b(list, "it");
            Collection arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Friend friend = (Friend) next;
                Object username = friend.username();
                Object obj2 = this.a.a().b;
                if (obj2 == null) {
                    obj2 = "";
                }
                if ((akcr.a(username, obj2) ^ 1) != 0 && friend.friendLinkType() == FriendLinkType.MUTUAL) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            if (((List) arrayList).size() < 20) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class q<T, R> implements ajfc<T, R> {
        public static final q a = new q();

        q() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            Object obj2 = ajxm.b;
            akcr.a(obj2, "it.second");
            boolean z = true;
            if (((Boolean) obj2).booleanValue()) {
                int i;
                Iterable<Friend> iterable = (Iterable) ajxm.a;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (Friend friendLinkType : iterable) {
                        if ((friendLinkType.friendLinkType() == FriendLinkType.MUTUAL ? 1 : null) != null) {
                            i++;
                            if (i < 0) {
                                ajym.b();
                            }
                        }
                    }
                }
                if (i >= 7) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    static final class u<T, R> implements ajfc<T, R> {
        private /* synthetic */ SendToPresenter a;

        u(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<zmy> list = (List) obj;
            akcr.b(list, "it");
            akcr.b(list, "viewModels");
            HashMap hashMap = new HashMap();
            Map map = hashMap;
            map.put(AlphabeticScrollbar.a, Integer.valueOf(0));
            int i = 0;
            for (zmy zmy : list) {
                Object obj2;
                Object obj3 = 1;
                int i2;
                if (zmy instanceof rjv) {
                    i2 = ((rjv) zmy).e;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                i++;
                            }
                        }
                        obj2 = AlphabeticScrollbar.d;
                        map.put(obj2, Integer.valueOf(i));
                        i++;
                    }
                    obj2 = AlphabeticScrollbar.b;
                    map.put(obj2, Integer.valueOf(i));
                    i++;
                } else {
                    if (zmy instanceof rmr) {
                        i2 = ((rmr) zmy).a();
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                }
                            }
                            obj2 = AlphabeticScrollbar.d;
                            map.put(obj2, Integer.valueOf(i));
                        }
                        obj2 = AlphabeticScrollbar.b;
                        map.put(obj2, Integer.valueOf(i));
                    } else if (zmy instanceof rmp) {
                        rmp rmp = (rmp) zmy;
                        if (rmp.f() == 0) {
                            char toUpperCase = Character.toUpperCase(rmp.c().charAt(0));
                            if ('A' > toUpperCase || 'Z' < toUpperCase) {
                                obj3 = null;
                            }
                            obj2 = obj3 != null ? String.valueOf(toUpperCase) : AlphabeticScrollbar.e;
                            if (hashMap.containsKey(obj2)) {
                            }
                            map.put(obj2, Integer.valueOf(i));
                        }
                    }
                    i++;
                }
                obj2 = AlphabeticScrollbar.c;
                map.put(obj2, Integer.valueOf(i));
                i++;
            }
            return map;
        }
    }

    static final class aa extends akcs implements akbk<riu> {
        private /* synthetic */ SendToPresenter a;

        aa(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (riu) this.a.A.get();
        }
    }

    static final class ab extends akcs implements akbk<rjc> {
        private /* synthetic */ SendToPresenter a;

        ab(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rjc) this.a.I.get();
        }
    }

    static final class ac extends akcs implements akbk<rhs> {
        private /* synthetic */ SendToPresenter a;

        ac(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rhs) this.a.C.get();
        }
    }

    static final class ad extends akcs implements akbk<riv> {
        private /* synthetic */ SendToPresenter a;

        ad(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (riv) this.a.z.get();
        }
    }

    static final class ae extends akcs implements akbk<rht> {
        private /* synthetic */ SendToPresenter a;

        ae(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rht) this.a.J.get();
        }
    }

    static final class ag extends akcs implements akbk<riw> {
        private /* synthetic */ SendToPresenter a;

        ag(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (riw) this.a.B.get();
        }
    }

    static final class ah extends akcs implements akbl<rhf, ajxw> {
        private /* synthetic */ SendToPresenter a;

        ah(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            if (this.a.m) {
                SendToPresenter sendToPresenter = this.a;
                String e = sendToPresenter.e.e();
                String str = "selectionState.recipientsString";
                akcr.a((Object) e, str);
                SendToPresenter.a(sendToPresenter, e);
                obj = this.a.e.e();
                akcr.a(obj, str);
                if ((((CharSequence) obj).length() == 0 ? 1 : null) != null) {
                    this.a.l.a(Boolean.FALSE);
                }
            }
            return ajxw.a;
        }
    }

    static final class ai extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ SendToPresenter a;

        ai(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SendToPresenter sendToPresenter;
            String e;
            obj = (Boolean) obj;
            akcr.a(obj, "it");
            if (obj.booleanValue()) {
                sendToPresenter = this.a;
                sendToPresenter.m = true;
                e = sendToPresenter.e.e();
                akcr.a((Object) e, "selectionState.recipientsString");
            } else {
                if (this.a.m) {
                    sendToPresenter = this.a;
                    sendToPresenter.m = false;
                    e = "";
                }
                return ajxw.a;
            }
            SendToPresenter.a(sendToPresenter, e);
            return ajxw.a;
        }
    }

    static final class aj extends akcs implements akbk<ajxw> {
        private /* synthetic */ SendToPresenter a;
        private /* synthetic */ rjo b;

        aj(SendToPresenter sendToPresenter, rjo rjo) {
            this.a = sendToPresenter;
            this.b = rjo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.onSelectionEvent(this.b);
            return ajxw.a;
        }
    }

    static final class ak extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SendToPresenter a;
        private /* synthetic */ rjo b;

        ak(SendToPresenter sendToPresenter, rjo rjo) {
            this.a = sendToPresenter;
            this.b = rjo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SendToPresenter.a(this.a, this.b);
            return ajxw.a;
        }
    }

    static final class al extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SendToPresenter a;
        private /* synthetic */ rjo b;

        al(SendToPresenter sendToPresenter, rjo rjo) {
            this.a = sendToPresenter;
            this.b = rjo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SendToPresenter.a(this.a, this.b);
            return ajxw.a;
        }
    }

    static final class am extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SendToPresenter a;
        private /* synthetic */ rjo b;

        am(SendToPresenter sendToPresenter, rjo rjo) {
            this.a = sendToPresenter;
            this.b = rjo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SendToPresenter.a(this.a, this.b);
            return ajxw.a;
        }
    }

    static final class ao extends akcs implements akbk<SnapEmojiSpanFactory> {
        private /* synthetic */ SendToPresenter a;

        ao(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SnapEmojiSpanFactory) this.a.L.get();
        }
    }

    static final class ap extends akcs implements akbk<yid> {
        private /* synthetic */ SendToPresenter a;

        ap(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (yid) this.a.H.get();
        }
    }

    static final class ar extends akcs implements akbk<ajxw> {
        private /* synthetic */ SendToPresenter a;
        private /* synthetic */ SendToFragmentImpl b;

        ar(SendToPresenter sendToPresenter, SendToFragmentImpl sendToFragmentImpl) {
            this.a = sendToPresenter;
            this.b = sendToFragmentImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (!this.a.n) {
                SnapScrollBar o = this.b.o();
                Object i = this.b.i();
                akcr.a(i, "target.recyclerView");
                o.attachToRecyclerView(i, new UniformContentHeightLookup(SendToPresenter.b(this.a), 1, -1, ((DisplayMetrics) this.a.a.b()).widthPixels), this.b, 1);
            }
            this.b.getLifecycle().a(this.a);
            return ajxw.a;
        }
    }

    static final class at extends akcs implements akbk<gpb> {
        private /* synthetic */ SendToPresenter a;

        at(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gpb) this.a.w.get();
        }
    }

    static final class au extends akcs implements akbk<isa> {
        private /* synthetic */ SendToPresenter a;

        au(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (isa) this.a.E.get();
        }
    }

    static final class av extends akcs implements akbk<abkq> {
        private /* synthetic */ SendToPresenter a;

        av(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (abkq) this.a.v.get();
        }
    }

    static final class c extends akcs implements akbk<AvatarCache> {
        private /* synthetic */ SendToPresenter a;

        c(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AvatarCache) this.a.x.get();
        }
    }

    static final class d extends akcs implements akbk<ftl> {
        private /* synthetic */ SendToPresenter a;

        d(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.K.get();
        }
    }

    static final class f extends akcs implements akbk<riy> {
        private /* synthetic */ SendToPresenter a;

        f(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (riy) this.a.u.get();
        }
    }

    static final class g extends akcs implements akbk<DisplayMetrics> {
        private /* synthetic */ SendToPresenter a;

        g(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DisplayMetrics) this.a.t.get();
        }
    }

    static final class h extends akcs implements akbk<ajei> {
        public static final h a = new h();

        h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    static final class j extends akcs implements akbk<qum> {
        private /* synthetic */ SendToPresenter a;

        j(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (qum) this.a.G.get();
        }
    }

    static final class k extends akcs implements akbk<ixj> {
        private /* synthetic */ SendToPresenter a;

        k(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ixj) this.a.F.get();
        }
    }

    static final class n extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ SendToPresenter a;

        n(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Integer num = (Integer) obj;
            if (num == null || num.intValue() != 0) {
                rjc c;
                List c2 = this.a.e.c();
                if (num != null && num.intValue() == 2 && c2.size() == 1) {
                    c = ((rjc) this.a.aa.b());
                    c2 = ajyw.a;
                } else {
                    c = ((rjc) this.a.aa.b());
                    akcr.a((Object) c2, "selectionList");
                }
                c.a(c2);
            }
            return ajxw.a;
        }
    }

    static final class r extends akcs implements akbk<ira> {
        private /* synthetic */ SendToPresenter a;

        r(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ira) this.a.D.get();
        }
    }

    static final class s extends akcs implements akbk<kcl> {
        private /* synthetic */ SendToPresenter a;

        s(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (kcl) this.a.M.get();
        }
    }

    static final class t extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ SendToPresenter a;
        private /* synthetic */ SendToFragmentImpl b;
        private /* synthetic */ ajxm c;

        t(SendToPresenter sendToPresenter, SendToFragmentImpl sendToFragmentImpl, ajxm ajxm) {
            this.a = sendToPresenter;
            this.b = sendToFragmentImpl;
            this.c = ajxm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Boolean) obj;
            zmh b = SendToPresenter.b(this.a);
            akcr.a(obj, "it");
            b.m = obj.booleanValue();
            return ajxw.a;
        }
    }

    static final class w extends akcs implements akbl<qqq, ajxw> {
        private /* synthetic */ SendToPresenter a;

        w(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            qqq qqq = (qqq) obj;
            rht d = this.a.d();
            SendToPresenter sendToPresenter = this.a;
            qqm qqm = sendToPresenter;
            Object obj2 = (acgu) sendToPresenter.s.b();
            akcr.a(obj2, "presentSendToNavigationAction");
            d.a(qqm, qqq, obj2);
            return ajxw.a;
        }
    }

    static final class x extends akcs implements akbk<acgu<zjm>> {
        private /* synthetic */ igi a;

        x(igi igi) {
            this.a = igi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((Boolean) this.a.a()).booleanValue() ? rgr.a() : rgr.c;
        }
    }

    static final class y extends akcs implements akbk<Integer> {
        private /* synthetic */ SendToPresenter a;

        y(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(SendToPresenter.a(this.a).getResources().getDimensionPixelOffset(R.dimen.send_to_scroll_offset));
        }
    }

    static final class z extends akcs implements akbk<rix> {
        private /* synthetic */ SendToPresenter a;

        z(SendToPresenter sendToPresenter) {
            this.a = sendToPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rix) this.a.y.get();
        }
    }

    static final class aw extends akcq implements akbk<yig> {
        aw(ajwy ajwy) {
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

    static final class i extends akcq implements akbk<gqr> {
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
            return (gqr) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SendToPresenter.class), "displayMetrics", "getDisplayMetrics()Landroid/util/DisplayMetrics;"), new akdc(akde.a(SendToPresenter.class), "dataProvider", "getDataProvider()Lcom/snap/messaging/sendto/internal/ui/data/SendToDataProvider;"), new akdc(akde.a(SendToPresenter.class), "userSession", "getUserSession()Lcom/snapchat/android/core/user/UserSession;"), new akdc(akde.a(SendToPresenter.class), "userAuthStore", "getUserAuthStore()Lcom/snap/core/store/UserAuthStore;"), new akdc(akde.a(SendToPresenter.class), "avatarCache", "getAvatarCache()Lcom/snap/ui/avatar/AvatarCache;"), new akdc(akde.a(SendToPresenter.class), "sendToAvatarCreator", "getSendToAvatarCreator()Lcom/snap/messaging/sendto/internal/ui/avatar/SendToAvatarCreator;"), new akdc(akde.a(SendToPresenter.class), "sendToNonFriendAlert", "getSendToNonFriendAlert()Lcom/snap/messaging/sendto/internal/ui/alert/SendToNonFriendAlert;"), new akdc(akde.a(SendToPresenter.class), "sendToBestOfSpectaclesAlert", "getSendToBestOfSpectaclesAlert()Lcom/snap/messaging/sendto/internal/ui/alert/SendToBestOfSpectaclesAlert;"), new akdc(akde.a(SendToPresenter.class), "sendToSnappablePrivacyAlert", "getSendToSnappablePrivacyAlert()Lcom/snap/messaging/sendto/internal/ui/alert/SendToSnappablePrivacyAlert;"), new akdc(akde.a(SendToPresenter.class), "sendToLocalGroupsManager", "getSendToLocalGroupsManager()Lcom/snap/messaging/sendto/internal/SendToLocalGroupsManager;"), new akdc(akde.a(SendToPresenter.class), "identityApi", "getIdentityApi()Lcom/snap/identity/api/IdentityApi;"), new akdc(akde.a(SendToPresenter.class), "userSegmentApi", "getUserSegmentApi()Lcom/snap/identity/api/UserSegmentApi;"), new akdc(akde.a(SendToPresenter.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/db/FriendRepository;"), new akdc(akde.a(SendToPresenter.class), "feedRepository", "getFeedRepository()Lcom/snap/messaging/db/FeedRepository;"), new akdc(akde.a(SendToPresenter.class), "storyRepository", "getStoryRepository()Lcom/snap/stories/api/StoryRepository;"), new akdc(akde.a(SendToPresenter.class), "sendToLastSnapRepository", "getSendToLastSnapRepository()Lcom/snap/messaging/sendto/internal/ui/data/SendToLastSnapRepository;"), new akdc(akde.a(SendToPresenter.class), "sendToPopupLauncher", "getSendToPopupLauncher()Lcom/snap/messaging/sendto/internal/SendToPopupLauncher;"), new akdc(akde.a(SendToPresenter.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(SendToPresenter.class), "snapEmojiSpanFactory", "getSnapEmojiSpanFactory()Lcom/snap/ui/view/emoji/SnapEmojiSpanFactory;"), new akdc(akde.a(SendToPresenter.class), "impalaStudySettings", "getImpalaStudySettings()Lcom/snap/impala/config/experiments/ImpalaStudySettings;"), new akdc(akde.a(SendToPresenter.class), "userStorySettings", "getUserStorySettings()Lcom/snap/stories/api/UserStorySettings;"), new akdc(akde.a(SendToPresenter.class), "exceptionTracker", "getExceptionTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;"), new akdc(akde.a(SendToPresenter.class), "scrollPositionOffset", "getScrollPositionOffset()I"), new akdc(akde.a(SendToPresenter.class), "disposables", "getDisposables()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(SendToPresenter.class), "presentSendToNavigationAction", "getPresentSendToNavigationAction()Lcom/snapchat/deck/actions/NavigationAction;")};
    }

    public SendToPresenter(ajwy<DisplayMetrics> ajwy, ajwy<iqm> ajwy2, ajwy<riy> ajwy3, zgb zgb, ajwy<abkq> ajwy4, ajwy<gpb> ajwy5, ajwy<AvatarCache> ajwy6, ajwy<rix> ajwy7, ajwy<riv> ajwy8, ajwy<riu> ajwy9, ajwy<riw> ajwy10, ajwy<rhs> ajwy11, ajwy<ira> ajwy12, ajwy<isa> ajwy13, ajwy<ixj> ajwy14, ajwy<qum> ajwy15, ajwy<yid> ajwy16, ajwy<rjc> ajwy17, ajwy<rht> ajwy18, ajwy<ftl> ajwy19, ajwy<SnapEmojiSpanFactory> ajwy20, ajwy<kcl> ajwy21, ajwy<achb<zjm, zjk>> ajwy22, ajwy<yig> ajwy23, ajwy<gqr> ajwy24, igi<Boolean> igi) {
        ajwy<DisplayMetrics> ajwy25 = ajwy;
        ajwy<iqm> ajwy26 = ajwy2;
        ajwy<riy> ajwy27 = ajwy3;
        zgb zgb2 = zgb;
        ajwy<abkq> ajwy28 = ajwy4;
        ajwy<gpb> ajwy29 = ajwy5;
        ajwy<AvatarCache> ajwy30 = ajwy6;
        ajwy<rix> ajwy31 = ajwy7;
        ajwy<riv> ajwy32 = ajwy8;
        ajwy<riu> ajwy33 = ajwy9;
        ajwy<riw> ajwy34 = ajwy10;
        ajwy<rhs> ajwy35 = ajwy11;
        ajwy<ira> ajwy36 = ajwy12;
        ajwy<isa> ajwy37 = ajwy13;
        ajwy<ixj> ajwy38 = ajwy14;
        ajwy<qum> ajwy39 = ajwy15;
        akcr.b(ajwy25, "displayMetricsProvider");
        akcr.b(ajwy26, "contactApi");
        akcr.b(ajwy27, "dataProviderProvider");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(ajwy28, "userSessionProvider");
        akcr.b(ajwy29, "userAuthStoreProvider");
        akcr.b(ajwy30, "avatarCacheProvider");
        akcr.b(ajwy31, "sendToAvatarCreatorProvider");
        akcr.b(ajwy32, "sendToNonFriendAlertProvider");
        akcr.b(ajwy33, "sendToBestOfSpectaclesAlertProvider");
        akcr.b(ajwy34, "sendToSnappablePrivacyAlertProvider");
        akcr.b(ajwy35, "sendToLocalGroupsManagerProvider");
        akcr.b(ajwy36, "identityApiProvider");
        akcr.b(ajwy37, "userSegmentApiProvider");
        akcr.b(ajwy38, "friendRepositoryProvider");
        akcr.b(ajwy15, "feedRepositoryProvider");
        akcr.b(ajwy16, "storyRepositoryProvider");
        akcr.b(ajwy17, "sendToLastSnapRepositoryProvider");
        akcr.b(ajwy18, "sendToPopupLauncherProvider");
        akcr.b(ajwy19, "configProviderProvider");
        akcr.b(ajwy20, "snapEmojiSpanFactoryProvider");
        akcr.b(ajwy21, "impalaStudySettingsProvider");
        akcr.b(ajwy22, "navigationHost");
        akcr.b(ajwy23, "userStorySettingsProvider");
        akcr.b(ajwy24, "exceptionTrackerProvider");
        akcr.b(igi, "swipeUpToSendConfigReader");
        ajwy<qum> ajwy40 = ajwy15;
        this.t = ajwy25;
        this.av = ajwy26;
        this.u = ajwy27;
        this.aw = zgb2;
        this.v = ajwy28;
        this.w = ajwy29;
        this.x = ajwy30;
        this.y = ajwy31;
        this.z = ajwy32;
        this.A = ajwy33;
        this.B = ajwy34;
        this.C = ajwy35;
        this.D = ajwy36;
        this.E = ajwy37;
        this.F = ajwy14;
        this.G = ajwy40;
        ajwy<rjc> ajwy41 = ajwy17;
        this.H = ajwy16;
        this.I = ajwy41;
        ajwy<ftl> ajwy42 = ajwy19;
        this.J = ajwy18;
        this.K = ajwy42;
        ajwy<kcl> ajwy43 = ajwy21;
        this.L = ajwy20;
        this.M = ajwy43;
        ajwy<yig> ajwy44 = ajwy23;
        this.ax = ajwy22;
        this.af = ajxh.a(new aw(ajwy44));
        igi<Boolean> igi2 = igi;
        this.ag = ajxh.a(new i(ajwy24));
        this.c = ajxh.a(new y(this));
        this.ak = new zpd();
        this.e = new rir();
        this.f = zgb.a(rgr.d, "SendToPresenter");
        this.al = new rjb();
        Object i = ajwl.i("");
        akcr.a(i, "BehaviorSubject.createDefault(\"\")");
        this.g = i;
        i = new ajwo();
        akcr.a(i, "PublishSubject.create<Unit>()");
        this.h = i;
        i = new ajwm();
        akcr.a(i, "CompletableSubject.create()");
        this.k = i;
        i = ajwl.i(Boolean.FALSE);
        akcr.a(i, "BehaviorSubject.createDefault(false)");
        this.l = i;
        this.an = this.l.p(af.a);
        this.ap = ajxh.a(h.a);
        this.s = ajxh.a(new x(igi2));
        this.aq = ajdx.a(t().b((fth) jic.SEND_TO_SDL), (ajeb) t().b((fth) jic.SEND_TO_SDL_STORIES), (ajex) as.a);
        this.ar = t().p(jic.ST_NEW_USER_EXPERIENCE_V2_ENABLE);
        this.as = w();
        this.at = w();
        this.au = w().p(an.a);
    }

    private final rlg a(ris ris, ajdp<List<rjd>> ajdp, ajdp<rkh> ajdp2, defpackage.rlc.a aVar, boolean z) {
        riq riq = this;
        zkf zkf = this.ai;
        if (zkf == null) {
            akcr.a("bus");
        }
        Context context = this.aj;
        if (context == null) {
            akcr.a("context");
        }
        Object o = o();
        akcr.a(o, "userAuthStore");
        Object obj = this.an;
        akcr.a(obj, "sendToSearchVisibilityObservable");
        Object v = v();
        akcr.a(v, "userStorySettings");
        return new rlg(riq, ris, ajdp, zkf, ajdp2, aVar, context, o, z, obj, v);
    }

    public static final /* synthetic */ zmh b(SendToPresenter sendToPresenter) {
        zmh zmh = sendToPresenter.d;
        if (zmh == null) {
            akcr.a("adapter");
        }
        return zmh;
    }

    private final riy n() {
        return (riy) this.N.b();
    }

    private final gpb o() {
        return (gpb) this.P.b();
    }

    private final rix p() {
        return (rix) this.R.b();
    }

    private final riv q() {
        return (riv) this.S.b();
    }

    private final riu r() {
        return (riu) this.T.b();
    }

    private final riw s() {
        return (riw) this.U.b();
    }

    private final ftl t() {
        return (ftl) this.ac.b();
    }

    private final SnapEmojiSpanFactory u() {
        return (SnapEmojiSpanFactory) this.ad.b();
    }

    private final yig v() {
        return (yig) this.af.b();
    }

    private final ajdp<Boolean> w() {
        ajdp i = n().i();
        Object obj = this.ar;
        akcr.a(obj, "newUserExperienceV2");
        Object a = i.a((ajdt) obj, (ajex) new l());
        akcr.a(a, "withLatestFrom(other, Bi…combiner.invoke(t, u)  })");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final abkq a() {
        return (abkq) this.O.b();
    }

    /* Access modifiers changed, original: final */
    public final ajcx a(Map<? super rit, Integer> map) {
        zmu zmu = this.am;
        if (zmu == null) {
            akcr.a("viewHolderPreloader");
        }
        if (map != null) {
            Object d = zmu.a((Map) map).d();
            f().a(rhv.a(d, e(), null, null, 6));
            akcr.a(d, "viewHolderPreloader.load…posables.add(d)\n        }");
            return d;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.collections.Map<com.snap.ui.recycling.AdapterViewType, kotlin.Int>");
    }

    public final String a(int i) {
        Object obj = (SendToFragmentImpl) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        FragmentActivity activity = obj.getActivity();
        if (activity == null) {
            akcr.a();
        }
        Object string = activity.getString(i);
        akcr.a(string, "target!!.activity!!.getString(resId)");
        return string;
    }

    /* renamed from: a */
    public final void takeTarget(SendToFragmentImpl sendToFragmentImpl) {
        akcr.b(sendToFragmentImpl, "target");
        super.takeTarget(sendToFragmentImpl);
        this.aj = sendToFragmentImpl.getContext();
        this.ai = new zkf();
        ajei f = f();
        zkf zkf = this.ai;
        String str = "bus";
        if (zkf == null) {
            akcr.a(str);
        }
        f.a((ajej) zkf);
        zkf zkf2 = this.ai;
        if (zkf2 == null) {
            akcr.a(str);
        }
        zkf2.a(this);
        this.ao = sendToFragmentImpl.l().r;
        Object obj = (AvatarCache) this.Q.b();
        akcr.a(obj, "avatarCache");
        zfw zfw = this.f;
        rig i = i();
        rif j = j();
        Object a = a();
        akcr.a(a, "userSession");
        Object obj2 = (kcl) this.ae.b();
        akcr.a(obj2, "impalaStudySettings");
        this.ah = new zms((zlx) new rio(obj, zfw, i, j, a, obj2), rit.class);
        Context context = this.aj;
        str = "context";
        if (context == null) {
            akcr.a(str);
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        zms zms = this.ah;
        String str2 = "viewFactory";
        if (zms == null) {
            akcr.a(str2);
        }
        ajdw h = this.f.h();
        Context context2 = this.aj;
        if (context2 == null) {
            akcr.a(str);
        }
        obj = LayoutInflater.from(context2);
        akcr.a(obj, "LayoutInflater.from(context)");
        this.am = new zmu(zms, h, obj, recyclerView);
        zms zms2 = this.ah;
        if (zms2 == null) {
            akcr.a(str2);
        }
        zmu zmu = this.am;
        if (zmu == null) {
            akcr.a("viewHolderPreloader");
        }
        zms2.setViewHolderPrefetcher(zmu);
        Object a2 = this.aq.e((ajfc) new aq(this, sendToFragmentImpl)).b((ajdw) this.f.h()).a((ajdw) this.f.l());
        akcr.a(a2, "useSdl.flatMapCompletabl…(schedulers.mainThread())");
        ajvv.a(rhv.a(a2, e(), null, new ar(this, sendToFragmentImpl), 2), f());
    }

    public final void a(qqp qqp) {
        akcr.b(qqp, "localGroupInfo");
        rhs b = b();
        String str = qqp.a;
        akcr.b(str, "groupId");
        ajej e = b.b.runInTransaction("SendToLocalGroupsManager:updateGroupLatestInteractionTimestampIfMoreRecent", new defpackage.rhs.c(b, str)).b((ajdw) b.a.m()).e();
        akcr.a((Object) e, "dbClient.runInTransactio…abaseWrite()).subscribe()");
        ajvv.a(e, b.e);
        this.e.k();
        this.e.a((rhn) new rhi(qqp.a, new rhh(qqp.b, qqp.b), null), true);
        this.h.a(ajxw.a);
    }

    public final void a(boolean z) {
        if (this.q) {
            this.l.a(Boolean.valueOf(z));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:247:0x0798 in {7, 9, 15, 19, 20, 25, 30, 37, 38, 47, 48, 51, 52, 55, 58, 61, 64, 67, 69, 70, 76, 78, 83, 85, 88, 89, 93, 98, 99, 108, 110, 112, 120, 123, 124, 131, 132, 135, 138, 139, 140, 147, 150, 153, 154, 156, 157, 164, 167, 168, 175, 176, 179, 182, 183, 184, 192, 195, 197, 198, 206, 209, 210, 218, 219, 220, 225, 226, 227, 230, 233, 236, 238, 240, 242, 244, 245, 246} preds:[]
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
    final boolean a(com.snap.messaging.sendto.internal.SendToFragmentImpl r50, defpackage.ajxm<java.lang.Boolean, java.lang.Boolean> r51) {
        /*
        r49 = this;
        r14 = r49;
        r15 = r51;
        r13 = "sendToAvatarCreator";
        r1 = defpackage.rgr.d;	 Catch:{ all -> 0x0794 }
        r1 = (defpackage.ide) r1;	 Catch:{ all -> 0x0794 }
        r2 = "Adapter";	 Catch:{ all -> 0x0794 }
        r16 = defpackage.zgb.a(r1, r2);	 Catch:{ all -> 0x0794 }
        r12 = new zmh;	 Catch:{ all -> 0x0794 }
        r11 = r14.ah;	 Catch:{ all -> 0x0794 }
        r9 = "viewFactory";
        if (r11 != 0) goto L_0x0021;
        defpackage.akcr.a(r9);	 Catch:{ all -> 0x001c }
        goto L_0x0021;
        r0 = move-exception;
        r1 = r0;
        r12 = r14;
        goto L_0x0797;
        r1 = r14.ai;	 Catch:{ all -> 0x0794 }
        r10 = "bus";
        if (r1 != 0) goto L_0x002a;
        defpackage.akcr.a(r10);	 Catch:{ all -> 0x001c }
        r8 = r1.a();	 Catch:{ all -> 0x0794 }
        r1 = "bus.eventDispatcher";	 Catch:{ all -> 0x0794 }
        defpackage.akcr.a(r8, r1);	 Catch:{ all -> 0x0794 }
        r1 = r16.b();	 Catch:{ all -> 0x0794 }
        r17 = r1;	 Catch:{ all -> 0x0794 }
        r17 = (defpackage.ajdw) r17;	 Catch:{ all -> 0x0794 }
        r1 = r16.l();	 Catch:{ all -> 0x0794 }
        r1 = (defpackage.zfr) r1;	 Catch:{ all -> 0x0794 }
        r18 = r1;	 Catch:{ all -> 0x0794 }
        r18 = (defpackage.ajdw) r18;	 Catch:{ all -> 0x0794 }
        r7 = r50.l();	 Catch:{ all -> 0x0794 }
        r1 = "target.sendToConfig";	 Catch:{ all -> 0x0794 }
        defpackage.akcr.a(r7, r1);	 Catch:{ all -> 0x0794 }
        r1 = r50.p();	 Catch:{ all -> 0x0794 }
        r1 = defpackage.rkt.a(r1);	 Catch:{ all -> 0x0794 }
        r19 = 0;	 Catch:{ all -> 0x0794 }
        if (r1 == 0) goto L_0x005d;	 Catch:{ all -> 0x0794 }
        r6 = r19;	 Catch:{ all -> 0x0794 }
        goto L_0x0062;	 Catch:{ all -> 0x0794 }
        r1 = r50.j();	 Catch:{ all -> 0x0794 }
        r6 = r1;	 Catch:{ all -> 0x0794 }
        r40 = new ris;	 Catch:{ all -> 0x0794 }
        r2 = r14.aj;	 Catch:{ all -> 0x0794 }
        r41 = "context";
        if (r2 != 0) goto L_0x006d;
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r3 = r14.ak;	 Catch:{ all -> 0x0794 }
        r4 = r49.p();	 Catch:{ all -> 0x0794 }
        defpackage.akcr.a(r4, r13);	 Catch:{ all -> 0x0794 }
        r5 = r49.u();	 Catch:{ all -> 0x0794 }
        r1 = "snapEmojiSpanFactory";	 Catch:{ all -> 0x0794 }
        defpackage.akcr.a(r5, r1);	 Catch:{ all -> 0x0794 }
        r1 = r7.d;	 Catch:{ all -> 0x0794 }
        r20 = r1;	 Catch:{ all -> 0x0794 }
        r1 = r40;	 Catch:{ all -> 0x0794 }
        r42 = r12;	 Catch:{ all -> 0x0794 }
        r12 = r7;	 Catch:{ all -> 0x0794 }
        r7 = r20;	 Catch:{ all -> 0x0794 }
        r43 = r8;	 Catch:{ all -> 0x0794 }
        r8 = r51;	 Catch:{ all -> 0x0794 }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0794 }
        r8 = com.google.common.collect.ImmutableList.builder();	 Catch:{ all -> 0x0794 }
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x0794 }
        r7.<init>();	 Catch:{ all -> 0x0794 }
        r1 = new rkn;	 Catch:{ all -> 0x0794 }
        r1.<init>();	 Catch:{ all -> 0x0794 }
        r8.add(r1);	 Catch:{ all -> 0x0794 }
        r1 = r12.p;	 Catch:{ all -> 0x0794 }
        if (r1 == 0) goto L_0x00c6;
        r1 = new rko;	 Catch:{ all -> 0x001c }
        r2 = r14;	 Catch:{ all -> 0x001c }
        r2 = (defpackage.riq) r2;	 Catch:{ all -> 0x001c }
        r3 = r50.j();	 Catch:{ all -> 0x001c }
        r3 = r3.i();	 Catch:{ all -> 0x001c }
        r4 = r50.p();	 Catch:{ all -> 0x001c }
        r5 = r49.n();	 Catch:{ all -> 0x001c }
        r6 = "dataProvider";	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x001c }
        r1.<init>(r2, r3, r4, r5);	 Catch:{ all -> 0x001c }
        r8.add(r1);	 Catch:{ all -> 0x001c }
        r1 = r12.o;	 Catch:{ all -> 0x0794 }
        if (r1 == 0) goto L_0x00e1;
        r1 = new rld;	 Catch:{ all -> 0x001c }
        r2 = r14;	 Catch:{ all -> 0x001c }
        r2 = (defpackage.riq) r2;	 Catch:{ all -> 0x001c }
        r3 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r3 != 0) goto L_0x00d6;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x001c }
        r8.add(r1);	 Catch:{ all -> 0x001c }
        r1 = defpackage.aazf.SNAPPABLES_PROMPT;	 Catch:{ all -> 0x001c }
        r7.add(r1);	 Catch:{ all -> 0x001c }
        r1 = defpackage.ajyw.a;	 Catch:{ all -> 0x0794 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0794 }
        r1 = defpackage.ajdp.b(r1);	 Catch:{ all -> 0x0794 }
        r2 = "Observable.just(emptyList())";	 Catch:{ all -> 0x0794 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0794 }
        r2 = r12.a;	 Catch:{ all -> 0x0794 }
        if (r2 == 0) goto L_0x01d8;
        r1 = r49.n();	 Catch:{ all -> 0x001c }
        r1 = r1.f();	 Catch:{ all -> 0x001c }
        r2 = com.snap.messaging.sendto.internal.ui.SendToPresenter.o.a;	 Catch:{ all -> 0x001c }
        r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x001c }
        r1 = r1.p(r2);	 Catch:{ all -> 0x001c }
        r2 = "dataProvider.getGroups()…ndToStoriesGroupManager }";	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x001c }
        r28 = defpackage.igs.a(r1);	 Catch:{ all -> 0x001c }
        r1 = r50.k();	 Catch:{ all -> 0x001c }
        r2 = "target.containsOnlySpectaclesMedia()";	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x001c }
        r2 = "onlySpectaclesMedia";	 Catch:{ all -> 0x001c }
        defpackage.akcr.b(r1, r2);	 Catch:{ all -> 0x001c }
        r2 = r49.n();	 Catch:{ all -> 0x001c }
        r2 = r2.h();	 Catch:{ all -> 0x001c }
        r1 = defpackage.ajwa.a(r2, r1);	 Catch:{ all -> 0x001c }
        r2 = r14.f;	 Catch:{ all -> 0x001c }
        r2 = r2.b();	 Catch:{ all -> 0x001c }
        r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x001c }
        r1 = r1.a(r2);	 Catch:{ all -> 0x001c }
        r2 = com.snap.messaging.sendto.internal.ui.SendToPresenter.e.a;	 Catch:{ all -> 0x001c }
        r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x001c }
        r6 = r1.p(r2);	 Catch:{ all -> 0x001c }
        r1 = "Observables.combineLates…ist\n                    }";	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r6, r1);	 Catch:{ all -> 0x001c }
        r5 = defpackage.rlc.a.DEFAULT_ONLY;	 Catch:{ all -> 0x001c }
        r20 = 0;	 Catch:{ all -> 0x001c }
        r1 = r49;	 Catch:{ all -> 0x001c }
        r2 = r40;	 Catch:{ all -> 0x001c }
        r3 = r6;	 Catch:{ all -> 0x001c }
        r4 = r28;	 Catch:{ all -> 0x001c }
        r34 = r6;	 Catch:{ all -> 0x001c }
        r6 = r20;	 Catch:{ all -> 0x001c }
        r1 = r1.a(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x001c }
        r8.add(r1);	 Catch:{ all -> 0x001c }
        r1 = r14.o;	 Catch:{ all -> 0x001c }
        if (r1 == 0) goto L_0x0170;	 Catch:{ all -> 0x001c }
        r1 = r12.s;	 Catch:{ all -> 0x001c }
        if (r1 == 0) goto L_0x0170;	 Catch:{ all -> 0x001c }
        r5 = defpackage.rlc.a.SEARCH_ONLY;	 Catch:{ all -> 0x001c }
        r6 = 1;	 Catch:{ all -> 0x001c }
        r1 = r49;	 Catch:{ all -> 0x001c }
        r2 = r40;	 Catch:{ all -> 0x001c }
        r3 = r34;	 Catch:{ all -> 0x001c }
        r4 = r28;	 Catch:{ all -> 0x001c }
        r19 = r1.a(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x001c }
        r1 = r19;	 Catch:{ all -> 0x001c }
        r44 = r34;	 Catch:{ all -> 0x001c }
        goto L_0x01dc;	 Catch:{ all -> 0x001c }
        r29 = defpackage.rlc.a.SEARCH_ONLY;	 Catch:{ all -> 0x001c }
        r1 = r49.getTarget();	 Catch:{ all -> 0x001c }
        r1 = (com.snap.messaging.sendto.internal.SendToFragmentImpl) r1;	 Catch:{ all -> 0x001c }
        if (r1 == 0) goto L_0x017f;	 Catch:{ all -> 0x001c }
        r1 = r1.p();	 Catch:{ all -> 0x001c }
        goto L_0x0181;	 Catch:{ all -> 0x001c }
        r1 = r19;	 Catch:{ all -> 0x001c }
        r1 = defpackage.rkt.a(r1);	 Catch:{ all -> 0x001c }
        if (r1 == 0) goto L_0x018a;	 Catch:{ all -> 0x001c }
        r31 = r19;	 Catch:{ all -> 0x001c }
        goto L_0x0198;	 Catch:{ all -> 0x001c }
        r1 = r49.getTarget();	 Catch:{ all -> 0x001c }
        r1 = (com.snap.messaging.sendto.internal.SendToFragmentImpl) r1;	 Catch:{ all -> 0x001c }
        if (r1 == 0) goto L_0x0187;	 Catch:{ all -> 0x001c }
        r1 = r1.j();	 Catch:{ all -> 0x001c }
        r31 = r1;	 Catch:{ all -> 0x001c }
        r1 = new rlf;	 Catch:{ all -> 0x001c }
        r21 = r14;	 Catch:{ all -> 0x001c }
        r21 = (defpackage.riq) r21;	 Catch:{ all -> 0x001c }
        r2 = r14.ak;	 Catch:{ all -> 0x001c }
        r3 = defpackage.ajyw.a;	 Catch:{ all -> 0x001c }
        r23 = r3;	 Catch:{ all -> 0x001c }
        r23 = (java.util.List) r23;	 Catch:{ all -> 0x001c }
        r3 = r14.ah;	 Catch:{ all -> 0x001c }
        if (r3 != 0) goto L_0x01ad;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r9);	 Catch:{ all -> 0x001c }
        r4 = r14.ai;	 Catch:{ all -> 0x001c }
        if (r4 != 0) goto L_0x01b4;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r10);	 Catch:{ all -> 0x001c }
        r5 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r5 != 0) goto L_0x01bb;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r32 = r49.o();	 Catch:{ all -> 0x001c }
        r6 = r14.an;	 Catch:{ all -> 0x001c }
        r20 = r1;	 Catch:{ all -> 0x001c }
        r22 = r2;	 Catch:{ all -> 0x001c }
        r24 = r34;	 Catch:{ all -> 0x001c }
        r25 = r3;	 Catch:{ all -> 0x001c }
        r26 = r40;	 Catch:{ all -> 0x001c }
        r27 = r4;	 Catch:{ all -> 0x001c }
        r30 = r5;	 Catch:{ all -> 0x001c }
        r33 = r6;	 Catch:{ all -> 0x001c }
        r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);	 Catch:{ all -> 0x001c }
        r8.add(r1);	 Catch:{ all -> 0x001c }
        goto L_0x016b;
        r44 = r1;
        r1 = r19;
        r2 = r15.a;	 Catch:{ all -> 0x0794 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x0794 }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x0794 }
        if (r2 == 0) goto L_0x01e9;
        r2 = defpackage.rit.HEADER_SDL;	 Catch:{ all -> 0x001c }
        goto L_0x01eb;
        r2 = defpackage.rit.HEADER;	 Catch:{ all -> 0x0794 }
        r3 = r15.a;	 Catch:{ all -> 0x0794 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0794 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0794 }
        if (r3 == 0) goto L_0x01f8;
        r3 = defpackage.rit.SEND_TO_ITEM_SDL;	 Catch:{ all -> 0x001c }
        goto L_0x01fa;
        r3 = defpackage.rit.SEND_TO_ITEM;	 Catch:{ all -> 0x0794 }
        r4 = new rla;	 Catch:{ all -> 0x0794 }
        r20 = r14;	 Catch:{ all -> 0x0794 }
        r20 = (defpackage.riq) r20;	 Catch:{ all -> 0x0794 }
        r5 = r14.ak;	 Catch:{ all -> 0x0794 }
        r22 = r49.p();	 Catch:{ all -> 0x0794 }
        r6 = r12.i;	 Catch:{ all -> 0x0794 }
        r33 = 1;	 Catch:{ all -> 0x0794 }
        if (r6 != 0) goto L_0x020f;	 Catch:{ all -> 0x0794 }
        r23 = 1;	 Catch:{ all -> 0x0794 }
        goto L_0x0211;	 Catch:{ all -> 0x0794 }
        r23 = 0;	 Catch:{ all -> 0x0794 }
        r6 = defpackage.ajyy.a;	 Catch:{ all -> 0x0794 }
        r24 = r6;	 Catch:{ all -> 0x0794 }
        r24 = (java.util.Set) r24;	 Catch:{ all -> 0x0794 }
        r6 = r49.n();	 Catch:{ all -> 0x0794 }
        r6 = r6.g();	 Catch:{ all -> 0x0794 }
        r19 = defpackage.ajyw.a;	 Catch:{ all -> 0x0794 }
        r9 = r19;	 Catch:{ all -> 0x0794 }
        r9 = (java.util.List) r9;	 Catch:{ all -> 0x0794 }
        r25 = r6.h(r9);	 Catch:{ all -> 0x0794 }
        r6 = r49.n();	 Catch:{ all -> 0x0794 }
        r26 = r6.c();	 Catch:{ all -> 0x0794 }
        r6 = r49.n();	 Catch:{ all -> 0x0794 }
        r6 = r6.f();	 Catch:{ all -> 0x0794 }
        r9 = defpackage.ajyw.a;	 Catch:{ all -> 0x0794 }
        r9 = (java.util.List) r9;	 Catch:{ all -> 0x0794 }
        r27 = r6.h(r9);	 Catch:{ all -> 0x0794 }
        r6 = r14.aj;	 Catch:{ all -> 0x0794 }
        if (r6 != 0) goto L_0x0248;
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r9 = r49.a();	 Catch:{ all -> 0x0794 }
        r9 = r9.b;	 Catch:{ all -> 0x0794 }
        r45 = "";
        if (r9 != 0) goto L_0x0255;
        r29 = r45;
        goto L_0x0257;
        r29 = r9;
        r9 = r14.an;	 Catch:{ all -> 0x0794 }
        r19 = r4;	 Catch:{ all -> 0x0794 }
        r21 = r5;	 Catch:{ all -> 0x0794 }
        r28 = r6;	 Catch:{ all -> 0x0794 }
        r30 = r40;	 Catch:{ all -> 0x0794 }
        r31 = r12;	 Catch:{ all -> 0x0794 }
        r32 = r9;	 Catch:{ all -> 0x0794 }
        r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32);	 Catch:{ all -> 0x0794 }
        r5 = r14.o;	 Catch:{ all -> 0x0794 }
        if (r5 == 0) goto L_0x0283;
        r5 = r12.s;	 Catch:{ all -> 0x001c }
        if (r5 == 0) goto L_0x0283;	 Catch:{ all -> 0x001c }
        r5 = new rkr;	 Catch:{ all -> 0x001c }
        r6 = r14;	 Catch:{ all -> 0x001c }
        r6 = (defpackage.riq) r6;	 Catch:{ all -> 0x001c }
        r9 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r9 != 0) goto L_0x027c;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r5.<init>(r4, r1, r6, r9);	 Catch:{ all -> 0x001c }
        r8.add(r5);	 Catch:{ all -> 0x001c }
        goto L_0x0286;
        r8.add(r4);	 Catch:{ all -> 0x0794 }
        r1 = 2;	 Catch:{ all -> 0x0794 }
        r4 = new defpackage.ajxm[r1];	 Catch:{ all -> 0x0794 }
        r5 = java.lang.Integer.valueOf(r33);	 Catch:{ all -> 0x0794 }
        r5 = defpackage.ajxs.a(r2, r5);	 Catch:{ all -> 0x0794 }
        r6 = 0;	 Catch:{ all -> 0x0794 }
        r4[r6] = r5;	 Catch:{ all -> 0x0794 }
        r5 = 8;	 Catch:{ all -> 0x0794 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0794 }
        r3 = defpackage.ajxs.a(r3, r5);	 Catch:{ all -> 0x0794 }
        r4[r33] = r3;	 Catch:{ all -> 0x0794 }
        r3 = defpackage.ajzm.a(r4);	 Catch:{ all -> 0x0794 }
        r3 = r14.a(r3);	 Catch:{ all -> 0x0794 }
        r4 = r14.X;	 Catch:{ all -> 0x0794 }
        r4 = r4.b();	 Catch:{ all -> 0x0794 }
        r4 = (defpackage.isa) r4;	 Catch:{ all -> 0x0794 }
        r4 = r4.a();	 Catch:{ all -> 0x0794 }
        r5 = r14.f;	 Catch:{ all -> 0x0794 }
        r5 = r5.i();	 Catch:{ all -> 0x0794 }
        r5 = (defpackage.ajdw) r5;	 Catch:{ all -> 0x0794 }
        r4 = r4.b(r5);	 Catch:{ all -> 0x0794 }
        r4 = r4.i();	 Catch:{ all -> 0x0794 }
        r5 = r12.t;	 Catch:{ all -> 0x0794 }
        if (r5 == 0) goto L_0x030a;
        r5 = r14.r;	 Catch:{ all -> 0x001c }
        if (r5 == 0) goto L_0x030a;	 Catch:{ all -> 0x001c }
        r5 = new rks;	 Catch:{ all -> 0x001c }
        r21 = r14;	 Catch:{ all -> 0x001c }
        r21 = (defpackage.riq) r21;	 Catch:{ all -> 0x001c }
        r6 = r14.ak;	 Catch:{ all -> 0x001c }
        r9 = r14.ai;	 Catch:{ all -> 0x001c }
        if (r9 != 0) goto L_0x02db;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r10);	 Catch:{ all -> 0x001c }
        r1 = r49.n();	 Catch:{ all -> 0x001c }
        r1 = r1.d;	 Catch:{ all -> 0x001c }
        r1 = r1.b();	 Catch:{ all -> 0x001c }
        r24 = r1;	 Catch:{ all -> 0x001c }
        r24 = (defpackage.ajdp) r24;	 Catch:{ all -> 0x001c }
        r1 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r1 != 0) goto L_0x02f0;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r20 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x001c }
        r28 = defpackage.ajdp.b(r20);	 Catch:{ all -> 0x001c }
        r29 = 1;	 Catch:{ all -> 0x001c }
        r20 = r5;	 Catch:{ all -> 0x001c }
        r22 = r6;	 Catch:{ all -> 0x001c }
        r23 = r9;	 Catch:{ all -> 0x001c }
        r25 = r1;	 Catch:{ all -> 0x001c }
        r26 = r3;	 Catch:{ all -> 0x001c }
        r27 = r40;	 Catch:{ all -> 0x001c }
        r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29);	 Catch:{ all -> 0x001c }
        r8.add(r5);	 Catch:{ all -> 0x001c }
        r1 = r12.b;	 Catch:{ all -> 0x0794 }
        if (r1 == 0) goto L_0x0385;
        r1 = r15.a;	 Catch:{ all -> 0x001c }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x001c }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x001c }
        if (r1 == 0) goto L_0x031b;	 Catch:{ all -> 0x001c }
        r1 = defpackage.rit.TWO_FRIENDS_SDL;	 Catch:{ all -> 0x001c }
        goto L_0x031d;	 Catch:{ all -> 0x001c }
        r1 = defpackage.rit.TWO_FRIENDS;	 Catch:{ all -> 0x001c }
        r5 = 2;	 Catch:{ all -> 0x001c }
        r5 = new defpackage.ajxm[r5];	 Catch:{ all -> 0x001c }
        r6 = java.lang.Integer.valueOf(r33);	 Catch:{ all -> 0x001c }
        r2 = defpackage.ajxs.a(r2, r6);	 Catch:{ all -> 0x001c }
        r6 = 0;	 Catch:{ all -> 0x001c }
        r5[r6] = r2;	 Catch:{ all -> 0x001c }
        r2 = 4;	 Catch:{ all -> 0x001c }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x001c }
        r1 = defpackage.ajxs.a(r1, r2);	 Catch:{ all -> 0x001c }
        r5[r33] = r1;	 Catch:{ all -> 0x001c }
        r1 = defpackage.ajzm.a(r5);	 Catch:{ all -> 0x001c }
        r28 = r14.a(r1);	 Catch:{ all -> 0x001c }
        r1 = new rkq;	 Catch:{ all -> 0x001c }
        r21 = r14;	 Catch:{ all -> 0x001c }
        r21 = (defpackage.riq) r21;	 Catch:{ all -> 0x001c }
        r2 = r15.a;	 Catch:{ all -> 0x001c }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x001c }
        r22 = r2.booleanValue();	 Catch:{ all -> 0x001c }
        r2 = r14.ak;	 Catch:{ all -> 0x001c }
        r24 = r49.p();	 Catch:{ all -> 0x001c }
        r5 = r49.n();	 Catch:{ all -> 0x001c }
        r25 = r5.d();	 Catch:{ all -> 0x001c }
        r5 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r5 != 0) goto L_0x0361;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r6 = r49.a();	 Catch:{ all -> 0x001c }
        r6 = r6.b;	 Catch:{ all -> 0x001c }
        if (r6 != 0) goto L_0x036c;	 Catch:{ all -> 0x001c }
        r27 = r45;	 Catch:{ all -> 0x001c }
        goto L_0x036e;	 Catch:{ all -> 0x001c }
        r27 = r6;	 Catch:{ all -> 0x001c }
        r30 = r49.u();	 Catch:{ all -> 0x001c }
        r20 = r1;	 Catch:{ all -> 0x001c }
        r23 = r2;	 Catch:{ all -> 0x001c }
        r26 = r5;	 Catch:{ all -> 0x001c }
        r29 = r40;	 Catch:{ all -> 0x001c }
        r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);	 Catch:{ all -> 0x001c }
        r8.add(r1);	 Catch:{ all -> 0x001c }
        r1 = defpackage.aazf.BEST_FRIENDS;	 Catch:{ all -> 0x001c }
        r7.add(r1);	 Catch:{ all -> 0x001c }
        r1 = r12.c;	 Catch:{ all -> 0x0794 }
        if (r1 == 0) goto L_0x04a5;
        r1 = r49.t();	 Catch:{ all -> 0x001c }
        r2 = defpackage.jic.RECENTS_INIT_SIZE_KEY;	 Catch:{ all -> 0x001c }
        r2 = (defpackage.fth) r2;	 Catch:{ all -> 0x001c }
        r1 = r1.s(r2);	 Catch:{ all -> 0x001c }
        r2 = r14.f;	 Catch:{ all -> 0x001c }
        r2 = r2.i();	 Catch:{ all -> 0x001c }
        r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x001c }
        r29 = r1.b(r2);	 Catch:{ all -> 0x001c }
        r1 = r49.t();	 Catch:{ all -> 0x001c }
        r2 = defpackage.jic.RECENTS_INCREMENT_KEY;	 Catch:{ all -> 0x001c }
        r2 = (defpackage.fth) r2;	 Catch:{ all -> 0x001c }
        r1 = r1.s(r2);	 Catch:{ all -> 0x001c }
        r2 = r14.f;	 Catch:{ all -> 0x001c }
        r2 = r2.i();	 Catch:{ all -> 0x001c }
        r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x001c }
        r30 = r1.b(r2);	 Catch:{ all -> 0x001c }
        r1 = r49.t();	 Catch:{ all -> 0x001c }
        r2 = defpackage.jic.RECENTS_MAX_SIZE_KEY;	 Catch:{ all -> 0x001c }
        r2 = (defpackage.fth) r2;	 Catch:{ all -> 0x001c }
        r1 = r1.s(r2);	 Catch:{ all -> 0x001c }
        r2 = r14.f;	 Catch:{ all -> 0x001c }
        r2 = r2.i();	 Catch:{ all -> 0x001c }
        r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x001c }
        r31 = r1.b(r2);	 Catch:{ all -> 0x001c }
        r1 = r49.t();	 Catch:{ all -> 0x001c }
        r2 = defpackage.jic.SEND_TO_LAST_SNAP_RECIPIENTS_BUTTON_TYPE;	 Catch:{ all -> 0x001c }
        r2 = (defpackage.fth) r2;	 Catch:{ all -> 0x001c }
        r1 = r1.s(r2);	 Catch:{ all -> 0x001c }
        r2 = r14.f;	 Catch:{ all -> 0x001c }
        r2 = r2.i();	 Catch:{ all -> 0x001c }
        r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x001c }
        r1 = r1.b(r2);	 Catch:{ all -> 0x001c }
        r2 = r50.g();	 Catch:{ all -> 0x001c }
        r5 = "target.completedEventObservable";	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r2, r5);	 Catch:{ all -> 0x001c }
        r5 = "lastSnapRecipientsButtonType";	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r1, r5);	 Catch:{ all -> 0x001c }
        r5 = r1;	 Catch:{ all -> 0x001c }
        r5 = (defpackage.ajdt) r5;	 Catch:{ all -> 0x001c }
        r2 = defpackage.ajwb.a(r2, r5);	 Catch:{ all -> 0x001c }
        r5 = r14.f;	 Catch:{ all -> 0x001c }
        r5 = r5.i();	 Catch:{ all -> 0x001c }
        r5 = (defpackage.ajdw) r5;	 Catch:{ all -> 0x001c }
        r2 = r2.a(r5);	 Catch:{ all -> 0x001c }
        r5 = com.snap.messaging.sendto.internal.ui.SendToPresenter.m.a;	 Catch:{ all -> 0x001c }
        r5 = (defpackage.ajfc) r5;	 Catch:{ all -> 0x001c }
        r2 = r2.p(r5);	 Catch:{ all -> 0x001c }
        r5 = "target.completedEventObs…p { pair -> pair.second }";	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r2, r5);	 Catch:{ all -> 0x001c }
        r5 = r49.e();	 Catch:{ all -> 0x001c }
        r6 = new com.snap.messaging.sendto.internal.ui.SendToPresenter$n;	 Catch:{ all -> 0x001c }
        r6.<init>(r14);	 Catch:{ all -> 0x001c }
        r6 = (defpackage.akbl) r6;	 Catch:{ all -> 0x001c }
        r2 = defpackage.rhv.a(r2, r5, r6);	 Catch:{ all -> 0x001c }
        r5 = r49.f();	 Catch:{ all -> 0x001c }
        defpackage.ajvv.a(r2, r5);	 Catch:{ all -> 0x001c }
        r2 = new rky;	 Catch:{ all -> 0x001c }
        r21 = r14;	 Catch:{ all -> 0x001c }
        r21 = (defpackage.riq) r21;	 Catch:{ all -> 0x001c }
        r5 = r14.ak;	 Catch:{ all -> 0x001c }
        r6 = r14.ai;	 Catch:{ all -> 0x001c }
        if (r6 != 0) goto L_0x043c;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r10);	 Catch:{ all -> 0x001c }
        r24 = r49.p();	 Catch:{ all -> 0x001c }
        r9 = r49.n();	 Catch:{ all -> 0x001c }
        r25 = r9.g();	 Catch:{ all -> 0x001c }
        r9 = r49.n();	 Catch:{ all -> 0x001c }
        r9 = r9.e;	 Catch:{ all -> 0x001c }
        r9 = r9.b();	 Catch:{ all -> 0x001c }
        r26 = r9;	 Catch:{ all -> 0x001c }
        r26 = (defpackage.ajdp) r26;	 Catch:{ all -> 0x001c }
        r9 = defpackage.ajyy.a;	 Catch:{ all -> 0x001c }
        r28 = r9;	 Catch:{ all -> 0x001c }
        r28 = (java.util.Set) r28;	 Catch:{ all -> 0x001c }
        r9 = defpackage.ajyw.a;	 Catch:{ all -> 0x001c }
        r9 = (java.util.List) r9;	 Catch:{ all -> 0x001c }
        r32 = defpackage.ajdp.b(r9);	 Catch:{ all -> 0x001c }
        r9 = 0;	 Catch:{ all -> 0x001c }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x001c }
        r33 = defpackage.ajdp.b(r9);	 Catch:{ all -> 0x001c }
        r34 = r49.w();	 Catch:{ all -> 0x001c }
        r9 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r9 != 0) goto L_0x0478;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r46 = r11;	 Catch:{ all -> 0x001c }
        r11 = r49.a();	 Catch:{ all -> 0x001c }
        r11 = r11.b;	 Catch:{ all -> 0x001c }
        if (r11 != 0) goto L_0x0485;	 Catch:{ all -> 0x001c }
        r36 = r45;	 Catch:{ all -> 0x001c }
        goto L_0x0487;	 Catch:{ all -> 0x001c }
        r36 = r11;	 Catch:{ all -> 0x001c }
        r11 = r14.k;	 Catch:{ all -> 0x001c }
        r20 = r2;	 Catch:{ all -> 0x001c }
        r22 = r5;	 Catch:{ all -> 0x001c }
        r23 = r6;	 Catch:{ all -> 0x001c }
        r27 = r1;	 Catch:{ all -> 0x001c }
        r35 = r9;	 Catch:{ all -> 0x001c }
        r37 = r3;	 Catch:{ all -> 0x001c }
        r38 = r40;	 Catch:{ all -> 0x001c }
        r39 = r11;	 Catch:{ all -> 0x001c }
        r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39);	 Catch:{ all -> 0x001c }
        r8.add(r2);	 Catch:{ all -> 0x001c }
        r1 = defpackage.aazf.RECENTS;	 Catch:{ all -> 0x001c }
        r7.add(r1);	 Catch:{ all -> 0x001c }
        goto L_0x04a7;
        r46 = r11;
        r1 = r12.e;	 Catch:{ all -> 0x0794 }
        if (r1 == 0) goto L_0x04e4;
        r1 = new rks;	 Catch:{ all -> 0x001c }
        r21 = r14;	 Catch:{ all -> 0x001c }
        r21 = (defpackage.riq) r21;	 Catch:{ all -> 0x001c }
        r2 = r14.ak;	 Catch:{ all -> 0x001c }
        r5 = r14.ai;	 Catch:{ all -> 0x001c }
        if (r5 != 0) goto L_0x04ba;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r10);	 Catch:{ all -> 0x001c }
        r6 = r49.n();	 Catch:{ all -> 0x001c }
        r24 = r6.f();	 Catch:{ all -> 0x001c }
        r6 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r6 != 0) goto L_0x04c9;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r29 = 0;	 Catch:{ all -> 0x001c }
        r20 = r1;	 Catch:{ all -> 0x001c }
        r22 = r2;	 Catch:{ all -> 0x001c }
        r23 = r5;	 Catch:{ all -> 0x001c }
        r25 = r6;	 Catch:{ all -> 0x001c }
        r26 = r3;	 Catch:{ all -> 0x001c }
        r27 = r40;	 Catch:{ all -> 0x001c }
        r28 = r4;	 Catch:{ all -> 0x001c }
        r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29);	 Catch:{ all -> 0x001c }
        r8.add(r1);	 Catch:{ all -> 0x001c }
        r1 = defpackage.aazf.GROUPS;	 Catch:{ all -> 0x001c }
        r7.add(r1);	 Catch:{ all -> 0x001c }
        r1 = r12.f;	 Catch:{ all -> 0x0794 }
        if (r1 == 0) goto L_0x0538;
        r1 = new rkm;	 Catch:{ all -> 0x001c }
        r20 = r14;	 Catch:{ all -> 0x001c }
        r20 = (defpackage.riq) r20;	 Catch:{ all -> 0x001c }
        r2 = r14.ak;	 Catch:{ all -> 0x001c }
        r22 = r49.p();	 Catch:{ all -> 0x001c }
        r5 = r49.n();	 Catch:{ all -> 0x001c }
        r23 = r5.c();	 Catch:{ all -> 0x001c }
        r5 = r12.u;	 Catch:{ all -> 0x001c }
        if (r5 == 0) goto L_0x0503;	 Catch:{ all -> 0x001c }
        r5 = r14.au;	 Catch:{ all -> 0x001c }
        goto L_0x0509;	 Catch:{ all -> 0x001c }
        r5 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x001c }
        r5 = defpackage.ajdp.b(r5);	 Catch:{ all -> 0x001c }
        r24 = r5;	 Catch:{ all -> 0x001c }
        r5 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r5 != 0) goto L_0x0512;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r6 = r49.a();	 Catch:{ all -> 0x001c }
        r6 = r6.b;	 Catch:{ all -> 0x001c }
        if (r6 != 0) goto L_0x051d;	 Catch:{ all -> 0x001c }
        r26 = r45;	 Catch:{ all -> 0x001c }
        goto L_0x051f;	 Catch:{ all -> 0x001c }
        r26 = r6;	 Catch:{ all -> 0x001c }
        r19 = r1;	 Catch:{ all -> 0x001c }
        r21 = r2;	 Catch:{ all -> 0x001c }
        r25 = r5;	 Catch:{ all -> 0x001c }
        r27 = r3;	 Catch:{ all -> 0x001c }
        r28 = r40;	 Catch:{ all -> 0x001c }
        r29 = r12;	 Catch:{ all -> 0x001c }
        r30 = r4;	 Catch:{ all -> 0x001c }
        r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);	 Catch:{ all -> 0x001c }
        r8.add(r1);	 Catch:{ all -> 0x001c }
        r1 = defpackage.aazf.FRIENDS;	 Catch:{ all -> 0x001c }
        r7.add(r1);	 Catch:{ all -> 0x001c }
        r1 = r12.u;	 Catch:{ all -> 0x0794 }
        r11 = "userAuthStore";
        if (r1 == 0) goto L_0x05ad;
        r10 = new rkw;	 Catch:{ all -> 0x001c }
        r1 = r49.n();	 Catch:{ all -> 0x001c }
        r2 = r1.c();	 Catch:{ all -> 0x001c }
        r1 = r49.n();	 Catch:{ all -> 0x001c }
        r3 = r1.e();	 Catch:{ all -> 0x001c }
        r4 = r49.o();	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r4, r11);	 Catch:{ all -> 0x001c }
        r5 = r14.as;	 Catch:{ all -> 0x001c }
        r9 = r49.p();	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r9, r13);	 Catch:{ all -> 0x001c }
        r6 = r14.ak;	 Catch:{ all -> 0x001c }
        r1 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r1 != 0) goto L_0x0569;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r19 = r1;	 Catch:{ all -> 0x001c }
        r1 = r10;	 Catch:{ all -> 0x001c }
        r20 = r6;	 Catch:{ all -> 0x001c }
        r6 = r40;	 Catch:{ all -> 0x001c }
        r15 = r7;	 Catch:{ all -> 0x001c }
        r7 = r9;	 Catch:{ all -> 0x001c }
        r9 = r8;	 Catch:{ all -> 0x001c }
        r8 = r20;	 Catch:{ all -> 0x001c }
        r30 = r15;	 Catch:{ all -> 0x001c }
        r15 = r9;	 Catch:{ all -> 0x001c }
        r9 = r49;	 Catch:{ all -> 0x001c }
        r20 = r12;	 Catch:{ all -> 0x001c }
        r12 = r10;	 Catch:{ all -> 0x001c }
        r10 = r19;	 Catch:{ all -> 0x001c }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x001c }
        r15.add(r12);	 Catch:{ all -> 0x001c }
        r9 = new rkl;	 Catch:{ all -> 0x001c }
        r1 = r49.n();	 Catch:{ all -> 0x001c }
        r2 = r1.e();	 Catch:{ all -> 0x001c }
        r3 = r14.at;	 Catch:{ all -> 0x001c }
        r5 = r49.p();	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r5, r13);	 Catch:{ all -> 0x001c }
        r6 = r14.ak;	 Catch:{ all -> 0x001c }
        r8 = r14.aj;	 Catch:{ all -> 0x001c }
        if (r8 != 0) goto L_0x05a1;	 Catch:{ all -> 0x001c }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r1 = r9;	 Catch:{ all -> 0x001c }
        r4 = r40;	 Catch:{ all -> 0x001c }
        r7 = r49;	 Catch:{ all -> 0x001c }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x001c }
        r15.add(r9);	 Catch:{ all -> 0x001c }
        goto L_0x05b2;
        r30 = r7;
        r15 = r8;
        r20 = r12;
        r1 = r14.q;	 Catch:{ all -> 0x0794 }
        if (r1 == 0) goto L_0x060e;
        r12 = new rlb;	 Catch:{ all -> 0x0790 }
        r1 = r49.n();	 Catch:{ all -> 0x0790 }
        r2 = r1.g();	 Catch:{ all -> 0x0790 }
        r1 = r49.n();	 Catch:{ all -> 0x0790 }
        r4 = r1.f();	 Catch:{ all -> 0x0790 }
        r1 = r49.n();	 Catch:{ all -> 0x0790 }
        r5 = r1.c();	 Catch:{ all -> 0x0790 }
        r6 = r49.l();	 Catch:{ all -> 0x0790 }
        r7 = r14.ak;	 Catch:{ all -> 0x0790 }
        r9 = r49.p();	 Catch:{ all -> 0x0790 }
        defpackage.akcr.a(r9, r13);	 Catch:{ all -> 0x0790 }
        r10 = r49.o();	 Catch:{ all -> 0x0790 }
        defpackage.akcr.a(r10, r11);	 Catch:{ all -> 0x0790 }
        r1 = r14.l;	 Catch:{ all -> 0x0790 }
        r19 = r1;	 Catch:{ all -> 0x0790 }
        r19 = (defpackage.ajdp) r19;	 Catch:{ all -> 0x0790 }
        r8 = r14.aj;	 Catch:{ all -> 0x0790 }
        if (r8 != 0) goto L_0x05f1;
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x001c }
        r1 = r12;
        r3 = r44;
        r21 = r8;
        r8 = r40;
        r47 = r11;
        r31 = r46;
        r11 = r49;
        r14 = r12;
        r32 = r42;
        r12 = r19;
        r48 = r13;
        r13 = r21;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);	 Catch:{ all -> 0x0790 }
        r15.add(r14);	 Catch:{ all -> 0x0790 }
        goto L_0x0616;	 Catch:{ all -> 0x0790 }
        r47 = r11;	 Catch:{ all -> 0x0790 }
        r48 = r13;	 Catch:{ all -> 0x0790 }
        r32 = r42;	 Catch:{ all -> 0x0790 }
        r31 = r46;	 Catch:{ all -> 0x0790 }
        r1 = r20;	 Catch:{ all -> 0x0790 }
        r2 = r1.g;	 Catch:{ all -> 0x0790 }
        if (r2 == 0) goto L_0x065a;	 Catch:{ all -> 0x0790 }
        r2 = new rkx;	 Catch:{ all -> 0x0790 }
        r12 = r49;
        r13 = r1;
        r21 = r12;	 Catch:{ all -> 0x078e }
        r21 = (defpackage.riq) r21;	 Catch:{ all -> 0x078e }
        r1 = r12.ak;	 Catch:{ all -> 0x078e }
        r24 = r49.p();	 Catch:{ all -> 0x078e }
        r3 = r49.n();	 Catch:{ all -> 0x078e }
        r25 = r3.e();	 Catch:{ all -> 0x078e }
        r26 = r49.w();	 Catch:{ all -> 0x078e }
        r27 = "";	 Catch:{ all -> 0x078e }
        r3 = r12.aj;	 Catch:{ all -> 0x078e }
        if (r3 != 0) goto L_0x0640;	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x078e }
        r29 = r49.u();	 Catch:{ all -> 0x078e }
        r20 = r2;	 Catch:{ all -> 0x078e }
        r22 = r40;	 Catch:{ all -> 0x078e }
        r23 = r1;	 Catch:{ all -> 0x078e }
        r28 = r3;	 Catch:{ all -> 0x078e }
        r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29);	 Catch:{ all -> 0x078e }
        r15.add(r2);	 Catch:{ all -> 0x078e }
        r1 = defpackage.aazf.QUICK_ADD;	 Catch:{ all -> 0x078e }
        r14 = r30;	 Catch:{ all -> 0x078e }
        r14.add(r1);	 Catch:{ all -> 0x078e }
        goto L_0x065f;	 Catch:{ all -> 0x078e }
        r12 = r49;	 Catch:{ all -> 0x078e }
        r13 = r1;	 Catch:{ all -> 0x078e }
        r14 = r30;	 Catch:{ all -> 0x078e }
        r1 = r13.h;	 Catch:{ all -> 0x078e }
        if (r1 == 0) goto L_0x06dc;	 Catch:{ all -> 0x078e }
        r1 = r49.n();	 Catch:{ all -> 0x078e }
        r1 = r1.c();	 Catch:{ all -> 0x078e }
        r2 = r49.t();	 Catch:{ all -> 0x078e }
        r3 = defpackage.jic.ST_SEARCH_V2_ENABLE;	 Catch:{ all -> 0x078e }
        r3 = (defpackage.fth) r3;	 Catch:{ all -> 0x078e }
        r2 = r2.p(r3);	 Catch:{ all -> 0x078e }
        r3 = "configProvider.observeBo…nKey.ST_SEARCH_V2_ENABLE)";	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x078e }
        r2 = (defpackage.ajdt) r2;	 Catch:{ all -> 0x078e }
        r1 = defpackage.ajwb.a(r1, r2);	 Catch:{ all -> 0x078e }
        r2 = com.snap.messaging.sendto.internal.ui.SendToPresenter.q.a;	 Catch:{ all -> 0x078e }
        r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x078e }
        r7 = r1.p(r2);	 Catch:{ all -> 0x078e }
        r11 = new rkk;	 Catch:{ all -> 0x078e }
        r4 = r12.ak;	 Catch:{ all -> 0x078e }
        r5 = r49.p();	 Catch:{ all -> 0x078e }
        r1 = r48;	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r5, r1);	 Catch:{ all -> 0x078e }
        r1 = r49.n();	 Catch:{ all -> 0x078e }
        r6 = r1.c();	 Catch:{ all -> 0x078e }
        r1 = "showSection";	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r7, r1);	 Catch:{ all -> 0x078e }
        r1 = r12.W;	 Catch:{ all -> 0x078e }
        r1 = r1.b();	 Catch:{ all -> 0x078e }
        r8 = r1;	 Catch:{ all -> 0x078e }
        r8 = (defpackage.ira) r8;	 Catch:{ all -> 0x078e }
        r1 = "identityApi";	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r8, r1);	 Catch:{ all -> 0x078e }
        r1 = r12.Y;	 Catch:{ all -> 0x078e }
        r1 = r1.b();	 Catch:{ all -> 0x078e }
        r9 = r1;	 Catch:{ all -> 0x078e }
        r9 = (defpackage.ixj) r9;	 Catch:{ all -> 0x078e }
        r1 = "friendRepository";	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r9, r1);	 Catch:{ all -> 0x078e }
        r10 = r12.aj;	 Catch:{ all -> 0x078e }
        if (r10 != 0) goto L_0x06c7;	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r41);	 Catch:{ all -> 0x078e }
        r3 = r12.f;	 Catch:{ all -> 0x078e }
        r1 = r11;	 Catch:{ all -> 0x078e }
        r2 = r49;	 Catch:{ all -> 0x078e }
        r19 = r3;	 Catch:{ all -> 0x078e }
        r3 = r40;	 Catch:{ all -> 0x078e }
        r30 = r14;	 Catch:{ all -> 0x078e }
        r14 = r11;	 Catch:{ all -> 0x078e }
        r11 = r19;	 Catch:{ all -> 0x078e }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x078e }
        r15.add(r14);	 Catch:{ all -> 0x078e }
        goto L_0x06de;	 Catch:{ all -> 0x078e }
        r30 = r14;	 Catch:{ all -> 0x078e }
        r1 = r13.l;	 Catch:{ all -> 0x078e }
        if (r1 == 0) goto L_0x0719;	 Catch:{ all -> 0x078e }
        r1 = r49.n();	 Catch:{ all -> 0x078e }
        r1 = r1.c();	 Catch:{ all -> 0x078e }
        r2 = r12.f;	 Catch:{ all -> 0x078e }
        r2 = r2.b();	 Catch:{ all -> 0x078e }
        r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x078e }
        r1 = r1.a(r2);	 Catch:{ all -> 0x078e }
        r2 = new com.snap.messaging.sendto.internal.ui.SendToPresenter$p;	 Catch:{ all -> 0x078e }
        r2.<init>(r12);	 Catch:{ all -> 0x078e }
        r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x078e }
        r1 = r1.p(r2);	 Catch:{ all -> 0x078e }
        r2 = new rkz;	 Catch:{ all -> 0x078e }
        r3 = "shouldShowAddContactsFooterObservable";	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r1, r3);	 Catch:{ all -> 0x078e }
        r3 = r12.av;	 Catch:{ all -> 0x078e }
        r4 = r49.o();	 Catch:{ all -> 0x078e }
        r5 = r47;	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x078e }
        r2.<init>(r12, r1, r3, r4);	 Catch:{ all -> 0x078e }
        r15.add(r2);	 Catch:{ all -> 0x078e }
        r1 = r50.m();	 Catch:{ all -> 0x078e }
        if (r1 == 0) goto L_0x0726;	 Catch:{ all -> 0x078e }
        r7 = r30;	 Catch:{ all -> 0x078e }
        r7 = (java.util.List) r7;	 Catch:{ all -> 0x078e }
        r1.b(r7);	 Catch:{ all -> 0x078e }
        r1 = r15.build();	 Catch:{ all -> 0x078e }
        r2 = "sectionsBuilder.build()";	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x078e }
        r6 = r1;	 Catch:{ all -> 0x078e }
        r6 = (java.util.List) r6;	 Catch:{ all -> 0x078e }
        r7 = 32;	 Catch:{ all -> 0x078e }
        r1 = r32;	 Catch:{ all -> 0x078e }
        r2 = r31;	 Catch:{ all -> 0x078e }
        r3 = r43;	 Catch:{ all -> 0x078e }
        r4 = r17;	 Catch:{ all -> 0x078e }
        r5 = r18;	 Catch:{ all -> 0x078e }
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x078e }
        r12.d = r1;	 Catch:{ all -> 0x078e }
        r1 = r49.f();	 Catch:{ all -> 0x078e }
        r2 = r49.t();	 Catch:{ all -> 0x078e }
        r3 = defpackage.jic.SEND_TO_SECTIONS_IN_ORDER_LOADING;	 Catch:{ all -> 0x078e }
        r3 = (defpackage.fth) r3;	 Catch:{ all -> 0x078e }
        r2 = r2.p(r3);	 Catch:{ all -> 0x078e }
        r3 = r16.h();	 Catch:{ all -> 0x078e }
        r3 = (defpackage.ajdw) r3;	 Catch:{ all -> 0x078e }
        r2 = r2.b(r3);	 Catch:{ all -> 0x078e }
        r3 = "configProvider\n         …dulers.userInteractive())";	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x078e }
        r3 = r49.e();	 Catch:{ all -> 0x078e }
        r4 = new com.snap.messaging.sendto.internal.ui.SendToPresenter$t;	 Catch:{ all -> 0x078e }
        r5 = r50;	 Catch:{ all -> 0x078e }
        r6 = r51;	 Catch:{ all -> 0x078e }
        r4.<init>(r12, r5, r6);	 Catch:{ all -> 0x078e }
        r4 = (defpackage.akbl) r4;	 Catch:{ all -> 0x078e }
        r2 = defpackage.rhv.a(r2, r3, r4);	 Catch:{ all -> 0x078e }
        r1.a(r2);	 Catch:{ all -> 0x078e }
        r1 = r49.f();	 Catch:{ all -> 0x078e }
        r2 = r12.d;	 Catch:{ all -> 0x078e }
        if (r2 != 0) goto L_0x0785;	 Catch:{ all -> 0x078e }
        r3 = "adapter";	 Catch:{ all -> 0x078e }
        defpackage.akcr.a(r3);	 Catch:{ all -> 0x078e }
        r2 = r2.e();	 Catch:{ all -> 0x078e }
        r1 = r1.a(r2);	 Catch:{ all -> 0x078e }
        return r1;
        r0 = move-exception;
        goto L_0x0796;
        r0 = move-exception;
        r12 = r49;
        goto L_0x0796;
        r0 = move-exception;
        r12 = r14;
        r1 = r0;
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.sendto.internal.ui.SendToPresenter.a(com.snap.messaging.sendto.internal.SendToFragmentImpl, ajxm):boolean");
    }

    /* Access modifiers changed, original: final */
    public final rhs b() {
        return (rhs) this.V.b();
    }

    /* Access modifiers changed, original: final */
    public final yid c() {
        return (yid) this.Z.b();
    }

    /* Access modifiers changed, original: final */
    public final rht d() {
        return (rht) this.ab.b();
    }

    public final void dropTarget() {
        SendToFragmentImpl sendToFragmentImpl = (SendToFragmentImpl) getTarget();
        if (sendToFragmentImpl != null) {
            defpackage.j lifecycle = sendToFragmentImpl.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
        f().a();
    }

    /* Access modifiers changed, original: final */
    public final gqr e() {
        return (gqr) this.ag.b();
    }

    /* Access modifiers changed, original: final */
    public final ajei f() {
        return (ajei) this.ap.b();
    }

    public final ajdp<String> g() {
        return this.g;
    }

    public final rhf h() {
        return this.e;
    }

    public final rig i() {
        SendToFragmentImpl sendToFragmentImpl = (SendToFragmentImpl) getTarget();
        if (sendToFragmentImpl != null) {
            rhz m = sendToFragmentImpl.m();
            if (m != null) {
                return m;
            }
        }
        return new rib();
    }

    public final rif j() {
        SendToFragmentImpl sendToFragmentImpl = (SendToFragmentImpl) getTarget();
        if (sendToFragmentImpl != null) {
            rif n = sendToFragmentImpl.n();
            if (n != null) {
                return n;
            }
        }
        return new rib();
    }

    public final zfw k() {
        return this.f;
    }

    public final ajdp<rhf> l() {
        Object b = this.e.b();
        akcr.a(b, "selectionState.updatesObservable");
        return b;
    }

    public final zkf m() {
        zkf zkf = this.ai;
        if (zkf == null) {
            akcr.a("bus");
        }
        return zkf;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCreateGroupChatEvent(rjf rjf) {
        akcr.b(rjf, "event");
        Object a = ajdx.c((Callable) new v(this)).b((ajdw) this.f.i()).a((ajdw) this.f.l());
        akcr.a(a, "Single.fromCallable {\n  …(schedulers.mainThread())");
        akbl wVar = new w(this);
        akbl a2 = rhv.a(e());
        akcr.b(a, "receiver$0");
        akcr.b(a2, "onError");
        akcr.b(wVar, "onSuccess");
        ajej a3 = a.a((ajfb) new rhx(wVar), (ajfb) new rhx(a2));
        akcr.a((Object) a3, "subscribe(onSuccess, onError)");
        ajvv.a(a3, f());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCreateStoryEvent(rjg rjg) {
        akcr.b(rjg, "event");
        d().d();
    }

    @defpackage.s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        SendToFragmentImpl sendToFragmentImpl = (SendToFragmentImpl) getTarget();
        RecyclerView i = sendToFragmentImpl != null ? sendToFragmentImpl.i() : null;
        if (i == null) {
            akcr.a();
        }
        zmh zmh = this.d;
        if (zmh == null) {
            akcr.a("adapter");
        }
        i.setAdapter(zmh);
    }

    @akqq
    public final void onSelectionEvent(rjo rjo) {
        String str = "event";
        akcr.b(rjo, str);
        akcr.b(rjo, str);
        riu r = r();
        akcr.b(rjo, str);
        int i = 1;
        Object obj = (rjo.c && (rjo.b instanceof rhj) && akcr.a(rjo.b.e.b, ppy.m) && (akcr.a(r.a, Boolean.TRUE) ^ 1) != 0) ? 1 : null;
        if (obj != null) {
            r().a(this, this.e, rjo);
        } else {
            riv q = q();
            akcr.b(rjo, str);
            Object obj2 = (rjo.c && (rjo.b instanceof rho) && (akcr.a(q.a, Boolean.TRUE) ^ 1) != 0) ? 1 : null;
            if (obj2 != null) {
                q().a(this.e, rjo);
            } else {
                riw s = s();
                akcr.b(rjo, "selectionEvent");
                obj2 = (!rjo.c || (akcr.a(s.a, Boolean.TRUE) ^ 1) == 0) ? null : 1;
                if (obj2 != null) {
                    SendToFragmentImpl sendToFragmentImpl = (SendToFragmentImpl) getTarget();
                    if (sendToFragmentImpl != null) {
                        rgq l = sendToFragmentImpl.l();
                        if (l != null && l.o) {
                            riw.a(s(), false, new aj(this, rjo), 1);
                        }
                    }
                }
                if (rjo.c) {
                    int i2;
                    if (!(rjo.b instanceof rhj)) {
                        i2 = this.e.i();
                        Integer num = this.ao;
                        if (i2 >= (num != null ? num.intValue() : Callback.DEFAULT_DRAG_ANIMATION_DURATION)) {
                            d().a();
                        }
                    }
                    if (rjo.b instanceof rhj) {
                        if (this.e.j() >= 7) {
                            d().b();
                        } else {
                            i2 = rip.a[((rhj) rjo.b).b.ordinal()];
                            if (i2 == 1 || i2 == 2) {
                                d().a(new ak(this, rjo));
                            } else if (i2 == 3) {
                                d().b(new al(this, rjo));
                            } else if (i2 == 4) {
                                d().a(((rhj) rjo.b).a, new am(this, rjo));
                            }
                        }
                    }
                }
                i = 0;
            }
        }
        if (i == 0) {
            this.e.a(rjo.b, rjo.c);
            if (rjo.c) {
                rhn rhn = rjo.d;
                if (rhn != null) {
                    this.e.a(rhn, rjo.c);
                }
            }
        }
    }

    @akqq
    public final void onSendToEditTextChangeEvent(rjm rjm) {
        akcr.b(rjm, "event");
        this.j = rjm.a();
    }

    @akqq
    public final void onSendToFooterCtaButtonClickedEvent(rjh rjh) {
        akcr.b(rjh, "event");
        d().c();
    }

    @akqq
    public final void onSendToLastSnapRecipientsSelectionEvent(rji rji) {
        akcr.b(rji, "event");
        if (this.e.a(rji.a) > Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
            this.e.h();
            d().a();
            return;
        }
        this.e.a(rji.a, rji.b);
    }

    @akqq
    public final void onSendToNewUserAddFriendsEvent(rjk rjk) {
        akcr.b(rjk, "event");
        d().c();
    }

    @akqq
    public final void onSendToScrollEvent(rjn rjn) {
        akcr.b(rjn, "event");
        iue iue = this.i;
        if (iue == null) {
            akcr.a("scrollBarController");
        }
        iue.a(rjn.a);
    }

    @akqq
    public final void onSnappablesPromptClickedEvent(rjp rjp) {
        akcr.b(rjp, "event");
        riw.a(s(), true, null, 2);
    }
}
