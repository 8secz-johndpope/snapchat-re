package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

@zzabh
@TargetApi(14)
public final class zzanq implements OnAudioFocusChangeListener {
    private final AudioManager mAudioManager;
    private boolean zzdlm;
    private final zzanr zzdog;
    private boolean zzdoh;
    private boolean zzdoi;
    private float zzdoj = 1.0f;

    public zzanq(Context context, zzanr zzanr) {
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
        this.zzdog = zzanr;
    }

    private final void zztr() {
        boolean z = false;
        Object obj = (!this.zzdlm || this.zzdoi || this.zzdoj <= MapboxConstants.MINIMUM_ZOOM) ? null : 1;
        if (obj != null) {
            boolean z2 = this.zzdoh;
            if (!z2) {
                AudioManager audioManager = this.mAudioManager;
                if (!(audioManager == null || z2)) {
                    if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                        z = true;
                    }
                    this.zzdoh = z;
                }
                this.zzdog.zzsn();
                return;
            }
        }
        if (obj == null) {
            boolean z3 = this.zzdoh;
            if (z3) {
                AudioManager audioManager2 = this.mAudioManager;
                if (audioManager2 != null && z3) {
                    if (audioManager2.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.zzdoh = z;
                }
                this.zzdog.zzsn();
            }
        }
    }

    public final float getVolume() {
        return this.zzdoh ? this.zzdoi ? MapboxConstants.MINIMUM_ZOOM : this.zzdoj : MapboxConstants.MINIMUM_ZOOM;
    }

    public final void onAudioFocusChange(int i) {
        this.zzdoh = i > 0;
        this.zzdog.zzsn();
    }

    public final void setMuted(boolean z) {
        this.zzdoi = z;
        zztr();
    }

    public final void zzb(float f) {
        this.zzdoj = f;
        zztr();
    }

    public final void zzto() {
        this.zzdlm = true;
        zztr();
    }

    public final void zztp() {
        this.zzdlm = false;
        zztr();
    }
}
