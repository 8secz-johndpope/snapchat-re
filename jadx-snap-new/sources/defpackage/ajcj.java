package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;

/* renamed from: ajcj */
public final class ajcj implements Comparable<ajcj> {
    public static final ajcj a = new ajcj(new byte[8]);
    private final byte[] b;

    private ajcj(byte[] bArr) {
        this.b = bArr;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ajcj ajcj = (ajcj) obj;
        int i = 0;
        while (i < 8) {
            byte[] bArr = this.b;
            byte b = bArr[i];
            byte[] bArr2 = ajcj.b;
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
        if (!(obj instanceof ajcj)) {
            return false;
        }
        return Arrays.equals(this.b, ((ajcj) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("spanId", BaseEncoding.base16().lowerCase().encode(this.b)).toString();
    }
}
