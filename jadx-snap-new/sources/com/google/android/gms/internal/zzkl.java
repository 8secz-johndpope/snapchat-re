package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

@zzabh
public final class zzkl {
    private Bundle mExtras;
    private boolean zzamp;
    private long zzbhl;
    private int zzbhm;
    private List<String> zzbhn;
    private boolean zzbho;
    private int zzbhp;
    private String zzbhq;
    private zzno zzbhr;
    private String zzbhs;
    private Bundle zzbht;
    private Bundle zzbhu;
    private List<String> zzbhv;
    private String zzbhw;
    private String zzbhx;
    private boolean zzbhy;
    private Location zzhl;

    public zzkl() {
        this.zzbhl = -1;
        this.mExtras = new Bundle();
        this.zzbhm = -1;
        this.zzbhn = new ArrayList();
        this.zzbho = false;
        this.zzbhp = -1;
        this.zzamp = false;
        this.zzbhq = null;
        this.zzbhr = null;
        this.zzhl = null;
        this.zzbhs = null;
        this.zzbht = new Bundle();
        this.zzbhu = new Bundle();
        this.zzbhv = new ArrayList();
        this.zzbhw = null;
        this.zzbhx = null;
        this.zzbhy = false;
    }

    public zzkl(zzkk zzkk) {
        this.zzbhl = zzkk.zzbgv;
        this.mExtras = zzkk.extras;
        this.zzbhm = zzkk.zzbgw;
        this.zzbhn = zzkk.zzbgx;
        this.zzbho = zzkk.zzbgy;
        this.zzbhp = zzkk.zzbgz;
        this.zzamp = zzkk.zzbha;
        this.zzbhq = zzkk.zzbhb;
        this.zzbhr = zzkk.zzbhc;
        this.zzhl = zzkk.zzbhd;
        this.zzbhs = zzkk.zzbhe;
        this.zzbht = zzkk.zzbhf;
        this.zzbhu = zzkk.zzbhg;
        this.zzbhv = zzkk.zzbhh;
        this.zzbhw = zzkk.zzbhi;
        this.zzbhx = zzkk.zzbhj;
    }

    public final zzkl zza(Location location) {
        this.zzhl = null;
        return this;
    }

    public final zzkk zzia() {
        return new zzkk(7, this.zzbhl, this.mExtras, this.zzbhm, this.zzbhn, this.zzbho, this.zzbhp, this.zzamp, this.zzbhq, this.zzbhr, this.zzhl, this.zzbhs, this.zzbht, this.zzbhu, this.zzbhv, this.zzbhw, this.zzbhx, false);
    }
}
