package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: auc */
public final class auc {
    public static long a(InputStream inputStream, OutputStream outputStream) {
        auh.a((Object) inputStream);
        auh.a((Object) outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }
}
