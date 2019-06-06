package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbt;
import defpackage.ppy;
import java.util.concurrent.TimeUnit;

@zzabh
public final class zzano {
    private final Context mContext;
    private final zzala zzarg;
    private final String zzcwj;
    private final zzov zzdli;
    private boolean zzdlm;
    private final zzot zzdnt;
    private final zzajn zzdnu = new zzajq().zza("min_1", Double.MIN_VALUE, 1.0d).zza("1_5", 1.0d, 5.0d).zza("5_10", 5.0d, 10.0d).zza("10_20", 10.0d, 20.0d).zza("20_30", 20.0d, 30.0d).zza("30_max", 30.0d, Double.MAX_VALUE).zzrs();
    private final long[] zzdnv;
    private final String[] zzdnw;
    private boolean zzdnx = false;
    private boolean zzdny = false;
    private boolean zzdnz = false;
    private boolean zzdoa = false;
    private zzamz zzdob;
    private boolean zzdoc;
    private boolean zzdod;
    private long zzdoe = -1;

    public zzano(Context context, zzala zzala, String str, zzov zzov, zzot zzot) {
        this.mContext = context;
        this.zzarg = zzala;
        this.zzcwj = str;
        this.zzdli = zzov;
        this.zzdnt = zzot;
        String str2 = (String) zzlc.zzio().zzd(zzoi.zzbmb);
        if (str2 == null) {
            this.zzdnw = new String[0];
            this.zzdnv = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ppy.b);
        this.zzdnw = new String[split.length];
        this.zzdnv = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzdnv[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzaky.zzc("Unable to parse frame hash target time number.", e);
                this.zzdnv[i] = -1;
            }
        }
    }

    public final void onStop() {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbma)).booleanValue() && !this.zzdoc) {
            String str;
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.zzcwj);
            bundle.putString("player", this.zzdob.zzsj());
            for (zzajp zzajp : this.zzdnu.getBuckets()) {
                str = "fps_c_";
                String valueOf = String.valueOf(zzajp.name);
                bundle.putString(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), Integer.toString(zzajp.count));
                str = "fps_p_";
                valueOf = String.valueOf(zzajp.name);
                bundle.putString(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), Double.toString(zzajp.zzdgw));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.zzdnv;
                if (i < jArr.length) {
                    str = this.zzdnw[i];
                    if (str != null) {
                        String valueOf2 = String.valueOf(Long.valueOf(jArr[i]));
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 3);
                        stringBuilder.append("fh_");
                        stringBuilder.append(valueOf2);
                        bundle.putString(stringBuilder.toString(), str);
                    }
                    i++;
                } else {
                    zzbt.zzel().zza(this.mContext, this.zzarg.zzcu, "gmob-apps", bundle, true);
                    this.zzdoc = true;
                    return;
                }
            }
        }
    }

    public final void zza(zzamz zzamz) {
        zzoo.zza(this.zzdli, this.zzdnt, "vpc2");
        this.zzdnx = true;
        zzov zzov = this.zzdli;
        if (zzov != null) {
            zzov.zzf("vpn", zzamz.zzsj());
        }
        this.zzdob = zzamz;
    }

    public final void zzb(zzamz zzamz) {
        if (this.zzdnz && !this.zzdoa) {
            zzoo.zza(this.zzdli, this.zzdnt, "vff2");
            this.zzdoa = true;
        }
        long nanoTime = zzbt.zzes().nanoTime();
        if (this.zzdlm && this.zzdod && this.zzdoe != -1) {
            double toNanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d = (double) (nanoTime - this.zzdoe);
            Double.isNaN(toNanos);
            Double.isNaN(d);
            this.zzdnu.zza(toNanos / d);
        }
        this.zzdod = this.zzdlm;
        this.zzdoe = nanoTime;
        nanoTime = ((Long) zzlc.zzio().zzd(zzoi.zzbmc)).longValue();
        long currentPosition = (long) zzamz.getCurrentPosition();
        int i = 0;
        while (true) {
            String[] strArr = this.zzdnw;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] != null || nanoTime <= Math.abs(currentPosition - this.zzdnv[i])) {
                zzamz zzamz2 = zzamz;
                i++;
            } else {
                String[] strArr2 = this.zzdnw;
                int i2 = 8;
                Bitmap bitmap = zzamz.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    j = j2;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3);
                        i4++;
                        j3--;
                        i2 = 8;
                    }
                    i3++;
                    j2 = j;
                    i2 = 8;
                    j = j3;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    public final void zzsp() {
        if (this.zzdnx && !this.zzdny) {
            zzoo.zza(this.zzdli, this.zzdnt, "vfr2");
            this.zzdny = true;
        }
    }

    public final void zzto() {
        this.zzdlm = true;
        if (this.zzdny && !this.zzdnz) {
            zzoo.zza(this.zzdli, this.zzdnt, "vfp2");
            this.zzdnz = true;
        }
    }

    public final void zztp() {
        this.zzdlm = false;
    }
}
