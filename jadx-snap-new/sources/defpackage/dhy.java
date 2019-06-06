package defpackage;

/* renamed from: dhy */
public final class dhy {
    final boolean a;
    final String b;

    public dhy(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final String a(dia dia) {
        akcr.b(dia, "type");
        if (this.b == null) {
            return dia.subtag;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(dia.subtag);
        stringBuilder.append(':');
        stringBuilder.append(dih.b(this.b));
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dhy) {
                dhy dhy = (dhy) obj;
                if ((this.a == dhy.a ? 1 : null) == null || !akcr.a(this.b, dhy.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BlizzardDurableJobMetadata(forceUpload=");
        stringBuilder.append(this.a);
        stringBuilder.append(", queueName=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
