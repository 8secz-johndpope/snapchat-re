package defpackage;

/* renamed from: gjv */
final class gjv implements gjr {
    private static akho a;
    private final String b;

    static {
        StringBuilder stringBuilder = new StringBuilder("text/plain; charset=");
        stringBuilder.append(akib.d);
        a = akho.a(stringBuilder.toString());
    }

    protected gjv(String str) {
        this.b = str;
    }

    public final akhl a(String str) {
        String[] strArr = new String[2];
        strArr[0] = "Content-Disposition";
        StringBuilder stringBuilder = new StringBuilder("form-data; name=\"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        strArr[1] = stringBuilder.toString();
        return akhl.a(strArr);
    }

    public final akhu a() {
        return akhu.create(a, this.b);
    }
}
