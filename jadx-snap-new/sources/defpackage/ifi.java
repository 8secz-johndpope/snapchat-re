package defpackage;

import java.util.Random;

/* renamed from: ifi */
public final class ifi {
    private final ife a = new ife(this.b, new Random().nextDouble());
    private final String b;
    private final ajws<iff<?>> c;
    private final ihh d;

    public ifi(String str, ajws<iff<?>> ajws, ihh ihh) {
        akcr.b(str, "id");
        akcr.b(ajws, "publishSubject");
        akcr.b(ihh, "clock");
        this.b = str;
        this.c = ajws;
        this.d = ihh;
    }

    public final <T> void a(T t) {
        akcr.b(t, "payload");
        this.c.a((Object) new iff(t, this.a, new ifl(this.d)));
    }
}
