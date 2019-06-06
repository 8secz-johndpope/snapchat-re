package defpackage;

import com.snap.core.db.record.StickerMessageModel;

/* renamed from: xtl */
public final class xtl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public xtl(String str, String str2, String str3, String str4, int i, int i2) {
        akcr.b(str, StickerMessageModel.STICKERID);
        akcr.b(str2, "mediaKey");
        akcr.b(str3, "mediaIv");
        akcr.b(str4, StickerMessageModel.CREATIONTIME);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xtl) {
                xtl xtl = (xtl) obj;
                if (akcr.a(this.a, xtl.a) && akcr.a(this.b, xtl.b) && akcr.a(this.c, xtl.c) && akcr.a(this.d, xtl.d)) {
                    if ((this.e == xtl.e ? 1 : null) != null) {
                        if ((this.f == xtl.f ? 1 : null) != null) {
                            return true;
                        }
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
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UploadCustomStickerData(stickerId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.c);
        stringBuilder.append(", creationTime=");
        stringBuilder.append(this.d);
        stringBuilder.append(", width=");
        stringBuilder.append(this.e);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
