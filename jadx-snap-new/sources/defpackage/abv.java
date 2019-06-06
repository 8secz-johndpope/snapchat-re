package defpackage;

import android.content.Context;
import defpackage.abt.a;
import java.io.File;

/* renamed from: abv */
public final class abv extends abt {
    public abv(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private abv(final Context context, final String str) {
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
