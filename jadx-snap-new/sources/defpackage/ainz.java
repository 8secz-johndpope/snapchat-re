package defpackage;

/* renamed from: ainz */
public final class ainz {
    public static String a(int i) {
        StringBuilder stringBuilder = new StringBuilder(i * 3);
        stringBuilder.append("(?");
        for (int i2 = 1; i2 < i; i2++) {
            stringBuilder.append(", ?");
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
