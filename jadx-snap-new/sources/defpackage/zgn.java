package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: zgn */
public final class zgn implements abov {
    public final File a(Context context, File file) {
        Throwable th;
        String str = "No trace available for current app build";
        Closeable closeable = null;
        try {
            Closeable fileOutputStream = new FileOutputStream(file, false);
            try {
                fileOutputStream.write(str.getBytes());
                aklc.a(fileOutputStream);
            } catch (IOException unused) {
                closeable = fileOutputStream;
                aklc.a(closeable);
                new StringBuilder("dumpTraceRecordToDisk: Trace written to file://").append(file.getAbsolutePath());
                return file;
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream;
                aklc.a(closeable);
                throw th;
            }
        } catch (IOException unused2) {
            aklc.a(closeable);
            new StringBuilder("dumpTraceRecordToDisk: Trace written to file://").append(file.getAbsolutePath());
            return file;
        } catch (Throwable th3) {
            th = th3;
            aklc.a(closeable);
            throw th;
        }
        new StringBuilder("dumpTraceRecordToDisk: Trace written to file://").append(file.getAbsolutePath());
        return file;
    }

    public final String a() {
        return "performance_trace_log.json";
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return 60;
    }
}
