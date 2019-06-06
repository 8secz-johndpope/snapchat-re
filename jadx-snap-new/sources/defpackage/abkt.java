package defpackage;

import com.google.common.base.Supplier;
import com.google.gson.stream.JsonWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: abkt */
public final class abkt {
    public static final Supplier<abkt> a = new 1();
    private ConcurrentMap<String, abks> b = new ConcurrentHashMap();

    /* renamed from: abkt$1 */
    static class 1 extends abpo<abkt> {
        1() {
        }

        public final /* synthetic */ Object a() {
            return new abkt();
        }
    }

    private Map<String, Map<String, String>> a() {
        HashMap hashMap = new HashMap();
        for (abks abks : this.b.values()) {
            hashMap.put(abks.a(), abks.a);
        }
        return hashMap;
    }

    public final File a(File file) {
        Throwable th;
        Closeable closeable = null;
        Closeable fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file, false);
            try {
                JsonWriter jsonWriter = new JsonWriter(new PrintWriter(fileOutputStream));
                jsonWriter.setIndent("  ");
                abst.a().a.toJson(a(), (Type) Map.class, jsonWriter);
                jsonWriter.flush();
                aklc.a(fileOutputStream);
            } catch (IOException unused) {
                closeable = fileOutputStream;
                aklc.a(closeable);
                return file;
            } catch (Throwable th2) {
                th = th2;
                aklc.a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            aklc.a(closeable);
            return file;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            aklc.a(fileOutputStream);
            throw th;
        }
        return file;
    }
}
