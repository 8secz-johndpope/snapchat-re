package com.snap.spectacles.lib.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import com.snap.imageloading.view.SnapImageView;
import com.snap.spectacles.api.SpectaclesFragment;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.ae;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.af;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.aq;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.ar;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.av;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.aw;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.ax;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.q;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.t;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter.u;
import com.snap.spectacles.lib.fragments.recyclerview.SpectaclesSettingsLayoutManager;
import com.snap.ui.view.button.ScButton;
import com.snapchat.android.R;
import defpackage.aage;
import defpackage.aagm;
import defpackage.acgu;
import defpackage.acgv;
import defpackage.achb;
import defpackage.achd;
import defpackage.achi;
import defpackage.acig;
import defpackage.acip;
import defpackage.aipx;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfl;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.fth;
import defpackage.gvl;
import defpackage.ifu;
import defpackage.jwl;
import defpackage.jwv;
import defpackage.ncd;
import defpackage.tge;
import defpackage.xai;
import defpackage.xdb;
import defpackage.xjd;
import defpackage.xll;
import defpackage.xlm;
import defpackage.xml;
import defpackage.zgy;
import defpackage.ziv;
import defpackage.zjf;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zmh;
import java.util.concurrent.Callable;
import net.sqlcipher.database.SQLiteDatabase;

public final class SpectaclesSettingsFragment extends SpectaclesFragment implements xml {
    static final Uri g = Uri.parse("market://details?id=com.snapchat.android");
    public SpectaclesSettingsPresenter a;
    public achb<zjm, zjk> b;
    public gvl e;
    boolean f;
    private View h;
    private View i;
    private View j;
    private SnapImageView k;
    private RecyclerView l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ SpectaclesSettingsFragment a;
        private /* synthetic */ ScButton b;

        c(SpectaclesSettingsFragment spectaclesSettingsFragment, ScButton scButton) {
            this.a = spectaclesSettingsFragment;
            this.b = scButton;
        }

        public final void onClick(View view) {
            if (!this.a.f) {
                this.a.f = true;
                this.b.setEnabled(false);
                SpectaclesSettingsPresenter h = this.a.h();
                h.q = true;
                ajei ajei = h.g;
                ncd ncd = h.v;
                Context context = h.u;
                if (context != null) {
                    ajei.a(ncd.a((Activity) context, ifu.SPECTACLES_PAIR_START, true).a((ajfl) av.a).a((ajfb) aw.a).d((ajfb) new ax(h)));
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    static final class d implements OnClickListener {
        private /* synthetic */ SpectaclesSettingsFragment a;
        private /* synthetic */ ScButton b;

        d(SpectaclesSettingsFragment spectaclesSettingsFragment, ScButton scButton) {
            this.a = spectaclesSettingsFragment;
            this.b = scButton;
        }

        public final void onClick(View view) {
            if (!this.a.f) {
                this.a.f = true;
                this.b.setEnabled(false);
                this.b.setText(this.a.getString(R.string.spectacles_pairing_restriction_button_enabling));
                SpectaclesSettingsPresenter h = this.a.h();
                h.g.a(ajcx.b((Callable) new q(h)).b((ajdw) h.b().f()).e());
            }
        }
    }

    public static final class b implements defpackage.jxj.a {
        private /* synthetic */ SpectaclesSettingsFragment a;

        b(SpectaclesSettingsFragment spectaclesSettingsFragment) {
            this.a = spectaclesSettingsFragment;
        }

        public final void onFailure(jwl jwl) {
            akcr.b(jwl, "failureReason");
            SpectaclesSettingsFragment.a(this.a).setVisibility(8);
        }

        public final void onImageReady(jwv jwv) {
            akcr.b(jwv, "metrics");
            SpectaclesSettingsFragment.a(this.a).setVisibility(0);
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbl<View, ajxw> {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbl<View, ajxw> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class h extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesSettingsFragment a;

        h(SpectaclesSettingsFragment spectaclesSettingsFragment) {
            this.a = spectaclesSettingsFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            Context context = this.a.getContext();
            Intent intent = new Intent("android.intent.action.VIEW", SpectaclesSettingsFragment.g);
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent);
            return ajxw.a;
        }
    }

    static final class i extends akcs implements akbl<View, ajxw> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesSettingsFragment a;

        j(SpectaclesSettingsFragment spectaclesSettingsFragment) {
            this.a = spectaclesSettingsFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().a(false, false);
            return ajxw.a;
        }
    }

    static final class k extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesSettingsFragment a;

        k(SpectaclesSettingsFragment spectaclesSettingsFragment) {
            this.a = spectaclesSettingsFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().a(true, false);
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public final long S_() {
        SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
        if (spectaclesSettingsPresenter == null) {
            akcr.a("settingsPresenter");
        }
        return spectaclesSettingsPresenter.q ? -1 : 0;
    }

    public final void a(int i, String str) {
        akcr.b(str, "url");
        Context context = getContext();
        achb achb = this.b;
        String str2 = "navigationHost";
        if (achb == null) {
            akcr.a(str2);
        }
        xlm xlm = new xlm(context, achb, b(), new xll(i, str, false));
        achb achb2 = this.b;
        if (achb2 == null) {
            akcr.a(str2);
        }
        achb2.a((achd) xlm, xlm.p, null);
    }

    public final void a(String str) {
        String string = getResources().getString(R.string.spectacles_settings_connect_failed_title);
        String string2 = getResources().getString(R.string.spectacles_settings_connect_failed_updating_desc, new Object[]{str});
        zjm zjm = new zjm(xai.f, "spectacles_already_updating_error", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.b;
        String str2 = "navigationHost";
        if (achb == null) {
            akcr.a(str2);
        }
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, achb, zjm, false, null, 16);
        akcr.a((Object) string, "title");
        defpackage.zgy.a a = aVar.a(string);
        akcr.a((Object) string2, "description");
        zgy a2 = a.b(string2).a((int) R.string.okay, (akbl) f.a, true).a();
        achb achb2 = this.b;
        if (achb2 == null) {
            akcr.a(str2);
        }
        achb2.a((achd) a2, a2.a, null);
    }

    public final void a(String str, String str2) {
        akcr.b(str, "serialNumber");
        akcr.b(str2, "onboardingName");
        zjf zjf = new zjf(SpectaclesOnboardingFragment.e, com.snap.spectacles.lib.fragments.SpectaclesOnboardingFragment.a.a(str, str2, null), acgv.a().a(SpectaclesOnboardingFragment.g).a());
        achb achb = this.b;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achd achd = zjf;
        acgu acgu = SpectaclesOnboardingFragment.f;
        akcr.a((Object) acgu, "SpectaclesOnboardingFrag…PECTACLES_PRESENT_DEFAULT");
        achb.a(achd, acgu, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:87:0x0170 in {4, 7, 8, 11, 12, 17, 20, 25, 30, 33, 36, 37, 39, 41, 43, 46, 49, 50, 53, 56, 61, 66, 69, 74, 75, 78, 80, 82, 84, 86} preds:[]
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
    public final void a(java.util.List<? extends defpackage.xdb> r10, java.util.List<defpackage.xli> r11, boolean r12, boolean r13, boolean r14) {
        /*
        r9 = this;
        r0 = "deviceList";
        defpackage.akcr.b(r10, r0);
        r0 = "releaseNoteList";
        defpackage.akcr.b(r11, r0);
        r10 = r10.isEmpty();
        r11 = "pairNewDeviceSection";
        r0 = 8;
        r1 = 0;
        if (r10 == 0) goto L_0x0045;
        r10 = r9.i;
        if (r10 != 0) goto L_0x001c;
        defpackage.akcr.a(r11);
        r10.setVisibility(r1);
        r10 = r9.k;
        if (r10 != 0) goto L_0x0028;
        r2 = "pairingImageView";
        defpackage.akcr.a(r2);
        r2 = r9.getContext();
        r2 = defpackage.abtp.i(r2);
        r3 = "ViewUtils.getDpiSuffix(context)";
        defpackage.akcr.a(r2, r3);
        r3 = "spectacles_pairing_confirm_graphic";
        r2 = defpackage.xqd.a(r2, r3);
        r3 = defpackage.xai.a;
        r3 = r3.d;
        r3 = r3.b;
        r10.setImageUri(r2, r3);
        goto L_0x004f;
        r10 = r9.i;
        if (r10 != 0) goto L_0x004c;
        defpackage.akcr.a(r11);
        r10.setVisibility(r0);
        r10 = "null cannot be cast to non-null type com.snap.ui.view.button.ScButton";
        r2 = 1;
        r3 = 2131889905; // 0x7f120ef1 float:1.9414487E38 double:1.053293563E-314;
        r4 = 2131430363; // 0x7f0b0bdb float:1.8482425E38 double:1.053066519E-314;
        r5 = 2131430365; // 0x7f0b0bdd float:1.8482429E38 double:1.05306652E-314;
        r6 = 2131430366; // 0x7f0b0bde float:1.848243E38 double:1.0530665203E-314;
        r7 = "null cannot be cast to non-null type android.widget.TextView";
        r8 = "restrictionView";
        if (r12 != 0) goto L_0x00db;
        r12 = r9.j;
        if (r12 != 0) goto L_0x006b;
        defpackage.akcr.a(r8);
        r12.setVisibility(r1);
        r12 = r9.j;
        if (r12 != 0) goto L_0x0075;
        defpackage.akcr.a(r8);
        r12 = r12.findViewById(r6);
        if (r12 == 0) goto L_0x00d5;
        r12 = (android.widget.TextView) r12;
        r13 = 2131889903; // 0x7f120eef float:1.9414483E38 double:1.053293562E-314;
        r12.setText(r13);
        r12 = r9.j;
        if (r12 != 0) goto L_0x008a;
        defpackage.akcr.a(r8);
        r12 = r12.findViewById(r5);
        if (r12 == 0) goto L_0x00cf;
        r12 = (android.widget.TextView) r12;
        r13 = 2131889902; // 0x7f120eee float:1.941448E38 double:1.0532935613E-314;
        r12.setText(r13);
        r12 = r9.i;
        if (r12 != 0) goto L_0x009f;
        defpackage.akcr.a(r11);
        r12.setVisibility(r0);
        r9.f = r1;
        r11 = r9.j;
        if (r11 != 0) goto L_0x00ab;
        defpackage.akcr.a(r8);
        r11 = r11.findViewById(r4);
        if (r11 == 0) goto L_0x00c9;
        r11 = (com.snap.ui.view.button.ScButton) r11;
        r10 = r9.getString(r3);
        r11.setText(r10);
        r11.setEnabled(r2);
        r10 = new com.snap.spectacles.lib.fragments.SpectaclesSettingsFragment$c;
        r10.<init>(r9, r11);
        r10 = (android.view.View.OnClickListener) r10;
        r11.setOnClickListener(r10);
        goto L_0x0151;
        r11 = new ajxt;
        r11.<init>(r10);
        throw r11;
        r10 = new ajxt;
        r10.<init>(r7);
        throw r10;
        r10 = new ajxt;
        r10.<init>(r7);
        throw r10;
        if (r13 != 0) goto L_0x00eb;
        if (r14 != 0) goto L_0x00e0;
        goto L_0x00eb;
        r10 = r9.j;
        if (r10 != 0) goto L_0x00e7;
        defpackage.akcr.a(r8);
        r10.setVisibility(r0);
        goto L_0x0151;
        r12 = r9.j;
        if (r12 != 0) goto L_0x00f2;
        defpackage.akcr.a(r8);
        r12.setVisibility(r1);
        r12 = r9.j;
        if (r12 != 0) goto L_0x00fc;
        defpackage.akcr.a(r8);
        r12 = r12.findViewById(r6);
        if (r12 == 0) goto L_0x016a;
        r12 = (android.widget.TextView) r12;
        r14 = 2131889890; // 0x7f120ee2 float:1.9414456E38 double:1.0532935554E-314;
        r12.setText(r14);
        r12 = r9.j;
        if (r12 != 0) goto L_0x0111;
        defpackage.akcr.a(r8);
        r12 = r12.findViewById(r5);
        if (r12 == 0) goto L_0x0164;
        r12 = (android.widget.TextView) r12;
        r14 = 2131889889; // 0x7f120ee1 float:1.9414454E38 double:1.053293555E-314;
        r12.setText(r14);
        r12 = r9.i;
        if (r12 != 0) goto L_0x0126;
        defpackage.akcr.a(r11);
        r12.setVisibility(r0);
        r9.f = r1;
        r11 = r9.j;
        if (r11 != 0) goto L_0x0132;
        defpackage.akcr.a(r8);
        r11 = r11.findViewById(r4);
        if (r11 == 0) goto L_0x015e;
        r11 = (com.snap.ui.view.button.ScButton) r11;
        r10 = r9.getString(r3);
        r11.setText(r10);
        r11.setEnabled(r2);
        if (r13 == 0) goto L_0x014a;
        r11.setVisibility(r0);
        goto L_0x0151;
        r10 = new com.snap.spectacles.lib.fragments.SpectaclesSettingsFragment$d;
        r10.<init>(r9, r11);
        goto L_0x00c2;
        r10 = r9.h;
        if (r10 != 0) goto L_0x015a;
        r11 = "rootView";
        defpackage.akcr.a(r11);
        r10.setVisibility(r1);
        return;
        r11 = new ajxt;
        r11.<init>(r10);
        throw r11;
        r10 = new ajxt;
        r10.<init>(r7);
        throw r10;
        r10 = new ajxt;
        r10.<init>(r7);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesSettingsFragment.a(java.util.List, java.util.List, boolean, boolean, boolean):void");
    }

    public final void a(xdb xdb, com.snap.spectacles.lib.fragments.SpectaclesPairFragment.b bVar) {
        akcr.b(bVar, "pairFragmentCaller");
        if (isVisible()) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
            if (spectaclesSettingsPresenter == null) {
                akcr.a("settingsPresenter");
            }
            if (!spectaclesSettingsPresenter.b.getAndSet(true)) {
                zjm zjm = SpectaclesPairFragment.o;
                String i = xdb != null ? xdb.i() : null;
                akcr.b(bVar, "caller");
                Bundle bundle = new Bundle();
                bundle.putString("ARG_KEY_PAIR_FRAGMENT_CALLER", bVar.toString());
                bundle.putString("ARG_KEY_PRESET_SPECTACLES_PAIRING_CODE_DETECTED_BLE_ADDRESS", i);
                SpectaclesPairFragment spectaclesPairFragment = new SpectaclesPairFragment();
                spectaclesPairFragment.setArguments(bundle);
                zjf zjf = new zjf(zjm, spectaclesPairFragment, acgv.a().a(SpectaclesPairFragment.q).a());
                achb achb = this.b;
                if (achb == null) {
                    akcr.a("navigationHost");
                }
                achd achd = zjf;
                acgu acgu = SpectaclesPairFragment.p;
                akcr.a((Object) acgu, "SpectaclesPairFragment.S…CLES_PAIR_PRESENT_DEFAULT");
                achb.a(achd, acgu, null);
            }
        }
    }

    public final void a(zmh zmh) {
        akcr.b(zmh, "adapter");
        RecyclerView recyclerView = this.l;
        if (recyclerView == null) {
            akcr.a("settingsRecyclerView");
        }
        recyclerView.setAdapter(zmh);
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
        if (spectaclesSettingsPresenter == null) {
            akcr.a("settingsPresenter");
        }
        if ((spectaclesSettingsPresenter.v.a() ^ 1) != 0) {
            spectaclesSettingsPresenter.g();
        }
        spectaclesSettingsPresenter.f.a(ajcx.b((Callable) new af(spectaclesSettingsPresenter)).b((ajdw) spectaclesSettingsPresenter.b().b()).e());
        spectaclesSettingsPresenter.b.set(false);
        if (!spectaclesSettingsPresenter.i) {
            spectaclesSettingsPresenter.u.registerReceiver(spectaclesSettingsPresenter.e, spectaclesSettingsPresenter.a);
            spectaclesSettingsPresenter.i = true;
        }
        spectaclesSettingsPresenter.f.a(ajcx.b((Callable) new t(spectaclesSettingsPresenter)).c((Callable) new u(spectaclesSettingsPresenter)).b((ajdw) spectaclesSettingsPresenter.b().g()).c());
    }

    public final void b(int i, String str) {
        akcr.b(str, "url");
        SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
        String str2 = "settingsPresenter";
        if (spectaclesSettingsPresenter == null) {
            akcr.a(str2);
        }
        Uri uri = null;
        if (spectaclesSettingsPresenter.B.k()) {
            boolean a = spectaclesSettingsPresenter.c().a((fth) xjd.SPECTACLES_SNAP_STORE_ENABLED);
            String j = spectaclesSettingsPresenter.c().j(xjd.SPECTACLES_SNAP_STORE_DEEPLINK);
            if (a && URLUtil.isValidUrl(j)) {
                uri = Uri.parse(j).buildUpon().appendQueryParameter(tge.b.a, aagm.SPECTACLES_BUY.name()).appendQueryParameter(tge.d.a, aage.SPECTACLES_SETTING_CELL.name()).build();
            }
        }
        if (uri != null) {
            ajei ajei = this.d;
            gvl gvl = this.e;
            if (gvl == null) {
                akcr.a("deepLinkDispatcher");
            }
            ajei.a((ajej) gvl.a(uri, false));
            return;
        }
        Object obj = this.a;
        if (obj == null) {
            akcr.a(str2);
        }
        obj.a(obj, (akbl) aq.a);
        a(i, str);
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        Object obj = this.a;
        if (obj == null) {
            akcr.a("settingsPresenter");
        }
        obj.a(obj, (akbl) ar.a);
        obj.h();
        obj.e();
        obj.a().c().d();
        obj.c.dispose();
        obj.f.a();
        obj.C.a(ajcx.b((Callable) new ae(obj)).b((ajdw) obj.b().f()).e());
    }

    public final SpectaclesSettingsPresenter h() {
        SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
        if (spectaclesSettingsPresenter == null) {
            akcr.a("settingsPresenter");
        }
        return spectaclesSettingsPresenter;
    }

    public final void i() {
        String string = getResources().getString(R.string.spectacles_settings_connect_failed_title);
        String string2 = getResources().getString(R.string.spectacles_settings_connect_failed_importing_desc);
        zjm zjm = new zjm(xai.f, "spectacles_already_importing_error", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.b;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, achb, zjm, false, null, 16);
        akcr.a((Object) string, "title");
        defpackage.zgy.a a = aVar.a(string);
        akcr.a((Object) string2, "description");
        zgy a2 = a.b(string2).a((int) R.string.okay, (akbl) e.a, true).a();
        achb achb2 = this.b;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a2, a2.a, null);
    }

    public final void j() {
        String string = getResources().getString(R.string.spectacles_settings_connect_failed_title);
        String string2 = getResources().getString(R.string.spectacles_settings_connect_failed_base_desc);
        zjm zjm = new zjm(xai.f, "spectacles_connection_failed_error", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.b;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, achb, zjm, false, null, 16);
        akcr.a((Object) string, "title");
        defpackage.zgy.a a = aVar.a(string);
        akcr.a((Object) string2, "description");
        zgy a2 = a.b(string2).a((int) R.string.okay, (akbl) g.a, true).a();
        achb achb2 = this.b;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a2, a2.a, null);
    }

    public final void k() {
        if (isVisible()) {
            zjm zjm = new zjm(xai.f, "spectacles_device_not_supported", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context = getContext();
            achb achb = this.b;
            String str = "navigationHost";
            if (achb == null) {
                akcr.a(str);
            }
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.device_not_supported_title).b((int) R.string.device_not_supported_description).a((int) R.string.update_now, (akbl) new h(this), false), (akbl) i.a, true, Integer.valueOf(R.string.cancel), null, null, 24).a();
            achb achb2 = this.b;
            if (achb2 == null) {
                akcr.a(str);
            }
            achb = this.b;
            if (achb == null) {
                akcr.a(str);
            }
            achb2.b((acig) new acip(achb, a, a.a));
        }
    }

    public final void l() {
        a(null, com.snap.spectacles.lib.fragments.SpectaclesPairFragment.b.SETTINGS_REPAIR_FROM_ICON);
    }

    public final void m() {
        zjm zjm = new zjm(xai.f, "spectacles_auto_import_disable_dialog", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.b;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.spectacles_settings_background_import_disable_title).b((int) R.string.spectacles_settings_background_import_disable_desc).a((int) R.string.spectacles_settings_background_import_disable_button, (akbl) new j(this), true), (akbl) new k(this), false, null, null, null, 30).a();
        achb achb2 = this.b;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        aipx.a(this);
        SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
        if (spectaclesSettingsPresenter == null) {
            akcr.a("settingsPresenter");
        }
        spectaclesSettingsPresenter.takeTarget((xml) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.settings_spectacles_fragment, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.spectacles_settings_layout_root);
        akcr.a(findViewById, "view.findViewById(R.id.s…les_settings_layout_root)");
        this.h = findViewById;
        findViewById = inflate.findViewById(R.id.settings_recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.settings_recycler_view)");
        this.l = (RecyclerView) findViewById;
        SpectaclesSettingsLayoutManager spectaclesSettingsLayoutManager = new SpectaclesSettingsLayoutManager(getContext(), getContext().getResources().getDimensionPixelSize(R.dimen.default_gap));
        RecyclerView recyclerView = this.l;
        String str = "settingsRecyclerView";
        if (recyclerView == null) {
            akcr.a(str);
        }
        recyclerView.setLayoutManager(spectaclesSettingsLayoutManager);
        recyclerView = this.l;
        if (recyclerView == null) {
            akcr.a(str);
        }
        recyclerView.addItemDecoration((ItemDecoration) spectaclesSettingsLayoutManager.a.b());
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == null) {
            akcr.a(str);
        }
        recyclerView2.setItemAnimator(new ziv("SpectaclesSettingsFragment"));
        findViewById = inflate.findViewById(R.id.spectacles_add_new_device_section);
        akcr.a(findViewById, "view.findViewById(R.id.s…s_add_new_device_section)");
        this.i = findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_restriction_section);
        akcr.a(findViewById, "view.findViewById(R.id.s…cles_restriction_section)");
        this.j = findViewById;
        findViewById = inflate.findViewById(R.id.pairing_image_view);
        akcr.a(findViewById, "view.findViewById(R.id.pairing_image_view)");
        this.k = (SnapImageView) findViewById;
        SnapImageView snapImageView = this.k;
        if (snapImageView == null) {
            akcr.a("pairingImageView");
        }
        snapImageView.setRequestListener(new b(this));
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        RecyclerView recyclerView = this.l;
        if (recyclerView == null) {
            akcr.a("settingsRecyclerView");
        }
        recyclerView.setAdapter(null);
    }

    public final void onDetach() {
        SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
        if (spectaclesSettingsPresenter == null) {
            akcr.a("settingsPresenter");
        }
        spectaclesSettingsPresenter.dropTarget();
        super.onDetach();
    }
}
