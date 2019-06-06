package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: hmf */
public final class hmf {
    public final Map<hbj, hmi<hio>> a = new HashMap();

    public hmf(Set<hmi<hio>> set) {
        akcr.b(set, "prefetchRequestProviders");
        for (hmi hmi : set) {
            for (hbj put : hmi.a()) {
                this.a.put(put, hmi);
            }
        }
    }
}
