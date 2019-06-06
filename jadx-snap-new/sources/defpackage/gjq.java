package defpackage;

/* renamed from: gjq */
final class gjq implements gjr {
    private static akho a = akho.a("application/octet-stream");
    private final byte[] b;

    protected gjq(byte[] bArr) {
        this.b = bArr;
    }

    public final akhl a(String str) {
        String[] strArr = new String[2];
        strArr[0] = "Content-Disposition";
        StringBuilder stringBuilder = new StringBuilder("form-data; name=\"");
        stringBuilder.append(str);
        stringBuilder.append("\"; filename=\"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        strArr[1] = stringBuilder.toString();
        return akhl.a(strArr);
    }

    public final akhu a() {
        return akhu.create(a, this.b);
    }
}
