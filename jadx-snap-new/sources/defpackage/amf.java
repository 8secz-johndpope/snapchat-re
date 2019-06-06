package defpackage;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: amf */
public final class amf {
    static final byte[] a;
    private static final int[] c = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    final c b;

    /* renamed from: amf$a */
    public enum a {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        
        final boolean hasAlpha;

        private a(boolean z) {
            this.hasAlpha = z;
        }
    }

    /* renamed from: amf$c */
    static class c {
        final InputStream a;

        public c(InputStream inputStream) {
            this.a = inputStream;
        }

        public final int a() {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }

        public final int a(byte[] bArr) {
            int length = bArr.length;
            while (length > 0) {
                int read = this.a.read(bArr, bArr.length - length, length);
                if (read == -1) {
                    break;
                }
                length -= read;
            }
            return bArr.length - length;
        }

        public final long a(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        public final short b() {
            return (short) (this.a.read() & 255);
        }
    }

    /* renamed from: amf$b */
    static class b {
        final ByteBuffer a;

        public b(byte[] bArr) {
            this.a = ByteBuffer.wrap(bArr);
            this.a.order(ByteOrder.BIG_ENDIAN);
        }

        public final int a() {
            return this.a.array().length;
        }

        public final int a(int i) {
            return this.a.getInt(i);
        }

        public final short b(int i) {
            return this.a.getShort(i);
        }
    }

    static {
        byte[] bArr = new byte[0];
        try {
            bArr = "Exif\u0000\u0000".getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        a = bArr;
    }

    public amf(InputStream inputStream) {
        this.b = new c(inputStream);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    static int a(defpackage.amf.b r12) {
        /*
        r0 = 6;
        r1 = r12.b(r0);
        r2 = 3;
        r3 = "ImageHeaderParser";
        r4 = 19789; // 0x4d4d float:2.773E-41 double:9.777E-320;
        if (r1 == r4) goto L_0x0026;
    L_0x000c:
        r4 = 18761; // 0x4949 float:2.629E-41 double:9.269E-320;
        if (r1 != r4) goto L_0x0013;
    L_0x0010:
        r1 = java.nio.ByteOrder.LITTLE_ENDIAN;
        goto L_0x0028;
    L_0x0013:
        r4 = android.util.Log.isLoggable(r3, r2);
        if (r4 == 0) goto L_0x0026;
    L_0x0019:
        r1 = java.lang.String.valueOf(r1);
        r4 = "Unknown endianness = ";
        r1 = r4.concat(r1);
        android.util.Log.d(r3, r1);
    L_0x0026:
        r1 = java.nio.ByteOrder.BIG_ENDIAN;
    L_0x0028:
        r4 = r12.a;
        r4.order(r1);
        r1 = 10;
        r1 = r12.a(r1);
        r1 = r1 + r0;
        r0 = r12.b(r1);
        r4 = 0;
    L_0x0039:
        if (r4 >= r0) goto L_0x0105;
    L_0x003b:
        r5 = r1 + 2;
        r6 = r4 * 12;
        r5 = r5 + r6;
        r6 = r12.b(r5);
        r7 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        if (r6 != r7) goto L_0x0101;
    L_0x0048:
        r7 = r5 + 2;
        r7 = r12.b(r7);
        if (r7 <= 0) goto L_0x00ee;
    L_0x0050:
        r8 = 12;
        if (r7 <= r8) goto L_0x0056;
    L_0x0054:
        goto L_0x00ee;
    L_0x0056:
        r8 = r5 + 4;
        r8 = r12.a(r8);
        if (r8 >= 0) goto L_0x0068;
    L_0x005e:
        r5 = android.util.Log.isLoggable(r3, r2);
        if (r5 == 0) goto L_0x0101;
    L_0x0064:
        r5 = "Negative tiff component count";
        goto L_0x00fe;
    L_0x0068:
        r9 = android.util.Log.isLoggable(r3, r2);
        r10 = " tagType=";
        if (r9 == 0) goto L_0x0097;
    L_0x0070:
        r9 = new java.lang.StringBuilder;
        r11 = "Got tagIndex=";
        r9.<init>(r11);
        r9.append(r4);
        r9.append(r10);
        r9.append(r6);
        r11 = " formatCode=";
        r9.append(r11);
        r9.append(r7);
        r11 = " componentCount=";
        r9.append(r11);
        r9.append(r8);
        r9 = r9.toString();
        android.util.Log.d(r3, r9);
    L_0x0097:
        r9 = c;
        r9 = r9[r7];
        r8 = r8 + r9;
        r9 = 4;
        if (r8 <= r9) goto L_0x00ac;
    L_0x009f:
        r5 = android.util.Log.isLoggable(r3, r2);
        if (r5 == 0) goto L_0x0101;
    L_0x00a5:
        r5 = java.lang.String.valueOf(r7);
        r6 = "Got byte count > 4, not orientation, continuing, formatCode=";
        goto L_0x00fa;
    L_0x00ac:
        r5 = r5 + 8;
        if (r5 < 0) goto L_0x00d3;
    L_0x00b0:
        r7 = r12.a();
        if (r5 <= r7) goto L_0x00b7;
    L_0x00b6:
        goto L_0x00d3;
    L_0x00b7:
        if (r8 < 0) goto L_0x00c6;
    L_0x00b9:
        r8 = r8 + r5;
        r7 = r12.a();
        if (r8 <= r7) goto L_0x00c1;
    L_0x00c0:
        goto L_0x00c6;
    L_0x00c1:
        r12 = r12.b(r5);
        return r12;
    L_0x00c6:
        r5 = android.util.Log.isLoggable(r3, r2);
        if (r5 == 0) goto L_0x0101;
    L_0x00cc:
        r5 = java.lang.String.valueOf(r6);
        r6 = "Illegal number of bytes for TI tag data tagType=";
        goto L_0x00fa;
    L_0x00d3:
        r7 = android.util.Log.isLoggable(r3, r2);
        if (r7 == 0) goto L_0x0101;
    L_0x00d9:
        r7 = new java.lang.StringBuilder;
        r8 = "Illegal tagValueOffset=";
        r7.<init>(r8);
        r7.append(r5);
        r7.append(r10);
        r7.append(r6);
        r5 = r7.toString();
        goto L_0x00fe;
    L_0x00ee:
        r5 = android.util.Log.isLoggable(r3, r2);
        if (r5 == 0) goto L_0x0101;
    L_0x00f4:
        r5 = java.lang.String.valueOf(r7);
        r6 = "Got invalid format code=";
    L_0x00fa:
        r5 = r6.concat(r5);
    L_0x00fe:
        android.util.Log.d(r3, r5);
    L_0x0101:
        r4 = r4 + 1;
        goto L_0x0039;
    L_0x0105:
        r12 = -1;
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amf.a(amf$b):int");
    }

    public final a a() {
        int a = this.b.a();
        if (a == 65496) {
            return a.JPEG;
        }
        a = ((a << 16) & -65536) | (this.b.a() & 65535);
        if (a != -1991225785) {
            return (a >> 8) == 4671814 ? a.GIF : a.UNKNOWN;
        } else {
            this.b.a(21);
            return this.b.a.read() >= 3 ? a.PNG_A : a.PNG;
        }
    }
}
