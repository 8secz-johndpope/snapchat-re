package com.snap.loginkit.lib.ui.settings.connectedapps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.snap.loginkit.lib.net.SnapKitHttpInterface;
import com.snap.loginkit.lib.net.SnapKitHttpInterface.DefaultImpls;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.absi;
import defpackage.abur;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.nin;
import defpackage.wjd;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zln;

public final class SettingsConnectedAppsFragment extends MainPageFragment implements nin {
    public SettingsConnectedAppsPresenter a;
    private final ajxe b = ajxh.a(new b(this));
    private final ajxe c = ajxh.a(new a(this));
    private final ajxe d = ajxh.a(new c(this));

    static final class a extends akcs implements akbk<abur<View>> {
        private /* synthetic */ SettingsConnectedAppsFragment a;

        a(SettingsConnectedAppsFragment settingsConnectedAppsFragment) {
            this.a = settingsConnectedAppsFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.a.getView();
            return view != null ? new abur(view, (int) R.id.snap_kit_settings_connected_apps_view_stub, (int) R.id.snap_kit_connected_apps_view) : null;
        }
    }

    static final class b extends akcs implements akbk<LoadingSpinnerView> {
        private /* synthetic */ SettingsConnectedAppsFragment a;

        b(SettingsConnectedAppsFragment settingsConnectedAppsFragment) {
            this.a = settingsConnectedAppsFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.a.getView();
            return view != null ? (LoadingSpinnerView) view.findViewById(R.id.snap_kit_settings_spinner) : null;
        }
    }

    static final class c extends akcs implements akbk<abur<View>> {
        private /* synthetic */ SettingsConnectedAppsFragment a;

        c(SettingsConnectedAppsFragment settingsConnectedAppsFragment) {
            this.a = settingsConnectedAppsFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.a.getView();
            return view != null ? new abur(view, (int) R.id.snap_kit_settings_privacy_explainer_stub, (int) R.id.snap_kit_privacy_explainer) : null;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SettingsConnectedAppsFragment.class), "loadingView", "getLoadingView()Lcom/snap/ui/view/LoadingSpinnerView;"), new akdc(akde.a(SettingsConnectedAppsFragment.class), "connectedAppsLazyViewWrapper", "getConnectedAppsLazyViewWrapper()Lcom/snapchat/android/framework/ui/views/LazyViewWrapper;"), new akdc(akde.a(SettingsConnectedAppsFragment.class), "privacyExplainerLazyViewWrapper", "getPrivacyExplainerLazyViewWrapper()Lcom/snapchat/android/framework/ui/views/LazyViewWrapper;")};
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        SettingsConnectedAppsPresenter settingsConnectedAppsPresenter = this.a;
        if (settingsConnectedAppsPresenter == null) {
            akcr.a("presenter");
        }
        SnapKitHttpInterface snapKitHttpInterface = (SnapKitHttpInterface) settingsConnectedAppsPresenter.c.get();
        Object a = wjd.LOGIN_KIT.a();
        akcr.a(a, "SnapTokenAccessTokenScop…N_KIT.serverSideScopeName");
        zln.bindTo$default(settingsConnectedAppsPresenter, DefaultImpls.fetchConnectedApps$default(snapKitHttpInterface, null, a, 1, null).b((ajdw) settingsConnectedAppsPresenter.a.g()).a((ajdw) settingsConnectedAppsPresenter.a.l()).a((ajfb) new c(settingsConnectedAppsPresenter), (ajfb) new d(settingsConnectedAppsPresenter)), settingsConnectedAppsPresenter, null, null, 6, null);
    }

    public final Context b() {
        return getActivity();
    }

    public final LoadingSpinnerView c() {
        return (LoadingSpinnerView) this.b.b();
    }

    public final abur<View> d() {
        return (abur) this.c.b();
    }

    public final abur<View> f() {
        return (abur) this.d.b();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        SettingsConnectedAppsPresenter settingsConnectedAppsPresenter = this.a;
        if (settingsConnectedAppsPresenter == null) {
            akcr.a("presenter");
        }
        settingsConnectedAppsPresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mushroom_settings_connected_apps, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        SettingsConnectedAppsPresenter settingsConnectedAppsPresenter = this.a;
        if (settingsConnectedAppsPresenter == null) {
            akcr.a("presenter");
        }
        settingsConnectedAppsPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.navbar_inset);
        akcr.a(findViewById, "navBarInsetView");
        Object a = absi.a();
        akcr.a(a, "SoftNavBarDetector.getInstance()");
        findViewById.setLayoutParams(new LayoutParams(-1, a.d()));
    }
}
