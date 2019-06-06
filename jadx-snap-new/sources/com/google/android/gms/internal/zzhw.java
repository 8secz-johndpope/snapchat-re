package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

@zzabh
public final class zzhw {
    public static int zzaa(String str) {
        int i;
        int i2;
        try {
            str = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            str = str.getBytes();
        }
        int length = str.length;
        int i3 = 0;
        int i4 = (length & -4) + 0;
        int i5 = 0;
        for (i = 0; i < i4; i += 4) {
            int i6 = ((((str[i] & 255) | ((str[i + 1] & 255) << 8)) | ((str[i + 2] & 255) << 16)) | (str[i + 3] << 24)) * -862048943;
            i5 ^= ((i6 << 15) | (i6 >>> 17)) * 461845907;
            i5 = (((i5 >>> 19) | (i5 << 13)) * 5) - 430675100;
        }
        i = length & 3;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    i3 = (str[i4 + 2] & 255) << 16;
                }
                i2 = i5 ^ length;
                i2 = (i2 ^ (i2 >>> 16)) * -2048144789;
                i2 = (i2 ^ (i2 >>> 13)) * -1028477387;
                return i2 ^ (i2 >>> 16);
            }
            i3 |= (str[i4 + 1] & 255) << 8;
        }
        i2 = ((str[i4] & 255) | i3) * -862048943;
        i5 ^= ((i2 >>> 17) | (i2 << 15)) * 461845907;
        i2 = i5 ^ length;
        i2 = (i2 ^ (i2 >>> 16)) * -2048144789;
        i2 = (i2 ^ (i2 >>> 13)) * -1028477387;
        return i2 ^ (i2 >>> 16);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARNING: Missing block: B:48:0x007f, code skipped:
            if (r8 != null) goto L_0x0081;
     */
    /* JADX WARNING: Missing block: B:67:0x00c4, code skipped:
            if (r4 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Missing block: B:70:0x00d1, code skipped:
            if (r4 == null) goto L_0x00d3;
     */
    public static java.lang.String[] zzb(java.lang.String r11, boolean r12) {
        /*
        if (r11 != 0) goto L_0x0004;
    L_0x0002:
        r11 = 0;
        return r11;
    L_0x0004:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r11.toCharArray();
        r11 = r11.length();
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
    L_0x0015:
        if (r3 >= r11) goto L_0x00d8;
    L_0x0017:
        r6 = java.lang.Character.codePointAt(r1, r3);
        r7 = java.lang.Character.charCount(r6);
        r8 = java.lang.Character.isLetter(r6);
        r9 = 1;
        if (r8 == 0) goto L_0x0083;
    L_0x0026:
        r8 = java.lang.Character.UnicodeBlock.of(r6);
        r10 = java.lang.Character.UnicodeBlock.BOPOMOFO;
        if (r8 == r10) goto L_0x0065;
    L_0x002e:
        r10 = java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED;
        if (r8 == r10) goto L_0x0065;
    L_0x0032:
        r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY;
        if (r8 == r10) goto L_0x0065;
    L_0x0036:
        r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS;
        if (r8 == r10) goto L_0x0065;
    L_0x003a:
        r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT;
        if (r8 == r10) goto L_0x0065;
    L_0x003e:
        r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS;
        if (r8 == r10) goto L_0x0065;
    L_0x0042:
        r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
        if (r8 == r10) goto L_0x0065;
    L_0x0046:
        r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
        if (r8 == r10) goto L_0x0065;
    L_0x004a:
        r10 = java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS;
        if (r8 == r10) goto L_0x0065;
    L_0x004e:
        r10 = java.lang.Character.UnicodeBlock.HANGUL_JAMO;
        if (r8 == r10) goto L_0x0065;
    L_0x0052:
        r10 = java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES;
        if (r8 == r10) goto L_0x0065;
    L_0x0056:
        r10 = java.lang.Character.UnicodeBlock.HIRAGANA;
        if (r8 == r10) goto L_0x0065;
    L_0x005a:
        r10 = java.lang.Character.UnicodeBlock.KATAKANA;
        if (r8 == r10) goto L_0x0065;
    L_0x005e:
        r10 = java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS;
        if (r8 != r10) goto L_0x0063;
    L_0x0062:
        goto L_0x0065;
    L_0x0063:
        r8 = 0;
        goto L_0x0066;
    L_0x0065:
        r8 = 1;
    L_0x0066:
        if (r8 != 0) goto L_0x0081;
    L_0x0068:
        r8 = 65382; // 0xff66 float:9.162E-41 double:3.2303E-319;
        if (r6 < r8) goto L_0x0072;
    L_0x006d:
        r8 = 65437; // 0xff9d float:9.1697E-41 double:3.233E-319;
        if (r6 <= r8) goto L_0x007c;
    L_0x0072:
        r8 = 65441; // 0xffa1 float:9.1702E-41 double:3.2332E-319;
        if (r6 < r8) goto L_0x007e;
    L_0x0077:
        r8 = 65500; // 0xffdc float:9.1785E-41 double:3.23613E-319;
        if (r6 > r8) goto L_0x007e;
    L_0x007c:
        r8 = 1;
        goto L_0x007f;
    L_0x007e:
        r8 = 0;
    L_0x007f:
        if (r8 == 0) goto L_0x0083;
    L_0x0081:
        r8 = 1;
        goto L_0x0084;
    L_0x0083:
        r8 = 0;
    L_0x0084:
        if (r8 == 0) goto L_0x009c;
    L_0x0086:
        if (r4 == 0) goto L_0x0092;
    L_0x0088:
        r4 = new java.lang.String;
        r6 = r3 - r5;
        r4.<init>(r1, r5, r6);
        r0.add(r4);
    L_0x0092:
        r4 = new java.lang.String;
        r4.<init>(r1, r3, r7);
    L_0x0097:
        r0.add(r4);
        r4 = 0;
        goto L_0x00d5;
    L_0x009c:
        r8 = java.lang.Character.isLetterOrDigit(r6);
        if (r8 != 0) goto L_0x00d1;
    L_0x00a2:
        r8 = java.lang.Character.getType(r6);
        r10 = 6;
        if (r8 == r10) goto L_0x00d1;
    L_0x00a9:
        r8 = java.lang.Character.getType(r6);
        r10 = 8;
        if (r8 != r10) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00d1;
    L_0x00b2:
        if (r12 == 0) goto L_0x00c7;
    L_0x00b4:
        r8 = java.lang.Character.charCount(r6);
        if (r8 != r9) goto L_0x00c7;
    L_0x00ba:
        r6 = java.lang.Character.toChars(r6);
        r6 = r6[r2];
        r8 = 39;
        if (r6 != r8) goto L_0x00c7;
    L_0x00c4:
        if (r4 != 0) goto L_0x00d4;
    L_0x00c6:
        goto L_0x00d3;
    L_0x00c7:
        if (r4 == 0) goto L_0x00d5;
    L_0x00c9:
        r4 = new java.lang.String;
        r6 = r3 - r5;
        r4.<init>(r1, r5, r6);
        goto L_0x0097;
    L_0x00d1:
        if (r4 != 0) goto L_0x00d4;
    L_0x00d3:
        r5 = r3;
    L_0x00d4:
        r4 = 1;
    L_0x00d5:
        r3 = r3 + r7;
        goto L_0x0015;
    L_0x00d8:
        if (r4 == 0) goto L_0x00e3;
    L_0x00da:
        r11 = new java.lang.String;
        r3 = r3 - r5;
        r11.<init>(r1, r5, r3);
        r0.add(r11);
    L_0x00e3:
        r11 = r0.size();
        r11 = new java.lang.String[r11];
        r11 = r0.toArray(r11);
        r11 = (java.lang.String[]) r11;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhw.zzb(java.lang.String, boolean):java.lang.String[]");
    }
}
