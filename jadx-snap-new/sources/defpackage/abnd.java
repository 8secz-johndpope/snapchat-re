package defpackage;

import android.util.Base64;
import defpackage.abnf.a;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* renamed from: abnd */
public final class abnd {
    public static String a() {
        byte[] bArr = new byte[32];
        a.a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 0);
    }

    public static String a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            String[] split = str.split(":");
            if (split.length != 2) {
                return null;
            }
            byte[] bytes = str2.getBytes();
            try {
                byte[] b;
                byte[] decode = Base64.decode(split[0], 0);
                try {
                    b = new abmv(bytes, decode).b(Base64.decode(split[1], 0));
                } catch (GeneralSecurityException unused) {
                    b = null;
                }
                if (b == null) {
                    return null;
                }
                try {
                    str2 = new String(b, "UTF-8");
                } catch (UnsupportedEncodingException unused2) {
                    str2 = null;
                }
                return str2;
            } catch (IllegalArgumentException unused3) {
            }
        }
        return null;
    }

    public static String b() {
        byte[] bArr = new byte[16];
        a.a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 0);
    }
}
