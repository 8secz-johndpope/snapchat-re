package defpackage;

import android.content.res.AssetFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* renamed from: yeu */
public abstract class yeu implements Closeable {
    private FileInputStream[] a;
    private long[] b;

    protected yeu(long[] jArr) {
        this.b = jArr;
    }

    public final int a() {
        return this.b.length;
    }

    @Deprecated
    public abstract File a(int i);

    public final AssetFileDescriptor b() {
        File a = a(0);
        return a != null ? yev.c(a) : null;
    }

    public final FileInputStream b(int i) {
        if (this.a == null) {
            try {
                this.a = new FileInputStream[this.b.length];
                for (int i2 = 0; i2 < this.b.length; i2++) {
                    this.a[i2] = new FileInputStream(a(i2));
                }
            } catch (FileNotFoundException unused) {
                for (int i3 = 0; i3 < this.b.length; i3++) {
                    FileInputStream[] fileInputStreamArr = this.a;
                    if (fileInputStreamArr[i3] == null) {
                        break;
                    }
                    yev.a(fileInputStreamArr[i3]);
                }
                this.a = null;
                return null;
            }
        }
        FileInputStream[] fileInputStreamArr2 = this.a;
        return fileInputStreamArr2 != null ? fileInputStreamArr2[i] : null;
    }

    public final long c(int i) {
        return this.b[i];
    }

    @Deprecated
    public final File c() {
        return a(0);
    }

    public void close() {
        FileInputStream[] fileInputStreamArr = this.a;
        if (fileInputStreamArr != null) {
            for (Closeable a : fileInputStreamArr) {
                yev.a(a);
            }
        }
    }

    public final FileInputStream d() {
        return b(0);
    }

    public final String e() {
        return yes.a(new InputStreamReader(b(0), yes.b));
    }

    public final long f() {
        return this.b[0];
    }
}
