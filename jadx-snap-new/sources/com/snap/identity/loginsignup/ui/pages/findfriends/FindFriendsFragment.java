package com.snap.identity.loginsignup.ui.pages.findfriends;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import defpackage.jez;
import defpackage.jrl;
import defpackage.zjk;
import defpackage.zjm;

public final class FindFriendsFragment extends SignupFragment implements jez {
    public FindFriendsPresenter a;
    private RecyclerView c;
    private View d;
    private ProgressButton e;

    public final RecyclerView a() {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            akcr.a("addFriendsRecyclerView");
        }
        return recyclerView;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        FindFriendsPresenter findFriendsPresenter = this.a;
        if (findFriendsPresenter == null) {
            akcr.a("presenter");
        }
        jrl.a((Context) findFriendsPresenter.f.get());
    }

    public final View b() {
        View view = this.d;
        if (view == null) {
            akcr.a("skipButton");
        }
        return view;
    }

    public final ProgressButton c() {
        ProgressButton progressButton = this.e;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_FIND_FRIENDS_SNAPCHATTERS;
    }

    public final boolean o_() {
        FindFriendsPresenter findFriendsPresenter = this.a;
        if (findFriendsPresenter == null) {
            akcr.a("presenter");
        }
        if (findFriendsPresenter.d) {
            findFriendsPresenter.b();
        } else {
            findFriendsPresenter.c();
        }
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        FindFriendsPresenter findFriendsPresenter = this.a;
        if (findFriendsPresenter == null) {
            akcr.a("presenter");
        }
        findFriendsPresenter.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.fragment_find_friends, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        String str = "<set-?>";
        akcr.b(recyclerView, str);
        this.c = recyclerView;
        findViewById = inflate.findViewById(R.id.skip_button);
        akcr.a(findViewById, "view.findViewById(R.id.skip_button)");
        akcr.b(findViewById, str);
        this.d = findViewById;
        findViewById = inflate.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.e = progressButton;
        c().setState(1);
        akcr.a(inflate, "view");
        return inflate;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        FindFriendsPresenter findFriendsPresenter = this.a;
        if (findFriendsPresenter == null) {
            akcr.a("presenter");
        }
        findFriendsPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        a().setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
