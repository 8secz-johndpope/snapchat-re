package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.Pair;
import defpackage.bab;
import defpackage.bad;
import defpackage.bae;
import defpackage.bae.a;
import defpackage.bag;
import defpackage.bah;
import defpackage.bak;
import defpackage.bap;
import defpackage.baq;
import defpackage.bar;
import defpackage.bba;
import defpackage.jh;

public class GooglePlayReceiver extends Service implements a {
    public static final baq a = new baq("com.firebase.jobdispatcher.");
    public static final jh<String, jh<String, bap>> b = new jh(1);
    private final bag c = new bag();
    private Messenger d;
    private bad e;
    private bba f;
    private bae g;
    private int h;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0062 in {2, 3, 6, 9, 10, 13, 19, 22, 25} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static defpackage.bar a(defpackage.bap r4, android.os.Bundle r5) {
        /*
        r0 = a;
        r1 = 0;
        if (r5 != 0) goto L_0x000e;
        r5 = "FJD.ExternalReceiver";
        r0 = "Unexpected null Bundle provided";
        android.util.Log.e(r5, r0);
        r5 = r1;
        goto L_0x002e;
        r2 = "extras";
        r2 = r5.getBundle(r2);
        if (r2 != 0) goto L_0x0017;
        goto L_0x000c;
        r0 = r0.a(r2);
        r2 = "triggered_uris";
        r5 = r5.getParcelableArrayList(r2);
        if (r5 == 0) goto L_0x002a;
        r2 = new baz;
        r2.<init>(r5);
        r0.j = r2;
        r5 = r0.a();
        if (r5 != 0) goto L_0x003c;
        r5 = "FJD.GooglePlayReceiver";
        r0 = "unable to decode job";
        android.util.Log.e(r5, r0);
        r5 = 2;
        a(r4, r5);
        return r1;
        r0 = b;
        monitor-enter(r0);
        r1 = b;	 Catch:{ all -> 0x005f }
        r2 = r5.b;	 Catch:{ all -> 0x005f }
        r1 = r1.get(r2);	 Catch:{ all -> 0x005f }
        r1 = (defpackage.jh) r1;	 Catch:{ all -> 0x005f }
        if (r1 != 0) goto L_0x0058;	 Catch:{ all -> 0x005f }
        r1 = new jh;	 Catch:{ all -> 0x005f }
        r2 = 1;	 Catch:{ all -> 0x005f }
        r1.<init>(r2);	 Catch:{ all -> 0x005f }
        r2 = b;	 Catch:{ all -> 0x005f }
        r3 = r5.b;	 Catch:{ all -> 0x005f }
        r2.put(r3, r1);	 Catch:{ all -> 0x005f }
        r2 = r5.a;	 Catch:{ all -> 0x005f }
        r1.put(r2, r4);	 Catch:{ all -> 0x005f }
        monitor-exit(r0);	 Catch:{ all -> 0x005f }
        return r5;	 Catch:{ all -> 0x005f }
        r4 = move-exception;	 Catch:{ all -> 0x005f }
        monitor-exit(r0);	 Catch:{ all -> 0x005f }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.GooglePlayReceiver.a(bap, android.os.Bundle):bar");
    }

    private static void a(bap bap, int i) {
        try {
            bap.a(i);
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder("Encountered error running callback: ");
            stringBuilder.append(th.getMessage());
            Log.e("FJD.GooglePlayReceiver", stringBuilder.toString());
        }
    }

    private synchronized Messenger b() {
        if (this.d == null) {
            this.d = new Messenger(new bak(Looper.getMainLooper(), this));
        }
        return this.d;
    }

    private synchronized bad c() {
        if (this.e == null) {
            this.e = new bah(getApplicationContext());
        }
        return this.e;
    }

    private synchronized bba d() {
        if (this.f == null) {
            this.f = new bba(c().a());
        }
        return this.f;
    }

    public final synchronized bae a() {
        if (this.g == null) {
            this.g = new bae(this, this, new bab(getApplicationContext()));
        }
        return this.g;
    }

    /* JADX WARNING: Missing block: B:7:0x0010, code skipped:
            r5 = b;
     */
    /* JADX WARNING: Missing block: B:8:0x0012, code skipped:
            monitor-enter(r5);
     */
    /* JADX WARNING: Missing block: B:11:0x0019, code skipped:
            if (b.isEmpty() == false) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:12:0x001b, code skipped:
            stopSelf(r4.h);
     */
    /* JADX WARNING: Missing block: B:13:0x0020, code skipped:
            monitor-exit(r5);
     */
    /* JADX WARNING: Missing block: B:14:0x0021, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:22:0x0030, code skipped:
            r5 = b;
     */
    /* JADX WARNING: Missing block: B:23:0x0032, code skipped:
            monitor-enter(r5);
     */
    /* JADX WARNING: Missing block: B:26:0x0039, code skipped:
            if (b.isEmpty() == false) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:27:0x003b, code skipped:
            stopSelf(r4.h);
     */
    /* JADX WARNING: Missing block: B:28:0x0040, code skipped:
            monitor-exit(r5);
     */
    /* JADX WARNING: Missing block: B:29:0x0041, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:40:0x0058, code skipped:
            if (r5.h() == false) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:42:0x0060, code skipped:
            if ((r5.f() instanceof defpackage.bau.a) == false) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:43:0x0062, code skipped:
            if (r6 == 1) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:44:0x0064, code skipped:
            r0 = 1;
     */
    /* JADX WARNING: Missing block: B:45:0x0066, code skipped:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:46:0x0067, code skipped:
            if (r0 == null) goto L_0x0080;
     */
    /* JADX WARNING: Missing block: B:47:0x0069, code skipped:
            r6 = new defpackage.bao.a(d(), r5);
            r6.h = true;
            c().a(r6.k());
     */
    /* JADX WARNING: Missing block: B:49:0x0087, code skipped:
            if (android.util.Log.isLoggable("FJD.GooglePlayReceiver", 2) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Missing block: B:50:0x0089, code skipped:
            r1 = new java.lang.StringBuilder("sending jobFinished for ");
            r1.append(r5.a);
            r1.append(" = ");
            r1.append(r6);
            android.util.Log.v("FJD.GooglePlayReceiver", r1.toString());
     */
    /* JADX WARNING: Missing block: B:51:0x00a6, code skipped:
            a(r2, r6);
     */
    /* JADX WARNING: Missing block: B:52:0x00a9, code skipped:
            r5 = b;
     */
    /* JADX WARNING: Missing block: B:53:0x00ab, code skipped:
            monitor-enter(r5);
     */
    /* JADX WARNING: Missing block: B:56:0x00b2, code skipped:
            if (b.isEmpty() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Missing block: B:57:0x00b4, code skipped:
            stopSelf(r4.h);
     */
    /* JADX WARNING: Missing block: B:58:0x00b9, code skipped:
            monitor-exit(r5);
     */
    /* JADX WARNING: Missing block: B:59:0x00ba, code skipped:
            return;
     */
    public final void a(defpackage.bar r5, int r6) {
        /*
        r4 = this;
        r0 = b;	 Catch:{ all -> 0x00c1 }
        monitor-enter(r0);	 Catch:{ all -> 0x00c1 }
        r1 = b;	 Catch:{ all -> 0x00be }
        r2 = r5.b;	 Catch:{ all -> 0x00be }
        r1 = r1.get(r2);	 Catch:{ all -> 0x00be }
        r1 = (defpackage.jh) r1;	 Catch:{ all -> 0x00be }
        if (r1 != 0) goto L_0x0025;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x00be }
        r5 = b;
        monitor-enter(r5);
        r6 = b;	 Catch:{ all -> 0x0022 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x0022 }
        if (r6 == 0) goto L_0x0020;
    L_0x001b:
        r6 = r4.h;	 Catch:{ all -> 0x0022 }
        r4.stopSelf(r6);	 Catch:{ all -> 0x0022 }
    L_0x0020:
        monitor-exit(r5);	 Catch:{ all -> 0x0022 }
        return;
    L_0x0022:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0022 }
        throw r6;
    L_0x0025:
        r2 = r5.a;	 Catch:{ all -> 0x00be }
        r2 = r1.remove(r2);	 Catch:{ all -> 0x00be }
        r2 = (defpackage.bap) r2;	 Catch:{ all -> 0x00be }
        if (r2 != 0) goto L_0x0045;
    L_0x002f:
        monitor-exit(r0);	 Catch:{ all -> 0x00be }
        r5 = b;
        monitor-enter(r5);
        r6 = b;	 Catch:{ all -> 0x0042 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x0042 }
        if (r6 == 0) goto L_0x0040;
    L_0x003b:
        r6 = r4.h;	 Catch:{ all -> 0x0042 }
        r4.stopSelf(r6);	 Catch:{ all -> 0x0042 }
    L_0x0040:
        monitor-exit(r5);	 Catch:{ all -> 0x0042 }
        return;
    L_0x0042:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0042 }
        throw r6;
    L_0x0045:
        r1 = r1.isEmpty();	 Catch:{ all -> 0x00be }
        if (r1 == 0) goto L_0x0052;
    L_0x004b:
        r1 = b;	 Catch:{ all -> 0x00be }
        r3 = r5.b;	 Catch:{ all -> 0x00be }
        r1.remove(r3);	 Catch:{ all -> 0x00be }
    L_0x0052:
        monitor-exit(r0);	 Catch:{ all -> 0x00be }
        r0 = r5.h();	 Catch:{ all -> 0x00c1 }
        r1 = 1;
        if (r0 == 0) goto L_0x0066;
    L_0x005a:
        r0 = r5.f();	 Catch:{ all -> 0x00c1 }
        r0 = r0 instanceof defpackage.bau.a;	 Catch:{ all -> 0x00c1 }
        if (r0 == 0) goto L_0x0066;
    L_0x0062:
        if (r6 == r1) goto L_0x0066;
    L_0x0064:
        r0 = 1;
        goto L_0x0067;
    L_0x0066:
        r0 = 0;
    L_0x0067:
        if (r0 == 0) goto L_0x0080;
    L_0x0069:
        r6 = new bao$a;	 Catch:{ all -> 0x00c1 }
        r0 = r4.d();	 Catch:{ all -> 0x00c1 }
        r6.<init>(r0, r5);	 Catch:{ all -> 0x00c1 }
        r6.h = r1;	 Catch:{ all -> 0x00c1 }
        r5 = r6.k();	 Catch:{ all -> 0x00c1 }
        r6 = r4.c();	 Catch:{ all -> 0x00c1 }
        r6.a(r5);	 Catch:{ all -> 0x00c1 }
        goto L_0x00a9;
    L_0x0080:
        r0 = "FJD.GooglePlayReceiver";
        r1 = 2;
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00c1 }
        if (r0 == 0) goto L_0x00a6;
    L_0x0089:
        r0 = "FJD.GooglePlayReceiver";
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c1 }
        r3 = "sending jobFinished for ";
        r1.<init>(r3);	 Catch:{ all -> 0x00c1 }
        r5 = r5.a;	 Catch:{ all -> 0x00c1 }
        r1.append(r5);	 Catch:{ all -> 0x00c1 }
        r5 = " = ";
        r1.append(r5);	 Catch:{ all -> 0x00c1 }
        r1.append(r6);	 Catch:{ all -> 0x00c1 }
        r5 = r1.toString();	 Catch:{ all -> 0x00c1 }
        android.util.Log.v(r0, r5);	 Catch:{ all -> 0x00c1 }
    L_0x00a6:
        a(r2, r6);	 Catch:{ all -> 0x00c1 }
    L_0x00a9:
        r5 = b;
        monitor-enter(r5);
        r6 = b;	 Catch:{ all -> 0x00bb }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x00bb }
        if (r6 == 0) goto L_0x00b9;
    L_0x00b4:
        r6 = r4.h;	 Catch:{ all -> 0x00bb }
        r4.stopSelf(r6);	 Catch:{ all -> 0x00bb }
    L_0x00b9:
        monitor-exit(r5);	 Catch:{ all -> 0x00bb }
        return;
    L_0x00bb:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x00bb }
        throw r6;
    L_0x00be:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00be }
        throw r5;	 Catch:{ all -> 0x00c1 }
    L_0x00c1:
        r5 = move-exception;
        r6 = b;
        monitor-enter(r6);
        r0 = b;	 Catch:{ all -> 0x00d4 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00d4 }
        if (r0 == 0) goto L_0x00d2;
    L_0x00cd:
        r0 = r4.h;	 Catch:{ all -> 0x00d4 }
        r4.stopSelf(r0);	 Catch:{ all -> 0x00d4 }
    L_0x00d2:
        monitor-exit(r6);	 Catch:{ all -> 0x00d4 }
        throw r5;
    L_0x00d4:
        r5 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00d4 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.GooglePlayReceiver.a(bar, int):void");
    }

    public IBinder onBind(Intent intent) {
        if (intent != null && VERSION.SDK_INT >= 21) {
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
                return b().getBinder();
            }
        }
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            super.onStartCommand(intent, i, i2);
            if (intent == null) {
                Log.w("FJD.GooglePlayReceiver", "Null Intent passed, terminating");
                synchronized (b) {
                    this.h = i2;
                    if (b.isEmpty()) {
                        stopSelf(this.h);
                    }
                }
                return 2;
            }
            String action = intent.getAction();
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                bae a = a();
                Bundle extras = intent.getExtras();
                bar bar = null;
                if (extras == null) {
                    Log.e("FJD.GooglePlayReceiver", "No data provided, terminating");
                } else {
                    Pair pair;
                    if (extras == null) {
                        Log.e("FJD.GooglePlayReceiver", "No callback received, terminating");
                        pair = null;
                    } else {
                        pair = bag.a(extras);
                    }
                    if (pair == null) {
                        Log.i("FJD.GooglePlayReceiver", "no callback found");
                    } else {
                        bar = a((bap) pair.first, (Bundle) pair.second);
                    }
                }
                a.a(bar);
                synchronized (b) {
                    this.h = i2;
                    if (b.isEmpty()) {
                        stopSelf(this.h);
                    }
                }
                return 2;
            } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                synchronized (b) {
                    this.h = i2;
                    if (b.isEmpty()) {
                        stopSelf(this.h);
                    }
                }
                return 2;
            } else {
                Log.e("FJD.GooglePlayReceiver", "Unknown action received, terminating");
                synchronized (b) {
                    this.h = i2;
                    if (b.isEmpty()) {
                        stopSelf(this.h);
                    }
                }
                return 2;
            }
        } catch (Throwable th) {
            synchronized (b) {
                this.h = i2;
                if (b.isEmpty()) {
                    stopSelf(this.h);
                }
            }
        }
    }
}
