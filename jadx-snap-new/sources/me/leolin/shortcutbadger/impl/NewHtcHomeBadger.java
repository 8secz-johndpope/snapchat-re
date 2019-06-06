package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.looksery.sdk.listener.AnalyticsListener;
import defpackage.akgg;
import defpackage.akgh;
import defpackage.akgr;
import java.util.Collections;
import java.util.List;

public class NewHtcHomeBadger implements akgg {
    public final List<String> a() {
        return Collections.singletonList("com.htc.launcher");
    }

    public final void a(Context context, ComponentName componentName, int i) {
        Object obj;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra(AnalyticsListener.ANALYTICS_COUNT_KEY, i);
        Object obj2 = null;
        try {
            akgr.b(context, intent);
            obj = 1;
        } catch (akgh unused) {
            obj = null;
        }
        try {
            akgr.b(context, intent2);
            obj2 = 1;
        } catch (akgh unused2) {
        }
        if (obj == null && obj2 == null) {
            StringBuilder stringBuilder = new StringBuilder("unable to resolve intent: ");
            stringBuilder.append(intent2.toString());
            throw new akgh(stringBuilder.toString());
        }
    }
}
