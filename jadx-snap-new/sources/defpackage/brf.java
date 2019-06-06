package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: brf */
public final class brf implements bqq {
    public static final int a = bzo.f("ID3");
    private final a b;

    /* renamed from: brf$a */
    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: brf$1 */
    static class 1 implements a {
        1() {
        }

        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return false;
        }
    }

    /* renamed from: brf$b */
    static final class b {
        final int a;
        final boolean b;
        final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    static {
        1 1 = new 1();
    }

    public brf() {
        this(null);
    }

    public brf(a aVar) {
        this.b = aVar;
    }

    private static int a(bzc bzc, int i) {
        byte[] bArr = bzc.a;
        int i2 = bzc.b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == (byte) 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static int a(byte[] bArr, int i, int i2) {
        i = brf.b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return i;
        }
        while (i < bArr.length - 1) {
            if (i % 2 == 0 && bArr[i + 1] == (byte) 0) {
                return i;
            }
            i = brf.b(bArr, i + 1);
        }
        return bArr.length;
    }

    private static brb a(bzc bzc, int i, int i2, boolean z, int i3, a aVar) {
        bzc bzc2 = bzc;
        int i4 = bzc2.b;
        int b = brf.b(bzc2.a, i4);
        String str = new String(bzc2.a, i4, b - i4, "ISO-8859-1");
        bzc.c(b + 1);
        int j = bzc.j();
        int j2 = bzc.j();
        long h = bzc.h();
        long j3 = h == 4294967295L ? -1 : h;
        h = bzc.h();
        long j4 = h == 4294967295L ? -1 : h;
        ArrayList arrayList = new ArrayList();
        i4 += i;
        while (bzc2.b < i4) {
            brg a = brf.a(i2, bzc, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        brg[] brgArr = new brg[arrayList.size()];
        arrayList.toArray(brgArr);
        return new brb(str, j, j2, j3, j4, brgArr);
    }

    private static b a(bzc bzc) {
        String str;
        String str2 = "Id3Decoder";
        if (bzc.b() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            String str3;
            int g = bzc.g();
            if (g != a) {
                str = String.valueOf(g);
                str3 = "Unexpected first three bytes of ID3 tag header: ";
            } else {
                g = bzc.d();
                boolean z = true;
                bzc.d(1);
                int d = bzc.d();
                int n = bzc.n();
                int j;
                if (g == 2) {
                    if (((d & 64) != 0 ? 1 : null) != null) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (g == 3) {
                    if (((d & 64) != 0 ? 1 : null) != null) {
                        j = bzc.j();
                        bzc.d(j);
                        n -= j + 4;
                    }
                } else if (g == 4) {
                    if (((d & 64) != 0 ? 1 : null) != null) {
                        j = bzc.n();
                        bzc.d(j - 4);
                        n -= j;
                    }
                    if (((d & 16) != 0 ? 1 : null) != null) {
                        n -= 10;
                    }
                } else {
                    str = String.valueOf(g);
                    str3 = "Skipped ID3 tag with unsupported majorVersion=";
                }
                if (g >= 4 || (d & 128) == 0) {
                    z = false;
                }
                return new b(g, z, n);
            }
            str = str3.concat(str);
        }
        Log.w(str2, str);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0370 A:{Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }} */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0390 A:{ExcHandler: all (th java.lang.Throwable), PHI: r18 , Splitter:B:152:0x02c8} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:140:0x025d, code skipped:
            if (r13 == 67) goto L_0x025f;
     */
    /* JADX WARNING: Missing block: B:186:0x0390, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:187:0x0391, code skipped:
            r2 = r18;
     */
    /* JADX WARNING: Missing block: B:188:0x0394, code skipped:
            r1 = r16;
     */
    private static defpackage.brg a(int r19, defpackage.bzc r20, boolean r21, int r22, defpackage.brf.a r23) {
        /*
        r0 = r19;
        r7 = r20;
        r8 = r20.d();
        r9 = r20.d();
        r10 = r20.d();
        r11 = 3;
        if (r0 < r11) goto L_0x0019;
    L_0x0013:
        r1 = r20.d();
        r13 = r1;
        goto L_0x001a;
    L_0x0019:
        r13 = 0;
    L_0x001a:
        r14 = 4;
        if (r0 != r14) goto L_0x003a;
    L_0x001d:
        r1 = r20.o();
        if (r21 != 0) goto L_0x0038;
    L_0x0023:
        r2 = r1 & 255;
        r3 = r1 >> 8;
        r3 = r3 & 255;
        r3 = r3 << 7;
        r2 = r2 | r3;
        r3 = r1 >> 16;
        r3 = r3 & 255;
        r3 = r3 << 14;
        r2 = r2 | r3;
        r1 = r1 >>> 24;
        r1 = r1 << 21;
        r1 = r1 | r2;
    L_0x0038:
        r15 = r1;
        goto L_0x0046;
    L_0x003a:
        if (r0 != r11) goto L_0x0041;
    L_0x003c:
        r1 = r20.o();
        goto L_0x0038;
    L_0x0041:
        r1 = r20.g();
        goto L_0x0038;
    L_0x0046:
        if (r0 < r11) goto L_0x004e;
    L_0x0048:
        r1 = r20.e();
        r6 = r1;
        goto L_0x004f;
    L_0x004e:
        r6 = 0;
    L_0x004f:
        r5 = 0;
        if (r8 != 0) goto L_0x0062;
    L_0x0052:
        if (r9 != 0) goto L_0x0062;
    L_0x0054:
        if (r10 != 0) goto L_0x0062;
    L_0x0056:
        if (r13 != 0) goto L_0x0062;
    L_0x0058:
        if (r15 != 0) goto L_0x0062;
    L_0x005a:
        if (r6 != 0) goto L_0x0062;
    L_0x005c:
        r0 = r7.c;
        r7.c(r0);
        return r5;
    L_0x0062:
        r1 = r7.b;
        r4 = r1 + r15;
        r1 = r7.c;
        r3 = "Id3Decoder";
        if (r4 <= r1) goto L_0x0072;
    L_0x006c:
        r0 = "Frame size exceeds remaining tag data";
        android.util.Log.w(r3, r0);
        goto L_0x005c;
    L_0x0072:
        if (r23 == 0) goto L_0x008c;
    L_0x0074:
        r1 = r23;
        r2 = r19;
        r16 = r3;
        r3 = r8;
        r12 = r4;
        r4 = r9;
        r14 = r5;
        r5 = r10;
        r17 = r6;
        r6 = r13;
        r1 = r1.a(r2, r3, r4, r5, r6);
        if (r1 != 0) goto L_0x0092;
    L_0x0088:
        r7.c(r12);
        return r14;
    L_0x008c:
        r16 = r3;
        r12 = r4;
        r14 = r5;
        r17 = r6;
    L_0x0092:
        r1 = 1;
        if (r0 != r11) goto L_0x00b0;
    L_0x0095:
        r2 = r17;
        r3 = r2 & 128;
        if (r3 == 0) goto L_0x009d;
    L_0x009b:
        r3 = 1;
        goto L_0x009e;
    L_0x009d:
        r3 = 0;
    L_0x009e:
        r4 = r2 & 64;
        if (r4 == 0) goto L_0x00a4;
    L_0x00a2:
        r4 = 1;
        goto L_0x00a5;
    L_0x00a4:
        r4 = 0;
    L_0x00a5:
        r2 = r2 & 32;
        if (r2 == 0) goto L_0x00ab;
    L_0x00a9:
        r2 = 1;
        goto L_0x00ac;
    L_0x00ab:
        r2 = 0;
    L_0x00ac:
        r5 = r4;
        r6 = 0;
        r4 = r3;
        goto L_0x00df;
    L_0x00b0:
        r2 = r17;
        r3 = 4;
        if (r0 != r3) goto L_0x00da;
    L_0x00b5:
        r3 = r2 & 64;
        if (r3 == 0) goto L_0x00bb;
    L_0x00b9:
        r3 = 1;
        goto L_0x00bc;
    L_0x00bb:
        r3 = 0;
    L_0x00bc:
        r4 = r2 & 8;
        if (r4 == 0) goto L_0x00c2;
    L_0x00c0:
        r4 = 1;
        goto L_0x00c3;
    L_0x00c2:
        r4 = 0;
    L_0x00c3:
        r5 = r2 & 4;
        if (r5 == 0) goto L_0x00c9;
    L_0x00c7:
        r5 = 1;
        goto L_0x00ca;
    L_0x00c9:
        r5 = 0;
    L_0x00ca:
        r6 = r2 & 2;
        if (r6 == 0) goto L_0x00d0;
    L_0x00ce:
        r6 = 1;
        goto L_0x00d1;
    L_0x00d0:
        r6 = 0;
    L_0x00d1:
        r2 = r2 & r1;
        if (r2 == 0) goto L_0x00d7;
    L_0x00d4:
        r2 = r3;
        r3 = 1;
        goto L_0x00df;
    L_0x00d7:
        r2 = r3;
        r3 = 0;
        goto L_0x00df;
    L_0x00da:
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
    L_0x00df:
        if (r4 != 0) goto L_0x03ae;
    L_0x00e1:
        if (r5 == 0) goto L_0x00e5;
    L_0x00e3:
        goto L_0x03ae;
    L_0x00e5:
        if (r2 == 0) goto L_0x00ec;
    L_0x00e7:
        r15 = r15 + -1;
        r7.d(r1);
    L_0x00ec:
        if (r3 == 0) goto L_0x00f4;
    L_0x00ee:
        r15 = r15 + -4;
        r2 = 4;
        r7.d(r2);
    L_0x00f4:
        if (r6 == 0) goto L_0x00fb;
    L_0x00f6:
        r2 = defpackage.brf.a(r7, r15);
        r15 = r2;
    L_0x00fb:
        r2 = 84;
        r3 = 88;
        r4 = 2;
        if (r8 != r2) goto L_0x013c;
    L_0x0102:
        if (r9 != r3) goto L_0x013c;
    L_0x0104:
        if (r10 != r3) goto L_0x013c;
    L_0x0106:
        if (r0 == r4) goto L_0x010a;
    L_0x0108:
        if (r13 != r3) goto L_0x013c;
    L_0x010a:
        if (r15 > 0) goto L_0x010e;
    L_0x010c:
        r5 = r14;
        goto L_0x0163;
    L_0x010e:
        r1 = r20.d();	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = defpackage.brf.a(r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = r15 + -1;
        r4 = new byte[r3];	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5 = 0;
        r7.a(r4, r5, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = defpackage.brf.a(r4, r5, r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r6 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r6.<init>(r4, r5, r3, r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5 = defpackage.brf.b(r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = r3 + r5;
        r1 = defpackage.brf.a(r4, r3, r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r1 = defpackage.brf.a(r4, r3, r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5 = new brj;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = "TXXX";
        r5.<init>(r2, r6, r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        goto L_0x0163;
    L_0x013c:
        if (r8 != r2) goto L_0x0170;
    L_0x013e:
        r1 = defpackage.brf.a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        if (r15 > 0) goto L_0x0145;
    L_0x0144:
        goto L_0x010c;
    L_0x0145:
        r2 = r20.d();	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = defpackage.brf.a(r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = r15 + -1;
        r5 = new byte[r4];	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r6 = 0;
        r7.a(r5, r6, r4);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = defpackage.brf.a(r5, r6, r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4.<init>(r5, r6, r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5 = new brj;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5.<init>(r1, r14, r4);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
    L_0x0163:
        r18 = r12;
        goto L_0x036e;
    L_0x0167:
        r0 = move-exception;
        r2 = r12;
        goto L_0x03aa;
    L_0x016b:
        r2 = r12;
        r1 = r16;
        goto L_0x039f;
    L_0x0170:
        r5 = 87;
        r6 = "ISO-8859-1";
        if (r8 != r5) goto L_0x01af;
    L_0x0176:
        if (r9 != r3) goto L_0x01af;
    L_0x0178:
        if (r10 != r3) goto L_0x01af;
    L_0x017a:
        if (r0 == r4) goto L_0x017e;
    L_0x017c:
        if (r13 != r3) goto L_0x01af;
    L_0x017e:
        if (r15 > 0) goto L_0x0181;
    L_0x0180:
        goto L_0x010c;
    L_0x0181:
        r1 = r20.d();	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = defpackage.brf.a(r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = r15 + -1;
        r4 = new byte[r3];	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5 = 0;
        r7.a(r4, r5, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = defpackage.brf.a(r4, r5, r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r11 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r11.<init>(r4, r5, r3, r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r1 = defpackage.brf.b(r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = r3 + r1;
        r1 = defpackage.brf.b(r4, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r1 = defpackage.brf.a(r4, r3, r1, r6);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5 = new brk;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = "WXXX";
        r5.<init>(r2, r11, r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        goto L_0x0163;
    L_0x01af:
        r3 = 87;
        if (r8 != r3) goto L_0x01cd;
    L_0x01b3:
        r1 = defpackage.brf.a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = new byte[r15];	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = 0;
        r7.a(r2, r3, r15);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = defpackage.brf.b(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5.<init>(r2, r3, r4, r6);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = new brk;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2.<init>(r1, r14, r5);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
    L_0x01cb:
        r5 = r2;
        goto L_0x0163;
    L_0x01cd:
        r3 = 73;
        r5 = 80;
        if (r8 != r5) goto L_0x01f8;
    L_0x01d3:
        r14 = 82;
        if (r9 != r14) goto L_0x01f8;
    L_0x01d7:
        if (r10 != r3) goto L_0x01f8;
    L_0x01d9:
        r14 = 86;
        if (r13 != r14) goto L_0x01f8;
    L_0x01dd:
        r2 = new byte[r15];	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = 0;
        r7.a(r2, r3, r15);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = defpackage.brf.b(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5.<init>(r2, r3, r4, r6);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = r4 + r1;
        r1 = r2.length;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r1 = defpackage.brf.b(r2, r4, r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = new bri;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2.<init>(r5, r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        goto L_0x01cb;
    L_0x01f8:
        r14 = 71;
        r2 = 79;
        if (r8 != r14) goto L_0x024a;
    L_0x01fe:
        r14 = 69;
        if (r9 != r14) goto L_0x024a;
    L_0x0202:
        if (r10 != r2) goto L_0x024a;
    L_0x0204:
        r14 = 66;
        if (r13 == r14) goto L_0x020a;
    L_0x0208:
        if (r0 != r4) goto L_0x024a;
    L_0x020a:
        r2 = r20.d();	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = defpackage.brf.a(r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = r15 + -1;
        r5 = new byte[r4];	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r11 = 0;
        r7.a(r5, r11, r4);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = defpackage.brf.b(r5, r11);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r14 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r14.<init>(r5, r11, r4, r6);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = r4 + r1;
        r1 = defpackage.brf.a(r5, r4, r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = defpackage.brf.a(r5, r4, r1, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r6 = defpackage.brf.b(r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r1 = r1 + r6;
        r6 = defpackage.brf.a(r5, r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r1 = defpackage.brf.a(r5, r1, r6, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = defpackage.brf.b(r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r6 = r6 + r2;
        r2 = r5.length;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = defpackage.brf.b(r5, r6, r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5 = new bre;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r5.<init>(r14, r4, r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        goto L_0x0163;
    L_0x024a:
        r1 = 67;
        if (r0 != r4) goto L_0x0255;
    L_0x024e:
        if (r8 != r5) goto L_0x02dc;
    L_0x0250:
        if (r9 != r3) goto L_0x02dc;
    L_0x0252:
        if (r10 != r1) goto L_0x02dc;
    L_0x0254:
        goto L_0x025f;
    L_0x0255:
        r14 = 65;
        if (r8 != r14) goto L_0x02dc;
    L_0x0259:
        if (r9 != r5) goto L_0x02dc;
    L_0x025b:
        if (r10 != r3) goto L_0x02dc;
    L_0x025d:
        if (r13 != r1) goto L_0x02dc;
    L_0x025f:
        r1 = r20.d();	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r2 = defpackage.brf.a(r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = r15 + -1;
        r5 = new byte[r3];	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r14 = 0;
        r7.a(r5, r14, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        if (r0 != r4) goto L_0x0295;
    L_0x0271:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r14 = "image/";
        r3.<init>(r14);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r14 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = 0;
        r14.<init>(r5, r4, r11, r6);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = defpackage.bzo.c(r14);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3.append(r4);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = r3.toString();	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r4 = "image/jpg";
        r4 = r4.equals(r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        if (r4 == 0) goto L_0x0293;
    L_0x0291:
        r3 = "image/jpeg";
    L_0x0293:
        r4 = 2;
        goto L_0x02b6;
    L_0x0295:
        r3 = 0;
        r4 = defpackage.brf.b(r5, r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r11 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r11.<init>(r5, r3, r4, r6);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = defpackage.bzo.c(r11);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r6 = 47;
        r6 = r3.indexOf(r6);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r11 = -1;
        if (r6 != r11) goto L_0x02b6;
    L_0x02ac:
        r6 = "image/";
        r3 = java.lang.String.valueOf(r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r3 = r6.concat(r3);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
    L_0x02b6:
        r6 = r4 + 1;
        r6 = r5[r6];	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r6 = r6 & 255;
        r11 = 2;
        r4 = r4 + r11;
        r11 = defpackage.brf.a(r5, r4, r1);	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r14 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x016b, all -> 0x0167 }
        r18 = r12;
        r12 = r11 - r4;
        r14.<init>(r5, r4, r12, r2);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r1 = defpackage.brf.b(r1);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r11 = r11 + r1;
        r1 = r5.length;	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r1 = defpackage.brf.b(r5, r11, r1);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r5 = new bqz;	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r5.<init>(r3, r14, r6, r1);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        goto L_0x036e;
    L_0x02dc:
        r18 = r12;
        if (r8 != r1) goto L_0x0329;
    L_0x02e0:
        if (r9 != r2) goto L_0x0329;
    L_0x02e2:
        r3 = 77;
        if (r10 != r3) goto L_0x0329;
    L_0x02e6:
        r3 = 77;
        if (r13 == r3) goto L_0x02ed;
    L_0x02ea:
        r3 = 2;
        if (r0 != r3) goto L_0x0329;
    L_0x02ed:
        r1 = 4;
        if (r15 >= r1) goto L_0x02f2;
    L_0x02f0:
        r5 = 0;
        goto L_0x036e;
    L_0x02f2:
        r1 = r20.d();	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r2 = defpackage.brf.a(r1);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r3 = new byte[r11];	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r4 = 0;
        r7.a(r3, r4, r11);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r5 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r5.<init>(r3, r4, r11);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r3 = r15 + -4;
        r6 = new byte[r3];	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r7.a(r6, r4, r3);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r3 = defpackage.brf.a(r6, r4, r1);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r11 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r11.<init>(r6, r4, r3, r2);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r4 = defpackage.brf.b(r1);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r3 = r3 + r4;
        r1 = defpackage.brf.a(r6, r3, r1);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r1 = defpackage.brf.a(r6, r3, r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r2 = new brd;	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r2.<init>(r5, r11, r1);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r5 = r2;
        goto L_0x036e;
    L_0x0329:
        if (r8 != r1) goto L_0x0345;
    L_0x032b:
        r3 = 72;
        if (r9 != r3) goto L_0x0345;
    L_0x032f:
        r3 = 65;
        if (r10 != r3) goto L_0x0345;
    L_0x0333:
        if (r13 != r5) goto L_0x0345;
    L_0x0335:
        r1 = r20;
        r2 = r15;
        r3 = r19;
        r4 = r21;
        r5 = r22;
        r6 = r23;
        r5 = defpackage.brf.a(r1, r2, r3, r4, r5, r6);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        goto L_0x036e;
    L_0x0345:
        if (r8 != r1) goto L_0x035f;
    L_0x0347:
        r3 = 84;
        if (r9 != r3) goto L_0x035f;
    L_0x034b:
        if (r10 != r2) goto L_0x035f;
    L_0x034d:
        if (r13 != r1) goto L_0x035f;
    L_0x034f:
        r1 = r20;
        r2 = r15;
        r3 = r19;
        r4 = r21;
        r5 = r22;
        r6 = r23;
        r5 = defpackage.brf.b(r1, r2, r3, r4, r5, r6);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        goto L_0x036e;
    L_0x035f:
        r1 = defpackage.brf.a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r2 = new byte[r15];	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r3 = 0;
        r7.a(r2, r3, r15);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r5 = new bra;	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r5.<init>(r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
    L_0x036e:
        if (r5 != 0) goto L_0x0399;
    L_0x0370:
        r1 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r2 = "Failed to decode frame: id=";
        r1.<init>(r2);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r0 = defpackage.brf.a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r1.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r0 = ", frameSize=";
        r1.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r1.append(r15);	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r0 = r1.toString();	 Catch:{ UnsupportedEncodingException -> 0x0394, all -> 0x0390 }
        r1 = r16;
        android.util.Log.w(r1, r0);	 Catch:{ UnsupportedEncodingException -> 0x0396, all -> 0x0390 }
        goto L_0x0399;
    L_0x0390:
        r0 = move-exception;
        r2 = r18;
        goto L_0x03aa;
    L_0x0394:
        r1 = r16;
    L_0x0396:
        r2 = r18;
        goto L_0x039f;
    L_0x0399:
        r2 = r18;
        r7.c(r2);
        return r5;
    L_0x039f:
        r0 = "Unsupported character encoding";
        android.util.Log.w(r1, r0);	 Catch:{ all -> 0x03a9 }
        r7.c(r2);
        r0 = 0;
        return r0;
    L_0x03a9:
        r0 = move-exception;
    L_0x03aa:
        r7.c(r2);
        throw r0;
    L_0x03ae:
        r2 = r12;
        r0 = r14;
        r1 = r16;
        r3 = "Skipping unsupported compressed or encrypted frame";
        android.util.Log.w(r1, r3);
        r7.c(r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brf.a(int, bzc, boolean, int, brf$a):brg");
    }

    private static String a(int i) {
        String str = "ISO-8859-1";
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? str : "UTF-8" : "UTF-16BE" : "UTF-16" : str;
    }

    private static String a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    private static String a(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:66:0x00b5 in {6, 8, 15, 22, 23, 27, 28, 30, 31, 35, 36, 39, 40, 41, 43, 44, 46, 50, 56, 60, 62, 65} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static boolean a(defpackage.bzc r18, int r19, int r20, boolean r21) {
        /*
        r1 = r18;
        r0 = r19;
        r2 = r1.b;
        r3 = r18.b();	 Catch:{ all -> 0x00b0 }
        r4 = 1;	 Catch:{ all -> 0x00b0 }
        r5 = r20;	 Catch:{ all -> 0x00b0 }
        if (r3 < r5) goto L_0x00ac;	 Catch:{ all -> 0x00b0 }
        r3 = 3;	 Catch:{ all -> 0x00b0 }
        r6 = 0;	 Catch:{ all -> 0x00b0 }
        if (r0 < r3) goto L_0x0020;	 Catch:{ all -> 0x00b0 }
        r7 = r18.j();	 Catch:{ all -> 0x00b0 }
        r8 = r18.h();	 Catch:{ all -> 0x00b0 }
        r10 = r18.e();	 Catch:{ all -> 0x00b0 }
        goto L_0x002a;	 Catch:{ all -> 0x00b0 }
        r7 = r18.g();	 Catch:{ all -> 0x00b0 }
        r8 = r18.g();	 Catch:{ all -> 0x00b0 }
        r8 = (long) r8;
        r10 = 0;
        r11 = 0;
        if (r7 != 0) goto L_0x0038;
        r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r7 != 0) goto L_0x0038;
        if (r10 != 0) goto L_0x0038;
        r1.c(r2);
        return r4;
        r7 = 4;
        if (r0 != r7) goto L_0x0069;
        if (r21 != 0) goto L_0x0069;
        r13 = 8421504; // 0x808080 float:1.180104E-38 double:4.160776E-317;
        r13 = r13 & r8;
        r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1));
        if (r15 == 0) goto L_0x0049;
        r1.c(r2);
        return r6;
        r11 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r13 = r8 & r11;
        r15 = 8;
        r15 = r8 >> r15;
        r15 = r15 & r11;
        r17 = 7;
        r15 = r15 << r17;
        r13 = r13 | r15;
        r15 = 16;
        r15 = r8 >> r15;
        r15 = r15 & r11;
        r17 = 14;
        r15 = r15 << r17;
        r13 = r13 | r15;
        r15 = 24;
        r8 = r8 >> r15;
        r8 = r8 & r11;
        r11 = 21;
        r8 = r8 << r11;
        r8 = r8 | r13;
        if (r0 != r7) goto L_0x0078;
        r3 = r10 & 64;
        if (r3 == 0) goto L_0x0071;
        r3 = 1;
        goto L_0x0072;
        r3 = 0;
        r7 = r10 & 1;
        if (r7 == 0) goto L_0x0087;
        r7 = 1;
        goto L_0x0088;
        if (r0 != r3) goto L_0x0086;
        r3 = r10 & 32;
        if (r3 == 0) goto L_0x0080;
        r3 = 1;
        goto L_0x0081;
        r3 = 0;
        r7 = r10 & 128;
        if (r7 == 0) goto L_0x0087;
        goto L_0x0076;
        r3 = 0;
        r7 = 0;
        if (r3 == 0) goto L_0x008b;
        goto L_0x008c;
        r4 = 0;
        if (r7 == 0) goto L_0x0090;
        r4 = r4 + 4;
        r3 = (long) r4;
        r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r7 >= 0) goto L_0x0099;
        r1.c(r2);
        return r6;
        r3 = r18.b();	 Catch:{ all -> 0x00b0 }
        r3 = (long) r3;
        r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x00a6;
        r1.c(r2);
        return r6;
        r3 = (int) r8;
        r1.d(r3);	 Catch:{ all -> 0x00b0 }
        goto L_0x0006;
        r1.c(r2);
        return r4;
        r0 = move-exception;
        r1.c(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brf.a(bzc, int, int, boolean):boolean");
    }

    private static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == (byte) 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static brc b(bzc bzc, int i, int i2, boolean z, int i3, a aVar) {
        bzc bzc2 = bzc;
        int i4 = bzc2.b;
        int b = brf.b(bzc2.a, i4);
        String str = "ISO-8859-1";
        String str2 = new String(bzc2.a, i4, b - i4, str);
        bzc.c(b + 1);
        b = bzc.d();
        boolean z2 = (b & 2) != 0;
        boolean z3 = (b & 1) != 0;
        int d = bzc.d();
        String[] strArr = new String[d];
        for (int i5 = 0; i5 < d; i5++) {
            int i6 = bzc2.b;
            int b2 = brf.b(bzc2.a, i6);
            strArr[i5] = new String(bzc2.a, i6, b2 - i6, str);
            bzc.c(b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        i4 += i;
        while (bzc2.b < i4) {
            brg a = brf.a(i2, bzc, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        brg[] brgArr = new brg[arrayList.size()];
        arrayList.toArray(brgArr);
        return new brc(str2, z2, z3, strArr, brgArr);
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        return i2 <= i ? new byte[0] : Arrays.copyOfRange(bArr, i, i2);
    }

    public final bqp a(bqt bqt) {
        ByteBuffer byteBuffer = bqt.c;
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    public final bqp a(byte[] bArr, int i) {
        List arrayList = new ArrayList();
        bzc bzc = new bzc(bArr, i);
        b a = brf.a(bzc);
        if (a == null) {
            return null;
        }
        int i2 = bzc.b;
        int i3 = a.a == 2 ? 6 : 10;
        int i4 = a.c;
        if (a.b) {
            i4 = brf.a(bzc, a.c);
        }
        bzc.b(i2 + i4);
        boolean z = false;
        if (!brf.a(bzc, a.a, i3, false)) {
            if (a.a == 4 && brf.a(bzc, 4, i3, true)) {
                z = true;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Failed to validate ID3 tag with majorVersion=");
                stringBuilder.append(a.a);
                Log.w("Id3Decoder", stringBuilder.toString());
                return null;
            }
        }
        while (bzc.b() >= i3) {
            brg a2 = brf.a(a.a, bzc, z, i3, this.b);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new bqp(arrayList);
    }
}
