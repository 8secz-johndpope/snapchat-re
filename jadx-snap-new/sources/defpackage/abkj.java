package defpackage;

import java.security.SecureRandom;

/* renamed from: abkj */
public final class abkj implements abki {
    private final aipn<dib> a;
    private final SecureRandom b;

    public abkj(aipn<dib> aipn, SecureRandom secureRandom) {
        this.a = aipn;
        this.b = secureRandom;
    }

    public final void a(long j, long j2) {
        if (((double) this.b.nextFloat()) <= 0.05d) {
            aajt abgk = new abgk();
            double d = (double) j;
            Double.isNaN(d);
            abgk.a = Double.valueOf(d / 1000.0d);
            d = (double) j2;
            Double.isNaN(d);
            abgk.b = Double.valueOf(d / 1000.0d);
            ((dib) this.a.get()).a(abgk);
        }
    }
}
