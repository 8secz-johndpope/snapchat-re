package com.snap.identity.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import defpackage.abkq;
import defpackage.abme;
import defpackage.abmf;
import defpackage.abmg;
import defpackage.aipn;
import defpackage.aipp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.gvr.a;
import defpackage.iqj;
import defpackage.irc;
import defpackage.zfw;
import defpackage.zgb;

public class SplashActivity extends FragmentActivity implements abmg {
    public ajdx<iqj> i;
    public zgb j;
    public aipn<abme> k;
    private ajei l;
    private zfw m;

    /* Access modifiers changed, original: 0000 */
    public void a(abkq abkq) {
        Intent intent = new Intent("snap.intent.action.MAIN");
        intent.setPackage(getPackageName());
        startActivity(intent);
        overridePendingTransition(0, 0);
        if (VERSION.SDK_INT >= 21) {
            finishAfterTransition();
        } else {
            finish();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Throwable th) {
        c();
    }

    /* Access modifiers changed, original: 0000 */
    public void c() {
        startActivityForResult(new Intent(this, LoginActivity.class), 1);
    }

    public <T extends abmf> T getTestBridge(Class<T> cls) {
        return ((abme) this.k.get()).getTestBridge(cls);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == 0) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        aipp.a((Activity) this);
        this.m = zgb.a(irc.t, "SplashActivity");
        a.a(new -$$Lambda$SplashActivity$-QhtJM1DXPdppmkmTILZB5twFWI(this, bundle));
    }

    public void onPause() {
        super.onPause();
        this.l.dispose();
    }

    public void onResume() {
        super.onResume();
        this.l = new ajei();
        this.l.a(this.i.b(-$$Lambda$J0aPWOEqo0uYbcLMyetWn0mnl3g.INSTANCE).b((ajdw) this.m.f()).a(ajee.a(ajef.a)).a(new -$$Lambda$21wKTZ3Ls3hKi0l6aiIKr3H3zOs(this), new -$$Lambda$DSWYe9y0zn8f8A1uoufidEUMKjQ(this), new -$$Lambda$7y1blw_-8w-kuOk1hNsO8UaJnZ4(this)));
    }

    public void onStart() {
        super.onStart();
    }
}
