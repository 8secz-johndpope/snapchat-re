package defpackage;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: dhx */
public final class dhx {
    public static final String a;
    public static final Set<String> b;
    public static final Set<String> c;
    public static long d = TimeUnit.DAYS.toMillis(10);

    static {
        String str = "NETWORK_TASK";
        String str2 = "NETWORK_REQUEST";
        a = Joiner.on(ppy.b).join(ImmutableList.of(str2, str));
        b = ImmutableSet.of(str, str2, "APP_CPU_ATTRIBUTION");
        c = ImmutableSet.of(str, str2, "APP_BLIZZARD_REQUEST", "APP_DATA_LOSS");
    }
}
