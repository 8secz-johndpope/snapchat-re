package defpackage;

import java.nio.charset.Charset;

/* renamed from: akfp */
public final class akfp {
    public static final Charset a;

    static {
        akfp akfp = new akfp();
        Object forName = Charset.forName("UTF-8");
        akcr.a(forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        akcr.a(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        akcr.a(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        akcr.a(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        akcr.a(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        akcr.a(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }

    private akfp() {
    }
}
