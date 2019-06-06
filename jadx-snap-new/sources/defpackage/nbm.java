package defpackage;

import android.location.Location;
import defpackage.nct.d;

/* renamed from: nbm */
public final class nbm implements d {
    private final nbl a;

    public nbm(nbl nbl) {
        akcr.b(nbl, "currentLocationManager");
        this.a = nbl;
    }

    public final Location a() {
        return (Location) this.a.b().b();
    }

    public final ajdp<Location> b() {
        return this.a.c();
    }
}
