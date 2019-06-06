package defpackage;

import android.net.Uri;

/* renamed from: abym */
public final class abym {
    public final Uri a;
    public final Uri b;
    public final Uri c;

    public abym() {
        this(null, null, null, 7);
    }

    private abym(Uri uri, Uri uri2, Uri uri3) {
        akcr.b(uri, "compositeUri");
        akcr.b(uri2, "thumbnailUri");
        akcr.b(uri3, "mediaUri");
        this.a = uri;
        this.b = uri2;
        this.c = uri3;
    }

    public /* synthetic */ abym(Uri uri, Uri uri2, Uri uri3, int i) {
        String str = "Uri.EMPTY";
        if ((i & 1) != 0) {
            uri = Uri.EMPTY;
            akcr.a((Object) uri, str);
        }
        if ((i & 2) != 0) {
            uri2 = Uri.EMPTY;
            akcr.a((Object) uri2, str);
        }
        if ((i & 4) != 0) {
            uri3 = Uri.EMPTY;
            akcr.a((Object) uri3, str);
        }
        this(uri, uri2, uri3);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.abym;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.abym) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.c;
        r3 = r3.c;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abym.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Uri uri = this.a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        hashCode = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        uri2 = this.c;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaPackageUris(compositeUri=");
        stringBuilder.append(this.a);
        stringBuilder.append(", thumbnailUri=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mediaUri=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
