package com.snap.identity.ui.settings.passwordchange;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achg;
import defpackage.aipx;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.wnr;
import defpackage.zjk;
import defpackage.zjm;

public final class PasswordChangeSucceededFragment extends BaseIdentitySettingsFragment {
    public ajwy<achb<zjm, zjk>> a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public final boolean o_() {
        ajwy ajwy = this.a;
        if (ajwy == null) {
            akcr.a("navigationHost");
        }
        ((achb) ajwy.get()).a((achg) wnr.a, false, false, null);
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_password_change_succeeded, viewGroup, false);
    }
}
