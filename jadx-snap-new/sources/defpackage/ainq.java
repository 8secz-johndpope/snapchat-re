package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ainq */
public final class ainq {
    public static final void a(AtomicBoolean atomicBoolean, aken<?> aken, boolean z) {
        akcr.b(atomicBoolean, "receiver$0");
        akcr.b(aken, "prop");
        atomicBoolean.set(z);
    }

    public static final boolean a(AtomicBoolean atomicBoolean, aken<?> aken) {
        akcr.b(atomicBoolean, "receiver$0");
        akcr.b(aken, "prop");
        return atomicBoolean.get();
    }
}
