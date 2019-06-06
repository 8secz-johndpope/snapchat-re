package com.snap.stuffing.lib;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import defpackage.aipp;
import defpackage.ytt;

public class DynamicLaunchActivity extends Activity {
    public ytt a;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aipp.a((Activity) this);
        String d = this.a.d();
        if (d != null) {
            try {
                Class cls = Class.forName(d);
                Intent intent = getIntent();
                if (intent != null) {
                    intent = (Intent) intent.clone();
                    intent.setComponent(new ComponentName(this, cls));
                } else {
                    intent = new Intent(this, cls);
                }
                startActivity(intent);
                finish();
                return;
            } catch (ClassNotFoundException unused) {
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("No default activity for appFamily ");
        stringBuilder.append(this.a.a());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
    }
}
