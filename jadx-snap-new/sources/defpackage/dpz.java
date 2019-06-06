package defpackage;

import android.net.Uri;

/* renamed from: dpz */
public abstract class dpz {

    /* renamed from: dpz$a */
    public static final class a extends dpz {
        public final String a;
        public final Uri b;

        public a(String str, Uri uri) {
            akcr.b(str, "url");
            akcr.b(uri, "previewUrl");
            super();
            this.a = str;
            this.b = uri;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.dpz.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.dpz.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dpz$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Uri uri = this.b;
            if (uri != null) {
                i = uri.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("LensLink(url=");
            stringBuilder.append(this.a);
            stringBuilder.append(", previewUrl=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private dpz() {
    }

    public /* synthetic */ dpz(byte b) {
        this();
    }
}
