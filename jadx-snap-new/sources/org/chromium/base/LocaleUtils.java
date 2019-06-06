package org.chromium.base;

import java.util.Locale;
import org.chromium.base.annotations.CalledByNative;

public class LocaleUtils {
    private LocaleUtils() {
    }

    @CalledByNative
    private static String getDefaultCountryCode() {
        CommandLine c = CommandLine.c();
        return c.a() ? c.b() : Locale.getDefault().getCountry();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getDefaultLocaleString() {
        /*
        r0 = java.util.Locale.getDefault();
        r1 = r0.getLanguage();
        r2 = r1.hashCode();
        r3 = 3365; // 0xd25 float:4.715E-42 double:1.6625E-320;
        r4 = 3;
        r5 = 2;
        r6 = 1;
        if (r2 == r3) goto L_0x003e;
    L_0x0013:
        r3 = 3374; // 0xd2e float:4.728E-42 double:1.667E-320;
        if (r2 == r3) goto L_0x0034;
    L_0x0017:
        r3 = 3391; // 0xd3f float:4.752E-42 double:1.6754E-320;
        if (r2 == r3) goto L_0x002a;
    L_0x001b:
        r3 = 3704; // 0xe78 float:5.19E-42 double:1.83E-320;
        if (r2 == r3) goto L_0x0020;
    L_0x001f:
        goto L_0x0048;
    L_0x0020:
        r2 = "tl";
        r2 = r1.equals(r2);
        if (r2 == 0) goto L_0x0048;
    L_0x0028:
        r2 = 3;
        goto L_0x0049;
    L_0x002a:
        r2 = "ji";
        r2 = r1.equals(r2);
        if (r2 == 0) goto L_0x0048;
    L_0x0032:
        r2 = 1;
        goto L_0x0049;
    L_0x0034:
        r2 = "iw";
        r2 = r1.equals(r2);
        if (r2 == 0) goto L_0x0048;
    L_0x003c:
        r2 = 0;
        goto L_0x0049;
    L_0x003e:
        r2 = "in";
        r2 = r1.equals(r2);
        if (r2 == 0) goto L_0x0048;
    L_0x0046:
        r2 = 2;
        goto L_0x0049;
    L_0x0048:
        r2 = -1;
    L_0x0049:
        if (r2 == 0) goto L_0x005b;
    L_0x004b:
        if (r2 == r6) goto L_0x0058;
    L_0x004d:
        if (r2 == r5) goto L_0x0055;
    L_0x004f:
        if (r2 == r4) goto L_0x0052;
    L_0x0051:
        goto L_0x005d;
    L_0x0052:
        r1 = "fil";
        goto L_0x005d;
    L_0x0055:
        r1 = "id";
        goto L_0x005d;
    L_0x0058:
        r1 = "yi";
        goto L_0x005d;
    L_0x005b:
        r1 = "he";
    L_0x005d:
        r2 = r0.getCountry();
        r3 = "no";
        r3 = r1.equals(r3);
        if (r3 == 0) goto L_0x0080;
    L_0x0069:
        r3 = "NO";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x0080;
    L_0x0071:
        r0 = r0.getVariant();
        r3 = "NY";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0080;
    L_0x007d:
        r0 = "nn-NO";
        return r0;
    L_0x0080:
        r0 = r2.isEmpty();
        if (r0 == 0) goto L_0x0087;
    L_0x0086:
        return r1;
    L_0x0087:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0.append(r2);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.LocaleUtils.getDefaultLocaleString():java.lang.String");
    }
}
