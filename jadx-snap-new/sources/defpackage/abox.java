package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* renamed from: abox */
public final class abox {
    private static File a(Context context) {
        return "mounted".equals(Environment.getExternalStorageState()) ? context.getExternalFilesDir(null) : context.getFilesDir();
    }

    public static String a(Context context, String str) {
        return new File(abox.a(context), str).getAbsolutePath();
    }
}
