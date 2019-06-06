package defpackage;

/* renamed from: ajaz */
public final class ajaz {
    public static boolean a(String str) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= str.length()) {
                return true;
            }
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~') {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
