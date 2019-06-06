package com.snap.identity.ui.settings.birthday;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsStatefulButton;
import com.snapchat.android.R;
import defpackage.abpz;
import defpackage.abqi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jlt;

public final class SettingsBirthdayFragment extends BaseIdentitySettingsFragment implements jlt {
    public SettingsBirthdayPresenter a;
    private TextView b;
    private SettingsStatefulButton c;
    private TextView d;
    private View e;
    private TextView f;
    private CheckBox j;
    private DatePicker k;

    private void a(View view) {
        akcr.b(view, "<set-?>");
        this.e = view;
    }

    private void a(TextView textView) {
        akcr.b(textView, "<set-?>");
        this.d = textView;
    }

    private void a(SettingsStatefulButton settingsStatefulButton) {
        akcr.b(settingsStatefulButton, "<set-?>");
        this.c = settingsStatefulButton;
    }

    public final TextView a() {
        TextView textView = this.b;
        if (textView == null) {
            akcr.a("birthdayTextView");
        }
        return textView;
    }

    public final SettingsStatefulButton b() {
        SettingsStatefulButton settingsStatefulButton = this.c;
        if (settingsStatefulButton == null) {
            akcr.a("continueButton");
        }
        return settingsStatefulButton;
    }

    public final TextView c() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("birthdayFieldErrorMsg");
        }
        return textView;
    }

    public final View d() {
        View view = this.e;
        if (view == null) {
            akcr.a("birthdayFieldErrorRedX");
        }
        return view;
    }

    public final CheckBox f() {
        CheckBox checkBox = this.j;
        if (checkBox == null) {
            akcr.a("birthdayPartyCheckbox");
        }
        return checkBox;
    }

    public final DatePicker g() {
        DatePicker datePicker = this.k;
        if (datePicker == null) {
            akcr.a("birthdayDatePicker");
        }
        return datePicker;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        SettingsBirthdayPresenter settingsBirthdayPresenter = this.a;
        if (settingsBirthdayPresenter == null) {
            akcr.a("presenter");
        }
        settingsBirthdayPresenter.takeTarget((jlt) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.settings_birthday, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        SettingsBirthdayPresenter settingsBirthdayPresenter = this.a;
        if (settingsBirthdayPresenter == null) {
            akcr.a("presenter");
        }
        settingsBirthdayPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.settings_birthday_continue_button);
        String str = "view.findViewById(R.id.s…birthday_continue_button)";
        akcr.a(findViewById, str);
        a((SettingsStatefulButton) findViewById);
        findViewById = view.findViewById(R.id.settings_birthday_field);
        akcr.a(findViewById, "view.findViewById(R.id.settings_birthday_field)");
        TextView textView = (TextView) findViewById;
        String str2 = "<set-?>";
        akcr.b(textView, str2);
        this.b = textView;
        Object findViewById2 = view.findViewById(R.id.settings_birthday_error_message);
        String str3 = "view.findViewById(R.id.s…s_birthday_error_message)";
        akcr.a(findViewById2, str3);
        a((TextView) findViewById2);
        View findViewById3 = view.findViewById(R.id.settings_birthday_error_red_x);
        String str4 = "view.findViewById(R.id.s…ngs_birthday_error_red_x)";
        akcr.a((Object) findViewById3, str4);
        a(findViewById3);
        Object findViewById4 = view.findViewById(R.id.birthday_date_picker);
        akcr.a(findViewById4, "view.findViewById(R.id.birthday_date_picker)");
        DatePicker datePicker = (DatePicker) findViewById4;
        akcr.b(datePicker, str2);
        this.k = datePicker;
        String string = getContext().getString(R.string.settings_birthday_party_explanation, new Object[]{abqi.a(abpz.CAKE)});
        Object findViewById5 = view.findViewById(R.id.settings_birthday_party_explanation);
        akcr.a(findViewById5, "view.findViewById(R.id.s…rthday_party_explanation)");
        TextView textView2 = (TextView) findViewById5;
        akcr.b(textView2, str2);
        this.f = textView2;
        textView2 = this.f;
        if (textView2 == null) {
            akcr.a("birthdayPartyTextView");
        }
        textView2.setText(string);
        findViewById4 = view.findViewById(R.id.settings_birthday_party_checkbox);
        akcr.a(findViewById4, "view.findViewById(R.id.s…_birthday_party_checkbox)");
        CheckBox checkBox = (CheckBox) findViewById4;
        akcr.b(checkBox, str2);
        this.j = checkBox;
        Object findViewById6 = view.findViewById(R.id.settings_birthday_continue_button);
        akcr.a(findViewById6, str);
        a((SettingsStatefulButton) findViewById6);
        findViewById6 = view.findViewById(R.id.settings_birthday_error_message);
        akcr.a(findViewById6, str3);
        a((TextView) findViewById6);
        view = view.findViewById(R.id.settings_birthday_error_red_x);
        akcr.a((Object) view, str4);
        a(view);
    }
}
