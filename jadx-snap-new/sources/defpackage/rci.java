package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.column.FeedKind;

/* renamed from: rci */
public final class rci {
    public final long a = this.d.L._id();
    public final String b = this.d.b();
    public final FeedKind c = this.d.c();
    private final rdt d;

    public rci(rdt rdt) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        this.d = rdt;
    }
}
