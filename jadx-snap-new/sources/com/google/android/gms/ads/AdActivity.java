package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzyq;

public class AdActivity extends Activity {
    private zzyq zzalm;

    private final void zzbd() {
        zzyq zzyq = this.zzalm;
        if (zzyq != null) {
            try {
                zzyq.zzbd();
            } catch (RemoteException e) {
                zzaky.zzc("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.zzalm.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            zzaky.zzc("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.zzalm != null) {
                z = this.zzalm.zzni();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.zzalm.zzk(zzn.zzz(configuration));
        } catch (RemoteException e) {
            zzaky.zzc("Failed to wrap configuration.", e);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzalm = zzlc.zzik().zzb((Activity) this);
        zzyq zzyq = this.zzalm;
        if (zzyq == null) {
            zzaky.zzcz("Could not create ad overlay.");
        } else {
            try {
                zzyq.onCreate(bundle);
                return;
            } catch (RemoteException e) {
                zzaky.zzc("Could not forward onCreate to ad overlay:", e);
            }
        }
        finish();
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        try {
            if (this.zzalm != null) {
                this.zzalm.onDestroy();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        try {
            if (this.zzalm != null) {
                this.zzalm.onPause();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    /* Access modifiers changed, original: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.zzalm != null) {
                this.zzalm.onRestart();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.zzalm != null) {
                this.zzalm.onResume();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.zzalm != null) {
                this.zzalm.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.zzalm != null) {
                this.zzalm.onStart();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        try {
            if (this.zzalm != null) {
                this.zzalm.onStop();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        zzbd();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        zzbd();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzbd();
    }
}
