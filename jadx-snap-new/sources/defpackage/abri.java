package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: abri */
public final class abri implements Closeable {
    private final ZipOutputStream a;

    public abri(OutputStream outputStream) {
        this.a = new ZipOutputStream(outputStream);
    }

    public final OutputStream a(String str) {
        this.a.putNextEntry(new ZipEntry(str));
        return this.a;
    }

    public final void a(String str, String str2) {
        Closeable a = abrg.a(str2);
        try {
            this.a.putNextEntry(new ZipEntry(str));
            aklc.a((InputStream) a, this.a, 16384);
            this.a.closeEntry();
        } finally {
            aklc.a(a);
        }
    }

    public final void a(String str, byte[] bArr) {
        ZipEntry zipEntry = new ZipEntry(str);
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        zipEntry.setMethod(0);
        zipEntry.setCrc(crc32.getValue());
        zipEntry.setSize((long) bArr.length);
        this.a.putNextEntry(zipEntry);
        this.a.write(bArr);
        this.a.closeEntry();
    }

    public final void close() {
        aklc.a(this.a);
    }
}
