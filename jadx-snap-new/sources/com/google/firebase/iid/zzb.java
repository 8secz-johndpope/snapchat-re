package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import defpackage.cau;
import defpackage.cax;
import defpackage.hf;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb extends Service {
    public final ExecutorService a = Executors.newSingleThreadExecutor();
    private Binder b;
    private final Object c = new Object();
    private int d;
    private int e = 0;

    /* Access modifiers changed, original: protected */
    public Intent a(Intent intent) {
        return intent;
    }

    public abstract void b(Intent intent);

    public final void c(Intent intent) {
        if (intent != null) {
            hf.a(intent);
        }
        synchronized (this.c) {
            this.e--;
            if (this.e == 0) {
                stopSelfResult(this.d);
            }
        }
    }

    public boolean d(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.b == null) {
            this.b = new cax(this);
        }
        return this.b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent a = a(intent);
        if (a == null) {
            c(intent);
            return 2;
        } else if (d(a)) {
            c(intent);
            return 2;
        } else {
            this.a.execute(new cau(this, a, intent));
            return 3;
        }
    }
}
