package defpackage;

import java.util.HashMap;

/* renamed from: y */
public final class y {
    public final HashMap<String, w> a = new HashMap();

    public final void a() {
        for (w a : this.a.values()) {
            a.a();
        }
        this.a.clear();
    }

    public final void a(String str, w wVar) {
        w wVar2 = (w) this.a.put(str, wVar);
        if (wVar2 != null) {
            wVar2.a();
        }
    }
}
