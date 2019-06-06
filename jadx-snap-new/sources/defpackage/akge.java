package defpackage;

/* renamed from: akge */
public class akge extends akgd {
    public static final String a(String str, int i) {
        akcr.b(str, "receiver$0");
        if ((i >= 0 ? 1 : null) != null) {
            Object substring = str.substring(akef.c(i, str.length()));
            akcr.a(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        StringBuilder stringBuilder = new StringBuilder("Requested character count ");
        stringBuilder.append(i);
        stringBuilder.append(" is less than zero.");
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public static final String b(String str, int i) {
        akcr.b(str, "receiver$0");
        if ((i >= 0 ? 1 : null) != null) {
            Object substring = str.substring(0, akef.c(i, str.length()));
            akcr.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        StringBuilder stringBuilder = new StringBuilder("Requested character count ");
        stringBuilder.append(i);
        stringBuilder.append(" is less than zero.");
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }
}
