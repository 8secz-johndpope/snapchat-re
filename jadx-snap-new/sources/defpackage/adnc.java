package defpackage;

/* renamed from: adnc */
public final class adnc {
    public static final <T> T a(adnb adnb, akbl<? super adnb, ? extends T> akbl) {
        akcr.b(adnb, "receiver$0");
        akcr.b(akbl, "block");
        try {
            T invoke = akbl.invoke(adnb);
            return invoke;
        } finally {
            adnb.l();
        }
    }
}
