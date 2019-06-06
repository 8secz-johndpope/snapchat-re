package com.snap.identity.loginsignup.ui.pages.setphone;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.SignupFragment;
import com.snap.identity.ui.shared.phonenumber.PhonePickerView;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achb;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.izy;
import defpackage.jbv;
import defpackage.jgt;
import defpackage.jun;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import java.util.Collection;

public final class SetPhoneFragment extends SignupFragment implements jgt {
    public SetPhonePresenter a;
    private View c;
    private TextView d;
    private PhonePickerView e;
    private ProgressButton f;
    private View g;
    private View h;

    public final View a() {
        View view = this.c;
        if (view == null) {
            akcr.a("emailInstead");
        }
        return view;
    }

    public final void a_(achi<zjm, zjk> achi) {
        boolean z;
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        SetPhonePresenter setPhonePresenter = this.a;
        if (setPhonePresenter == null) {
            akcr.a("presenter");
        }
        Iterable<Object> g = ((achb) setPhonePresenter.q.get()).g();
        if (!((g instanceof Collection) && ((Collection) g).isEmpty())) {
            for (Object obj : g) {
                akcr.a(obj, "it");
                if (akcr.a((zjm) obj.e(), jbv.p)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        setPhonePresenter.i = z;
        setPhonePresenter.h = true;
        setPhonePresenter.a();
        setPhonePresenter.h = false;
    }

    public final TextView b() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a(Event.ERROR_MESSAGE);
        }
        return textView;
    }

    public final PhonePickerView c() {
        PhonePickerView phonePickerView = this.e;
        if (phonePickerView == null) {
            akcr.a("phonePickerView");
        }
        return phonePickerView;
    }

    public final ProgressButton d() {
        ProgressButton progressButton = this.f;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_SET_PHONE;
    }

    public final View g() {
        View view = this.g;
        if (view == null) {
            akcr.a("skipButton");
        }
        return view;
    }

    public final View h() {
        View view = this.h;
        if (view == null) {
            akcr.a("backButton");
        }
        return view;
    }

    public final boolean o_() {
        SetPhonePresenter setPhonePresenter = this.a;
        if (setPhonePresenter == null) {
            akcr.a("presenter");
        }
        ((jun) setPhonePresenter.p.get()).a(setPhonePresenter.m);
        ((zke) setPhonePresenter.j.get()).a(new izy());
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        SetPhonePresenter setPhonePresenter = this.a;
        if (setPhonePresenter == null) {
            akcr.a("presenter");
        }
        setPhonePresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_signup_set_phone, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        SetPhonePresenter setPhonePresenter = this.a;
        if (setPhonePresenter == null) {
            akcr.a("presenter");
        }
        setPhonePresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.signup_with_email_instead);
        akcr.a(findViewById, "view.findViewById(R.id.signup_with_email_instead)");
        String str = "<set-?>";
        akcr.b(findViewById, str);
        this.c = findViewById;
        findViewById = view.findViewById(R.id.phone_picker);
        akcr.a(findViewById, "view.findViewById(R.id.phone_picker)");
        PhonePickerView phonePickerView = (PhonePickerView) findViewById;
        akcr.b(phonePickerView, str);
        this.e = phonePickerView;
        findViewById = view.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.f = progressButton;
        findViewById = view.findViewById(R.id.phone_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.phone_error_message)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.skip_button);
        akcr.a(findViewById, "view.findViewById(R.id.skip_button)");
        akcr.b(findViewById, str);
        this.g = findViewById;
        Object findViewById2 = view.findViewById(R.id.back_button);
        akcr.a(findViewById2, "view.findViewById(R.id.back_button)");
        akcr.b(findViewById2, str);
        this.h = findViewById2;
    }
}
