package defpackage;

import defpackage.miq.d.a;

/* renamed from: mir */
public final class mir {
    public static final String a(String str) {
        if (((((CharSequence) str).length() == 0 ? 1 : 0) ^ 1) == 0) {
            str = null;
        }
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder("//");
            stringBuilder.append(str);
            stringBuilder.append('/');
            str = stringBuilder.toString();
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public static final a a(a aVar) {
        akcr.b(aVar, "receiver$0");
        return a.a("", aVar.b);
    }

    static final boolean a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(':');
        return akgb.b(str, stringBuilder.toString(), true);
    }
}
