package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.dof.a;

/* renamed from: ear */
public final class ear implements doy {
    private final dny a;

    public ear(dny dny) {
        akcr.b(dny, "analyticsReporter");
        this.a = dny;
    }

    public final void a() {
        this.a.a(a.START_RECORDING);
    }

    public final void a(dpp dpp) {
        akcr.b(dpp, "cameraProxy");
    }

    public final void a(dpp dpp, abtl abtl) {
        akcr.b(dpp, "cameraProxy");
        akcr.b(abtl, MapboxEvent.KEY_RESOLUTION);
    }

    public final void b() {
        this.a.a(a.RECORDING_STARTED);
    }

    public final void c() {
        this.a.a(a.STOP_RECORDING);
    }

    public final void d() {
        this.a.a(a.RECORDING_SUCCESS);
    }
}
