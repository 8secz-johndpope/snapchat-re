package com.google.android.gms.internal;

import com.brightcove.player.event.EventType;
import com.google.android.gms.common.util.zzf;
import com.samsung.android.sdk.camera.SCamera;
import java.util.HashMap;
import java.util.Map;

@zzabh
public final class zzaou extends zzmn {
    private final Object lock = new Object();
    private boolean zzbkn = true;
    private boolean zzbko;
    private boolean zzbkp;
    private zzmp zzcjx;
    private final zzann zzdly;
    private final boolean zzdrn;
    private final boolean zzdro;
    private final float zzdrp;
    private int zzdrq;
    private boolean zzdrr;
    private boolean zzdrs = true;
    private float zzdrt;
    private float zzdru;

    public zzaou(zzann zzann, float f, boolean z, boolean z2) {
        this.zzdly = zzann;
        this.zzdrp = f;
        this.zzdrn = z;
        this.zzdro = z2;
    }

    private final void zzc(String str, Map<String, String> map) {
        Map hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzaly.zzdjt.execute(new zzaov(this, hashMap));
    }

    public final float getAspectRatio() {
        float f;
        synchronized (this.lock) {
            f = this.zzdru;
        }
        return f;
    }

    public final int getPlaybackState() {
        int i;
        synchronized (this.lock) {
            i = this.zzdrq;
        }
        return i;
    }

    public final boolean isClickToExpandEnabled() {
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.lock) {
            if (!isCustomControlsEnabled) {
                try {
                    if (this.zzbkp && this.zzdro) {
                        isCustomControlsEnabled = true;
                    }
                } finally {
                }
            }
            isCustomControlsEnabled = false;
        }
        return isCustomControlsEnabled;
    }

    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdrn && this.zzbko;
        }
        return z;
    }

    public final boolean isMuted() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdrs;
        }
        return z;
    }

    public final void mute(boolean z) {
        zzc(z ? "mute" : "unmute", null);
    }

    public final void pause() {
        zzc(EventType.PAUSE, null);
    }

    public final void play() {
        zzc(EventType.PLAY, null);
    }

    public final void zza(float f, int i, boolean z, float f2) {
        boolean z2;
        int i2;
        synchronized (this.lock) {
            this.zzdrt = f;
            z2 = this.zzdrs;
            this.zzdrs = z;
            i2 = this.zzdrq;
            this.zzdrq = i;
            f = this.zzdru;
            this.zzdru = f2;
            if (Math.abs(this.zzdru - f) > 1.0E-4f) {
                this.zzdly.getView().invalidate();
            }
        }
        zzaly.zzdjt.execute(new zzaow(this, i2, i, z2, z));
    }

    public final void zza(zzmp zzmp) {
        synchronized (this.lock) {
            this.zzcjx = zzmp;
        }
    }

    public final void zzb(zzns zzns) {
        synchronized (this.lock) {
            this.zzbkn = zzns.zzbkn;
            this.zzbko = zzns.zzbko;
            this.zzbkp = zzns.zzbkp;
        }
        zzc("initialState", zzf.zza("muteStart", zzns.zzbkn ? SCamera.CAMERA_ID_FRONT : "0", "customControlsRequested", zzns.zzbko ? SCamera.CAMERA_ID_FRONT : "0", "clickToExpandRequested", zzns.zzbkp ? SCamera.CAMERA_ID_FRONT : "0"));
    }

    public final float zziq() {
        return this.zzdrp;
    }

    public final float zzir() {
        float f;
        synchronized (this.lock) {
            f = this.zzdrt;
        }
        return f;
    }

    public final zzmp zzis() {
        zzmp zzmp;
        synchronized (this.lock) {
            zzmp = this.zzcjx;
        }
        return zzmp;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzr(Map map) {
        this.zzdly.zza("pubVideoCmd", map);
    }
}
