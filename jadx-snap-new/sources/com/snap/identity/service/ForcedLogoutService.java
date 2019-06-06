package com.snap.identity.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.jakewharton.processphoenix.ProcessPhoenix;
import defpackage.aipp;
import defpackage.ajcx;
import defpackage.ajdn;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajfu;
import defpackage.fwx;
import defpackage.fxa.a;
import defpackage.gpt;
import defpackage.gpu;
import defpackage.ieg;
import defpackage.iqj;
import defpackage.irc;
import defpackage.ire;
import defpackage.zgb;

public class ForcedLogoutService extends Service {
    public iqj a;
    public fwx b;
    public gpu c;
    public ire d;
    public zgb e;
    private final ajei f = new ajei();

    private ajcx a() {
        return ajcx.a(new -$$Lambda$ForcedLogoutService$1q4TZ3RfO2lli0IUK_GcfNYSaNQ(this)).b((ajdw) zgb.a(irc.t, "finalizeLogout").f());
    }

    private ajcx a(Throwable th) {
        return ajcx.a(new -$$Lambda$ForcedLogoutService$afbwVEU5KGPyuBlqhU5gyYzOc4c(this, th));
    }

    private ajcx b() {
        return ajcx.a(new -$$Lambda$ForcedLogoutService$rDHFgpzn4oE1jSLcTIVYSRs-Zko(this));
    }

    private /* synthetic */ void b(Throwable th) {
        this.c.a(gpt.NONE);
        ieg.a("Log out failed.", true, 0);
    }

    private /* synthetic */ void c() {
        if (a.a()) {
            ProcessPhoenix.a(this);
        } else {
            Runtime.getRuntime().exit(0);
        }
    }

    private static /* synthetic */ void c(Throwable th) {
    }

    private /* synthetic */ ajdn d(Throwable th) {
        return this.a.a().b(a()).a(-$$Lambda$ForcedLogoutService$mxsfI3Lgu1UAcljpt89dXGdPlKI.INSTANCE).a(ajfu.g).b(b()).a(new -$$Lambda$ForcedLogoutService$A4gFbljkjA8-FxQ8cn0ECZXdGIk(this)).g();
    }

    private /* synthetic */ void d() {
        this.c.a(gpt.LOGGING_OUT);
    }

    private /* synthetic */ void e() {
        this.c.a(gpt.LOGGED_OUT);
        gpu gpu = this.c;
        gpu.b = true;
        gpu.a.dispose();
        ieg.a("You've been logged out.", true, 0);
    }

    private static /* synthetic */ void e(Throwable th) {
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        aipp.a((Service) this);
        super.onCreate();
        if (this.c.b) {
            stopSelf();
        } else {
            this.f.a(this.c.a().c(1).v(new -$$Lambda$ForcedLogoutService$-vL_xtGGun6qvWOnVG9KfwPHHRQ(this)).b(new -$$Lambda$QaZTA9I5V62gC2kSsilCjgiwW5k(this)).e());
        }
    }

    public void onDestroy() {
        this.f.a();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
