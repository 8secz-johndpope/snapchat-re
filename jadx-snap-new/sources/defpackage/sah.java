package defpackage;

/* renamed from: sah */
public interface sah {

    /* renamed from: sah$a */
    public static final class a {
        public static /* synthetic */ igm a(sah sah, idd idd, int i, int i2, int i3) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 6;
            }
            return sah.a(idd, i, i2);
        }
    }

    <T> igm<T> a(idd idd, int i, int i2);

    boolean a(Throwable th);
}
