package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import defpackage.pv.a;
import java.util.List;

/* renamed from: qs */
public final class qs implements qc {
    private static final String a = pq.a("SystemJobScheduler");
    private final JobScheduler b;
    private final qg c;
    private final se d;
    private final qr e;

    public qs(Context context, qg qgVar) {
        this(context, qgVar, (JobScheduler) context.getSystemService("jobscheduler"), new qr(context));
    }

    private qs(Context context, qg qgVar, JobScheduler jobScheduler, qr qrVar) {
        this.c = qgVar;
        this.b = jobScheduler;
        this.d = new se(context);
        this.e = qrVar;
    }

    private static JobInfo a(JobScheduler jobScheduler, String str) {
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    String str2 = "EXTRA_WORK_SPEC_ID";
                    if (extras.containsKey(str2) && str.equals(extras.getString(str2))) {
                        return jobInfo;
                    }
                }
            }
        }
        return null;
    }

    private void a(rv rvVar, int i) {
        JobInfo a = this.e.a(rvVar, i);
        pq.a().a(a, String.format("Scheduling work ID %s Job ID %s", new Object[]{rvVar.b, Integer.valueOf(i)}), new Throwable[0]);
        this.b.schedule(a);
    }

    public final void a(String str) {
        List<JobInfo> allPendingJobs = this.b.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (str.equals(jobInfo.getExtras().getString("EXTRA_WORK_SPEC_ID"))) {
                    this.c.c.j().b(str);
                    this.b.cancel(jobInfo.getId());
                    if (VERSION.SDK_INT != 23) {
                        return;
                    }
                }
            }
        }
    }

    public final void a(rv... rvVarArr) {
        WorkDatabase workDatabase = this.c.c;
        int length = rvVarArr.length;
        int i = 0;
        while (i < length) {
            rv rvVar = rvVarArr[i];
            workDatabase.c();
            try {
                pq a;
                String str;
                String stringBuilder;
                rv b = workDatabase.g().b(rvVar.b);
                String str2 = "Skipping scheduling ";
                StringBuilder stringBuilder2;
                if (b == null) {
                    a = pq.a();
                    str = a;
                    stringBuilder2 = new StringBuilder(str2);
                    stringBuilder2.append(rvVar.b);
                    stringBuilder2.append(" because it's no longer in the DB");
                    stringBuilder = stringBuilder2.toString();
                } else if (b.c != a.ENQUEUED) {
                    a = pq.a();
                    str = a;
                    stringBuilder2 = new StringBuilder(str2);
                    stringBuilder2.append(rvVar.b);
                    stringBuilder2.append(" because it is no longer enqueued");
                    stringBuilder = stringBuilder2.toString();
                } else {
                    rp a2 = workDatabase.j().a(rvVar.b);
                    if (a2 == null || qs.a(this.b, rvVar.b) == null) {
                        int a3 = a2 != null ? a2.b : this.d.a(0, this.c.b.d);
                        if (a2 == null) {
                            this.c.c.j().a(new rp(rvVar.b, a3));
                        }
                        a(rvVar, a3);
                        if (VERSION.SDK_INT == 23) {
                            a(rvVar, this.d.a(0, this.c.b.d));
                        }
                        workDatabase.e();
                        workDatabase.d();
                        i++;
                    } else {
                        pq.a().a(a, String.format("Skipping scheduling %s because JobScheduler is aware of it already.", new Object[]{rvVar.b}), new Throwable[0]);
                        workDatabase.d();
                        i++;
                    }
                }
                a.b(str, stringBuilder);
                workDatabase.d();
                i++;
            } catch (Throwable th) {
                workDatabase.d();
            }
        }
    }
}
