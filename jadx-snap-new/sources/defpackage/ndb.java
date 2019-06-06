package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ndb */
public final class ndb implements ndx {
    private float a;
    private final AtomicBoolean b;

    /* renamed from: ndb$a */
    static class a {
        static final ndb a = new ndb();
    }

    private ndb() {
        this.a = MapboxConstants.MINIMUM_ZOOM;
        this.b = new AtomicBoolean();
    }

    /* synthetic */ ndb(byte b) {
        this();
    }
}
