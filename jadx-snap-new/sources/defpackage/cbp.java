package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import defpackage.cba.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cbp */
final class cbp extends Handler {
    private /* synthetic */ cbo a;

    cbp(cbo cbo, Looper looper) {
        this.a = cbo;
        super(looper);
    }

    public final void handleMessage(Message message) {
        cbo cbo = this.a;
        String str = "FirebaseInstanceId";
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w(str, "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new a());
        String str2 = "google.messenger";
        if (intent.hasExtra(str2)) {
            Parcelable parcelableExtra = intent.getParcelableExtra(str2);
            if (parcelableExtra instanceof cba) {
                cbo.b = (cba) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                cbo.a = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        String str3;
        String valueOf;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            action = "registration_id";
            CharSequence stringExtra = intent2.getStringExtra(action);
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                cbo.a(intent2);
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (matcher.matches()) {
                str = matcher.group(1);
                str2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString(action, str2);
                cbo.a(str, extras);
                return;
            }
            if (Log.isLoggable(str, 3)) {
                str3 = "Unexpected response string: ";
                valueOf = String.valueOf(stringExtra);
                Log.d(str, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            }
            return;
        }
        if (Log.isLoggable(str, 3)) {
            str3 = "Unexpected response action: ";
            valueOf = String.valueOf(action);
            Log.d(str, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }
}
