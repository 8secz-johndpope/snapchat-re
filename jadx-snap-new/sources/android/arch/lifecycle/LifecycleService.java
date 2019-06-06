package android.arch.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.j;
import defpackage.j.a;
import defpackage.l;
import defpackage.v;

public class LifecycleService extends Service implements l {
    private final v a = new v(this);

    public j getLifecycle() {
        return this.a.a;
    }

    public IBinder onBind(Intent intent) {
        this.a.a(a.ON_START);
        return null;
    }

    public void onCreate() {
        this.a.a(a.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        v vVar = this.a;
        vVar.a(a.ON_STOP);
        vVar.a(a.ON_DESTROY);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.a.a(a.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
