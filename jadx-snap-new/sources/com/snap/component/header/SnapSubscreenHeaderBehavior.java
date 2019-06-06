package com.snap.component.header;

import android.content.Context;
import android.support.design.widget.AppBarLayout.ScrollingViewBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import defpackage.akcr;
import defpackage.zmy;

public abstract class SnapSubscreenHeaderBehavior extends ScrollingViewBehavior {
    private final Context d;
    private final SnapSubscreenHeaderView e;

    public SnapSubscreenHeaderBehavior(Context context, SnapSubscreenHeaderView snapSubscreenHeaderView) {
        akcr.b(context, "context");
        akcr.b(snapSubscreenHeaderView, "snapSubscreenHeaderView");
        this.d = context;
        this.e = snapSubscreenHeaderView;
    }

    public abstract String a(zmy zmy);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:85:0x0193 in {3, 12, 15, 18, 21, 22, 23, 28, 31, 32, 33, 38, 41, 42, 51, 52, 57, 58, 61, 67, 70, 75, 78, 79, 80, 82, 84} preds:[]
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
    public final void a(android.support.design.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7, int r8, int r9, int r10, int r11, int r12) {
        /*
        r4 = this;
        r0 = "coordinatorLayout";
        defpackage.akcr.b(r5, r0);
        r0 = "child";
        defpackage.akcr.b(r6, r0);
        r0 = "target";
        defpackage.akcr.b(r7, r0);
        super.a(r5, r6, r7, r8, r9, r10, r11, r12);
        r5 = r7;
        r5 = (android.support.v7.widget.RecyclerView) r5;
        r8 = r5.computeVerticalScrollOffset();
        r8 = (float) r8;
        r9 = r4.d;
        r9 = r9.getResources();
        r10 = 2131168368; // 0x7f070c70 float:1.7951036E38 double:1.052937076E-314;
        r9 = r9.getDimension(r10);
        r8 = java.lang.Math.min(r8, r9);
        r8 = -r8;
        r9 = r4.e;
        r10 = r9.i;
        r0 = com.snap.component.header.SnapSubscreenHeaderView.a.DEFAULT_WITH_SEARCH;
        if (r10 == r0) goto L_0x003a;
        r10 = r9.i;
        r0 = com.snap.component.header.SnapSubscreenHeaderView.a.GROUP_NAME_WITH_SEARCH;
        if (r10 != r0) goto L_0x00f0;
        r10 = r9.h;
        if (r10 == 0) goto L_0x00f0;
        r10.setTranslationY(r8);
        r0 = -r8;
        r1 = r9.h();
        r1 = (float) r1;
        r0 = r0 / r1;
        r1 = r9.f;
        if (r1 == 0) goto L_0x0097;
        r1 = r9.e;
        if (r1 == 0) goto L_0x0097;
        r1 = r9.f;
        if (r1 != 0) goto L_0x0057;
        defpackage.akcr.a();
        r1 = r1.getWidth();
        r2 = r9.f;
        if (r2 != 0) goto L_0x0062;
        defpackage.akcr.a();
        r2 = r2.getPaddingStart();
        r1 = r1 + r2;
        r2 = r9.e;
        if (r2 != 0) goto L_0x006e;
        defpackage.akcr.a();
        r2 = r2.getWidth();
        r1 = r1 + r2;
        r2 = r9.e;
        if (r2 != 0) goto L_0x007a;
        defpackage.akcr.a();
        r2 = r2.getPaddingEnd();
        r1 = r1 + r2;
        r2 = r10.getLayoutParams();
        r9 = r9.i();
        r9 = (float) r9;
        r1 = (float) r1;
        r3 = r0 * r1;
        r9 = r9 - r3;
        r9 = (int) r9;
        r2.width = r9;
        r9 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r1 * r9;
        r0 = r0 * r1;
        r10.setTranslationX(r0);
        goto L_0x00c1;
        r1 = r9.f;
        if (r1 == 0) goto L_0x00c5;
        r1 = r9.f;
        if (r1 != 0) goto L_0x00a2;
        defpackage.akcr.a();
        r1 = r1.getWidth();
        r2 = r9.f;
        if (r2 != 0) goto L_0x00ad;
        defpackage.akcr.a();
        r2 = r2.getPaddingStart();
        r1 = r1 + r2;
        r2 = r10.getLayoutParams();
        r9 = r9.i();
        r9 = (float) r9;
        r1 = (float) r1;
        r0 = r0 * r1;
        r9 = r9 - r0;
        r9 = (int) r9;
        r2.width = r9;
        r10.setLayoutParams(r2);
        goto L_0x00f0;
        r1 = r9.e;
        if (r1 == 0) goto L_0x00f0;
        r1 = r9.e;
        if (r1 != 0) goto L_0x00d0;
        defpackage.akcr.a();
        r1 = r1.getWidth();
        r2 = r9.e;
        if (r2 != 0) goto L_0x00db;
        defpackage.akcr.a();
        r2 = r2.getPaddingEnd();
        r1 = r1 + r2;
        r2 = r10.getLayoutParams();
        r9 = r9.i();
        r9 = (float) r9;
        r1 = (float) r1;
        r0 = r0 * r1;
        r9 = r9 - r0;
        r9 = (int) r9;
        r2.width = r9;
        goto L_0x0093;
        r9 = r4.e;
        r10 = r5.getLayoutManager();
        if (r10 == 0) goto L_0x018b;
        r10 = (android.support.v7.widget.LinearLayoutManager) r10;
        r10 = r10.findFirstCompletelyVisibleItemPosition();
        r0 = r5.getAdapter();
        if (r0 == 0) goto L_0x0183;
        r0 = (defpackage.zml) r0;
        r5 = r5.getTranslationY();
        r1 = 0;
        r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r5 == 0) goto L_0x0118;
        r5 = r10 + 1;
        r1 = r0.getItemCount();
        if (r5 >= r1) goto L_0x0118;
        goto L_0x0119;
        r5 = r10;
        r5 = r0.a(r5);
        r10 = "model";
        defpackage.akcr.a(r5, r10);
        r5 = r4.a(r5);
        r10 = "newSectionHeaderText";
        defpackage.akcr.b(r5, r10);
        r10 = r9.g;
        r0 = 0;
        if (r10 == 0) goto L_0x0148;
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2 = r9.h();
        r2 = (float) r2;
        r2 = r2 * r1;
        r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r1 != 0) goto L_0x0143;
        r10.setVisibility(r0);
        r10.setTranslationY(r8);
        goto L_0x0148;
        r8 = 8;
        r10.setVisibility(r8);
        r8 = r5;
        r8 = (java.lang.CharSequence) r8;
        r10 = r8.length();
        r1 = 1;
        if (r10 <= 0) goto L_0x0153;
        r0 = 1;
        if (r0 == 0) goto L_0x016a;
        r10 = "headerString";
        defpackage.akcr.b(r5, r10);
        r5 = r9.g;
        if (r5 == 0) goto L_0x016a;
        r9 = r5 instanceof android.widget.TextView;
        if (r9 != 0) goto L_0x0163;
        r5 = 0;
        r5 = (android.widget.TextView) r5;
        if (r5 == 0) goto L_0x016a;
        r5.setText(r8);
        r6 = (android.support.design.widget.AppBarLayout) r6;
        if (r12 != r1) goto L_0x0182;
        r5 = r4.c();
        if (r11 >= 0) goto L_0x0176;
        if (r5 == 0) goto L_0x017f;
        if (r11 <= 0) goto L_0x0182;
        r6 = r6.c();
        r6 = -r6;
        if (r5 != r6) goto L_0x0182;
        defpackage.kb.c(r7);
        return;
        r5 = new ajxt;
        r6 = "null cannot be cast to non-null type com.snap.ui.recycling.adapter.ViewModelAdapter";
        r5.<init>(r6);
        throw r5;
        r5 = new ajxt;
        r6 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager";
        r5.<init>(r6);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.component.header.SnapSubscreenHeaderBehavior.a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int, int, int):void");
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        akcr.b(coordinatorLayout, "coordinatorLayout");
        akcr.b(view, "child");
        akcr.b(view2, "directTargetChild");
        akcr.b(view3, "target");
        return i == 2;
    }

    public final boolean a_(View view) {
        System.out.println("layoutDependsOn");
        return view instanceof RecyclerView;
    }
}
