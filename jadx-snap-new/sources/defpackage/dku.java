package defpackage;

import com.google.common.base.Stopwatch;
import java.util.concurrent.TimeUnit;

/* renamed from: dku */
public abstract class dku {
    private long a = -1;
    private final String b;
    private final ilv c;

    public dku(String str, ilv ilv) {
        akcr.b(str, "logQueueName");
        akcr.b(ilv, "graphene");
        this.b = str;
        this.c = ilv;
    }

    public final synchronized long a() {
        if (this.a == -1) {
            this.a = c();
        }
        return this.a;
    }

    public final synchronized long a(boolean z) {
        Stopwatch createStarted = Stopwatch.createStarted();
        this.a = a() + 1;
        if (z) {
            b();
            ilv ilv = this.c;
            String b = dih.b(this.b);
            akcr.a((Object) b, "BlizzardLoggerUtils.formatLogQName(logQueueName)");
            ilv.a(ino.SEQID_GENERATE_LATENCY_MICRO.a("logQ", b), createStarted.elapsed(TimeUnit.MILLISECONDS));
        }
        return a();
    }

    public abstract void b();

    public abstract long c();
}
