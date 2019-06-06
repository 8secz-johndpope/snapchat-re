package defpackage;

/* renamed from: acwi */
public final class acwi {
    allf[] a;

    private acwi() {
        this.a = null;
    }

    public acwi(char c) {
        this();
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        allf[] allfArr = this.a;
        if (allfArr != null) {
            String str = "";
            if (allfArr != null) {
                if ((allfArr.length == 0 ? 1 : null) == null) {
                    alld b = allfArr[0].b();
                    if (b != null) {
                        String valueOf = String.valueOf(b.a());
                        if (valueOf != null) {
                            str = valueOf;
                        }
                    }
                }
            }
            stringBuilder.append(str);
        }
        Object stringBuilder2 = stringBuilder.toString();
        akcr.a(stringBuilder2, "sb.toString()");
        return stringBuilder2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acwi)) {
            return false;
        }
        allf[] allfArr = this.a;
        allf[] allfArr2 = ((acwi) obj).a;
        return (allfArr == null || allfArr2 == null) ? allfArr == null && allfArr2 == null : allfArr.length == allfArr2.length;
    }

    public final int hashCode() {
        allf[] allfArr = this.a;
        return allfArr != null ? allfArr.hashCode() : 0;
    }
}
