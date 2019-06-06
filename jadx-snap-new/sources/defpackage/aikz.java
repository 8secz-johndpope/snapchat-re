package defpackage;

/* renamed from: aikz */
public class aikz implements aiky {
    /* Access modifiers changed, original: protected */
    public String a(String str, String str2, int i) {
        if (str == null || str.isEmpty() || str2 == null || str2.length() <= i) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i <= 0 ? "" : str2.substring(0, i));
        stringBuilder.append(akly.a('*', akly.e(str2) - i));
        return str.replace(str2, stringBuilder.toString());
    }

    public String toString() {
        return akme.a(this, null);
    }
}
