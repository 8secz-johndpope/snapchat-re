package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.lwo.d;
import defpackage.mmh.a;

/* renamed from: kxl */
public final class kxl implements mmh {
    private final ajfb<lwo> a;

    public kxl(ajfb<lwo> ajfb) {
        akcr.b(ajfb, "captureActionConsumer");
        this.a = ajfb;
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, MapboxEvent.KEY_GESTURE_ID);
        if (!akcr.a((Object) aVar, a.a.a)) {
            return false;
        }
        this.a.accept(d.a);
        return true;
    }
}
