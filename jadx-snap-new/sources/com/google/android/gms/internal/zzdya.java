package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.KeyAgreement;

public final class zzdya implements zzdxy<KeyAgreement> {
    public final /* synthetic */ Object zzb(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
