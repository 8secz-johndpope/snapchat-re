package defpackage;

/* renamed from: akfz */
public class akfz extends akfy {
    public static final Double c(String str) {
        akcr.b(str, "receiver$0");
        try {
            return akfs.a.a((CharSequence) str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
