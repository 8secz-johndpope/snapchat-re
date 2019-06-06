package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.common.base.Charsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: abnj */
public final class abnj {
    private final abnh a = new abnh();

    public static String b(byte[] bArr, String str) {
        if (!(TextUtils.isEmpty(str) || bArr == null)) {
            byte[] decode = Base64.decode(str, 2);
            try {
                if (decode.length > 12) {
                    return new String(abnh.a(bArr, Arrays.copyOfRange(decode, 0, 12), Arrays.copyOfRange(decode, 12, decode.length)), Charsets.UTF_8);
                }
                throw new IllegalStateException("Input is not sufficiently long!");
            } catch (GeneralSecurityException unused) {
            }
        }
        return null;
    }

    public final String a(byte[] bArr, String str) {
        if (!(TextUtils.isEmpty(str) || bArr == null)) {
            try {
                return Base64.encodeToString(this.a.a(bArr, str.getBytes(Charsets.UTF_8)), 2);
            } catch (GeneralSecurityException unused) {
            }
        }
        return null;
    }
}
