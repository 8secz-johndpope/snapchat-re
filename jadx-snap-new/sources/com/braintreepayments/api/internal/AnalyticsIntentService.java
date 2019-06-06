package com.braintreepayments.api.internal;

import android.app.IntentService;
import android.content.Intent;
import defpackage.vf;
import defpackage.vy;
import defpackage.wb;
import defpackage.wl;
import defpackage.ws;
import org.json.JSONException;

public class AnalyticsIntentService extends IntentService {
    public AnalyticsIntentService() {
        super(AnalyticsIntentService.class.getSimpleName());
        setIntentRedelivery(true);
    }

    /* Access modifiers changed, original: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                wl a = wl.a(intent.getStringExtra("com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_AUTHORIZATION"));
                vy.a(this, a, new wb(a), ws.a(intent.getStringExtra("com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_CONFIGURATION")).c.a, true);
            } catch (JSONException | vf unused) {
            }
        }
    }
}
