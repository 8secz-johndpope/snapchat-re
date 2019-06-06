package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import defpackage.pq;
import defpackage.qg;
import java.util.concurrent.TimeUnit;
import org.jcodec.containers.mp4.boxes.Box;

public final class ForceStopRunnable implements Runnable {
    private static final String a = pq.a("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final qg d;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = pq.a("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                    pq.a().a(a, "Rescheduling alarm that keeps track of force-stops.");
                    ForceStopRunnable.a(context);
                }
            }
        }
    }

    public ForceStopRunnable(Context context, qg qgVar) {
        this.c = context.getApplicationContext();
        this.d = qgVar;
    }

    private static PendingIntent a(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, b(context), i);
    }

    static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a = a(context, Box.MAX_BOX_SIZE);
        long currentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            if (VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, a);
                return;
            }
            alarmManager.set(0, currentTimeMillis, a);
        }
    }

    private static Intent b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x00c9 in {2, 5, 6, 8, 16, 17, 19, 25, 27, 30, 33} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void run() {
        /*
        r9 = this;
        r0 = r9.d;
        r0 = r0.g;
        r0 = r0.a();
        r1 = 0;
        r2 = "reschedule_needed";
        r0 = r0.getBoolean(r2, r1);
        r2 = 1;
        if (r0 == 0) goto L_0x002d;
        r0 = defpackage.pq.a();
        r3 = a;
        r4 = new java.lang.Throwable[r1];
        r5 = "Rescheduling Workers.";
        r0.a(r3, r5, r4);
        r0 = r9.d;
        r0.c();
        r0 = r9.d;
        r0 = r0.g;
        r0.a(r1);
        goto L_0x00ac;
        r0 = r9.c;
        r3 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = a(r0, r3);
        if (r0 != 0) goto L_0x003e;
        r0 = r9.c;
        a(r0);
        r0 = 1;
        goto L_0x003f;
        r0 = 0;
        if (r0 == 0) goto L_0x0054;
        r0 = defpackage.pq.a();
        r3 = a;
        r1 = new java.lang.Throwable[r1];
        r4 = "Application was force-stopped, rescheduling.";
        r0.a(r3, r4, r1);
        r0 = r9.d;
        r0.c();
        goto L_0x00ac;
        r0 = r9.d;
        r0 = r0.c;
        r3 = r0.g();
        r0.c();	 Catch:{ all -> 0x00c4 }
        r4 = r3.d();	 Catch:{ all -> 0x00c4 }
        r5 = r4.isEmpty();	 Catch:{ all -> 0x00c4 }
        if (r5 != 0) goto L_0x0099;	 Catch:{ all -> 0x00c4 }
        r5 = defpackage.pq.a();	 Catch:{ all -> 0x00c4 }
        r6 = a;	 Catch:{ all -> 0x00c4 }
        r7 = "Found unfinished work, scheduling it.";	 Catch:{ all -> 0x00c4 }
        r8 = new java.lang.Throwable[r1];	 Catch:{ all -> 0x00c4 }
        r5.a(r6, r7, r8);	 Catch:{ all -> 0x00c4 }
        r4 = r4.iterator();	 Catch:{ all -> 0x00c4 }
        r5 = r4.hasNext();	 Catch:{ all -> 0x00c4 }
        if (r5 == 0) goto L_0x008e;	 Catch:{ all -> 0x00c4 }
        r5 = r4.next();	 Catch:{ all -> 0x00c4 }
        r5 = (defpackage.rv) r5;	 Catch:{ all -> 0x00c4 }
        r5 = r5.b;	 Catch:{ all -> 0x00c4 }
        r6 = -1;	 Catch:{ all -> 0x00c4 }
        r3.b(r5, r6);	 Catch:{ all -> 0x00c4 }
        goto L_0x007a;	 Catch:{ all -> 0x00c4 }
        r3 = r9.d;	 Catch:{ all -> 0x00c4 }
        r3 = r3.b;	 Catch:{ all -> 0x00c4 }
        r4 = r9.d;	 Catch:{ all -> 0x00c4 }
        r4 = r4.e;	 Catch:{ all -> 0x00c4 }
        defpackage.qd.a(r3, r0, r4);	 Catch:{ all -> 0x00c4 }
        r0.e();	 Catch:{ all -> 0x00c4 }
        r0.d();
        r0 = defpackage.pq.a();
        r3 = a;
        r1 = new java.lang.Throwable[r1];
        r4 = "Unfinished Workers exist, rescheduling.";
        r0.a(r3, r4, r1);
        r0 = r9.d;
        r1 = defpackage.qg.l;
        monitor-enter(r1);
        r0.h = r2;	 Catch:{ all -> 0x00c1 }
        r2 = r0.i;	 Catch:{ all -> 0x00c1 }
        if (r2 == 0) goto L_0x00bf;	 Catch:{ all -> 0x00c1 }
        r2 = r0.i;	 Catch:{ all -> 0x00c1 }
        r2.finish();	 Catch:{ all -> 0x00c1 }
        r2 = 0;	 Catch:{ all -> 0x00c1 }
        r0.i = r2;	 Catch:{ all -> 0x00c1 }
        monitor-exit(r1);	 Catch:{ all -> 0x00c1 }
        return;	 Catch:{ all -> 0x00c1 }
        r0 = move-exception;	 Catch:{ all -> 0x00c1 }
        monitor-exit(r1);	 Catch:{ all -> 0x00c1 }
        throw r0;
        r1 = move-exception;
        r0.d();
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
