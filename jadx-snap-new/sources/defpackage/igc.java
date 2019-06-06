package defpackage;

import android.os.StatFs;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.io.File;

/* renamed from: igc */
public final class igc {
    public ajdx<File> a;
    public ajdx<File> b;
    @Deprecated
    public ajdx<File> c;
    public ajdx<File> d;
    @Deprecated
    public ajdx<File> e;
    @Deprecated
    public ajdx<File> f;
    private final long g;
    private final String h;
    private final String i;
    private final String j;

    /* renamed from: igc$a */
    public static class a {
        public final igc a = new igc();
    }

    private igc() {
        this.g = 10;
        this.h = "Snapchat";
        this.i = "Spectacles";
        this.j = "Download";
    }

    /* synthetic */ igc(byte b) {
        this();
    }

    public static long a(File file) {
        if (file == null) {
            return 0;
        }
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    private /* synthetic */ Optional b(File file) {
        return Optional.of(new File(file, "Spectacles"));
    }

    private /* synthetic */ Optional c(File file) {
        return Optional.of(new File(file, "Snapchat"));
    }

    public final ajdx<File> a() {
        return (ajdx) Preconditions.checkNotNull(this.b, "Please initialize by calling #setCacheDirectories");
    }

    public final ajdx<File> b() {
        return (ajdx) Preconditions.checkNotNull(this.d, "Please initialize by calling #setFilesDirectories");
    }

    public final ajdx<File> c() {
        return (ajdx) Preconditions.checkNotNull(this.a, "Please initialize by calling #withDataDirectory");
    }

    @Deprecated
    public final ajdx<Optional<File>> d() {
        ajdx ajdx = this.f;
        return ajdx != null ? ajdx.f(new -$$Lambda$igc$Ux_ucbpL22ZQnwHaRBCxJZmB73o(this)) : ajdx.b(Optional.absent());
    }

    @Deprecated
    public final ajdx<Optional<File>> e() {
        ajdx ajdx = this.f;
        return ajdx != null ? ajdx.f(new -$$Lambda$igc$Q6_oFpmPIX4dQQx4Dy_g3KZBGFw(this)) : ajdx.b(Optional.absent());
    }
}
