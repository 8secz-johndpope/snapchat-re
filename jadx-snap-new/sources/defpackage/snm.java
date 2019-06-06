package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.common.collect.Sets;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.opera.view.interactionzone.InteractionZoneLayerView;
import com.snapchat.android.R;
import defpackage.szw.b;
import defpackage.tbg.a;
import java.util.Set;

/* renamed from: snm */
public final class snm extends slm implements a {
    private final InteractionZoneLayerView a;
    private final tbj b;
    private final Set<Long> c;
    private Long d;
    private spw e;
    private long f;
    private long g;
    private sjm h;
    private boolean i;
    private boolean j;
    private final siy k;

    /* renamed from: snm$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: snm$b */
    static final class b implements siy {
        private /* synthetic */ snm a;

        b(snm snm) {
            this.a = snm;
        }
    }

    static {
        a aVar = new a();
    }

    public snm(Context context) {
        akcr.b(context, "context");
        View inflate = View.inflate(context, R.layout.interaction_zone_layer_view, null);
        if (inflate != null) {
            this.a = (InteractionZoneLayerView) inflate;
            this.b = new tbj(context);
            Object newHashSet = Sets.newHashSet();
            akcr.a(newHashSet, "Sets.newHashSet()");
            this.c = (Set) newHashSet;
            this.f = 1;
            this.k = new b(this);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.opera.view.interactionzone.InteractionZoneLayerView");
    }

    private final void a(String str, Point point) {
        CharSequence charSequence = str;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj == null) {
            szw szw = new szw();
            b bVar = sqh.ai;
            if (str == null) {
                akcr.a();
            }
            szw.b(bVar, new sqf(str));
            szw.b(skj.ay, point);
            szw.b(skj.aU, this.d);
            C().a("INTERACTION_ZONE_ITEM_CLICKED", (szw) w(), szw);
        }
    }

    /* renamed from: A_ */
    public final tas.a j() {
        tas.a aVar = new tas.a(this.a.getLayoutParams());
        aVar.gravity = 81;
        return aVar;
    }

    public final void a(szw szw) {
        super.a(szw);
        InteractionZoneLayerView interactionZoneLayerView = this.a;
        if (interactionZoneLayerView.a != MapboxConstants.MINIMUM_ZOOM) {
            interactionZoneLayerView.animate().cancel();
            Object translationY = interactionZoneLayerView.animate().translationY(MapboxConstants.MINIMUM_ZOOM);
            akcr.a(translationY, "animate().translationY(0f)");
            translationY.setDuration(300);
        }
    }

    public final void a(tbh tbh) {
        if (tbh != null) {
            long j = (long) tbh.a;
            Long l = this.d;
            if (l == null || l.longValue() != j) {
                this.d = Long.valueOf(j);
                long j2 = this.g;
                if (j2 < j) {
                    j2 = j;
                }
                this.g = j2;
                this.c.add(Long.valueOf(j));
                this.f++;
                tbe tbe = tbh.e;
                if (tbe.b == tbd.REMOTE_WEB_PAGE) {
                    CharSequence charSequence = tbe.a;
                    Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                    if (obj == null) {
                        szw szw = new szw();
                        b bVar = sqh.ai;
                        String str = tbe.a;
                        if (str == null) {
                            akcr.a();
                        }
                        szw.b(bVar, new sqf(str));
                        szw.b(skj.aU, this.d);
                        C().a("INTERACTION_ZONE_ITEM_SWIPED", (szw) w(), szw);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:19:0x0051, code skipped:
            if (r3.a(r0, true, true) == false) goto L_0x0053;
     */
    public final void a(defpackage.tbh r6, android.graphics.Point r7) {
        /*
        r5 = this;
        r0 = "viewModel";
        defpackage.akcr.b(r6, r0);
        r0 = "tapPosition";
        defpackage.akcr.b(r7, r0);
        r0 = r6.a;
        r0 = (long) r0;
        r0 = java.lang.Long.valueOf(r0);
        r5.d = r0;
        r6 = r6.e;
        r0 = r6.b;
        r1 = defpackage.snn.a;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 1;
        if (r0 == r1) goto L_0x00ac;
    L_0x0022:
        r2 = 2;
        if (r0 == r2) goto L_0x0092;
    L_0x0025:
        r2 = 3;
        if (r0 == r2) goto L_0x0029;
    L_0x0028:
        goto L_0x0091;
    L_0x0029:
        r0 = r6.c;
        r2 = r6.d;
        r6 = r6.e;
        r3 = r0;
        r3 = (java.lang.CharSequence) r3;
        r4 = 0;
        if (r3 == 0) goto L_0x003e;
    L_0x0035:
        r3 = r3.length();
        if (r3 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x003e;
    L_0x003c:
        r3 = 0;
        goto L_0x003f;
    L_0x003e:
        r3 = 1;
    L_0x003f:
        if (r3 != 0) goto L_0x0053;
    L_0x0041:
        r3 = r5.h;
        if (r3 != 0) goto L_0x0048;
    L_0x0045:
        defpackage.akcr.a();
    L_0x0048:
        if (r0 != 0) goto L_0x004d;
    L_0x004a:
        defpackage.akcr.a();
    L_0x004d:
        r0 = r3.a(r0, r1, r1);
        if (r0 != 0) goto L_0x0091;
    L_0x0053:
        r0 = r2;
        r0 = (java.lang.CharSequence) r0;
        if (r0 == 0) goto L_0x0061;
    L_0x0058:
        r0 = r0.length();
        if (r0 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x0061;
    L_0x005f:
        r0 = 0;
        goto L_0x0062;
    L_0x0061:
        r0 = 1;
    L_0x0062:
        if (r0 != 0) goto L_0x007e;
    L_0x0064:
        r6 = r5.A();
        r7 = "viewerContext";
        defpackage.akcr.a(r6, r7);
        r6 = r6.a();
        r6 = r6.a;
        r7 = "viewerContext.config.mContext";
        defpackage.akcr.a(r6, r7);
        defpackage.szi.a(r6, r2);
        r5.i = r1;
        return;
    L_0x007e:
        r0 = r6;
        r0 = (java.lang.CharSequence) r0;
        if (r0 == 0) goto L_0x0089;
    L_0x0083:
        r0 = r0.length();
        if (r0 != 0) goto L_0x008a;
    L_0x0089:
        r4 = 1;
    L_0x008a:
        if (r4 != 0) goto L_0x0091;
    L_0x008c:
        r5.a(r6, r7);
        r5.j = r1;
    L_0x0091:
        return;
    L_0x0092:
        r6 = new szw;
        r6.<init>();
        r0 = defpackage.skj.ay;
        r6.b(r0, r7);
        r7 = r5.C();
        r0 = r5.w();
        r0 = (defpackage.szw) r0;
        r1 = "INTERACTION_ZONE_ITEM_CLICKED";
        r7.a(r1, r0, r6);
        return;
    L_0x00ac:
        r6 = r6.a;
        r5.a(r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snm.a(tbh, android.graphics.Point):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:108:0x033c in {2, 3, 9, 10, 13, 14, 18, 20, 21, 28, 29, 34, 35, 36, 41, 42, 45, 46, 49, 50, 53, 56, 59, 66, 69, 72, 75, 78, 81, 86, 87, 89, 90, 95, 99, 101, 103, 105, 107} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void ae_() {
        /*
        r39 = this;
        r0 = r39;
        super.ae_();
        r1 = r0.b;
        r2 = r39.w();
        r3 = defpackage.sqh.be;
        r2 = r2.a(r3);
        r3 = "page.get(OperaPageModel.INTERACTION_ZONE_MODEL)";
        defpackage.akcr.a(r2, r3);
        r2 = (defpackage.sqe) r2;
        r3 = r39.w();
        r4 = defpackage.sqh.bf;
        r3 = r3.a(r4);
        r4 = "page.get(OperaPageModel.INTERACTION_ZONE_UI_TYPE)";
        defpackage.akcr.a(r3, r4);
        r3 = (defpackage.spw) r3;
        r4 = "dataModel";
        defpackage.akcr.b(r2, r4);
        r4 = "uiType";
        defpackage.akcr.b(r3, r4);
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = r2.d;
        r5 = r5.size();
        r6 = r1.a(r3);
        r7 = defpackage.spw.CAROUSEL;
        r8 = 1;
        if (r3 != r7) goto L_0x0055;
        r5 = r1.a;
        r9 = (double) r5;
        r11 = 4605910602265247980; // 0x3feb7b4a2339c0ec float:1.0069723E-17 double:0.8588;
        java.lang.Double.isNaN(r9);
        r9 = r9 * r11;
        r5 = (int) r9;
        goto L_0x0069;
        r7 = r1.a;
        r9 = r1.c(r3);
        r9 = r9 << r8;
        r7 = r7 - r9;
        r9 = r1.b(r3);
        r9 = r9 << r8;
        r7 = r7 - r9;
        r9 = r5 + 1;
        r9 = r9 * r6;
        r7 = r7 - r9;
        r5 = r7 / r5;
        r7 = r1.e(r3);
        r6 = r6 << r8;
        r7 = r7 - r6;
        r6 = new abpq;
        r6.<init>(r5, r7);
        r5 = r2.d;
        r5 = (java.lang.Iterable) r5;
        r5 = r5.iterator();
        r21 = 0;
        r9 = r5.hasNext();
        r11 = 2;
        if (r9 == 0) goto L_0x0147;
        r9 = r5.next();
        r9 = (defpackage.sqd) r9;
        r15 = new tbh;
        r12 = r9.a;
        r13 = defpackage.spw.CAROUSEL;
        if (r3 != r13) goto L_0x00aa;
        r13 = r6.a();
        r13 = (double) r13;
        r16 = 4595905405333081686; // 0x3fc7ef9db22d0e56 float:-1.0073185E-8 double:0.187;
        java.lang.Double.isNaN(r13);
        r13 = r13 * r16;
        r13 = (int) r13;
        r14 = new abpq;
        r14.<init>(r13, r13);
        r13 = r14;
        goto L_0x00c7;
        r13 = defpackage.spw.NO_BACKGROUND;
        if (r3 != r13) goto L_0x00c6;
        r13 = r1.d(r3);
        r14 = new abpq;
        r16 = r6.a();
        r13 = r13 * 2;
        r10 = r16 - r13;
        r16 = r6.b();
        r13 = r16 - r13;
        r14.<init>(r10, r13);
        goto L_0x00a8;
        r13 = r6;
        r10 = r9.b;
        r14 = defpackage.tbk.k;
        r10 = r10.ordinal();
        r10 = r14[r10];
        if (r10 == r8) goto L_0x00de;
        if (r10 != r11) goto L_0x00d8;
        r10 = defpackage.tbd.DEEP_LINK;
        goto L_0x00e0;
        r1 = new ajxk;
        r1.<init>();
        throw r1;
        r10 = defpackage.tbd.REMOTE_WEB_PAGE;
        r24 = r10;
        r14 = new tbe;
        r10 = r9.c;
        r7 = r9.f;
        r11 = r9.g;
        r8 = r9.h;
        r22 = r14;
        r23 = r10;
        r25 = r7;
        r26 = r11;
        r27 = r8;
        r22.<init>(r23, r24, r25, r26, r27);
        r7 = 0;
        r8 = r9.d;
        r11 = r9.e;
        r9 = defpackage.tbk.i;
        r10 = r3.ordinal();
        r9 = r9[r10];
        r10 = 1;
        if (r9 == r10) goto L_0x0112;
        r10 = 2;
        if (r9 == r10) goto L_0x0112;
        r10 = 3;
        if (r9 == r10) goto L_0x0112;
        r18 = 0;
        goto L_0x0116;
        r9 = r1.b;
        r18 = r9;
        r19 = r1.d(r3);
        r9 = defpackage.tbk.g;
        r10 = r3.ordinal();
        r9 = r9[r10];
        r10 = 1;
        if (r9 == r10) goto L_0x012b;
        r10 = 2;
        if (r9 == r10) goto L_0x012b;
        r20 = 0;
        goto L_0x012d;
        r20 = -1;
        r9 = r15;
        r10 = r21;
        r17 = r11;
        r11 = r6;
        r22 = r5;
        r5 = r15;
        r15 = r7;
        r16 = r8;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r4.add(r5);
        r10 = 1;
        r21 = r21 + 1;
        r5 = r22;
        r8 = 1;
        goto L_0x007e;
        r10 = 1;
        r38 = r4;
        r38 = (java.util.List) r38;
        r4 = new tbi;
        r5 = r2.a;
        r2 = r2.b;
        r6 = defpackage.tbk.a;
        r7 = r3.ordinal();
        r6 = r6[r7];
        if (r6 == r10) goto L_0x0162;
        r7 = 2;
        if (r6 == r7) goto L_0x0162;
        r31 = 0;
        goto L_0x0164;
        r31 = -1;
        r6 = defpackage.tbk.b;
        r7 = r3.ordinal();
        r6 = r6[r7];
        if (r6 == r10) goto L_0x0173;
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r32 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x0177;
        r6 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r32 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r6 = defpackage.tbk.c;
        r7 = r3.ordinal();
        r6 = r6[r7];
        if (r6 == r10) goto L_0x0187;
        r6 = 4583151211188368441; // 0x3f9a9fbe76c8b439 float:2.0353803E33 double:0.026;
        goto L_0x018c;
        r6 = 4584772507054221820; // 0x3fa0624dd2f1a9fc float:-5.18969491E11 double:0.032;
        r8 = r1.a;
        r8 = (double) r8;
        java.lang.Double.isNaN(r8);
        r8 = r8 * r6;
        r6 = (int) r8;
        r34 = r1.a(r3);
        r35 = r1.b(r3);
        r36 = r1.c(r3);
        r37 = r1.e(r3);
        r28 = r4;
        r29 = r5;
        r30 = r2;
        r33 = r6;
        r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38);
        r1 = r39.w();
        r2 = defpackage.sqh.bg;
        r3 = 0;
        r1 = r1.c(r2, r3);
        r1 = (java.lang.Long) r1;
        r0.d = r1;
        r1 = r0.a;
        r2 = r39.D();
        r5 = "bitmapProvider";
        defpackage.akcr.a(r2, r5);
        r6 = r0;
        r6 = (defpackage.tbg.a) r6;
        defpackage.akcr.b(r2, r5);
        r7 = "actionListener";
        defpackage.akcr.b(r6, r7);
        r8 = "viewModel";
        defpackage.akcr.b(r4, r8);
        r8 = r1.j;
        if (r8 != 0) goto L_0x01e2;
        r9 = "itemDecoration";
        defpackage.akcr.a(r9);
        r9 = r4.f;
        r8.a = r9;
        r8 = r1.getContext();
        r9 = "context";
        defpackage.akcr.a(r8, r9);
        r19 = new android.graphics.Paint;
        r19.<init>();
        r20 = defpackage.spm.UP;
        r21 = -1;
        r22 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r17 = r8;
        r18 = r2;
        r8 = defpackage.tdc.a(r17, r18, r19, r20, r21, r22);
        r9 = r1.i;
        if (r9 != 0) goto L_0x020b;
        r11 = "swipeUpArrowView";
        defpackage.akcr.a(r11);
        r11 = r8.c();
        r9.setImageBitmap(r11);
        r8.b();
        r8 = r1.h;
        if (r8 != 0) goto L_0x021e;
        r9 = "recyclerView";
        defpackage.akcr.a(r9);
        r9 = new android.widget.LinearLayout$LayoutParams;
        r11 = r1.b;
        r12 = r4.h;
        r13 = 2;
        r12 = r12 * 2;
        r11 = r11 - r12;
        r12 = r4.i;
        r9.<init>(r11, r12);
        r9 = (android.view.ViewGroup.LayoutParams) r9;
        r8.setLayoutParams(r9);
        r9 = r8.getLayoutParams();
        r11 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
        if (r9 == 0) goto L_0x0336;
        r9 = (android.view.ViewGroup.MarginLayoutParams) r9;
        r12 = r4.h;
        r9.bottomMargin = r12;
        r9 = r8.getLayoutParams();
        if (r9 == 0) goto L_0x0330;
        r9 = (android.view.ViewGroup.MarginLayoutParams) r9;
        r11 = r4.h;
        r9.topMargin = r11;
        r9 = r4.g;
        r11 = r4.g;
        r12 = 0;
        r8.setPadding(r9, r12, r11, r12);
        r9 = r1.k;
        r11 = "listBackgroundDrawable";
        if (r9 != 0) goto L_0x025d;
        defpackage.akcr.a(r11);
        r12 = r4.d;
        r9.setAlpha(r12);
        r9 = r4.c;
        if (r9 != 0) goto L_0x0268;
        r9 = r3;
        goto L_0x026f;
        r9 = r1.k;
        if (r9 != 0) goto L_0x026f;
        defpackage.akcr.a(r11);
        r8.setBackground(r9);
        r9 = r1.e;
        r11 = "itemAdapter";
        if (r9 != 0) goto L_0x027b;
        defpackage.akcr.a(r11);
        r9 = (android.support.v7.widget.RecyclerView.Adapter) r9;
        r8.setAdapter(r9);
        r8 = r1.e;
        if (r8 != 0) goto L_0x0287;
        defpackage.akcr.a(r11);
        r9 = r4.j;
        defpackage.akcr.b(r2, r5);
        defpackage.akcr.b(r6, r7);
        r5 = "interactionZoneItems";
        defpackage.akcr.b(r9, r5);
        r8.b = r2;
        r8.c = r6;
        r2 = r8.a;
        r2.clear();
        r2 = r8.a;
        r9 = (java.util.Collection) r9;
        r2.addAll(r9);
        r2 = r1.f;
        if (r2 != 0) goto L_0x02ad;
        r5 = "headlineTextView";
        defpackage.akcr.a(r5);
        r5 = r4.a;
        r5 = (java.lang.CharSequence) r5;
        if (r5 == 0) goto L_0x02bb;
        r5 = r5.length();
        if (r5 != 0) goto L_0x02ba;
        goto L_0x02bb;
        r10 = 0;
        if (r10 == 0) goto L_0x02c0;
        r5 = 8;
        goto L_0x02c8;
        r5 = r4.a;
        r5 = (java.lang.CharSequence) r5;
        r2.setText(r5);
        r5 = 0;
        r2.setVisibility(r5);
        r2 = r2.getLayoutParams();
        r5 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams";
        if (r2 == 0) goto L_0x032a;
        r2 = (android.widget.FrameLayout.LayoutParams) r2;
        r7 = r4.e;
        r2.setMarginStart(r7);
        r2 = r1.g;
        if (r2 != 0) goto L_0x02e3;
        r7 = "adSlugTextView";
        defpackage.akcr.a(r7);
        r7 = r4.b;
        r7 = (java.lang.CharSequence) r7;
        r2.setText(r7);
        r2 = r2.getLayoutParams();
        if (r2 == 0) goto L_0x0324;
        r2 = (android.widget.FrameLayout.LayoutParams) r2;
        r4 = r4.e;
        r2.setMarginEnd(r4);
        r1.c = r6;
        r1.d = r3;
        r1.a();
        r1 = r39.w();
        r2 = defpackage.sqh.bf;
        r1 = r1.a(r2);
        r1 = (defpackage.spw) r1;
        r0.e = r1;
        r1 = 0;
        r0.g = r1;
        r1 = 1;
        r0.f = r1;
        r1 = r0.G;
        r2 = "mViewerContext";
        defpackage.akcr.a(r1, r2);
        r1 = r1.a();
        r1 = r1.g;
        r0.h = r1;
        return;
        r1 = new ajxt;
        r1.<init>(r5);
        throw r1;
        r1 = new ajxt;
        r1.<init>(r5);
        throw r1;
        r1 = new ajxt;
        r1.<init>(r11);
        throw r1;
        r1 = new ajxt;
        r1.<init>(r11);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snm.ae_():void");
    }

    public final void b() {
        super.b();
        RecyclerView recyclerView = this.a.h;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        recyclerView.setAdapter(null);
    }

    public final void b(szw szw) {
        super.b(szw);
        this.a.a();
        if (szw != null && w().c(sqh.be)) {
            szw.b(skj.aV, Long.valueOf((long) ((sqe) w().a(sqh.be)).d.size()));
            szw.b(skj.aX, this.e);
            szw szw2 = new szw();
            boolean z = false;
            if (this.j || this.i) {
                if (this.i) {
                    szw2.b(skj.af, Boolean.valueOf(this.i));
                    this.i = false;
                } else if (this.j) {
                    szw2.b(skj.ag, Boolean.valueOf(this.j));
                    this.j = false;
                }
                szw2.b(skj.aQ, Boolean.TRUE);
                szw2.b(skj.aR, abns.TAP_INTERACTIVE);
                szw2.b(skj.aU, this.d);
                szw2.b(skj.aW, spv.DEEP_LINK);
            }
            szw.a(szw2);
            srb srb = (srb) szw.a(skj.a);
            if (this.e == spw.CAROUSEL) {
                szw.b(skj.ba, Long.valueOf(this.g));
                szw.b(skj.aZ, Long.valueOf((long) this.c.size()));
                szw.b(skj.aY, Long.valueOf(this.f));
                szw.b(skj.aU, this.d);
                this.c.clear();
                Long l = this.d;
                if (l != null) {
                    long longValue = l.longValue();
                    this.c.add(Long.valueOf(longValue));
                    this.g = longValue;
                }
                this.f = 1;
            } else if (srb == srb.TAP_INTERACTIVE || srb == srb.SWIPE_FRONT) {
                szw.b(skj.aU, this.d);
            } else {
                if (srb == srb.TAP_RIGHT && this.d != null) {
                    Object a = w().a(sqh.be);
                    akcr.a(a, "page.get(OperaPageModel.INTERACTION_ZONE_MODEL)");
                    sqe sqe = (sqe) a;
                    if (!sqe.d.isEmpty()) {
                        CharSequence charSequence = ((sqd) ajyu.f(sqe.d)).c;
                        if (charSequence == null || charSequence.length() == 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        szw.b(skj.aU, this.d);
                        this.d = null;
                    }
                }
            }
        }
    }

    public final View e() {
        return this.a;
    }

    public final String f() {
        return "INTERACTION_ZONE";
    }
}
