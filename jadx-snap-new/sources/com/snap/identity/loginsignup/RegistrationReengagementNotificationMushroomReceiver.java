package com.snap.identity.loginsignup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.akcr;

public final class RegistrationReengagementNotificationMushroomReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        akcr.b(context, "context");
        akcr.b(intent, "intent");
        context.startService(new Intent(context, RegistrationReengagementNotificationService.class));
    }
}
