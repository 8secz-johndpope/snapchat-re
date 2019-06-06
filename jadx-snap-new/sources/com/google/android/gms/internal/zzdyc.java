package com.google.android.gms.internal;

import java.security.KeyPairGenerator;
import java.security.Provider;

public final class zzdyc implements zzdxy<KeyPairGenerator> {
    public final /* synthetic */ Object zzb(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
