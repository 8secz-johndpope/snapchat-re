package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import defpackage.akgg;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements akgg {
    private final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    private AsyncQueryHandler b;

    public final List<String> a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    public final void a(Context context, ComponentName componentName, int i) {
        boolean z = false;
        if ((context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null ? 1 : null) != null) {
            if (i >= 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("badge_count", Integer.valueOf(i));
                contentValues.put("package_name", componentName.getPackageName());
                contentValues.put("activity_name", componentName.getClassName());
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    if (this.b == null) {
                        this.b = new AsyncQueryHandler(context.getApplicationContext().getContentResolver()) {
                        };
                    }
                    this.b.startInsert(0, null, this.a, contentValues);
                    return;
                }
                context.getApplicationContext().getContentResolver().insert(this.a, contentValues);
            }
            return;
        }
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        if (i > 0) {
            z = true;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
        context.sendBroadcast(intent);
    }
}
