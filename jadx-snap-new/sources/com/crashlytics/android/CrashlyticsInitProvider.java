package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import defpackage.aiqj;
import defpackage.airl;
import defpackage.aqr;
import defpackage.aqs;

public class CrashlyticsInitProvider extends ContentProvider {

    public interface a {
        boolean a(Context context);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        String str = "CrashlyticsInitProvider";
        Context context = getContext();
        airl airl = new airl();
        Object obj = (airl.a(context) && new aqs().a(context)) ? 1 : null;
        if (obj != null) {
            try {
                aiqj.a(context, new aqr());
                aiqj.a().c(str, "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                aiqj.a().c(str, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
