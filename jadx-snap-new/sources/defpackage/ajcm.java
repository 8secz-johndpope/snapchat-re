package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;

/* renamed from: ajcm */
public final class ajcm implements Comparable<ajcm> {
    public static final ajcm a = new ajcm(new byte[16]);
    private final byte[] b;

    private ajcm(byte[] bArr) {
        this.b = bArr;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ajcm ajcm = (ajcm) obj;
        int i = 0;
        while (i < 16) {
            byte[] bArr = this.b;
            byte b = bArr[i];
            byte[] bArr2 = ajcm.b;
            if (b != bArr2[i]) {
                return bArr[i] < bArr2[i] ? -1 : 1;
            } else {
                i++;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajcm)) {
            return false;
        }
        return Arrays.equals(this.b, ((ajcm) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("traceId", BaseEncoding.base16().lowerCase().encode(this.b)).toString();
    }
}
