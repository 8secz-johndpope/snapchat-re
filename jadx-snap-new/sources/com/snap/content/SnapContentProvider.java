package com.snap.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ftq.a;
import defpackage.gfu;
import defpackage.ilv;
import defpackage.iot;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;

@Deprecated
public class SnapContentProvider extends ContentProvider {
    private static String a(Uri uri) {
        List pathSegments = uri.getPathSegments();
        return (pathSegments == null || pathSegments.isEmpty()) ? uri.toString() : (String) pathSegments.get(0);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException(String.format(Locale.US, "See SnapDb for database delete: %s", new Object[]{a(uri)}));
    }

    public String getType(Uri uri) {
        throw new UnsupportedOperationException(String.format(Locale.US, "See SnapDb for database getType: %s", new Object[]{a(uri)}));
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(String.format(Locale.US, "See SnapDb for database insert: %s", new Object[]{a(uri)}));
    }

    public boolean onCreate() {
        return true;
    }

    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        return openTypedAssetFile(uri, str, bundle, new CancellationSignal());
    }

    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        gfu gfu = (gfu) a.a.a.get();
        try {
            ((ilv) a.a.b.get()).c(iot.CONTENT_RESOLVER_USAGE.a(MessageMediaRefModel.URI, a(uri)), 1);
            return (AssetFileDescriptor) gfu.a(uri, null).b();
        } catch (Exception e) {
            if (e.getCause() instanceof InterruptedException) {
                return null;
            }
            FileNotFoundException fileNotFoundException = new FileNotFoundException();
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return new MatrixCursor(strArr, 0);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(String.format(Locale.US, "See SnapDb for database update: %s", new Object[]{a(uri)}));
    }
}
