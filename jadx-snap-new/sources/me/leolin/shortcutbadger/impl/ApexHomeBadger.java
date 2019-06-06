package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.looksery.sdk.listener.AnalyticsListener;
import defpackage.akgg;
import defpackage.akgr;
import java.util.Arrays;
import java.util.List;

public class ApexHomeBadger implements akgg {
    public final List<String> a() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }

    public final void a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra(AnalyticsListener.ANALYTICS_COUNT_KEY, i);
        intent.putExtra("class", componentName.getClassName());
        akgr.b(context, intent);
    }
}
