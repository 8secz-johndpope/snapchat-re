package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: adbp */
public final class adbp {
    public static File a(Context context) {
        return new File(context.getCacheDir(), "com.snapchat.map");
    }
}
