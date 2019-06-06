package defpackage;

import com.snap.core.db.record.StoryModel;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: asz */
final class asz {
    static final Charset a = Charset.forName("UTF-8");
    final File b;

    /* renamed from: asz$1 */
    static class 1 extends JSONObject {
        private /* synthetic */ atp a;

        1(atp atp) {
            this.a = atp;
            put("userId", this.a.b);
            put(StoryModel.USERNAME, this.a.c);
            put("userEmail", this.a.d);
        }
    }

    public asz(File file) {
        this.b = file;
    }

    private static String a(JSONObject jSONObject, String str) {
        return !jSONObject.isNull(str) ? jSONObject.optString(str, null) : null;
    }

    public final atp a(String str) {
        Throwable e;
        String str2 = "Failed to close user metadata file.";
        File b = b(str);
        if (!b.exists()) {
            return atp.a;
        }
        Closeable closeable = null;
        try {
            Closeable fileInputStream = new FileInputStream(b);
            try {
                JSONObject jSONObject = new JSONObject(airf.a((InputStream) fileInputStream));
                atp atp = new atp(asz.a(jSONObject, "userId"), asz.a(jSONObject, StoryModel.USERNAME), asz.a(jSONObject, "userEmail"));
                airf.a(fileInputStream, str2);
                return atp;
            } catch (Exception e2) {
                e = e2;
                closeable = fileInputStream;
                try {
                    aiqj.a().c("CrashlyticsCore", "Error deserializing user metadata.", e);
                    airf.a(closeable, str2);
                    return atp.a;
                } catch (Throwable th) {
                    e = th;
                    fileInputStream = closeable;
                    airf.a(fileInputStream, str2);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                airf.a(fileInputStream, str2);
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            aiqj.a().c("CrashlyticsCore", "Error deserializing user metadata.", e);
            airf.a(closeable, str2);
            return atp.a;
        }
    }

    public final File b(String str) {
        File file = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("user.meta");
        return new File(file, stringBuilder.toString());
    }
}
