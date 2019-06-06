package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzbq;
import java.util.Iterator;
import java.util.LinkedList;

@zzabh
final class zzuq {
    private final String zzapp;
    private final LinkedList<zzur> zzcec = new LinkedList();
    private zzkk zzced;
    private final int zzcee;
    private boolean zzcef;

    zzuq(zzkk zzkk, String str, int i) {
        zzbq.checkNotNull(zzkk);
        zzbq.checkNotNull(str);
        this.zzced = zzkk;
        this.zzapp = str;
        this.zzcee = i;
    }

    /* Access modifiers changed, original: final */
    public final String getAdUnitId() {
        return this.zzapp;
    }

    /* Access modifiers changed, original: final */
    public final int getNetworkType() {
        return this.zzcee;
    }

    /* Access modifiers changed, original: final */
    public final int size() {
        return this.zzcec.size();
    }

    /* Access modifiers changed, original: final */
    public final void zza(zztk zztk, zzkk zzkk) {
        this.zzcec.add(new zzur(this, zztk, zzkk));
    }

    /* Access modifiers changed, original: final */
    public final boolean zzb(zztk zztk) {
        zzur zzur = new zzur(this, zztk);
        this.zzcec.add(zzur);
        return zzur.load();
    }

    /* Access modifiers changed, original: final */
    public final zzur zzl(zzkk zzkk) {
        if (zzkk != null) {
            this.zzced = zzkk;
        }
        return (zzur) this.zzcec.remove();
    }

    /* Access modifiers changed, original: final */
    public final zzkk zzli() {
        return this.zzced;
    }

    /* Access modifiers changed, original: final */
    public final int zzlj() {
        Iterator it = this.zzcec.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((zzur) it.next()).zzcek) {
                i++;
            }
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    public final int zzlk() {
        Iterator it = this.zzcec.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((zzur) it.next()).load()) {
                i++;
            }
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    public final void zzll() {
        this.zzcef = true;
    }

    /* Access modifiers changed, original: final */
    public final boolean zzlm() {
        return this.zzcef;
    }
}
