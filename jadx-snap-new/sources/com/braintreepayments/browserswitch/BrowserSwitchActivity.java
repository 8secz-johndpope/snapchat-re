package com.braintreepayments.browserswitch;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

public class BrowserSwitchActivity extends Activity {
    public static Uri a;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a = null;
        if (!(getIntent() == null || getIntent().getData() == null)) {
            a = getIntent().getData();
        }
        finish();
    }
}
