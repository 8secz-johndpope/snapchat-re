package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: ajbp */
public abstract class ajbp {
    ajbp() {
    }

    public static ajbp a(String str) {
        Preconditions.checkArgument(ajbp.b(str));
        return new ajbj(str);
    }

    private static boolean b(String str) {
        return !str.isEmpty() && str.length() <= 255 && ajaz.a(str);
    }

    public abstract String a();
}
