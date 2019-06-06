package defpackage;

import java.util.Locale;

/* renamed from: aksx */
final class aksx extends aktg {
    private final akso a;

    aksx(akso akso) {
        super(akra.a);
        this.a = akso;
    }

    public final int a(long j) {
        return this.a.a(j) <= 0 ? 0 : 1;
    }

    public final int a(Locale locale) {
        return aksy.a(locale).j;
    }

    public final long a(long j, String str, Locale locale) {
        Integer num = (Integer) aksy.a(locale).g.get(str);
        if (num != null) {
            return b(j, num.intValue());
        }
        throw new akri(akra.a, str);
    }

    public final String a(int i, Locale locale) {
        return aksy.a(locale).a[i];
    }

    public final long b(long j, int i) {
        aktl.a((akqz) this, i, 0, 1);
        if (a(j) == i) {
            return j;
        }
        return this.a.d(j, -this.a.a(j));
    }

    public final long d(long j) {
        return a(j) == 1 ? this.a.d(0, 1) : Long.MIN_VALUE;
    }

    public final akrf d() {
        return aktv.a(akrg.a);
    }

    public final akrf e() {
        return null;
    }

    public final int g() {
        return 0;
    }

    public final int h() {
        return 1;
    }
}
