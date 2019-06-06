package com.snap.stories.ui;

import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StoryNoteRecord.SelectStoryNotesViewerSearchRecord;
import com.snap.core.db.record.StoryRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.StorySnapRecordBase;
import com.snap.imageloading.view.SnapImageView;
import defpackage.aahb;
import defpackage.aajy;
import defpackage.aajz;
import defpackage.aaug;
import defpackage.abbd;
import defpackage.abfx;
import defpackage.abss;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwl;
import defpackage.ajws;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.ajyl;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akqq;
import defpackage.fvk;
import defpackage.gcn;
import defpackage.gct;
import defpackage.gpb;
import defpackage.ihh;
import defpackage.ihi;
import defpackage.jwa;
import defpackage.jwc;
import defpackage.ppz;
import defpackage.psa;
import defpackage.sks;
import defpackage.slg;
import defpackage.slh;
import defpackage.smi;
import defpackage.sqx;
import defpackage.srk;
import defpackage.ssi;
import defpackage.ssj;
import defpackage.sso;
import defpackage.stl;
import defpackage.szw;
import defpackage.usd;
import defpackage.usg;
import defpackage.usq;
import defpackage.yhj;
import defpackage.yhl;
import defpackage.yhx;
import defpackage.yhy;
import defpackage.yit;
import defpackage.ynp;
import defpackage.ypc;
import defpackage.ypd;
import defpackage.ypr;
import defpackage.yps;
import defpackage.ypu;
import defpackage.ypv;
import defpackage.ypx;
import defpackage.ypy;
import defpackage.yqg;
import defpackage.yrb;
import defpackage.yrc;
import defpackage.yrf;
import defpackage.yrg;
import defpackage.yri;
import defpackage.yrj;
import defpackage.yrk;
import defpackage.yrl;
import defpackage.yrm;
import defpackage.yrn;
import defpackage.yro;
import defpackage.yrp;
import defpackage.yrq;
import defpackage.ytk;
import defpackage.ytl;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zhk;
import defpackage.zhn;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;
import defpackage.zmq;
import defpackage.zmy;
import defpackage.znh;
import defpackage.znk;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;

public final class StoryManagementPresenter extends zll<yps> implements defpackage.k {
    private final ajxe A;
    private final ajxe B;
    private final ajxe C;
    private final ajxe D;
    private final ajxe E;
    zke a;
    final zfw b = zgb.a(yhy.j.callsite("StoryManagementPresenter"));
    Long c;
    public Long d;
    boolean e;
    final ajwl<Boolean> f;
    final ajwl<ytk> g;
    final ajwl<Long> h;
    final ajwl<String> i;
    znh<StoryManagementStorySnapRecord> j;
    SnapImageView k;
    LinearSnapHelper l;
    final ajxe m;
    final Set<String> n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private final ajxe s;
    private final ajxe t;
    private final ajxe u;
    private final ajxe v;
    private final ajxe w;
    private final ajxe x;
    private final ajxe y;
    private Long z;

    static final class j implements Runnable {
        private /* synthetic */ StoryManagementPresenter a;

        j(StoryManagementPresenter storyManagementPresenter) {
            this.a = storyManagementPresenter;
        }

        public final void run() {
            yps yps = (yps) this.a.getTarget();
            if (yps != null) {
                yps.A();
            }
        }
    }

    static final class p implements Runnable {
        private /* synthetic */ StoryManagementPresenter a;
        private /* synthetic */ int b;

        p(StoryManagementPresenter storyManagementPresenter, int i) {
            this.a = storyManagementPresenter;
            this.b = i;
        }

        public final void run() {
            yps yps = (yps) this.a.getTarget();
            if (yps != null) {
                RecyclerView a = yps.a();
                if (a != null) {
                    a.scrollToPosition(this.b);
                }
            }
        }
    }

    static final class ab<T> implements ajfb<ytk> {
        private /* synthetic */ StoryManagementPresenter a;

        ab(StoryManagementPresenter storyManagementPresenter) {
            this.a = storyManagementPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ytk ytk = (ytk) obj;
            Object obj2 = ytk.b;
            SnapImageView snapImageView = this.a.k;
            if ((akcr.a(obj2, snapImageView != null ? snapImageView.getImageUri() : null) ^ 1) != 0) {
                SnapImageView snapImageView2 = this.a.k;
                if (snapImageView2 != null) {
                    snapImageView2.setImageUri(ytk.b, yhy.b);
                }
            }
        }
    }

    public static final class d extends OnScrollListener {
        private /* synthetic */ StoryManagementPresenter a;
        private /* synthetic */ LinearSnapHelper b;

        d(StoryManagementPresenter storyManagementPresenter, LinearSnapHelper linearSnapHelper) {
            this.a = storyManagementPresenter;
            this.b = linearSnapHelper;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            akcr.b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                View findSnapView = this.b.findSnapView(recyclerView.getLayoutManager());
                if (findSnapView != null) {
                    ViewHolder childViewHolder = recyclerView.getChildViewHolder(findSnapView);
                    Object obj = null;
                    if (!(childViewHolder instanceof zmq)) {
                        childViewHolder = null;
                    }
                    zmq zmq = (zmq) childViewHolder;
                    zmy c = zmq != null ? zmq.c() : null;
                    if (!(c instanceof ytl)) {
                        c = null;
                    }
                    ytl ytl = (ytl) c;
                    if (ytl != null) {
                        Object obj2 = ytl.a;
                        ytk ytk = (ytk) this.a.g.p();
                        if (ytk != null) {
                            obj = ytk.a;
                        }
                        if ((akcr.a(obj2, obj) ^ 1) != 0) {
                            this.a.g.a(new ytk(ytl.g));
                        }
                    }
                }
            }
        }
    }

    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(list);
        }
    }

    static final class f<T> implements ajfb<znh<StoryManagementStorySnapRecord>> {
        private /* synthetic */ StoryManagementPresenter a;

        f(StoryManagementPresenter storyManagementPresenter) {
            this.a = storyManagementPresenter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
        public final /* synthetic */ void accept(java.lang.Object r11) {
            /*
            r10 = this;
            r11 = (defpackage.znh) r11;
            r0 = r10.a;
            r0 = r0.f;
            r1 = java.lang.Boolean.FALSE;
            r0.a(r1);
            r0 = r10.a;
            r1 = "it";
            defpackage.akcr.a(r11, r1);
            r0.j = r11;
            r11 = r0.j;
            r11 = r11.a();
            if (r11 != 0) goto L_0x002f;
        L_0x001c:
            r11 = r0.b;
            r11 = r11.l();
            r11 = (defpackage.zfr) r11;
            r1 = new com.snap.stories.ui.StoryManagementPresenter$j;
            r1.<init>(r0);
            r1 = (java.lang.Runnable) r1;
            r11.a(r1);
            return;
        L_0x002f:
            r11 = r0.e;
            r1 = 1;
            r2 = 0;
            if (r11 != 0) goto L_0x003e;
        L_0x0035:
            r0.e = r1;
            r11 = r0.c;
            r0.a(r11);
            r11 = 1;
            goto L_0x003f;
        L_0x003e:
            r11 = 0;
        L_0x003f:
            if (r11 != 0) goto L_0x0109;
        L_0x0041:
            r11 = r0.g;
            r11 = r11.q();
            if (r11 == 0) goto L_0x008e;
        L_0x0049:
            r11 = r0.g;
            r11 = r11.p();
            if (r11 != 0) goto L_0x0054;
        L_0x0051:
            defpackage.akcr.a();
        L_0x0054:
            r3 = "selectedStorySnapViewModel.value!!";
            defpackage.akcr.a(r11, r3);
            r11 = (defpackage.ytk) r11;
            r3 = r0.j;
            r3 = (java.lang.Iterable) r3;
            r3 = r3.iterator();
        L_0x0063:
            r4 = r3.hasNext();
            if (r4 == 0) goto L_0x007d;
        L_0x0069:
            r4 = r3.next();
            r5 = r4;
            r5 = (com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord) r5;
            r5 = r5.snapId();
            r6 = r11.a;
            r5 = defpackage.akcr.a(r5, r6);
            if (r5 == 0) goto L_0x0063;
        L_0x007c:
            goto L_0x007e;
        L_0x007d:
            r4 = 0;
        L_0x007e:
            r4 = (com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord) r4;
            if (r4 == 0) goto L_0x008e;
        L_0x0082:
            r11 = r0.g;
            r3 = new ytk;
            r3.<init>(r4);
            r11.a(r3);
            r11 = 1;
            goto L_0x008f;
        L_0x008e:
            r11 = 0;
        L_0x008f:
            if (r11 != 0) goto L_0x0109;
        L_0x0091:
            r11 = r0.g;
            r11 = r11.q();
            if (r11 != 0) goto L_0x009a;
        L_0x0099:
            goto L_0x0106;
        L_0x009a:
            r11 = r0.g;
            r11 = r11.p();
            if (r11 != 0) goto L_0x00a5;
        L_0x00a2:
            defpackage.akcr.a();
        L_0x00a5:
            r11 = (defpackage.ytk) r11;
            r3 = r11.c;
            r11 = r0.j;
            r11 = (java.lang.Iterable) r11;
            r11 = r11.iterator();
            r5 = 0;
        L_0x00b2:
            r6 = r11.hasNext();
            r7 = -1;
            if (r6 == 0) goto L_0x00d5;
        L_0x00b9:
            r6 = r11.next();
            if (r5 >= 0) goto L_0x00c2;
        L_0x00bf:
            defpackage.ajym.a();
        L_0x00c2:
            r6 = (com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord) r6;
            r8 = r6.timestamp();
            r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
            if (r6 < 0) goto L_0x00ce;
        L_0x00cc:
            r6 = 1;
            goto L_0x00cf;
        L_0x00ce:
            r6 = 0;
        L_0x00cf:
            if (r6 == 0) goto L_0x00d2;
        L_0x00d1:
            goto L_0x00d6;
        L_0x00d2:
            r5 = r5 + 1;
            goto L_0x00b2;
        L_0x00d5:
            r5 = -1;
        L_0x00d6:
            if (r5 == r7) goto L_0x00da;
        L_0x00d8:
            r2 = r5;
            goto L_0x0106;
        L_0x00da:
            r11 = r0.j;
            r11 = (java.lang.Iterable) r11;
            r11 = r11.iterator();
            r5 = 0;
        L_0x00e3:
            r6 = r11.hasNext();
            if (r6 == 0) goto L_0x0105;
        L_0x00e9:
            r6 = r11.next();
            if (r5 >= 0) goto L_0x00f2;
        L_0x00ef:
            defpackage.ajym.a();
        L_0x00f2:
            r6 = (com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord) r6;
            r8 = r6.timestamp();
            r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
            if (r6 > 0) goto L_0x00fe;
        L_0x00fc:
            r6 = 1;
            goto L_0x00ff;
        L_0x00fe:
            r6 = 0;
        L_0x00ff:
            if (r6 == 0) goto L_0x0102;
        L_0x0101:
            r7 = r5;
        L_0x0102:
            r5 = r5 + 1;
            goto L_0x00e3;
        L_0x0105:
            r2 = r7;
        L_0x0106:
            r0.a(r2);
        L_0x0109:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.stories.ui.StoryManagementPresenter$f.accept(java.lang.Object):void");
        }
    }

    static final class g<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ StoryManagementPresenter a;

        g(StoryManagementPresenter storyManagementPresenter) {
            this.a = storyManagementPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            final ytk ytk = (ytk) ajxm.a;
            obj = (String) ajxm.b;
            yhx a = this.a.a();
            String str = ytk.a;
            akcr.a(obj, "viewerSearchSubstring");
            return a.a(str, obj, this.a.d().a()).c(1).d((ajfb) new ajfb<znh<SelectStoryNotesViewerSearchRecord>>(this) {
                private /* synthetic */ g a;

                public final /* synthetic */ void accept(Object obj) {
                    obj = (znh) obj;
                    if (((abss) this.a.a.m.b()).d()) {
                        StoryManagementPresenter storyManagementPresenter = this.a.a;
                        akcr.a(obj, "storyNotes");
                        obj = ytk;
                        akcr.a(obj, "selectedViewModel");
                        String str = obj.a;
                        if (!storyManagementPresenter.n.contains(str)) {
                            storyManagementPresenter.n.add(str);
                        }
                    }
                }
            });
        }
    }

    static final class y<T> implements ajfb<Throwable> {
        private /* synthetic */ long a;

        y(long j) {
            this.a = j;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class k extends akcs implements akbk<zjm> {
        public static final k a = new k();

        k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zjm(yhy.j, "StoryManagementPresenter", false, false, true, false, null, false, false, false, false, null, 4076);
        }
    }

    static final class n extends akcs implements akbl<Throwable, ajxw> {
        public static final n a = new n();

        n() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    static final class x extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ StoryManagementPresenter a;

        x(StoryManagementPresenter storyManagementPresenter) {
            this.a = storyManagementPresenter;
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r4) {
            /*
            r3 = this;
            r4 = (java.lang.Number) r4;
            r4 = r4.intValue();
            r0 = r3.a;
            r1 = r0.l;
            if (r1 != 0) goto L_0x0011;
        L_0x000c:
            r2 = "snapHelper";
            defpackage.akcr.a(r2);
        L_0x0011:
            r2 = r0.getTarget();
            r2 = (defpackage.yps) r2;
            if (r2 == 0) goto L_0x0024;
        L_0x0019:
            r2 = r2.a();
            if (r2 == 0) goto L_0x0024;
        L_0x001f:
            r2 = r2.getLayoutManager();
            goto L_0x0025;
        L_0x0024:
            r2 = 0;
        L_0x0025:
            r1 = r1.findSnapView(r2);
            r2 = r0.getTarget();
            r2 = (defpackage.yps) r2;
            if (r2 == 0) goto L_0x0059;
        L_0x0031:
            r2 = r2.a();
            if (r2 == 0) goto L_0x0059;
        L_0x0037:
            r1 = r2.getChildAdapterPosition(r1);
            if (r1 < 0) goto L_0x0059;
        L_0x003d:
            r1 = r1 + r4;
            if (r1 < 0) goto L_0x0059;
        L_0x0040:
            r4 = r0.j;
            r4 = r4.a();
            if (r1 >= r4) goto L_0x0059;
        L_0x0048:
            r4 = r0.getTarget();
            r4 = (defpackage.yps) r4;
            if (r4 == 0) goto L_0x0059;
        L_0x0050:
            r4 = r4.a();
            if (r4 == 0) goto L_0x0059;
        L_0x0056:
            r4.smoothScrollToPosition(r1);
        L_0x0059:
            r4 = defpackage.ajxw.a;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.stories.ui.StoryManagementPresenter$x.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class z extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ long a;

        z(long j) {
            this.a = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    static final class a extends akcq implements akbk<zhn> {
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
            return (zhn) ((ajwy) this.receiver).get();
        }
    }

    static final class aa extends akcq implements akbl<StoryRecord, ajxw> {
        aa(StoryManagementPresenter storyManagementPresenter) {
            super(1, storyManagementPresenter);
        }

        public final String getName() {
            return "onStoryRecord";
        }

        public final akej getOwner() {
            return akde.a(StoryManagementPresenter.class);
        }

        public final String getSignature() {
            return "onStoryRecord(Lcom/snap/core/db/record/StoryRecord;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            StoryRecord storyRecord = (StoryRecord) obj;
            akcr.b(storyRecord, "p1");
            zln zln = (StoryManagementPresenter) this.receiver;
            yps yps = (yps) zln.getTarget();
            if (yps != null) {
                ViewGroup w = yps.w();
                if (w != null) {
                    View view = w;
                    zfw zfw = zln.b;
                    ajwl ajwl = zln.h;
                    Object b = zln.b();
                    akcr.a(b, "userAuthStore");
                    Object c = zln.c();
                    akcr.a(c, "dateTimeUtils");
                    zke zke = zln.a;
                    String str = "eventDispatcher";
                    if (zke == null) {
                        akcr.a(str);
                    }
                    zln zln2 = zln;
                    zln.bindTo$default(zln, new yrc(zfw, ajwl, view, b, c, storyRecord, zke), zln2, null, null, 6, null);
                    zln.bindTo$default(zln, new yrf(view, zln.i, zln.g, zln.b), zln2, null, null, 6, null);
                    ajdp ajdp = zln.g;
                    zfw zfw2 = zln.b;
                    zke zke2 = zln.a;
                    if (zke2 == null) {
                        akcr.a(str);
                    }
                    zln.bindTo$default(zln, new yrg(ajdp, zfw2, view, zke2), zln2, null, null, 6, null);
                    c = storyRecord.storyId();
                    akcr.a(c, "storyRecord.storyId()");
                    ajdp = zln.g;
                    zfw2 = zln.b;
                    zke zke3 = zln.a;
                    if (zke3 == null) {
                        akcr.a(str);
                    }
                    zln.bindTo$default(zln, new yrb(ajdp, zfw2, view, c, zke3), zln2, null, null, 6, null);
                }
            }
            return ajxw.a;
        }
    }

    static final class ac extends akcq implements akbk<usd> {
        ac(ajwy ajwy) {
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
            return (usd) ((ajwy) this.receiver).get();
        }
    }

    static final class ad extends akcq implements akbk<gpb> {
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
            return (gpb) ((ajwy) this.receiver).get();
        }
    }

    static final class b extends akcq implements akbk<ajws<ppz>> {
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
            return (ajws) ((ajwy) this.receiver).get();
        }
    }

    static final class c extends akcq implements akbk<ihh> {
        c(ajwy ajwy) {
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
            return (ihh) ((ajwy) this.receiver).get();
        }
    }

    static final class h extends akcq implements akbk<ihi> {
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
            return (ihi) ((ajwy) this.receiver).get();
        }
    }

    static final class i extends akcq implements akbk<ypc> {
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
            return (ypc) ((ajwy) this.receiver).get();
        }
    }

    static final class l extends akcq implements akbk<ypd> {
        l(ajwy ajwy) {
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
            return (ypd) ((ajwy) this.receiver).get();
        }
    }

    static final class m extends akcq implements akbl<Long, ajxw> {
        m(StoryManagementPresenter storyManagementPresenter) {
            super(1, storyManagementPresenter);
        }

        public final String getName() {
            return "removeDeletedSnapFromOpera";
        }

        public final akej getOwner() {
            return akde.a(StoryManagementPresenter.class);
        }

        public final String getSignature() {
            return "removeDeletedSnapFromOpera(J)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            yps yps = (yps) ((StoryManagementPresenter) this.receiver).getTarget();
            if (yps != null) {
                WeakReference B = yps.B();
                if (B != null) {
                    stl stl = (stl) B.get();
                    if (stl != null) {
                        ssj e = stl.e();
                        if (e != null) {
                            e.a(ajyl.a(Long.valueOf(longValue)));
                        }
                    }
                }
            }
            return ajxw.a;
        }
    }

    static final class o extends akcq implements akbk<abss> {
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
            return (abss) ((ajwy) this.receiver).get();
        }
    }

    static final class q extends akcq implements akbk<yqg> {
        q(ajwy ajwy) {
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
            return (yqg) ((ajwy) this.receiver).get();
        }
    }

    static final class r extends akcq implements akbk<yhx> {
        r(ajwy ajwy) {
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
            return (yhx) ((ajwy) this.receiver).get();
        }
    }

    static final class s extends akcq implements akbk<yhj> {
        s(ajwy ajwy) {
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
            return (yhj) ((ajwy) this.receiver).get();
        }
    }

    static final class t extends akcq implements akbk<ypu> {
        t(ajwy ajwy) {
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
            return (ypu) ((ajwy) this.receiver).get();
        }
    }

    static final class u extends akcq implements akbk<ypv> {
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
            return (ypv) ((ajwy) this.receiver).get();
        }
    }

    static final class v extends akcq implements akbk<ypx> {
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
            return (ypx) ((ajwy) this.receiver).get();
        }
    }

    static final class w extends akcq implements akbk<ypy> {
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
            return (ypy) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(StoryManagementPresenter.class), "storiesDataProvider", "getStoriesDataProvider()Lcom/snap/stories/api/StoriesDataProvider;"), new akdc(akde.a(StoryManagementPresenter.class), "userAuthStore", "getUserAuthStore()Lcom/snap/core/store/UserAuthStore;"), new akdc(akde.a(StoryManagementPresenter.class), "dateTimeUtils", "getDateTimeUtils()Lcom/snap/framework/time/DateTimeUtils;"), new akdc(akde.a(StoryManagementPresenter.class), "storySaver", "getStorySaver()Lcom/snap/stories/ui/StorySaver;"), new akdc(akde.a(StoryManagementPresenter.class), "storySender", "getStorySender()Lcom/snap/stories/ui/StorySender;"), new akdc(akde.a(StoryManagementPresenter.class), "storySnapOperaLauncher", "getStorySnapOperaLauncher()Lcom/snap/stories/ui/StorySnapOperaLauncher;"), new akdc(akde.a(StoryManagementPresenter.class), "addToStoryEventSubject", "getAddToStoryEventSubject()Lio/reactivex/subjects/Subject;"), new akdc(akde.a(StoryManagementPresenter.class), "storySnapDeleter", "getStorySnapDeleter()Lcom/snap/stories/ui/StorySnapDeleter;"), new akdc(akde.a(StoryManagementPresenter.class), "storyManagementAnalytics", "getStoryManagementAnalytics()Lcom/snap/stories/analytics/StoryManagementAnalytics;"), new akdc(akde.a(StoryManagementPresenter.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(StoryManagementPresenter.class), "unifiedProfileLauncher", "getUnifiedProfileLauncher()Lcom/snap/profile/api/ui/UnifiedProfileLauncher;"), new akdc(akde.a(StoryManagementPresenter.class), "actionMenuLauncher", "getActionMenuLauncher()Lcom/snap/ui/actionmenu/ActionMenuLauncher;"), new akdc(akde.a(StoryManagementPresenter.class), "mobStoryActionMenuLauncher", "getMobStoryActionMenuLauncher()Lcom/snap/stories/ui/MobStoryActionMenuLauncher;"), new akdc(akde.a(StoryManagementPresenter.class), "friendStoryOperaLauncher", "getFriendStoryOperaLauncher()Lcom/snap/stories/ui/FriendStoryOperaLauncher;"), new akdc(akde.a(StoryManagementPresenter.class), "mainPageType", "getMainPageType()Lcom/snap/ui/deck/MainPageType;"), new akdc(akde.a(StoryManagementPresenter.class), "storiesActionMenuDataProvider", "getStoriesActionMenuDataProvider()Lcom/snap/stories/ui/actionmenu/StoriesActionMenuDataProvider;"), new akdc(akde.a(StoryManagementPresenter.class), "releaseManager", "getReleaseManager()Lcom/snapchat/android/framework/release/ReleaseManager;")};
    }

    public StoryManagementPresenter(zgb zgb, ajwy<zhn> ajwy, ajwy<yhx> ajwy2, ajwy<gpb> ajwy3, ajwy<ihi> ajwy4, ajwy<ypv> ajwy5, ajwy<ypy> ajwy6, ajwy<ajws<ppz>> ajwy7, ajwy<ypx> ajwy8, ajwy<yhj> ajwy9, ajwy<ihh> ajwy10, ajwy<usd> ajwy11, ajwy<ypd> ajwy12, ajwy<yqg> ajwy13, ajwy<ypu> ajwy14, ajwy<ypc> ajwy15, ajwy<abss> ajwy16) {
        ajwy<zhn> ajwy17 = ajwy;
        ajwy<yhx> ajwy18 = ajwy2;
        ajwy<gpb> ajwy19 = ajwy3;
        ajwy<ihi> ajwy20 = ajwy4;
        ajwy<ypv> ajwy21 = ajwy5;
        ajwy<ypy> ajwy22 = ajwy6;
        ajwy<ajws<ppz>> ajwy23 = ajwy7;
        ajwy<ypx> ajwy24 = ajwy8;
        ajwy<yhj> ajwy25 = ajwy9;
        ajwy<ihh> ajwy26 = ajwy10;
        ajwy<usd> ajwy27 = ajwy11;
        ajwy<ypd> ajwy28 = ajwy12;
        ajwy<yqg> ajwy29 = ajwy13;
        ajwy<ypu> ajwy30 = ajwy14;
        ajwy<ypc> ajwy31 = ajwy15;
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy17, "actionMenuLauncherProvider");
        akcr.b(ajwy18, "_storiesDataProvider");
        akcr.b(ajwy19, "userAuthStoreProvider");
        akcr.b(ajwy20, "dateTimeUtilsProvider");
        akcr.b(ajwy21, "storySenderProvider");
        akcr.b(ajwy22, "storySnapOperaLauncherProvider");
        akcr.b(ajwy23, "addToStoryEventSubjectProvider");
        akcr.b(ajwy24, "storySnapDeleterProvider");
        akcr.b(ajwy25, "storyManagementAnalyticsProvider");
        akcr.b(ajwy26, "clockProvider");
        akcr.b(ajwy27, "unifiedProfileLauncherProvider");
        akcr.b(ajwy28, "mobStoryActionMenuLauncherProvider");
        akcr.b(ajwy29, "storiesActionMenuDataProvider");
        akcr.b(ajwy30, "storySaverProvider");
        ajwy31 = ajwy15;
        akcr.b(ajwy31, "friendStoryOperaLauncherProvider");
        ajwy<abss> ajwy32 = ajwy16;
        akcr.b(ajwy32, "releaseManagerProvider");
        this.o = ajxh.a(new r(ajwy18));
        this.p = ajxh.a(new ad(ajwy19));
        this.q = ajxh.a(new h(ajwy20));
        this.r = ajxh.a(new t(ajwy30));
        this.s = ajxh.a(new u(ajwy21));
        this.t = ajxh.a(new w(ajwy22));
        this.u = ajxh.a(new b(ajwy23));
        this.v = ajxh.a(new v(ajwy24));
        this.w = ajxh.a(new s(ajwy25));
        this.x = ajxh.a(new c(ajwy26));
        this.y = ajxh.a(new ac(ajwy27));
        Object ajwl = new ajwl();
        ajwl.a(Boolean.FALSE);
        akcr.a(ajwl, "BehaviorSubject.create<B…).apply { onNext(false) }");
        this.f = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<S…mentSelectionViewModel>()");
        this.g = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<Long>()");
        this.h = ajwl;
        ajwl = new ajwl();
        ajwl.a((Object) "");
        akcr.a(ajwl, "BehaviorSubject.create<S…g>().apply { onNext(\"\") }");
        this.i = ajwl;
        this.j = znk.a;
        this.A = ajxh.a(new a(ajwy17));
        this.B = ajxh.a(new l(ajwy28));
        this.C = ajxh.a(new i(ajwy31));
        this.D = ajxh.a(k.a);
        this.E = ajxh.a(new q(ajwy13));
        this.m = ajxh.a(new o(ajwy32));
        this.n = new LinkedHashSet();
    }

    private final ypv f() {
        return (ypv) this.s.b();
    }

    private final ypx g() {
        return (ypx) this.v.b();
    }

    private final yhj h() {
        return (yhj) this.w.b();
    }

    /* Access modifiers changed, original: final */
    public final yhx a() {
        return (yhx) this.o.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        this.g.a(new ytk((StoryManagementStorySnapRecord) this.j.a(i)));
        this.b.l().a((Runnable) new p(this, i));
        this.h.a(Long.valueOf(((StoryManagementStorySnapRecord) ajyu.f((Iterable) this.j)).timestamp()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x02c3  */
    /* renamed from: a */
    public final void takeTarget(defpackage.yps r18) {
        /*
        r17 = this;
        r8 = r17;
        r0 = "target";
        r9 = r18;
        defpackage.akcr.b(r9, r0);
        super.takeTarget(r18);	 Catch:{ all -> 0x0330 }
        r0 = r18.x();	 Catch:{ all -> 0x0330 }
        r8.z = r0;	 Catch:{ all -> 0x0330 }
        r0 = r18.y();	 Catch:{ all -> 0x0330 }
        r8.c = r0;	 Catch:{ all -> 0x0330 }
        r0 = r18.getLifecycle();	 Catch:{ all -> 0x0330 }
        r1 = r8;
        r1 = (defpackage.k) r1;	 Catch:{ all -> 0x0330 }
        r0.a(r1);	 Catch:{ all -> 0x0330 }
        r0 = new zkf;	 Catch:{ all -> 0x0330 }
        r0.<init>();	 Catch:{ all -> 0x0330 }
        r2 = r0;
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        r0 = defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        r0 = (defpackage.zkf) r0;	 Catch:{ all -> 0x0330 }
        r2 = r0.a(r8);	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        r0 = r0.a();	 Catch:{ all -> 0x0330 }
        r1 = "bus.eventDispatcher";
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0330 }
        r8.a = r0;	 Catch:{ all -> 0x0330 }
        r0 = new ypq;	 Catch:{ all -> 0x0330 }
        r1 = r8.b;	 Catch:{ all -> 0x0330 }
        r2 = r17.b();	 Catch:{ all -> 0x0330 }
        r3 = "userAuthStore";
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0330 }
        r0.<init>(r1, r2);	 Catch:{ all -> 0x0330 }
        r2 = r0;
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        r0 = defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        r0 = (defpackage.ypq) r0;	 Catch:{ all -> 0x0330 }
        r10 = new zms;	 Catch:{ all -> 0x0330 }
        r0 = (defpackage.zlx) r0;	 Catch:{ all -> 0x0330 }
        r1 = defpackage.ypt.class;
        r10.<init>(r0, r1);	 Catch:{ all -> 0x0330 }
        r0 = r18.a();	 Catch:{ all -> 0x0330 }
        r1 = r18.d();	 Catch:{ all -> 0x0330 }
        r2 = new com.snap.stories.ui.SnapLayoutManager;	 Catch:{ all -> 0x0330 }
        r3 = "context";
        defpackage.akcr.a(r1, r3);	 Catch:{ all -> 0x0330 }
        r3 = r1;
        r3 = (android.content.Context) r3;	 Catch:{ all -> 0x0330 }
        r4 = r1.getResources();	 Catch:{ all -> 0x0330 }
        r5 = "context.resources";
        defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x0330 }
        r4 = r4.getDisplayMetrics();	 Catch:{ all -> 0x0330 }
        r4 = r4.widthPixels;	 Catch:{ all -> 0x0330 }
        r1 = r1.getResources();	 Catch:{ all -> 0x0330 }
        r5 = 2131168067; // 0x7f070b43 float:1.7950425E38 double:1.0529369274E-314;
        r1 = r1.getDimensionPixelSize(r5);	 Catch:{ all -> 0x0330 }
        r2.<init>(r3, r4, r1);	 Catch:{ all -> 0x0330 }
        r2 = (android.support.v7.widget.RecyclerView.LayoutManager) r2;	 Catch:{ all -> 0x0330 }
        r0.setLayoutManager(r2);	 Catch:{ all -> 0x0330 }
        r1 = r17.getTarget();	 Catch:{ all -> 0x0330 }
        r1 = (defpackage.yps) r1;	 Catch:{ all -> 0x0330 }
        if (r1 != 0) goto L_0x00be;
    L_0x00bb:
        defpackage.akcr.a();	 Catch:{ all -> 0x0330 }
    L_0x00be:
        r2 = r8.a;	 Catch:{ all -> 0x0330 }
        r11 = "eventDispatcher";
        if (r2 != 0) goto L_0x00c7;
    L_0x00c4:
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0330 }
    L_0x00c7:
        r3 = r8.b;	 Catch:{ all -> 0x0330 }
        r4 = r17.getTarget();	 Catch:{ all -> 0x0330 }
        r4 = (defpackage.yps) r4;	 Catch:{ all -> 0x0330 }
        r12 = 0;
        if (r4 == 0) goto L_0x00d7;
    L_0x00d2:
        r4 = r4.x();	 Catch:{ all -> 0x0330 }
        goto L_0x00d8;
    L_0x00d7:
        r4 = r12;
    L_0x00d8:
        if (r4 == 0) goto L_0x0322;
    L_0x00da:
        r4 = (java.lang.Number) r4;	 Catch:{ all -> 0x0330 }
        r4 = r4.longValue();	 Catch:{ all -> 0x0330 }
        r6 = r17.a();	 Catch:{ all -> 0x0330 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0330 }
        r4 = defpackage.ajyl.a(r4);	 Catch:{ all -> 0x0330 }
        r13 = 1;
        r4 = r6.a(r4, r13);	 Catch:{ all -> 0x0330 }
        r5 = r8.b;	 Catch:{ all -> 0x0330 }
        r5 = r5.i();	 Catch:{ all -> 0x0330 }
        r5 = (defpackage.ajdw) r5;	 Catch:{ all -> 0x0330 }
        r4 = r4.b(r5);	 Catch:{ all -> 0x0330 }
        r5 = com.snap.stories.ui.StoryManagementPresenter.e.a;	 Catch:{ all -> 0x0330 }
        r5 = (defpackage.ajfc) r5;	 Catch:{ all -> 0x0330 }
        r4 = r4.p(r5);	 Catch:{ all -> 0x0330 }
        r5 = new com.snap.stories.ui.StoryManagementPresenter$f;	 Catch:{ all -> 0x0330 }
        r5.<init>(r8);	 Catch:{ all -> 0x0330 }
        r5 = (defpackage.ajfb) r5;	 Catch:{ all -> 0x0330 }
        r4 = r4.d(r5);	 Catch:{ all -> 0x0330 }
        r5 = new ysd;	 Catch:{ all -> 0x0330 }
        r6 = "storySnaps";
        defpackage.akcr.a(r4, r6);	 Catch:{ all -> 0x0330 }
        r6 = r8.g;	 Catch:{ all -> 0x0330 }
        r7 = r17.c();	 Catch:{ all -> 0x0330 }
        r14 = "dateTimeUtils";
        defpackage.akcr.a(r7, r14);	 Catch:{ all -> 0x0330 }
        r5.<init>(r4, r6, r7);	 Catch:{ all -> 0x0330 }
        r14 = 2;
        r4 = new defpackage.zma[r14];	 Catch:{ all -> 0x0330 }
        r6 = new yse;	 Catch:{ all -> 0x0330 }
        r7 = r8.f;	 Catch:{ all -> 0x0330 }
        r7 = (defpackage.ajdp) r7;	 Catch:{ all -> 0x0330 }
        r6.<init>(r7);	 Catch:{ all -> 0x0330 }
        r6 = (defpackage.zma) r6;	 Catch:{ all -> 0x0330 }
        r15 = 0;
        r4[r15] = r6;	 Catch:{ all -> 0x0330 }
        r5 = (defpackage.zma) r5;	 Catch:{ all -> 0x0330 }
        r4[r13] = r5;	 Catch:{ all -> 0x0330 }
        r4 = defpackage.ajym.b(r4);	 Catch:{ all -> 0x0330 }
        r16 = r1.a(r10, r2, r3, r4);	 Catch:{ all -> 0x0330 }
        r2 = r16.e();	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        r1 = r8.f;	 Catch:{ all -> 0x0330 }
        r2 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x0330 }
        r1.a(r2);	 Catch:{ all -> 0x0330 }
        r1 = r16;
        r1 = (android.support.v7.widget.RecyclerView.Adapter) r1;	 Catch:{ all -> 0x0330 }
        r0.setAdapter(r1);	 Catch:{ all -> 0x0330 }
        r1 = r0.getOnFlingListener();	 Catch:{ all -> 0x0330 }
        if (r1 != 0) goto L_0x0183;
    L_0x0166:
        r1 = new android.support.v7.widget.LinearSnapHelper;	 Catch:{ all -> 0x0330 }
        r1.<init>();	 Catch:{ all -> 0x0330 }
        r1.attachToRecyclerView(r0);	 Catch:{ all -> 0x0330 }
        r8.l = r1;	 Catch:{ all -> 0x0330 }
        r1 = r8.l;	 Catch:{ all -> 0x0330 }
        if (r1 != 0) goto L_0x0179;
    L_0x0174:
        r2 = "snapHelper";
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x0330 }
    L_0x0179:
        r2 = new com.snap.stories.ui.StoryManagementPresenter$d;	 Catch:{ all -> 0x0330 }
        r2.<init>(r8, r1);	 Catch:{ all -> 0x0330 }
        r2 = (android.support.v7.widget.RecyclerView.OnScrollListener) r2;	 Catch:{ all -> 0x0330 }
        r0.addOnScrollListener(r2);	 Catch:{ all -> 0x0330 }
    L_0x0183:
        r0.setItemAnimator(r12);	 Catch:{ all -> 0x0330 }
        r0 = r18.q();	 Catch:{ all -> 0x0330 }
        r1 = new android.support.v7.widget.LinearLayoutManager;	 Catch:{ all -> 0x0330 }
        r2 = r18.d();	 Catch:{ all -> 0x0330 }
        r2 = (android.content.Context) r2;	 Catch:{ all -> 0x0330 }
        r1.<init>(r2, r13, r15);	 Catch:{ all -> 0x0330 }
        r1 = (android.support.v7.widget.RecyclerView.LayoutManager) r1;	 Catch:{ all -> 0x0330 }
        r0.setLayoutManager(r1);	 Catch:{ all -> 0x0330 }
        r1 = r17.getTarget();	 Catch:{ all -> 0x0330 }
        r1 = (defpackage.yps) r1;	 Catch:{ all -> 0x0330 }
        if (r1 != 0) goto L_0x01a5;
    L_0x01a2:
        defpackage.akcr.a();	 Catch:{ all -> 0x0330 }
    L_0x01a5:
        r2 = r8.a;	 Catch:{ all -> 0x0330 }
        if (r2 != 0) goto L_0x01ac;
    L_0x01a9:
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0330 }
    L_0x01ac:
        r3 = r8.b;	 Catch:{ all -> 0x0330 }
        r4 = r8.g;	 Catch:{ all -> 0x0330 }
        r4 = (defpackage.ajdp) r4;	 Catch:{ all -> 0x0330 }
        r5 = r8.i;	 Catch:{ all -> 0x0330 }
        r5 = (defpackage.ajdp) r5;	 Catch:{ all -> 0x0330 }
        r4 = defpackage.ajwa.a(r4, r5);	 Catch:{ all -> 0x0330 }
        r5 = r8.b;	 Catch:{ all -> 0x0330 }
        r5 = r5.i();	 Catch:{ all -> 0x0330 }
        r5 = (defpackage.ajdw) r5;	 Catch:{ all -> 0x0330 }
        r4 = r4.b(r5);	 Catch:{ all -> 0x0330 }
        r5 = new com.snap.stories.ui.StoryManagementPresenter$g;	 Catch:{ all -> 0x0330 }
        r5.<init>(r8);	 Catch:{ all -> 0x0330 }
        r5 = (defpackage.ajfc) r5;	 Catch:{ all -> 0x0330 }
        r4 = r4.u(r5);	 Catch:{ all -> 0x0330 }
        r5 = new ysf;	 Catch:{ all -> 0x0330 }
        r6 = "storyNotes";
        defpackage.akcr.a(r4, r6);	 Catch:{ all -> 0x0330 }
        r5.<init>(r4);	 Catch:{ all -> 0x0330 }
        r4 = defpackage.ajyl.a(r5);	 Catch:{ all -> 0x0330 }
        r10 = r1.b(r10, r2, r3, r4);	 Catch:{ all -> 0x0330 }
        r2 = r10.e();	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        r10 = (android.support.v7.widget.RecyclerView.Adapter) r10;	 Catch:{ all -> 0x0330 }
        r0.setAdapter(r10);	 Catch:{ all -> 0x0330 }
        r0.setItemAnimator(r12);	 Catch:{ all -> 0x0330 }
        r0 = r17.getTarget();	 Catch:{ all -> 0x0330 }
        r0 = (defpackage.yps) r0;	 Catch:{ all -> 0x0330 }
        if (r0 == 0) goto L_0x0208;
    L_0x0203:
        r0 = r0.x();	 Catch:{ all -> 0x0330 }
        goto L_0x0209;
    L_0x0208:
        r0 = r12;
    L_0x0209:
        if (r0 == 0) goto L_0x0314;
    L_0x020b:
        r0 = (java.lang.Number) r0;	 Catch:{ all -> 0x0330 }
        r0 = r0.longValue();	 Catch:{ all -> 0x0330 }
        r2 = r17.a();	 Catch:{ all -> 0x0330 }
        r2 = r2.a(r0);	 Catch:{ all -> 0x0330 }
        r3 = r8.b;	 Catch:{ all -> 0x0330 }
        r3 = r3.l();	 Catch:{ all -> 0x0330 }
        r3 = (defpackage.zfr) r3;	 Catch:{ all -> 0x0330 }
        r3 = (defpackage.ajdw) r3;	 Catch:{ all -> 0x0330 }
        r2 = r2.a(r3);	 Catch:{ all -> 0x0330 }
        r3 = new com.snap.stories.ui.StoryManagementPresenter$y;	 Catch:{ all -> 0x0330 }
        r3.<init>(r0);	 Catch:{ all -> 0x0330 }
        r3 = (defpackage.ajfb) r3;	 Catch:{ all -> 0x0330 }
        r2 = r2.c(r3);	 Catch:{ all -> 0x0330 }
        r3 = "storiesDataProvider.stor…RowId\")\n                }";
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0330 }
        r3 = new com.snap.stories.ui.StoryManagementPresenter$z;	 Catch:{ all -> 0x0330 }
        r3.<init>(r0);	 Catch:{ all -> 0x0330 }
        r3 = (defpackage.akbl) r3;	 Catch:{ all -> 0x0330 }
        r0 = new com.snap.stories.ui.StoryManagementPresenter$aa;	 Catch:{ all -> 0x0330 }
        r1 = r8;
        r1 = (com.snap.stories.ui.StoryManagementPresenter) r1;	 Catch:{ all -> 0x0330 }
        r0.<init>(r1);	 Catch:{ all -> 0x0330 }
        r0 = (defpackage.akbl) r0;	 Catch:{ all -> 0x0330 }
        r2 = defpackage.yit.a(r2, r3, r12, r0, r14);	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        r0 = r18.z();	 Catch:{ all -> 0x0330 }
        r1 = new com.snap.stories.ui.StoryManagementPresenter$x;	 Catch:{ all -> 0x0330 }
        r1.<init>(r8);	 Catch:{ all -> 0x0330 }
        r1 = (defpackage.akbl) r1;	 Catch:{ all -> 0x0330 }
        r2 = 3;
        r2 = defpackage.yit.a(r0, r12, r12, r1, r2);	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        r0 = r17.getTarget();	 Catch:{ all -> 0x0330 }
        r0 = (defpackage.yps) r0;	 Catch:{ all -> 0x0330 }
        if (r0 == 0) goto L_0x028c;
    L_0x027c:
        r0 = r0.w();	 Catch:{ all -> 0x0330 }
        if (r0 == 0) goto L_0x028c;
    L_0x0282:
        r1 = 2131428689; // 0x7f0b0551 float:1.847903E38 double:1.053065692E-314;
        r0 = r0.findViewById(r1);	 Catch:{ all -> 0x0330 }
        r0 = (com.snap.imageloading.view.SnapImageView) r0;	 Catch:{ all -> 0x0330 }
        goto L_0x028d;
    L_0x028c:
        r0 = r12;
    L_0x028d:
        r8.k = r0;	 Catch:{ all -> 0x0330 }
        r0 = new jxj$b$a;	 Catch:{ all -> 0x0330 }
        r0.<init>();	 Catch:{ all -> 0x0330 }
        r1 = new defpackage.jwg[r13];	 Catch:{ all -> 0x0330 }
        r2 = new jxs;	 Catch:{ all -> 0x0330 }
        r3 = r17.getTarget();	 Catch:{ all -> 0x0330 }
        r3 = (defpackage.yps) r3;	 Catch:{ all -> 0x0330 }
        if (r3 == 0) goto L_0x02a4;
    L_0x02a0:
        r12 = r3.d();	 Catch:{ all -> 0x0330 }
    L_0x02a4:
        r12 = (android.content.Context) r12;	 Catch:{ all -> 0x0330 }
        r3 = 5;
        r2.<init>(r12, r3, r15);	 Catch:{ all -> 0x0330 }
        r2 = (defpackage.jwg) r2;	 Catch:{ all -> 0x0330 }
        r1[r15] = r2;	 Catch:{ all -> 0x0330 }
        r0 = r0.c(r1);	 Catch:{ all -> 0x0330 }
        r0 = r0.f(r13);	 Catch:{ all -> 0x0330 }
        r0 = r0.b();	 Catch:{ all -> 0x0330 }
        r1 = "ViewBitmapLoader.Request…\n                .build()";
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0330 }
        r1 = r8.k;	 Catch:{ all -> 0x0330 }
        if (r1 == 0) goto L_0x02c6;
    L_0x02c3:
        r1.setRequestOptions(r0);	 Catch:{ all -> 0x0330 }
    L_0x02c6:
        r0 = r8.g;	 Catch:{ all -> 0x0330 }
        r1 = r8.b;	 Catch:{ all -> 0x0330 }
        r1 = r1.l();	 Catch:{ all -> 0x0330 }
        r1 = (defpackage.zfr) r1;	 Catch:{ all -> 0x0330 }
        r1 = (defpackage.ajdw) r1;	 Catch:{ all -> 0x0330 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0330 }
        r1 = new com.snap.stories.ui.StoryManagementPresenter$ab;	 Catch:{ all -> 0x0330 }
        r1.<init>(r8);	 Catch:{ all -> 0x0330 }
        r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x0330 }
        r2 = r0.f(r1);	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        r0 = r17.f();	 Catch:{ all -> 0x0330 }
        r2 = r0;
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        r0 = r17.g();	 Catch:{ all -> 0x0330 }
        r2 = r0;
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0330 }
        r3 = r8;
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0330 }
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r17;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0330 }
        return;
    L_0x0314:
        r0 = "subscribeToStoryRecord called with null storyRowId";
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0330 }
        r0 = r0.toString();	 Catch:{ all -> 0x0330 }
        r1.<init>(r0);	 Catch:{ all -> 0x0330 }
        r1 = (java.lang.Throwable) r1;	 Catch:{ all -> 0x0330 }
        throw r1;	 Catch:{ all -> 0x0330 }
    L_0x0322:
        r0 = "createStorySnapsSections called with null storyRowId";
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0330 }
        r0 = r0.toString();	 Catch:{ all -> 0x0330 }
        r1.<init>(r0);	 Catch:{ all -> 0x0330 }
        r1 = (java.lang.Throwable) r1;	 Catch:{ all -> 0x0330 }
        throw r1;	 Catch:{ all -> 0x0330 }
    L_0x0330:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.stories.ui.StoryManagementPresenter.takeTarget(yps):void");
    }

    public final boolean a(Long l) {
        if (l == null) {
            return false;
        }
        int i = 0;
        for (Object next : this.j) {
            if (i < 0) {
                ajym.a();
            }
            Object next2 = (l != null && ((StoryManagementStorySnapRecord) next2).snapRowId() == l.longValue()) ? 1 : null;
            if (next2 != null) {
                break;
            }
            i++;
        }
        i = -1;
        if (i < 0) {
            return false;
        }
        a(i);
        return true;
    }

    /* Access modifiers changed, original: final */
    public final gpb b() {
        return (gpb) this.p.b();
    }

    /* Access modifiers changed, original: final */
    public final ihi c() {
        return (ihi) this.q.b();
    }

    public final ihh d() {
        return (ihh) this.x.b();
    }

    public final void dropTarget() {
        yps yps = (yps) getTarget();
        if (yps != null) {
            defpackage.j lifecycle = yps.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        this.z = null;
        this.c = null;
        this.e = false;
        super.dropTarget();
    }

    public final void e() {
        yhj h = h();
        abfx abfx = abfx.MY;
        long c = d().c();
        Long l = this.d;
        if (l == null) {
            akcr.a();
        }
        double longValue = (double) (c - l.longValue());
        Double.isNaN(longValue);
        h.a(abfx, Double.valueOf(longValue / 1000.0d));
        this.d = null;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickActionMenu(yrk yrk) {
        akcr.b(yrk, "event");
        if (yrk.a.c == StoryKind.GROUP) {
            zln.bindTo$default(this, yit.a(((ypd) this.B.b()).a(yrk.a.b), null, null, 3), this, null, null, 6, null);
            return;
        }
        zhn zhn = (zhn) this.A.b();
        zjm zjm = (zjm) this.D.b();
        Object obj = (yqg) this.E.b();
        obj.a(yrk.a);
        akcr.a(obj, "storiesActionMenuDataPro…Model = event.eventData }");
        zhn.a(zjm, (zhk) obj);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickAddToStory(yri yri) {
        akcr.b(yri, "event");
        ((ajws) this.u.b()).a((Object) new ppz(yri.a, yri.b, yri.c, gcn.STORY_MANAGEMENT, new gct(yri.d, 1)));
    }

    @akqq(a = ThreadMode.MAIN)
    public final ajej onClickDeleteSnap(yrj yrj) {
        akcr.b(yrj, "event");
        return zln.bindTo$default(this, yit.a(g().a((StorySnapRecordBase) yrj.a, yhy.a), (akbl) n.a, (akbl) new m(this)), this, null, null, 6, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickPlayStory(yrl yrl) {
        yrl yrl2 = yrl;
        akcr.b(yrl2, "event");
        ypc ypc = (ypc) this.C.b();
        long j = yrl2.a;
        View view = yrl2.b;
        sqx sqx = yrl2.c;
        aahb aahb = yrl2.d;
        akcr.b(view, "sourceView");
        akcr.b(sqx, "transitionAnimationShape");
        akcr.b(aahb, "viewSource");
        long b = ypc.a().b();
        long c = ypc.a().c();
        slg slg = new slg(ypc.h, new slh());
        slg.a(sqx);
        defpackage.sti.a aVar = new defpackage.sti.a(((ynp) ypc.e.b()).a(szw.cY), slg, ypc.a, (jwa) ypc.b.b(), (jwc) ypc.c.b(), yhy.j.getPage());
        aVar.c = new srk(view, sqx);
        aVar.d = String.valueOf(j);
        aVar.e = true;
        aVar.p = aahb;
        psa psa = new psa(aahb, aajy.STORY, aajz.USER_STORY, null);
        akcr.a(ypc.a(), "playbackPerformanceAnalytics");
        defpackage.ssi.a aVar2 = new defpackage.ssi.a(new sks(r12, aaug.TAP, b, c, psa), ((yhl) ypc.i.get()).a(((ihh) ypc.g.b()).a(), aahb.SEARCH_SF, (fvk) ypc.f.b()));
        akbl akbl = null;
        defpackage.yoj.c cVar = new defpackage.yoj.c(j, null, null, 14);
        cVar.a = true;
        zln.bindTo$default(this, yit.a(((sso) ypc.d.b()).a((smi) cVar, aVar.a(), (ssi) aVar2, new stl()), akbl, (akbk) akbl, 3), this, null, null, 6, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickRetryFailedSnap(yrm yrm) {
        akcr.b(yrm, "event");
        ytk ytk = (ytk) this.g.p();
        StoryManagementStorySnapRecord storyManagementStorySnapRecord = ytk != null ? ytk.f : null;
        if (storyManagementStorySnapRecord == null) {
            akcr.a();
        }
        if (storyManagementStorySnapRecord.clientStatus() == MessageClientStatus.FAILED) {
            ypv f = f();
            Object clientId = storyManagementStorySnapRecord.clientId();
            akcr.a(clientId, "storyRecord.clientId()");
            f.a(clientId);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickSaveSnap(yrn yrn) {
        akcr.b(yrn, "event");
        ((ypu) this.r.b()).a((StorySnapRecordBase) yrn.a, yhy.b);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickSendSnap(yro yro) {
        akcr.b(yro, "event");
        MessageClientStatus messageClientStatus = yro.a.d;
        if (messageClientStatus != null) {
            int i = ypr.a[messageClientStatus.ordinal()];
            if (i == 1 || i == 2) {
                return;
            }
        }
        f().a(yro.a.f, yhy.b, gcn.STORY_MANAGEMENT);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickSnap(yrp yrp) {
        akcr.b(yrp, "event");
        if (this.g.q()) {
            ytk ytk = (ytk) this.g.p();
            if (akcr.a(yrp.a.snapId(), ytk != null ? ytk.a : null)) {
                zln.bindTo$default(this, ((ypy) this.t.b()).a(yrp), this, null, null, 6, null);
                return;
            }
        }
        yps yps = (yps) getTarget();
        if (yps != null) {
            RecyclerView a = yps.a();
            if (a != null) {
                a.smoothScrollToPosition(a.getChildLayoutPosition(yrp.b));
            }
        }
        this.g.a(new ytk(yrp.a));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickStoryViewer(yrq yrq) {
        akcr.b(yrq, "event");
        String str = yrq.a;
        if (str != null) {
            ((usd) this.y.b()).a(new usq(usg.FRIEND_PROFILE, str, null, abbd.STORY, null, 20));
        }
    }
}
