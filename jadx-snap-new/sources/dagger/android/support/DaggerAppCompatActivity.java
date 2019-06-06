package dagger.android.support;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import defpackage.aipp;
import defpackage.aipy;

public abstract class DaggerAppCompatActivity extends AppCompatActivity implements aipy {
    public void onCreate(Bundle bundle) {
        aipp.a((Activity) this);
        super.onCreate(bundle);
    }
}
