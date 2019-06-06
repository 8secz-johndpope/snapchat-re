package com.snap.identity.loginsignup.ui.pages.forgotpassword.setphone;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snap.identity.ui.shared.phonenumber.PhonePickerView;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jfp;
import defpackage.jun;
import defpackage.zjk;
import defpackage.zjm;

public final class ForgotPasswordSetPhoneFragment extends LoginSignupFragment implements jfp {
    public ForgotPasswordSetPhonePresenter a;
    private PhonePickerView b;
    private TextView c;
    private ProgressButton d;

    public final PhonePickerView a() {
        PhonePickerView phonePickerView = this.b;
        if (phonePickerView == null) {
            akcr.a("phonePickerView");
        }
        return phonePickerView;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter = this.a;
        if (forgotPasswordSetPhonePresenter == null) {
            akcr.a("presenter");
        }
        forgotPasswordSetPhonePresenter.e = true;
        forgotPasswordSetPhonePresenter.a();
        forgotPasswordSetPhonePresenter.e = false;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a(Event.ERROR_MESSAGE);
        }
        return textView;
    }

    public final ProgressButton c() {
        ProgressButton progressButton = this.d;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final boolean o_() {
        ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter = this.a;
        if (forgotPasswordSetPhonePresenter == null) {
            akcr.a("presenter");
        }
        ((jun) forgotPasswordSetPhonePresenter.l.get()).a(forgotPasswordSetPhonePresenter.g);
        return false;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter = this.a;
        if (forgotPasswordSetPhonePresenter == null) {
            akcr.a("presenter");
        }
        forgotPasswordSetPhonePresenter.takeTarget((jfp) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_set_phone_pre_login, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter = this.a;
        if (forgotPasswordSetPhonePresenter == null) {
            akcr.a("presenter");
        }
        forgotPasswordSetPhonePresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.phone_picker);
        akcr.a(findViewById, "view.findViewById(R.id.phone_picker)");
        PhonePickerView phonePickerView = (PhonePickerView) findViewById;
        String str = "<set-?>";
        akcr.b(phonePickerView, str);
        this.b = phonePickerView;
        findViewById = view.findViewById(R.id.phone_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.phone_error_message)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.c = textView;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById2;
        akcr.b(progressButton, str);
        this.d = progressButton;
    }
}
