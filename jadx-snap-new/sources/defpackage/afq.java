package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: afq */
public final class afq {
    public final Set<agf> a = Collections.newSetFromMap(new WeakHashMap());
    public final List<agf> b = new ArrayList();
    public boolean c;

    public final boolean a(agf agf, boolean z) {
        boolean z2 = true;
        if (agf == null) {
            return true;
        }
        boolean remove = this.a.remove(agf);
        if (!(this.b.remove(agf) || remove)) {
            z2 = false;
        }
        if (z2) {
            agf.c();
            if (z) {
                agf.h();
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{numRequests=");
        stringBuilder.append(this.a.size());
        stringBuilder.append(", isPaused=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
