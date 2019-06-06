package com.snap.identity.loginsignup.ui.pages.displayname;

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
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jer;

public final class DisplayNameFragment extends SignupFragment implements jer {
    public DisplayNamePresenter a;
    private EditText c;
    private EditText d;
    private ProgressButton e;
    private TextView f;

    public final EditText a() {
        EditText editText = this.c;
        if (editText == null) {
            akcr.a("firstName");
        }
        return editText;
    }

    public final EditText b() {
        EditText editText = this.d;
        if (editText == null) {
            akcr.a("lastName");
        }
        return editText;
    }

    public final ProgressButton c() {
        ProgressButton progressButton = this.e;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final TextView d() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("error");
        }
        return textView;
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_DISPLAY_NAME;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        DisplayNamePresenter displayNamePresenter = this.a;
        if (displayNamePresenter == null) {
            akcr.a("presenter");
        }
        displayNamePresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_signup_display_name, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        DisplayNamePresenter displayNamePresenter = this.a;
        if (displayNamePresenter == null) {
            akcr.a("presenter");
        }
        displayNamePresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.display_name_first_name_field);
        akcr.a(findViewById, "view.findViewById(R.id.d…ay_name_first_name_field)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.c = editText;
        findViewById = view.findViewById(R.id.display_name_last_name_field);
        akcr.a(findViewById, "view.findViewById(R.id.d…lay_name_last_name_field)");
        editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.d = editText;
        findViewById = view.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.e = progressButton;
        Object findViewById2 = view.findViewById(R.id.display_name_error_message);
        akcr.a(findViewById2, "view.findViewById(R.id.display_name_error_message)");
        TextView textView = (TextView) findViewById2;
        akcr.b(textView, str);
        this.f = textView;
    }
}
