package defpackage;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: gmj */
public final class gmj {
    public static Predicate<Entry<String, List<String>>> a() {
        return -$$Lambda$gmj$iBpL4B0T_DU4hK0mBEPtB_BygJE.INSTANCE;
    }

    private static /* synthetic */ boolean a(Entry entry) {
        if (entry != null) {
            String str = (String) entry.getKey();
            if (str == null ? false : str.startsWith("__xsc_local__")) {
                return true;
            }
        }
        return false;
    }
}
