package defpackage;

/* renamed from: akwn */
public class akwn extends RuntimeException {
    public final int a;
    public final transient akws<?> b;
    private final String c;

    public akwn(akws<?> akws) {
        akwv.a((Object) akws, "response == null");
        StringBuilder stringBuilder = new StringBuilder("HTTP ");
        stringBuilder.append(akws.a.c);
        stringBuilder.append(" ");
        stringBuilder.append(akws.a.d);
        super(stringBuilder.toString());
        this.a = akws.a.c;
        this.c = akws.a.d;
        this.b = akws;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }
}
