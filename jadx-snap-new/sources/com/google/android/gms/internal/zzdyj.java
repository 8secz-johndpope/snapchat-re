package com.google.android.gms.internal;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class zzdyj implements zzdtj {
    private Mac zzmlu;
    private final int zzmlv;
    private final String zzmlw;
    private final Key zzmlx;

    public zzdyj(String str, Key key, int i) {
        if (i >= 10) {
            int i2 = -1;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        i2 = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    i2 = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                i2 = 0;
            }
            String str2 = "tag size too big";
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        String str3 = "unknown Hmac algorithm: ";
                        str = String.valueOf(str);
                        throw new NoSuchAlgorithmException(str.length() != 0 ? str3.concat(str) : new String(str3));
                    } else if (i > 64) {
                        throw new InvalidAlgorithmParameterException(str2);
                    }
                } else if (i > 32) {
                    throw new InvalidAlgorithmParameterException(str2);
                }
            } else if (i > 20) {
                throw new InvalidAlgorithmParameterException(str2);
            }
            this.zzmlw = str;
            this.zzmlv = i;
            this.zzmlx = key;
            this.zzmlu = (Mac) zzdxx.zzmll.zzoy(str);
            this.zzmlu.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final byte[] zzaf(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.zzmlu.clone();
        } catch (CloneNotSupportedException unused) {
            mac = (Mac) zzdxx.zzmll.zzoy(this.zzmlw);
            mac.init(this.zzmlx);
        }
        mac.update(bArr);
        bArr = new byte[this.zzmlv];
        System.arraycopy(mac.doFinal(), 0, bArr, 0, this.zzmlv);
        return bArr;
    }
}
