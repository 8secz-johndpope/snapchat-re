package defpackage;

/* renamed from: aios */
final class aios {
    static boolean a(String str) {
        return str.length() - str.replace(".", "").length() <= 0;
    }

    static boolean a(String str, aipi aipi) {
        Class b = aios.b(str);
        if (b == null) {
            return false;
        }
        for (Class isAssignableFrom : aipi.c) {
            if (isAssignableFrom.isAssignableFrom(b)) {
                return true;
            }
        }
        return false;
    }

    private static Class b(String str) {
        int indexOf = str.indexOf(36);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        }
    }
}
