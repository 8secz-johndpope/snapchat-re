package defpackage;

import com.snap.ui.view.TakeSnapButton;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.opencv.imgproc.Imgproc;

/* renamed from: aktx */
public final class aktx {
    public static final AtomicReferenceArray<akty> a = new AtomicReferenceArray(25);
    private static final ConcurrentHashMap<String, akty> b = new ConcurrentHashMap();

    /* renamed from: aktx$b */
    static class b {
        private final int a;
        private final Locale b;

        public b(int i, int i2, int i3, Locale locale) {
            this.b = locale;
            this.a = (i + (i2 << 4)) + (i3 << 8);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a) {
                return false;
            }
            Locale locale = this.b;
            if (locale == null) {
                if (bVar.b != null) {
                    return false;
                }
            } else if (!locale.equals(bVar.b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = (this.a + 31) * 31;
            Locale locale = this.b;
            return i + (locale == null ? 0 : locale.hashCode());
        }
    }

    /* renamed from: aktx$a */
    static class a implements akug, akui {
        private static final ConcurrentHashMap<b, akty> a = new ConcurrentHashMap();
        private final int b = 3;
        private final int c = 4;
        private final int d = 0;

        a(int i, int i2, int i3) {
        }

        private akty a(Locale locale) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            b bVar = new b(this.d, this.b, this.c, locale);
            akty akty = (akty) a.get(bVar);
            if (akty != null) {
                return akty;
            }
            akty = aktx.a(b(locale));
            akty akty2 = (akty) a.putIfAbsent(bVar, akty);
            return akty2 != null ? akty2 : akty;
        }

        private String b(Locale locale) {
            int i = this.d;
            DateFormat dateTimeInstance = i != 0 ? i != 1 ? i != 2 ? null : DateFormat.getDateTimeInstance(this.b, this.c, locale) : DateFormat.getTimeInstance(this.c, locale) : DateFormat.getDateInstance(this.b, locale);
            if (dateTimeInstance instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) dateTimeInstance).toPattern();
            }
            throw new IllegalArgumentException("No datetime pattern for locale: ".concat(String.valueOf(locale)));
        }

        public final int a() {
            return 40;
        }

        public final int a(akub akub, CharSequence charSequence, int i) {
            return a(akub.b).b.a(akub, charSequence, i);
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            Locale locale2 = locale;
            a(locale2).a.a(appendable, j, akqx, i, akrc, locale2);
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
            a(locale).a.a(appendable, akrx, locale);
        }

        public final int b() {
            return 40;
        }
    }

    public static akty a() {
        a aVar = new a(3, 4, 0);
        return new akty(aVar, aVar);
    }

    public static akty a(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        akty akty = (akty) b.get(str);
        if (akty != null) {
            return akty;
        }
        aktz aktz = new aktz();
        aktx.a(aktz, str);
        akty = aktz.a();
        if (b.size() >= TakeSnapButton.LONG_PRESS_TIME) {
            return akty;
        }
        akty akty2 = (akty) b.putIfAbsent(str, akty);
        return akty2 != null ? akty2 : akty;
    }

    private static String a(String str, int[] iArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            stringBuilder.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                stringBuilder.append(charAt);
                i = i2;
            }
        } else {
            stringBuilder.append('\'');
            int i3 = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != '\'') {
                    if (i3 == 0 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    stringBuilder.append(charAt2);
                } else {
                    int i4 = i + 1;
                    if (i4 >= length || str.charAt(i4) != '\'') {
                        i3 ^= 1;
                    } else {
                        stringBuilder.append(charAt2);
                        i = i4;
                    }
                }
                i++;
            }
        }
        iArr[0] = i;
        return stringBuilder.toString();
    }

    private static void a(defpackage.aktz r12, java.lang.String r13) {
        /*
        r0 = r13.length();
        r1 = 1;
        r2 = new int[r1];
        r3 = 0;
        r4 = 0;
    L_0x0009:
        if (r4 >= r0) goto L_0x019a;
    L_0x000b:
        r2[r3] = r4;
        r4 = defpackage.aktx.a(r13, r2);
        r5 = r2[r3];
        r6 = r4.length();
        if (r6 == 0) goto L_0x019a;
    L_0x0019:
        r7 = r4.charAt(r3);
        r8 = 39;
        if (r7 == r8) goto L_0x017c;
    L_0x0021:
        r8 = 75;
        r9 = 2;
        if (r7 == r8) goto L_0x0176;
    L_0x0026:
        r8 = 77;
        r10 = 4;
        if (r7 == r8) goto L_0x0166;
    L_0x002b:
        r8 = 83;
        if (r7 == r8) goto L_0x0162;
    L_0x002f:
        r8 = 97;
        if (r7 == r8) goto L_0x015f;
    L_0x0033:
        r8 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r7 == r8) goto L_0x015c;
    L_0x0037:
        r8 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        if (r7 == r8) goto L_0x0159;
    L_0x003b:
        r8 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r7 == r8) goto L_0x0155;
    L_0x003f:
        r8 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r7 == r8) goto L_0x0151;
    L_0x0043:
        r8 = 71;
        if (r7 == r8) goto L_0x014b;
    L_0x0047:
        r8 = 72;
        if (r7 == r8) goto L_0x0147;
    L_0x004b:
        r8 = 89;
        if (r7 == r8) goto L_0x00c3;
    L_0x004f:
        r11 = 90;
        if (r7 == r11) goto L_0x00b0;
    L_0x0053:
        r11 = 100;
        if (r7 == r11) goto L_0x00ab;
    L_0x0057:
        r11 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r7 == r11) goto L_0x00a6;
    L_0x005b:
        switch(r7) {
            case 67: goto L_0x009f;
            case 68: goto L_0x009a;
            case 69: goto L_0x008d;
            default: goto L_0x005e;
        };
    L_0x005e:
        switch(r7) {
            case 119: goto L_0x0088;
            case 120: goto L_0x00c3;
            case 121: goto L_0x00c3;
            case 122: goto L_0x0071;
            default: goto L_0x0061;
        };
    L_0x0061:
        r12 = new java.lang.IllegalArgumentException;
        r13 = java.lang.String.valueOf(r4);
        r0 = "Illegal pattern component: ";
        r13 = r0.concat(r13);
        r12.<init>(r13);
        throw r12;
    L_0x0071:
        if (r6 < r10) goto L_0x007e;
    L_0x0073:
        r4 = new aktz$k;
        r4.<init>(r3);
        r6 = 0;
        r12.a(r4, r6);
        goto L_0x0196;
    L_0x007e:
        r4 = new aktz$k;
        r4.<init>(r1);
    L_0x0083:
        r12.a(r4, r4);
        goto L_0x0196;
    L_0x0088:
        r12.g(r6);
        goto L_0x0196;
    L_0x008d:
        if (r6 < r10) goto L_0x0093;
    L_0x008f:
        r4 = defpackage.akra.l;
        goto L_0x014d;
    L_0x0093:
        r4 = defpackage.akra.l;
    L_0x0095:
        r12.b(r4);
        goto L_0x0196;
    L_0x009a:
        r12.f(r6);
        goto L_0x0196;
    L_0x009f:
        r4 = defpackage.akra.c;
        r12.b(r4, r6, r6);
        goto L_0x0196;
    L_0x00a6:
        r12.d(r6);
        goto L_0x0196;
    L_0x00ab:
        r12.e(r6);
        goto L_0x0196;
    L_0x00b0:
        r4 = "Z";
        if (r6 != r1) goto L_0x00b9;
    L_0x00b4:
        r12.a(r4, r3);
        goto L_0x0196;
    L_0x00b9:
        if (r6 != r9) goto L_0x00c0;
    L_0x00bb:
        r12.a(r4, r1);
        goto L_0x0196;
    L_0x00c0:
        r4 = defpackage.aktz.j.INSTANCE;
        goto L_0x0083;
    L_0x00c3:
        r4 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        if (r6 != r9) goto L_0x0118;
    L_0x00c7:
        r6 = r5 + 1;
        if (r6 >= r0) goto L_0x00df;
    L_0x00cb:
        r6 = r2[r3];
        r6 = r6 + r1;
        r2[r3] = r6;
        r6 = defpackage.aktx.a(r13, r2);
        r6 = defpackage.aktx.b(r6);
        r6 = r6 ^ r1;
        r8 = r2[r3];
        r8 = r8 - r1;
        r2[r3] = r8;
        goto L_0x00e0;
    L_0x00df:
        r6 = 1;
    L_0x00e0:
        if (r7 == r4) goto L_0x00f9;
    L_0x00e2:
        r4 = new akqy;
        r4.<init>();
        r4 = r4.d();
        r4 = r4 + -30;
        r7 = new aktz$m;
        r8 = defpackage.akra.e;
        r7.<init>(r8, r4, r6);
    L_0x00f4:
        r12.a(r7);
        goto L_0x0196;
    L_0x00f9:
        r4 = new akqy;
        r4.<init>();
        r7 = r4.c();
        r7 = r7.z();
        r8 = r4.b();
        r4 = r7.a(r8);
        r4 = r4 + -30;
        r7 = new aktz$m;
        r8 = defpackage.akra.j;
        r7.<init>(r8, r4, r6);
        goto L_0x00f4;
    L_0x0118:
        r9 = 9;
        r10 = r5 + 1;
        if (r10 >= r0) goto L_0x0133;
    L_0x011e:
        r10 = r2[r3];
        r10 = r10 + r1;
        r2[r3] = r10;
        r10 = defpackage.aktx.a(r13, r2);
        r10 = defpackage.aktx.b(r10);
        if (r10 == 0) goto L_0x012e;
    L_0x012d:
        r9 = r6;
    L_0x012e:
        r10 = r2[r3];
        r10 = r10 - r1;
        r2[r3] = r10;
    L_0x0133:
        if (r7 == r8) goto L_0x0144;
    L_0x0135:
        if (r7 == r4) goto L_0x0140;
    L_0x0137:
        r4 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        if (r7 == r4) goto L_0x013c;
    L_0x013b:
        goto L_0x0196;
    L_0x013c:
        r12.c(r6, r9);
        goto L_0x0196;
    L_0x0140:
        r12.b(r6, r9);
        goto L_0x0196;
    L_0x0144:
        r4 = defpackage.akra.b;
        goto L_0x0178;
    L_0x0147:
        r12.c(r6);
        goto L_0x0196;
    L_0x014b:
        r4 = defpackage.akra.a;
    L_0x014d:
        r12.a(r4);
        goto L_0x0196;
    L_0x0151:
        r12.a(r6);
        goto L_0x0196;
    L_0x0155:
        r12.b(r6);
        goto L_0x0196;
    L_0x0159:
        r4 = defpackage.akra.p;
        goto L_0x0178;
    L_0x015c:
        r4 = defpackage.akra.o;
        goto L_0x0178;
    L_0x015f:
        r4 = defpackage.akra.m;
        goto L_0x014d;
    L_0x0162:
        r12.a(r6, r6);
        goto L_0x0196;
    L_0x0166:
        r4 = 3;
        if (r6 < r4) goto L_0x0172;
    L_0x0169:
        if (r6 < r10) goto L_0x016e;
    L_0x016b:
        r4 = defpackage.akra.g;
        goto L_0x014d;
    L_0x016e:
        r4 = defpackage.akra.g;
        goto L_0x0095;
    L_0x0172:
        r12.h(r6);
        goto L_0x0196;
    L_0x0176:
        r4 = defpackage.akra.n;
    L_0x0178:
        r12.a(r4, r6, r9);
        goto L_0x0196;
    L_0x017c:
        r4 = r4.substring(r1);
        r6 = r4.length();
        if (r6 != r1) goto L_0x018e;
    L_0x0186:
        r4 = r4.charAt(r3);
        r12.a(r4);
        goto L_0x0196;
    L_0x018e:
        r6 = new java.lang.String;
        r6.<init>(r4);
        r12.a(r6);
    L_0x0196:
        r4 = r5 + 1;
        goto L_0x0009;
    L_0x019a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aktx.a(aktz, java.lang.String):void");
    }

    private static boolean b(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case Imgproc.COLOR_YUV2RGBA_YVYU /*121*/:
                    break;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
