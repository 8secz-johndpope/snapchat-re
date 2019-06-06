package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

/* renamed from: iga */
public final class iga {

    /* renamed from: iga$1 */
    static class 1 extends ThreadLocal<Random> {
        1() {
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object initialValue() {
            return new Random();
        }
    }

    static {
        1 1 = new 1();
    }

    public static int a(InputStream inputStream, File file) {
        BufferedOutputStream b = iga.b(file);
        int b2 = iga.b(inputStream, b);
        b.close();
        return b2;
    }

    public static BufferedInputStream a(File file) {
        String str = "File '";
        StringBuilder stringBuilder;
        if (!file.exists()) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(file);
            stringBuilder.append("' does not exist");
            throw new FileNotFoundException(stringBuilder.toString());
        } else if (file.isDirectory()) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(file);
            stringBuilder.append("' exists but is a directory");
            throw new IOException(stringBuilder.toString());
        } else if (file.canRead()) {
            return new BufferedInputStream(new FileInputStream(file), 16384);
        } else {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(file);
            stringBuilder.append("' cannot be read");
            throw new IOException(stringBuilder.toString());
        }
    }

    public static BufferedInputStream a(InputStream inputStream) {
        return new BufferedInputStream(inputStream, 16384);
    }

    public static BufferedOutputStream a(OutputStream outputStream) {
        return new BufferedOutputStream(outputStream, 16384);
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        iga.c(inputStream, outputStream);
    }

    private static int b(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[16384];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 16384);
            if (read <= 0) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
        return j > 2147483647L ? -1 : (int) j;
    }

    public static BufferedOutputStream b(File file) {
        return new BufferedOutputStream(new FileOutputStream(file), 16384);
    }

    private static int c(InputStream inputStream, OutputStream outputStream) {
        try {
            int b = iga.b(inputStream, outputStream);
            try {
                outputStream.close();
                return b;
            } catch (IOException unused) {
                return b;
            }
        } catch (IOException unused2) {
            return 0;
        }
    }
}
