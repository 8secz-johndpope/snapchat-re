package org.chromium.base;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import defpackage.akon;
import defpackage.ohk;
import java.io.IOException;
import org.chromium.base.annotations.CalledByNative;

public abstract class ContentUriUtils {
    static {
        Object obj = new Object();
    }

    private ContentUriUtils() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    private static android.content.res.AssetFileDescriptor a(java.lang.String r11) {
        /*
        r0 = "ContentUriUtils";
        r1 = defpackage.akon.a;
        r1 = r1.getContentResolver();
        r2 = android.net.Uri.parse(r11);
        r3 = 0;
        r4 = a(r2);	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        if (r4 == 0) goto L_0x003e;
    L_0x0013:
        r4 = "*/*";
        r4 = r1.getStreamTypes(r2, r4);	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        if (r4 == 0) goto L_0x006f;
    L_0x001b:
        r5 = r4.length;	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        if (r5 <= 0) goto L_0x006f;
    L_0x001e:
        r5 = 0;
        r4 = r4[r5];	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        r1 = r1.openTypedAssetFileDescriptor(r2, r4, r3);	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        if (r1 == 0) goto L_0x003d;
    L_0x0027:
        r4 = r1.getStartOffset();	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        r6 = 0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 != 0) goto L_0x0032;
    L_0x0031:
        goto L_0x003d;
    L_0x0032:
        r1.close();	 Catch:{ IOException -> 0x0035 }
    L_0x0035:
        r1 = new java.lang.SecurityException;	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        r2 = "Cannot open files with non-zero offset type.";
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        throw r1;	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
    L_0x003d:
        return r1;
    L_0x003e:
        r4 = "r";
        r6 = r1.openFileDescriptor(r2, r4);	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        if (r6 == 0) goto L_0x006f;
    L_0x0046:
        r1 = new android.content.res.AssetFileDescriptor;	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        r7 = 0;
        r9 = -1;
        r5 = r1;
        r5.<init>(r6, r7, r9);	 Catch:{ FileNotFoundException -> 0x0061, SecurityException -> 0x0059, Exception -> 0x0051 }
        return r1;
    L_0x0051:
        r1 = move-exception;
        r11 = java.lang.String.valueOf(r11);
        r2 = "Unknown content uri: ";
        goto L_0x0068;
    L_0x0059:
        r1 = move-exception;
        r11 = java.lang.String.valueOf(r11);
        r2 = "Cannot open content uri: ";
        goto L_0x0068;
    L_0x0061:
        r1 = move-exception;
        r11 = java.lang.String.valueOf(r11);
        r2 = "Cannot find content uri: ";
    L_0x0068:
        r11 = r2.concat(r11);
        android.util.Log.w(r0, r11, r1);
    L_0x006f:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.a(java.lang.String):android.content.res.AssetFileDescriptor");
    }

    private static String a(Uri uri, Context context, String str) {
        Throwable th;
        String str2 = "";
        if (uri == null) {
            return str2;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query;
        try {
            query = contentResolver.query(uri, null, null, null, null);
            if (query != null) {
                if (query.getCount() > 0) {
                    query.moveToFirst();
                    int columnIndex = query.getColumnIndex(str);
                    if (columnIndex == -1) {
                        if (query != null) {
                            a(null, query);
                        }
                        return str2;
                    }
                    str = query.getString(columnIndex);
                    if (a(query)) {
                        String[] streamTypes = contentResolver.getStreamTypes(uri, "*/*");
                        if (streamTypes != null && streamTypes.length > 0) {
                            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0]);
                            if (extensionFromMimeType != null) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(str);
                                stringBuilder.append(".");
                                stringBuilder.append(extensionFromMimeType);
                                str = stringBuilder.toString();
                            }
                        }
                    }
                    if (query != null) {
                        a(null, query);
                    }
                    return str;
                }
            }
            if (query != null) {
                a(null, query);
            }
        } catch (NullPointerException unused) {
        } catch (Throwable th2) {
            if (query != null) {
                a(th, query);
            }
        }
        return str2;
    }

    private static /* synthetic */ void a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                return;
            }
        }
        autoCloseable.close();
    }

    private static boolean a(Cursor cursor) {
        if (VERSION.SDK_INT < 24) {
            return false;
        }
        int columnIndex = cursor.getColumnIndex("flags");
        return columnIndex >= 0 && (cursor.getLong(columnIndex) & 512) != 0;
    }

    private static boolean a(Uri uri) {
        if (VERSION.SDK_INT < 19 || uri == null || !DocumentsContract.isDocumentUri(akon.a, uri)) {
            return false;
        }
        Cursor query;
        try {
            query = akon.a.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                if (query.getCount() > 0) {
                    query.moveToFirst();
                    boolean a = a(query);
                    if (query != null) {
                        a(null, query);
                    }
                    return a;
                }
            }
            if (query != null) {
                a(null, query);
            }
        } catch (NullPointerException unused) {
        } catch (Throwable th) {
            if (query != null) {
                a(r0, query);
            }
        }
        return false;
    }

    @CalledByNative
    public static boolean contentUriExists(String str) {
        AssetFileDescriptor a = a(str);
        boolean z = a != null;
        if (a != null) {
            try {
                a.close();
            } catch (IOException unused) {
            }
        }
        return z;
    }

    @CalledByNative
    public static String getMimeType(String str) {
        ContentResolver contentResolver = akon.a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (!a(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        return (streamTypes == null || streamTypes.length <= 0) ? null : streamTypes[0];
    }

    @CalledByNative
    public static String maybeGetDisplayName(String str) {
        Object str2;
        try {
            String a = a(Uri.parse(str2), akon.a, ohk.b);
            str2 = TextUtils.isEmpty(a);
            return str2 != null ? null : a;
        } catch (Exception e) {
            Log.w("ContentUriUtils", "Cannot open content uri: ".concat(String.valueOf(str2)), e);
            return null;
        }
    }

    @CalledByNative
    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a = a(str);
        return a != null ? a.getParcelFileDescriptor().detachFd() : -1;
    }
}
