package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.text.TextUtils;
import defpackage.pq;
import defpackage.pz;
import defpackage.qg;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements pz {
    private static final String a = pq.a("SystemJobService");
    private qg b;
    private final Map<String, JobParameters> c = new HashMap();

    public final void a(String str, boolean z) {
        JobParameters jobParameters;
        pq.a().a(a, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.c) {
            jobParameters = (JobParameters) this.c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.b = qg.b();
        qg qgVar = this.b;
        if (qgVar != null) {
            qgVar.f.a((pz) this);
        } else if (Application.class.equals(getApplication().getClass())) {
            pq.a().b(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        } else {
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        qg qgVar = this.b;
        if (qgVar != null) {
            qgVar.f.b((pz) this);
        }
    }

    /* JADX WARNING: Missing block: B:18:0x0072, code skipped:
            r2 = null;
     */
    /* JADX WARNING: Missing block: B:19:0x0077, code skipped:
            if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x00aa;
     */
    /* JADX WARNING: Missing block: B:20:0x0079, code skipped:
            r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Missing block: B:21:0x0082, code skipped:
            if (r9.getTriggeredContentUris() == null) goto L_0x008e;
     */
    /* JADX WARNING: Missing block: B:22:0x0084, code skipped:
            r2.b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Missing block: B:24:0x0092, code skipped:
            if (r9.getTriggeredContentAuthorities() == null) goto L_0x009e;
     */
    /* JADX WARNING: Missing block: B:25:0x0094, code skipped:
            r2.a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Missing block: B:27:0x00a2, code skipped:
            if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x00aa;
     */
    /* JADX WARNING: Missing block: B:28:0x00a4, code skipped:
            r2.c = r9.getNetwork();
     */
    /* JADX WARNING: Missing block: B:29:0x00aa, code skipped:
            r8.b.a(r0, r2);
     */
    /* JADX WARNING: Missing block: B:30:0x00af, code skipped:
            return true;
     */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
        r8 = this;
        r0 = r8.b;
        r1 = 1;
        r2 = 0;
        if (r0 != 0) goto L_0x0017;
    L_0x0006:
        r0 = defpackage.pq.a();
        r3 = a;
        r4 = new java.lang.Throwable[r2];
        r5 = "WorkManager is not initialized; requesting retry.";
        r0.a(r3, r5, r4);
        r8.jobFinished(r9, r1);
        return r2;
    L_0x0017:
        r0 = r9.getExtras();
        r3 = "EXTRA_WORK_SPEC_ID";
        r0 = r0.getString(r3);
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 == 0) goto L_0x0035;
    L_0x0027:
        r9 = defpackage.pq.a();
        r0 = a;
        r1 = new java.lang.Throwable[r2];
        r3 = "WorkSpec id not found!";
        r9.c(r0, r3, r1);
        return r2;
    L_0x0035:
        r3 = r8.c;
        monitor-enter(r3);
        r4 = r8.c;	 Catch:{ all -> 0x00b0 }
        r4 = r4.containsKey(r0);	 Catch:{ all -> 0x00b0 }
        if (r4 == 0) goto L_0x0057;
    L_0x0040:
        r9 = defpackage.pq.a();	 Catch:{ all -> 0x00b0 }
        r4 = a;	 Catch:{ all -> 0x00b0 }
        r5 = "Job is already being executed by SystemJobService: %s";
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x00b0 }
        r1[r2] = r0;	 Catch:{ all -> 0x00b0 }
        r0 = java.lang.String.format(r5, r1);	 Catch:{ all -> 0x00b0 }
        r1 = new java.lang.Throwable[r2];	 Catch:{ all -> 0x00b0 }
        r9.a(r4, r0, r1);	 Catch:{ all -> 0x00b0 }
        monitor-exit(r3);	 Catch:{ all -> 0x00b0 }
        return r2;
    L_0x0057:
        r4 = defpackage.pq.a();	 Catch:{ all -> 0x00b0 }
        r5 = a;	 Catch:{ all -> 0x00b0 }
        r6 = "onStartJob for %s";
        r7 = new java.lang.Object[r1];	 Catch:{ all -> 0x00b0 }
        r7[r2] = r0;	 Catch:{ all -> 0x00b0 }
        r6 = java.lang.String.format(r6, r7);	 Catch:{ all -> 0x00b0 }
        r2 = new java.lang.Throwable[r2];	 Catch:{ all -> 0x00b0 }
        r4.a(r5, r6, r2);	 Catch:{ all -> 0x00b0 }
        r2 = r8.c;	 Catch:{ all -> 0x00b0 }
        r2.put(r0, r9);	 Catch:{ all -> 0x00b0 }
        monitor-exit(r3);	 Catch:{ all -> 0x00b0 }
        r2 = 0;
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 24;
        if (r3 < r4) goto L_0x00aa;
    L_0x0079:
        r2 = new androidx.work.WorkerParameters$a;
        r2.<init>();
        r3 = r9.getTriggeredContentUris();
        if (r3 == 0) goto L_0x008e;
    L_0x0084:
        r3 = r9.getTriggeredContentUris();
        r3 = java.util.Arrays.asList(r3);
        r2.b = r3;
    L_0x008e:
        r3 = r9.getTriggeredContentAuthorities();
        if (r3 == 0) goto L_0x009e;
    L_0x0094:
        r3 = r9.getTriggeredContentAuthorities();
        r3 = java.util.Arrays.asList(r3);
        r2.a = r3;
    L_0x009e:
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 28;
        if (r3 < r4) goto L_0x00aa;
    L_0x00a4:
        r9 = r9.getNetwork();
        r2.c = r9;
    L_0x00aa:
        r9 = r8.b;
        r9.a(r0, r2);
        return r1;
    L_0x00b0:
        r9 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00b0 }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.b == null) {
            pq.a().a(a, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String string = jobParameters.getExtras().getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            pq.a().c(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        pq.a().a(a, String.format("onStopJob for %s", new Object[]{string}), new Throwable[0]);
        synchronized (this.c) {
            this.c.remove(string);
        }
        this.b.b(string);
        return !this.b.f.c(string);
    }
}
