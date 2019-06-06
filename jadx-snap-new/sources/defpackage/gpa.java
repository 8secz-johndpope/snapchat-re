package defpackage;

/* renamed from: gpa */
public final class gpa {
    public final abkq a;
    public final boolean b;

    public gpa(abkq abkq, boolean z) {
        akcr.b(abkq, "userSession");
        this.a = abkq;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gpa) {
                gpa gpa = (gpa) obj;
                if (akcr.a(this.a, gpa.a)) {
                    if ((this.b == gpa.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        abkq abkq = this.a;
        int hashCode = (abkq != null ? abkq.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserAuthState(userSession=");
        stringBuilder.append(this.a);
        stringBuilder.append(", needsVerificationInReg=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
