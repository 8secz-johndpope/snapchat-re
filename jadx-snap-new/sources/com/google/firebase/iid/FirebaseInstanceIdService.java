package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import defpackage.can;
import defpackage.cbq;

public class FirebaseInstanceIdService extends zzb {
    /* Access modifiers changed, original: protected|final */
    public final Intent a(Intent intent) {
        return (Intent) cbq.a().a.poll();
    }

    public void a() {
    }

    public final void b(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            a();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(stringExtra).length() + 21) + String.valueOf(valueOf).length());
                stringBuilder.append("Received command: ");
                stringBuilder.append(stringExtra);
                stringBuilder.append(" - ");
                stringBuilder.append(valueOf);
                Log.d(str, stringBuilder.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.getInstance(can.c()).f();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId instance = FirebaseInstanceId.getInstance(can.c());
                FirebaseInstanceId.a.c("");
                instance.b();
            }
        }
    }
}
