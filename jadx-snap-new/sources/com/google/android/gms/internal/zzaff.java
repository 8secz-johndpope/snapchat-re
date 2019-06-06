package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

@zzabh
public final class zzaff implements RewardItem {
    private final zzaeu zzczy;

    public zzaff(zzaeu zzaeu) {
        this.zzczy = zzaeu;
    }

    public final int getAmount() {
        zzaeu zzaeu = this.zzczy;
        if (zzaeu == null) {
            return 0;
        }
        try {
            return zzaeu.getAmount();
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    public final String getType() {
        zzaeu zzaeu = this.zzczy;
        if (zzaeu == null) {
            return null;
        }
        try {
            return zzaeu.getType();
        } catch (RemoteException e) {
            zzaky.zzc("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
