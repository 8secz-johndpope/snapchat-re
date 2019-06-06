package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase.AnonymousClass1;
import androidx.work.impl.utils.ForceStopRunnable;
import com.snapchat.android.R;
import defpackage.aa;
import defpackage.ap.a;
import defpackage.ap.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: qg */
public final class qg extends pw {
    public static qg j;
    public static qg k;
    public static final Object l = new Object();
    public Context a;
    public pl b;
    public WorkDatabase c;
    public so d;
    public List<qc> e;
    public qb f;
    public sg g;
    public boolean h;
    public PendingResult i;
    private final qh m;

    public qg(Context context, pl plVar, so soVar) {
        this(context, plVar, soVar, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    private qg(Context context, pl plVar, so soVar, boolean z) {
        a aVar;
        this.m = new qh();
        Context applicationContext = context.getApplicationContext();
        if (z) {
            aVar = new a(applicationContext, WorkDatabase.class, null);
            aVar.b = true;
        } else {
            aVar = ao.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
        }
        AnonymousClass1 anonymousClass1 = new b() {
            public final void a(aa aaVar) {
                super.a(aaVar);
                aaVar.beginTransaction();
                try {
                    aaVar.execSQL("UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
                    StringBuilder stringBuilder = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
                    stringBuilder.append(System.currentTimeMillis() - WorkDatabase.f);
                    stringBuilder.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    aaVar.execSQL(stringBuilder.toString());
                    aaVar.setTransactionSuccessful();
                } finally {
                    aaVar.endTransaction();
                }
            }
        };
        if (aVar.a == null) {
            aVar.a = new ArrayList();
        }
        aVar.a.add(anonymousClass1);
        a a = aVar.a(qf.a).a(new qf.a(applicationContext)).a(qf.b).a(qf.c);
        a.c = false;
        WorkDatabase workDatabase = (WorkDatabase) a.a();
        pq.a(new pq.a(plVar.c));
        List asList = Arrays.asList(new qc[]{qd.a(applicationContext, this), new qj(applicationContext, this)});
        qb qbVar = new qb(context, plVar, soVar, workDatabase, asList);
        context = context.getApplicationContext();
        this.a = context;
        this.b = plVar;
        this.d = soVar;
        this.c = workDatabase;
        this.e = asList;
        this.f = qbVar;
        this.g = new sg(this.a);
        this.h = false;
        this.d.a(new ForceStopRunnable(context, this));
    }

    public static qg b() {
        synchronized (l) {
            qg qgVar;
            if (j != null) {
                qgVar = j;
                return qgVar;
            }
            qgVar = k;
            return qgVar;
        }
    }

    public final ps a(String str) {
        sc a = sc.a(str, this, true);
        this.d.a(a);
        return a.a;
    }

    public final ps a(String str, int i, pt ptVar) {
        qe qeVar = new qe(this, str, 1, Collections.singletonList(ptVar));
        if (qeVar.g) {
            pq a = pq.a();
            String str2 = qe.a;
            Object[] objArr = new Object[1];
            objArr[0] = TextUtils.join(ppy.d, qeVar.f);
            a.b(str2, String.format("Already enqueued work ids (%s)", objArr));
        } else {
            sd sdVar = new sd(qeVar);
            qeVar.b.d.a(sdVar);
            qeVar.h = sdVar.a;
        }
        return qeVar.h;
    }

    public final void a(String str, WorkerParameters.a aVar) {
        this.d.a(new sh(this, str, aVar));
    }

    public final void b(String str) {
        this.d.a(new si(this, str));
    }

    public final void c() {
        if (VERSION.SDK_INT >= 23) {
            JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                if (allPendingJobs != null) {
                    for (JobInfo jobInfo : allPendingJobs) {
                        if (jobInfo.getExtras().containsKey("EXTRA_WORK_SPEC_ID")) {
                            jobScheduler.cancel(jobInfo.getId());
                        }
                    }
                }
            }
        }
        this.c.g().b();
        qd.a(this.b, this.c, this.e);
    }
}
