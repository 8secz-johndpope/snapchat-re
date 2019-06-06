package defpackage;

import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;
import java.security.MessageDigest;

/* renamed from: abne */
public final class abne {
    public static String a(byte[] bArr) {
        return bArr == null ? null : BaseEncoding.base64().encode(bArr);
    }

    public static byte[] a(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.reset();
        return instance.digest(str.getBytes(Charsets.UTF_8));
    }

    public static byte[] b(String str) {
        try {
            str = BaseEncoding.base64().decode(CharMatcher.whitespace().removeFrom(str));
            return str;
        } catch (IllegalArgumentException e) {
            StringBuilder stringBuilder = new StringBuilder("Invalid base64 string: '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }
}
