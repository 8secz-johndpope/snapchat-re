package defpackage;

import java.io.File;

/* renamed from: adnf */
public final class adnf {
    public static boolean a(String str) {
        return str == null ? false : new File(str).exists();
    }
}
