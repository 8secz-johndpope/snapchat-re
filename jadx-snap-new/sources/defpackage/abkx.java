package defpackage;

import com.google.common.io.ByteProcessor;
import com.google.common.io.Files;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: abkx */
public abstract class abkx<T> implements ByteProcessor<T> {
    private static final byte[] d = new byte[8192];
    int a = -1;
    int b;
    byte[] c;
    private int e = 0;

    public final T a(File file) {
        Throwable th;
        Closeable openStream;
        try {
            openStream = Files.asByteSource(file).openStream();
            try {
                a();
                int read = openStream.read(d);
                if (read != -1) {
                    a(d, read);
                }
                Object result = getResult();
                aklc.a(openStream);
                return result;
            } catch (IOException unused) {
                aklc.a(openStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                aklc.a(openStream);
                throw th;
            }
        } catch (IOException unused2) {
            openStream = null;
            aklc.a(openStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            openStream = null;
            aklc.a(openStream);
            throw th;
        }
    }

    public void a() {
        this.e = 0;
        this.a = -1;
    }

    public abstract boolean a(int i);

    public abstract boolean a(byte[] bArr, int i);

    public final int b() {
        int i = 0;
        for (int i2 = this.a; i2 < this.b; i2++) {
            byte b = this.c[i2];
            if (b < (byte) 48 || b > (byte) 57) {
                StringBuilder stringBuilder = new StringBuilder("Bad format in word ");
                stringBuilder.append(this.e);
                stringBuilder.append(", buffer: ");
                stringBuilder.append(Arrays.toString(this.c));
                throw new IOException(stringBuilder.toString());
            }
            i = (i * 10) + (b - 48);
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        int i = this.a;
        if (i >= 0 && i < this.b) {
            if (!a(this.e)) {
                return false;
            }
            this.e++;
        }
        return true;
    }
}
