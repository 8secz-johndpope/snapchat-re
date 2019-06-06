package com.snap.spectacles.lib.fragments;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snap.spectacles.api.SpectaclesFragment;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.ah;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.ai;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.aj;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.ak;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.al;
import com.snap.ui.view.ScHeaderView;
import com.snapchat.android.R;
import defpackage.abcg;
import defpackage.abdv;
import defpackage.acgu;
import defpackage.acgv;
import defpackage.achb;
import defpackage.achd;
import defpackage.achg;
import defpackage.achi;
import defpackage.acig;
import defpackage.acip;
import defpackage.acis;
import defpackage.ajdj;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfl;
import defpackage.ajvv;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.xai;
import defpackage.xcl;
import defpackage.xdb;
import defpackage.xdd;
import defpackage.xdv;
import defpackage.xeb;
import defpackage.xmg;
import defpackage.xmt;
import defpackage.xmz;
import defpackage.xne;
import defpackage.xpg;
import defpackage.zgy;
import defpackage.zjf;
import defpackage.zjk;
import defpackage.zjm;
import java.util.concurrent.Callable;

public final class SpectaclesManageFragment extends SpectaclesFragment implements xmg {
    public static final zjm g = new zjm(xai.f, "SpectaclesManageFragment", false, false, false, false, null, false, false, false, false, null, 4092);
    public static final acgu<zjm> h;
    public static final acgu<zjm> i;
    private View A;
    private CheckBox B;
    private TextView C;
    private View D;
    private View E;
    private final OnCheckedChangeListener F = new b(this);
    public achb<zjm, zjk> a;
    public SpectaclesManagePresenter b;
    View e;
    View f;
    private View j;
    private TextView k;
    private View l;
    private View m;
    private TextView n;
    private View o;
    private TextView p;
    private View q;
    private View r;
    private TextView s;
    private View t;
    private TextView u;
    private TextView v;
    private ScHeaderView w;
    private View x;
    private TextView y;
    private View z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static SpectaclesManageFragment a(String str) {
            akcr.b(str, "deviceSerialNumber");
            Bundle bundle = new Bundle();
            bundle.putString("ARG_KEY_DEVICE_SERIAL_NUMBER", str);
            SpectaclesManageFragment spectaclesManageFragment = new SpectaclesManageFragment();
            spectaclesManageFragment.setArguments(bundle);
            return spectaclesManageFragment;
        }
    }

    static final class b implements OnCheckedChangeListener {
        private /* synthetic */ SpectaclesManageFragment a;

        b(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2 = z;
            akcr.a((Object) compoundButton, "compoundButton");
            if (!compoundButton.isPressed()) {
                return;
            }
            if (z2) {
                SpectaclesManageFragment.a(this.a, true);
                return;
            }
            if (!z2) {
                SpectaclesManageFragment spectaclesManageFragment = this.a;
                zjm zjm = new zjm(xai.f, "spectacles_confirm_disable_location", false, false, true, false, null, false, false, false, false, null, 4076);
                Context context = spectaclesManageFragment.getContext();
                achb achb = spectaclesManageFragment.a;
                String str = "navigationHost";
                if (achb == null) {
                    akcr.a(str);
                }
                zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.spectacles_disable_location_title).b((int) R.string.spectacles_disable_location_description).a((int) R.string.spectacles_disable_location_button, (akbl) new m(spectaclesManageFragment), true), null, true, null, null, null, 29).a();
                achb achb2 = spectaclesManageFragment.a;
                if (achb2 == null) {
                    akcr.a(str);
                }
                achb2.a((achd) a, a.a, null);
            }
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ SpectaclesManageFragment a;

        c(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        /* JADX WARNING: Missing block: B:3:0x0012, code skipped:
            if (r1 == null) goto L_0x0014;
     */
        public final void onClick(android.view.View r5) {
            /*
            r4 = this;
            r5 = new zjf;
            r0 = com.snap.spectacles.lib.fragments.SpectaclesManageSaveToFragment.e;
            r1 = r4.a;
            r1 = r1.getArguments();
            r2 = "ARG_KEY_DEVICE_SERIAL_NUMBER";
            if (r1 == 0) goto L_0x0014;
        L_0x000e:
            r1 = r1.getString(r2);
            if (r1 != 0) goto L_0x0016;
        L_0x0014:
            r1 = "";
        L_0x0016:
            r3 = "deviceSerialNumber";
            defpackage.akcr.b(r1, r3);
            r3 = new android.os.Bundle;
            r3.<init>();
            r3.putString(r2, r1);
            r1 = new com.snap.spectacles.lib.fragments.SpectaclesManageSaveToFragment;
            r1.<init>();
            r1.setArguments(r3);
            r1 = (com.snap.ui.deck.MainPageFragment) r1;
            r2 = defpackage.acgv.a();
            r3 = com.snap.spectacles.lib.fragments.SpectaclesManageSaveToFragment.g;
            r2 = r2.a(r3);
            r2 = r2.a();
            r5.<init>(r0, r1, r2);
            r0 = r4.a;
            r0 = r0.h();
            r5 = (defpackage.achd) r5;
            r1 = com.snap.spectacles.lib.fragments.SpectaclesManageSaveToFragment.f;
            r2 = "SpectaclesManageSaveToFr…PECTACLES_PRESENT_DEFAULT";
            defpackage.akcr.a(r1, r2);
            r2 = 0;
            r0.a(r5, r1, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesManageFragment$c.onClick(android.view.View):void");
        }
    }

    static final class d implements OnClickListener {
        private /* synthetic */ SpectaclesManageFragment a;

        d(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        public final void onClick(View view) {
            zjf zjf = new zjf(SpectaclesContextNotificationSettingsFragment.e, new SpectaclesContextNotificationSettingsFragment(), acgv.a().a(SpectaclesContextNotificationSettingsFragment.g).a());
            achb h = this.a.h();
            achd achd = zjf;
            acgu acgu = SpectaclesContextNotificationSettingsFragment.f;
            akcr.a((Object) acgu, "SpectaclesContextNotific…PECTACLES_PRESENT_DEFAULT");
            h.a(achd, acgu, null);
        }
    }

    static final class e implements OnClickListener {
        private /* synthetic */ SpectaclesManageFragment a;

        e(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        public final void onClick(View view) {
            SpectaclesManagePresenter i = this.a.i();
            abdv abdv = abdv.CHECK_UPDATE;
            xdb xdb = i.b;
            String str = MapboxNavigationEvent.KEY_DEVICE;
            if (xdb == null) {
                akcr.a(str);
            }
            i.a(abdv, xdb);
            xmg xmg = (xmg) i.getTarget();
            if (xmg != null) {
                xdb xdb2 = i.b;
                if (xdb2 == null) {
                    akcr.a(str);
                }
                boolean z = xdb2.j;
                xdb2 = i.b;
                if (xdb2 == null) {
                    akcr.a(str);
                }
                xcl xcl = xdb2.n;
                xdb2 = i.b;
                if (xdb2 == null) {
                    akcr.a(str);
                }
                xdd xdd = xdb2.c;
                xmg.a((xmz) new xmt(null, z, true, xcl, -1.0f, xdd != null ? xdd.m() : false));
            }
            xpg e = i.e();
            xdb = i.b;
            if (xdb == null) {
                akcr.a(str);
            }
            e.a(xdb, (defpackage.xpg.b) new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.c(i));
            i.b(i, com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.v.a);
        }
    }

    static final class f implements OnClickListener {
        final /* synthetic */ SpectaclesManageFragment a;

        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                SpectaclesManagePresenter i = this.a.a.i();
                abdv abdv = abdv.CLEAR_CONTENT;
                xdb xdb = i.b;
                String str = MapboxNavigationEvent.KEY_DEVICE;
                if (xdb == null) {
                    akcr.a(str);
                }
                i.a(abdv, xdb);
                xdb xdb2 = i.b;
                if (xdb2 == null) {
                    akcr.a(str);
                }
                if (xdb2.n == xcl.BLE_SYNCED) {
                    xmg xmg = (xmg) i.getTarget();
                    if (xmg != null) {
                        xmg.k();
                    }
                    xdb2 = i.b;
                    if (xdb2 == null) {
                        akcr.a(str);
                    }
                    xeb dVar = new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.d(i);
                    akcr.b(dVar, "responseCallback");
                    xdv t = xdb2.t();
                    if (t != null) {
                        t.m(dVar);
                    }
                }
                return ajxw.a;
            }
        }

        f(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        public final void onClick(View view) {
            if (this.a.i().e) {
                this.a.n();
                return;
            }
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(this.a.getContext(), this.a.h(), new zjm(xai.f, "spectacles_clear_content", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.laguna_clear_content_title).b((int) R.string.laguna_clear_content_disclaimer).a((int) R.string.clear_content, (akbl) new a(this), true), null, false, null, null, null, 31).a();
            this.a.h().a((achd) a, a.a, null);
        }
    }

    static final class g implements OnClickListener {
        final /* synthetic */ SpectaclesManageFragment a;

        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ g a;

            a(g gVar) {
                this.a = gVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                SpectaclesManagePresenter i = this.a.a.i();
                abdv abdv = abdv.RESTART;
                xdb xdb = i.b;
                String str = MapboxNavigationEvent.KEY_DEVICE;
                if (xdb == null) {
                    akcr.a(str);
                }
                i.a(abdv, xdb);
                xdb xdb2 = i.b;
                if (xdb2 == null) {
                    akcr.a(str);
                }
                if (xdb2.n == xcl.BLE_SYNCED) {
                    xmg xmg = (xmg) i.getTarget();
                    if (xmg != null) {
                        xmg.a((xmz) new xne());
                    }
                    xdb2 = i.b;
                    if (xdb2 == null) {
                        akcr.a(str);
                    }
                    xdb2.a((xeb) new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.z(i));
                }
                return ajxw.a;
            }
        }

        g(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        public final void onClick(View view) {
            if (this.a.i().e) {
                this.a.n();
                return;
            }
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(this.a.getContext(), this.a.h(), new zjm(xai.f, "spectacles_restart", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.laguna_restart_specs_title).b((int) R.string.laguna_restart_specs_body).a((int) R.string.restart, (akbl) new a(this), true), null, false, null, null, null, 31).a();
            this.a.h().a((achd) a, a.a, null);
        }
    }

    static final class h implements OnClickListener {
        final /* synthetic */ SpectaclesManageFragment a;

        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ h a;

            a(h hVar) {
                this.a = hVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.a.i().f();
                return ajxw.a;
            }
        }

        h(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        public final void onClick(View view) {
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(this.a.getContext(), this.a.h(), new zjm(xai.f, "spectacles_forget", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.laguna_forget_specs_title).b((int) R.string.laguna_forget_specs_body).a((int) R.string.forget, (akbl) new a(this), false), null, false, null, null, null, 31).a();
            this.a.h().a((achd) a, a.a, null);
        }
    }

    static final class i implements OnClickListener {
        private /* synthetic */ SpectaclesManageFragment a;

        i(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        public final void onClick(View view) {
            SpectaclesManageFragment spectaclesManageFragment = this.a;
            xdb b = spectaclesManageFragment.i().b();
            zjm zjm = SpectaclesEditNameFragment.e;
            String str = b.d;
            akcr.b(str, "deviceSerialNumber");
            Bundle bundle = new Bundle();
            bundle.putString("ARG_KEY_DEVICE_SERIAL_NUMBER", str);
            SpectaclesEditNameFragment spectaclesEditNameFragment = new SpectaclesEditNameFragment();
            spectaclesEditNameFragment.setArguments(bundle);
            zjf zjf = new zjf(zjm, spectaclesEditNameFragment, acgv.a().a(SpectaclesEditNameFragment.g).a());
            achb achb = spectaclesManageFragment.a;
            if (achb == null) {
                akcr.a("navigationHost");
            }
            achd achd = zjf;
            acgu acgu = SpectaclesEditNameFragment.f;
            akcr.a((Object) acgu, "SpectaclesEditNameFragme…PECTACLES_PRESENT_DEFAULT");
            achb.a(achd, acgu, null);
        }
    }

    static final class k implements OnClickListener {
        final /* synthetic */ SpectaclesManageFragment a;

        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ k a;

            a(k kVar) {
                this.a = kVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.a.i().f();
                return ajxw.a;
            }
        }

        k(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        public final void onClick(View view) {
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(this.a.getContext(), this.a.h(), new zjm(xai.f, "spectacles_forget", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.laguna_forget_specs_title).b((int) R.string.laguna_forget_specs_body).a((int) R.string.forget, (akbl) new a(this), false), null, false, null, null, null, 31).a();
            this.a.h().a((achd) a, a.a, null);
        }
    }

    static final class l implements OnClickListener {
        final /* synthetic */ SpectaclesManageFragment a;

        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ l a;

            a(l lVar) {
                this.a = lVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                View view = this.a.a.f;
                if (view == null) {
                    akcr.a("unpairSpecsSpinner");
                }
                view.setVisibility(0);
                view = this.a.a.e;
                if (view == null) {
                    akcr.a("forgetSpecsContainer");
                }
                view.setClickable(false);
                SpectaclesManagePresenter i = this.a.a.i();
                abdv abdv = abdv.UNPAIR;
                xdb xdb = i.b;
                String str = MapboxNavigationEvent.KEY_DEVICE;
                if (xdb == null) {
                    akcr.a(str);
                }
                i.a(abdv, xdb);
                xdb xdb2 = i.b;
                if (xdb2 == null) {
                    akcr.a(str);
                }
                xeb alVar = new al(i);
                akcr.b(alVar, "responseCallback");
                xdv t = xdb2.t();
                if (t != null) {
                    t.l(alVar);
                }
                return ajxw.a;
            }
        }

        l(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
        }

        public final void onClick(View view) {
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(this.a.getContext(), this.a.h(), new zjm(xai.f, "spectacles_unpair", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.laguna_unpair_specs_title).b((int) R.string.laguna_unpair_specs_body).a((int) R.string.unpair, (akbl) new a(this), true), null, false, null, null, null, 31).a();
            this.a.h().a((achd) a, a.a, null);
        }
    }

    static final class aa extends akcs implements akbl<View, ajxw> {
        public static final aa a = new aa();

        aa() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class ab extends akcs implements akbl<View, ajxw> {
        public static final ab a = new ab();

        ab() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class ac extends akcs implements akbl<View, ajxw> {
        public static final ac a = new ac();

        ac() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class ad extends akcs implements akbl<View, ajxw> {
        public static final ad a = new ad();

        ad() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<View, ajxw> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class m extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesManageFragment a;

        m(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SpectaclesManageFragment.a(this.a, false);
            return ajxw.a;
        }
    }

    static final class n extends akcs implements akbl<View, ajxw> {
        public static final n a = new n();

        n() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class o extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesManageFragment a;
        private /* synthetic */ String b;

        o(SpectaclesManageFragment spectaclesManageFragment, String str) {
            this.a = spectaclesManageFragment;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.i().a(abcg.ACCEPT);
            SpectaclesManagePresenter i = this.a.i();
            String str = this.b;
            akcr.b(str, "version");
            if (i.e) {
                Object obj2 = (xmg) i.getTarget();
                if (obj2 != null) {
                    i.a(obj2, (akbl) com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.e.a);
                }
            } else {
                xpg e = i.e();
                xdb xdb = i.b;
                if (xdb == null) {
                    akcr.a(MapboxNavigationEvent.KEY_DEVICE);
                }
                e.a(xdb, str, (defpackage.xpg.c) new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.f(i));
            }
            return ajxw.a;
        }
    }

    static final class p extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesManageFragment a;

        p(SpectaclesManageFragment spectaclesManageFragment) {
            this.a = spectaclesManageFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.i().a(abcg.DECLINE);
            this.a.i().a(defpackage.xgg.a.UPDATE_AVAILABLE, (float) MapboxConstants.MINIMUM_ZOOM);
            return ajxw.a;
        }
    }

    static final class q extends akcs implements akbl<View, ajxw> {
        public static final q a = new q();

        q() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class r extends akcs implements akbl<View, ajxw> {
        public static final r a = new r();

        r() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class s extends akcs implements akbl<View, ajxw> {
        public static final s a = new s();

        s() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class t extends akcs implements akbl<View, ajxw> {
        public static final t a = new t();

        t() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class u extends akcs implements akbl<View, ajxw> {
        public static final u a = new u();

        u() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class v extends akcs implements akbl<View, ajxw> {
        public static final v a = new v();

        v() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class w extends akcs implements akbl<View, ajxw> {
        public static final w a = new w();

        w() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class x extends akcs implements akbl<View, ajxw> {
        public static final x a = new x();

        x() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class y extends akcs implements akbl<View, ajxw> {
        public static final y a = new y();

        y() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class z extends akcs implements akbl<View, ajxw> {
        public static final z a = new z();

        z() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
        acgu a = acgu.a(acis.b, (achg) g, true);
        h = a;
        i = a.j();
    }

    private final void a(boolean z, boolean z2) {
        View view;
        l lVar;
        String str = "forgetSpecsContainer";
        String str2 = "forgetSpecsTextView";
        TextView textView;
        if (z && z2) {
            textView = this.u;
            if (textView == null) {
                akcr.a(str2);
            }
            textView.setText(R.string.laguna_unpair_specs);
            view = this.e;
            if (view == null) {
                akcr.a(str);
            }
            lVar = new l(this);
        } else {
            textView = this.u;
            if (textView == null) {
                akcr.a(str2);
            }
            textView.setText(R.string.laguna_forget_specs);
            view = this.e;
            if (view == null) {
                akcr.a(str);
            }
            lVar = new k(this);
        }
        view.setOnClickListener(lVar);
    }

    private final void b(boolean z) {
        View view = this.r;
        if (view == null) {
            akcr.a("restartSpecsContainer");
        }
        view.setClickable(z);
        view = this.o;
        if (view == null) {
            akcr.a("clearContentContainer");
        }
        view.setClickable(z);
        String str = "clearContentTextView";
        String str2 = "restartSpecsTextView";
        TextView textView;
        if (z) {
            textView = this.s;
            if (textView == null) {
                akcr.a(str2);
            }
            textView.setAlpha(1.0f);
            textView = this.p;
            if (textView == null) {
                akcr.a(str);
            }
            textView.setAlpha(1.0f);
            return;
        }
        textView = this.s;
        if (textView == null) {
            akcr.a(str2);
        }
        textView.setAlpha(0.2f);
        textView = this.p;
        if (textView == null) {
            akcr.a(str);
        }
        textView.setAlpha(0.2f);
    }

    public final void a(int i, int i2) {
        zjm zjm = new zjm(xai.f, "firmware_update_failed_low_battery", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, achb, zjm, false, null, 24);
        String string = getString(R.string.low_battery_title, Integer.valueOf(i));
        akcr.a((Object) string, "getString(com.snap.spect…tery_title, batteryLevel)");
        aVar = aVar.a(string);
        String string2 = getString(R.string.spectacles_update_low_battery, Integer.valueOf(i2));
        akcr.a((Object) string2, "getString(com.snap.spect…ery, minimumBatteryLevel)");
        zgy a = aVar.b(string2).a((int) R.string.okay, (akbl) ac.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb achb3 = this.a;
        if (achb3 == null) {
            akcr.a(str);
        }
        achb2.b((acig) new acip(achb3, a, a.a));
    }

    public final void a(String str) {
        akcr.b(str, "latestVersion");
        zjm zjm = new zjm(xai.f, "firmware_update_transfer_failed", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str2 = "navigationHost";
        if (achb == null) {
            akcr.a(str2);
        }
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, achb, zjm, false, null, 24);
        String string = getString(R.string.laguna_update_version, string);
        akcr.a((Object) string, "getString(com.snap.spect…e_version, latestVersion)");
        zgy a = aVar.a(string).b((int) R.string.laguna_transfer_error).a((int) R.string.okay, (akbl) w.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str2);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void a(String str, String str2, boolean z) {
        String str3 = str;
        akcr.b(str3, "newVersion");
        zjm zjm = new zjm(xai.f, "firmware_update_dialog", false, false, true, false, null, false, false, false, false, null, 4076);
        String string = getContext().getString(R.string.laguna_update_version, new Object[]{str3});
        int i = z ? R.string.laguna_update_required_alert_body : R.string.laguna_update_disclaimer;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getContext().getString(i));
        stringBuilder.append(!TextUtils.isEmpty((CharSequence) str2) ? "\n\n".concat(String.valueOf(str2)) : "");
        String stringBuilder2 = stringBuilder.toString();
        Context context = getContext();
        achb achb = this.a;
        String str4 = "navigationHost";
        if (achb == null) {
            akcr.a(str4);
        }
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, achb, zjm, false, null, 24);
        akcr.a((Object) string, "title");
        zgy a = defpackage.zgy.a.a(aVar.a(string).b(stringBuilder2).a((int) R.string.update_now, (akbl) new o(this, str3), true), (akbl) new p(this), true, Integer.valueOf(R.string.update_later), null, null, 24).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str4);
        }
        achb2.a((achd) a, a.a, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:438:0x06f9 in {6, 9, 12, 15, 18, 21, 23, 26, 29, 32, 35, 38, 41, 44, 47, 50, 52, 55, 58, 61, 64, 67, 70, 73, 76, 78, 81, 84, 87, 90, 93, 96, 99, 102, 104, 107, 110, 113, 116, 119, 122, 125, 127, 130, 135, 136, 139, 140, 143, 146, 149, 152, 157, 158, 163, 165, 168, 171, 174, 177, 180, 183, 188, 190, 193, 196, 199, 202, 205, 208, 213, 214, 215, 220, 223, 226, 229, 232, 235, 238, 241, 244, 247, 250, 252, 257, 262, 263, 266, 267, 272, 275, 276, 279, 281, 282, 284, 293, 294, 299, 302, 305, 308, 311, 314, 317, 320, 323, 324, 327, 330, 333, 336, 339, 342, 345, 348, 351, 354, 357, 358, 363, 364, 367, 368, 371, 376, 379, 382, 383, 388, 394, 396, 399, 401, 404, 406, 413, 416, 419, 421, 424, 427, 430, 433, 435, 437} preds:[]
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
    public final void a(defpackage.xmz r29) {
        /*
        r28 = this;
        r0 = r28;
        r1 = r29;
        r2 = "state";
        defpackage.akcr.b(r1, r2);
        r2 = r1 instanceof defpackage.xmt;
        r3 = "updateAvailableSignView";
        r4 = "checkForUpdatesContainer";
        r5 = 1;
        r6 = 8;
        r7 = "checkForUpdatesTextView";
        r8 = 0;
        if (r2 == 0) goto L_0x037c;
        r1 = (defpackage.xmt) r1;
        r2 = r1.d;
        r9 = defpackage.xcl.BLE_SYNCED;
        r2 = r2.d(r9);
        r0.b(r2);
        r2 = r1.d;
        r9 = defpackage.xcl.BLE_SYNCED;
        r2 = r2.d(r9);
        r9 = r1.f;
        r0.a(r2, r9);
        r2 = r1.c;
        r9 = 2131100166; // 0x7f060206 float:1.7812706E38 double:1.05290338E-314;
        r10 = "checkForUpdatesSpinner";
        r11 = "updatingProgressTextView";
        if (r2 == 0) goto L_0x0084;
        r1 = r0.k;
        if (r1 != 0) goto L_0x0043;
        defpackage.akcr.a(r7);
        r2 = r28.getResources();
        r2 = r2.getColor(r9);
        r1.setTextColor(r2);
        r1 = r0.k;
        if (r1 != 0) goto L_0x0055;
        defpackage.akcr.a(r7);
        r2 = 2131886631; // 0x7f120227 float:1.9407846E38 double:1.053291945E-314;
        r1.setText(r2);
        r1 = r0.l;
        if (r1 != 0) goto L_0x0062;
        defpackage.akcr.a(r3);
        r1.setVisibility(r6);
        r1 = r0.m;
        if (r1 != 0) goto L_0x006c;
        defpackage.akcr.a(r10);
        r1.setVisibility(r8);
        r1 = r0.n;
        if (r1 != 0) goto L_0x0076;
        defpackage.akcr.a(r11);
        r1.setVisibility(r6);
        r1 = r0.j;
        if (r1 != 0) goto L_0x0080;
        defpackage.akcr.a(r4);
        r1.setClickable(r8);
        return;
        r2 = r1.e;
        r12 = 1065185444; // 0x3f7d70a4 float:0.99 double:5.262715343E-315;
        r2 = java.lang.Math.min(r2, r12);
        r12 = r1.a;
        if (r12 != 0) goto L_0x0093;
        goto L_0x0324;
        r13 = defpackage.xld.a;
        r12 = r12.ordinal();
        r12 = r13[r12];
        switch(r12) {
            case 1: goto L_0x02cc;
            case 2: goto L_0x02cc;
            case 3: goto L_0x02cc;
            case 4: goto L_0x0255;
            case 5: goto L_0x0255;
            case 6: goto L_0x0200;
            case 7: goto L_0x0200;
            case 8: goto L_0x0200;
            case 9: goto L_0x0200;
            case 10: goto L_0x0200;
            case 11: goto L_0x0200;
            case 12: goto L_0x0179;
            case 13: goto L_0x0179;
            case 14: goto L_0x0179;
            case 15: goto L_0x00f2;
            case 16: goto L_0x00f2;
            case 17: goto L_0x00f2;
            case 18: goto L_0x00f2;
            case 19: goto L_0x00f2;
            case 20: goto L_0x00f2;
            case 21: goto L_0x00f2;
            case 22: goto L_0x00a0;
            default: goto L_0x009e;
        };
        goto L_0x0324;
        r1 = r0.k;
        if (r1 != 0) goto L_0x00a7;
        defpackage.akcr.a(r7);
        r2 = r28.getResources();
        r2 = r2.getColor(r9);
        r1.setTextColor(r2);
        r1 = r0.k;
        if (r1 != 0) goto L_0x00b9;
        defpackage.akcr.a(r7);
        r2 = 2131890335; // 0x7f12109f float:1.9415359E38 double:1.053293775E-314;
        r1.setText(r2);
        r1 = r0.k;
        if (r1 != 0) goto L_0x00c6;
        defpackage.akcr.a(r7);
        r1.setVisibility(r8);
        r1 = r0.l;
        if (r1 != 0) goto L_0x00d0;
        defpackage.akcr.a(r3);
        r1.setVisibility(r6);
        r1 = r0.m;
        if (r1 != 0) goto L_0x00da;
        defpackage.akcr.a(r10);
        r1.setVisibility(r6);
        r1 = r0.n;
        if (r1 != 0) goto L_0x00e4;
        defpackage.akcr.a(r11);
        r1.setVisibility(r6);
        r1 = r0.j;
        if (r1 != 0) goto L_0x00ee;
        defpackage.akcr.a(r4);
        r1.setClickable(r8);
        return;
        r12 = r0.k;
        if (r12 != 0) goto L_0x00f9;
        defpackage.akcr.a(r7);
        r13 = r28.getResources();
        r9 = r13.getColor(r9);
        r12.setTextColor(r9);
        r9 = r0.k;
        if (r9 != 0) goto L_0x010b;
        defpackage.akcr.a(r7);
        r12 = 2131890343; // 0x7f1210a7 float:1.9415375E38 double:1.053293779E-314;
        r9.setText(r12);
        r9 = r0.k;
        if (r9 != 0) goto L_0x0118;
        defpackage.akcr.a(r7);
        r9.setVisibility(r8);
        r7 = r0.l;
        if (r7 != 0) goto L_0x0122;
        defpackage.akcr.a(r3);
        r7.setVisibility(r6);
        r3 = r0.m;
        if (r3 != 0) goto L_0x012c;
        defpackage.akcr.a(r10);
        r3.setVisibility(r6);
        r3 = r0.n;
        if (r3 != 0) goto L_0x0136;
        defpackage.akcr.a(r11);
        r6 = java.util.Locale.US;
        r7 = "Locale.US";
        defpackage.akcr.a(r6, r7);
        r7 = new java.lang.Object[r5];
        r9 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r2 = r2 * r9;
        r2 = java.lang.Float.valueOf(r2);
        r7[r8] = r2;
        r2 = java.util.Arrays.copyOf(r7, r5);
        r5 = "%.0f%%";
        r2 = java.lang.String.format(r6, r5, r2);
        r5 = "java.lang.String.format(locale, format, *args)";
        defpackage.akcr.a(r2, r5);
        r2 = (java.lang.CharSequence) r2;
        r3.setText(r2);
        r2 = r0.n;
        if (r2 != 0) goto L_0x0163;
        defpackage.akcr.a(r11);
        r2.setVisibility(r8);
        r2 = r0.j;
        if (r2 != 0) goto L_0x016d;
        defpackage.akcr.a(r4);
        r2.setClickable(r8);
        r0.b(r8);
        r1 = r1.f;
        r0.a(r8, r1);
        return;
        r12 = r0.k;
        if (r12 != 0) goto L_0x0180;
        defpackage.akcr.a(r7);
        r13 = r28.getResources();
        r9 = r13.getColor(r9);
        r12.setTextColor(r9);
        r9 = r0.k;
        if (r9 != 0) goto L_0x0192;
        defpackage.akcr.a(r7);
        r12 = 2131888915; // 0x7f120b13 float:1.9412479E38 double:1.0532930737E-314;
        r9.setText(r12);
        r9 = r0.k;
        if (r9 != 0) goto L_0x019f;
        defpackage.akcr.a(r7);
        r9.setVisibility(r8);
        r7 = r0.l;
        if (r7 != 0) goto L_0x01a9;
        defpackage.akcr.a(r3);
        r7.setVisibility(r6);
        r3 = r0.m;
        if (r3 != 0) goto L_0x01b3;
        defpackage.akcr.a(r10);
        r3.setVisibility(r6);
        r3 = r0.n;
        if (r3 != 0) goto L_0x01bd;
        defpackage.akcr.a(r11);
        r6 = java.util.Locale.US;
        r7 = "Locale.US";
        defpackage.akcr.a(r6, r7);
        r7 = new java.lang.Object[r5];
        r9 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r2 = r2 * r9;
        r2 = java.lang.Float.valueOf(r2);
        r7[r8] = r2;
        r2 = java.util.Arrays.copyOf(r7, r5);
        r5 = "%.0f%%";
        r2 = java.lang.String.format(r6, r5, r2);
        r5 = "java.lang.String.format(locale, format, *args)";
        defpackage.akcr.a(r2, r5);
        r2 = (java.lang.CharSequence) r2;
        r3.setText(r2);
        r2 = r0.n;
        if (r2 != 0) goto L_0x01ea;
        defpackage.akcr.a(r11);
        r2.setVisibility(r8);
        r2 = r0.j;
        if (r2 != 0) goto L_0x01f4;
        defpackage.akcr.a(r4);
        r2.setClickable(r8);
        r0.b(r8);
        r1 = r1.f;
        r0.a(r8, r1);
        return;
        r1 = r0.k;
        if (r1 != 0) goto L_0x0207;
        defpackage.akcr.a(r7);
        r2 = r28.getResources();
        r2 = r2.getColor(r9);
        r1.setTextColor(r2);
        r1 = r0.k;
        if (r1 != 0) goto L_0x0219;
        defpackage.akcr.a(r7);
        r2 = 2131887098; // 0x7f1203fa float:1.9408793E38 double:1.053292176E-314;
        r1.setText(r2);
        r1 = r0.k;
        if (r1 != 0) goto L_0x0226;
        defpackage.akcr.a(r7);
        r1.setVisibility(r8);
        r1 = r0.l;
        if (r1 != 0) goto L_0x0230;
        defpackage.akcr.a(r3);
        r1.setVisibility(r6);
        r1 = r0.m;
        if (r1 != 0) goto L_0x023a;
        defpackage.akcr.a(r10);
        r1.setVisibility(r8);
        r1 = r0.n;
        if (r1 != 0) goto L_0x0244;
        defpackage.akcr.a(r11);
        r1.setVisibility(r6);
        r1 = r0.j;
        if (r1 != 0) goto L_0x024e;
        defpackage.akcr.a(r4);
        r1.setClickable(r8);
        r0.b(r8);
        return;
        r2 = r0.k;
        if (r2 != 0) goto L_0x025c;
        defpackage.akcr.a(r7);
        r9 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r2.setTextColor(r9);
        r2 = r1.b;
        if (r2 == 0) goto L_0x0270;
        r2 = r0.k;
        if (r2 != 0) goto L_0x026c;
        defpackage.akcr.a(r7);
        r9 = 2131890340; // 0x7f1210a4 float:1.941537E38 double:1.0532937777E-314;
        goto L_0x027a;
        r2 = r0.k;
        if (r2 != 0) goto L_0x0277;
        defpackage.akcr.a(r7);
        r9 = 2131890334; // 0x7f12109e float:1.9415357E38 double:1.0532937747E-314;
        r2.setText(r9);
        r2 = r0.k;
        if (r2 != 0) goto L_0x0284;
        defpackage.akcr.a(r7);
        r2.setVisibility(r8);
        r2 = r0.l;
        if (r2 != 0) goto L_0x028e;
        defpackage.akcr.a(r3);
        r2.setVisibility(r8);
        r2 = r0.m;
        if (r2 != 0) goto L_0x0298;
        defpackage.akcr.a(r10);
        r2.setVisibility(r6);
        r2 = r0.n;
        if (r2 != 0) goto L_0x02a2;
        defpackage.akcr.a(r11);
        r2.setVisibility(r6);
        r2 = r1.d;
        r3 = defpackage.xcl.BLE_SYNCED;
        if (r2 != r3) goto L_0x02b5;
        r2 = r0.j;
        if (r2 != 0) goto L_0x02b2;
        defpackage.akcr.a(r4);
        r2.setClickable(r5);
        r1 = r1.a;
        r2 = defpackage.xgg.a.UPDATE_AVAILABLE;
        if (r1 != r2) goto L_0x037b;
        r1 = r0.b;
        if (r1 != 0) goto L_0x02c4;
        r2 = "managePresenter";
        defpackage.akcr.a(r2);
        r2 = com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.x.a;
        r2 = (defpackage.akbl) r2;
        r1.b(r1, r2);
        return;
        r2 = r0.k;
        if (r2 != 0) goto L_0x02d3;
        defpackage.akcr.a(r7);
        r12 = r28.getResources();
        r9 = r12.getColor(r9);
        r2.setTextColor(r9);
        r2 = r0.k;
        if (r2 != 0) goto L_0x02e5;
        defpackage.akcr.a(r7);
        r9 = 2131886628; // 0x7f120224 float:1.940784E38 double:1.0532919437E-314;
        r2.setText(r9);
        r2 = r0.k;
        if (r2 != 0) goto L_0x02f2;
        defpackage.akcr.a(r7);
        r2.setVisibility(r8);
        r2 = r0.l;
        if (r2 != 0) goto L_0x02fc;
        defpackage.akcr.a(r3);
        r2.setVisibility(r6);
        r2 = r0.m;
        if (r2 != 0) goto L_0x0306;
        defpackage.akcr.a(r10);
        r2.setVisibility(r6);
        r2 = r0.n;
        if (r2 != 0) goto L_0x0310;
        defpackage.akcr.a(r11);
        r2.setVisibility(r6);
        r1 = r1.d;
        r2 = defpackage.xcl.BLE_SYNCED;
        if (r1 != r2) goto L_0x037b;
        r1 = r0.j;
        if (r1 != 0) goto L_0x0320;
        defpackage.akcr.a(r4);
        r1.setClickable(r5);
        return;
        r2 = r0.k;
        if (r2 != 0) goto L_0x032b;
        defpackage.akcr.a(r7);
        r12 = r28.getResources();
        r9 = r12.getColor(r9);
        r2.setTextColor(r9);
        r2 = r0.k;
        if (r2 != 0) goto L_0x033d;
        defpackage.akcr.a(r7);
        r9 = 2131886628; // 0x7f120224 float:1.940784E38 double:1.0532919437E-314;
        r2.setText(r9);
        r2 = r0.k;
        if (r2 != 0) goto L_0x034a;
        defpackage.akcr.a(r7);
        r2.setVisibility(r8);
        r2 = r0.l;
        if (r2 != 0) goto L_0x0354;
        defpackage.akcr.a(r3);
        r2.setVisibility(r6);
        r2 = r0.m;
        if (r2 != 0) goto L_0x035e;
        defpackage.akcr.a(r10);
        r2.setVisibility(r6);
        r2 = r0.n;
        if (r2 != 0) goto L_0x0368;
        defpackage.akcr.a(r11);
        r2.setVisibility(r6);
        r1 = r1.d;
        r2 = defpackage.xcl.BLE_SYNCED;
        if (r1 != r2) goto L_0x037b;
        r1 = r0.j;
        if (r1 != 0) goto L_0x0378;
        defpackage.akcr.a(r4);
        r1.setClickable(r5);
        return;
        r2 = r1 instanceof defpackage.xne;
        r9 = "clearContentTextView";
        r10 = "clearContentContainer";
        r11 = "enableLocationCheckbox";
        r12 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        if (r2 == 0) goto L_0x0400;
        r1 = r0.t;
        if (r1 != 0) goto L_0x0392;
        r2 = "restartSpecsSpinner";
        defpackage.akcr.a(r2);
        r1.setVisibility(r8);
        r1 = r0.j;
        if (r1 != 0) goto L_0x039c;
        defpackage.akcr.a(r4);
        r1.setClickable(r8);
        r1 = r0.r;
        if (r1 != 0) goto L_0x03a8;
        r2 = "restartSpecsContainer";
        defpackage.akcr.a(r2);
        r1.setClickable(r8);
        r1 = r0.o;
        if (r1 != 0) goto L_0x03b2;
        defpackage.akcr.a(r10);
        r1.setClickable(r8);
        r1 = r0.B;
        if (r1 != 0) goto L_0x03bc;
        defpackage.akcr.a(r11);
        r1.setClickable(r8);
        r1 = r0.k;
        if (r1 != 0) goto L_0x03c6;
        defpackage.akcr.a(r7);
        r1.setAlpha(r12);
        r1 = r0.l;
        if (r1 != 0) goto L_0x03d0;
        defpackage.akcr.a(r3);
        r1.setAlpha(r12);
        r1 = r0.s;
        if (r1 != 0) goto L_0x03dc;
        r2 = "restartSpecsTextView";
        defpackage.akcr.a(r2);
        r1.setAlpha(r12);
        r1 = r0.p;
        if (r1 != 0) goto L_0x03e6;
        defpackage.akcr.a(r9);
        r1.setAlpha(r12);
        r1 = r0.C;
        if (r1 != 0) goto L_0x03f2;
        r2 = "enableLocationText";
        defpackage.akcr.a(r2);
        r1.setAlpha(r12);
        r1 = r0.B;
        if (r1 != 0) goto L_0x03fc;
        defpackage.akcr.a(r11);
        r1.setAlpha(r12);
        return;
        r2 = r1 instanceof defpackage.xmr;
        if (r2 == 0) goto L_0x0465;
        r1 = (defpackage.xmr) r1;
        r2 = r0.x;
        if (r2 != 0) goto L_0x040f;
        r3 = "saveToSelectionView";
        defpackage.akcr.a(r3);
        r2.setVisibility(r8);
        r2 = r1.a;
        if (r2 == 0) goto L_0x0423;
        r2 = r0.y;
        if (r2 != 0) goto L_0x041f;
        r3 = "saveToStatusTextView";
        defpackage.akcr.a(r3);
        r3 = 2131889926; // 0x7f120f06 float:1.941453E38 double:1.053293573E-314;
        goto L_0x042f;
        r2 = r0.y;
        if (r2 != 0) goto L_0x042c;
        r3 = "saveToStatusTextView";
        defpackage.akcr.a(r3);
        r3 = 2131889925; // 0x7f120f05 float:1.9414527E38 double:1.0532935727E-314;
        r2.setText(r3);
        r2 = r1.b;
        if (r2 == 0) goto L_0x044e;
        r2 = r0.A;
        if (r2 != 0) goto L_0x043f;
        r3 = "deviceSettingsContainer";
        defpackage.akcr.a(r3);
        r2.setVisibility(r8);
        r2 = r0.B;
        if (r2 != 0) goto L_0x0449;
        defpackage.akcr.a(r11);
        r3 = r1.c;
        r2.setChecked(r3);
        r1 = r1.d;
        r2 = r0.w;
        if (r2 != 0) goto L_0x0459;
        r3 = "scHeaderView";
        defpackage.akcr.a(r3);
        if (r1 == 0) goto L_0x0460;
        r1 = r1.a();
        goto L_0x0461;
        r1 = 0;
        r2.setTitleText(r1);
        return;
        r2 = r1 instanceof defpackage.xmw;
        r13 = "clearContentSpinner";
        if (r2 == 0) goto L_0x0642;
        r1 = (defpackage.xmw) r1;
        r2 = r1.a;
        if (r2 == 0) goto L_0x0491;
        r2 = r1.a;
        r2 = r2.a();
        r2 = (java.lang.CharSequence) r2;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x0491;
        r2 = r0.w;
        if (r2 != 0) goto L_0x0488;
        r14 = "scHeaderView";
        defpackage.akcr.a(r14);
        r14 = r1.a;
        r14 = r14.a();
        r2.setTitleText(r14);
        r2 = r1.b;
        r14 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r2 != 0) goto L_0x04fd;
        r2 = r0.j;
        if (r2 != 0) goto L_0x049e;
        defpackage.akcr.a(r4);
        r2.setClickable(r8);
        r2 = r0.r;
        if (r2 != 0) goto L_0x04aa;
        r4 = "restartSpecsContainer";
        defpackage.akcr.a(r4);
        r2.setClickable(r8);
        r2 = r0.o;
        if (r2 != 0) goto L_0x04b4;
        defpackage.akcr.a(r10);
        r2.setClickable(r8);
        r2 = r0.B;
        if (r2 != 0) goto L_0x04be;
        defpackage.akcr.a(r11);
        r2.setClickable(r8);
        r2 = r0.l;
        if (r2 != 0) goto L_0x04c8;
        defpackage.akcr.a(r3);
        r2.setAlpha(r12);
        r2 = r0.s;
        if (r2 != 0) goto L_0x04d4;
        r3 = "restartSpecsTextView";
        defpackage.akcr.a(r3);
        r2.setAlpha(r12);
        r2 = r0.p;
        if (r2 != 0) goto L_0x04de;
        defpackage.akcr.a(r9);
        r2.setAlpha(r12);
        r2 = r0.C;
        if (r2 != 0) goto L_0x04ea;
        r3 = "enableLocationText";
        defpackage.akcr.a(r3);
        r2.setAlpha(r12);
        r2 = r0.B;
        if (r2 != 0) goto L_0x04f4;
        defpackage.akcr.a(r11);
        r2.setAlpha(r12);
        r2 = r1.e;
        r0.a(r8, r2);
        goto L_0x0578;
        r2 = r0.j;
        if (r2 != 0) goto L_0x0504;
        defpackage.akcr.a(r4);
        r2.setClickable(r5);
        r2 = r0.r;
        if (r2 != 0) goto L_0x0510;
        r4 = "restartSpecsContainer";
        defpackage.akcr.a(r4);
        r2.setClickable(r5);
        r2 = r0.o;
        if (r2 != 0) goto L_0x051a;
        defpackage.akcr.a(r10);
        r2.setClickable(r5);
        r2 = r0.B;
        if (r2 != 0) goto L_0x0524;
        defpackage.akcr.a(r11);
        r2.setClickable(r5);
        r2 = r0.l;
        if (r2 != 0) goto L_0x052e;
        defpackage.akcr.a(r3);
        r2.setAlpha(r14);
        r2 = r0.s;
        if (r2 != 0) goto L_0x053a;
        r3 = "restartSpecsTextView";
        defpackage.akcr.a(r3);
        r2.setAlpha(r14);
        r2 = r0.p;
        if (r2 != 0) goto L_0x0544;
        defpackage.akcr.a(r9);
        r2.setAlpha(r14);
        r2 = r0.C;
        if (r2 != 0) goto L_0x0550;
        r3 = "enableLocationText";
        defpackage.akcr.a(r3);
        r2.setAlpha(r14);
        r2 = r0.B;
        if (r2 != 0) goto L_0x055a;
        defpackage.akcr.a(r11);
        r2.setAlpha(r14);
        r2 = r0.t;
        if (r2 != 0) goto L_0x0566;
        r3 = "restartSpecsSpinner";
        defpackage.akcr.a(r3);
        r2.setVisibility(r6);
        r2 = r0.q;
        if (r2 != 0) goto L_0x0570;
        defpackage.akcr.a(r13);
        r2.setVisibility(r6);
        r2 = r1.e;
        r0.a(r5, r2);
        r2 = r1.b;
        if (r2 != 0) goto L_0x0587;
        r2 = r0.k;
        if (r2 != 0) goto L_0x0583;
        defpackage.akcr.a(r7);
        r2.setAlpha(r12);
        goto L_0x0591;
        r2 = r0.k;
        if (r2 != 0) goto L_0x058e;
        defpackage.akcr.a(r7);
        r2.setAlpha(r14);
        r2 = r0.b;
        if (r2 != 0) goto L_0x059a;
        r3 = "managePresenter";
        defpackage.akcr.a(r3);
        r2 = r2.d;
        if (r2 == 0) goto L_0x05bc;
        r2 = r0.o;
        if (r2 != 0) goto L_0x05a5;
        defpackage.akcr.a(r10);
        r2.setClickable(r8);
        r2 = r0.p;
        if (r2 != 0) goto L_0x05af;
        defpackage.akcr.a(r9);
        r2.setAlpha(r12);
        r2 = r0.q;
        if (r2 != 0) goto L_0x05b9;
        defpackage.akcr.a(r13);
        r2.setVisibility(r6);
        r2 = r1.d;
        if (r2 == 0) goto L_0x0631;
        r2 = r1.c;
        if (r2 != 0) goto L_0x05c5;
        goto L_0x0631;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = 0;
        r4 = r1.c;
        r4 = r4.length();
        if (r3 >= r4) goto L_0x05f4;
        r4 = r1.c;
        r6 = r3 + 4;
        if (r4 == 0) goto L_0x05ec;
        r3 = r4.substring(r3, r6);
        r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        defpackage.akcr.a(r3, r4);
        r2.append(r3);
        r3 = " ";
        r2.append(r3);
        r3 = r6;
        goto L_0x05cb;
        r1 = new ajxt;
        r2 = "null cannot be cast to non-null type java.lang.String";
        r1.<init>(r2);
        throw r1;
        r3 = java.util.Locale.US;
        r4 = "Locale.US";
        defpackage.akcr.a(r3, r4);
        r4 = 2131888016; // 0x7f120790 float:1.9410655E38 double:1.0532926295E-314;
        r4 = r0.getString(r4);
        r6 = "getString(com.snap.spect….laguna_firmware_version)";
        defpackage.akcr.a(r4, r6);
        r6 = 2;
        r6 = new java.lang.Object[r6];
        r1 = r1.d;
        r6[r8] = r1;
        r1 = r2.toString();
        r6[r5] = r1;
        r1 = 2;
        r1 = java.util.Arrays.copyOf(r6, r1);
        r1 = java.lang.String.format(r3, r4, r1);
        r2 = "java.lang.String.format(locale, format, *args)";
        defpackage.akcr.a(r1, r2);
        r2 = r0.v;
        if (r2 != 0) goto L_0x062b;
        r3 = "deviceInfoTextView";
        defpackage.akcr.a(r3);
        r1 = (java.lang.CharSequence) r1;
        r2.setText(r1);
        return;
        r1 = r0.v;
        if (r1 != 0) goto L_0x063a;
        r2 = "deviceInfoTextView";
        defpackage.akcr.a(r2);
        r2 = "";
        r2 = (java.lang.CharSequence) r2;
        r1.setText(r2);
        return;
        r2 = r1 instanceof defpackage.xmn;
        if (r2 == 0) goto L_0x06ef;
        r1 = (defpackage.xmn) r1;
        r1 = r1.a;
        if (r1 == 0) goto L_0x066b;
        r1 = r0.o;
        if (r1 != 0) goto L_0x0653;
        defpackage.akcr.a(r10);
        r1.setClickable(r8);
        r1 = r0.q;
        if (r1 != 0) goto L_0x065d;
        defpackage.akcr.a(r13);
        r1.setVisibility(r6);
        r1 = r0.p;
        if (r1 != 0) goto L_0x0667;
        defpackage.akcr.a(r9);
        r1.setAlpha(r12);
        return;
        r1 = r0.o;
        if (r1 != 0) goto L_0x0672;
        defpackage.akcr.a(r10);
        r1.setClickable(r5);
        r1 = r0.q;
        if (r1 != 0) goto L_0x067c;
        defpackage.akcr.a(r13);
        r1.setVisibility(r6);
        r1 = new zjm;
        r2 = defpackage.xai.f;
        r15 = r2;
        r15 = (defpackage.ide) r15;
        r17 = 0;
        r18 = 0;
        r19 = 1;
        r20 = 0;
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r25 = 0;
        r26 = 0;
        r27 = 4076; // 0xfec float:5.712E-42 double:2.014E-320;
        r16 = "spectacles_clear_content_error";
        r14 = r1;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
        r2 = new zgy$a;
        r15 = r28.getContext();
        r3 = r0.a;
        if (r3 != 0) goto L_0x06b1;
        r4 = "navigationHost";
        defpackage.akcr.a(r4);
        r18 = 0;
        r19 = 0;
        r20 = 24;
        r14 = r2;
        r16 = r3;
        r17 = r1;
        r14.<init>(r15, r16, r17, r18, r19, r20);
        r1 = 2131889824; // 0x7f120ea0 float:1.9414322E38 double:1.053293523E-314;
        r1 = r2.a(r1);
        r2 = 2131886636; // 0x7f12022c float:1.9407856E38 double:1.0532919477E-314;
        r1 = r1.b(r2);
        r2 = 2131888755; // 0x7f120a73 float:1.9412154E38 double:1.0532929946E-314;
        r3 = com.snap.spectacles.lib.fragments.SpectaclesManageFragment.j.a;
        r3 = (defpackage.akbl) r3;
        r1 = r1.a(r2, r3, r5);
        r1 = r1.a();
        r2 = r0.a;
        if (r2 != 0) goto L_0x06e5;
        r3 = "navigationHost";
        defpackage.akcr.a(r3);
        r3 = r1;
        r3 = (defpackage.achd) r3;
        r1 = r1.a;
        r4 = 0;
        r2.a(r3, r1, r4);
        return;
        r1 = new java.lang.IllegalStateException;
        r2 = "Unhandled SpectaclesManageState";
        r1.<init>(r2);
        r1 = (java.lang.Throwable) r1;
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesManageFragment.a(xmz):void");
    }

    public final void a(boolean z) {
        View view = this.D;
        if (view == null) {
            akcr.a("enableLocationSpinner");
        }
        view.setVisibility(8);
        CheckBox checkBox = this.B;
        String str = "enableLocationCheckbox";
        if (checkBox == null) {
            akcr.a(str);
        }
        checkBox.setVisibility(0);
        checkBox = this.B;
        if (checkBox == null) {
            akcr.a(str);
        }
        checkBox.setChecked(z);
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        SpectaclesManagePresenter spectaclesManagePresenter = this.b;
        if (spectaclesManagePresenter == null) {
            akcr.a("managePresenter");
        }
        ajej i = ajdj.b((Callable) new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.p(spectaclesManagePresenter)).f(com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.q.a).b((ajdw) spectaclesManagePresenter.d().h()).a((ajdw) spectaclesManagePresenter.d().l()).f(new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.r(spectaclesManagePresenter)).a(spectaclesManagePresenter.c().i()).a((ajfl) new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.s(spectaclesManagePresenter)).f(new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.t(spectaclesManagePresenter)).i();
        akcr.a((Object) i, "Maybe.fromCallable<Spect…             .subscribe()");
        ajvv.a(i, spectaclesManagePresenter.g);
        spectaclesManagePresenter.g.a(spectaclesManagePresenter.c().e().j().b(spectaclesManagePresenter.c().i()).a((ajfl) new aj(spectaclesManagePresenter)).f((ajfb) new ak(spectaclesManagePresenter)));
        spectaclesManagePresenter.g.a(spectaclesManagePresenter.c().e().g().b(spectaclesManagePresenter.c().i()).a((ajfl) new ah(spectaclesManagePresenter)).f((ajfb) new ai(spectaclesManagePresenter)));
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        SpectaclesManagePresenter spectaclesManagePresenter = this.b;
        if (spectaclesManagePresenter == null) {
            akcr.a("managePresenter");
        }
        spectaclesManagePresenter.g.a();
    }

    public final void b(String str) {
        akcr.b(str, "latestVersion");
        zjm zjm = new zjm(xai.f, "firmware_update_failed", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str2 = "navigationHost";
        if (achb == null) {
            akcr.a(str2);
        }
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, achb, zjm, false, null, 24);
        String string = getString(R.string.laguna_update_version, string);
        akcr.a((Object) string, "getString(com.snap.spect…e_version, latestVersion)");
        zgy a = aVar.a(string).b((int) R.string.laguna_update_error).a((int) R.string.okay, (akbl) ab.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str2);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final achb<zjm, zjk> h() {
        achb achb = this.a;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        return achb;
    }

    public final SpectaclesManagePresenter i() {
        SpectaclesManagePresenter spectaclesManagePresenter = this.b;
        if (spectaclesManagePresenter == null) {
            akcr.a("managePresenter");
        }
        return spectaclesManagePresenter;
    }

    public final void j() {
        View view = this.e;
        if (view == null) {
            akcr.a("forgetSpecsContainer");
        }
        view.setClickable(true);
        view = this.f;
        if (view == null) {
            akcr.a("unpairSpecsSpinner");
        }
        view.setVisibility(8);
        zjm zjm = new zjm(xai.f, "spectacles_unpair_error", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.laguna_unpair_error_title).b((int) R.string.laguna_unpair_error_body).a((int) R.string.okay, (akbl) y.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void k() {
        View view = this.q;
        if (view == null) {
            akcr.a("clearContentSpinner");
        }
        view.setVisibility(0);
        view = this.o;
        if (view == null) {
            akcr.a("clearContentContainer");
        }
        view.setClickable(false);
    }

    public final void l() {
        zjm zjm = new zjm(xai.f, "firmware_update_unexpected_version_received", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.laguna_metadata_check_failed).b((int) R.string.laguna_retry_checking_for_updates).a((int) R.string.okay, (akbl) x.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void m() {
        zjm zjm = new zjm(xai.f, "firmware_update_download_failed", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.update_failed_to_download).b((int) R.string.firmware_update_something_went_wrong).a((int) R.string.okay, (akbl) n.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void n() {
        zjm zjm = new zjm(xai.f, "spectacles_snaps_importing", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).b((int) R.string.snaps_importing).a((int) R.string.okay, (akbl) v.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb achb3 = this.a;
        if (achb3 == null) {
            akcr.a(str);
        }
        achb2.b((acig) new acip(achb3, a, a.a));
    }

    public final void o() {
        zjm zjm = new zjm(xai.f, "spectacles_no_update_available", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).b((int) R.string.no_updates_found).a((int) R.string.okay, (akbl) s.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        SpectaclesManagePresenter spectaclesManagePresenter = this.b;
        String str = "managePresenter";
        if (spectaclesManagePresenter == null) {
            akcr.a(str);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            akcr.a();
        }
        Object string = arguments.getString("ARG_KEY_DEVICE_SERIAL_NUMBER");
        akcr.a(string, "arguments!!.getString(AR…KEY_DEVICE_SERIAL_NUMBER)");
        akcr.b(string, "<set-?>");
        spectaclesManagePresenter.a = string;
        spectaclesManagePresenter = this.b;
        if (spectaclesManagePresenter == null) {
            akcr.a(str);
        }
        spectaclesManagePresenter.takeTarget((xmg) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.manage_spectacles_fragment, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.laguna_check_for_updates);
        akcr.a(findViewById, "view.findViewById(R.id.laguna_check_for_updates)");
        this.j = findViewById;
        View findViewById2 = inflate.findViewById(R.id.laguna_check_for_updates_text);
        String str = "null cannot be cast to non-null type android.widget.TextView";
        if (findViewById2 != null) {
            this.k = (TextView) findViewById2;
            findViewById = inflate.findViewById(R.id.laguna_update_available_sign_icon);
            akcr.a(findViewById, "view.findViewById(R.id.l…date_available_sign_icon)");
            this.l = findViewById;
            findViewById = inflate.findViewById(R.id.laguna_check_for_updates_spinner);
            akcr.a(findViewById, "view.findViewById(R.id.l…heck_for_updates_spinner)");
            this.m = findViewById;
            findViewById2 = inflate.findViewById(R.id.laguna_updating_progress_text);
            if (findViewById2 != null) {
                this.n = (TextView) findViewById2;
                findViewById = inflate.findViewById(R.id.laguna_clear_content);
                akcr.a(findViewById, "view.findViewById(R.id.laguna_clear_content)");
                this.o = findViewById;
                findViewById2 = inflate.findViewById(R.id.laguna_clear_content_text);
                if (findViewById2 != null) {
                    this.p = (TextView) findViewById2;
                    findViewById = inflate.findViewById(R.id.laguna_clear_content_spinner);
                    akcr.a(findViewById, "view.findViewById(R.id.l…na_clear_content_spinner)");
                    this.q = findViewById;
                    findViewById = inflate.findViewById(R.id.laguna_restart_specs);
                    akcr.a(findViewById, "view.findViewById(R.id.laguna_restart_specs)");
                    this.r = findViewById;
                    findViewById2 = inflate.findViewById(R.id.laguna_restart_specs_text);
                    if (findViewById2 != null) {
                        this.s = (TextView) findViewById2;
                        findViewById = inflate.findViewById(R.id.laguna_restart_spinner);
                        akcr.a(findViewById, "view.findViewById(R.id.laguna_restart_spinner)");
                        this.t = findViewById;
                        findViewById2 = inflate.findViewById(R.id.spectacles_manage_device_info);
                        if (findViewById2 != null) {
                            this.v = (TextView) findViewById2;
                            findViewById = inflate.findViewById(R.id.laguna_forget_spectacles);
                            akcr.a(findViewById, "view.findViewById(R.id.laguna_forget_spectacles)");
                            this.e = findViewById;
                            findViewById2 = inflate.findViewById(R.id.laguna_forget_specs_text);
                            if (findViewById2 != null) {
                                this.u = (TextView) findViewById2;
                                findViewById = inflate.findViewById(R.id.laguna_unpair_spinner);
                                akcr.a(findViewById, "view.findViewById(R.id.laguna_unpair_spinner)");
                                this.f = findViewById;
                                findViewById2 = inflate.findViewById(R.id.spectacles_manage_sc_header);
                                if (findViewById2 != null) {
                                    this.w = (ScHeaderView) findViewById2;
                                    findViewById = inflate.findViewById(R.id.spectacles_save_to_cell);
                                    akcr.a(findViewById, "view.findViewById(R.id.spectacles_save_to_cell)");
                                    this.x = findViewById;
                                    findViewById2 = inflate.findViewById(R.id.spectacles_save_to_status);
                                    if (findViewById2 != null) {
                                        this.y = (TextView) findViewById2;
                                        findViewById = inflate.findViewById(R.id.spectacles_notification_cell);
                                        akcr.a(findViewById, "view.findViewById(R.id.s…tacles_notification_cell)");
                                        this.z = findViewById;
                                        findViewById = inflate.findViewById(R.id.spectacles_device_settings_section_container);
                                        akcr.a(findViewById, "view.findViewById(R.id.s…ttings_section_container)");
                                        this.A = findViewById;
                                        findViewById2 = inflate.findViewById(R.id.spectacles_enable_location_checkbox);
                                        if (findViewById2 != null) {
                                            this.B = (CheckBox) findViewById2;
                                            findViewById = inflate.findViewById(R.id.spectacles_location_enabled_snaps_text);
                                            akcr.a(findViewById, "view.findViewById(R.id.s…ation_enabled_snaps_text)");
                                            this.C = (TextView) findViewById;
                                            findViewById = inflate.findViewById(R.id.spectacles_enable_location_spinner);
                                            akcr.a(findViewById, "view.findViewById(R.id.s…_enable_location_spinner)");
                                            this.D = findViewById;
                                            findViewById = inflate.findViewById(R.id.spectacles_location_data_description);
                                            akcr.a(findViewById, "view.findViewById(R.id.s…ocation_data_description)");
                                            this.E = findViewById;
                                            findViewById2 = this.x;
                                            if (findViewById2 == null) {
                                                akcr.a("saveToSelectionView");
                                            }
                                            findViewById2.setOnClickListener(new c(this));
                                            findViewById2 = this.z;
                                            if (findViewById2 == null) {
                                                akcr.a("notificationSettingsView");
                                            }
                                            findViewById2.setOnClickListener(new d(this));
                                            findViewById2 = this.j;
                                            if (findViewById2 == null) {
                                                akcr.a("checkForUpdatesContainer");
                                            }
                                            findViewById2.setOnClickListener(new e(this));
                                            findViewById2 = this.o;
                                            if (findViewById2 == null) {
                                                akcr.a("clearContentContainer");
                                            }
                                            findViewById2.setOnClickListener(new f(this));
                                            findViewById2 = this.r;
                                            if (findViewById2 == null) {
                                                akcr.a("restartSpecsContainer");
                                            }
                                            findViewById2.setOnClickListener(new g(this));
                                            findViewById2 = this.e;
                                            if (findViewById2 == null) {
                                                akcr.a("forgetSpecsContainer");
                                            }
                                            findViewById2.setOnClickListener(new h(this));
                                            ScHeaderView scHeaderView = this.w;
                                            String str2 = "scHeaderView";
                                            if (scHeaderView == null) {
                                                akcr.a(str2);
                                            }
                                            scHeaderView.setOnClickListener(new i(this));
                                            scHeaderView = this.w;
                                            if (scHeaderView == null) {
                                                akcr.a(str2);
                                            }
                                            findViewById2 = scHeaderView.findViewById(R.id.sc_header_title);
                                            if (findViewById2 != null) {
                                                TextView textView = (TextView) findViewById2;
                                                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.spectacles_rename, 0);
                                                textView.setCompoundDrawablePadding(getResources().getDimensionPixelOffset(R.dimen.default_gap_half));
                                                CheckBox checkBox = this.B;
                                                if (checkBox == null) {
                                                    akcr.a("enableLocationCheckbox");
                                                }
                                                checkBox.setOnCheckedChangeListener(this.F);
                                                return inflate;
                                            }
                                            throw new ajxt(str);
                                        }
                                        throw new ajxt("null cannot be cast to non-null type android.widget.CheckBox");
                                    }
                                    throw new ajxt(str);
                                }
                                throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.ScHeaderView");
                            }
                            throw new ajxt(str);
                        }
                        throw new ajxt(str);
                    }
                    throw new ajxt(str);
                }
                throw new ajxt(str);
            }
            throw new ajxt(str);
        }
        throw new ajxt(str);
    }

    public final void onDetach() {
        super.onDetach();
        SpectaclesManagePresenter spectaclesManagePresenter = this.b;
        if (spectaclesManagePresenter == null) {
            akcr.a("managePresenter");
        }
        spectaclesManagePresenter.dropTarget();
    }

    public final void p() {
        zjm zjm = new zjm(xai.f, "please_try_again", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.update_failed_to_download).b((int) R.string.firmware_update_something_went_wrong).a((int) R.string.okay, (akbl) t.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void q() {
        zjm zjm = new zjm(xai.f, "spectacles_no_connection_found", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).b((int) R.string.spectacles_network_unreachable).a((int) R.string.okay, (akbl) r.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void r() {
        zjm zjm = new zjm(xai.f, "spectacles_incorrect_tag", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a("Incorrect Firmware Tag Selected").b("The selected firmware tag does not apply to this version of Spectacles. Please select an appropriate tag from tweaks.").a((int) R.string.okay, (akbl) q.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void s() {
        zjm zjm = new zjm(xai.f, "firmware_update_failed_battery_hot", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.spectacles_too_hot).b((int) R.string.spectacles_firmware_update_battery_too_hot).a((int) R.string.okay, (akbl) aa.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb achb3 = this.a;
        if (achb3 == null) {
            akcr.a(str);
        }
        achb2.b((acig) new acip(achb3, a, a.a));
    }

    public final void t() {
        zjm zjm = new zjm(xai.f, "firmware_update_failed_battery_cold", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.spectacles_too_cold).b((int) R.string.spectacles_firmware_update_battery_too_cold).a((int) R.string.okay, (akbl) z.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb achb3 = this.a;
        if (achb3 == null) {
            akcr.a(str);
        }
        achb2.b((acig) new acip(achb3, a, a.a));
    }

    public final void u() {
        zjm zjm = new zjm(xai.f, "firmware_update_failed_phone_storage_low", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.low_phone_storage_title).b((int) R.string.spectacles_firmware_update_phone_storage_low).a((int) R.string.okay, (akbl) ad.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb achb3 = this.a;
        if (achb3 == null) {
            akcr.a(str);
        }
        achb2.b((acig) new acip(achb3, a, a.a));
    }

    public final void v() {
        zjm zjm = new zjm(xai.f, "spectacles_setting_location_failed", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).b((int) R.string.spectacles_settings_location_failed).a((int) R.string.okay, (akbl) u.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb achb3 = this.a;
        if (achb3 == null) {
            akcr.a(str);
        }
        achb2.b((acig) new acip(achb3, a, a.a));
    }
}
