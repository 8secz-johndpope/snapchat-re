package defpackage;

import java.io.IOException;

/* renamed from: akjf */
public final class akjf {
    static final akkg a = akkg.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static String[] c = new String[64];
    private static String[] d = new String[256];

    static {
        String str;
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            d[i4] = akib.a("%8s", Integer.toBinaryString(i4)).replace(' ', '0');
        }
        String[] strArr = c;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = new int[]{1};
        strArr[8] = "PADDED";
        int i5 = 0;
        while (true) {
            str = "|PADDED";
            if (i5 > 0) {
                break;
            }
            i = iArr[0];
            String[] strArr2 = c;
            i2 = i | 8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c[i]);
            stringBuilder.append(str);
            strArr2[i2] = stringBuilder.toString();
            i5++;
        }
        strArr = c;
        strArr[4] = "END_HEADERS";
        strArr[32] = "PRIORITY";
        strArr[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = new int[]{4, 32, 36};
        for (i = 0; i < 3; i++) {
            int i6 = iArr2[i];
            for (i2 = 0; i2 <= 0; i2++) {
                int i7 = iArr[i2];
                String[] strArr3 = c;
                int i8 = i7 | i6;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(c[i7]);
                stringBuilder2.append('|');
                stringBuilder2.append(c[i6]);
                strArr3[i8] = stringBuilder2.toString();
                strArr3 = c;
                i8 |= 8;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(c[i7]);
                stringBuilder2.append('|');
                stringBuilder2.append(c[i6]);
                stringBuilder2.append(str);
                strArr3[i8] = stringBuilder2.toString();
            }
        }
        while (i3 < 64) {
            strArr = c;
            if (strArr[i3] == null) {
                strArr[i3] = d[i3];
            }
            i3++;
        }
    }

    private akjf() {
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(akib.a(str, objArr));
    }

    static String a(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String a = b < (byte) 10 ? b[b] : akib.a("0x%02x", Byte.valueOf(b));
        if (b2 == (byte) 0) {
            str = "";
        } else {
            if (!(b == (byte) 2 || b == (byte) 3)) {
                if (b == (byte) 4 || b == (byte) 6) {
                    str = b2 == (byte) 1 ? "ACK" : d[b2];
                } else if (!(b == (byte) 7 || b == (byte) 8)) {
                    CharSequence charSequence;
                    CharSequence charSequence2;
                    String str2 = b2 < (byte) 64 ? c[b2] : d[b2];
                    if (b == (byte) 5 && (b2 & 4) != 0) {
                        charSequence = "HEADERS";
                        charSequence2 = "PUSH_PROMISE";
                    } else if (b != (byte) 0 || (b2 & 32) == 0) {
                        str = str2;
                    } else {
                        charSequence = "PRIORITY";
                        charSequence2 = "COMPRESSED";
                    }
                    str = str2.replace(charSequence, charSequence2);
                }
            }
            str = d[b2];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a;
        objArr[4] = str;
        return akib.a("%s 0x%08x %5d %-13s %s", objArr);
    }

    static IOException b(String str, Object... objArr) {
        throw new IOException(akib.a(str, objArr));
    }
}
