package defpackage;

import com.brightcove.player.model.Video.Fields;
import com.google.gson.annotations.SerializedName;

/* renamed from: abyi */
public final class abyi {
    @SerializedName("session_id")
    public final String a;
    @SerializedName("content_id")
    public final String b;
    @SerializedName("edits_id")
    public final String c;
    @SerializedName("mediaId")
    public final String d;
    @SerializedName("media")
    public final aeew e;
    @SerializedName("encryption")
    public final abye f;
    @SerializedName("transformation")
    public final abyl g;
    @SerializedName("media_segment")
    private final abyo h;

    public abyi(String str, String str2, String str3, String str4, aeew aeew, abyo abyo, abye abye, abyl abyl) {
        akcr.b(str, "sessionId");
        akcr.b(str2, Fields.CONTENT_ID);
        akcr.b(str3, "editsId");
        akcr.b(str4, "mediaId");
        akcr.b(aeew, "media");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = aeew;
        this.h = abyo;
        this.f = abye;
        this.g = abyl;
        abyo abyo2 = this.h;
        if (abyo2 != null) {
            Object obj = this.e.a;
            akcr.a(obj, "this.mediaType");
            boolean a = abyp.a(obj.intValue());
            if (!ajxy.a || a) {
                Object obj2 = 1;
                obj = abyo2.a >= 0 ? 1 : null;
                if (ajxy.a && obj == null) {
                    throw new AssertionError("Media segment offset must be non-negative.");
                }
                int i = abyo2.a + abyo2.b;
                Long l = this.e.u;
                if (i > (l != null ? (int) l.longValue() : 0)) {
                    obj2 = null;
                }
                if (ajxy.a && obj2 == null) {
                    throw new AssertionError("Media segment is out of bounds of the media.");
                }
                return;
            }
            throw new AssertionError("Media segment is only supported for videos.");
        }
    }

    public static /* synthetic */ abyi a(abyi abyi, String str, String str2, String str3, String str4, aeew aeew, abyo abyo, abye abye, abyl abyl, int i) {
        if ((i & 1) != 0) {
            str = abyi.a;
        }
        if ((i & 2) != 0) {
            str2 = abyi.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = abyi.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = abyi.d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            aeew = abyi.e;
        }
        aeew aeew2 = aeew;
        if ((i & 32) != 0) {
            abyo = abyi.h;
        }
        abyo abyo2 = abyo;
        if ((i & 64) != 0) {
            abye = abyi.f;
        }
        abye abye2 = abye;
        if ((i & 128) != 0) {
            abyl = abyi.g;
        }
        return abyi.a(str, str5, str6, str7, aeew2, abyo2, abye2, abyl);
    }

    private static abyi a(String str, String str2, String str3, String str4, aeew aeew, abyo abyo, abye abye, abyl abyl) {
        String str5 = str;
        akcr.b(str, "sessionId");
        String str6 = str2;
        akcr.b(str2, Fields.CONTENT_ID);
        String str7 = str3;
        akcr.b(str3, "editsId");
        String str8 = str4;
        akcr.b(str4, "mediaId");
        aeew aeew2 = aeew;
        akcr.b(aeew, "media");
        return new abyi(str5, str6, str7, str8, aeew2, abyo, abye, abyl);
    }

    public final abyo a() {
        abyo abyo = this.h;
        if (abyo != null && abyo != null) {
            return abyo;
        }
        Long l = this.e.u;
        return new abyo(l != null ? (int) l.longValue() : 0);
    }

    public final String b() {
        abye abye = this.f;
        return abye != null ? abye.a : null;
    }

    /* JADX WARNING: Missing block: B:18:0x0056, code skipped:
            if (defpackage.akcr.a(r2.g, r3.g) != false) goto L_0x005b;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x005b;
    L_0x0002:
        r0 = r3 instanceof defpackage.abyi;
        if (r0 == 0) goto L_0x0059;
    L_0x0006:
        r3 = (defpackage.abyi) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0026:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0030:
        r0 = r2.e;
        r1 = r3.e;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x003a:
        r0 = r2.h;
        r1 = r3.h;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0044:
        r0 = r2.f;
        r1 = r3.f;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x004e:
        r0 = r2.g;
        r3 = r3.g;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r3 = 0;
        return r3;
    L_0x005b:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyi.equals(java.lang.Object):boolean");
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
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        aeew aeew = this.e;
        hashCode = (hashCode + (aeew != null ? aeew.hashCode() : 0)) * 31;
        abyo abyo = this.h;
        hashCode = (hashCode + (abyo != null ? abyo.hashCode() : 0)) * 31;
        abye abye = this.f;
        hashCode = (hashCode + (abye != null ? abye.hashCode() : 0)) * 31;
        abyl abyl = this.g;
        if (abyl != null) {
            i = abyl.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaPackage(sessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", contentId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", editsId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.d);
        stringBuilder.append(", media=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mediaSegmentInfo=");
        stringBuilder.append(this.h);
        stringBuilder.append(", encryption=");
        stringBuilder.append(this.f);
        stringBuilder.append(", transformation=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
