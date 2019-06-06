package defpackage;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.firebase.jobdispatcher.GooglePlayReceiver;
import defpackage.bar.a;

@TargetApi(21)
/* renamed from: bak */
public final class bak extends Handler {
    private final GooglePlayReceiver a;

    public bak(Looper looper, GooglePlayReceiver googlePlayReceiver) {
        super(looper);
        this.a = googlePlayReceiver;
    }

    public final void handleMessage(Message message) {
        String str = "FJD.GooglePlayReceiver";
        if (message != null) {
            try {
                ((AppOpsManager) this.a.getApplicationContext().getSystemService("appops")).checkPackage(message.sendingUid, "com.google.android.gms");
                int i = message.what;
                if (i == 1) {
                    Bundle data = message.getData();
                    Messenger messenger = message.replyTo;
                    String string = data.getString("tag");
                    if (messenger == null || string == null) {
                        if (Log.isLoggable(str, 3)) {
                            Log.d(str, "Invalid start execution message.");
                        }
                        return;
                    }
                    this.a.a().a(GooglePlayReceiver.a(new bal(messenger, string), data));
                } else if (i != 2) {
                    if (i != 4) {
                        Log.e(str, "Unrecognized message received: ".concat(String.valueOf(message)));
                    }
                } else {
                    a a = GooglePlayReceiver.a.a(message.getData());
                    if (a == null) {
                        if (Log.isLoggable(str, 3)) {
                            Log.d(str, "Invalid stop execution message.");
                        }
                        return;
                    }
                    bae.a(a.a(), true);
                }
            } catch (SecurityException unused) {
                Log.e(str, "Message was not sent from GCM.");
            }
        }
    }
}
