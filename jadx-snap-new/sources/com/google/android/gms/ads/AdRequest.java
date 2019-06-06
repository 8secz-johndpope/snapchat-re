package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.internal.zzmu;
import com.google.android.gms.internal.zzmv;
import java.util.Date;

public final class AdRequest {
    private final zzmu zzalq;

    public static final class Builder {
        private final zzmv zzalr = new zzmv();

        public Builder() {
            this.zzalr.zzae("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final Builder addKeyword(String str) {
            this.zzalr.zzad(str);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.zzalr.zza(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zzalr.zzaf("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.zzalr.zzae(str);
            return this;
        }

        public final AdRequest build() {
            return new AdRequest(this, null);
        }

        public final Builder setBirthday(Date date) {
            this.zzalr.zza(date);
            return this;
        }

        public final Builder setGender(int i) {
            this.zzalr.zzr(i);
            return this;
        }

        public final Builder setIsDesignedForFamilies(boolean z) {
            this.zzalr.zzk(z);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.zzalr.zzb(location);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzalr.zzj(z);
            return this;
        }
    }

    private AdRequest(Builder builder) {
        this.zzalq = new zzmu(builder.zzalr);
    }

    /* synthetic */ AdRequest(Builder builder, zza zza) {
        this(builder);
    }

    public final zzmu zzbe() {
        return this.zzalq;
    }
}
