package defpackage;

import java.util.Arrays;

/* renamed from: acqw */
public final class acqw {
    public final String a;
    public final String b;
    public final String c;
    public final allf[] d;

    public acqw() {
        this(null, null, null, 15);
    }

    public acqw(String str, String str2, String str3, allf[] allfArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = allfArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            acqw acqw = (acqw) obj;
            return (akcr.a(this.a, acqw.a) ^ 1) == 0 && (akcr.a(this.b, acqw.b) ^ 1) == 0 && (akcr.a(this.c, acqw.c) ^ 1) == 0 && Arrays.equals(this.d, acqw.d);
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snapchat.map.feature.friends.StickerInformation");
        }
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        allf[] allfArr = this.d;
        if (allfArr != null) {
            i = Arrays.hashCode(allfArr);
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StickerInformation(nonClusterableId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", clusterableLeftId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", clusterableRightId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", stickerDynamicElement=");
        stringBuilder.append(Arrays.toString(this.d));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
