package defpackage;

/* renamed from: acqs */
public final class acqs {
    public final String a;
    final boolean b;
    final acqw c;

    public acqs(String str, boolean z, acqw acqw) {
        akcr.b(acqw, "stickerInfo");
        this.a = str;
        this.b = z;
        this.c = acqw;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acqs) {
                acqs acqs = (acqs) obj;
                if (akcr.a(this.a, acqs.a)) {
                    if ((this.b == acqs.b ? 1 : null) == null || !akcr.a(this.c, acqs.c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i2 = this.b;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        acqw acqw = this.c;
        if (acqw != null) {
            i = acqw.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MapStatusData(statusText=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isRead=");
        stringBuilder.append(this.b);
        stringBuilder.append(", stickerInfo=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
