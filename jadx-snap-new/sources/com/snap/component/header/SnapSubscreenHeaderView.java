package com.snap.component.header;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.AppBarLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.ajxe;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.ftb;
import java.util.ArrayList;
import java.util.Iterator;

public final class SnapSubscreenHeaderView extends AppBarLayout implements android.support.design.widget.CoordinatorLayout.a {
    private int A;
    private int B;
    private int C;
    View e;
    View f;
    View g;
    View h;
    a i;
    final ajxe j;
    private ConstraintLayout k;
    private View l;
    private ArrayList<View> m;
    private SnapSubscreenHeaderBehavior n;
    private final b o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private final ajxe s;
    private final ajxe t;
    private final ajxe u;
    private String v;
    private String w;
    private String x;
    private int y;
    private int z;

    public enum a {
        DEFAULT,
        DEFAULT_WITH_SEARCH,
        CANCEL,
        GROUP_NAME,
        GROUP_NAME_WITH_SEARCH,
        CONDENSED,
        CHAT,
        SEARCH
    }

    public static final class b implements OnClickListener {
        private /* synthetic */ SnapSubscreenHeaderView a;

        b(SnapSubscreenHeaderView snapSubscreenHeaderView) {
            this.a = snapSubscreenHeaderView;
        }

        public final void onClick(View view) {
            Context context = this.a.getContext();
            if (context != null) {
                ((Activity) context).onBackPressed();
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.app.Activity");
        }
    }

    static final class h implements OnFocusChangeListener {
        private /* synthetic */ EditText a;

        h(EditText editText) {
            this.a = editText;
        }

        public final void onFocusChange(View view, boolean z) {
            this.a.setCursorVisible(z);
        }
    }

    static final class c extends akcs implements akbk<Integer> {
        private /* synthetic */ SnapSubscreenHeaderView a;

        c(SnapSubscreenHeaderView snapSubscreenHeaderView) {
            this.a = snapSubscreenHeaderView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.getResources().getDimensionPixelOffset(R.dimen.v11_subscreen_header_search_input_field_height));
        }
    }

    static final class d extends akcs implements akbk<Integer> {
        private /* synthetic */ SnapSubscreenHeaderView a;

        d(SnapSubscreenHeaderView snapSubscreenHeaderView) {
            this.a = snapSubscreenHeaderView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.getResources().getDimensionPixelOffset(R.dimen.v11_subscreen_header_search_input_field_margin_top));
        }
    }

    static final class e extends akcs implements akbk<Integer> {
        private /* synthetic */ SnapSubscreenHeaderView a;

        e(SnapSubscreenHeaderView snapSubscreenHeaderView) {
            this.a = snapSubscreenHeaderView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.getResources().getDimensionPixelOffset(R.dimen.v11_subscreen_header_search_input_field_max_translation));
        }
    }

    static final class f extends akcs implements akbk<Integer> {
        private /* synthetic */ SnapSubscreenHeaderView a;

        f(SnapSubscreenHeaderView snapSubscreenHeaderView) {
            this.a = snapSubscreenHeaderView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object resources = this.a.getResources();
            akcr.a(resources, "resources");
            return Integer.valueOf(resources.getDisplayMetrics().widthPixels - (this.a.g() * 2));
        }
    }

    static final class g extends akcs implements akbk<String> {
        private /* synthetic */ SnapSubscreenHeaderView a;

        g(SnapSubscreenHeaderView snapSubscreenHeaderView) {
            this.a = snapSubscreenHeaderView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.getResources().getString(R.string.subscreen_header_section_header_text_default);
        }
    }

    static final class i extends akcs implements akbk<Integer> {
        private /* synthetic */ SnapSubscreenHeaderView a;

        i(SnapSubscreenHeaderView snapSubscreenHeaderView) {
            this.a = snapSubscreenHeaderView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.getResources().getDimensionPixelOffset(R.dimen.v11_subscreen_header_top_view_margin));
        }
    }

    static final class j extends akcs implements akbk<Integer> {
        private /* synthetic */ SnapSubscreenHeaderView a;

        j(SnapSubscreenHeaderView snapSubscreenHeaderView) {
            this.a = snapSubscreenHeaderView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.getResources().getDimensionPixelOffset(R.dimen.v11_subscreen_header_height));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SnapSubscreenHeaderView.class), "topViewMargin", "getTopViewMargin()I"), new akdc(akde.a(SnapSubscreenHeaderView.class), "topViewsHeight", "getTopViewsHeight()I"), new akdc(akde.a(SnapSubscreenHeaderView.class), "searchInputFieldMaxTranslation", "getSearchInputFieldMaxTranslation()I"), new akdc(akde.a(SnapSubscreenHeaderView.class), "searchInputFieldOriginalWidth", "getSearchInputFieldOriginalWidth()I"), new akdc(akde.a(SnapSubscreenHeaderView.class), "searchInputFieldHeight", "getSearchInputFieldHeight()I"), new akdc(akde.a(SnapSubscreenHeaderView.class), "searchInputFieldMarginTop", "getSearchInputFieldMarginTop()I"), new akdc(akde.a(SnapSubscreenHeaderView.class), "sectionHeaderDefaultText", "getSectionHeaderDefaultText()Ljava/lang/String;")};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:137:0x03ad in {5, 9, 12, 13, 16, 19, 22, 23, 26, 29, 36, 39, 43, 45, 48, 51, 54, 55, 58, 61, 65, 72, 76, 78, 81, 82, 85, 88, 93, 96, 102, 105, 106, 107, 110, 114, 115, 118, 119, 120, 123, 126, 127, 130, 133, 136} preds:[]
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
    public SnapSubscreenHeaderView(android.content.Context r19, android.util.AttributeSet r20) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r2 = "context";
        defpackage.akcr.b(r0, r2);
        r18.<init>(r19, r20);
        r3 = com.snap.component.header.SnapSubscreenHeaderView.a.DEFAULT;
        r1.i = r3;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r1.m = r3;
        r3 = new com.snap.component.header.SnapSubscreenHeaderView$headerBehavior$1;
        r4 = r18.getContext();
        defpackage.akcr.a(r4, r2);
        r3.<init>(r1, r4, r1);
        r3 = (com.snap.component.header.SnapSubscreenHeaderBehavior) r3;
        r1.n = r3;
        r2 = new com.snap.component.header.SnapSubscreenHeaderView$b;
        r2.<init>(r1);
        r1.o = r2;
        r2 = new com.snap.component.header.SnapSubscreenHeaderView$i;
        r2.<init>(r1);
        r2 = (defpackage.akbk) r2;
        r2 = defpackage.ajxh.a(r2);
        r1.p = r2;
        r2 = new com.snap.component.header.SnapSubscreenHeaderView$j;
        r2.<init>(r1);
        r2 = (defpackage.akbk) r2;
        r2 = defpackage.ajxh.a(r2);
        r1.q = r2;
        r2 = new com.snap.component.header.SnapSubscreenHeaderView$e;
        r2.<init>(r1);
        r2 = (defpackage.akbk) r2;
        r2 = defpackage.ajxh.a(r2);
        r1.r = r2;
        r2 = new com.snap.component.header.SnapSubscreenHeaderView$f;
        r2.<init>(r1);
        r2 = (defpackage.akbk) r2;
        r2 = defpackage.ajxh.a(r2);
        r1.s = r2;
        r2 = new com.snap.component.header.SnapSubscreenHeaderView$c;
        r2.<init>(r1);
        r2 = (defpackage.akbk) r2;
        r2 = defpackage.ajxh.a(r2);
        r1.t = r2;
        r2 = new com.snap.component.header.SnapSubscreenHeaderView$d;
        r2.<init>(r1);
        r2 = (defpackage.akbk) r2;
        r2 = defpackage.ajxh.a(r2);
        r1.u = r2;
        r2 = new com.snap.component.header.SnapSubscreenHeaderView$g;
        r2.<init>(r1);
        r2 = (defpackage.akbk) r2;
        r2 = defpackage.ajxh.a(r2);
        r1.j = r2;
        r2 = defpackage.fsx.a.a;
        r3 = r20;
        r2 = r0.obtainStyledAttributes(r3, r2);
        r0 = "context.obtainStyledAttr….SnapSubscreenHeaderView)";
        defpackage.akcr.a(r2, r0);
        r0 = com.snap.component.header.SnapSubscreenHeaderView.a.values();	 Catch:{ all -> 0x03a8 }
        r3 = 0;	 Catch:{ all -> 0x03a8 }
        r4 = 1;	 Catch:{ all -> 0x03a8 }
        r5 = r2.getInt(r4, r3);	 Catch:{ all -> 0x03a8 }
        r0 = r0[r5];	 Catch:{ all -> 0x03a8 }
        r1.i = r0;	 Catch:{ all -> 0x03a8 }
        r0 = 5;	 Catch:{ all -> 0x03a8 }
        r5 = r2.getString(r0);	 Catch:{ all -> 0x03a8 }
        r6 = "";
        if (r5 != 0) goto L_0x00ae;
        r5 = r6;
        r1.v = r5;	 Catch:{ all -> 0x03a8 }
        r5 = 4;	 Catch:{ all -> 0x03a8 }
        r7 = r2.getString(r5);	 Catch:{ all -> 0x03a8 }
        if (r7 != 0) goto L_0x00b8;	 Catch:{ all -> 0x03a8 }
        r7 = r6;	 Catch:{ all -> 0x03a8 }
        r1.w = r7;	 Catch:{ all -> 0x03a8 }
        r7 = r2.getString(r3);	 Catch:{ all -> 0x03a8 }
        if (r7 != 0) goto L_0x00c1;	 Catch:{ all -> 0x03a8 }
        goto L_0x00c2;	 Catch:{ all -> 0x03a8 }
        r6 = r7;	 Catch:{ all -> 0x03a8 }
        r1.x = r6;	 Catch:{ all -> 0x03a8 }
        r6 = 6;	 Catch:{ all -> 0x03a8 }
        r7 = -1;	 Catch:{ all -> 0x03a8 }
        r6 = r2.getResourceId(r6, r7);	 Catch:{ all -> 0x03a8 }
        r1.y = r6;	 Catch:{ all -> 0x03a8 }
        r6 = 8;	 Catch:{ all -> 0x03a8 }
        r6 = r2.getResourceId(r6, r7);	 Catch:{ all -> 0x03a8 }
        r1.A = r6;	 Catch:{ all -> 0x03a8 }
        r6 = 7;	 Catch:{ all -> 0x03a8 }
        r6 = r2.getResourceId(r6, r7);	 Catch:{ all -> 0x03a8 }
        r1.z = r6;	 Catch:{ all -> 0x03a8 }
        r6 = 3;	 Catch:{ all -> 0x03a8 }
        r8 = r2.getResourceId(r6, r7);	 Catch:{ all -> 0x03a8 }
        r1.B = r8;	 Catch:{ all -> 0x03a8 }
        r8 = 2;	 Catch:{ all -> 0x03a8 }
        r9 = r2.getResourceId(r8, r7);	 Catch:{ all -> 0x03a8 }
        r1.C = r9;	 Catch:{ all -> 0x03a8 }
        r9 = r1.i;	 Catch:{ all -> 0x03a8 }
        r10 = new android.support.constraint.ConstraintLayout;	 Catch:{ all -> 0x03a8 }
        r11 = r18.getContext();	 Catch:{ all -> 0x03a8 }
        r10.<init>(r11);	 Catch:{ all -> 0x03a8 }
        r11 = new android.support.constraint.ConstraintLayout$a;	 Catch:{ all -> 0x03a8 }
        r12 = r10.getResources();	 Catch:{ all -> 0x03a8 }
        r13 = 2131168364; // 0x7f070c6c float:1.7951028E38 double:1.052937074E-314;	 Catch:{ all -> 0x03a8 }
        r12 = r12.getDimensionPixelOffset(r13);	 Catch:{ all -> 0x03a8 }
        r11.<init>(r7, r12);	 Catch:{ all -> 0x03a8 }
        r11 = (android.view.ViewGroup.LayoutParams) r11;	 Catch:{ all -> 0x03a8 }
        r10.setLayoutParams(r11);	 Catch:{ all -> 0x03a8 }
        r11 = r10.getResources();	 Catch:{ all -> 0x03a8 }
        r12 = 2131100054; // 0x7f060196 float:1.7812479E38 double:1.0529033245E-314;	 Catch:{ all -> 0x03a8 }
        r11 = r11.getColor(r12);	 Catch:{ all -> 0x03a8 }
        r10.setBackgroundColor(r11);	 Catch:{ all -> 0x03a8 }
        r11 = 2131430567; // 0x7f0b0ca7 float:1.8482839E38 double:1.0530666197E-314;	 Catch:{ all -> 0x03a8 }
        r10.setId(r11);	 Catch:{ all -> 0x03a8 }
        r12 = r1.z;	 Catch:{ all -> 0x03a8 }
        if (r12 == r7) goto L_0x0134;	 Catch:{ all -> 0x03a8 }
        r12 = r18.getContext();	 Catch:{ all -> 0x03a8 }
        r12 = android.view.LayoutInflater.from(r12);	 Catch:{ all -> 0x03a8 }
        r13 = r1.z;	 Catch:{ all -> 0x03a8 }
        r14 = r1;	 Catch:{ all -> 0x03a8 }
        r14 = (android.view.ViewGroup) r14;	 Catch:{ all -> 0x03a8 }
        r12 = r12.inflate(r13, r14, r3);	 Catch:{ all -> 0x03a8 }
        r1.e = r12;	 Catch:{ all -> 0x03a8 }
        r12 = defpackage.ftb.a;	 Catch:{ all -> 0x03a8 }
        r13 = r9.ordinal();	 Catch:{ all -> 0x03a8 }
        r12 = r12[r13];	 Catch:{ all -> 0x03a8 }
        switch(r12) {
            case 1: goto L_0x0140;
            case 2: goto L_0x0140;
            case 3: goto L_0x0140;
            case 4: goto L_0x0140;
            case 5: goto L_0x0140;
            case 6: goto L_0x0140;
            default: goto L_0x013f;
        };	 Catch:{ all -> 0x03a8 }
        goto L_0x014c;	 Catch:{ all -> 0x03a8 }
        r12 = r1.m;	 Catch:{ all -> 0x03a8 }
        r13 = r1.e;	 Catch:{ all -> 0x03a8 }
        if (r13 != 0) goto L_0x0149;	 Catch:{ all -> 0x03a8 }
        defpackage.akcr.a();	 Catch:{ all -> 0x03a8 }
        r12.add(r13);	 Catch:{ all -> 0x03a8 }
        r12 = r1.e;	 Catch:{ all -> 0x03a8 }
        if (r12 == 0) goto L_0x0153;	 Catch:{ all -> 0x03a8 }
        r10.addView(r12);	 Catch:{ all -> 0x03a8 }
        r12 = r1.y;	 Catch:{ all -> 0x03a8 }
        if (r12 == r7) goto L_0x016a;	 Catch:{ all -> 0x03a8 }
        r12 = r18.getContext();	 Catch:{ all -> 0x03a8 }
        r12 = android.view.LayoutInflater.from(r12);	 Catch:{ all -> 0x03a8 }
        r13 = r1.y;	 Catch:{ all -> 0x03a8 }
        r14 = r1;	 Catch:{ all -> 0x03a8 }
        r14 = (android.view.ViewGroup) r14;	 Catch:{ all -> 0x03a8 }
        r12 = r12.inflate(r13, r14, r3);	 Catch:{ all -> 0x03a8 }
        r1.l = r12;	 Catch:{ all -> 0x03a8 }
        r12 = defpackage.ftb.c;	 Catch:{ all -> 0x03a8 }
        r13 = r9.ordinal();	 Catch:{ all -> 0x03a8 }
        r12 = r12[r13];	 Catch:{ all -> 0x03a8 }
        r13 = 0;	 Catch:{ all -> 0x03a8 }
        if (r12 == r4) goto L_0x01ce;	 Catch:{ all -> 0x03a8 }
        if (r12 == r8) goto L_0x01ce;	 Catch:{ all -> 0x03a8 }
        if (r12 == r6) goto L_0x01ce;	 Catch:{ all -> 0x03a8 }
        if (r12 == r5) goto L_0x017e;	 Catch:{ all -> 0x03a8 }
        if (r12 == r0) goto L_0x017e;	 Catch:{ all -> 0x03a8 }
        goto L_0x01da;	 Catch:{ all -> 0x03a8 }
        r0 = r1.w;	 Catch:{ all -> 0x03a8 }
        if (r0 != 0) goto L_0x0187;	 Catch:{ all -> 0x03a8 }
        r12 = "topCenterHintText";	 Catch:{ all -> 0x03a8 }
        defpackage.akcr.a(r12);	 Catch:{ all -> 0x03a8 }
        r12 = "hint";	 Catch:{ all -> 0x03a8 }
        defpackage.akcr.b(r0, r12);	 Catch:{ all -> 0x03a8 }
        r12 = r1.i;	 Catch:{ all -> 0x03a8 }
        r14 = defpackage.ftb.h;	 Catch:{ all -> 0x03a8 }
        r12 = r12.ordinal();	 Catch:{ all -> 0x03a8 }
        r12 = r14[r12];	 Catch:{ all -> 0x03a8 }
        if (r12 == r4) goto L_0x01b3;	 Catch:{ all -> 0x03a8 }
        if (r12 != r8) goto L_0x019b;	 Catch:{ all -> 0x03a8 }
        goto L_0x01b3;	 Catch:{ all -> 0x03a8 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x03a8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03a8 }
        r4 = "SnapSubscreenHeaderView.setTitleHint is not supported for style ";	 Catch:{ all -> 0x03a8 }
        r3.<init>(r4);	 Catch:{ all -> 0x03a8 }
        r4 = r1.i;	 Catch:{ all -> 0x03a8 }
        r3.append(r4);	 Catch:{ all -> 0x03a8 }
        r3 = r3.toString();	 Catch:{ all -> 0x03a8 }
        r0.<init>(r3);	 Catch:{ all -> 0x03a8 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x03a8 }
        throw r0;	 Catch:{ all -> 0x03a8 }
        r12 = r1.l;	 Catch:{ all -> 0x03a8 }
        r14 = r12 instanceof android.widget.EditText;	 Catch:{ all -> 0x03a8 }
        if (r14 != 0) goto L_0x01ba;	 Catch:{ all -> 0x03a8 }
        r12 = r13;	 Catch:{ all -> 0x03a8 }
        r12 = (android.widget.EditText) r12;	 Catch:{ all -> 0x03a8 }
        if (r12 == 0) goto L_0x01da;	 Catch:{ all -> 0x03a8 }
        r0 = (java.lang.CharSequence) r0;	 Catch:{ all -> 0x03a8 }
        r12.setHint(r0);	 Catch:{ all -> 0x03a8 }
        r0 = new com.snap.component.header.SnapSubscreenHeaderView$h;	 Catch:{ all -> 0x03a8 }
        r0.<init>(r12);	 Catch:{ all -> 0x03a8 }
        r0 = (android.view.View.OnFocusChangeListener) r0;	 Catch:{ all -> 0x03a8 }
        r12.setOnFocusChangeListener(r0);	 Catch:{ all -> 0x03a8 }
        goto L_0x01da;	 Catch:{ all -> 0x03a8 }
        r0 = r1.v;	 Catch:{ all -> 0x03a8 }
        if (r0 != 0) goto L_0x01d7;	 Catch:{ all -> 0x03a8 }
        r12 = "topCenterText";	 Catch:{ all -> 0x03a8 }
        defpackage.akcr.a(r12);	 Catch:{ all -> 0x03a8 }
        r1.a(r0);	 Catch:{ all -> 0x03a8 }
        r0 = r1.l;	 Catch:{ all -> 0x03a8 }
        if (r0 == 0) goto L_0x01e1;	 Catch:{ all -> 0x03a8 }
        r10.addView(r0);	 Catch:{ all -> 0x03a8 }
        r0 = r1.A;	 Catch:{ all -> 0x03a8 }
        if (r0 == r7) goto L_0x01f8;	 Catch:{ all -> 0x03a8 }
        r0 = r18.getContext();	 Catch:{ all -> 0x03a8 }
        r0 = android.view.LayoutInflater.from(r0);	 Catch:{ all -> 0x03a8 }
        r12 = r1.A;	 Catch:{ all -> 0x03a8 }
        r14 = r1;	 Catch:{ all -> 0x03a8 }
        r14 = (android.view.ViewGroup) r14;	 Catch:{ all -> 0x03a8 }
        r0 = r0.inflate(r12, r14, r3);	 Catch:{ all -> 0x03a8 }
        r1.f = r0;	 Catch:{ all -> 0x03a8 }
        r0 = defpackage.ftb.b;	 Catch:{ all -> 0x03a8 }
        r12 = r9.ordinal();	 Catch:{ all -> 0x03a8 }
        r0 = r0[r12];	 Catch:{ all -> 0x03a8 }
        if (r0 == r4) goto L_0x0205;	 Catch:{ all -> 0x03a8 }
        if (r0 == r8) goto L_0x0205;	 Catch:{ all -> 0x03a8 }
        goto L_0x0252;	 Catch:{ all -> 0x03a8 }
        r0 = r1.f;	 Catch:{ all -> 0x03a8 }
        if (r0 == 0) goto L_0x0252;	 Catch:{ all -> 0x03a8 }
        r12 = r1.m;	 Catch:{ all -> 0x03a8 }
        r12.add(r0);	 Catch:{ all -> 0x03a8 }
        r0 = r1.x;	 Catch:{ all -> 0x03a8 }
        r12 = "dismissText";
        if (r0 != 0) goto L_0x0217;
        defpackage.akcr.a(r12);	 Catch:{ all -> 0x03a8 }
        defpackage.akcr.b(r0, r12);	 Catch:{ all -> 0x03a8 }
        r12 = r1.i;	 Catch:{ all -> 0x03a8 }
        r14 = defpackage.ftb.i;	 Catch:{ all -> 0x03a8 }
        r12 = r12.ordinal();	 Catch:{ all -> 0x03a8 }
        r12 = r14[r12];	 Catch:{ all -> 0x03a8 }
        if (r12 == r4) goto L_0x0241;	 Catch:{ all -> 0x03a8 }
        if (r12 != r8) goto L_0x0229;	 Catch:{ all -> 0x03a8 }
        goto L_0x0241;	 Catch:{ all -> 0x03a8 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x03a8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03a8 }
        r4 = "SnapSubscreenHeaderView.setDismissText is not supported for style ";	 Catch:{ all -> 0x03a8 }
        r3.<init>(r4);	 Catch:{ all -> 0x03a8 }
        r4 = r1.i;	 Catch:{ all -> 0x03a8 }
        r3.append(r4);	 Catch:{ all -> 0x03a8 }
        r3 = r3.toString();	 Catch:{ all -> 0x03a8 }
        r0.<init>(r3);	 Catch:{ all -> 0x03a8 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x03a8 }
        throw r0;	 Catch:{ all -> 0x03a8 }
        r12 = r1.f;	 Catch:{ all -> 0x03a8 }
        r14 = r12 instanceof android.widget.TextView;	 Catch:{ all -> 0x03a8 }
        if (r14 != 0) goto L_0x0248;	 Catch:{ all -> 0x03a8 }
        goto L_0x0249;	 Catch:{ all -> 0x03a8 }
        r13 = r12;	 Catch:{ all -> 0x03a8 }
        r13 = (android.widget.TextView) r13;	 Catch:{ all -> 0x03a8 }
        if (r13 == 0) goto L_0x0252;	 Catch:{ all -> 0x03a8 }
        r0 = (java.lang.CharSequence) r0;	 Catch:{ all -> 0x03a8 }
        r13.setText(r0);	 Catch:{ all -> 0x03a8 }
        r0 = r1.f;	 Catch:{ all -> 0x03a8 }
        if (r0 == 0) goto L_0x0259;	 Catch:{ all -> 0x03a8 }
        r10.addView(r0);	 Catch:{ all -> 0x03a8 }
        r1.k = r10;	 Catch:{ all -> 0x03a8 }
        r0 = r1.k;	 Catch:{ all -> 0x03a8 }
        r10 = "topViews";
        if (r0 != 0) goto L_0x0264;
        defpackage.akcr.a(r10);	 Catch:{ all -> 0x03a8 }
        r0 = (android.view.View) r0;	 Catch:{ all -> 0x03a8 }
        r1.addView(r0);	 Catch:{ all -> 0x03a8 }
        r0 = r1.C;	 Catch:{ all -> 0x03a8 }
        if (r0 == r7) goto L_0x0280;	 Catch:{ all -> 0x03a8 }
        r0 = r18.getContext();	 Catch:{ all -> 0x03a8 }
        r0 = android.view.LayoutInflater.from(r0);	 Catch:{ all -> 0x03a8 }
        r12 = r1.C;	 Catch:{ all -> 0x03a8 }
        r13 = r1;	 Catch:{ all -> 0x03a8 }
        r13 = (android.view.ViewGroup) r13;	 Catch:{ all -> 0x03a8 }
        r0 = r0.inflate(r12, r13, r3);	 Catch:{ all -> 0x03a8 }
        r1.h = r0;	 Catch:{ all -> 0x03a8 }
        r0 = defpackage.ftb.d;	 Catch:{ all -> 0x03a8 }
        r12 = r9.ordinal();	 Catch:{ all -> 0x03a8 }
        r0 = r0[r12];	 Catch:{ all -> 0x03a8 }
        if (r0 == r4) goto L_0x029e;	 Catch:{ all -> 0x03a8 }
        if (r0 == r8) goto L_0x029e;	 Catch:{ all -> 0x03a8 }
        if (r0 == r6) goto L_0x0291;	 Catch:{ all -> 0x03a8 }
        if (r0 == r5) goto L_0x0291;	 Catch:{ all -> 0x03a8 }
        goto L_0x02a3;	 Catch:{ all -> 0x03a8 }
        r0 = r1.k;	 Catch:{ all -> 0x03a8 }
        if (r0 != 0) goto L_0x0298;	 Catch:{ all -> 0x03a8 }
        defpackage.akcr.a(r10);	 Catch:{ all -> 0x03a8 }
        r12 = r1.h;	 Catch:{ all -> 0x03a8 }
        r0.addView(r12);	 Catch:{ all -> 0x03a8 }
        goto L_0x02a3;	 Catch:{ all -> 0x03a8 }
        r0 = r1.h;	 Catch:{ all -> 0x03a8 }
        r1.addView(r0);	 Catch:{ all -> 0x03a8 }
        r0 = r1.B;	 Catch:{ all -> 0x03a8 }
        if (r0 == r7) goto L_0x02ba;	 Catch:{ all -> 0x03a8 }
        r0 = r18.getContext();	 Catch:{ all -> 0x03a8 }
        r0 = android.view.LayoutInflater.from(r0);	 Catch:{ all -> 0x03a8 }
        r7 = r1.B;	 Catch:{ all -> 0x03a8 }
        r12 = r1;	 Catch:{ all -> 0x03a8 }
        r12 = (android.view.ViewGroup) r12;	 Catch:{ all -> 0x03a8 }
        r0 = r0.inflate(r7, r12, r3);	 Catch:{ all -> 0x03a8 }
        r1.g = r0;	 Catch:{ all -> 0x03a8 }
        r0 = defpackage.ftb.e;	 Catch:{ all -> 0x03a8 }
        r3 = r9.ordinal();	 Catch:{ all -> 0x03a8 }
        r0 = r0[r3];	 Catch:{ all -> 0x03a8 }
        if (r0 == r4) goto L_0x02c7;	 Catch:{ all -> 0x03a8 }
        if (r0 == r8) goto L_0x02c7;	 Catch:{ all -> 0x03a8 }
        goto L_0x02cc;	 Catch:{ all -> 0x03a8 }
        r0 = r1.g;	 Catch:{ all -> 0x03a8 }
        r1.addView(r0);	 Catch:{ all -> 0x03a8 }
        r0 = r1.i;	 Catch:{ all -> 0x03a8 }
        r3 = defpackage.ftb.f;	 Catch:{ all -> 0x03a8 }
        r0 = r0.ordinal();	 Catch:{ all -> 0x03a8 }
        r0 = r3[r0];	 Catch:{ all -> 0x03a8 }
        r3 = 2131430566; // 0x7f0b0ca6 float:1.8482837E38 double:1.053066619E-314;	 Catch:{ all -> 0x03a8 }
        r4 = 2131430565; // 0x7f0b0ca5 float:1.8482835E38 double:1.0530666187E-314;	 Catch:{ all -> 0x03a8 }
        switch(r0) {
            case 1: goto L_0x02e8;
            case 2: goto L_0x02e8;
            case 3: goto L_0x02e8;
            case 4: goto L_0x02e8;
            case 5: goto L_0x02e8;
            case 6: goto L_0x02e8;
            case 7: goto L_0x02e0;
            case 8: goto L_0x02e0;
            default: goto L_0x02df;
        };	 Catch:{ all -> 0x03a8 }
        goto L_0x02ef;	 Catch:{ all -> 0x03a8 }
        r0 = r1.o;	 Catch:{ all -> 0x03a8 }
        r0 = (android.view.View.OnClickListener) r0;	 Catch:{ all -> 0x03a8 }
        r1.a(r3, r0);	 Catch:{ all -> 0x03a8 }
        goto L_0x02ef;	 Catch:{ all -> 0x03a8 }
        r0 = r1.o;	 Catch:{ all -> 0x03a8 }
        r0 = (android.view.View.OnClickListener) r0;	 Catch:{ all -> 0x03a8 }
        r1.a(r4, r0);	 Catch:{ all -> 0x03a8 }
        r0 = r1.k;	 Catch:{ all -> 0x03a8 }
        if (r0 != 0) goto L_0x02f6;	 Catch:{ all -> 0x03a8 }
        defpackage.akcr.a(r10);	 Catch:{ all -> 0x03a8 }
        r7 = new ba;	 Catch:{ all -> 0x03a8 }
        r7.<init>();	 Catch:{ all -> 0x03a8 }
        r7.a(r0);	 Catch:{ all -> 0x03a8 }
        r7.a();	 Catch:{ all -> 0x03a8 }
        r13 = 2131430565; // 0x7f0b0ca5 float:1.8482835E38 double:1.0530666187E-314;	 Catch:{ all -> 0x03a8 }
        r14 = 1;	 Catch:{ all -> 0x03a8 }
        r15 = 2131430567; // 0x7f0b0ca7 float:1.8482839E38 double:1.0530666197E-314;	 Catch:{ all -> 0x03a8 }
        r16 = 1;	 Catch:{ all -> 0x03a8 }
        r17 = r18.g();	 Catch:{ all -> 0x03a8 }
        r12 = r7;	 Catch:{ all -> 0x03a8 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x03a8 }
        r7.a(r4, r6, r11, r6);	 Catch:{ all -> 0x03a8 }
        r7.a(r4, r5, r11, r5);	 Catch:{ all -> 0x03a8 }
        r13 = 2131430566; // 0x7f0b0ca6 float:1.8482837E38 double:1.053066619E-314;	 Catch:{ all -> 0x03a8 }
        r14 = 2;	 Catch:{ all -> 0x03a8 }
        r15 = 2131430567; // 0x7f0b0ca7 float:1.8482839E38 double:1.0530666197E-314;	 Catch:{ all -> 0x03a8 }
        r16 = 2;	 Catch:{ all -> 0x03a8 }
        r17 = r18.g();	 Catch:{ all -> 0x03a8 }
        r12 = r7;	 Catch:{ all -> 0x03a8 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x03a8 }
        r7.a(r3, r6, r11, r6);	 Catch:{ all -> 0x03a8 }
        r7.a(r3, r5, r11, r5);	 Catch:{ all -> 0x03a8 }
        r3 = com.snap.component.header.SnapSubscreenHeaderView.a.SEARCH;	 Catch:{ all -> 0x03a8 }
        if (r9 != r3) goto L_0x036a;	 Catch:{ all -> 0x03a8 }
        r7.b();	 Catch:{ all -> 0x03a8 }
        r13 = 2131430563; // 0x7f0b0ca3 float:1.848283E38 double:1.0530666177E-314;	 Catch:{ all -> 0x03a8 }
        r14 = 1;	 Catch:{ all -> 0x03a8 }
        r15 = 2131430567; // 0x7f0b0ca7 float:1.8482839E38 double:1.0530666197E-314;	 Catch:{ all -> 0x03a8 }
        r16 = 1;	 Catch:{ all -> 0x03a8 }
        r17 = r18.g();	 Catch:{ all -> 0x03a8 }
        r12 = r7;	 Catch:{ all -> 0x03a8 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x03a8 }
        r13 = 2131430563; // 0x7f0b0ca3 float:1.848283E38 double:1.0530666177E-314;	 Catch:{ all -> 0x03a8 }
        r14 = 3;	 Catch:{ all -> 0x03a8 }
        r15 = 2131430567; // 0x7f0b0ca7 float:1.8482839E38 double:1.0530666197E-314;	 Catch:{ all -> 0x03a8 }
        r16 = 3;	 Catch:{ all -> 0x03a8 }
        r17 = r18.j();	 Catch:{ all -> 0x03a8 }
        r12 = r7;	 Catch:{ all -> 0x03a8 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x03a8 }
        r13 = 2131430563; // 0x7f0b0ca3 float:1.848283E38 double:1.0530666177E-314;	 Catch:{ all -> 0x03a8 }
        r14 = 2;	 Catch:{ all -> 0x03a8 }
        r15 = 2131430566; // 0x7f0b0ca6 float:1.8482837E38 double:1.053066619E-314;	 Catch:{ all -> 0x03a8 }
        r16 = 1;	 Catch:{ all -> 0x03a8 }
        r17 = r18.g();	 Catch:{ all -> 0x03a8 }
        r12 = r7;	 Catch:{ all -> 0x03a8 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x03a8 }
        goto L_0x03a1;	 Catch:{ all -> 0x03a8 }
        r3 = com.snap.component.header.SnapSubscreenHeaderView.a.CONDENSED;	 Catch:{ all -> 0x03a8 }
        if (r9 != r3) goto L_0x03a1;	 Catch:{ all -> 0x03a8 }
        r7.b();	 Catch:{ all -> 0x03a8 }
        r13 = 2131430563; // 0x7f0b0ca3 float:1.848283E38 double:1.0530666177E-314;	 Catch:{ all -> 0x03a8 }
        r14 = 1;	 Catch:{ all -> 0x03a8 }
        r15 = 2131430565; // 0x7f0b0ca5 float:1.8482835E38 double:1.0530666187E-314;	 Catch:{ all -> 0x03a8 }
        r16 = 2;	 Catch:{ all -> 0x03a8 }
        r17 = r18.g();	 Catch:{ all -> 0x03a8 }
        r12 = r7;	 Catch:{ all -> 0x03a8 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x03a8 }
        r13 = 2131430563; // 0x7f0b0ca3 float:1.848283E38 double:1.0530666177E-314;	 Catch:{ all -> 0x03a8 }
        r14 = 3;	 Catch:{ all -> 0x03a8 }
        r15 = 2131430567; // 0x7f0b0ca7 float:1.8482839E38 double:1.0530666197E-314;	 Catch:{ all -> 0x03a8 }
        r16 = 3;	 Catch:{ all -> 0x03a8 }
        r17 = r18.j();	 Catch:{ all -> 0x03a8 }
        r12 = r7;	 Catch:{ all -> 0x03a8 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x03a8 }
        r13 = 2131430563; // 0x7f0b0ca3 float:1.848283E38 double:1.0530666177E-314;	 Catch:{ all -> 0x03a8 }
        r14 = 2;	 Catch:{ all -> 0x03a8 }
        r15 = 2131430567; // 0x7f0b0ca7 float:1.8482839E38 double:1.0530666197E-314;	 Catch:{ all -> 0x03a8 }
        r16 = 2;	 Catch:{ all -> 0x03a8 }
        r17 = r18.g();	 Catch:{ all -> 0x03a8 }
        goto L_0x0365;	 Catch:{ all -> 0x03a8 }
        r7.b(r0);	 Catch:{ all -> 0x03a8 }
        r2.recycle();
        return;
        r0 = move-exception;
        r2.recycle();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.component.header.SnapSubscreenHeaderView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private final int j() {
        return ((Number) this.u.b()).intValue();
    }

    public final /* bridge */ /* synthetic */ android.support.design.widget.CoordinatorLayout.b a() {
        return this.n;
    }

    public final void a(int i, OnClickListener onClickListener) {
        akcr.b(onClickListener, "onClickListener");
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            Object obj = (View) it.next();
            akcr.a(obj, "view");
            if (obj.getId() == i) {
                obj.setOnClickListener(onClickListener);
                return;
            }
        }
    }

    public final void a(String str) {
        akcr.b(str, "titleText");
        int i = ftb.g[this.i.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            View view = this.l;
            if (!(view instanceof TextView)) {
                view = null;
            }
            TextView textView = (TextView) view;
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("SnapSubscreenHeaderView.setTitleText is not supported for style ");
        stringBuilder.append(this.i);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final int g() {
        return ((Number) this.p.b()).intValue();
    }

    /* Access modifiers changed, original: final */
    public final int h() {
        return ((Number) this.r.b()).intValue();
    }

    /* Access modifiers changed, original: final */
    public final int i() {
        return ((Number) this.s.b()).intValue();
    }
}
