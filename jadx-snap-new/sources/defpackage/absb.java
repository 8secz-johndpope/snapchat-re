package defpackage;

import android.content.Context;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: absb */
public final class absb {
    boolean a;

    /* renamed from: absb$a */
    static class a {
        static final absb a = new absb();
    }

    protected absb() {
        Context applicationContext = AppContext.get().getApplicationContext();
        this.a = applicationContext != null ? applicationContext.getPackageManager().hasSystemFeature("org.chromium.arc.device_management") : false;
    }
}
