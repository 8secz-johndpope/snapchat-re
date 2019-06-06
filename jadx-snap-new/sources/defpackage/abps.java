package defpackage;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: abps */
public final class abps {
    public static String a(Collection<?> collection, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            stringBuilder.append(it.next());
            if (!it.hasNext()) {
                break;
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            stringBuilder.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return stringBuilder.toString();
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str) || str.length() % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static byte[] a(UUID uuid) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    public static UUID b(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        return new UUID(Long.valueOf(wrap.getLong()).longValue(), Long.valueOf(wrap.getLong()).longValue());
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }
}
