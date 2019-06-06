package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* renamed from: wip */
public final class wip {
    @SerializedName("iwek")
    public final byte[] a;
    @SerializedName("in_beta")
    public final byte[] b;
    @SerializedName("out_beta")
    public final byte[] c;

    public wip(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        akcr.b(bArr, "iwek");
        akcr.b(bArr2, "inBeta");
        akcr.b(bArr3, "outBeta");
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wip) {
            wip wip = (wip) obj;
            if (Arrays.equals(this.a, wip.a) && Arrays.equals(this.b, wip.b) && Arrays.equals(this.c, wip.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserDeviceIdentityKeys(iwek=");
        stringBuilder.append(Arrays.toString(this.a));
        stringBuilder.append(", inBeta=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append(", outBeta=");
        stringBuilder.append(Arrays.toString(this.c));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
