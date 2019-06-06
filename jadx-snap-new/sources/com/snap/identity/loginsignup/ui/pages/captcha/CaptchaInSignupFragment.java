package com.snap.identity.loginsignup.ui.pages.captcha;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.SignupFragment;
import com.snap.ui.view.LoadingSpinnerView;
import com.snap.ui.view.button.ScButton;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jeo;
import defpackage.jrl;
import defpackage.zjk;
import defpackage.zjm;

public final class CaptchaInSignupFragment extends SignupFragment implements jeo {
    public CaptchaInSignupPresenter a;
    private ImageView c;
    private TextView d;
    private View e;
    private LoadingSpinnerView f;
    private TextView g;
    private ScButton h;
    private ProgressButton i;
    private RecyclerView j;

    public final ImageView a() {
        ImageView imageView = this.c;
        if (imageView == null) {
            akcr.a("headerIcon");
        }
        return imageView;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        CaptchaInSignupPresenter captchaInSignupPresenter = this.a;
        if (captchaInSignupPresenter == null) {
            akcr.a("presenter");
        }
        jrl.a((Context) captchaInSignupPresenter.g.get());
    }

    public final TextView b() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("taskDesc");
        }
        return textView;
    }

    public final View c() {
        View view = this.e;
        if (view == null) {
            akcr.a("loadingView");
        }
        return view;
    }

    public final LoadingSpinnerView d() {
        LoadingSpinnerView loadingSpinnerView = this.f;
        if (loadingSpinnerView == null) {
            akcr.a("spinnerView");
        }
        return loadingSpinnerView;
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_CAPTCHA;
    }

    public final TextView g() {
        TextView textView = this.g;
        if (textView == null) {
            akcr.a("failedDownloadDesc");
        }
        return textView;
    }

    public final ScButton h() {
        ScButton scButton = this.h;
        if (scButton == null) {
            akcr.a("retryButton");
        }
        return scButton;
    }

    public final ProgressButton i() {
        ProgressButton progressButton = this.i;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final RecyclerView j() {
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            akcr.a("captchaRecyclerView");
        }
        return recyclerView;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        CaptchaInSignupPresenter captchaInSignupPresenter = this.a;
        if (captchaInSignupPresenter == null) {
            akcr.a("presenter");
        }
        captchaInSignupPresenter.takeTarget((jeo) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_signup_captcha, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        CaptchaInSignupPresenter captchaInSignupPresenter = this.a;
        if (captchaInSignupPresenter == null) {
            akcr.a("presenter");
        }
        captchaInSignupPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.header_icon);
        akcr.a(findViewById, "view.findViewById(R.id.header_icon)");
        ImageView imageView = (ImageView) findViewById;
        String str = "<set-?>";
        akcr.b(imageView, str);
        this.c = imageView;
        findViewById = view.findViewById(R.id.description);
        akcr.a(findViewById, "view.findViewById(R.id.description)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.loading_area);
        akcr.a(findViewById, "view.findViewById(R.id.loading_area)");
        akcr.b(findViewById, str);
        this.e = findViewById;
        findViewById = view.findViewById(R.id.progress_bar);
        akcr.a(findViewById, "view.findViewById(R.id.progress_bar)");
        LoadingSpinnerView loadingSpinnerView = (LoadingSpinnerView) findViewById;
        akcr.b(loadingSpinnerView, str);
        this.f = loadingSpinnerView;
        findViewById = view.findViewById(R.id.failed_download);
        akcr.a(findViewById, "view.findViewById(R.id.failed_download)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.g = textView;
        findViewById = view.findViewById(R.id.retry_button);
        akcr.a(findViewById, "view.findViewById(R.id.retry_button)");
        ScButton scButton = (ScButton) findViewById;
        akcr.b(scButton, str);
        this.h = scButton;
        findViewById = view.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.i = progressButton;
        Object findViewById2 = view.findViewById(R.id.snapcha_grid);
        akcr.a(findViewById2, "view.findViewById(R.id.snapcha_grid)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        akcr.b(recyclerView, str);
        this.j = recyclerView;
    }
}
