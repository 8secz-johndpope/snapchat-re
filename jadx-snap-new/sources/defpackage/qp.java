package defpackage;

import android.content.Context;

/* renamed from: qp */
public final class qp implements qc {
    private static final String a = pq.a("SystemAlarmScheduler");
    private final Context b;

    public qp(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void a(String str) {
        this.b.startService(ql.c(this.b, str));
    }

    public final void a(rv... rvVarArr) {
        for (rv rvVar : rvVarArr) {
            pq.a().a(a, String.format("Scheduling work with workSpecId %s", new Object[]{rvVar.b}), new Throwable[0]);
            this.b.startService(ql.a(this.b, rvVar.b));
        }
    }
}
