package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import defpackage.pq;
import defpackage.qg;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = pq.a("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        pq.a().a(a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (VERSION.SDK_INT >= 23) {
            qg b = qg.b();
            if (b == null) {
                pq.a().c(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
                return;
            }
            PendingResult goAsync = goAsync();
            synchronized (qg.l) {
                b.i = goAsync;
                if (b.h) {
                    b.i.finish();
                    b.i = null;
                }
            }
            return;
        }
        intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        context.startService(intent);
    }
}
