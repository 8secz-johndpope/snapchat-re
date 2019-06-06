package com.snap.identity.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.snap.ui.view.SnapFontEditText;
import com.snapchat.android.R;
import defpackage.aert;
import defpackage.aipx;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.fv;
import defpackage.fwx;
import defpackage.iqj;
import defpackage.iql;
import defpackage.iql.a;

public class TwoFactorLoginFragment extends fv {
    public iqj a;
    public fwx b;
    String c;
    aert d;
    private CheckBox e;
    private View f;
    private SnapFontEditText g;

    /* renamed from: com.snap.identity.ui.TwoFactorLoginFragment$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        static {
            try {
                a[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private void a(iql iql) {
        if (AnonymousClass1.a[iql.a - 1] == 1) {
            AuthFlowFragment.a(getActivity(), this.b);
            return;
        }
        throw new IllegalStateException();
    }

    private void a(Throwable th) {
        Toast.makeText(getActivity(), "Login failed, please try again", 0).show();
        Log.d("TwoFactorLoginFragment", "Login failed", th);
    }

    private /* synthetic */ boolean a(TextView textView, int i, KeyEvent keyEvent) {
        String obj = this.g.getText().toString();
        if ((this.g.getText().length() > 5 ? 1 : null) != null) {
            Toast.makeText(getActivity(), "Logging in...", 0).show();
            this.a.a(this.d.w, obj, this.c, this.d.z, this.e.isChecked()).a(ajee.a(ajef.a)).a(new -$$Lambda$TwoFactorLoginFragment$6NJJq2C4JlB6Y8_WOiBx6qSJCS0(this), new -$$Lambda$TwoFactorLoginFragment$ejEZOUtLpUcmsGX95qTev8ZkQOo(this));
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        aipx.a(this);
        super.onCreate(bundle);
        if (this.d == null) {
            throw new IllegalStateException("Must be launched with loginResponse");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.identity_login_two_factor_form, viewGroup, false);
        this.e = (CheckBox) inflate.findViewById(R.id.two_factor_allow_remember_device_checkbox);
        this.f = inflate.findViewById(R.id.two_factor_send_sms_instead);
        this.g = (SnapFontEditText) inflate.findViewById(R.id.two_factor_code_field);
        this.g.setOnEditorActionListener(new -$$Lambda$TwoFactorLoginFragment$aL59litUxMROdfwGSURpVSt_C-c(this));
        if (Boolean.TRUE.equals(this.d.C) && Boolean.TRUE.equals(this.d.B)) {
            view = this.f;
        } else {
            view = this.f;
            i = 8;
        }
        view.setVisibility(i);
        return inflate;
    }

    public void onResume() {
        super.onResume();
    }
}
