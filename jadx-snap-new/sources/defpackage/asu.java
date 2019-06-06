package defpackage;

import android.content.Context;

/* renamed from: asu */
final class asu {
    final aitt a;
    private final Context b;

    public asu(Context context, aitt aitt) {
        this.b = context;
        this.a = aitt;
    }

    private static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    private static String b(String str, String str2) {
        return asu.a(str) ? str2 : str;
    }

    /* Access modifiers changed, original: final */
    public final String a(String str, String str2) {
        return asu.b(airf.d(this.b, str), str2);
    }
}
