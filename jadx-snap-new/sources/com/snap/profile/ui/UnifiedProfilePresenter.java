package com.snap.profile.ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.snap.composer.IComposerViewLoader;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.aajt;
import defpackage.aamk;
import defpackage.abhe;
import defpackage.abhi;
import defpackage.abhj;
import defpackage.abhk;
import defpackage.abtp;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.ihl;
import defpackage.iho;
import defpackage.s;
import defpackage.tnj;
import defpackage.upp;
import defpackage.upr;
import defpackage.ups;
import defpackage.upt;
import defpackage.uqb;
import defpackage.uqh;
import defpackage.uqk;
import defpackage.urv;
import defpackage.urx;
import defpackage.usf;
import defpackage.usg;
import defpackage.usi;
import defpackage.usj;
import defpackage.usk;
import defpackage.usn;
import defpackage.usq;
import defpackage.uxf;
import defpackage.uxg;
import defpackage.uzn;
import defpackage.uzq;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zic;
import defpackage.zig;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zkq;
import defpackage.zll;
import defpackage.zln;
import defpackage.zma;
import defpackage.zmh;
import defpackage.zmq;
import defpackage.zms;
import defpackage.zmu;
import defpackage.znh;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public class UnifiedProfilePresenter extends zll<upt> implements defpackage.k {
    private final ajxe A;
    private final ajxe B;
    private long C;
    private zic D;
    private final ajxe E;
    private final uxg F;
    private AtomicBoolean G;
    private ajcx H;
    private final Set<abhk> I;
    private final AtomicBoolean J;
    private final zkq K;
    private final Map<usg, usf> L;
    private final ajwy<zig> M;
    View a;
    public usq b;
    zms c;
    usf d;
    upr e;
    ups f;
    uzq g;
    final zfw h = zgb.a(upp.h.callsite("UnifiedProfilePresenter"));
    zkf i;
    Map<Class<? extends uqh>, Set<urv>> j;
    zmu k;
    public String l;
    public long m;
    public abhe n;
    public AtomicBoolean o;
    final e p;
    final Context q;
    final tnj r;
    final ajwy<IComposerViewLoader> s;
    private View t;
    private usk u;
    private usi v;
    private RecyclerView w;
    private zmh x;
    private final AtomicBoolean y = new AtomicBoolean();
    private final ajxe z;

    static final class d implements OnClickListener {
        private /* synthetic */ UnifiedProfilePresenter a;

        d(UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = unifiedProfilePresenter;
        }

        public final void onClick(View view) {
            UnifiedProfilePresenter.b(this.a).a().a(new uqk(defpackage.uqk.a.DISMISS));
        }
    }

    static final class h<V> implements Callable<Object> {
        private /* synthetic */ UnifiedProfilePresenter a;

        h(UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = unifiedProfilePresenter;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:45:0x01d3 in {3, 4, 13, 14, 17, 21, 23, 25, 36, 39, 40, 42, 44} preds:[]
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
        private defpackage.ajej a() {
            /*
            r11 = this;
            r0 = r11.a;	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r2 = new zkf;	 Catch:{ all -> 0x01d1 }
            r2.<init>();	 Catch:{ all -> 0x01d1 }
            r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x01d1 }
            r3 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x01d1 }
            r4 = 0;	 Catch:{ all -> 0x01d1 }
            r5 = 0;	 Catch:{ all -> 0x01d1 }
            r6 = 6;	 Catch:{ all -> 0x01d1 }
            r7 = 0;	 Catch:{ all -> 0x01d1 }
            r1 = defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x01d1 }
            r1 = (defpackage.zkf) r1;	 Catch:{ all -> 0x01d1 }
            r0.i = r1;	 Catch:{ all -> 0x01d1 }
            r0 = r11.a;	 Catch:{ all -> 0x01d1 }
            r0 = r0.d;	 Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x0026;	 Catch:{ all -> 0x01d1 }
            r0 = r0.e();	 Catch:{ all -> 0x01d1 }
            goto L_0x0027;	 Catch:{ all -> 0x01d1 }
            r0 = 0;	 Catch:{ all -> 0x01d1 }
            r9 = r11.a;	 Catch:{ all -> 0x01d1 }
            r10 = new usm;	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r2 = com.snap.profile.ui.UnifiedProfilePresenter.a(r1);	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = r1.e;	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r4 = r1.h;	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r1 = com.snap.profile.ui.UnifiedProfilePresenter.b(r1);	 Catch:{ all -> 0x01d1 }
            r5 = r1.a();	 Catch:{ all -> 0x01d1 }
            r1 = "bus.eventDispatcher";	 Catch:{ all -> 0x01d1 }
            defpackage.akcr.a(r5, r1);	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r7 = r1.r;	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r8 = r1.s;	 Catch:{ all -> 0x01d1 }
            r1 = r10;	 Catch:{ all -> 0x01d1 }
            r6 = r0;	 Catch:{ all -> 0x01d1 }
            r1.<init>(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01d1 }
            r2 = r10;	 Catch:{ all -> 0x01d1 }
            r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = r1;	 Catch:{ all -> 0x01d1 }
            r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x01d1 }
            r4 = 0;	 Catch:{ all -> 0x01d1 }
            r5 = 0;	 Catch:{ all -> 0x01d1 }
            r6 = 6;	 Catch:{ all -> 0x01d1 }
            r7 = 0;	 Catch:{ all -> 0x01d1 }
            r1 = r9;	 Catch:{ all -> 0x01d1 }
            r1 = defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x01d1 }
            r1 = (defpackage.usm) r1;	 Catch:{ all -> 0x01d1 }
            r2 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = new zms;	 Catch:{ all -> 0x01d1 }
            r1 = (defpackage.zlx) r1;	 Catch:{ all -> 0x01d1 }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x01d1 }
            r3.<init>(r1, r0);	 Catch:{ all -> 0x01d1 }
            r2.c = r3;	 Catch:{ all -> 0x01d1 }
            r0 = r11.a;	 Catch:{ all -> 0x01d1 }
            r0 = r0.d;	 Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x0118;	 Catch:{ all -> 0x01d1 }
            r0 = r0.h();	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r2 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = r2.k;	 Catch:{ all -> 0x01d1 }
            r4 = "viewFactory";
            if (r3 != 0) goto L_0x00c1;
            r3 = r2.c;	 Catch:{ all -> 0x01d1 }
            if (r3 != 0) goto L_0x0090;	 Catch:{ all -> 0x01d1 }
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x01d1 }
            r5 = r2.h;	 Catch:{ all -> 0x01d1 }
            r5 = r5.h();	 Catch:{ all -> 0x01d1 }
            r5 = (defpackage.ajdw) r5;	 Catch:{ all -> 0x01d1 }
            r6 = r2.q;	 Catch:{ all -> 0x01d1 }
            r6 = android.view.LayoutInflater.from(r6);	 Catch:{ all -> 0x01d1 }
            r7 = "LayoutInflater.from(context)";	 Catch:{ all -> 0x01d1 }
            defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x01d1 }
            r7 = new android.support.v7.widget.RecyclerView;	 Catch:{ all -> 0x01d1 }
            r8 = r2.q;	 Catch:{ all -> 0x01d1 }
            r7.<init>(r8);	 Catch:{ all -> 0x01d1 }
            r8 = new android.support.v7.widget.LinearLayoutManager;	 Catch:{ all -> 0x01d1 }
            r9 = r7.getContext();	 Catch:{ all -> 0x01d1 }
            r8.<init>(r9);	 Catch:{ all -> 0x01d1 }
            r8 = (android.support.v7.widget.RecyclerView.LayoutManager) r8;	 Catch:{ all -> 0x01d1 }
            r7.setLayoutManager(r8);	 Catch:{ all -> 0x01d1 }
            r7 = (android.view.ViewGroup) r7;	 Catch:{ all -> 0x01d1 }
            r8 = new zmu;	 Catch:{ all -> 0x01d1 }
            r8.<init>(r3, r5, r6, r7);	 Catch:{ all -> 0x01d1 }
            r2.k = r8;	 Catch:{ all -> 0x01d1 }
            r3 = r2.c;	 Catch:{ all -> 0x01d1 }
            if (r3 != 0) goto L_0x00c8;	 Catch:{ all -> 0x01d1 }
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x01d1 }
            r4 = r2.k;	 Catch:{ all -> 0x01d1 }
            r4 = (defpackage.zmw) r4;	 Catch:{ all -> 0x01d1 }
            r3.setViewHolderPrefetcher(r4);	 Catch:{ all -> 0x01d1 }
            r0 = r0.a();	 Catch:{ all -> 0x01d1 }
            r2 = r2.k;	 Catch:{ all -> 0x01d1 }
            if (r2 == 0) goto L_0x010a;	 Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x0102;	 Catch:{ all -> 0x01d1 }
            r2 = r2.a(r0);	 Catch:{ all -> 0x01d1 }
            r3 = new com.snap.profile.ui.UnifiedProfilePresenter$j;	 Catch:{ all -> 0x01d1 }
            r3.<init>(r0);	 Catch:{ all -> 0x01d1 }
            r3 = (defpackage.ajev) r3;	 Catch:{ all -> 0x01d1 }
            r0 = r2.b(r3);	 Catch:{ all -> 0x01d1 }
            r2 = "checkNotNull(viewPrefetc…s.size} views\")\n        }";	 Catch:{ all -> 0x01d1 }
            defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x01d1 }
            r0 = r0.d();	 Catch:{ all -> 0x01d1 }
            r2 = r0.e();	 Catch:{ all -> 0x01d1 }
            r0 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = r0;	 Catch:{ all -> 0x01d1 }
            r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x01d1 }
            r4 = 0;	 Catch:{ all -> 0x01d1 }
            r5 = 0;	 Catch:{ all -> 0x01d1 }
            r6 = 6;	 Catch:{ all -> 0x01d1 }
            r7 = 0;	 Catch:{ all -> 0x01d1 }
            defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x01d1 }
            goto L_0x0118;	 Catch:{ all -> 0x01d1 }
            r0 = new ajxt;	 Catch:{ all -> 0x01d1 }
            r1 = "null cannot be cast to non-null type kotlin.collections.Map<com.snap.ui.recycling.AdapterViewType, kotlin.Int>";	 Catch:{ all -> 0x01d1 }
            r0.<init>(r1);	 Catch:{ all -> 0x01d1 }
            throw r0;	 Catch:{ all -> 0x01d1 }
            r0 = "Required value was null.";	 Catch:{ all -> 0x01d1 }
            r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x01d1 }
            r0 = r0.toString();	 Catch:{ all -> 0x01d1 }
            r1.<init>(r0);	 Catch:{ all -> 0x01d1 }
            r1 = (java.lang.Throwable) r1;	 Catch:{ all -> 0x01d1 }
            throw r1;	 Catch:{ all -> 0x01d1 }
            r0 = r11.a;	 Catch:{ all -> 0x01d1 }
            r1 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x01d1 }
            r1.<init>();	 Catch:{ all -> 0x01d1 }
            r1 = (java.util.Map) r1;	 Catch:{ all -> 0x01d1 }
            r0.j = r1;	 Catch:{ all -> 0x01d1 }
            r0 = r11.a;	 Catch:{ all -> 0x01d1 }
            r0 = r0.d;	 Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x01ac;	 Catch:{ all -> 0x01d1 }
            r0 = r0.b();	 Catch:{ all -> 0x01d1 }
            r0 = r0.iterator();	 Catch:{ all -> 0x01d1 }
            r1 = r0.hasNext();	 Catch:{ all -> 0x01d1 }
            if (r1 == 0) goto L_0x01ac;	 Catch:{ all -> 0x01d1 }
            r1 = r0.next();	 Catch:{ all -> 0x01d1 }
            r1 = (defpackage.urv) r1;	 Catch:{ all -> 0x01d1 }
            r2 = r1.a();	 Catch:{ all -> 0x01d1 }
            r2 = r2.iterator();	 Catch:{ all -> 0x01d1 }
            r3 = r2.hasNext();	 Catch:{ all -> 0x01d1 }
            if (r3 == 0) goto L_0x017f;	 Catch:{ all -> 0x01d1 }
            r3 = r2.next();	 Catch:{ all -> 0x01d1 }
            r3 = (java.lang.Class) r3;	 Catch:{ all -> 0x01d1 }
            r4 = r11.a;	 Catch:{ all -> 0x01d1 }
            r4 = com.snap.profile.ui.UnifiedProfilePresenter.c(r4);	 Catch:{ all -> 0x01d1 }
            r4 = r4.get(r3);	 Catch:{ all -> 0x01d1 }
            if (r4 != 0) goto L_0x016d;	 Catch:{ all -> 0x01d1 }
            r4 = r11.a;	 Catch:{ all -> 0x01d1 }
            r4 = com.snap.profile.ui.UnifiedProfilePresenter.c(r4);	 Catch:{ all -> 0x01d1 }
            r5 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x01d1 }
            r5.<init>();	 Catch:{ all -> 0x01d1 }
            r5 = (java.util.Set) r5;	 Catch:{ all -> 0x01d1 }
            r4.put(r3, r5);	 Catch:{ all -> 0x01d1 }
            r4 = r11.a;	 Catch:{ all -> 0x01d1 }
            r4 = com.snap.profile.ui.UnifiedProfilePresenter.c(r4);	 Catch:{ all -> 0x01d1 }
            r3 = r4.get(r3);	 Catch:{ all -> 0x01d1 }
            r3 = (java.util.Set) r3;	 Catch:{ all -> 0x01d1 }
            if (r3 == 0) goto L_0x0145;	 Catch:{ all -> 0x01d1 }
            r3.add(r1);	 Catch:{ all -> 0x01d1 }
            goto L_0x0145;	 Catch:{ all -> 0x01d1 }
            r2 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = r1;	 Catch:{ all -> 0x01d1 }
            r3 = (defpackage.ajej) r3;	 Catch:{ all -> 0x01d1 }
            r4 = r11.a;	 Catch:{ all -> 0x01d1 }
            r4 = (defpackage.zln) r4;	 Catch:{ all -> 0x01d1 }
            r5 = 0;	 Catch:{ all -> 0x01d1 }
            r6 = 0;	 Catch:{ all -> 0x01d1 }
            r7 = 6;	 Catch:{ all -> 0x01d1 }
            r8 = 0;	 Catch:{ all -> 0x01d1 }
            defpackage.zln.bindTo$default(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01d1 }
            r2 = new urw;	 Catch:{ all -> 0x01d1 }
            r3 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = com.snap.profile.ui.UnifiedProfilePresenter.a(r3);	 Catch:{ all -> 0x01d1 }
            r4 = r11.a;	 Catch:{ all -> 0x01d1 }
            r4 = com.snap.profile.ui.UnifiedProfilePresenter.b(r4);	 Catch:{ all -> 0x01d1 }
            r4 = r4.a();	 Catch:{ all -> 0x01d1 }
            r5 = r11.a;	 Catch:{ all -> 0x01d1 }
            r5 = r5.e;	 Catch:{ all -> 0x01d1 }
            r2.<init>(r3, r4, r5);	 Catch:{ all -> 0x01d1 }
            r1.a(r2);	 Catch:{ all -> 0x01d1 }
            goto L_0x0131;	 Catch:{ all -> 0x01d1 }
            r1 = r11.a;	 Catch:{ all -> 0x01d1 }
            r0 = r11.a;	 Catch:{ all -> 0x01d1 }
            r0 = com.snap.profile.ui.UnifiedProfilePresenter.b(r0);	 Catch:{ all -> 0x01d1 }
            r2 = new uzo;	 Catch:{ all -> 0x01d1 }
            r3 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = com.snap.profile.ui.UnifiedProfilePresenter.c(r3);	 Catch:{ all -> 0x01d1 }
            r2.<init>(r3);	 Catch:{ all -> 0x01d1 }
            r2 = r0.a(r2);	 Catch:{ all -> 0x01d1 }
            r0 = r11.a;	 Catch:{ all -> 0x01d1 }
            r3 = r0;	 Catch:{ all -> 0x01d1 }
            r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x01d1 }
            r4 = 0;	 Catch:{ all -> 0x01d1 }
            r5 = 0;	 Catch:{ all -> 0x01d1 }
            r6 = 6;	 Catch:{ all -> 0x01d1 }
            r7 = 0;	 Catch:{ all -> 0x01d1 }
            r0 = defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x01d1 }
            return r0;
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.profile.ui.UnifiedProfilePresenter$h.a():ajej");
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    static final class c<T> implements ajfb<Rect> {
        private /* synthetic */ UnifiedProfilePresenter a;

        c(UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = unifiedProfilePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a.a;
            if (view == null) {
                akcr.a("pageView");
            }
            view.setPadding(0, rect.top, 0, rect.bottom);
        }
    }

    public static final class e implements urx {
        private /* synthetic */ UnifiedProfilePresenter a;

        e(UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = unifiedProfilePresenter;
        }

        public final void a(abhk abhk) {
            String str = "sectionType";
            akcr.b(abhk, str);
            uzn d = this.a.d();
            akcr.b(abhk, str);
            d.c.add(abhk);
            UnifiedProfilePresenter.a(this.a, abhk);
        }
    }

    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;
        private /* synthetic */ double b;
        private /* synthetic */ UnifiedProfilePresenter c;

        f(String str, double d, UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = str;
            this.b = d;
            this.c = unifiedProfilePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aamk aamk = (aamk) obj;
            akcr.b(aamk, "it");
            this.c.a().a(UnifiedProfilePresenter.a(this.c).a, this.a, this.b, aamk);
            return ajxw.a;
        }
    }

    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ UnifiedProfilePresenter a;

        g(UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = unifiedProfilePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aamk aamk = (aamk) obj;
            akcr.b(aamk, "it");
            uqb a = this.a.a();
            usg usg = UnifiedProfilePresenter.a(this.a).a;
            String str = this.a.l;
            if (str == null) {
                akcr.a();
            }
            a.a(usg, str, UnifiedProfilePresenter.a(this.a).d, aamk);
            return ajxw.a;
        }
    }

    static final class j implements ajev {
        private /* synthetic */ Map a;

        j(Map map) {
            this.a = map;
        }

        public final void run() {
        }
    }

    static final class l<T> implements ajfb<usj> {
        private /* synthetic */ UnifiedProfilePresenter a;

        l(UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = unifiedProfilePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (usj) obj;
            uzq uzq = this.a.g;
            if (uzq == null) {
                akcr.a("headerBarBinding");
            }
            akcr.a(obj, "it");
            uzq.a(obj);
        }
    }

    static final class n<T> implements ajfb<znh<usn>> {
        private /* synthetic */ UnifiedProfilePresenter a;

        n(UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = unifiedProfilePresenter;
        }

        /* JADX WARNING: Missing block: B:7:0x0019, code skipped:
            if (r0 == null) goto L_0x001b;
     */
        public final /* synthetic */ void accept(java.lang.Object r12) {
            /*
            r11 = this;
            r12 = (defpackage.znh) r12;
            r0 = r11.a;
            r0 = r0.d;
            if (r0 == 0) goto L_0x000d;
        L_0x0008:
            r0 = r0.g();
            goto L_0x000e;
        L_0x000d:
            r0 = 0;
        L_0x000e:
            r2 = r0;
            r0 = r11.a;
            r0 = r0.d;
            if (r0 == 0) goto L_0x001b;
        L_0x0015:
            r0 = r0.d();
            if (r0 != 0) goto L_0x001f;
        L_0x001b:
            r0 = defpackage.ajyy.a;
            r0 = (java.util.Set) r0;
        L_0x001f:
            r3 = r0;
            r0 = r11.a;
            r0 = r0.p;
            r4 = r0;
            r4 = (defpackage.urx) r4;
            r0 = r11.a;
            r0 = com.snap.profile.ui.UnifiedProfilePresenter.b(r0);
            r5 = r0.a();
            r0 = "bus.eventDispatcher";
            defpackage.akcr.a(r5, r0);
            r0 = r11.a;
            r6 = r0.f;
            r0 = new uso;
            r1 = r0;
            r1.<init>(r2, r3, r4, r5, r6);
            r1 = "sections";
            defpackage.akcr.a(r12, r1);
            r12 = (java.lang.Iterable) r12;
            r1 = r12.iterator();
        L_0x004b:
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x0090;
        L_0x0051:
            r2 = r1.next();
            r2 = (defpackage.usn) r2;
            r3 = r2.r_();
            if (r3 == 0) goto L_0x0077;
        L_0x005d:
            r4 = r11.a;
            r4 = r4.d();
            r5 = "sectionType";
            defpackage.akcr.b(r3, r5);
            r5 = r4.a;
            r4 = r4.d;
            r6 = r4.c();
            r4 = java.lang.Long.valueOf(r6);
            r5.put(r3, r4);
        L_0x0077:
            r3 = r11.a;
            r3 = com.snap.profile.ui.UnifiedProfilePresenter.a(r3);
            r2.a(r0, r3);
            r4 = r11.a;
            r5 = r2;
            r5 = (defpackage.ajej) r5;
            r6 = r4;
            r6 = (defpackage.zln) r6;
            r7 = 0;
            r8 = 0;
            r9 = 6;
            r10 = 0;
            defpackage.zln.bindTo$default(r4, r5, r6, r7, r8, r9, r10);
            goto L_0x004b;
        L_0x0090:
            r0 = r11.a;
            r0 = com.snap.profile.ui.UnifiedProfilePresenter.d(r0);
            r12 = defpackage.ajyu.k(r12);
            r0.a(r12);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.profile.ui.UnifiedProfilePresenter$n.accept(java.lang.Object):void");
        }
    }

    public static final class o extends ItemDecoration {
        private /* synthetic */ int a;

        o(int i) {
            this.a = i;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            if (recyclerView != null) {
                if (recyclerView.getChildAdapterPosition(view) != 0) {
                    if (rect != null) {
                        rect.bottom = 0;
                    }
                } else if (rect != null) {
                    rect.top = this.a;
                }
            }
        }
    }

    public static final class p extends OnScrollListener {
        private /* synthetic */ LinearLayoutManager a;
        private /* synthetic */ akbl b;

        p(LinearLayoutManager linearLayoutManager, akbl akbl) {
            this.a = linearLayoutManager;
            this.b = akbl;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int findFirstVisibleItemPosition = this.a.findFirstVisibleItemPosition();
            i = this.a.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition <= i) {
                while (true) {
                    this.b.invoke(Integer.valueOf(findFirstVisibleItemPosition));
                    if (findFirstVisibleItemPosition != i) {
                        findFirstVisibleItemPosition++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    static final class a extends akcs implements akbk<uqb> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uqb) this.a.get();
        }
    }

    static final class b extends akcs implements akbk<ihl> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ihl();
        }
    }

    static final class i extends akcs implements akbk<uxf> {
        private /* synthetic */ ajwy a;

        i(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uxf) this.a.get();
        }
    }

    static final class k extends akcs implements akbk<uzn> {
        private /* synthetic */ UnifiedProfilePresenter a;

        k(UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = unifiedProfilePresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new uzn(this.a.c());
        }
    }

    static final class m extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ UnifiedProfilePresenter a;

        m(UnifiedProfilePresenter unifiedProfilePresenter) {
            this.a = unifiedProfilePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue != -1 && intValue < UnifiedProfilePresenter.d(this.a).getItemCount()) {
                zma c = UnifiedProfilePresenter.d(this.a).c(intValue);
                if (c instanceof usn) {
                    abhk r_ = ((usn) c).r_();
                    if (r_ != null) {
                        uzn d = this.a.d();
                        akcr.b(r_, "sectionType");
                        long c2 = d.d.c();
                        if (!d.b.containsKey(r_)) {
                            d.b.put(r_, Long.valueOf(c2));
                        }
                        UnifiedProfilePresenter.a(this.a, r_);
                    }
                }
            }
            return ajxw.a;
        }
    }

    public static final class q extends DefaultItemAnimator {
        private /* synthetic */ int a;
        private /* synthetic */ akbl b;

        q(int i, akbl akbl) {
            this.a = i;
            this.b = akbl;
        }

        public final void onAddStarting(ViewHolder viewHolder) {
            if (viewHolder instanceof zmq) {
                Object obj = viewHolder.itemView;
                String str = "item.itemView";
                akcr.a(obj, str);
                if (obj.getBottom() > 0) {
                    obj = viewHolder.itemView;
                    akcr.a(obj, str);
                    if (obj.getTop() < this.a) {
                        this.b.invoke(Integer.valueOf(((zmq) viewHolder).getLayoutPosition()));
                    }
                }
            }
        }
    }

    static final class r extends akcq implements akbk<ajxw> {
        r(UnifiedProfilePresenter unifiedProfilePresenter) {
            super(0, unifiedProfilePresenter);
        }

        public final String getName() {
            return "onPrepared";
        }

        public final akej getOwner() {
            return akde.a(UnifiedProfilePresenter.class);
        }

        public final String getSignature() {
            return "onPrepared()V";
        }

        public final /* synthetic */ Object invoke() {
            UnifiedProfilePresenter unifiedProfilePresenter = (UnifiedProfilePresenter) this.receiver;
            upt upt = (upt) unifiedProfilePresenter.getTarget();
            if (upt != null) {
                defpackage.j lifecycle = upt.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.a(unifiedProfilePresenter);
                }
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(UnifiedProfilePresenter.class), "businessMetricLogger", "getBusinessMetricLogger()Lcom/snap/profile/api/analytics/UnifiedProfileBlizzardEventLogger;"), new akdc(akde.a(UnifiedProfilePresenter.class), "performanceEventLogger", "getPerformanceEventLogger()Lcom/snap/profile/performance/UnifiedProfileBlizzardPerformanceEventLogger;"), new akdc(akde.a(UnifiedProfilePresenter.class), "clock", "getClock()Lcom/snap/framework/time/RealClock;"), new akdc(akde.a(UnifiedProfilePresenter.class), "sectionLoadDurationTracker", "getSectionLoadDurationTracker()Lcom/snap/profile/ui/SectionLoadDurationTracker;")};
    }

    public UnifiedProfilePresenter(Context context, zkq zkq, Map<usg, usf> map, tnj tnj, zgb zgb, ajwy<uqb> ajwy, ajwy<uxf> ajwy2, ajwy<zig> ajwy3, ajwy<IComposerViewLoader> ajwy4) {
        akcr.b(context, "context");
        akcr.b(zkq, "insetsDetector");
        akcr.b(map, "pageSetupHelpers");
        akcr.b(tnj, "preferences");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "profileBusinessMetricsLoggerProvider");
        akcr.b(ajwy2, "profilePerformanceEventLoggerProvider");
        akcr.b(ajwy3, "scrollPerfLogger");
        akcr.b(ajwy4, "composerViewLoaderProvider");
        this.q = context;
        this.K = zkq;
        this.L = map;
        this.r = tnj;
        this.M = ajwy3;
        this.s = ajwy4;
        this.z = ajxh.a(new a(ajwy));
        this.A = ajxh.a(new i(ajwy2));
        this.B = ajxh.a(b.a);
        this.E = ajxh.a(new k(this));
        this.n = abhe.BUTTON;
        this.F = new uxg();
        this.o = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.p = new e(this);
        this.I = new LinkedHashSet();
        this.J = new AtomicBoolean(false);
    }

    public static final /* synthetic */ void a(UnifiedProfilePresenter unifiedProfilePresenter, abhk abhk) {
        long c;
        ajxm ajxm;
        uzn d = unifiedProfilePresenter.d();
        String str = "sectionType";
        akcr.b(abhk, str);
        if (d.c.contains(abhk) && d.b.containsKey(abhk)) {
            c = d.d.c();
            Long l = (Long) d.a.get(abhk);
            Long l2 = (Long) d.b.get(abhk);
            ajxm = new ajxm(Long.valueOf(l != null ? c - l.longValue() : -1), Long.valueOf(l2 != null ? c - l2.longValue() : -1));
        } else {
            ajxm = null;
        }
        if (ajxm != null && !unifiedProfilePresenter.I.contains(abhk)) {
            usq usq;
            unifiedProfilePresenter.I.add(abhk);
            String str2 = unifiedProfilePresenter.l;
            String str3 = "pageSessionModel";
            if (str2 != null) {
                String str4 = "profileSessionId";
                String str5 = "unifiedProfilePageType";
                if (((Number) ajxm.a).longValue() != -1) {
                    uxf b = unifiedProfilePresenter.b();
                    usq usq2 = unifiedProfilePresenter.b;
                    if (usq2 == null) {
                        akcr.a(str3);
                    }
                    usg usg = usq2.a;
                    long longValue = ((Number) ajxm.a).longValue();
                    akcr.b(usg, str5);
                    akcr.b(str2, str4);
                    akcr.b(abhk, str);
                    abhi abhi = new abhi();
                    abhi.a(Long.valueOf(longValue));
                    abhi.a(abhk.name());
                    abhi.a(defpackage.upn.a.a(usg));
                    abhi.d(str2);
                    b.a().a((aajt) abhi);
                }
                if (((Number) ajxm.b).longValue() != -1) {
                    uxf b2 = unifiedProfilePresenter.b();
                    usq = unifiedProfilePresenter.b;
                    if (usq == null) {
                        akcr.a(str3);
                    }
                    usg usg2 = usq.a;
                    c = ((Number) ajxm.b).longValue();
                    akcr.b(usg2, str5);
                    akcr.b(str2, str4);
                    akcr.b(abhk, str);
                    abhj abhj = new abhj();
                    abhj.a(Long.valueOf(c));
                    abhj.a(abhk.name());
                    abhj.a(defpackage.upn.a.a(usg2));
                    abhj.d(str2);
                    b2.a().a((aajt) abhj);
                }
            }
            AtomicBoolean atomicBoolean = unifiedProfilePresenter.G;
            uxg uxg = unifiedProfilePresenter.F;
            usq = unifiedProfilePresenter.b;
            if (usq == null) {
                akcr.a(str3);
            }
            usg usg3 = usq.a;
            akcr.b(usg3, "pageType");
            akcr.b(abhk, str);
            uxg.a.add(abhk);
            atomicBoolean.set(uxg.a(usg3));
            unifiedProfilePresenter.e();
        }
    }

    public static final /* synthetic */ zkf b(UnifiedProfilePresenter unifiedProfilePresenter) {
        zkf zkf = unifiedProfilePresenter.i;
        if (zkf == null) {
            akcr.a("bus");
        }
        return zkf;
    }

    public static final /* synthetic */ Map c(UnifiedProfilePresenter unifiedProfilePresenter) {
        Map map = unifiedProfilePresenter.j;
        if (map == null) {
            akcr.a("eventDispatcherMap");
        }
        return map;
    }

    public static final /* synthetic */ zmh d(UnifiedProfilePresenter unifiedProfilePresenter) {
        zmh zmh = unifiedProfilePresenter.x;
        if (zmh == null) {
            akcr.a("recyclerViewAdapter");
        }
        return zmh;
    }

    private final synchronized ajcx f() {
        ajcx ajcx;
        if (this.H == null) {
            Object b = ajcx.b((Callable) new h(this));
            akcr.a(b, "Completable.fromCallable…dTo(this)\n        }\n    }");
            this.H = b.b((ajdw) this.h.h()).d();
        }
        ajcx = this.H;
        if (ajcx == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        return ajcx;
    }

    /* Access modifiers changed, original: final */
    public final uqb a() {
        return (uqb) this.z.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* renamed from: a */
    public final void takeTarget(defpackage.upt r11) {
        /*
        r10 = this;
        r0 = "target";
        defpackage.akcr.b(r11, r0);
        super.takeTarget(r11);	 Catch:{ all -> 0x00ce }
        r0 = r11.d();	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x008f;
    L_0x000e:
        r10.b = r0;	 Catch:{ all -> 0x00ce }
        r0 = r10.L;	 Catch:{ all -> 0x00ce }
        r1 = r10.b;	 Catch:{ all -> 0x00ce }
        r2 = "pageSessionModel";
        if (r1 != 0) goto L_0x001b;
    L_0x0018:
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x00ce }
    L_0x001b:
        r1 = r1.a;	 Catch:{ all -> 0x00ce }
        r0 = r0.get(r1);	 Catch:{ all -> 0x00ce }
        r0 = (defpackage.usf) r0;	 Catch:{ all -> 0x00ce }
        r10.d = r0;	 Catch:{ all -> 0x00ce }
        r0 = r10.d;	 Catch:{ all -> 0x00ce }
        r1 = 0;
        if (r0 == 0) goto L_0x004e;
    L_0x002a:
        r0 = r0.g();	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x004e;
    L_0x0030:
        r3 = r10.b;	 Catch:{ all -> 0x00ce }
        if (r3 != 0) goto L_0x0037;
    L_0x0034:
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x00ce }
    L_0x0037:
        r0.a(r3);	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x004e;
    L_0x003c:
        r4 = r0;
        r4 = (defpackage.ajej) r4;	 Catch:{ all -> 0x00ce }
        r5 = r10;
        r5 = (defpackage.zln) r5;	 Catch:{ all -> 0x00ce }
        r6 = 0;
        r7 = 0;
        r8 = 6;
        r9 = 0;
        r3 = r10;
        r0 = defpackage.zln.bindTo$default(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00ce }
        r0 = (defpackage.upr) r0;	 Catch:{ all -> 0x00ce }
        goto L_0x004f;
    L_0x004e:
        r0 = r1;
    L_0x004f:
        r10.e = r0;	 Catch:{ all -> 0x00ce }
        r0 = r10.d;	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x0079;
    L_0x0055:
        r0 = r0.i();	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x0079;
    L_0x005b:
        r3 = r10.b;	 Catch:{ all -> 0x00ce }
        if (r3 != 0) goto L_0x0062;
    L_0x005f:
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x00ce }
    L_0x0062:
        r0.a(r3);	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x0079;
    L_0x0067:
        r4 = r0;
        r4 = (defpackage.ajej) r4;	 Catch:{ all -> 0x00ce }
        r5 = r10;
        r5 = (defpackage.zln) r5;	 Catch:{ all -> 0x00ce }
        r6 = 0;
        r7 = 0;
        r8 = 6;
        r9 = 0;
        r3 = r10;
        r0 = defpackage.zln.bindTo$default(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00ce }
        r1 = r0;
        r1 = (defpackage.ups) r1;	 Catch:{ all -> 0x00ce }
    L_0x0079:
        r10.f = r1;	 Catch:{ all -> 0x00ce }
        r0 = r10.G;	 Catch:{ all -> 0x00ce }
        r1 = r10.F;	 Catch:{ all -> 0x00ce }
        r3 = r10.b;	 Catch:{ all -> 0x00ce }
        if (r3 != 0) goto L_0x0086;
    L_0x0083:
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x00ce }
    L_0x0086:
        r2 = r3.a;	 Catch:{ all -> 0x00ce }
        r1 = r1.a(r2);	 Catch:{ all -> 0x00ce }
        r0.set(r1);	 Catch:{ all -> 0x00ce }
    L_0x008f:
        r0 = r11.e();	 Catch:{ all -> 0x00ce }
        r10.m = r0;	 Catch:{ all -> 0x00ce }
        r11 = r11.f();	 Catch:{ all -> 0x00ce }
        r10.n = r11;	 Catch:{ all -> 0x00ce }
        r11 = r10.f();	 Catch:{ all -> 0x00ce }
        r0 = r10.h;	 Catch:{ all -> 0x00ce }
        r0 = r0.l();	 Catch:{ all -> 0x00ce }
        r0 = (defpackage.zfr) r0;	 Catch:{ all -> 0x00ce }
        r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x00ce }
        r11 = r11.a(r0);	 Catch:{ all -> 0x00ce }
        r0 = new com.snap.profile.ui.UnifiedProfilePresenter$r;	 Catch:{ all -> 0x00ce }
        r1 = r10;
        r1 = (com.snap.profile.ui.UnifiedProfilePresenter) r1;	 Catch:{ all -> 0x00ce }
        r0.<init>(r1);	 Catch:{ all -> 0x00ce }
        r0 = (defpackage.akbk) r0;	 Catch:{ all -> 0x00ce }
        r1 = new uzp;	 Catch:{ all -> 0x00ce }
        r1.<init>(r0);	 Catch:{ all -> 0x00ce }
        r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x00ce }
        r3 = r11.g(r1);	 Catch:{ all -> 0x00ce }
        r4 = r10;
        r4 = (defpackage.zln) r4;	 Catch:{ all -> 0x00ce }
        r5 = 0;
        r6 = 0;
        r7 = 6;
        r8 = 0;
        r2 = r10;
        defpackage.zln.bindTo$default(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x00ce }
        return;
    L_0x00ce:
        r11 = move-exception;
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.profile.ui.UnifiedProfilePresenter.takeTarget(upt):void");
    }

    public final uxf b() {
        return (uxf) this.A.b();
    }

    public final ihl c() {
        return (ihl) this.B.b();
    }

    /* Access modifiers changed, original: final */
    public final uzn d() {
        return (uzn) this.E.b();
    }

    public void dropTarget() {
        upt upt = (upt) getTarget();
        if (upt != null) {
            defpackage.j lifecycle = upt.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    public final void e() {
        long c = c().c();
        if (this.G.get() && this.o.get() && !this.J.getAndSet(true) && this.l != null) {
            uxf b = b();
            usq usq = this.b;
            if (usq == null) {
                akcr.a("pageSessionModel");
            }
            usg usg = usq.a;
            String str = this.l;
            if (str == null) {
                akcr.a();
            }
            b.a(usg, str, this.n, c - this.m);
        }
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        usq usq;
        zmh zmh;
        RecyclerView recyclerView;
        String str = "bus.eventDispatcher";
        String str2 = "recyclerViewAdapter";
        String str3 = "pageSessionModel";
        String str4 = "recyclerView";
        if (this.y.compareAndSet(false, true)) {
            upt upt = (upt) getTarget();
            if (upt != null) {
                RecyclerView recyclerView2;
                String str5;
                usq usq2;
                View a = upt.a();
                Object findViewById = a.findViewById(R.id.profile_page);
                akcr.a(findViewById, "view.findViewById(R.id.profile_page)");
                this.a = findViewById;
                findViewById = a.findViewById(R.id.profile_root);
                akcr.a(findViewById, "view.findViewById(R.id.profile_root)");
                this.t = findViewById;
                Object findViewById2 = a.findViewById(R.id.profile_recycler_view);
                akcr.a(findViewById2, "view.findViewById(R.id.profile_recycler_view)");
                this.w = (RecyclerView) findViewById2;
                zln.bindTo$default(this, this.K.a().c(1).f((ajfb) new c(this)), this, null, null, 6, null);
                a = this.t;
                if (a == null) {
                    akcr.a("rootView");
                }
                a.setOnClickListener(new d(this));
                usf usf = this.d;
                usi usi = null;
                this.u = usf != null ? usf.a() : null;
                usk usk = this.u;
                if (usk != null) {
                    usq = this.b;
                    if (usq == null) {
                        akcr.a(str3);
                    }
                    usk.a(usq, this.e);
                }
                View view = this.a;
                String str6 = "pageView";
                if (view == null) {
                    akcr.a(str6);
                }
                findViewById = view.findViewById(R.id.profile_header_bar);
                akcr.a(findViewById, "pageView.findViewById(R.id.profile_header_bar)");
                zkf zkf = this.i;
                String str7 = "bus";
                if (zkf == null) {
                    akcr.a(str7);
                }
                Object a2 = zkf.a();
                akcr.a(a2, str);
                this.g = new uzq(findViewById, a2);
                uzq uzq = this.g;
                String str8 = "headerBarBinding";
                if (uzq == null) {
                    akcr.a(str8);
                }
                uzq.a = (TextView) uzq.g.findViewById(R.id.profile_header_primary_text);
                uzq.b = (TextView) uzq.g.findViewById(R.id.profile_header_secondary_text);
                findViewById = uzq.g.findViewById(R.id.profile_header_close_button);
                akcr.a(findViewById, "headerBarView.findViewBy…file_header_close_button)");
                uzq.c = (SnapImageView) findViewById;
                findViewById = uzq.g.findViewById(R.id.profile_header_menu_button);
                akcr.a(findViewById, "headerBarView.findViewBy…ofile_header_menu_button)");
                uzq.d = (SnapImageView) findViewById;
                findViewById = uzq.g.findViewById(R.id.profile_header_status_icon);
                akcr.a(findViewById, "headerBarView.findViewBy…ofile_header_status_icon)");
                uzq.e = (SnapImageView) findViewById;
                uzq.f = uzq.g.findViewById(R.id.placeholder_view);
                usk = this.u;
                if (usk != null) {
                    zln.bindTo$default(this, usk.a().b((ajdw) this.h.h()).a((ajdw) this.h.l()).f((ajfb) new l(this)), this, null, null, 6, null);
                }
                usf usf2 = this.d;
                String str9 = "recyclerView.context";
                if (usf2 != null) {
                    RecyclerView recyclerView3 = this.w;
                    if (recyclerView3 == null) {
                        akcr.a(str4);
                    }
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView3.getContext(), 1, false);
                    recyclerView3 = this.w;
                    if (recyclerView3 == null) {
                        akcr.a(str4);
                    }
                    recyclerView3.setLayoutManager(linearLayoutManager);
                    recyclerView3 = this.w;
                    if (recyclerView3 == null) {
                        akcr.a(str4);
                    }
                    findViewById = recyclerView3.getContext();
                    akcr.a(findViewById, str9);
                    int dimensionPixelSize = findViewById.getResources().getDimensionPixelSize(R.dimen.page_body_margin);
                    RecyclerView recyclerView4 = this.w;
                    if (recyclerView4 == null) {
                        akcr.a(str4);
                    }
                    recyclerView4.addItemDecoration(new o(dimensionPixelSize));
                    akbl mVar = new m(this);
                    recyclerView4 = this.w;
                    if (recyclerView4 == null) {
                        akcr.a(str4);
                    }
                    uzq uzq2 = this.g;
                    if (uzq2 == null) {
                        akcr.a(str8);
                    }
                    recyclerView4.addOnScrollListener(uzq2);
                    recyclerView4 = this.w;
                    if (recyclerView4 == null) {
                        akcr.a(str4);
                    }
                    recyclerView4.addOnScrollListener(new p(linearLayoutManager, mVar));
                    recyclerView2 = this.w;
                    if (recyclerView2 == null) {
                        akcr.a(str4);
                    }
                    int b = abtp.b(recyclerView2.getContext());
                    recyclerView4 = this.w;
                    if (recyclerView4 == null) {
                        akcr.a(str4);
                    }
                    recyclerView4.setItemAnimator(new q(b, mVar));
                    zms zms = this.c;
                    if (zms == null) {
                        akcr.a("viewFactory");
                    }
                    zkf = this.i;
                    if (zkf == null) {
                        akcr.a(str7);
                    }
                    zke a3 = zkf.a();
                    akcr.a((Object) a3, str);
                    this.x = new zmh(zms, a3, (ajdw) this.h.b(), (ajdw) this.h.l(), null, 48);
                    recyclerView2 = this.w;
                    if (recyclerView2 == null) {
                        akcr.a(str4);
                    }
                    zmh zmh2 = this.x;
                    if (zmh2 == null) {
                        akcr.a(str2);
                    }
                    recyclerView2.setAdapter(zmh2);
                    zmh = this.x;
                    if (zmh == null) {
                        akcr.a(str2);
                    }
                    str5 = str9;
                    usf usf3 = usf2;
                    zln.bindTo$default(this, zmh.e(), this, null, null, 6, null);
                    zln.bindTo$default(this, usf3.c().b((ajdw) this.h.h()).f((ajfb) new n(this)), this, null, null, 6, null);
                } else {
                    str5 = str9;
                }
                usf = this.d;
                if (usf != null) {
                    usi = usf.f();
                }
                this.v = usi;
                usi usi2 = this.v;
                if (usi2 != null) {
                    view = this.a;
                    if (view == null) {
                        akcr.a(str6);
                    }
                    ViewStub viewStub = (ViewStub) view.findViewById(R.id.bottom_bar_view_stub);
                    if (viewStub != null) {
                        viewStub.setLayoutResource(R.layout.profile_chat_input_bar);
                    }
                    if (viewStub != null) {
                        usq2 = this.b;
                        if (usq2 == null) {
                            akcr.a(str3);
                        }
                        zkf zkf2 = this.i;
                        if (zkf2 == null) {
                            akcr.a(str7);
                        }
                        Object a4 = zkf2.a();
                        akcr.a(a4, str);
                        usi2.a(usq2, viewStub, a4);
                    }
                    ajej a5 = usi2.a();
                    if (a5 != null) {
                        zln.bindTo$default(this, a5, this, null, null, 6, null);
                    }
                    recyclerView = this.w;
                    if (recyclerView == null) {
                        akcr.a(str4);
                    }
                    View view2 = recyclerView;
                    recyclerView2 = this.w;
                    if (recyclerView2 == null) {
                        akcr.a(str4);
                    }
                    findViewById2 = recyclerView2.getContext();
                    akcr.a(findViewById2, str5);
                    iho.e(view2, findViewById2.getResources().getDimensionPixelOffset(R.dimen.profile_recycler_view_bottom_padding));
                }
                usq usq3 = this.b;
                if (usq3 == null) {
                    akcr.a(str3);
                }
                this.l = usq3.e;
                this.C = c().a();
                if (this.e == null) {
                    uqb a6 = a();
                    usq usq4 = this.b;
                    if (usq4 == null) {
                        akcr.a(str3);
                    }
                    usg usg = usq4.a;
                    String str10 = this.l;
                    if (str10 == null) {
                        akcr.a();
                    }
                    usq2 = this.b;
                    if (usq2 == null) {
                        akcr.a(str3);
                    }
                    a6.a(usg, str10, usq2.d, aamk.NONE);
                } else {
                    upr upr = this.e;
                    if (upr == null) {
                        akcr.a();
                    }
                    zln.bindTo$default(this, upr.b().c(1).p(new g(this)).l(), this, null, null, 6, null);
                }
            }
        }
        recyclerView = this.w;
        if (recyclerView == null) {
            akcr.a(str4);
        }
        if (recyclerView.getAdapter() == null) {
            recyclerView = this.w;
            if (recyclerView == null) {
                akcr.a(str4);
            }
            zmh = this.x;
            if (zmh == null) {
                akcr.a(str2);
            }
            recyclerView.setAdapter(zmh);
        }
        if (this.D == null) {
            ajwy ajwy = this.M;
            usq = this.b;
            if (usq == null) {
                akcr.a(str3);
            }
            this.D = new zic(ajwy, usq.a.deckPageType.d());
        }
        recyclerView = this.w;
        if (recyclerView == null) {
            akcr.a(str4);
        }
        recyclerView.addOnScrollListener(this.D);
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
        String str = this.l;
        if (str != null) {
            double a = (double) (c().a() - this.C);
            Double.isNaN(a);
            double d = a / 1000.0d;
            upr upr = this.e;
            if (upr == null) {
                uqb a2 = a();
                usq usq = this.b;
                if (usq == null) {
                    akcr.a("pageSessionModel");
                }
                a2.a(usq.a, str, d, aamk.NONE);
            } else {
                if (upr == null) {
                    akcr.a();
                }
                zln.bindTo$default(this, upr.b().c(1).p(new f(str, d, this)).l(), this, null, null, 6, null);
            }
        }
        RecyclerView recyclerView = this.w;
        String str2 = "recyclerView";
        if (recyclerView == null) {
            akcr.a(str2);
        }
        recyclerView.setAdapter(null);
        recyclerView = this.w;
        if (recyclerView == null) {
            akcr.a(str2);
        }
        recyclerView.removeOnScrollListener(this.D);
    }
}
