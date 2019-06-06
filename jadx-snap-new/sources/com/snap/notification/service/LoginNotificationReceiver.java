package com.snap.notification.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.sgx;

public class LoginNotificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        sgx.a(context, RegistrationIntentService.class, intent);
    }
}
