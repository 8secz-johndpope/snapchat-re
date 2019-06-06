package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: abrh */
public final class abrh implements abrf {
    private final abqo a;

    public abrh() {
        this.a = new abqo();
    }

    public abrh(abqo abqo) {
        this.a = abqo;
    }

    public final boolean a(File file, byte[] bArr) {
        System.currentTimeMillis();
        try {
            File parentFile = file.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                return false;
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            Closeable b = abrg.b(file);
            b.write(bArr);
            b.flush();
            System.currentTimeMillis();
            aklc.a(b);
            return true;
        } catch (IOException unused) {
            return false;
        } finally {
            aklc.a(null);
        }
    }

    public final byte[] a(File file) {
        Closeable a;
        Throwable th;
        System.currentTimeMillis();
        byte[] bArr = null;
        try {
            a = abrg.a(file);
            try {
                bArr = abrg.a((InputStream) a, 16384);
                System.currentTimeMillis();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                th = th2;
                aklc.a(a);
                throw th;
            }
        } catch (IOException unused2) {
            a = null;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            aklc.a(a);
            throw th;
        }
        aklc.a(a);
        return bArr;
    }
}
