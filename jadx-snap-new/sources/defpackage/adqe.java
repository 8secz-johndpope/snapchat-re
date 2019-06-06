package defpackage;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import defpackage.aesm.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: adqe */
public final class adqe implements adpx, qqd {
    private final adpz a;
    private final ScheduledExecutorService b;
    private final long c;
    private final ConcurrentHashMap<String, Long> d = new ConcurrentHashMap();

    public adqe(adpz adpz, ScheduledExecutorService scheduledExecutorService) {
        this.a = adpz;
        this.b = scheduledExecutorService;
        this.c = TelemetryConstants.FLUSH_DELAY_MS;
        this.b.scheduleAtFixedRate(new -$$Lambda$adqe$7NbBAaeo_-ohXpeiBGwwmNSXMJk(this), 0, Math.max(15000, 1000), TimeUnit.MILLISECONDS);
    }

    private void a() {
        if (this.a.f()) {
            aeuk aeuk = (aeuk) adqs.b(a.PING);
            if (aeuk != null) {
                this.a.a(aeuk, new -$$Lambda$adqe$-1nXuSYSnFrtuk5Fr4UWXO_G54I(this, aeuk.p, aeuk));
                return;
            }
            throw new RuntimeException("Got a null PingMessage!");
        }
    }

    private void a(String str) {
        Long l = (Long) this.d.remove(str);
        if (l != null) {
            this.a.g().a(System.currentTimeMillis() - l.longValue());
            if (this.a.f()) {
                this.a.d();
            }
        }
    }

    private /* synthetic */ void a(String str, aeuk aeuk, psd psd, String str2) {
        if (psd != psd.SUCCESS) {
            if (psd == psd.MESSAGE_QUEUE_FULL) {
                a(str);
            }
            return;
        }
        this.d.put(aeuk.p, Long.valueOf(System.currentTimeMillis()));
        this.b.schedule(new -$$Lambda$adqe$xZ18qrcMF1bGPqJtqgu0obMwnNw(this, str), TelemetryConstants.FLUSH_DELAY_MS, TimeUnit.MILLISECONDS);
    }

    private /* synthetic */ void b(String str) {
        a(str);
    }

    public final void a(aesm aesm) {
        if (a.a(aesm.o) == a.PING_RESPONSE) {
            Long l = (Long) this.d.remove(((aeum) aesm).a);
            if (l != null) {
                this.a.g().a(System.currentTimeMillis() - l.longValue());
            }
        }
    }

    public final void a(qqc qqc) {
        if (qqc == qqc.CONNECTED) {
            this.d.clear();
        }
    }
}
