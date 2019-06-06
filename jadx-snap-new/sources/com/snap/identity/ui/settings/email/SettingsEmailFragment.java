package com.snap.identity.ui.settings.email;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snap.core.db.record.PostableStoryModel;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsStatefulButton;
import com.snap.ui.view.SnapLinkFriendlyTextView;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jno;

public final class SettingsEmailFragment extends BaseIdentitySettingsFragment implements jno {
    public SettingsEmailPresenter a;
    private EditText b;
    private TextView c;
    private SettingsStatefulButton d;
    private View e;
    private TextView f;
    private TextView j;
    private SnapLinkFriendlyTextView k;
    private ProgressBar l;

    public final EditText a() {
        EditText editText = this.b;
        if (editText == null) {
            akcr.a("emailTextView");
        }
        return editText;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("explanationField");
        }
        return textView;
    }

    public final SettingsStatefulButton c() {
        SettingsStatefulButton settingsStatefulButton = this.d;
        if (settingsStatefulButton == null) {
            akcr.a("emailContinueButton");
        }
        return settingsStatefulButton;
    }

    public final View d() {
        View view = this.e;
        if (view == null) {
            akcr.a("emailFieldErrorRedX");
        }
        return view;
    }

    public final TextView f() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("emailFieldErrorMsg");
        }
        return textView;
    }

    public final TextView g() {
        TextView textView = this.j;
        if (textView == null) {
            akcr.a(PostableStoryModel.SUBTEXT);
        }
        return textView;
    }

    public final SnapLinkFriendlyTextView h() {
        SnapLinkFriendlyTextView snapLinkFriendlyTextView = this.k;
        if (snapLinkFriendlyTextView == null) {
            akcr.a("resendVerificationText");
        }
        return snapLinkFriendlyTextView;
    }

    public final ProgressBar i() {
        ProgressBar progressBar = this.l;
        if (progressBar == null) {
            akcr.a("resendVerificationProgressBar");
        }
        return progressBar;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        SettingsEmailPresenter settingsEmailPresenter = this.a;
        if (settingsEmailPresenter == null) {
            akcr.a("presenter");
        }
        settingsEmailPresenter.takeTarget((jno) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.settings_email, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        SettingsEmailPresenter settingsEmailPresenter = this.a;
        if (settingsEmailPresenter == null) {
            akcr.a("presenter");
        }
        settingsEmailPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.email_settings_subtext);
        akcr.a(findViewById, "view.findViewById(R.id.email_settings_subtext)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.j = textView;
        findViewById = view.findViewById(R.id.email_settings_explanation);
        akcr.a(findViewById, "view.findViewById(R.id.email_settings_explanation)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.email_settings_continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.e…settings_continue_button)");
        SettingsStatefulButton settingsStatefulButton = (SettingsStatefulButton) findViewById;
        akcr.b(settingsStatefulButton, str);
        this.d = settingsStatefulButton;
        findViewById = view.findViewById(R.id.email_settings_email_field);
        akcr.a(findViewById, "view.findViewById(R.id.email_settings_email_field)");
        EditText editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.b = editText;
        findViewById = view.findViewById(R.id.email_settings_error_red_x);
        akcr.a(findViewById, "view.findViewById(R.id.email_settings_error_red_x)");
        akcr.b(findViewById, str);
        this.e = findViewById;
        findViewById = view.findViewById(R.id.email_settings_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.e…l_settings_error_message)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.f = textView;
        findViewById = view.findViewById(R.id.settings_email_resend);
        akcr.a(findViewById, "view.findViewById(R.id.settings_email_resend)");
        SnapLinkFriendlyTextView snapLinkFriendlyTextView = (SnapLinkFriendlyTextView) findViewById;
        akcr.b(snapLinkFriendlyTextView, str);
        this.k = snapLinkFriendlyTextView;
        Object findViewById2 = view.findViewById(R.id.settings_email_sent_progress_bar);
        akcr.a(findViewById2, "view.findViewById(R.id.s…_email_sent_progress_bar)");
        ProgressBar progressBar = (ProgressBar) findViewById2;
        akcr.b(progressBar, str);
        this.l = progressBar;
    }
}
