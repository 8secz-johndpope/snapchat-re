package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kqy */
public final class kqy {
    public long a;
    public krb b;
    public long c;
    public final Map<String, krb> d = new HashMap();
    public kqn e;
    private final String f;

    public kqy(String str) {
        akcr.b(str, "sessionId");
        this.f = str;
    }

    public final afji a() {
        afji afji = new afji();
        afji.c = Long.valueOf(this.a);
        afji.b = this.f;
        Iterable<krb> values = this.d.values();
        Collection arrayList = new ArrayList(ajyn.a((Iterable) values, 10));
        for (krb a : values) {
            arrayList.add(krc.a(a));
        }
        afji.d = (List) arrayList;
        kqn kqn = this.e;
        afji.a = kqn != null ? kqs.a(kqn) : null;
        return afji;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensesFeatureAdTrackSession(sessionId='");
        stringBuilder.append(this.f);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}
