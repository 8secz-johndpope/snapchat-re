package com.google.android.gms.internal;

import java.security.KeyFactory;
import java.security.Provider;

public final class zzdyb implements zzdxy<KeyFactory> {
    public final /* synthetic */ Object zzb(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
