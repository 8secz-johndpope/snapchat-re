package defpackage;

import defpackage.akqy.a;
import java.util.Random;
import java.util.TimeZone;

/* renamed from: ihs */
public final class ihs {
    private final Random a = new Random();

    public static long a(int i, String str) {
        akrc a = str.isEmpty() ? akrc.a() : akrc.a(TimeZone.getTimeZone(str));
        if (a != null) {
            akrw akqy = new akqy(a);
            Object obj = null;
            if (new a(akqy, akqy.b.m()).d() >= i) {
                obj = 1;
            }
            akqy b_ = obj == null ? akqy : akqy.b_(akqy.b.s().a(akqy.a, 1));
            return new akre(akqy, b_.au_().a(b_.c().a()).a(i)).b / 60000;
        }
        throw new NullPointerException("Zone must not be null");
    }

    public final long a(int i) {
        return i == 0 ? 0 : (long) this.a.nextInt(i);
    }
}
