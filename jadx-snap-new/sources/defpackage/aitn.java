package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;

/* renamed from: aitn */
final class aitn implements aitl {
    private final aiqo a;

    public aitn(aiqo aiqo) {
        this.a = aiqo;
    }

    public final JSONObject a() {
        Throwable e;
        Throwable th;
        String str = "Error while closing settings cache file.";
        String str2 = "Fabric";
        aiqj.a().a(str2, "Reading cached settings...");
        Closeable closeable = null;
        Closeable fileInputStream;
        try {
            JSONObject jSONObject;
            File file = new File(new aitc(this.a).a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(airf.a((InputStream) fileInputStream));
                    closeable = fileInputStream;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        aiqj.a().c(str2, "Failed to fetch cached settings", e);
                        airf.a(fileInputStream, str);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = fileInputStream;
                        airf.a(closeable, str);
                        throw th;
                    }
                }
            }
            aiqj.a().a(str2, "No cached settings found.");
            jSONObject = null;
            airf.a(closeable, str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            aiqj.a().c(str2, "Failed to fetch cached settings", e);
            airf.a(fileInputStream, str);
            return null;
        } catch (Throwable th3) {
            th = th3;
            airf.a(closeable, str);
            throw th;
        }
    }

    public final void a(long j, JSONObject jSONObject) {
        Throwable e;
        String str = "Failed to close settings writer.";
        String str2 = "Fabric";
        aiqj.a().a(str2, "Writing settings to cache file...");
        if (jSONObject != null) {
            Closeable closeable = null;
            try {
                jSONObject.put("expires_at", j);
                Closeable fileWriter = new FileWriter(new File(new aitc(this.a).a(), "com.crashlytics.settings.json"));
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                    airf.a(fileWriter, str);
                } catch (Exception e2) {
                    e = e2;
                    closeable = fileWriter;
                    try {
                        aiqj.a().c(str2, "Failed to cache settings", e);
                        airf.a(closeable, str);
                    } catch (Throwable th) {
                        e = th;
                        airf.a(closeable, str);
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    closeable = fileWriter;
                    airf.a(closeable, str);
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                aiqj.a().c(str2, "Failed to cache settings", e);
                airf.a(closeable, str);
            }
        }
    }
}
