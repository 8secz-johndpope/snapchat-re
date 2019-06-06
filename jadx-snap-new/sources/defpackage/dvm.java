package defpackage;

import android.os.Build.VERSION;
import android.util.ArrayMap;
import android.util.ArraySet;
import java.util.Collections;
import java.util.Set;

/* renamed from: dvm */
public final class dvm {
    public final Set<dou> a;

    public dvm() {
        this.a = VERSION.SDK_INT >= 23 ? new ArraySet() : Collections.newSetFromMap(new ArrayMap());
    }

    public final void a(dou dou) {
        this.a.add(dou);
    }

    public final void b(dou dou) {
        this.a.remove(dou);
    }
}
