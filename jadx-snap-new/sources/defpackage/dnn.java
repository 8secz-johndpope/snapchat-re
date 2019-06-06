package defpackage;

import defpackage.dnq.a;

/* renamed from: dnn */
public final class dnn {
    public final String a;
    public final dpv b;
    public boolean c;
    public final dnq d;

    public /* synthetic */ dnn() {
        this(null, null, false, a.a);
    }

    public dnn(String str, dpv dpv, boolean z, dnq dnq) {
        akcr.b(dnq, "cameraLoadingOverlay");
        this.a = str;
        this.b = dpv;
        this.c = z;
        this.d = dnq;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dnn) {
                dnn dnn = (dnn) obj;
                if (akcr.a(this.a, dnn.a) && akcr.a(this.b, dnn.b)) {
                    if ((this.c == dnn.c ? 1 : null) == null || !akcr.a(this.d, dnn.d)) {
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
        dpv dpv = this.b;
        hashCode = (hashCode + (dpv != null ? dpv.hashCode() : 0)) * 31;
        int i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        dnq dnq = this.d;
        if (dnq != null) {
            i = dnq.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CameraStartUpConfig(captionText=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lensesCameraLaunchState=");
        stringBuilder.append(this.b);
        stringBuilder.append(", showSnappablePrivacyPrompt=");
        stringBuilder.append(this.c);
        stringBuilder.append(", cameraLoadingOverlay=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
