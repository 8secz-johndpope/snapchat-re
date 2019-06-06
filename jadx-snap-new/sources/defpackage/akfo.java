package defpackage;

/* renamed from: akfo */
class akfo extends akfn {
    public static final boolean a(char c, char c2, boolean z) {
        return c == c2 ? true : !z ? false : Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }
}
