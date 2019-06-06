package com.snap.identity.loginsignup.ui.pages.permissions;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.SignupFragment;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jgr;
import defpackage.jrl;
import defpackage.zjk;
import defpackage.zjm;

public final class PermissionsFragment extends SignupFragment implements jgr {
    public PermissionsPresenter a;
    private ProgressButton c;

    public final ProgressButton a() {
        ProgressButton progressButton = this.c;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        PermissionsPresenter permissionsPresenter = this.a;
        if (permissionsPresenter == null) {
            akcr.a("presenter");
        }
        jrl.a(permissionsPresenter.c);
    }

    public final aaua f() {
        return aaua.REGISTRATION_PERMISSIONS;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        PermissionsPresenter permissionsPresenter = this.a;
        if (permissionsPresenter == null) {
            akcr.a("presenter");
        }
        permissionsPresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_permissions, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        PermissionsPresenter permissionsPresenter = this.a;
        if (permissionsPresenter == null) {
            akcr.a("presenter");
        }
        permissionsPresenter.dropTarget();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, "<set-?>");
        this.c = progressButton;
    }
}
