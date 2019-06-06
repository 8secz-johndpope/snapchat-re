package com.snap.identity.loginsignup.ui.pages.username;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.SignupFragment;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jbw;
import defpackage.jgy;
import defpackage.zjk;
import defpackage.zjm;

public final class UsernameFragment extends SignupFragment implements jgy {
    public UsernamePresenter a;
    private EditText c;
    private TextView d;
    private TextView e;
    private ProgressButton f;
    private View g;
    private View h;
    private View i;
    private TextView j;
    private TextView k;
    private TextView l;

    public final EditText a() {
        EditText editText = this.c;
        if (editText == null) {
            akcr.a("username");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        UsernamePresenter usernamePresenter = this.a;
        if (usernamePresenter == null) {
            akcr.a("presenter");
        }
        usernamePresenter.f = true;
        usernamePresenter.b();
        usernamePresenter.f = false;
    }

    public final TextView b() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("error");
        }
        return textView;
    }

    public final TextView c() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("usernameAvailable");
        }
        return textView;
    }

    public final ProgressButton d() {
        ProgressButton progressButton = this.f;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_SIGNUP_USERNAME;
    }

    public final View g() {
        View view = this.g;
        if (view == null) {
            akcr.a("refreshButton");
        }
        return view;
    }

    public final View h() {
        View view = this.h;
        if (view == null) {
            akcr.a("usernameCheckingProgressBar");
        }
        return view;
    }

    public final View k() {
        View view = this.i;
        if (view == null) {
            akcr.a("suggestionTitle");
        }
        return view;
    }

    public final TextView l() {
        TextView textView = this.j;
        if (textView == null) {
            akcr.a("suggestionOne");
        }
        return textView;
    }

    public final TextView m() {
        TextView textView = this.k;
        if (textView == null) {
            akcr.a("suggestionTwo");
        }
        return textView;
    }

    public final TextView n() {
        TextView textView = this.l;
        if (textView == null) {
            akcr.a("suggestionThree");
        }
        return textView;
    }

    public final boolean o_() {
        UsernamePresenter usernamePresenter = this.a;
        if (usernamePresenter == null) {
            akcr.a("presenter");
        }
        ((jbw) usernamePresenter.i.get()).c(usernamePresenter.b);
        return super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        UsernamePresenter usernamePresenter = this.a;
        if (usernamePresenter == null) {
            akcr.a("presenter");
        }
        usernamePresenter.takeTarget((jgy) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_signup_username, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        UsernamePresenter usernamePresenter = this.a;
        if (usernamePresenter == null) {
            akcr.a("presenter");
        }
        usernamePresenter.dropTarget();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.username_form_field);
        akcr.a(findViewById, "view.findViewById(R.id.username_form_field)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.c = editText;
        findViewById = view.findViewById(R.id.username_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.username_error_message)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.username_available_subtext);
        akcr.a(findViewById, "view.findViewById(R.id.username_available_subtext)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.e = textView;
        findViewById = view.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.f = progressButton;
        findViewById = view.findViewById(R.id.username_refresh_button);
        akcr.a(findViewById, "view.findViewById(R.id.username_refresh_button)");
        akcr.b(findViewById, str);
        this.g = findViewById;
        findViewById = view.findViewById(R.id.username_checking_progressbar);
        akcr.a(findViewById, "view.findViewById(R.id.u…ame_checking_progressbar)");
        akcr.b(findViewById, str);
        this.h = findViewById;
        findViewById = view.findViewById(R.id.suggested_username_title);
        akcr.a(findViewById, "view.findViewById(R.id.suggested_username_title)");
        akcr.b(findViewById, str);
        this.i = findViewById;
        findViewById = view.findViewById(R.id.suggested_username_one);
        akcr.a(findViewById, "view.findViewById(R.id.suggested_username_one)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.j = textView;
        findViewById = view.findViewById(R.id.suggested_username_two);
        akcr.a(findViewById, "view.findViewById(R.id.suggested_username_two)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.k = textView;
        Object findViewById2 = view.findViewById(R.id.suggested_username_three);
        akcr.a(findViewById2, "view.findViewById(R.id.suggested_username_three)");
        TextView textView2 = (TextView) findViewById2;
        akcr.b(textView2, str);
        this.l = textView2;
    }
}
