package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: aitc */
public final class aitc implements aitb {
    private final Context a;
    private final String b;
    private final String c;

    public aitc(aiqo aiqo) {
        if (aiqo.f != null) {
            this.a = aiqo.f;
            this.b = aiqo.j();
            StringBuilder stringBuilder = new StringBuilder("Android/");
            stringBuilder.append(this.a.getPackageName());
            this.c = stringBuilder.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public final File a() {
        File filesDir = this.a.getFilesDir();
        String str = "Fabric";
        if (filesDir == null) {
            aiqj.a().a(str, "Null File");
        } else if (filesDir.exists() || filesDir.mkdirs()) {
            return filesDir;
        } else {
            aiqj.a().d(str, "Couldn't create file");
        }
        return null;
    }
}
