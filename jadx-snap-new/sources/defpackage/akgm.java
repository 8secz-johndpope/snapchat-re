package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* renamed from: akgm */
public class akgm implements akgg {
    private int a = -1;

    public final List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    public final void a(Context context, ComponentName componentName, int i) {
        if (this.a != i) {
            this.a = i;
            if (VERSION.SDK_INT >= 11) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("app_badge_count", i);
                    context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", null, bundle);
                } catch (Throwable unused) {
                    akgh akgh = new akgh("Unable to execute Badge By Content Provider");
                }
            } else {
                if (i == 0) {
                    i = -1;
                }
                Intent intent = new Intent("com.oppo.unsettledevent");
                intent.putExtra("pakeageName", componentName.getPackageName());
                intent.putExtra("number", i);
                intent.putExtra("upgradeNumber", i);
                akgr.b(context, intent);
            }
        }
    }
}
