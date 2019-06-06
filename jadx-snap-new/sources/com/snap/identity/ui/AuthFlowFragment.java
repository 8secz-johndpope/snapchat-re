package com.snap.identity.ui;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Toast;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.fv;
import defpackage.fwx;
import defpackage.zkq;

public class AuthFlowFragment extends fv {
    public zkq a;
    private ViewGroup b;

    static void a(Activity activity, fwx fwx) {
        Toast.makeText(activity, "Logged in!", 0).show();
        activity.sendBroadcast(fwx.a("snap.intent.action.LOGIN_COMPLETE"));
    }

    private /* synthetic */ void a(Rect rect) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.b.getLayoutParams();
        marginLayoutParams.topMargin = rect.top;
        marginLayoutParams.bottomMargin = rect.bottom;
        this.b.setLayoutParams(marginLayoutParams);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getFragmentManager().a().b(R.id.auth_container, new LoginFragment()).b();
    }

    public void onCreate(Bundle bundle) {
        aipx.a(this);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_auth_flow, viewGroup, false);
        this.b = (ViewGroup) inflate.findViewById(R.id.auth_container);
        return inflate;
    }

    public void onResume() {
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.a.c.b(ajee.a(ajef.a)).f(new -$$Lambda$AuthFlowFragment$bjqx0ji3MiagSXDpG-XjygMTbjA(this));
    }
}
