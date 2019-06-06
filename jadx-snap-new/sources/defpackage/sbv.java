package defpackage;

/* renamed from: sbv */
public final class sbv {
    public static final rzy<sai> a = new 1();

    /* renamed from: sbv$1 */
    static class 1 extends rzy<sai> {
        1() {
        }

        public final <FROM> sak<sai> a(sak<FROM> sak) {
            Object n = sak.n();
            if (n == null || (n instanceof sai)) {
                return sak;
            }
            throw new IllegalArgumentException(String.format("Request<%s> is not accepted", new Object[]{sbg.a(sak.n())}));
        }
    }
}
