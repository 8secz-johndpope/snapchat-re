package com.snap.identity.ui.settings.forgotpassword;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsPhoneButton;
import com.snap.identity.ui.shared.phonenumber.PhonePickerView;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jns;
import defpackage.zjq;

public final class SettingsForgotPasswordPhoneFragment extends BaseIdentitySettingsFragment implements jns, zjq {
    public SettingsForgotPasswordPhonePresenter a;
    private PhonePickerView b;
    private TextView c;
    private TextView d;
    private EditText e;
    private View f;
    private TextView j;
    private SettingsPhoneButton k;

    public final long S_() {
        return -1;
    }

    public final PhonePickerView a() {
        PhonePickerView phonePickerView = this.b;
        if (phonePickerView == null) {
            akcr.a("phonePickerView");
        }
        return phonePickerView;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("phoneError");
        }
        return textView;
    }

    public final TextView d() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("phoneFieldResponseText");
        }
        return textView;
    }

    public final EditText f() {
        EditText editText = this.e;
        if (editText == null) {
            akcr.a("verifyCodeView");
        }
        return editText;
    }

    public final View g() {
        View view = this.f;
        if (view == null) {
            akcr.a("verifyCodeCleaner");
        }
        return view;
    }

    public final TextView h() {
        TextView textView = this.j;
        if (textView == null) {
            akcr.a("verifyCodeError");
        }
        return textView;
    }

    public final SettingsPhoneButton i() {
        SettingsPhoneButton settingsPhoneButton = this.k;
        if (settingsPhoneButton == null) {
            akcr.a("continueButton");
        }
        return settingsPhoneButton;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter = this.a;
        if (settingsForgotPasswordPhonePresenter == null) {
            akcr.a("presenter");
        }
        settingsForgotPasswordPhonePresenter.takeTarget((jns) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.settings_forgot_password_phone, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter = this.a;
        if (settingsForgotPasswordPhonePresenter == null) {
            akcr.a("presenter");
        }
        settingsForgotPasswordPhonePresenter.dropTarget();
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
        findViewById = view.findViewById(R.id.phone_form_err_text);
        akcr.a(findViewById, "view.findViewById(R.id.phone_form_err_text)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.phone_response_text);
        akcr.a(findViewById, "view.findViewById(R.id.phone_response_text)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.verify_code);
        akcr.a(findViewById, "view.findViewById(R.id.verify_code)");
        EditText editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.e = editText;
        findViewById = view.findViewById(R.id.wrong_verify_code_cleaner);
        akcr.a(findViewById, "view.findViewById(R.id.wrong_verify_code_cleaner)");
        akcr.b(findViewById, str);
        this.f = findViewById;
        findViewById = view.findViewById(R.id.verify_code_err_text);
        akcr.a(findViewById, "view.findViewById(R.id.verify_code_err_text)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.j = textView;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        SettingsPhoneButton settingsPhoneButton = (SettingsPhoneButton) findViewById2;
        akcr.b(settingsPhoneButton, str);
        this.k = settingsPhoneButton;
    }
}
