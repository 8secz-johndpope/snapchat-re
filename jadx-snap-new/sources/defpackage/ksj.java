package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import java.util.concurrent.TimeUnit;

/* renamed from: ksj */
public final class ksj implements ksk {
    private ksl a;
    private ksl b;
    private ksl c;
    private final mhk d;
    private final ksv e;

    public ksj(mhk mhk, ksv ksv) {
        akcr.b(mhk, "clock");
        akcr.b(ksv, "performanceEventsReporter");
        this.d = mhk;
        this.e = ksv;
    }

    private final void a(boolean z) {
        ksl ksl = this.c;
        if (ksl != null) {
            this.e.a(this.d.a(TimeUnit.MILLISECONDS) - ksl.a, z);
            this.c = null;
        }
    }

    public final void a() {
        a(true);
        this.a = null;
        this.b = null;
    }

    public final void a(String str, kqi kqi) {
        akcr.b(str, DiscoverStorySnapModel.LENSID);
        akcr.b(kqi, "sessionData");
        a(true);
        ksl ksl = this.b;
        if (ksl != null) {
            this.b = null;
            this.e.a(this.d.a(TimeUnit.MILLISECONDS) - ksl.a);
        }
    }

    public final void a(kqi kqi) {
        akcr.b(kqi, "sessionData");
        this.a = new ksl(this.d.a(TimeUnit.MILLISECONDS), kqi);
    }

    public final void b(kqi kqi) {
        akcr.b(kqi, "sessionData");
        ksl ksl = this.a;
        if (ksl != null) {
            this.a = null;
            this.e.b(this.d.a(TimeUnit.MILLISECONDS) - ksl.a);
        }
    }

    public final void c(kqi kqi) {
        akcr.b(kqi, "sessionData");
        a(true);
        this.c = new ksl(this.d.a(TimeUnit.MILLISECONDS), kqi);
    }

    public final void d(kqi kqi) {
        akcr.b(kqi, "sessionData");
        this.b = new ksl(this.d.a(TimeUnit.MILLISECONDS), kqi);
        a(false);
    }
}
