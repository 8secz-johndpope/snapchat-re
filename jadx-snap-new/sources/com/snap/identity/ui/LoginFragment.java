package com.snap.identity.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snap.ui.view.StatefulView;
import com.snapchat.android.R;
import defpackage.abuk;
import defpackage.aert;
import defpackage.aipx;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.fv;
import defpackage.fwx;
import defpackage.iqj;
import defpackage.iql;
import defpackage.iql.a;
import defpackage.isd;

public class LoginFragment extends fv {
    public fwx a;
    public iqj b;
    public ajei c;
    private TextView d;
    private TextView e;
    private StatefulView f;
    private TextView g;
    private int h;
    private int i;
    private boolean j = false;

    /* renamed from: com.snap.identity.ui.LoginFragment$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Failed to process nested try/catch */
        static {
            /*
            r0 = defpackage.iql.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 2;
            r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.LoginFragment$AnonymousClass3.<clinit>():void");
        }
    }

    private void a(iql iql) {
        int i = AnonymousClass3.a[iql.a - 1];
        if (i == 1) {
            AuthFlowFragment.a(getActivity(), this.a);
            a(false);
        } else if (i == 2) {
            TwoFactorLoginFragment twoFactorLoginFragment = new TwoFactorLoginFragment();
            aert aert = iql.b;
            twoFactorLoginFragment.d = aert;
            twoFactorLoginFragment.c = Boolean.TRUE.equals(aert.C) ? "OTP" : "SMS";
            getFragmentManager().a().b(R.id.auth_container, twoFactorLoginFragment).a().b();
            getFragmentManager().b();
        } else {
            throw new IllegalStateException();
        }
    }

    private void a(Throwable th) {
        a(false);
        this.g.setVisibility(0);
        this.g.setText(R.string.password_error_message);
    }

    private void a(boolean z) {
        this.j = z;
        a();
    }

    private /* synthetic */ boolean a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 0 && i != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        f();
        return true;
    }

    private /* synthetic */ void b(View view) {
        f();
    }

    private boolean c() {
        return d().length() >= this.h && e().length() >= this.i;
    }

    private String d() {
        return this.d.getText().toString().trim();
    }

    private String e() {
        return this.e.getText().toString().trim();
    }

    private void f() {
        a(true);
        ajei ajei = this.c;
        iqj iqj = this.b;
        iqj.a.a aVar = new iqj.a.a();
        aVar.a = d();
        aVar.b = e();
        ajei.a(iqj.a(aVar.a(), new isd()).a(ajee.a(ajef.a)).a(new -$$Lambda$LoginFragment$fx5RLcg-GTRiH-sghrAN1Tbgcik(this), new -$$Lambda$LoginFragment$Js0Gy1XUScAfdGwIBv62gd7PQgQ(this)));
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        StatefulView statefulView;
        int i;
        if (this.j) {
            statefulView = this.f;
            i = 2;
        } else if (c()) {
            this.f.setState(1);
            this.d.setEnabled(this.j ^ 1);
            this.e.setEnabled(1 ^ this.j);
        } else {
            statefulView = this.f;
            i = 0;
        }
        statefulView.setState(i);
        this.d.setEnabled(this.j ^ 1);
        this.e.setEnabled(1 ^ this.j);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.g.setVisibility(4);
    }

    public void onCreate(Bundle bundle) {
        aipx.a(this);
        super.onCreate(bundle);
        this.h = getResources().getInteger(R.integer.min_username_length);
        this.i = getResources().getInteger(R.integer.min_password_length);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.identity_fragment_login, viewGroup, false);
        this.d = (TextView) inflate.findViewById(R.id.login_username_email_field);
        this.e = (TextView) inflate.findViewById(R.id.login_password_field);
        this.g = (TextView) inflate.findViewById(R.id.login_error_message);
        this.f = (StatefulView) inflate.findViewById(R.id.log_in_button);
        this.f.setOnClickListener(new -$$Lambda$LoginFragment$_CESy3h4HRJaI-ISZvS65JdODAA(this));
        inflate.findViewById(R.id.forgot_password_button).setOnClickListener(new -$$Lambda$LoginFragment$7RGFNoQO9mmhBG4ueebKdC9Xn30(this));
        this.d.addTextChangedListener(new abuk() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                LoginFragment loginFragment = LoginFragment.this;
                loginFragment.a();
                loginFragment.b();
            }
        });
        this.e.addTextChangedListener(new abuk() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                LoginFragment loginFragment = LoginFragment.this;
                loginFragment.a();
                loginFragment.b();
            }
        });
        this.e.setOnEditorActionListener(new -$$Lambda$LoginFragment$8aLi1ONIaOYzupxQz8BvgnqVJpE(this));
        a();
        return inflate;
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
        this.c.dispose();
    }
}
