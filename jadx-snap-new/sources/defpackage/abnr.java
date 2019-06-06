package defpackage;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: abnr */
public final class abnr extends ZipInputStream {
    public abnr(InputStream inputStream) {
        super(inputStream);
    }

    public final ZipEntry getNextEntry() {
        ZipEntry nextEntry = super.getNextEntry();
        if (nextEntry == null) {
            return null;
        }
        Object canonicalPath = new File(nextEntry.getName()).getCanonicalPath();
        Object canonicalPath2 = new File(".").getCanonicalPath();
        akcr.a(canonicalPath, "canonicalPath");
        akcr.a(canonicalPath2, "canonicalID");
        if (akgb.b(canonicalPath, canonicalPath2, false)) {
            return nextEntry;
        }
        throw new IllegalStateException("File is outside extraction target directory.");
    }
}
