package defpackage;

import java.util.Locale;

/* renamed from: aksz */
final class aksz extends akss {
    aksz(akso akso) {
        super(akso);
    }

    public final int a(String str, Locale locale) {
        Integer num = (Integer) aksy.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new akri(akra.g, str);
    }

    public final int a(Locale locale) {
        return aksy.a(locale).l;
    }

    public final String a(int i, Locale locale) {
        return aksy.a(locale).d[i];
    }

    public final String b(int i, Locale locale) {
        return aksy.a(locale).e[i];
    }
}
