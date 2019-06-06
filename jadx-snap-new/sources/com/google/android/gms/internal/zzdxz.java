package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Cipher;

public final class zzdxz implements zzdxy<Cipher> {
    public final /* synthetic */ Object zzb(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
