package defpackage;

/* renamed from: akrj */
public final class akrj extends IllegalArgumentException {
    public akrj(long j, String str) {
        String stringBuilder;
        String a = aktx.a("yyyy-MM-dd'T'HH:mm:ss.SSS").a(new akrk(j));
        if (str != null) {
            StringBuilder stringBuilder2 = new StringBuilder(" (");
            stringBuilder2.append(str);
            stringBuilder2.append(")");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        StringBuilder stringBuilder3 = new StringBuilder("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ");
        stringBuilder3.append(a);
        stringBuilder3.append(stringBuilder);
        super(stringBuilder3.toString());
    }

    public akrj(String str) {
        super(str);
    }
}
