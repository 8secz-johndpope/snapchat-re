package com.snap.spectacles.lib.fragments;

import android.view.View.OnClickListener;
import android.widget.TextView;
import com.snap.ui.deck.MainPageFragment;
import defpackage.akcr;
import defpackage.zjq;

public final class SpectaclesOnboardingSubFragment extends MainPageFragment implements zjq {
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private a e;
    private OnClickListener f;
    private boolean g;
    private boolean h;

    public enum a {
        TAKE_VIDEO,
        TAKE_PHOTO,
        CHARGING,
        CHECK_BATTERY,
        MEMORIES
    }

    public SpectaclesOnboardingSubFragment() {
        this.e = a.TAKE_VIDEO;
        this.h = true;
    }

    private SpectaclesOnboardingSubFragment(a aVar, OnClickListener onClickListener, boolean z, boolean z2) {
        akcr.b(aVar, "type");
        this();
        this.e = aVar;
        this.f = onClickListener;
        this.g = z;
        this.h = z2;
    }

    public /* synthetic */ SpectaclesOnboardingSubFragment(a aVar, OnClickListener onClickListener, boolean z, boolean z2, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        this(aVar, onClickListener, z, z2);
    }

    public final long S_() {
        return -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:122:0x01c3 in {18, 21, 24, 27, 30, 32, 33, 36, 39, 42, 45, 48, 51, 56, 57, 60, 61, 64, 67, 70, 73, 76, 81, 84, 87, 90, 93, 96, 99, 102, 105, 108, 110, 111, 112, 113, 115, 117, 119, 121} preds:[]
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
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
        r6 = this;
        r9 = "inflater";
        defpackage.akcr.b(r7, r9);
        r9 = 0;
        r0 = 2131559121; // 0x7f0d02d1 float:1.8743577E38 double:1.053130134E-314;
        r7 = r7.inflate(r0, r8, r9);
        r8 = 2131429380; // 0x7f0b0804 float:1.8480431E38 double:1.053066033E-314;
        r8 = r7.findViewById(r8);
        r0 = "null cannot be cast to non-null type android.widget.TextView";
        if (r8 == 0) goto L_0x01bd;
        r8 = (android.widget.TextView) r8;
        r6.a = r8;
        r8 = 2131429376; // 0x7f0b0800 float:1.8480423E38 double:1.053066031E-314;
        r8 = r7.findViewById(r8);
        if (r8 == 0) goto L_0x01b7;
        r8 = (android.widget.TextView) r8;
        r6.b = r8;
        r8 = 2131429379; // 0x7f0b0803 float:1.848043E38 double:1.0530660327E-314;
        r8 = r7.findViewById(r8);
        if (r8 == 0) goto L_0x01b1;
        r8 = (android.widget.TextView) r8;
        r6.c = r8;
        r8 = 2131429377; // 0x7f0b0801 float:1.8480425E38 double:1.0530660317E-314;
        r8 = r7.findViewById(r8);
        if (r8 == 0) goto L_0x01ab;
        r8 = (android.widget.TextView) r8;
        r6.d = r8;
        r8 = r6.e;
        r0 = defpackage.xle.a;
        r8 = r8.ordinal();
        r8 = r0[r8];
        r0 = 1;
        r1 = "titleTextView";
        r2 = 8;
        r3 = "descriptionTextView";
        r4 = "doneButton";
        r5 = "nextButton";
        if (r8 == r0) goto L_0x0170;
        r0 = 2;
        if (r8 == r0) goto L_0x011b;
        r0 = 3;
        if (r8 == r0) goto L_0x00d6;
        r0 = 4;
        if (r8 == r0) goto L_0x00a1;
        r0 = 5;
        if (r8 == r0) goto L_0x0068;
        goto L_0x01aa;
        r8 = r6.a;
        if (r8 != 0) goto L_0x006f;
        defpackage.akcr.a(r1);
        r0 = 2131889818; // 0x7f120e9a float:1.941431E38 double:1.05329352E-314;
        r8.setText(r0);
        r8 = r6.b;
        if (r8 != 0) goto L_0x007c;
        defpackage.akcr.a(r3);
        r0 = 2131889817; // 0x7f120e99 float:1.9414308E38 double:1.0532935193E-314;
        r8.setText(r0);
        r8 = r6.d;
        if (r8 != 0) goto L_0x0089;
        defpackage.akcr.a(r4);
        r0 = r6.f;
        r8.setOnClickListener(r0);
        r8 = r6.d;
        if (r8 != 0) goto L_0x0095;
        defpackage.akcr.a(r4);
        r8.setVisibility(r9);
        r8 = r6.c;
        if (r8 != 0) goto L_0x01a7;
        defpackage.akcr.a(r5);
        goto L_0x01a7;
        r8 = r6.a;
        if (r8 != 0) goto L_0x00a8;
        defpackage.akcr.a(r1);
        r0 = 2131886521; // 0x7f1201b9 float:1.9407623E38 double:1.053291891E-314;
        r8.setText(r0);
        r8 = r6.b;
        if (r8 != 0) goto L_0x00b5;
        defpackage.akcr.a(r3);
        r0 = 2131886520; // 0x7f1201b8 float:1.9407621E38 double:1.0532918904E-314;
        r8.setText(r0);
        r8 = r6.d;
        if (r8 != 0) goto L_0x00c2;
        defpackage.akcr.a(r4);
        r0 = r6.f;
        r8.setOnClickListener(r0);
        r8 = r6.d;
        if (r8 != 0) goto L_0x00ce;
        defpackage.akcr.a(r4);
        r8.setVisibility(r9);
        r8 = r6.c;
        if (r8 != 0) goto L_0x01a7;
        goto L_0x009c;
        r8 = r6.a;
        if (r8 != 0) goto L_0x00dd;
        defpackage.akcr.a(r1);
        r0 = 2131886627; // 0x7f120223 float:1.9407838E38 double:1.053291943E-314;
        r8.setText(r0);
        r8 = r6.h;
        if (r8 == 0) goto L_0x00f2;
        r8 = r6.b;
        if (r8 != 0) goto L_0x00ee;
        defpackage.akcr.a(r3);
        r0 = 2131886625; // 0x7f120221 float:1.9407834E38 double:1.053291942E-314;
        goto L_0x00fc;
        r8 = r6.b;
        if (r8 != 0) goto L_0x00f9;
        defpackage.akcr.a(r3);
        r0 = 2131886626; // 0x7f120222 float:1.9407836E38 double:1.0532919427E-314;
        r8.setText(r0);
        r8 = r6.c;
        if (r8 != 0) goto L_0x0106;
        defpackage.akcr.a(r5);
        r0 = r6.f;
        r8.setOnClickListener(r0);
        r8 = r6.c;
        if (r8 != 0) goto L_0x0112;
        defpackage.akcr.a(r5);
        r8.setVisibility(r9);
        r8 = r6.d;
        if (r8 != 0) goto L_0x01a7;
        goto L_0x01a4;
        r8 = r6.a;
        if (r8 != 0) goto L_0x0122;
        defpackage.akcr.a(r1);
        r0 = 2131890157; // 0x7f120fed float:1.9414998E38 double:1.0532936873E-314;
        r8.setText(r0);
        r8 = r6.b;
        if (r8 != 0) goto L_0x012f;
        defpackage.akcr.a(r3);
        r0 = 2131890156; // 0x7f120fec float:1.9414996E38 double:1.053293687E-314;
        r8.setText(r0);
        r8 = r6.g;
        if (r8 == 0) goto L_0x0155;
        r8 = r6.d;
        if (r8 != 0) goto L_0x0140;
        defpackage.akcr.a(r4);
        r0 = r6.f;
        r8.setOnClickListener(r0);
        r8 = r6.d;
        if (r8 != 0) goto L_0x014c;
        defpackage.akcr.a(r4);
        r8.setVisibility(r9);
        r8 = r6.c;
        if (r8 != 0) goto L_0x01a7;
        goto L_0x009c;
        r8 = r6.c;
        if (r8 != 0) goto L_0x015c;
        defpackage.akcr.a(r5);
        r0 = r6.f;
        r8.setOnClickListener(r0);
        r8 = r6.c;
        if (r8 != 0) goto L_0x0168;
        defpackage.akcr.a(r5);
        r8.setVisibility(r9);
        r8 = r6.d;
        if (r8 != 0) goto L_0x01a7;
        goto L_0x01a4;
        r8 = r6.a;
        if (r8 != 0) goto L_0x0177;
        defpackage.akcr.a(r1);
        r0 = 2131890155; // 0x7f120feb float:1.9414994E38 double:1.0532936863E-314;
        r8.setText(r0);
        r8 = r6.b;
        if (r8 != 0) goto L_0x0184;
        defpackage.akcr.a(r3);
        r0 = 2131890154; // 0x7f120fea float:1.9414992E38 double:1.053293686E-314;
        r8.setText(r0);
        r8 = r6.c;
        if (r8 != 0) goto L_0x0191;
        defpackage.akcr.a(r5);
        r0 = r6.f;
        r8.setOnClickListener(r0);
        r8 = r6.c;
        if (r8 != 0) goto L_0x019d;
        defpackage.akcr.a(r5);
        r8.setVisibility(r9);
        r8 = r6.d;
        if (r8 != 0) goto L_0x01a7;
        defpackage.akcr.a(r4);
        r8.setVisibility(r2);
        return r7;
        r7 = new ajxt;
        r7.<init>(r0);
        throw r7;
        r7 = new ajxt;
        r7.<init>(r0);
        throw r7;
        r7 = new ajxt;
        r7.<init>(r0);
        throw r7;
        r7 = new ajxt;
        r7.<init>(r0);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
