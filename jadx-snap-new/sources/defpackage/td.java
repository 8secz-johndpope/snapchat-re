package defpackage;

/* renamed from: td */
final class td {
    public static void a(String str) {
        if (str == null || str.length() == 0) {
            throw new ss("Empty property name", 4);
        }
    }

    public static void b(String str) {
        if (str == null || str.length() == 0) {
            throw new ss("Empty schema namespace URI", 4);
        }
    }
}
