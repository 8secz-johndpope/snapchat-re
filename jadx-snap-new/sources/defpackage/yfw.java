package defpackage;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: yfw */
public abstract class yfw {
    static ScheduledExecutorService a() {
        return zgb.a(yet.a.callsite("FileManager")).e();
    }

    static ygg a(aipn<igc> aipn, aipn<Set<ygh>> aipn2) {
        return new ygg(aipn, aipn2);
    }

    static zfy b() {
        return new zfy("storageStateMonitor");
    }
}
