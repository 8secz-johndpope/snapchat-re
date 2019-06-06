package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzli;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlp;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzqh;
import com.google.android.gms.internal.zzrs;
import com.google.android.gms.internal.zzrv;
import com.google.android.gms.internal.zzry;
import com.google.android.gms.internal.zzsb;
import com.google.android.gms.internal.zzse;
import com.google.android.gms.internal.zzsh;
import com.google.android.gms.internal.zzwf;
import defpackage.jh;

@zzabh
public final class zzaj extends zzlp {
    private final Context mContext;
    private final zzv zzanp;
    private final zzwf zzanu;
    private zzli zzapd;
    private zzko zzapi;
    private PublisherAdViewOptions zzapj;
    private zzqh zzapm;
    private zzme zzapo;
    private final String zzapp;
    private final zzala zzapq;
    private zzrs zzapv;
    private zzsh zzapw;
    private zzrv zzapx;
    private jh<String, zzry> zzapy = new jh();
    private jh<String, zzsb> zzapz = new jh();
    private zzse zzaqa;

    public zzaj(Context context, String str, zzwf zzwf, zzala zzala, zzv zzv) {
        this.mContext = context;
        this.zzapp = str;
        this.zzanu = zzwf;
        this.zzapq = zzala;
        this.zzanp = zzv;
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzapj = publisherAdViewOptions;
    }

    public final void zza(zzqh zzqh) {
        this.zzapm = zzqh;
    }

    public final void zza(zzrs zzrs) {
        this.zzapv = zzrs;
    }

    public final void zza(zzrv zzrv) {
        this.zzapx = zzrv;
    }

    public final void zza(zzse zzse, zzko zzko) {
        this.zzaqa = zzse;
        this.zzapi = zzko;
    }

    public final void zza(zzsh zzsh) {
        this.zzapw = zzsh;
    }

    public final void zza(String str, zzsb zzsb, zzry zzry) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.zzapz.put(str, zzsb);
        this.zzapy.put(str, zzry);
    }

    public final void zzb(zzli zzli) {
        this.zzapd = zzli;
    }

    public final void zzb(zzme zzme) {
        this.zzapo = zzme;
    }

    public final zzll zzdi() {
        return new zzag(this.mContext, this.zzapp, this.zzanu, this.zzapq, this.zzapd, this.zzapv, this.zzapw, this.zzapx, this.zzapz, this.zzapy, this.zzapm, this.zzapo, this.zzanp, this.zzaqa, this.zzapi, this.zzapj);
    }
}
