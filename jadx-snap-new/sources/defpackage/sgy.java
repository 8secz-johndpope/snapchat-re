package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.snap.notification.service.ClearNotificationIntentService;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: sgy */
public final class sgy implements sev {
    private final Context a;
    private final fwv b;

    public sgy(Context context, fwv fwv) {
        akcr.b(context, "context");
        akcr.b(fwv, "activityClassProvider");
        this.a = context;
        this.b = fwv;
    }

    public final PendingIntent a(sdr sdr) {
        akcr.b(sdr, "notification");
        Uri uri = sdr.k;
        if (uri == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("android.intent.action.VIEW_");
        stringBuilder.append(sdr.b.name());
        Intent intent = new Intent(stringBuilder.toString(), uri, this.a, this.b.getActivityClass());
        intent.setFlags(603979776);
        intent.putExtra("fromServerNotification", true);
        intent.putExtra("type", sdr.b.name());
        intent.putExtra("notificationId", sdr.a);
        return PendingIntent.getActivity(this.a.getApplicationContext(), 0, intent, AudioPlayer.INFINITY_LOOP_COUNT);
    }

    public final Intent a() {
        Intent intent = new Intent();
        intent.setData(Uri.parse("snapchat://notification/setting/"));
        return intent;
    }

    public final PendingIntent b(sdr sdr) {
        akcr.b(sdr, "notification");
        Intent intent = new Intent(this.a, ClearNotificationIntentService.class);
        intent.putExtra("n_key", sdr.c);
        return PendingIntent.getService(this.a, 0, intent, SQLiteDatabase.CREATE_IF_NECESSARY);
    }
}
