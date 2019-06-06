package defpackage;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: aixv */
public final class aixv {
    public static long a(InputStream inputStream, OutputStream outputStream) {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArr = new byte[16384];
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
