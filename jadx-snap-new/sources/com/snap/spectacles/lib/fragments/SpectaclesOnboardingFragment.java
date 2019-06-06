package com.snap.spectacles.lib.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.spectacles.api.SpectaclesFragment;
import com.snap.ui.view.LoadingSpinnerView;
import defpackage.abcv;
import defpackage.acgu;
import defpackage.achb;
import defpackage.achg;
import defpackage.acis;
import defpackage.akcr;
import defpackage.xai;
import defpackage.xmj;
import defpackage.xna;
import defpackage.zjk;
import defpackage.zjm;

public final class SpectaclesOnboardingFragment extends SpectaclesFragment implements xmj {
    static final zjm e = new zjm(xai.f, "SpectaclesOnboardingFragment", false, false, false, false, null, false, false, false, false, null, 4092);
    public static final acgu<zjm> f;
    public static final acgu<zjm> g;
    public xna a;
    public achb<zjm, zjk> b;
    private LoadingSpinnerView h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static SpectaclesOnboardingFragment a(String str, String str2, String str3) {
            akcr.b(str, "deviceSerialNumber");
            akcr.b(str2, "onboardingName");
            Bundle bundle = new Bundle();
            bundle.putString("ARG_KEY_DEVICE_SERIAL_NUMBER", str);
            bundle.putString("ARG_KEY_ONBOARDING_NAME", str2);
            bundle.putString("ARG_KEY_PAIRING_SESSION_ID", str3);
            SpectaclesOnboardingFragment spectaclesOnboardingFragment = new SpectaclesOnboardingFragment();
            spectaclesOnboardingFragment.setArguments(bundle);
            return spectaclesOnboardingFragment;
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ SpectaclesOnboardingFragment a;

        b(SpectaclesOnboardingFragment spectaclesOnboardingFragment) {
            this.a = spectaclesOnboardingFragment;
        }

        public final void onClick(View view) {
            this.a.h().a(abcv.BACK_BUTTON);
            this.a.h().c();
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ SpectaclesOnboardingFragment a;

        c(SpectaclesOnboardingFragment spectaclesOnboardingFragment) {
            this.a = spectaclesOnboardingFragment;
        }

        public final void onClick(View view) {
            this.a.h().a(abcv.DONE_BUTTON);
            this.a.h().c();
        }
    }

    static final class d implements OnClickListener {
        private /* synthetic */ ViewPager a;

        d(ViewPager viewPager) {
            this.a = viewPager;
        }

        public final void onClick(View view) {
            int b = this.a.b();
            if (b < this.a.getChildCount() - 1) {
                this.a.a(b + 1, true);
            }
        }
    }

    static {
        a aVar = new a();
        acgu a = acgu.a(acis.d, (achg) e, true);
        f = a;
        g = a.j();
    }

    public final xna h() {
        xna xna = this.a;
        if (xna == null) {
            akcr.a("onboardingPresenter");
        }
        return xna;
    }

    public final void i() {
        achb achb = this.b;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achb.a((achg) xai.a, false, false, null);
    }

    public final boolean o_() {
        xna xna = this.a;
        if (xna == null) {
            akcr.a("onboardingPresenter");
        }
        xna.c();
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        String str = "onboardingPresenter";
        if (arguments != null) {
            xna xna = this.a;
            if (xna == null) {
                akcr.a(str);
            }
            Object string = arguments.getString("ARG_KEY_DEVICE_SERIAL_NUMBER");
            akcr.a(string, "it.getString(ARG_KEY_DEVICE_SERIAL_NUMBER)");
            String str2 = "<set-?>";
            akcr.b(string, str2);
            xna.d = string;
            xna = this.a;
            if (xna == null) {
                akcr.a(str);
            }
            string = arguments.getString("ARG_KEY_ONBOARDING_NAME");
            akcr.a(string, "it.getString(ARG_KEY_ONBOARDING_NAME)");
            akcr.b(string, str2);
            xna.f = string;
            xna = this.a;
            if (xna == null) {
                akcr.a(str);
            }
            xna.g = arguments.getString("ARG_KEY_PAIRING_SESSION_ID");
        }
        xna xna2 = this.a;
        if (xna2 == null) {
            akcr.a(str);
        }
        xna2.takeTarget((xmj) this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:77:0x0240 in {14, 19, 21, 24, 32, 35, 38, 39, 40, 43, 46, 52, 53, 56, 59, 62, 64, 66, 68, 70, 72, 74, 76} preds:[]
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
    public final android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = "inflater";
        defpackage.akcr.b(r1, r2);
        r2 = 0;
        r3 = 2131559122; // 0x7f0d02d2 float:1.874358E38 double:1.0531301343E-314;
        r4 = r20;
        r1 = r1.inflate(r3, r4, r2);
        r3 = 2131429387; // 0x7f0b080b float:1.8480445E38 double:1.0530660367E-314;
        r3 = r1.findViewById(r3);
        if (r3 == 0) goto L_0x0238;
        r3 = (android.support.v4.view.ViewPager) r3;
        r4 = 2131429381; // 0x7f0b0805 float:1.8480433E38 double:1.0530660337E-314;
        r4 = r1.findViewById(r4);
        r5 = "null cannot be cast to non-null type com.snap.opera.shared.view.TextureVideoView";
        if (r4 == 0) goto L_0x0232;
        r4 = (com.snap.opera.shared.view.TextureVideoView) r4;
        r6 = 2131429382; // 0x7f0b0806 float:1.8480435E38 double:1.053066034E-314;
        r6 = r1.findViewById(r6);
        if (r6 == 0) goto L_0x022c;
        r6 = (com.snap.opera.shared.view.TextureVideoView) r6;
        r7 = 2131429383; // 0x7f0b0807 float:1.8480437E38 double:1.0530660347E-314;
        r7 = r1.findViewById(r7);
        if (r7 == 0) goto L_0x0226;
        r7 = (com.snap.opera.shared.view.TextureVideoView) r7;
        r8 = 2131429384; // 0x7f0b0808 float:1.848044E38 double:1.053066035E-314;
        r8 = r1.findViewById(r8);
        if (r8 == 0) goto L_0x0220;
        r8 = (com.snap.opera.shared.view.TextureVideoView) r8;
        r4 = com.google.common.collect.ImmutableList.of(r4, r6, r7, r8);
        r5 = 2131429385; // 0x7f0b0809 float:1.8480441E38 double:1.0530660357E-314;
        r5 = r1.findViewById(r5);
        if (r5 == 0) goto L_0x0218;
        r5 = (com.snap.ui.view.LoadingSpinnerView) r5;
        r0.h = r5;
        r5 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingFragment$c;
        r5.<init>(r0);
        r8 = r5;
        r8 = (android.view.View.OnClickListener) r8;
        r5 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingFragment$b;
        r5.<init>(r0);
        r5 = (android.view.View.OnClickListener) r5;
        r6 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingFragment$d;
        r6.<init>(r3);
        r6 = (android.view.View.OnClickListener) r6;
        r7 = r0.a;
        r15 = "onboardingPresenter";
        if (r7 != 0) goto L_0x007c;
        defpackage.akcr.a(r15);
        r7 = r7.g;
        if (r7 != 0) goto L_0x009a;
        r7 = 2131429375; // 0x7f0b07ff float:1.848042E38 double:1.0530660307E-314;
        r7 = r1.findViewById(r7);
        if (r7 == 0) goto L_0x0092;
        r7 = (android.widget.ImageView) r7;
        r7.setOnClickListener(r5);
        r7.setVisibility(r2);
        goto L_0x009a;
        r1 = new ajxt;
        r2 = "null cannot be cast to non-null type android.widget.ImageView";
        r1.<init>(r2);
        throw r1;
        r5 = r0.a;
        if (r5 != 0) goto L_0x00a1;
        defpackage.akcr.a(r15);
        r5 = r5.b();
        r7 = r5.hashCode();
        r9 = -1110253034; // 0xffffffffbdd2e216 float:-0.10297029 double:NaN;
        r14 = "ImmutableList.of(\n      …doneButtonClickListener))";
        if (r7 == r9) goto L_0x00d6;
        r9 = -507788400; // 0xffffffffe1bbc390 float:-4.329541E20 double:NaN;
        if (r7 == r9) goto L_0x00b7;
        r2 = r14;
        goto L_0x010d;
        r7 = "photo_mode";
        r5 = r5.equals(r7);
        if (r5 == 0) goto L_0x00b5;
        r5 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment;
        r7 = com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment.a.TAKE_PHOTO;
        r9 = 1;
        r10 = 0;
        r11 = 8;
        r6 = r5;
        r6.<init>(r7, r8, r9, r10, r11);
        r5 = com.google.common.collect.ImmutableList.of(r5);
        r6 = "ImmutableList.of(\n      …ttonClickListener, true))";
        defpackage.akcr.a(r5, r6);
        goto L_0x015d;
        r7 = "laguna";
        r5 = r5.equals(r7);
        if (r5 == 0) goto L_0x00b5;
        r5 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment;
        r10 = com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment.a.TAKE_VIDEO;
        r12 = 0;
        r13 = 0;
        r7 = 12;
        r9 = r5;
        r11 = r6;
        r2 = r14;
        r14 = r7;
        r9.<init>(r10, r11, r12, r13, r14);
        r7 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment;
        r10 = com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment.a.CHECK_BATTERY;
        r14 = 12;
        r9 = r7;
        r9.<init>(r10, r11, r12, r13, r14);
        r12 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment;
        r9 = com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment.a.CHARGING;
        r10 = 0;
        r11 = 0;
        r13 = 12;
        r6 = r12;
        r14 = r7;
        r7 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r13;
        r6.<init>(r7, r8, r9, r10, r11);
        r5 = com.google.common.collect.ImmutableList.of(r5, r14, r12);
        goto L_0x015a;
        r5 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment;
        r10 = com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment.a.TAKE_VIDEO;
        r12 = 0;
        r13 = 0;
        r14 = 12;
        r9 = r5;
        r11 = r6;
        r9.<init>(r10, r11, r12, r13, r14);
        r7 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment;
        r10 = com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment.a.TAKE_PHOTO;
        r9 = r7;
        r9.<init>(r10, r11, r12, r13, r14);
        r14 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment;
        r10 = com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment.a.CHECK_BATTERY;
        r9 = r0.a;
        if (r9 != 0) goto L_0x012d;
        defpackage.akcr.a(r15);
        r9 = r9.b();
        r11 = "malibu-2";
        r13 = defpackage.akcr.a(r9, r11);
        r16 = 4;
        r9 = r14;
        r11 = r6;
        r6 = r14;
        r14 = r16;
        r9.<init>(r10, r11, r12, r13, r14);
        r12 = new com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment;
        r9 = com.snap.spectacles.lib.fragments.SpectaclesOnboardingSubFragment.a.MEMORIES;
        r10 = 0;
        r11 = 0;
        r13 = 12;
        r14 = r6;
        r6 = r12;
        r17 = r7;
        r7 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r13;
        r6.<init>(r7, r8, r9, r10, r11);
        r6 = r17;
        r5 = com.google.common.collect.ImmutableList.of(r5, r6, r14, r12);
        defpackage.akcr.a(r5, r2);
        r5 = (java.util.List) r5;
        r2 = r0.a;
        if (r2 != 0) goto L_0x0166;
        defpackage.akcr.a(r15);
        r6 = new java.util.ArrayList;
        r6.<init>();
        r6 = (java.util.List) r6;
        r7 = r2.f;
        r8 = "onboardingName";
        if (r7 != 0) goto L_0x0176;
        defpackage.akcr.a(r8);
        r7 = defpackage.xqa.b(r7);
        r7 = r7.iterator();
        r9 = r7.hasNext();
        if (r9 == 0) goto L_0x0199;
        r9 = r7.next();
        r9 = (java.lang.String) r9;
        r10 = r2.f;
        if (r10 != 0) goto L_0x0191;
        defpackage.akcr.a(r8);
        r9 = defpackage.xqd.b(r10, r9);
        r6.add(r9);
        goto L_0x017e;
        r2 = r6;
        r2 = (java.util.Collection) r2;
        r2 = r2.size();
        r7 = 0;
        if (r7 >= r2) goto L_0x01bf;
        r8 = r4.get(r7);
        r8 = (com.snap.opera.shared.view.TextureVideoView) r8;
        r9 = r6.get(r7);
        r9 = (android.net.Uri) r9;
        r8.a(r9);
        r8.j();
        r9 = 1;
        r8.d(r9);
        r8.start();
        r7 = r7 + 1;
        goto L_0x01a1;
        r2 = r0.a;
        if (r2 != 0) goto L_0x01c6;
        defpackage.akcr.a(r15);
        r6 = r2.c;
        r7 = new xna$c;
        r7.<init>(r2);
        r7 = (java.util.concurrent.Callable) r7;
        r7 = defpackage.ajcx.b(r7);
        r2 = r2.a();
        r2 = r2.f();
        r2 = (defpackage.ajdw) r2;
        r2 = r7.b(r2);
        r2 = r2.e();
        r6.a(r2);
        r2 = new xlf;
        r6 = r18.getChildFragmentManager();
        r7 = "childFragmentManager";
        defpackage.akcr.a(r6, r7);
        r7 = "videoViewList";
        defpackage.akcr.a(r4, r7);
        r4 = (java.util.List) r4;
        r7 = r0.a;
        if (r7 != 0) goto L_0x0201;
        defpackage.akcr.a(r15);
        r2.<init>(r6, r5, r4, r7);
        r4 = r2;
        r4 = (android.support.v4.view.ViewPager.e) r4;
        r3.a(r4);
        r2 = (defpackage.jz) r2;
        r3.a(r2);
        r2 = 0;
        r3.b(r2);
        r2 = 2;
        r3.c(r2);
        return r1;
        r1 = new ajxt;
        r2 = "null cannot be cast to non-null type com.snap.ui.view.LoadingSpinnerView";
        r1.<init>(r2);
        throw r1;
        r1 = new ajxt;
        r1.<init>(r5);
        throw r1;
        r1 = new ajxt;
        r1.<init>(r5);
        throw r1;
        r1 = new ajxt;
        r1.<init>(r5);
        throw r1;
        r1 = new ajxt;
        r1.<init>(r5);
        throw r1;
        r1 = new ajxt;
        r2 = "null cannot be cast to non-null type android.support.v4.view.ViewPager";
        r1.<init>(r2);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesOnboardingFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        super.onDetach();
        xna xna = this.a;
        if (xna == null) {
            akcr.a("onboardingPresenter");
        }
        xna.dropTarget();
    }
}
