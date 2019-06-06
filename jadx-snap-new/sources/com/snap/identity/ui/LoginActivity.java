package com.snap.identity.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.snapchat.android.R;
import defpackage.aipp;
import defpackage.aipq;
import defpackage.aipr;
import defpackage.aipy;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.fv;
import defpackage.gvr.a;
import defpackage.iqj;

public class LoginActivity extends FragmentActivity implements aipy {
    public iqj i;
    public aipr<fv> j;
    private ajei k;

    private /* synthetic */ Object a(Bundle bundle) {
        super.onCreate(bundle);
        return null;
    }

    private void d() {
        setResult(-1);
        finish();
    }

    public final aipq<fv> c() {
        return this.j;
    }

    public void onCreate(Bundle bundle) {
        aipp.a((Activity) this);
        a.a(new -$$Lambda$LoginActivity$ev6TEmcq_21J7gmerATXCza_bYI(this, bundle));
        setContentView(R.layout.activity_login);
        b().a().b(R.id.container, new AuthFlowFragment()).b();
    }

    public void onStart() {
        super.onStart();
        this.k = new ajei();
        this.k.a(this.i.c().a(ajee.a(ajef.a)).g(new -$$Lambda$LoginActivity$eNRn0a0RP8U6bIxbqatHyEd65ck(this)));
    }

    public void onStop() {
        super.onStop();
        this.k.dispose();
    }
}
