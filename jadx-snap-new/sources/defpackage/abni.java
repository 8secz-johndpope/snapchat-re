package defpackage;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;

/* renamed from: abni */
public final class abni {
    public static byte[] a(String str, String str2, String str3) {
        return abni.a(str, str2, str3, "SKSKey");
    }

    private static byte[] a(String str, String str2, String str3, String str4) {
        return akvr.a(Joiner.on("|").join(str, str3, str2).getBytes(Charsets.UTF_8), str4.getBytes(Charsets.UTF_8));
    }

    public static byte[] b(String str, String str2, String str3) {
        return abni.a(str, str2, str3, "SKSAuth");
    }
}
