package defpackage;

import java.util.HashMap;

/* renamed from: ablc */
public final class ablc {
    public final HashMap<a, Long> a = new HashMap();

    /* renamed from: ablc$a */
    public enum a {
        FLASH,
        FLIP,
        NIGHT_MODE,
        DOUBLE_TAP,
        TIMER,
        PORTRAIT,
        BATCH_CAPTURE,
        GRID,
        DROP_DOWN
    }

    public final void a(a aVar) {
        this.a.put(aVar, Long.valueOf((this.a.containsKey(aVar) ? ((Long) this.a.get(aVar)).longValue() : 0) + 1));
    }
}
