package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.widget.RemoteViews;
import com.snapchat.android.R;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qwr */
public final class qwr {
    private final NotificationManager a;
    private final Context b;

    public qwr(Context context) {
        akcr.b(context, "context");
        this.b = context;
        Object systemService = this.b.getSystemService("notification");
        if (systemService != null) {
            this.a = (NotificationManager) systemService;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public final void a(Map<UUID, qwu> map, AtomicInteger atomicInteger, UUID uuid, int i) {
        akcr.b(map, "uuidToUploadStatus");
        akcr.b(atomicInteger, "uploadingInstanceRefCount");
        akcr.b(uuid, "uuid");
        qwu qwu = (qwu) map.get(uuid);
        if (qwu != null) {
            String string;
            Object a;
            long min = Math.min((qwu.a * 100) / qwu.b, 95);
            if (i <= 1) {
                string = this.b.getString(R.string.foreground_service_sending_one_snap);
            } else {
                string = this.b.getString(R.string.foreground_service_sending_multiple_snaps, new Object[]{Integer.valueOf(map.size()), Integer.valueOf(i)});
            }
            Object string2 = this.b.getString(R.string.foreground_service_sending_percent, new Object[]{Long.valueOf(min)});
            akcr.a(string2, "context.getString(com.sn…ding_percent, percentage)");
            if (VERSION.SDK_INT <= 23) {
                a = qwt.a(this.b, null).a((CharSequence) string).c((CharSequence) string2).a(100, (int) min, false);
            } else {
                RemoteViews remoteViews = new RemoteViews(this.b.getPackageName(), R.layout.foreground_service_notification_view);
                remoteViews.setTextViewText(R.id.foreground_service_sending_text, string);
                remoteViews.setTextViewText(R.id.foreground_service_progress_indication, (CharSequence) string2);
                remoteViews.setProgressBar(R.id.foreground_service_notification_progress_bar, 100, (int) min, false);
                a = qwt.a(this.b, remoteViews);
            }
            if (atomicInteger.get() > 0) {
                NotificationManager notificationManager = this.a;
                akcr.a(a, "notificationBuilder");
                notificationManager.notify(1431325696, qwt.a(a));
            }
        }
    }
}
