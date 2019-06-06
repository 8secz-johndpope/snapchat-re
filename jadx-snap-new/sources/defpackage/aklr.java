package defpackage;

/* renamed from: aklr */
public final class aklr {
    static int a(CharSequence charSequence, CharSequence charSequence2, int i) {
        return charSequence.toString().indexOf(charSequence2.toString(), i);
    }

    static boolean b(CharSequence charSequence, CharSequence charSequence2, int i) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(false, 0, (String) charSequence2, 0, i);
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            if (i <= 0) {
                return true;
            }
            i = i2 + 1;
            int i5 = i3 + 1;
            if (charSequence.charAt(i2) != charSequence2.charAt(i3)) {
                return false;
            }
            i2 = i;
            i = i4;
            i3 = i5;
        }
    }
}
