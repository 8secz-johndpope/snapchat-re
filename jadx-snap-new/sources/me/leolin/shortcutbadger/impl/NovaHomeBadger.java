package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.looksery.sdk.listener.AnalyticsListener;
import defpackage.akgg;
import java.util.Arrays;
import java.util.List;

public class NovaHomeBadger implements akgg {
    public final List<String> a() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }

    public final void a(Context context, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(componentName.getPackageName());
        stringBuilder.append("/");
        stringBuilder.append(componentName.getClassName());
        contentValues.put("tag", stringBuilder.toString());
        contentValues.put(AnalyticsListener.ANALYTICS_COUNT_KEY, Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
