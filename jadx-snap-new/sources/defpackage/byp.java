package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: byp */
public final class byp {
    public final File a;
    public final File b;

    /* renamed from: byp$a */
    static final class a extends OutputStream {
        private final FileOutputStream a;
        private boolean b = false;

        public a(File file) {
            this.a = new FileOutputStream(file);
        }

        public final void close() {
            if (!this.b) {
                this.b = true;
                flush();
                try {
                    this.a.getFD().sync();
                } catch (IOException e) {
                    Log.w("AtomicFile", "Failed to sync file descriptor:", e);
                }
                this.a.close();
            }
        }

        public final void flush() {
            this.a.flush();
        }

        public final void write(int i) {
            this.a.write(i);
        }

        public final void write(byte[] bArr) {
            this.a.write(bArr);
        }

        public final void write(byte[] bArr, int i, int i2) {
            this.a.write(bArr, i, i2);
        }
    }

    public byp(File file) {
        this.a = file;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getPath());
        stringBuilder.append(".bak");
        this.b = new File(stringBuilder.toString());
    }

    public final OutputStream a() {
        StringBuilder stringBuilder;
        if (this.a.exists()) {
            if (this.b.exists()) {
                this.a.delete();
            } else if (!this.a.renameTo(this.b)) {
                StringBuilder stringBuilder2 = new StringBuilder("Couldn't rename file ");
                stringBuilder2.append(this.a);
                stringBuilder2.append(" to backup file ");
                stringBuilder2.append(this.b);
                Log.w("AtomicFile", stringBuilder2.toString());
            }
        }
        try {
            return new a(this.a);
        } catch (FileNotFoundException e) {
            if (this.a.getParentFile().mkdirs()) {
                try {
                    return new a(this.a);
                } catch (FileNotFoundException e2) {
                    stringBuilder = new StringBuilder("Couldn't create ");
                    stringBuilder.append(this.a);
                    throw new IOException(stringBuilder.toString(), e2);
                }
            }
            stringBuilder = new StringBuilder("Couldn't create directory ");
            stringBuilder.append(this.a);
            throw new IOException(stringBuilder.toString(), e2);
        }
    }
}
