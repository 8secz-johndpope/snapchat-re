package defpackage;

import java.util.Map;

/* renamed from: gck */
public final class gck {
    public static final gcj a(Map<String, Boolean> map) {
        if (map != null) {
            gcj gcj = map.values().contains(Boolean.TRUE) ? gcj.PRESERVED : gcj.UNPRESERVED;
            if (gcj != null) {
                return gcj;
            }
        }
        return gcj.INITIAL;
    }
}
