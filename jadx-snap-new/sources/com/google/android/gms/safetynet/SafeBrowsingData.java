package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.zzbgl;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class SafeBrowsingData extends zzbgl {
    public static final Creator<SafeBrowsingData> CREATOR = new zzj();
    private static final String TAG = "SafeBrowsingData";
    private ParcelFileDescriptor zzcup;
    private long zzddi;
    private File zzgcd;
    private String zzkkd;
    private DataHolder zzkke;
    private byte[] zzkkf;
    private byte[] zzkkg;

    public SafeBrowsingData() {
        this(null, null, null, 0, null);
    }

    public SafeBrowsingData(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.zzkkd = str;
        this.zzkke = dataHolder;
        this.zzcup = parcelFileDescriptor;
        this.zzddi = j;
        this.zzkkf = bArr;
    }

    private static void zza(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    private final java.io.FileOutputStream zzalg() {
        /*
        r5 = this;
        r0 = r5.zzgcd;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r2 = "xlb";
        r3 = ".tmp";
        r0 = java.io.File.createTempFile(r2, r3, r0);	 Catch:{ IOException -> 0x002d, all -> 0x0023 }
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x002e, all -> 0x0021 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x002e, all -> 0x0021 }
        r3 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r3 = android.os.ParcelFileDescriptor.open(r0, r3);	 Catch:{ IOException -> 0x002e, all -> 0x0021 }
        r5.zzcup = r3;	 Catch:{ IOException -> 0x002e, all -> 0x0021 }
        if (r0 == 0) goto L_0x0020;
    L_0x001d:
        r0.delete();
    L_0x0020:
        return r2;
    L_0x0021:
        r1 = move-exception;
        goto L_0x0027;
    L_0x0023:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
    L_0x0027:
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r0.delete();
    L_0x002c:
        throw r1;
    L_0x002d:
        r0 = r1;
    L_0x002e:
        if (r0 == 0) goto L_0x0033;
    L_0x0030:
        r0.delete();
    L_0x0033:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.zzalg():java.io.FileOutputStream");
    }

    public DataHolder getBlacklistsDataHolder() {
        return this.zzkke;
    }

    public ParcelFileDescriptor getFileDescriptor() {
        return this.zzcup;
    }

    public long getLastUpdateTimeMs() {
        return this.zzddi;
    }

    public String getMetadata() {
        return this.zzkkd;
    }

    public byte[] getState() {
        return this.zzkkf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
        r3 = this;
        r0 = r3.zzcup;
        r1 = 1;
        if (r0 != 0) goto L_0x0031;
    L_0x0005:
        r0 = r3.zzkkg;
        if (r0 == 0) goto L_0x0031;
    L_0x0009:
        r0 = r3.zzalg();
        if (r0 == 0) goto L_0x0031;
    L_0x000f:
        r2 = new java.io.BufferedOutputStream;
        r2.<init>(r0);
        r0 = new java.io.DataOutputStream;
        r0.<init>(r2);
        r2 = r3.zzkkg;	 Catch:{ IOException -> 0x002e, all -> 0x0029 }
        r2 = r2.length;	 Catch:{ IOException -> 0x002e, all -> 0x0029 }
        r0.writeInt(r2);	 Catch:{ IOException -> 0x002e, all -> 0x0029 }
        r2 = r3.zzkkg;	 Catch:{ IOException -> 0x002e, all -> 0x0029 }
        r0.write(r2);	 Catch:{ IOException -> 0x002e, all -> 0x0029 }
        zza(r0);
        r0 = 1;
        goto L_0x0032;
    L_0x0029:
        r4 = move-exception;
        zza(r0);
        throw r4;
    L_0x002e:
        zza(r0);
    L_0x0031:
        r0 = 0;
    L_0x0032:
        if (r0 != 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0036;
    L_0x0035:
        r5 = r5 | r1;
    L_0x0036:
        com.google.android.gms.safetynet.zzj.zza(r3, r4, r5);
        r4 = 0;
        r3.zzcup = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }
}
