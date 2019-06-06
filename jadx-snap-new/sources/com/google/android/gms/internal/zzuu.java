package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbt;
import java.io.IOException;

@zzabh
final class zzuu {
    final String zzapp;
    final zzkk zzarx;
    final int zzcee;

    private zzuu(zzkk zzkk, String str, int i) {
        this.zzarx = zzkk;
        this.zzapp = str;
        this.zzcee = i;
    }

    zzuu(zzuq zzuq) {
        this(zzuq.zzli(), zzuq.getAdUnitId(), zzuq.getNetworkType());
    }

    static zzuu zzba(String str) {
        String[] split = str.split("\u0000");
        if (split.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
                int parseInt = Integer.parseInt(split[1]);
                byte[] decode = Base64.decode(split[2], 0);
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                zzuu zzuu = new zzuu((zzkk) zzkk.CREATOR.createFromParcel(obtain), str2, parseInt);
                obtain.recycle();
                return zzuu;
            } catch (zzbgn | IllegalArgumentException | IllegalStateException e) {
                zzbt.zzep().zza(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            } catch (Throwable th) {
                obtain.recycle();
            }
        } else {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0060 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:7:?, code skipped:
            com.google.android.gms.internal.zzaky.e("QueueSeed encode failed because UTF-8 is not available.");
     */
    /* JADX WARNING: Missing block: B:8:0x006a, code skipped:
            return "";
     */
    /* JADX WARNING: Missing block: B:9:0x006b, code skipped:
            r1.recycle();
     */
    public final java.lang.String zzlw() {
        /*
        r7 = this;
        r0 = "\u0000";
        r1 = android.os.Parcel.obtain();
        r2 = r7.zzapp;	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r3 = "UTF-8";
        r2 = r2.getBytes(r3);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r3 = 0;
        r2 = android.util.Base64.encodeToString(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r4 = r7.zzcee;	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r5 = r7.zzarx;	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r5.writeToParcel(r1, r3);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r5 = r1.marshall();	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r3 = android.util.Base64.encodeToString(r5, r3);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r5 = r5.length();	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r5 = r5 + 2;
        r6 = java.lang.String.valueOf(r4);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r6 = r6.length();	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r5 = r5 + r6;
        r6 = java.lang.String.valueOf(r3);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r6 = r6.length();	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r6.<init>(r5);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r6.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r6.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r6.append(r4);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r6.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r6.append(r3);	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r0 = r6.toString();	 Catch:{ UnsupportedEncodingException -> 0x0060 }
        r1.recycle();
        return r0;
    L_0x005e:
        r0 = move-exception;
        goto L_0x006b;
    L_0x0060:
        r0 = "QueueSeed encode failed because UTF-8 is not available.";
        com.google.android.gms.internal.zzaky.e(r0);	 Catch:{ all -> 0x005e }
        r1.recycle();
        r0 = "";
        return r0;
    L_0x006b:
        r1.recycle();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzuu.zzlw():java.lang.String");
    }
}
