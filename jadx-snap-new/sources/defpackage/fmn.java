package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;

/* renamed from: fmn */
public final class fmn implements fjb {
    public static Uri b(String str) {
        akcr.b(str, "productId");
        Object build = new Builder().scheme("https").authority("www.snapchat.com").appendPath("commerce").appendPath("products").appendPath("").appendQueryParameter("product_id", str).build();
        akcr.a(build, "Uri.Builder()\n          …\n                .build()");
        return build;
    }

    public final Uri a(String str) {
        akcr.b(str, "storeId");
        Object build = new Builder().scheme("https").authority("www.snapchat.com").appendPath("commerce").appendPath("stores").appendPath("").appendQueryParameter("store_id", str).build();
        akcr.a(build, "Uri.Builder()\n          …\n                .build()");
        return build;
    }

    /* JADX WARNING: Missing block: B:11:0x0046, code skipped:
            if (java.util.Arrays.equals(r1, r8) != false) goto L_0x0055;
     */
    public final boolean a(android.net.Uri r8) {
        /*
        r7 = this;
        r0 = "uri";
        defpackage.akcr.b(r8, r0);
        r0 = "store_id";
        r0 = r8.getQueryParameter(r0);
        r1 = defpackage.fml.e;
        r2 = r8.getPathSegments();
        r3 = "uri.pathSegments";
        defpackage.akcr.a(r2, r3);
        r2 = (java.util.Collection) r2;
        r4 = "null cannot be cast to non-null type java.util.Collection<T>";
        if (r2 == 0) goto L_0x006e;
    L_0x001c:
        r5 = 0;
        r6 = new java.lang.String[r5];
        r2 = r2.toArray(r6);
        r6 = "null cannot be cast to non-null type kotlin.Array<T>";
        if (r2 == 0) goto L_0x0068;
    L_0x0027:
        r1 = java.util.Arrays.equals(r1, r2);
        if (r1 != 0) goto L_0x0055;
    L_0x002d:
        r1 = defpackage.fml.d;
        r8 = r8.getPathSegments();
        defpackage.akcr.a(r8, r3);
        r8 = (java.util.Collection) r8;
        if (r8 == 0) goto L_0x004f;
    L_0x003a:
        r2 = new java.lang.String[r5];
        r8 = r8.toArray(r2);
        if (r8 == 0) goto L_0x0049;
    L_0x0042:
        r8 = java.util.Arrays.equals(r1, r8);
        if (r8 == 0) goto L_0x0067;
    L_0x0048:
        goto L_0x0055;
    L_0x0049:
        r8 = new ajxt;
        r8.<init>(r6);
        throw r8;
    L_0x004f:
        r8 = new ajxt;
        r8.<init>(r4);
        throw r8;
    L_0x0055:
        r0 = (java.lang.CharSequence) r0;
        r8 = 1;
        if (r0 == 0) goto L_0x0063;
    L_0x005a:
        r0 = r0.length();
        if (r0 != 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0063;
    L_0x0061:
        r0 = 0;
        goto L_0x0064;
    L_0x0063:
        r0 = 1;
    L_0x0064:
        if (r0 != 0) goto L_0x0067;
    L_0x0066:
        return r8;
    L_0x0067:
        return r5;
    L_0x0068:
        r8 = new ajxt;
        r8.<init>(r6);
        throw r8;
    L_0x006e:
        r8 = new ajxt;
        r8.<init>(r4);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmn.a(android.net.Uri):boolean");
    }

    public final String b(Uri uri) {
        akcr.b(uri, "storeDeepLinkUri");
        Object queryParameter = uri.getQueryParameter("store_id");
        akcr.a(queryParameter, "storeDeepLinkUri.getQuer…t.DEEP_LINK_STORE_ID_TAG)");
        return queryParameter;
    }
}
