package defpackage;

import android.hardware.Camera.Parameters;
import java.util.regex.Pattern;

/* renamed from: dwn */
public final class dwn {
    Parameters a;
    boolean b = false;
    boolean c = false;

    /* renamed from: dwn$a */
    static final class a {
        static final dwn a = new dwn();
    }

    static {
        Pattern.compile("^\\([^(]*\\)(,\\([^(]*\\))*$");
        Pattern.compile("(?<=\\)),");
    }
}
