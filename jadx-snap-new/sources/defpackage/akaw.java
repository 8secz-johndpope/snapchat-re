package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: akaw */
public final class akaw {
    public static long a(InputStream inputStream, OutputStream outputStream) {
        akcr.b(inputStream, "receiver$0");
        akcr.b(outputStream, "out");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static final byte[] a(InputStream inputStream) {
        akcr.b(inputStream, "receiver$0");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        akaw.a(inputStream, byteArrayOutputStream);
        Object toByteArray = byteArrayOutputStream.toByteArray();
        akcr.a(toByteArray, "buffer.toByteArray()");
        return toByteArray;
    }
}
