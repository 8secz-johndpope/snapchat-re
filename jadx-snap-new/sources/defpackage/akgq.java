package defpackage;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* renamed from: akgq */
public class akgq implements akgg {
    private final Uri a = Uri.parse("content://com.android.badge/badge");

    public final List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @TargetApi(11)
    public final void a(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.a, "setAppBadgeCount", null, bundle);
    }
}
