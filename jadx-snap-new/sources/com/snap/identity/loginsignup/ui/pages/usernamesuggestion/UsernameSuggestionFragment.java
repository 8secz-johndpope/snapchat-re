package com.snap.identity.loginsignup.ui.pages.usernamesuggestion;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.SignupFragment;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jgz;
import defpackage.jrl;
import defpackage.zjk;
import defpackage.zjm;

public final class UsernameSuggestionFragment extends SignupFragment implements jgz {
    public UsernameSuggestionPresenter a;
    private TextView c;
    private View d;
    private ProgressButton e;

    public final TextView a() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("usernameSuggestionView");
        }
        return textView;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        UsernameSuggestionPresenter usernameSuggestionPresenter = this.a;
        if (usernameSuggestionPresenter == null) {
            akcr.a("presenter");
        }
        jrl.a((Context) usernameSuggestionPresenter.c.get());
    }

    public final View b() {
        View view = this.d;
        if (view == null) {
            akcr.a("changeUsernameLink");
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
        return aaua.REGISTRATION_USER_SIGNUP_SUGGEST_USERNAME;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        UsernameSuggestionPresenter usernameSuggestionPresenter = this.a;
        if (usernameSuggestionPresenter == null) {
            akcr.a("presenter");
        }
        usernameSuggestionPresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_signup_username_suggestion, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        UsernameSuggestionPresenter usernameSuggestionPresenter = this.a;
        if (usernameSuggestionPresenter == null) {
            akcr.a("presenter");
        }
        usernameSuggestionPresenter.dropTarget();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.username_suggestion);
        akcr.a(findViewById, "view.findViewById(R.id.username_suggestion)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.change_username_link);
        akcr.a(findViewById, "view.findViewById(R.id.change_username_link)");
        akcr.b(findViewById, str);
        this.d = findViewById;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById2;
        akcr.b(progressButton, str);
        this.e = progressButton;
        UsernameSuggestionPresenter usernameSuggestionPresenter = this.a;
        if (usernameSuggestionPresenter == null) {
            akcr.a("presenter");
        }
        jgz jgz = (jgz) usernameSuggestionPresenter.getTarget();
        if (jgz == null) {
            akcr.a();
        }
        TextView a = jgz.a();
        String str2 = usernameSuggestionPresenter.a;
        if (str2 == null) {
            akcr.a("usernameSuggestion");
        }
        a.setText(str2);
        jgz.b().setOnClickListener(new a(usernameSuggestionPresenter));
        jgz.c().setOnClickListener(new b(usernameSuggestionPresenter));
        jgz.c().setState(1);
    }
}
