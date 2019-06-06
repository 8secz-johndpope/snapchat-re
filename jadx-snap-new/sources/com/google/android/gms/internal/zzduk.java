package com.google.android.gms.internal;

import com.snap.core.db.record.TalkAuthContextModel;
import java.security.GeneralSecurityException;

final class zzduk implements zzdsz<zzdtj> {
    public final zzdtf<zzdtj> zzd(String str, String str2, int i) {
        String toLowerCase = str2.toLowerCase();
        Object obj = -1;
        Object obj2 = (toLowerCase.hashCode() == 107855 && toLowerCase.equals(TalkAuthContextModel.MAC)) ? null : -1;
        if (obj2 == null) {
            if (str.hashCode() == 836622442 && str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                obj = null;
            }
            if (obj == null) {
                zzdui zzdui = new zzdui();
                if (i <= 0) {
                    return zzdui;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
