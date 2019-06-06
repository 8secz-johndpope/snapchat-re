package com.snap.stuffing.lib;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import com.brightcove.player.event.Event;
import com.google.common.base.Optional;
import defpackage.aipp;
import defpackage.akcr;
import defpackage.yts;

public final class AppSwitchActivity extends FragmentActivity {
    boolean i;
    public Optional<yts> j;
    private final Handler k = new Handler(Looper.getMainLooper());
    private Intent l;
    private final a m = new a(this);
    private final Runnable n = new b(this);

    public static final class a extends BroadcastReceiver {
        private /* synthetic */ AppSwitchActivity a;

        a(AppSwitchActivity appSwitchActivity) {
            this.a = appSwitchActivity;
        }

        public final void onReceive(Context context, Intent intent) {
            this.a.i = true;
        }
    }

    static final class b implements Runnable {
        private /* synthetic */ AppSwitchActivity a;

        b(AppSwitchActivity appSwitchActivity) {
            this.a = appSwitchActivity;
        }

        public final void run() {
            AppSwitchActivity appSwitchActivity = this.a;
            appSwitchActivity.i = true;
            appSwitchActivity.finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        aipp.a((Activity) this);
        super.onCreate(bundle);
        Object parcelableExtra = getIntent().getParcelableExtra("RESTART_INTENTS");
        akcr.a(parcelableExtra, "intent.getParcelableExtr…tcher.KEY_RESTART_INTENT)");
        this.l = (Intent) parcelableExtra;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        getApplicationContext().registerReceiver(this.m, intentFilter);
        this.k.postDelayed(this.n, 11000);
        Optional optional = this.j;
        String str = Event.CONFIGURATION;
        if (optional == null) {
            akcr.a(str);
        }
        if (optional.isPresent()) {
            optional = this.j;
            if (optional == null) {
                akcr.a(str);
            }
            parcelableExtra = optional.get();
            akcr.a(parcelableExtra, "configuration.get()");
            setContentView(((yts) parcelableExtra).getAppSwitchActivityResId());
            optional = this.j;
            if (optional == null) {
                akcr.a(str);
            }
            ((yts) optional.get()).startAppWarmUp();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.k.removeCallbacks(this.n);
        getApplicationContext().unregisterReceiver(this.m);
        if (this.i) {
            Object applicationContext = getApplicationContext();
            akcr.a(applicationContext, "applicationContext");
            Intent intent = this.l;
            if (intent == null) {
                akcr.a("relaunchIntent");
            }
            akcr.b(applicationContext, "context");
            akcr.b(intent, "intent");
            applicationContext.startActivity(intent);
        }
        Runtime.getRuntime().exit(0);
    }

    public final void onPause() {
        super.onPause();
        finish();
    }
}
