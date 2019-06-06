package defpackage;

import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rqf */
final class rqf extends rpi {
    public rqf(b bVar) {
        akcr.b(bVar, "delegate");
        super(bVar, false);
    }

    public final String a() {
        return "VIDEO_PLAYBACK";
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "state");
        return aVar.a() == abjc.VIDEO;
    }
}
