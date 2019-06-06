package defpackage;

import java.io.File;

/* renamed from: akla */
public final class akla {
    private static final char a = File.separatorChar;

    static {
        Character.toString('.');
    }

    public static int a(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            return charAt == '~' ? 2 : akla.a(charAt) ? 1 : 0;
        } else {
            int indexOf;
            if (charAt == '~') {
                int indexOf2 = str.indexOf(47, 1);
                indexOf = str.indexOf(92, 1);
                if (indexOf2 == -1 && indexOf == -1) {
                    return length + 1;
                }
                if (indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                if (indexOf == -1) {
                    indexOf = indexOf2;
                }
                indexOf = Math.min(indexOf2, indexOf);
            } else {
                char charAt2 = str.charAt(1);
                if (charAt2 == ':') {
                    char toUpperCase = Character.toUpperCase(charAt);
                    return (toUpperCase < 'A' || toUpperCase > 'Z') ? -1 : (length == 2 || !akla.a(str.charAt(2))) ? 2 : 3;
                } else if (!akla.a(charAt) || !akla.a(charAt2)) {
                    return akla.a(charAt) ? 1 : 0;
                } else {
                    length = str.indexOf(47, 2);
                    indexOf = str.indexOf(92, 2);
                    if ((length == -1 && indexOf == -1) || length == 2 || indexOf == 2) {
                        return -1;
                    }
                    if (length == -1) {
                        length = indexOf;
                    }
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    indexOf = Math.min(length, indexOf);
                }
            }
            return indexOf + 1;
        }
    }

    static boolean a() {
        return a == '\\';
    }

    private static boolean a(char c) {
        return c == '/' || c == '\\';
    }

    public static void b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (str.charAt(i) != 0) {
                i++;
            } else {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }
}
