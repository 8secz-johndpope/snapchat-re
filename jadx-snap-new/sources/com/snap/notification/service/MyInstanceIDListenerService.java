package com.snap.notification.service;

import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceIdService;
import defpackage.sgx;

public class MyInstanceIDListenerService extends FirebaseInstanceIdService {
    public final void a() {
        sgx.a(this, RegistrationIntentService.class, new Intent());
    }
}
