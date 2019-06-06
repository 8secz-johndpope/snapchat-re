package defpackage;

import com.snap.core.db.record.StickerMessageModel;
import java.util.List;

/* renamed from: abxz */
public final class abxz {

    /* renamed from: abxz$a */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public a(String str, String str2, String str3, String str4) {
            akcr.b(str, "imageId");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0033;
        L_0x0002:
            r0 = r3 instanceof defpackage.abxz.a;
            if (r0 == 0) goto L_0x0031;
        L_0x0006:
            r3 = (defpackage.abxz.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0026:
            r0 = r2.d;
            r3 = r3.d;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0031;
        L_0x0030:
            goto L_0x0033;
        L_0x0031:
            r3 = 0;
            return r3;
        L_0x0033:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abxz$a.equals(java.lang.Object):boolean");
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
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("BitmojiStickerId(imageId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", transparentOrAnimated=");
            stringBuilder.append(this.b);
            stringBuilder.append(", avatarId=");
            stringBuilder.append(this.c);
            stringBuilder.append(", friendAvatarId=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static {
        abxz abxz = new abxz();
    }

    private abxz() {
    }

    public static a a(String str) {
        akcr.b(str, StickerMessageModel.STICKERID);
        List a = akgc.a((CharSequence) str, new String[]{":"}, 0, 6);
        return a.size() > 3 ? new a((String) a.get(0), (String) a.get(1), (String) a.get(2), (String) a.get(3)) : a.size() > 2 ? new a((String) a.get(0), (String) a.get(1), (String) a.get(2), 8) : a.size() > 1 ? new a((String) a.get(0), (String) a.get(1), null, 12) : new a(str, null, null, 14);
    }

    /* JADX WARNING: Missing block: B:3:0x0016, code skipped:
            if (r5 == null) goto L_0x0018;
     */
    public static java.lang.String a(java.lang.String r2, java.lang.String r3, boolean r4, java.lang.String r5) {
        /*
        r0 = "imageId";
        defpackage.akcr.b(r2, r0);
        r0 = "avatarId";
        defpackage.akcr.b(r3, r0);
        r0 = ":";
        if (r5 == 0) goto L_0x0018;
    L_0x000e:
        r5 = java.lang.String.valueOf(r5);
        r5 = r0.concat(r5);
        if (r5 != 0) goto L_0x001a;
    L_0x0018:
        r5 = "";
    L_0x001a:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r2);
        r1.append(r0);
        if (r4 == 0) goto L_0x002a;
    L_0x0027:
        r2 = "2";
        goto L_0x002c;
    L_0x002a:
        r2 = "1";
    L_0x002c:
        r1.append(r2);
        r1.append(r0);
        r1.append(r3);
        r1.append(r5);
        r2 = r1.toString();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abxz.a(java.lang.String, java.lang.String, boolean, java.lang.String):java.lang.String");
    }

    public static String b(String str) {
        akcr.b(str, StickerMessageModel.STICKERID);
        return abxz.a(str).a;
    }

    public static String c(String str) {
        String str2 = "";
        if (str != null) {
            CharSequence charSequence = str;
            if ((charSequence.length() == 0 ? 1 : null) == null) {
                int a = akgc.a(charSequence, '_', 0, false, 6);
                if (a < 0) {
                    return str2;
                }
                Object substring = str.substring(0, a);
                akcr.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str2;
    }
}
