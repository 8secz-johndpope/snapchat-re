package defpackage;

/* renamed from: pjr */
public final class pjr {
    public final String a;
    public final pjs b;
    public final ojs c;
    public final gcn d;
    public final pju e;
    public final boolean f;
    private final String g;

    public pjr(String str, String str2, pjs pjs, ojs ojs, gcn gcn, pju pju, boolean z) {
        akcr.b(str, "attribution");
        akcr.b(str2, "sessionId");
        akcr.b(ojs, "saveOption");
        akcr.b(pju, "saveSource");
        this.g = str;
        this.a = str2;
        this.b = pjs;
        this.c = ojs;
        this.d = gcn;
        this.e = pju;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pjr) {
                pjr pjr = (pjr) obj;
                if (akcr.a(this.g, pjr.g) && akcr.a(this.a, pjr.a) && akcr.a(this.b, pjr.b) && akcr.a(this.c, pjr.c) && akcr.a(this.d, pjr.d) && akcr.a(this.e, pjr.e)) {
                    if ((this.f == pjr.f ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.g;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.a;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        pjs pjs = this.b;
        hashCode = (hashCode + (pjs != null ? pjs.hashCode() : 0)) * 31;
        ojs ojs = this.c;
        hashCode = (hashCode + (ojs != null ? ojs.hashCode() : 0)) * 31;
        gcn gcn = this.d;
        hashCode = (hashCode + (gcn != null ? gcn.hashCode() : 0)) * 31;
        pju pju = this.e;
        if (pju != null) {
            i = pju.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.f;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SaveData(attribution=");
        stringBuilder.append(this.g);
        stringBuilder.append(", sessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", location=");
        stringBuilder.append(this.b);
        stringBuilder.append(", saveOption=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sendSource=");
        stringBuilder.append(this.d);
        stringBuilder.append(", saveSource=");
        stringBuilder.append(this.e);
        stringBuilder.append(", withRecoveredMedia=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
