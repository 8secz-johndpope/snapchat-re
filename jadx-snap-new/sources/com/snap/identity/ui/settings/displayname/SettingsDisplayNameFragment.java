package com.snap.identity.ui.settings.displayname;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.ui.view.ScHeaderView;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.jnm;

public final class SettingsDisplayNameFragment extends BaseIdentitySettingsFragment implements jnm {
    public SettingsDisplayNamePresenter a;
    private EditText b;
    private TextView c;
    private View d;
    private TextView e;
    private View f;
    private View j;
    private TextView k;

    public final EditText a() {
        EditText editText = this.b;
        if (editText == null) {
            akcr.a("displayNameView");
        }
        return editText;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("saveButton");
        }
        return textView;
    }

    public final View c() {
        View view = this.d;
        if (view == null) {
            akcr.a("saveProgressBar");
        }
        return view;
    }

    public final TextView d() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("removeDisplayNameView");
        }
        return textView;
    }

    public final View f() {
        View view = this.f;
        if (view == null) {
            akcr.a("removeDisplayNameProgressBar");
        }
        return view;
    }

    public final View g() {
        View view = this.j;
        if (view == null) {
            akcr.a("displayNameFieldErrorRedX");
        }
        return view;
    }

    public final TextView h() {
        TextView textView = this.k;
        if (textView == null) {
            akcr.a("displayNameFieldErrorMsg");
        }
        return textView;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        SettingsDisplayNamePresenter settingsDisplayNamePresenter = this.a;
        if (settingsDisplayNamePresenter == null) {
            akcr.a("presenter");
        }
        settingsDisplayNamePresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.settings_name, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        SettingsDisplayNamePresenter settingsDisplayNamePresenter = this.a;
        if (settingsDisplayNamePresenter == null) {
            akcr.a("presenter");
        }
        settingsDisplayNamePresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.display_name_settings_field);
        akcr.a(findViewById, "view.findViewById(R.id.d…play_name_settings_field)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.b = editText;
        View findViewById2 = view.findViewById(R.id.settings_display_name_sc_header);
        if (findViewById2 != null) {
            ((ScHeaderView) findViewById2).setHideSoftInputBackArrowOnClickListener();
            findViewById = view.findViewById(R.id.display_name_settings_save_button);
            akcr.a(findViewById, "view.findViewById(R.id.d…ame_settings_save_button)");
            TextView textView = (TextView) findViewById;
            akcr.b(textView, str);
            this.c = textView;
            b().setText(R.string.settings_save);
            b().setClickable(true);
            findViewById = view.findViewById(R.id.display_settings_save_progressbar);
            akcr.a(findViewById, "view.findViewById(R.id.d…ettings_save_progressbar)");
            akcr.b(findViewById, str);
            this.d = findViewById;
            findViewById = view.findViewById(R.id.remove_display_name_text);
            akcr.a(findViewById, "view.findViewById(R.id.remove_display_name_text)");
            textView = (TextView) findViewById;
            akcr.b(textView, str);
            this.e = textView;
            findViewById = view.findViewById(R.id.remove_display_name_progressbar);
            akcr.a(findViewById, "view.findViewById(R.id.r…display_name_progressbar)");
            akcr.b(findViewById, str);
            this.f = findViewById;
            findViewById = view.findViewById(R.id.display_name_settings_error_red_x);
            akcr.a(findViewById, "view.findViewById(R.id.d…ame_settings_error_red_x)");
            akcr.b(findViewById, str);
            this.j = findViewById;
            Object findViewById3 = view.findViewById(R.id.display_name_settings_error_message);
            akcr.a(findViewById3, "view.findViewById(R.id.d…e_settings_error_message)");
            TextView textView2 = (TextView) findViewById3;
            akcr.b(textView2, str);
            this.k = textView2;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.ScHeaderView");
    }
}
