package defpackage;

/* renamed from: akmh */
public final class akmh {
    public static String a(String str) {
        return akly.a(str) ? str : akmh.b(str.toLowerCase());
    }

    private static String b(String str) {
        if (akly.a(str)) {
            return str;
        }
        char[] toCharArray = str.toCharArray();
        Object obj = 1;
        for (int i = 0; i < toCharArray.length; i++) {
            char c = toCharArray[i];
            if (Character.isWhitespace(c)) {
                obj = 1;
            } else if (obj != null) {
                toCharArray[i] = Character.toTitleCase(c);
                obj = null;
            }
        }
        return new String(toCharArray);
    }
}
