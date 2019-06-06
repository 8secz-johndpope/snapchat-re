package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;

/* renamed from: qd */
public final class qd {
    private static final String a = pq.a("Schedulers");

    @SuppressLint({"NewApi"})
    static qc a(Context context, qg qgVar) {
        qc qsVar;
        boolean z = true;
        if (VERSION.SDK_INT >= 23) {
            qsVar = new qs(context, qgVar);
            sf.a(context, SystemJobService.class, true);
            pq.a().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            z = false;
        } else {
            qsVar = new qp(context);
            pq.a().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
        }
        sf.a(context, SystemAlarmService.class, z);
        return qsVar;
    }

    public static void a(pl plVar, WorkDatabase workDatabase, List<qc> list) {
        if (list != null && list.size() != 0) {
            rw g = workDatabase.g();
            workDatabase.c();
            try {
                List<rv> a = g.a(VERSION.SDK_INT == 23 ? plVar.e / 2 : plVar.e);
                if (a.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (rv rvVar : a) {
                        g.b(rvVar.b, currentTimeMillis);
                    }
                }
                workDatabase.e();
                if (a.size() > 0) {
                    rv[] rvVarArr = (rv[]) a.toArray(new rv[0]);
                    for (qc a2 : list) {
                        a2.a(rvVarArr);
                    }
                }
            } finally {
                workDatabase.d();
            }
        }
    }
}
