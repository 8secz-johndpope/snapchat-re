package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: aiml */
public final class aiml {
    public static String a(String str, String str2) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(":");
            stringBuilder.append(str2);
            return "Basic ".concat(String.valueOf(akkg.a(stringBuilder.toString().getBytes("ISO-8859-1")).b()));
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
