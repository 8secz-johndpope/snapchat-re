package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzagl;
import com.google.android.gms.internal.zzagm;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzana;
import com.google.android.gms.internal.zzanf;
import com.google.android.gms.internal.zzans;
import com.google.android.gms.internal.zzaod;
import com.google.android.gms.internal.zziz;

@zzabh
public final class zzv {
    public final zzaod zzaok;
    public final zzana zzaol;
    public final zzagr zzaom;
    public final zziz zzaon;

    private zzv(zzaod zzaod, zzana zzana, zzagr zzagr, zziz zziz) {
        this.zzaok = zzaod;
        this.zzaol = zzana;
        this.zzaom = zzagr;
        this.zzaon = zziz;
    }

    public static zzv zzc(Context context) {
        return new zzv(new zzans(), new zzanf(), new zzagl(new zzagm()), new zziz(context));
    }
}
