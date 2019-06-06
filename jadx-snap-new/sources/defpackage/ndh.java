package defpackage;

import android.location.Location;
import com.brightcove.player.event.Event;
import defpackage.ndz.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ndh */
public final class ndh implements ajda, ajej, a {
    private AtomicReference<ajcy> a = new AtomicReference();
    private AtomicBoolean b = new AtomicBoolean(false);
    private AtomicBoolean c = new AtomicBoolean(false);
    private final ndm d;
    private final ndz e;

    /* renamed from: ndh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public ndh(ndm ndm, ndz ndz) {
        akcr.b(ndm, "listenerSetupManager");
        akcr.b(ndz, "currentLocationProvider");
        this.d = ndm;
        this.e = ndz;
    }

    private final void a() {
        this.d.b(false);
        this.e.b((a) this);
        this.e.b();
        this.c.set(false);
    }

    public final void a(Location location) {
        String str = null;
        if (!akgb.a(location != null ? location.getProvider() : null, "gps", false)) {
            if (location != null) {
                str = location.getProvider();
            }
            if (!akgb.a(str, "fused", false)) {
                this.c.set(true);
                return;
            }
        }
        a();
        if (location != null && !this.b.get()) {
            ((ajcy) this.a.get()).a();
        }
    }

    public final void dispose() {
        this.b.set(true);
        a();
    }

    public final boolean isDisposed() {
        return this.b.get();
    }

    public final void subscribe(ajcy ajcy) {
        akcr.b(ajcy, Event.EMITTER);
        ajcy.a((ajej) this);
        this.a.set(ajcy);
        this.d.b(true);
        this.e.a((a) this);
        this.e.b();
    }
}
