package defpackage;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: avm */
public final class avm {
    public static final boolean a = (VERSION.SDK_INT <= 17);
    private static final byte[] b = avm.a("RIFF");
    private static final byte[] c = avm.a("WEBP");

    static {
        if (VERSION.SDK_INT >= 17 && VERSION.SDK_INT == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (options.outHeight == 1) {
                int i = options.outWidth;
            }
        }
        avm.a("VP8 ");
        avm.a("VP8L");
        avm.a("VP8X");
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return i2 >= 20 && avm.a(bArr, i, b) && avm.a(bArr, i + 8, c);
    }

    /* JADX WARNING: Missing block: B:15:0x001e, code skipped:
            return false;
     */
    private static boolean a(byte[] r4, int r5, byte[] r6) {
        /*
        r0 = 0;
        if (r6 == 0) goto L_0x001e;
    L_0x0003:
        if (r4 != 0) goto L_0x0006;
    L_0x0005:
        goto L_0x001e;
    L_0x0006:
        r1 = r6.length;
        r1 = r1 + r5;
        r2 = r4.length;
        if (r1 <= r2) goto L_0x000c;
    L_0x000b:
        return r0;
    L_0x000c:
        r1 = 0;
    L_0x000d:
        r2 = r6.length;
        if (r1 >= r2) goto L_0x001c;
    L_0x0010:
        r2 = r1 + r5;
        r2 = r4[r2];
        r3 = r6[r1];
        if (r2 == r3) goto L_0x0019;
    L_0x0018:
        return r0;
    L_0x0019:
        r1 = r1 + 1;
        goto L_0x000d;
    L_0x001c:
        r4 = 1;
        return r4;
    L_0x001e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avm.a(byte[], int, byte[]):boolean");
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }
}
