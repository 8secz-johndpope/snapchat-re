package defpackage;

import android.content.Context;
import com.snapchat.android.framework.misc.AppContext;
import java.io.File;
import java.io.IOException;

/* renamed from: rxu */
public final class rxu implements abov {
    private static String a;
    private static File b;
    private ajwy<rxy> c;

    public rxu(ajwy<rxy> ajwy) {
        this.c = ajwy;
    }

    public static String d() {
        if (a == null) {
            a = AppContext.get().getFilesDir().getAbsolutePath();
        }
        return a;
    }

    static File e() {
        if (b == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(rxu.d());
            stringBuilder.append("/netlog.json");
            b = new File(stringBuilder.toString());
        }
        return b;
    }

    public final File a(Context context, File file) {
        ajwy ajwy = this.c;
        if (ajwy == null) {
            return file;
        }
        rxy rxy = (rxy) ajwy.get();
        rxy.b = false;
        rxy.a.a();
        if (!rxu.e().exists()) {
            return file;
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            ygt.a(new String[]{rxu.e().getAbsolutePath()}, file.getAbsolutePath());
        } catch (IOException unused) {
        }
        ((rxy) this.c.get()).a();
        return file;
    }

    public final String a() {
        return "cronet_log.zip";
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return 10;
    }
}
