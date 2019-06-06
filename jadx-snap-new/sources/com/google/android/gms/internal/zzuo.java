package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbt;
import defpackage.ppy;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@zzabh
public final class zzuo {
    private final Map<zzup, zzuq> zzcdz = new HashMap();
    private final LinkedList<zzup> zzcea = new LinkedList();
    private zztk zzceb;

    private static void zza(String str, zzup zzup) {
        if (zzaky.zzae(2)) {
            zzahw.v(String.format(str, new Object[]{zzup}));
        }
    }

    private static String[] zzax(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    private static boolean zzay(String str) {
        try {
            return Pattern.matches((String) zzlc.zzio().zzd(zzoi.zzbpy), str);
        } catch (RuntimeException e) {
            zzbt.zzep().zza(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    private static String zzaz(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            return matcher.matches() ? matcher.group(1) : str;
        } catch (RuntimeException unused) {
            return str;
        }
    }

    private static void zzb(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            }
            return;
        }
    }

    static Set<String> zzh(zzkk zzkk) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzkk.extras.keySet());
        Bundle bundle = zzkk.zzbhf.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    static zzkk zzi(zzkk zzkk) {
        zzkk = zzk(zzkk);
        Bundle bundle = zzkk.zzbhf.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        String str = "_skipMediation";
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        zzkk.extras.putBoolean(str, true);
        return zzkk;
    }

    private static zzkk zzj(zzkk zzkk) {
        zzkk = zzk(zzkk);
        for (String str : ((String) zzlc.zzio().zzd(zzoi.zzbpu)).split(ppy.b)) {
            zzb(zzkk.zzbhf, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                zzb(zzkk.extras, str.replaceFirst(str2, ""));
            }
        }
        return zzkk;
    }

    private static zzkk zzk(zzkk zzkk) {
        Parcel obtain = Parcel.obtain();
        zzkk.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzkk = (zzkk) zzkk.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return ((Boolean) zzlc.zzio().zzd(zzoi.zzbpi)).booleanValue() ? zzkk.zzhz() : zzkk;
    }

    private final String zzlh() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = this.zzcea.iterator();
            while (it.hasNext()) {
                stringBuilder.append(Base64.encodeToString(((zzup) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    stringBuilder.append("\u0000");
                }
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* Access modifiers changed, original: final */
    public final zzur zza(zzkk zzkk, String str) {
        if (zzay(str)) {
            return null;
        }
        int i = new zzaeb(this.zzceb.getApplicationContext()).zzom().zzcyo;
        zzkk = zzj(zzkk);
        str = zzaz(str);
        zzup zzup = new zzup(zzkk, str, i);
        zzuq zzuq = (zzuq) this.zzcdz.get(zzup);
        if (zzuq == null) {
            zza("Interstitial pool created at %s.", zzup);
            zzuq = new zzuq(zzkk, str, i);
            this.zzcdz.put(zzup, zzuq);
        }
        this.zzcea.remove(zzup);
        this.zzcea.add(zzup);
        zzuq.zzll();
        while (true) {
            if (this.zzcea.size() <= ((Integer) zzlc.zzio().zzd(zzoi.zzbpv)).intValue()) {
                break;
            }
            zzup zzup2 = (zzup) this.zzcea.remove();
            zzuq zzuq2 = (zzuq) this.zzcdz.get(zzup2);
            zza("Evicting interstitial queue for %s.", zzup2);
            while (zzuq2.size() > 0) {
                zzur zzl = zzuq2.zzl(null);
                if (zzl.zzcek) {
                    zzus.zzln().zzlp();
                }
                zzl.zzceg.zzdk();
            }
            this.zzcdz.remove(zzup2);
        }
        while (zzuq.size() > 0) {
            zzur zzl2 = zzuq.zzl(zzkk);
            if (zzl2.zzcek) {
                if (zzbt.zzes().currentTimeMillis() - zzl2.zzcej > ((long) ((Integer) zzlc.zzio().zzd(zzoi.zzbpx)).intValue()) * 1000) {
                    zza("Expired interstitial at %s.", zzup);
                    zzus.zzln().zzlo();
                }
            }
            String str2 = zzl2.zzceh != null ? " (inline) " : " ";
            StringBuilder stringBuilder = new StringBuilder(str2.length() + 34);
            stringBuilder.append("Pooled interstitial");
            stringBuilder.append(str2);
            stringBuilder.append("returned at %s.");
            zza(stringBuilder.toString(), zzup);
            return zzl2;
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zztk zztk) {
        if (this.zzceb == null) {
            this.zzceb = zztk.zzlf();
            zztk = this.zzceb;
            if (zztk != null) {
                int i = 0;
                SharedPreferences sharedPreferences = zztk.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.zzcea.size() > 0) {
                    zzup zzup = (zzup) this.zzcea.remove();
                    zzuq zzuq = (zzuq) this.zzcdz.get(zzup);
                    zza("Flushing interstitial queue for %s.", zzup);
                    while (zzuq.size() > 0) {
                        zzuq.zzl(null).zzceg.zzdk();
                    }
                    this.zzcdz.remove(zzup);
                }
                try {
                    String str;
                    HashMap hashMap = new HashMap();
                    Iterator it = sharedPreferences.getAll().entrySet().iterator();
                    while (true) {
                        str = "PoolKeys";
                        if (!it.hasNext()) {
                            break;
                        }
                        Entry entry = (Entry) it.next();
                        if (!((String) entry.getKey()).equals(str)) {
                            zzuu zzba = zzuu.zzba((String) entry.getValue());
                            zzup zzup2 = new zzup(zzba.zzarx, zzba.zzapp, zzba.zzcee);
                            if (!this.zzcdz.containsKey(zzup2)) {
                                this.zzcdz.put(zzup2, new zzuq(zzba.zzarx, zzba.zzapp, zzba.zzcee));
                                hashMap.put(zzup2.toString(), zzup2);
                                zza("Restored interstitial queue for %s.", zzup2);
                            }
                        }
                    }
                    String[] zzax = zzax(sharedPreferences.getString(str, ""));
                    int length = zzax.length;
                    while (i < length) {
                        zzup zzup3 = (zzup) hashMap.get(zzax[i]);
                        if (this.zzcdz.containsKey(zzup3)) {
                            this.zzcea.add(zzup3);
                        }
                        i++;
                    }
                } catch (IOException | RuntimeException e) {
                    zzbt.zzep().zza(e, "InterstitialAdPool.restore");
                    zzaky.zzc("Malformed preferences value for InterstitialAdPool.", e);
                    this.zzcdz.clear();
                    this.zzcea.clear();
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzb(zzkk zzkk, String str) {
        zztk zztk = this.zzceb;
        if (zztk != null) {
            int i = new zzaeb(zztk.getApplicationContext()).zzom().zzcyo;
            zzkk zzj = zzj(zzkk);
            str = zzaz(str);
            zzup zzup = new zzup(zzj, str, i);
            zzuq zzuq = (zzuq) this.zzcdz.get(zzup);
            if (zzuq == null) {
                zza("Interstitial pool created at %s.", zzup);
                zzuq = new zzuq(zzj, str, i);
                this.zzcdz.put(zzup, zzuq);
            }
            zzuq.zza(this.zzceb, zzkk);
            zzuq.zzll();
            zza("Inline entry added to the queue at %s.", zzup);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:8:0x002f, code skipped:
            r5 = r1.size();
     */
    public final void zzlg() {
        /*
        r8 = this;
        r0 = r8.zzceb;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r8.zzcdz;
        r0 = r0.entrySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        r2 = 0;
        if (r1 == 0) goto L_0x0089;
    L_0x0016:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r3 = r1.getKey();
        r3 = (com.google.android.gms.internal.zzup) r3;
        r1 = r1.getValue();
        r1 = (com.google.android.gms.internal.zzuq) r1;
        r4 = 2;
        r5 = com.google.android.gms.internal.zzaky.zzae(r4);
        if (r5 == 0) goto L_0x0056;
    L_0x002f:
        r5 = r1.size();
        r6 = r1.zzlj();
        if (r6 >= r5) goto L_0x0056;
    L_0x0039:
        r7 = 3;
        r7 = new java.lang.Object[r7];
        r6 = r5 - r6;
        r6 = java.lang.Integer.valueOf(r6);
        r7[r2] = r6;
        r5 = java.lang.Integer.valueOf(r5);
        r6 = 1;
        r7[r6] = r5;
        r7[r4] = r3;
        r4 = "Loading %s/%s pooled interstitials for %s.";
        r4 = java.lang.String.format(r4, r7);
        com.google.android.gms.internal.zzahw.v(r4);
    L_0x0056:
        r4 = r1.zzlk();
        r4 = r4 + r2;
    L_0x005b:
        r2 = r1.size();
        r5 = com.google.android.gms.internal.zzoi.zzbpw;
        r6 = com.google.android.gms.internal.zzlc.zzio();
        r5 = r6.zzd(r5);
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        if (r2 >= r5) goto L_0x0081;
    L_0x0071:
        r2 = "Pooling and loading one new interstitial for %s.";
        zza(r2, r3);
        r2 = r8.zzceb;
        r2 = r1.zzb(r2);
        if (r2 == 0) goto L_0x005b;
    L_0x007e:
        r4 = r4 + 1;
        goto L_0x005b;
    L_0x0081:
        r1 = com.google.android.gms.internal.zzus.zzln();
        r1.zzu(r4);
        goto L_0x000f;
    L_0x0089:
        r0 = r8.zzceb;
        if (r0 == 0) goto L_0x00e8;
    L_0x008d:
        r0 = r0.getApplicationContext();
        r1 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool";
        r0 = r0.getSharedPreferences(r1, r2);
        r0 = r0.edit();
        r0.clear();
        r1 = r8.zzcdz;
        r1 = r1.entrySet();
        r1 = r1.iterator();
    L_0x00a8:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00dc;
    L_0x00ae:
        r2 = r1.next();
        r2 = (java.util.Map.Entry) r2;
        r3 = r2.getKey();
        r3 = (com.google.android.gms.internal.zzup) r3;
        r2 = r2.getValue();
        r2 = (com.google.android.gms.internal.zzuq) r2;
        r4 = r2.zzlm();
        if (r4 == 0) goto L_0x00a8;
    L_0x00c6:
        r4 = new com.google.android.gms.internal.zzuu;
        r4.<init>(r2);
        r2 = r4.zzlw();
        r4 = r3.toString();
        r0.putString(r4, r2);
        r2 = "Saved interstitial queue for %s.";
        zza(r2, r3);
        goto L_0x00a8;
    L_0x00dc:
        r1 = r8.zzlh();
        r2 = "PoolKeys";
        r0.putString(r2, r1);
        r0.apply();
    L_0x00e8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzuo.zzlg():void");
    }
}
