package defpackage;

import defpackage.gdx.c;
import java.security.MessageDigest;

/* renamed from: gjf */
public final class gjf implements c {
    public final String a(String str) {
        akcr.b(str, "key");
        MessageDigest instance = MessageDigest.getInstance("MD5");
        Object bytes = str.getBytes(akfp.a);
        akcr.a(bytes, "(this as java.lang.String).getBytes(charset)");
        bytes = ihv.a(instance.digest(bytes));
        akcr.a(bytes, "EncodingUtils.bytesToHex…igest(key.toByteArray()))");
        return bytes;
    }
}
