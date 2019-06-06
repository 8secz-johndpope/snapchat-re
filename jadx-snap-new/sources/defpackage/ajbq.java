package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: ajbq */
public abstract class ajbq {
    ajbq() {
    }

    public static ajbq a(String str) {
        Preconditions.checkArgument(ajbq.b(str));
        return new ajbk(str);
    }

    private static boolean b(String str) {
        return str.length() <= 255 && ajaz.a(str);
    }

    public abstract String a();
}
