package defpackage;

import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rpk */
final class rpk extends rpi {
    public rpk(b bVar) {
        akcr.b(bVar, "delegate");
        super(bVar, true);
    }

    public final String a() {
        return "AUDIO_PLAYBACK";
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "state");
        return aVar.a() == abjc.AUDIO;
    }
}
