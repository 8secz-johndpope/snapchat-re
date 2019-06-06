package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;
import java.util.ArrayList;

@zzabh
public final class zzhg {
    private final Object mLock = new Object();
    private final int zzayc;
    private final int zzayd;
    private final int zzaye;
    private final zzht zzayf;
    private final zzic zzayg;
    private ArrayList<String> zzayh = new ArrayList();
    private ArrayList<String> zzayi = new ArrayList();
    private ArrayList<zzhr> zzayj = new ArrayList();
    private int zzayk = 0;
    private int zzayl = 0;
    private int zzaym = 0;
    private int zzayn;
    private String zzayo;
    private String zzayp;
    private String zzayq;

    public zzhg(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        String str = "";
        this.zzayo = str;
        this.zzayp = str;
        this.zzayq = str;
        this.zzayc = i;
        this.zzayd = i2;
        this.zzaye = i3;
        this.zzayf = new zzht(i4);
        this.zzayg = new zzic(i5, i6, i7);
    }

    private static String zza(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            stringBuilder.append((String) obj);
            stringBuilder.append(' ');
            if (stringBuilder.length() > 100) {
                break;
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        String stringBuilder2 = stringBuilder.toString();
        return stringBuilder2.length() < 100 ? stringBuilder2 : stringBuilder2.substring(0, 100);
    }

    private final void zzc(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.zzaye) {
            synchronized (this.mLock) {
                this.zzayh.add(str);
                this.zzayk += str.length();
                if (z) {
                    this.zzayi.add(str);
                    this.zzayj.add(new zzhr(f, f2, f3, f4, this.zzayi.size() - 1));
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhg)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzhg) obj).zzayo;
        return str != null && str.equals(this.zzayo);
    }

    public final int getScore() {
        return this.zzayn;
    }

    public final int hashCode() {
        return this.zzayo.hashCode();
    }

    public final String toString() {
        int i = this.zzayl;
        int i2 = this.zzayn;
        int i3 = this.zzayk;
        String zza = zza(this.zzayh, 100);
        String zza2 = zza(this.zzayi, 100);
        String str = this.zzayo;
        String str2 = this.zzayp;
        String str3 = this.zzayq;
        StringBuilder stringBuilder = new StringBuilder(((((String.valueOf(zza).length() + 165) + String.valueOf(zza2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("ActivityContent fetchId: ");
        stringBuilder.append(i);
        stringBuilder.append(" score:");
        stringBuilder.append(i2);
        stringBuilder.append(" total_length:");
        stringBuilder.append(i3);
        stringBuilder.append("\n text: ");
        stringBuilder.append(zza);
        stringBuilder.append("\n viewableText");
        stringBuilder.append(zza2);
        stringBuilder.append("\n signture: ");
        stringBuilder.append(str);
        stringBuilder.append("\n viewableSignture: ");
        stringBuilder.append(str2);
        stringBuilder.append("\n viewableSignatureForVertical: ");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    public final void zza(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
        synchronized (this.mLock) {
            if (this.zzaym < 0) {
                zzaky.zzby("ActivityContent: negative number of WebViews.");
            }
            zzgu();
        }
    }

    public final void zzb(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
    }

    public final boolean zzgn() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzaym == 0;
        }
        return z;
    }

    public final String zzgo() {
        return this.zzayo;
    }

    public final String zzgp() {
        return this.zzayp;
    }

    public final String zzgq() {
        return this.zzayq;
    }

    public final void zzgr() {
        synchronized (this.mLock) {
            this.zzayn -= 100;
        }
    }

    public final void zzgs() {
        synchronized (this.mLock) {
            this.zzaym--;
        }
    }

    public final void zzgt() {
        synchronized (this.mLock) {
            this.zzaym++;
        }
    }

    public final void zzgu() {
        synchronized (this.mLock) {
            int i = (this.zzayk * this.zzayc) + (this.zzayl * this.zzayd);
            if (i > this.zzayn) {
                this.zzayn = i;
                if (((Boolean) zzlc.zzio().zzd(zzoi.zzbnn)).booleanValue() && !zzbt.zzep().zzqe().zzqp()) {
                    this.zzayo = this.zzayf.zza(this.zzayh);
                    this.zzayp = this.zzayf.zza(this.zzayi);
                }
                if (((Boolean) zzlc.zzio().zzd(zzoi.zzbnp)).booleanValue() && !zzbt.zzep().zzqe().zzqr()) {
                    this.zzayq = this.zzayg.zza(this.zzayi, this.zzayj);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final int zzgv() {
        return this.zzayk;
    }

    public final void zzo(int i) {
        this.zzayl = i;
    }
}
