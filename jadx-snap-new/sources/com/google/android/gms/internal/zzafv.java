package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@zzabh
public final class zzafv extends zzahs implements zzafu {
    private final Context mContext;
    private final Object mLock;
    private final zzahe zzcob;
    private final long zzdae;
    private final ArrayList<zzafl> zzdaq;
    private final List<zzafo> zzdar;
    private final HashSet<String> zzdas;
    private final zzaeo zzdat;

    public zzafv(Context context, zzahe zzahe, zzaeo zzaeo) {
        Context context2 = context;
        zzahe zzahe2 = zzahe;
        zzaeo zzaeo2 = zzaeo;
        this(context2, zzahe2, zzaeo2, ((Long) zzlc.zzio().zzd(zzoi.zzboz)).longValue());
    }

    private zzafv(Context context, zzahe zzahe, zzaeo zzaeo, long j) {
        this.zzdaq = new ArrayList();
        this.zzdar = new ArrayList();
        this.zzdas = new HashSet();
        this.mLock = new Object();
        this.mContext = context;
        this.zzcob = zzahe;
        this.zzdat = zzaeo;
        this.zzdae = j;
    }

    private final zzahd zza(int i, String str, zzvp zzvp) {
        int i2 = i;
        String str2 = str;
        zzvp zzvp2 = zzvp;
        return new zzahd(this.zzcob.zzcvm.zzcrv, null, this.zzcob.zzdcw.zzchw, i2, this.zzcob.zzdcw.zzchx, this.zzcob.zzdcw.zzctq, this.zzcob.zzdcw.orientation, this.zzcob.zzdcw.zzcic, this.zzcob.zzcvm.zzcry, this.zzcob.zzdcw.zzcto, zzvp2, null, str2, this.zzcob.zzdcj, null, this.zzcob.zzdcw.zzctp, this.zzcob.zzaud, this.zzcob.zzdcw.zzctn, this.zzcob.zzdcn, this.zzcob.zzdcw.zzcts, this.zzcob.zzdcw.zzctt, this.zzcob.zzdch, null, this.zzcob.zzdcw.zzcuc, this.zzcob.zzdcw.zzcud, this.zzcob.zzdcw.zzcue, this.zzcob.zzdcw.zzcuf, this.zzcob.zzdcw.zzcug, zzpb(), this.zzcob.zzdcw.zzchz, this.zzcob.zzdcw.zzcuj, this.zzcob.zzdcu, this.zzcob.zzdcw.zzaqw, this.zzcob.zzdcv);
    }

    private final String zzpb() {
        StringBuilder stringBuilder = new StringBuilder("");
        List list = this.zzdar;
        if (list == null) {
            return stringBuilder.toString();
        }
        Iterator it = list.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                return stringBuilder.substring(0, Math.max(0, stringBuilder.length() - 1));
            }
            zzafo zzafo = (zzafo) it.next();
            if (!(zzafo == null || TextUtils.isEmpty(zzafo.zzche))) {
                String str = zzafo.zzche;
                int i2 = zzafo.errorCode;
                if (i2 != 3) {
                    i = i2 != 4 ? i2 != 5 ? i2 != 6 ? i2 != 7 ? 6 : 3 : 0 : 4 : 2;
                }
                long j = zzafo.zzcjj;
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 33);
                stringBuilder2.append(str);
                String str2 = ".";
                stringBuilder2.append(str2);
                stringBuilder2.append(i);
                stringBuilder2.append(str2);
                stringBuilder2.append(j);
                stringBuilder.append(String.valueOf(stringBuilder2.toString()).concat("_"));
            }
        }
    }

    public final void onStop() {
    }

    public final void zza(String str, int i) {
    }

    public final void zzbr(String str) {
        synchronized (this.mLock) {
            this.zzdas.add(str);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0158 */
    public final void zzdo() {
        /*
        r19 = this;
        r11 = r19;
        r0 = r11.zzcob;
        r0 = r0.zzdcj;
        r0 = r0.zzchv;
        r12 = r0.iterator();
    L_0x000c:
        r0 = r12.hasNext();
        if (r0 == 0) goto L_0x00b6;
    L_0x0012:
        r0 = r12.next();
        r13 = r0;
        r13 = (com.google.android.gms.internal.zzvp) r13;
        r14 = r13.zzchk;
        r0 = r13.zzchd;
        r15 = r0.iterator();
    L_0x0021:
        r0 = r15.hasNext();
        if (r0 == 0) goto L_0x000c;
    L_0x0027:
        r0 = r15.next();
        r0 = (java.lang.String) r0;
        r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0040;
    L_0x0035:
        r1 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0040;
    L_0x003e:
        r3 = r0;
        goto L_0x004c;
    L_0x0040:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00ae }
        r0.<init>(r14);	 Catch:{ JSONException -> 0x00ae }
        r1 = "class_name";
        r0 = r0.getString(r1);	 Catch:{ JSONException -> 0x00ae }
        goto L_0x003e;
    L_0x004c:
        r9 = r11.mLock;
        monitor-enter(r9);
        r0 = r11.zzdat;	 Catch:{ all -> 0x00a7 }
        r7 = r0.zzbq(r3);	 Catch:{ all -> 0x00a7 }
        if (r7 == 0) goto L_0x0081;
    L_0x0057:
        r0 = r7.zzpd();	 Catch:{ all -> 0x00a7 }
        if (r0 == 0) goto L_0x0081;
    L_0x005d:
        r0 = r7.zzpc();	 Catch:{ all -> 0x00a7 }
        if (r0 != 0) goto L_0x0064;
    L_0x0063:
        goto L_0x0081;
    L_0x0064:
        r0 = new com.google.android.gms.internal.zzafl;	 Catch:{ all -> 0x00a7 }
        r2 = r11.mContext;	 Catch:{ all -> 0x00a7 }
        r6 = r11.zzcob;	 Catch:{ all -> 0x00a7 }
        r4 = r11.zzdae;	 Catch:{ all -> 0x00a7 }
        r1 = r0;
        r16 = r4;
        r4 = r14;
        r5 = r13;
        r8 = r19;
        r18 = r9;
        r9 = r16;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00ac }
        r1 = r11.zzdaq;	 Catch:{ all -> 0x00ac }
        r1.add(r0);	 Catch:{ all -> 0x00ac }
    L_0x007f:
        monitor-exit(r18);	 Catch:{ all -> 0x00ac }
        goto L_0x0021;
    L_0x0081:
        r18 = r9;
        r0 = r11.zzdar;	 Catch:{ all -> 0x00ac }
        r1 = new com.google.android.gms.internal.zzafq;	 Catch:{ all -> 0x00ac }
        r1.<init>();	 Catch:{ all -> 0x00ac }
        r2 = r13.zzche;	 Catch:{ all -> 0x00ac }
        r1 = r1.zzbt(r2);	 Catch:{ all -> 0x00ac }
        r1 = r1.zzbs(r3);	 Catch:{ all -> 0x00ac }
        r2 = 0;
        r1 = r1.zzg(r2);	 Catch:{ all -> 0x00ac }
        r2 = 7;
        r1 = r1.zzab(r2);	 Catch:{ all -> 0x00ac }
        r1 = r1.zzpa();	 Catch:{ all -> 0x00ac }
        r0.add(r1);	 Catch:{ all -> 0x00ac }
        goto L_0x007f;
    L_0x00a7:
        r0 = move-exception;
        r18 = r9;
    L_0x00aa:
        monitor-exit(r18);	 Catch:{ all -> 0x00ac }
        throw r0;
    L_0x00ac:
        r0 = move-exception;
        goto L_0x00aa;
    L_0x00ae:
        r0 = move-exception;
        r1 = "Unable to determine custom event class name, skipping...";
        com.google.android.gms.internal.zzaky.zzb(r1, r0);
        goto L_0x0021;
    L_0x00b6:
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = r11.zzdaq;
        r1 = (java.util.ArrayList) r1;
        r2 = r1.size();
        r3 = 0;
        r4 = 0;
    L_0x00c5:
        if (r4 >= r2) goto L_0x00db;
    L_0x00c7:
        r5 = r1.get(r4);
        r4 = r4 + 1;
        r5 = (com.google.android.gms.internal.zzafl) r5;
        r6 = r5.zzcip;
        r6 = r0.add(r6);
        if (r6 == 0) goto L_0x00c5;
    L_0x00d7:
        r5.zzow();
        goto L_0x00c5;
    L_0x00db:
        r0 = r11.zzdaq;
        r1 = r0;
        r1 = (java.util.ArrayList) r1;
        r2 = r1.size();
    L_0x00e4:
        if (r3 >= r2) goto L_0x0191;
    L_0x00e6:
        r0 = r1.get(r3);
        r3 = r3 + 1;
        r4 = r0;
        r4 = (com.google.android.gms.internal.zzafl) r4;
        r0 = r4.zzow();	 Catch:{ InterruptedException -> 0x0158, Exception -> 0x0139 }
        r0.get();	 Catch:{ InterruptedException -> 0x0158, Exception -> 0x0139 }
        r5 = r11.mLock;
        monitor-enter(r5);
        r0 = r4.zzcip;	 Catch:{ all -> 0x0134 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0134 }
        if (r0 != 0) goto L_0x010a;
    L_0x0101:
        r0 = r11.zzdar;	 Catch:{ all -> 0x0134 }
        r6 = r4.zzox();	 Catch:{ all -> 0x0134 }
        r0.add(r6);	 Catch:{ all -> 0x0134 }
    L_0x010a:
        monitor-exit(r5);	 Catch:{ all -> 0x0134 }
        r6 = r11.mLock;
        monitor-enter(r6);
        r0 = r11.zzdas;	 Catch:{ all -> 0x0131 }
        r5 = r4.zzcip;	 Catch:{ all -> 0x0131 }
        r0 = r0.contains(r5);	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x012f;
    L_0x0118:
        r0 = r4.zzcip;	 Catch:{ all -> 0x0131 }
        r1 = r4.zzoy();	 Catch:{ all -> 0x0131 }
        r2 = -2;
        r0 = r11.zza(r2, r0, r1);	 Catch:{ all -> 0x0131 }
        r1 = com.google.android.gms.internal.zzako.zzaju;	 Catch:{ all -> 0x0131 }
        r2 = new com.google.android.gms.internal.zzafw;	 Catch:{ all -> 0x0131 }
        r2.<init>(r11, r0);	 Catch:{ all -> 0x0131 }
        r1.post(r2);	 Catch:{ all -> 0x0131 }
        monitor-exit(r6);	 Catch:{ all -> 0x0131 }
        return;
    L_0x012f:
        monitor-exit(r6);	 Catch:{ all -> 0x0131 }
        goto L_0x00e4;
    L_0x0131:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0131 }
        throw r0;
    L_0x0134:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0134 }
        throw r0;
    L_0x0137:
        r0 = move-exception;
        goto L_0x0178;
    L_0x0139:
        r0 = move-exception;
        r5 = "Unable to resolve rewarded adapter.";
        com.google.android.gms.internal.zzaky.zzc(r5, r0);	 Catch:{ all -> 0x0137 }
        r5 = r11.mLock;
        monitor-enter(r5);
        r0 = r4.zzcip;	 Catch:{ all -> 0x0155 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0155 }
        if (r0 != 0) goto L_0x0153;
    L_0x014a:
        r0 = r11.zzdar;	 Catch:{ all -> 0x0155 }
        r4 = r4.zzox();	 Catch:{ all -> 0x0155 }
        r0.add(r4);	 Catch:{ all -> 0x0155 }
    L_0x0153:
        monitor-exit(r5);	 Catch:{ all -> 0x0155 }
        goto L_0x00e4;
    L_0x0155:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0155 }
        throw r0;
    L_0x0158:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0137 }
        r0.interrupt();	 Catch:{ all -> 0x0137 }
        r1 = r11.mLock;
        monitor-enter(r1);
        r0 = r4.zzcip;	 Catch:{ all -> 0x0175 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0175 }
        if (r0 != 0) goto L_0x0173;
    L_0x016a:
        r0 = r11.zzdar;	 Catch:{ all -> 0x0175 }
        r2 = r4.zzox();	 Catch:{ all -> 0x0175 }
        r0.add(r2);	 Catch:{ all -> 0x0175 }
    L_0x0173:
        monitor-exit(r1);	 Catch:{ all -> 0x0175 }
        goto L_0x0191;
    L_0x0175:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0175 }
        throw r0;
    L_0x0178:
        r1 = r11.mLock;
        monitor-enter(r1);
        r2 = r4.zzcip;	 Catch:{ all -> 0x018e }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x018e }
        if (r2 != 0) goto L_0x018c;
    L_0x0183:
        r2 = r11.zzdar;	 Catch:{ all -> 0x018e }
        r3 = r4.zzox();	 Catch:{ all -> 0x018e }
        r2.add(r3);	 Catch:{ all -> 0x018e }
    L_0x018c:
        monitor-exit(r1);	 Catch:{ all -> 0x018e }
        throw r0;
    L_0x018e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x018e }
        throw r0;
    L_0x0191:
        r0 = 3;
        r1 = 0;
        r0 = r11.zza(r0, r1, r1);
        r1 = com.google.android.gms.internal.zzako.zzaju;
        r2 = new com.google.android.gms.internal.zzafx;
        r2.<init>(r11, r0);
        r1.post(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzafv.zzdo():void");
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzl(zzahd zzahd) {
        this.zzdat.zzoq().zzb(zzahd);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzm(zzahd zzahd) {
        this.zzdat.zzoq().zzb(zzahd);
    }
}
