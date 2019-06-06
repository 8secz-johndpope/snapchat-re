package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.internal.zzcf;
import defpackage.fv;

public abstract class zzv implements OnClickListener {
    public static zzv zza(Activity activity, Intent intent, int i) {
        return new zzw(intent, activity, i);
    }

    public static zzv zza(zzcf zzcf, Intent intent, int i) {
        return new zzy(intent, zzcf, 2);
    }

    public static zzv zza(fv fvVar, Intent intent, int i) {
        return new zzx(intent, fvVar, i);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            zzamo();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }

    public abstract void zzamo();
}
