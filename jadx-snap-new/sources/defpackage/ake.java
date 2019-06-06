package defpackage;

import android.content.Context;
import defpackage.akc.a;
import java.io.File;

/* renamed from: ake */
public final class ake extends akc {
    public ake(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private ake(final Context context, final String str) {
        super(new a() {
            public final File a() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                String str = str;
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        });
    }
}
