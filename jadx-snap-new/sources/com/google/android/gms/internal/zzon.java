package com.google.android.gms.internal;

import android.text.TextUtils;

@zzabh
public final class zzon {
    public static zzol zza(zzok zzok) {
        if (!zzok.zzjh()) {
            zzahw.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        } else if (zzok.getContext() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(zzok.zzfw())) {
            return new zzol(zzok.getContext(), zzok.zzfw(), zzok.zzji(), zzok.zzjj());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
