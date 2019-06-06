package defpackage;

import android.os.Build;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: yxp */
public final class yxp {
    private static final Set<String> a = ImmutableSet.of("SM-T211", "SM-T212", "SM-T211M", "SM-T215", "SAMSUNG-SM-T217A", "SM-T217S", "SM-T217T", "SM-T210", "SM-T210R", "SM-T210L");
    private static final Set<String> b = ImmutableSet.of("403SC", "SM-T230NW", "SM-T230NW", "SM-T231", "SM-T232", "SM-T235", "SM-T235Y", "SM-T237P", "SM-T237V", "SM-T239", "SM-T2397", "SM-T239M", "SM-T239C", "SM-T230", "SM-T230NY", "SM-T230X", "SM-T230NY", "SM-T230NT", "SM-T230NU", "SM-T230NU");

    public static boolean a() {
        String str = Build.MODEL;
        return a.contains(str) || b.contains(str);
    }
}
