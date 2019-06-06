package com.snap.identity.loginsignup.ui.pages.birthday;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import com.snap.core.db.record.FriendModel;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.SignupFragment;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.akrl;
import defpackage.iyn.a;
import defpackage.jbw;
import defpackage.jem;
import defpackage.jrl;
import defpackage.zjk;
import defpackage.zjm;

public final class BirthdayFragment extends SignupFragment implements jem {
    public BirthdayPresenter a;
    private TextView c;
    private ProgressButton d;
    private DatePicker e;
    private TextView f;

    public final TextView a() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a(FriendModel.BIRTHDAY);
        }
        return textView;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        BirthdayPresenter birthdayPresenter = this.a;
        if (birthdayPresenter == null) {
            akcr.a("presenter");
        }
        jrl.a((Context) birthdayPresenter.e.get());
    }

    public final ProgressButton b() {
        ProgressButton progressButton = this.d;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final DatePicker c() {
        DatePicker datePicker = this.e;
        if (datePicker == null) {
            akcr.a("birthdayDatePicker");
        }
        return datePicker;
    }

    public final TextView d() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("error");
        }
        return textView;
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_SIGNUP_BIRTHDAY;
    }

    public final boolean o_() {
        BirthdayPresenter birthdayPresenter = this.a;
        if (birthdayPresenter == null) {
            akcr.a("presenter");
        }
        akrl akrl = birthdayPresenter.a;
        if (akrl != null) {
            ((jbw) birthdayPresenter.g.get()).b(a.a(akrl));
        }
        return super.o_();
    }

    public final void onCreate(Bundle bundle) {
        aipx.a(this);
        super.onCreate(bundle);
        BirthdayPresenter birthdayPresenter = this.a;
        if (birthdayPresenter == null) {
            akcr.a("presenter");
        }
        birthdayPresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_signup_birthday, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        BirthdayPresenter birthdayPresenter = this.a;
        if (birthdayPresenter == null) {
            akcr.a("presenter");
        }
        birthdayPresenter.dropTarget();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.birthday_form_field);
        akcr.a(findViewById, "view.findViewById(R.id.birthday_form_field)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.d = progressButton;
        findViewById = view.findViewById(R.id.birthday_date_picker);
        akcr.a(findViewById, "view.findViewById(R.id.birthday_date_picker)");
        DatePicker datePicker = (DatePicker) findViewById;
        akcr.b(datePicker, str);
        this.e = datePicker;
        Object findViewById2 = view.findViewById(R.id.signup_error_text);
        akcr.a(findViewById2, "view.findViewById(R.id.signup_error_text)");
        TextView textView2 = (TextView) findViewById2;
        akcr.b(textView2, str);
        this.f = textView2;
    }
}
