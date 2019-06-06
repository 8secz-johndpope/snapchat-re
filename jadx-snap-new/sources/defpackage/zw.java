package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: zw */
public final class zw extends zu<InputStream> {
    private static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        String str = "com.android.contacts";
        uriMatcher.addURI(str, "contacts/lookup/*/#", 1);
        a.addURI(str, "contacts/lookup/*", 1);
        a.addURI(str, "contacts/#/photo", 2);
        a.addURI(str, "contacts/#", 3);
        a.addURI(str, "contacts/#/display_photo", 4);
        a.addURI(str, "phone_lookup/*", 5);
    }

    public zw(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A:{RETURN} */
    public final /* synthetic */ java.lang.Object a(android.net.Uri r4, android.content.ContentResolver r5) {
        /*
        r3 = this;
        r0 = a;
        r0 = r0.match(r4);
        r1 = 1;
        if (r0 == r1) goto L_0x0019;
    L_0x0009:
        r2 = 3;
        if (r0 == r2) goto L_0x0014;
    L_0x000c:
        r2 = 5;
        if (r0 == r2) goto L_0x0019;
    L_0x000f:
        r5 = r5.openInputStream(r4);
        goto L_0x0023;
    L_0x0014:
        r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r1);
        goto L_0x0023;
    L_0x0019:
        r0 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4);
        if (r0 == 0) goto L_0x0036;
    L_0x001f:
        r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r0, r1);
    L_0x0023:
        if (r5 == 0) goto L_0x0026;
    L_0x0025:
        return r5;
    L_0x0026:
        r5 = new java.io.FileNotFoundException;
        r4 = java.lang.String.valueOf(r4);
        r0 = "InputStream is null for ";
        r4 = r0.concat(r4);
        r5.<init>(r4);
        throw r5;
    L_0x0036:
        r4 = new java.io.FileNotFoundException;
        r5 = "Contact cannot be found";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw.a(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }
}
