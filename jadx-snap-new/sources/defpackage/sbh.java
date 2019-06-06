package defpackage;

import android.net.Uri;

/* renamed from: sbh */
public final class sbh {
    public static final saj a() {
        return -$$Lambda$sbh$NeBtvzC5ga_KjOrXDTUummwU57w.INSTANCE;
    }

    private static /* synthetic */ boolean a(sak sak, String str) {
        if (!(sak == null || str == null)) {
            String scheme = Uri.parse(sak.i()).getScheme();
            str = Uri.parse(str).getScheme();
            if (!(scheme == null || str == null)) {
                return scheme.equalsIgnoreCase(str);
            }
        }
        return false;
    }
}
