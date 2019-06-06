package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import defpackage.bam;
import defpackage.bas;
import defpackage.jh;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class JobService extends Service {
    static final Handler a = new Handler(Looper.getMainLooper());
    final ExecutorService b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    final jh<String, a> c = new jh(1);
    private final defpackage.ban.a d = new defpackage.ban.a() {
        public final void a(Bundle bundle, bam bam) {
            defpackage.bar.a a = GooglePlayReceiver.a.a(bundle);
            if (a == null) {
                Log.wtf("FJD.JobService", "start: unknown invocation provided");
                return;
            }
            JobService jobService = JobService.this;
            jobService.b.execute(new b(4, jobService, a.a(), bam, null, null, false, 0));
        }

        public final void a(Bundle bundle, boolean z) {
            defpackage.bar.a a = GooglePlayReceiver.a.a(bundle);
            if (a == null) {
                Log.wtf("FJD.JobService", "stop: unknown invocation provided");
                return;
            }
            JobService jobService = JobService.this;
            jobService.b.execute(new b(5, jobService, a.a(), null, null, null, z, 0));
        }
    };

    static final class a {
        final bas a;
        final long b;
        private bam c;

        private a(bas bas, bam bam, long j) {
            this.a = bas;
            this.c = bam;
            this.b = j;
        }

        /* synthetic */ a(bas bas, bam bam, long j, byte b) {
            this(bas, bam, j);
        }

        /* Access modifiers changed, original: final */
        public final void a(int i) {
            try {
                this.c.a(GooglePlayReceiver.a.a(this.a, new Bundle()), i);
            } catch (RemoteException e) {
                Log.e("FJD.JobService", "Failed to send result to driver", e);
            }
        }
    }

    static class b implements Runnable {
        private final int a;
        private final JobService b;
        private final bas c;
        private final bam d;
        private final a e;
        private final int f;
        private final boolean g;
        private final Intent h;

        b(int i, JobService jobService, bas bas, bam bam, a aVar, Intent intent, boolean z, int i2) {
            this.a = i;
            this.b = jobService;
            this.c = bas;
            this.d = bam;
            this.e = aVar;
            this.h = intent;
            this.g = z;
            this.f = i2;
        }

        private static b a(JobService jobService, a aVar, boolean z, int i) {
            return new b(2, jobService, null, null, aVar, null, z, i);
        }

        /* JADX WARNING: Missing block: B:26:0x005e, code skipped:
            return;
     */
        public final void run() {
            /*
            r14 = this;
            r0 = r14.a;
            r1 = 0;
            r2 = 1;
            switch(r0) {
                case 1: goto L_0x0116;
                case 2: goto L_0x00f5;
                case 3: goto L_0x00c5;
                case 4: goto L_0x006d;
                case 5: goto L_0x0036;
                case 6: goto L_0x002e;
                case 7: goto L_0x000f;
                default: goto L_0x0007;
            };
        L_0x0007:
            r0 = new java.lang.AssertionError;
            r1 = "unreachable";
            r0.<init>(r1);
            throw r0;
        L_0x000f:
            r0 = r14.b;
            r1 = r14.c;
            r2 = r14.f;
            r3 = r0.c;
            monitor-enter(r3);
            r0 = r0.c;	 Catch:{ all -> 0x002b }
            r1 = r1.e();	 Catch:{ all -> 0x002b }
            r0 = r0.remove(r1);	 Catch:{ all -> 0x002b }
            r0 = (com.firebase.jobdispatcher.JobService.a) r0;	 Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0029;
        L_0x0026:
            r0.a(r2);	 Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r3);	 Catch:{ all -> 0x002b }
            return;
        L_0x002b:
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x002b }
            throw r0;
        L_0x002e:
            r0 = r14.e;
            r1 = r14.f;
            r0.a(r1);
            return;
        L_0x0036:
            r0 = r14.b;
            r2 = r14.c;
            r3 = r14.g;
            r4 = r0.c;
            monitor-enter(r4);
            r5 = r0.c;	 Catch:{ all -> 0x006a }
            r2 = r2.e();	 Catch:{ all -> 0x006a }
            r2 = r5.remove(r2);	 Catch:{ all -> 0x006a }
            r2 = (com.firebase.jobdispatcher.JobService.a) r2;	 Catch:{ all -> 0x006a }
            if (r2 != 0) goto L_0x005f;
        L_0x004d:
            r0 = "FJD.JobService";
            r1 = 3;
            r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x005d;
        L_0x0056:
            r0 = "FJD.JobService";
            r1 = "Provided job has already been executed.";
            android.util.Log.d(r0, r1);	 Catch:{ all -> 0x006a }
        L_0x005d:
            monitor-exit(r4);	 Catch:{ all -> 0x006a }
            return;
        L_0x005f:
            r5 = com.firebase.jobdispatcher.JobService.a;	 Catch:{ all -> 0x006a }
            r0 = a(r0, r2, r3, r1);	 Catch:{ all -> 0x006a }
            r5.post(r0);	 Catch:{ all -> 0x006a }
            monitor-exit(r4);	 Catch:{ all -> 0x006a }
            return;
        L_0x006a:
            r0 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x006a }
            throw r0;
        L_0x006d:
            r7 = r14.b;
            r0 = r14.c;
            r10 = r14.d;
            r3 = r7.c;
            monitor-enter(r3);
            r4 = r7.c;	 Catch:{ all -> 0x00c2 }
            r5 = r0.e();	 Catch:{ all -> 0x00c2 }
            r4 = r4.containsKey(r5);	 Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x0099;
        L_0x0082:
            r4 = "FJD.JobService";
            r5 = java.util.Locale.US;	 Catch:{ all -> 0x00c2 }
            r6 = "Job with tag = %s was already running.";
            r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x00c2 }
            r0 = r0.e();	 Catch:{ all -> 0x00c2 }
            r2[r1] = r0;	 Catch:{ all -> 0x00c2 }
            r0 = java.lang.String.format(r5, r6, r2);	 Catch:{ all -> 0x00c2 }
            android.util.Log.w(r4, r0);	 Catch:{ all -> 0x00c2 }
            monitor-exit(r3);	 Catch:{ all -> 0x00c2 }
            return;
        L_0x0099:
            r1 = r7.c;	 Catch:{ all -> 0x00c2 }
            r2 = r0.e();	 Catch:{ all -> 0x00c2 }
            r4 = new com.firebase.jobdispatcher.JobService$a;	 Catch:{ all -> 0x00c2 }
            r11 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x00c2 }
            r13 = 0;
            r8 = r4;
            r9 = r0;
            r8.<init>(r9, r10, r11, r13);	 Catch:{ all -> 0x00c2 }
            r1.put(r2, r4);	 Catch:{ all -> 0x00c2 }
            monitor-exit(r3);	 Catch:{ all -> 0x00c2 }
            r1 = com.firebase.jobdispatcher.JobService.a;
            r2 = new com.firebase.jobdispatcher.JobService$b;
            r6 = 1;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 0;
            r13 = 0;
            r5 = r2;
            r8 = r0;
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13);
            r1.post(r2);
            return;
        L_0x00c2:
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x00c2 }
            throw r0;
        L_0x00c5:
            r0 = r14.b;
            r1 = r0.c;
            monitor-enter(r1);
            r3 = r0.c;	 Catch:{ all -> 0x00f2 }
            r3 = r3.size();	 Catch:{ all -> 0x00f2 }
            r3 = r3 - r2;
        L_0x00d1:
            if (r3 < 0) goto L_0x00f0;
        L_0x00d3:
            r4 = r0.c;	 Catch:{ all -> 0x00f2 }
            r5 = r0.c;	 Catch:{ all -> 0x00f2 }
            r5 = r5.b(r3);	 Catch:{ all -> 0x00f2 }
            r4 = r4.remove(r5);	 Catch:{ all -> 0x00f2 }
            r4 = (com.firebase.jobdispatcher.JobService.a) r4;	 Catch:{ all -> 0x00f2 }
            if (r4 == 0) goto L_0x00ed;
        L_0x00e3:
            r5 = com.firebase.jobdispatcher.JobService.a;	 Catch:{ all -> 0x00f2 }
            r6 = 2;
            r4 = a(r0, r4, r2, r6);	 Catch:{ all -> 0x00f2 }
            r5.post(r4);	 Catch:{ all -> 0x00f2 }
        L_0x00ed:
            r3 = r3 + -1;
            goto L_0x00d1;
        L_0x00f0:
            monitor-exit(r1);	 Catch:{ all -> 0x00f2 }
            return;
        L_0x00f2:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x00f2 }
            throw r0;
        L_0x00f5:
            r0 = r14.b;
            r6 = r14.e;
            r1 = r14.g;
            r9 = r14.f;
            r2 = r6.a;
            r0.b(r2);
            if (r1 == 0) goto L_0x0115;
        L_0x0104:
            r0 = r0.b;
            r10 = new com.firebase.jobdispatcher.JobService$b;
            r2 = 6;
            r3 = 0;
            r4 = 0;
            r5 = 0;
            r7 = 0;
            r8 = 0;
            r1 = r10;
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
            r0.execute(r10);
        L_0x0115:
            return;
        L_0x0116:
            r0 = r14.b;
            r1 = r14.c;
            r0.a(r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.JobService$b.run():void");
        }
    }

    public abstract boolean a(bas bas);

    public abstract boolean b(bas bas);

    public final void c(bas bas) {
        if (bas == null) {
            Log.e("FJD.JobService", "jobFinished called with a null JobParameters");
        } else {
            this.b.execute(new b(7, this, bas, null, null, null, false, 0));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x006b in {7, 11, 13, 16} preds:[]
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
    protected final void dump(java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
        r7 = this;
        r8 = r7.c;
        monitor-enter(r8);
        r10 = r7.c;	 Catch:{ all -> 0x0068 }
        r10 = r10.isEmpty();	 Catch:{ all -> 0x0068 }
        if (r10 == 0) goto L_0x0012;	 Catch:{ all -> 0x0068 }
        r10 = "No running jobs";	 Catch:{ all -> 0x0068 }
        r9.println(r10);	 Catch:{ all -> 0x0068 }
        monitor-exit(r8);	 Catch:{ all -> 0x0068 }
        return;	 Catch:{ all -> 0x0068 }
        r0 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0068 }
        r10 = "Running jobs:";	 Catch:{ all -> 0x0068 }
        r9.println(r10);	 Catch:{ all -> 0x0068 }
        r10 = 0;	 Catch:{ all -> 0x0068 }
        r2 = r7.c;	 Catch:{ all -> 0x0068 }
        r2 = r2.size();	 Catch:{ all -> 0x0068 }
        if (r10 >= r2) goto L_0x0066;	 Catch:{ all -> 0x0068 }
        r2 = r7.c;	 Catch:{ all -> 0x0068 }
        r3 = r7.c;	 Catch:{ all -> 0x0068 }
        r3 = r3.b(r10);	 Catch:{ all -> 0x0068 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0068 }
        r2 = (com.firebase.jobdispatcher.JobService.a) r2;	 Catch:{ all -> 0x0068 }
        r3 = r2.a;	 Catch:{ all -> 0x0068 }
        r3 = r3.e();	 Catch:{ all -> 0x0068 }
        r3 = org.json.JSONObject.quote(r3);	 Catch:{ all -> 0x0068 }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0068 }
        r5 = r2.b;	 Catch:{ all -> 0x0068 }
        r5 = r0 - r5;	 Catch:{ all -> 0x0068 }
        r4 = r4.toSeconds(r5);	 Catch:{ all -> 0x0068 }
        r2 = android.text.format.DateUtils.formatElapsedTime(r4);	 Catch:{ all -> 0x0068 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0068 }
        r5 = "    * ";	 Catch:{ all -> 0x0068 }
        r4.<init>(r5);	 Catch:{ all -> 0x0068 }
        r4.append(r3);	 Catch:{ all -> 0x0068 }
        r3 = " has been running for ";	 Catch:{ all -> 0x0068 }
        r4.append(r3);	 Catch:{ all -> 0x0068 }
        r4.append(r2);	 Catch:{ all -> 0x0068 }
        r2 = r4.toString();	 Catch:{ all -> 0x0068 }
        r9.println(r2);	 Catch:{ all -> 0x0068 }
        r10 = r10 + 1;	 Catch:{ all -> 0x0068 }
        goto L_0x001c;	 Catch:{ all -> 0x0068 }
        monitor-exit(r8);	 Catch:{ all -> 0x0068 }
        return;	 Catch:{ all -> 0x0068 }
        r9 = move-exception;	 Catch:{ all -> 0x0068 }
        monitor-exit(r8);	 Catch:{ all -> 0x0068 }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.JobService.dump(java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final IBinder onBind(Intent intent) {
        return this.d;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    public final void onStart(Intent intent, int i) {
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        stopSelf(i2);
        return 2;
    }

    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }

    public final boolean onUnbind(Intent intent) {
        this.b.execute(new b(3, this, null, null, null, intent, false, 0));
        return super.onUnbind(intent);
    }
}
