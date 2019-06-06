package com.snap.identity.ui.profile.verifyphone;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snap.identity.api.sharedui.SubmitResendButton;
import com.snap.identity.api.sharedui.VerificationCodeEditTextView;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajfc;
import defpackage.ajxw;
import defpackage.akcr;
import defpackage.cfl;
import defpackage.jlp;
import defpackage.jrl;
import defpackage.zjq;
import org.opencv.imgproc.Imgproc;

public final class VerifyPhoneFragment extends MainPageFragment implements jlp, zjq {
    public VerifyPhonePresenter a;
    private VerificationCodeEditTextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private SubmitResendButton f;
    private View g;

    static final class a implements OnSystemUiVisibilityChangeListener {
        private /* synthetic */ VerifyPhoneFragment a;

        a(VerifyPhoneFragment verifyPhoneFragment) {
            this.a = verifyPhoneFragment;
        }

        public final void onSystemUiVisibilityChange(int i) {
            this.a.h();
        }
    }

    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ VerifyPhoneFragment a;

        b(VerifyPhoneFragment verifyPhoneFragment) {
            this.a = verifyPhoneFragment;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b(obj, "<anonymous parameter 0>");
            FragmentActivity activity = this.a.getActivity();
            if (activity == null) {
                return null;
            }
            activity.onBackPressed();
            return ajxw.a;
        }
    }

    private final void i() {
        Object activity = getActivity();
        if (activity != null) {
            akcr.a(activity, "it");
            activity = activity.getWindow();
            akcr.a(activity, "it.window");
            activity.getDecorView().setOnSystemUiVisibilityChangeListener(new a(this));
        }
    }

    public final long S_() {
        return -1;
    }

    public final VerificationCodeEditTextView a() {
        VerificationCodeEditTextView verificationCodeEditTextView = this.b;
        if (verificationCodeEditTextView == null) {
            akcr.a("codeField");
        }
        return verificationCodeEditTextView;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("errorField");
        }
        return textView;
    }

    public final TextView d() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("description");
        }
        return textView;
    }

    public final TextView f() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("altText");
        }
        return textView;
    }

    public final SubmitResendButton g() {
        SubmitResendButton submitResendButton = this.f;
        if (submitResendButton == null) {
            akcr.a("continueButton");
        }
        return submitResendButton;
    }

    /* Access modifiers changed, original: final */
    public final void h() {
        Object activity = getActivity();
        if (activity != null) {
            VerificationCodeEditTextView a = a();
            akcr.a(activity, "it");
            Object window = activity.getWindow();
            akcr.a(window, "it.window");
            window = window.getDecorView();
            akcr.a(window, "it.window.decorView");
            a.setSystemUiVisibility(window.getSystemUiVisibility() | 7429);
            activity.getWindow().clearFlags(ItemAnimator.FLAG_MOVED);
        }
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        VerifyPhonePresenter verifyPhonePresenter = this.a;
        if (verifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        verifyPhonePresenter.takeTarget((jlp) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.inapp_verify_phone, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        VerifyPhonePresenter verifyPhonePresenter = this.a;
        if (verifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        verifyPhonePresenter.dropTarget();
    }

    public final void onResume() {
        super.onResume();
        i();
        h();
    }

    public final void onStart() {
        super.onStart();
        i();
        h();
        jrl.a(getContext());
        View view = this.g;
        if (view == null) {
            akcr.a("backButton");
        }
        ScopedFragment.a((ScopedFragment) this, cfl.c(view).p(new b(this)).l(), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_STOP);
    }

    public final void onStop() {
        super.onStop();
        Object activity = getActivity();
        String str = "it";
        String str2 = "it.window";
        if (activity != null) {
            akcr.a(activity, str);
            activity = activity.getWindow();
            akcr.a(activity, str2);
            activity.getDecorView().setOnSystemUiVisibilityChangeListener(null);
        }
        activity = getActivity();
        if (activity != null) {
            akcr.a(activity, str);
            Object window = activity.getWindow();
            akcr.a(window, str2);
            window = window.getDecorView();
            String str3 = "it.window.decorView";
            akcr.a(window, str3);
            Object window2 = activity.getWindow();
            akcr.a(window2, str2);
            Object decorView = window2.getDecorView();
            akcr.a(decorView, str3);
            window.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
            activity.getWindow().clearFlags(Imgproc.INTER_TAB_SIZE2);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.code_field);
        akcr.a(findViewById, "view.findViewById(R.id.code_field)");
        VerificationCodeEditTextView verificationCodeEditTextView = (VerificationCodeEditTextView) findViewById;
        String str = "<set-?>";
        akcr.b(verificationCodeEditTextView, str);
        this.b = verificationCodeEditTextView;
        findViewById = view.findViewById(R.id.error_field);
        akcr.a(findViewById, "view.findViewById(R.id.error_field)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.description);
        akcr.a(findViewById, "view.findViewById(R.id.description)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.alt_text);
        akcr.a(findViewById, "view.findViewById(R.id.alt_text)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.e = textView;
        findViewById = view.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        SubmitResendButton submitResendButton = (SubmitResendButton) findViewById;
        akcr.b(submitResendButton, str);
        this.f = submitResendButton;
        Object findViewById2 = view.findViewById(R.id.back_button);
        akcr.a(findViewById2, "view.findViewById(R.id.back_button)");
        this.g = findViewById2;
        findViewById2 = getActivity();
        if (findViewById2 != null) {
            akcr.a(findViewById2, "it");
            findViewById2.getWindow().setSoftInputMode(16);
        }
    }
}
