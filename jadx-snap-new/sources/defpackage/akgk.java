package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.looksery.sdk.listener.AnalyticsListener;
import java.util.Arrays;
import java.util.List;

/* renamed from: akgk */
public class akgk implements akgg {
    public final List<String> a() {
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }

    public final void a(Context context, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put(AnalyticsListener.ANALYTICS_COUNT_KEY, Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
