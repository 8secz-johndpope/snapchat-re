package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.util.Log;
import com.brightcove.player.event.EventType;
import defpackage.can;
import defpackage.caq;
import defpackage.car;
import defpackage.cas;
import defpackage.cbn;
import defpackage.cbo;
import defpackage.iv;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseInstanceId {
    public static caq a;
    private static final long d = TimeUnit.HOURS.toSeconds(8);
    private static Map<String, FirebaseInstanceId> e = new iv();
    private static ScheduledThreadPoolExecutor f;
    public final can b;
    public final cbn c;
    private final cbo g;
    private KeyPair h;
    private boolean i = false;
    private boolean j;

    private FirebaseInstanceId(can can, cbn cbn) {
        if (cbn.a(can) != null) {
            this.b = can;
            this.c = cbn;
            this.g = new cbo(can.a(), cbn);
            this.j = i();
            if (k()) {
                g();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static FirebaseInstanceId a() {
        return getInstance(can.c());
    }

    public static void a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f == null) {
                f = new ScheduledThreadPoolExecutor(1);
            }
            f.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static boolean e() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    private final void g() {
        car d = d();
        if (d == null || d.b(this.c.b()) || a.a() != null) {
            b();
        }
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(can can) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = (FirebaseInstanceId) e.get(can.b().a);
            if (firebaseInstanceId == null) {
                if (a == null) {
                    a = new caq(can.a());
                }
                firebaseInstanceId = new FirebaseInstanceId(can, new cbn(can.a()));
                e.put(can.b().a, firebaseInstanceId);
            }
        }
        return firebaseInstanceId;
    }

    private final synchronized KeyPair h() {
        if (this.h == null) {
            this.h = a.d("");
        }
        if (this.h == null) {
            this.h = a.b("");
        }
        return this.h;
    }

    private final boolean i() {
        String str = "firebase_messaging_auto_init_enabled";
        Context a = this.b.a();
        SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
        String str2 = "auto_init";
        if (sharedPreferences.contains(str2)) {
            return sharedPreferences.getBoolean(str2, true);
        }
        try {
            PackageManager packageManager = a.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                    return applicationInfo.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return j();
    }

    private final boolean j() {
        try {
            Class.forName("cbt");
            return true;
        } catch (ClassNotFoundException unused) {
            Context a = this.b.a();
            Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
            intent.setPackage(a.getPackageName());
            ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
            return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
        }
    }

    private synchronized boolean k() {
        return this.j;
    }

    public final String a(String str, String str2, Bundle bundle) {
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        g();
        bundle.putString("appid", cbn.a(h()));
        bundle.putString("gmp_app_id", this.b.b().a);
        bundle.putString("gmsv", Integer.toString(this.c.d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.c.b());
        bundle.putString("app_ver_name", this.c.c());
        bundle.putString("cliv", "fiid-12211000");
        Bundle a = this.g.a(bundle);
        str2 = "SERVICE_NOT_AVAILABLE";
        if (a != null) {
            String string = a.getString("registration_id");
            if (string != null) {
                return string;
            }
            string = a.getString("unregistered");
            if (string != null) {
                return string;
            }
            string = a.getString("error");
            if ("RST".equals(string)) {
                f();
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string != null) {
                throw new IOException(string);
            } else {
                str = String.valueOf(a);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
                stringBuilder.append("Unexpected response: ");
                stringBuilder.append(str);
                Log.w("FirebaseInstanceId", stringBuilder.toString(), new Throwable());
                throw new IOException(str2);
            }
        }
        throw new IOException(str2);
    }

    public final synchronized void a(long j) {
        a(new cas(this, this.c, Math.min(Math.max(30, j << 1), d)), j);
        this.i = true;
    }

    public final synchronized void a(boolean z) {
        this.i = z;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        if (!this.i) {
            a(0);
        }
    }

    public final String c() {
        car d = d();
        if (d == null || d.b(this.c.b())) {
            b();
        }
        return d != null ? d.a : null;
    }

    public final car d() {
        return a.a("", cbn.a(this.b), EventType.ANY);
    }

    public final synchronized void f() {
        a.b();
        this.h = null;
        if (k()) {
            b();
        }
    }
}
