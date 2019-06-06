package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: nub */
public final class nub implements abov {
    public WeakReference<nuc> a;

    public final File a(Context context, File file) {
        akcr.b(file, "outputFile");
        if (VERSION.SDK_INT >= 21) {
            System.currentTimeMillis();
            WeakReference weakReference = this.a;
            String a = (weakReference == null || ((nuc) weakReference.get()) == null) ? "No Map State Available." : nuc.a();
            akbd.a(file, a);
        }
        return file;
    }

    public final String a() {
        return "nyc_state_dump.txt";
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return 10;
    }
}
