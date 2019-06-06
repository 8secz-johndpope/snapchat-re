package defpackage;

import java.util.Locale;

/* renamed from: aksw */
final class aksw extends aktq {
    private final akso c;

    aksw(akso akso, akrf akrf) {
        super(akra.l, akrf);
        this.c = akso;
    }

    public final int a(long j) {
        return akso.d(j);
    }

    public final int a(String str, Locale locale) {
        Integer num = (Integer) aksy.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new akri(akra.l, str);
    }

    public final int a(Locale locale) {
        return aksy.a(locale).k;
    }

    public final String a(int i, Locale locale) {
        return aksy.a(locale).b[i];
    }

    public final String b(int i, Locale locale) {
        return aksy.a(locale).c[i];
    }

    public final akrf e() {
        return this.c.d;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 7;
    }
}
