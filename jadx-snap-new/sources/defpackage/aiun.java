package defpackage;

import defpackage.aiul.a;
import defpackage.aiul.b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: aiun */
public final class aiun {
    public static final aiun a = new aiun(new a(), b.a);
    public final ConcurrentMap<String, aium> b = new ConcurrentHashMap();

    private aiun(aium... aiumArr) {
        for (int i = 0; i < 2; i++) {
            aium aium = aiumArr[i];
            this.b.put(aium.a(), aium);
        }
    }
}
