package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzo extends LifecycleCallback implements OnCancelListener {
    protected volatile boolean mStarted;
    protected final GoogleApiAvailability zzftg;
    protected final AtomicReference<zzp> zzfut;
    private final Handler zzfuu;

    protected zzo(zzcf zzcf) {
        this(zzcf, GoogleApiAvailability.getInstance());
    }

    private zzo(zzcf zzcf, GoogleApiAvailability googleApiAvailability) {
        super(zzcf);
        this.zzfut = new AtomicReference(null);
        this.zzfuu = new Handler(Looper.getMainLooper());
        this.zzftg = googleApiAvailability;
    }

    private static int zza(zzp zzp) {
        return zzp == null ? -1 : zzp.zzaim();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    public final void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
        r3 = this;
        r0 = r3.zzfut;
        r0 = r0.get();
        r0 = (com.google.android.gms.common.api.internal.zzp) r0;
        r1 = 1;
        r2 = 0;
        if (r4 == r1) goto L_0x0030;
    L_0x000c:
        r5 = 2;
        if (r4 == r5) goto L_0x0010;
    L_0x000f:
        goto L_0x0055;
    L_0x0010:
        r4 = r3.zzftg;
        r5 = r3.getActivity();
        r4 = r4.isGooglePlayServicesAvailable(r5);
        if (r4 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001e;
    L_0x001d:
        r1 = 0;
    L_0x001e:
        if (r0 != 0) goto L_0x0021;
    L_0x0020:
        return;
    L_0x0021:
        r5 = r0.zzain();
        r5 = r5.getErrorCode();
        r6 = 18;
        if (r5 != r6) goto L_0x0056;
    L_0x002d:
        if (r4 != r6) goto L_0x0056;
    L_0x002f:
        return;
    L_0x0030:
        r4 = -1;
        if (r5 != r4) goto L_0x0034;
    L_0x0033:
        goto L_0x0056;
    L_0x0034:
        if (r5 != 0) goto L_0x0055;
    L_0x0036:
        r4 = 13;
        if (r6 == 0) goto L_0x0040;
    L_0x003a:
        r5 = "<<ResolutionFailureErrorDetail>>";
        r4 = r6.getIntExtra(r5, r4);
    L_0x0040:
        r5 = new com.google.android.gms.common.api.internal.zzp;
        r6 = new com.google.android.gms.common.ConnectionResult;
        r1 = 0;
        r6.<init>(r4, r1);
        r4 = zza(r0);
        r5.<init>(r6, r4);
        r4 = r3.zzfut;
        r4.set(r5);
        r0 = r5;
    L_0x0055:
        r1 = 0;
    L_0x0056:
        if (r1 == 0) goto L_0x005c;
    L_0x0058:
        r3.zzail();
        return;
    L_0x005c:
        if (r0 == 0) goto L_0x0069;
    L_0x005e:
        r4 = r0.zzain();
        r5 = r0.zzaim();
        r3.zza(r4, r5);
    L_0x0069:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzo.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        zza(new ConnectionResult(13, null), zza((zzp) this.zzfut.get()));
        zzail();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zzfut.set(bundle.getBoolean("resolving_error", false) ? new zzp(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zzp zzp = (zzp) this.zzfut.get();
        if (zzp != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zzp.zzaim());
            bundle.putInt("failed_status", zzp.zzain().getErrorCode());
            bundle.putParcelable("failed_resolution", zzp.zzain().getResolution());
        }
    }

    public void onStart() {
        super.onStart();
        this.mStarted = true;
    }

    public void onStop() {
        super.onStop();
        this.mStarted = false;
    }

    public abstract void zza(ConnectionResult connectionResult, int i);

    public abstract void zzaih();

    /* Access modifiers changed, original: protected|final */
    public final void zzail() {
        this.zzfut.set(null);
        zzaih();
    }

    public final void zzb(ConnectionResult connectionResult, int i) {
        zzp zzp = new zzp(connectionResult, i);
        if (this.zzfut.compareAndSet(null, zzp)) {
            this.zzfuu.post(new zzq(this, zzp));
        }
    }
}
