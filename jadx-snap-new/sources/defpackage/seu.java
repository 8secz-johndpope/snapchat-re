package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;

/* renamed from: seu */
public final class seu {
    static {
        ajzt.a((Object[]) new String[]{"android.title", "android.text"});
    }

    public static final gr a(Context context) {
        akcr.b(context, "receiver$0");
        Object a = gr.a(context);
        akcr.a(a, "NotificationManagerCompat.from(this)");
        return a;
    }

    public static final NotificationManager b(Context context) {
        akcr.b(context, "receiver$0");
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            return (NotificationManager) systemService;
        }
        throw new ajxt("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public static final StatusBarNotification[] c(Context context) {
        akcr.b(context, "receiver$0");
        try {
            StatusBarNotification[] activeNotifications = seu.b(context).getActiveNotifications();
            return activeNotifications == null ? new StatusBarNotification[0] : activeNotifications;
        } catch (Exception unused) {
            return new StatusBarNotification[0];
        }
    }
}
