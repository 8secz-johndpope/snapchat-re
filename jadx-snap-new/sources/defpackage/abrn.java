package defpackage;

import com.google.common.base.Objects;

/* renamed from: abrn */
final class abrn implements abrl {
    private abro a;
    private String b;

    public abrn(abro abro, String str) {
        this.a = abro;
        this.b = str;
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(this.a.mKey);
        return stringBuilder.toString();
    }

    public final abrq b() {
        return this.a.mType;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abrn)) {
            return false;
        }
        abrn abrn = (abrn) obj;
        return this.a != abrn.a ? false : Objects.equal(this.b, abrn.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }
}
