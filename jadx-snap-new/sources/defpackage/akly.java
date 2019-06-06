package defpackage;

import java.util.regex.Pattern;

/* renamed from: akly */
public final class akly {
    static {
        Pattern.compile("(?: |\\u00A0|\\s|[\\s&&[^ ]])\\s*");
    }

    public static String a(char c, int i) {
        char[] cArr = new char[i];
        while (true) {
            i--;
            if (i < 0) {
                return new String(cArr);
            }
            cArr[i] = c;
        }
    }

    public static String a(Iterable<?> iterable, String str) {
        return iterable == null ? null : akly.a(iterable.iterator(), str);
    }

    public static String a(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i += str.length();
        }
        if (i > str.length()) {
            i = str.length();
        }
        if (i < 0) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        return str.substring(0, i);
    }

    public static String a(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        return length <= 0 ? str : length > 8192 ? akly.a(str, i, String.valueOf(c)) : akly.a(c, length).concat(str);
    }

    public static String a(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 4) {
            throw new IllegalArgumentException("Minimum abbreviation width is 4");
        } else if (str.length() <= i2) {
            return str;
        } else {
            if (str.length() < 0) {
                i = str.length();
            }
            int i3 = i2 - 3;
            if (str.length() - i < i3) {
                i = str.length() - i3;
            }
            String str2 = "...";
            StringBuilder stringBuilder;
            if (i <= 4) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(0, i3));
                stringBuilder.append(str2);
                return stringBuilder.toString();
            } else if (i2 < 7) {
                throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
            } else if ((i2 + i) - 3 < str.length()) {
                StringBuilder stringBuilder2 = new StringBuilder(str2);
                stringBuilder2.append(akly.a(str.substring(i), 0, i3));
                return stringBuilder2.toString();
            } else {
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(str.substring(str.length() - i3));
                return stringBuilder.toString();
            }
        }
    }

    private static String a(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        if (akly.a(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        int i2 = 0;
        if (length == 1 && length2 <= 8192) {
            return akly.a(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] toCharArray = str2.toCharArray();
        while (i2 < length2) {
            cArr[i2] = toCharArray[i2 % length];
            i2++;
        }
        return new String(cArr).concat(str);
    }

    public static String a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            if (length != 0) {
                int i = 0;
                if (str2.isEmpty()) {
                    return str;
                }
                while (i != length && str2.indexOf(str.charAt(i)) != -1) {
                    i++;
                }
                str = str.substring(i);
            }
        }
        return str;
    }

    public static String a(String str, String str2, String str3) {
        return akly.a(str, str2, str3, -1);
    }

    public static String a(String str, String str2, String str3, int i) {
        if (!(akly.a(str) || akly.a(str2) || str3 == null || i == 0)) {
            int i2 = 0;
            int indexOf = str.indexOf(str2, 0);
            if (indexOf == -1) {
                return str;
            }
            int length = str2.length();
            int length2 = str3.length() - length;
            if (length2 < 0) {
                length2 = 0;
            }
            int i3 = 64;
            if (i < 0) {
                i3 = 16;
            } else if (i <= 64) {
                i3 = i;
            }
            StringBuilder stringBuilder = new StringBuilder(str.length() + (length2 * i3));
            while (indexOf != -1) {
                stringBuilder.append(str.substring(i2, indexOf));
                stringBuilder.append(str3);
                i2 = indexOf + length;
                i--;
                if (i == 0) {
                    break;
                }
                indexOf = str.indexOf(str2, i2);
            }
            stringBuilder.append(str.substring(i2));
            str = stringBuilder.toString();
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    private static java.lang.String a(java.util.Iterator<?> r3, java.lang.String r4) {
        /*
        if (r3 != 0) goto L_0x0004;
    L_0x0002:
        r3 = 0;
        return r3;
    L_0x0004:
        r0 = r3.hasNext();
        r1 = "";
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = r3.next();
        r2 = r3.hasNext();
        if (r2 != 0) goto L_0x001f;
    L_0x0017:
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        return r1;
    L_0x001a:
        r3 = r0.toString();
        return r3;
    L_0x001f:
        r1 = new java.lang.StringBuilder;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r1.<init>(r2);
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r1.append(r0);
    L_0x002b:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x003d;
    L_0x0031:
        if (r4 == 0) goto L_0x0036;
    L_0x0033:
        r1.append(r4);
    L_0x0036:
        r0 = r3.next();
        if (r0 == 0) goto L_0x002b;
    L_0x003c:
        goto L_0x0028;
    L_0x003d:
        r3 = r1.toString();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akly.a(java.util.Iterator, java.lang.String):java.lang.String");
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 ? true : (charSequence == null || charSequence2 == null) ? false : ((charSequence instanceof String) && (charSequence2 instanceof String)) ? charSequence.equals(charSequence2) : aklr.b(charSequence, charSequence2, Math.max(charSequence.length(), charSequence2.length()));
    }

    public static boolean a(CharSequence charSequence, char... cArr) {
        if (!akly.a(charSequence)) {
            Object obj = (cArr == null || cArr.length == 0) ? 1 : null;
            if (obj == null) {
                int length = charSequence.length();
                int length2 = cArr.length;
                int i = length - 1;
                int i2 = length2 - 1;
                int i3 = 0;
                while (i3 < length) {
                    char charAt = charSequence.charAt(i3);
                    int i4 = 0;
                    while (i4 < length2) {
                        if (cArr[i4] == charAt) {
                            if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                                return true;
                            }
                            if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                                return true;
                            }
                        }
                        i4++;
                    }
                    i3++;
                }
            }
        }
        return false;
    }

    public static int b(CharSequence charSequence, CharSequence charSequence2) {
        int i = 0;
        if (akly.a(charSequence) || akly.a(charSequence2)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            i = aklr.a(charSequence, charSequence2, i);
            if (i == -1) {
                return i2;
            }
            i2++;
            i += charSequence2.length();
        }
    }

    public static boolean b(CharSequence charSequence) {
        return !akly.a(charSequence);
    }

    public static boolean b(CharSequence charSequence, char... cArr) {
        if (!(charSequence == null || cArr == null)) {
            int length = charSequence.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            int i3 = 0;
            while (i3 < length) {
                char charAt = charSequence.charAt(i3);
                int i4 = 0;
                while (i4 < length2) {
                    if (cArr[i4] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                            return false;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return false;
                        }
                    }
                    i4++;
                }
                i3++;
            }
        }
        return true;
    }

    public static <T extends CharSequence> T c(T t, T t2) {
        return akly.a(t) ? t2 : t;
    }

    public static boolean c(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length();
            if (length != 0) {
                for (int i = 0; i < length; i++) {
                    if (!Character.isWhitespace(charSequence.charAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean d(CharSequence charSequence) {
        return !akly.c(charSequence);
    }

    public static int e(CharSequence charSequence) {
        return charSequence == null ? 0 : charSequence.length();
    }
}
