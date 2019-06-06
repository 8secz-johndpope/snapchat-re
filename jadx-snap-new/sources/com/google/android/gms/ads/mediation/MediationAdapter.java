package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface MediationAdapter {

    public static class zza {
        private int zzdsw;

        public final zza zzah(int i) {
            this.zzdsw = 1;
            return this;
        }

        public final Bundle zzvp() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.zzdsw);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
