package com.snap.identity.ui.settings.phonenumber;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsPhoneButton;
import com.snap.identity.ui.shared.phonenumber.PhonePickerView;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jon;
import defpackage.zjq;

public final class SettingsPhoneNumberFragment extends BaseIdentitySettingsFragment implements jon, zjq {
    public SettingsPhoneNumberPresenter a;
    private PhonePickerView b;
    private TextView c;
    private CheckBox d;
    private EditText e;
    private View f;
    private TextView j;
    private View k;
    private SettingsPhoneButton l;

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
            akcr.a("phonePickerResponseText");
        }
        return textView;
    }

    public final CheckBox d() {
        CheckBox checkBox = this.d;
        if (checkBox == null) {
            akcr.a("searchableCheckbox");
        }
        return checkBox;
    }

    public final EditText f() {
        EditText editText = this.e;
        if (editText == null) {
            akcr.a("codeField");
        }
        return editText;
    }

    public final View g() {
        View view = this.f;
        if (view == null) {
            akcr.a("wrongCodeCleaner");
        }
        return view;
    }

    public final TextView h() {
        TextView textView = this.j;
        if (textView == null) {
            akcr.a("codeFieldResponseText");
        }
        return textView;
    }

    public final SettingsPhoneButton i() {
        SettingsPhoneButton settingsPhoneButton = this.l;
        if (settingsPhoneButton == null) {
            akcr.a("continueButton");
        }
        return settingsPhoneButton;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = this.a;
        if (settingsPhoneNumberPresenter == null) {
            akcr.a("presenter");
        }
        settingsPhoneNumberPresenter.takeTarget((jon) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.settings_phone_number, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = this.a;
        if (settingsPhoneNumberPresenter == null) {
            akcr.a("presenter");
        }
        settingsPhoneNumberPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.full_number);
        akcr.a(findViewById, "view.findViewById(R.id.full_number)");
        PhonePickerView phonePickerView = (PhonePickerView) findViewById;
        String str = "<set-?>";
        akcr.b(phonePickerView, str);
        this.b = phonePickerView;
        findViewById = view.findViewById(R.id.code_request_err_text);
        akcr.a(findViewById, "view.findViewById(R.id.code_request_err_text)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.allow_friends_checkbox);
        akcr.a(findViewById, "view.findViewById(R.id.allow_friends_checkbox)");
        CheckBox checkBox = (CheckBox) findViewById;
        akcr.b(checkBox, str);
        this.d = checkBox;
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
        findViewById = view.findViewById(R.id.verify_help);
        akcr.a(findViewById, "view.findViewById(R.id.verify_help)");
        akcr.b(findViewById, str);
        this.k = findViewById;
        Object findViewById2 = view.findViewById(R.id.verify_button);
        akcr.a(findViewById2, "view.findViewById(R.id.verify_button)");
        SettingsPhoneButton settingsPhoneButton = (SettingsPhoneButton) findViewById2;
        akcr.b(settingsPhoneButton, str);
        this.l = settingsPhoneButton;
    }
}
