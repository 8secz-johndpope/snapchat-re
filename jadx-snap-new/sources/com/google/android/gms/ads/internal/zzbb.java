package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzaan;
import com.google.android.gms.internal.zzaar;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahe;
import com.google.android.gms.internal.zzahw;
import com.google.android.gms.internal.zzaid;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzalt;
import com.google.android.gms.internal.zzamd;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzfx;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzmm;
import com.google.android.gms.internal.zzmp;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzpk;
import com.google.android.gms.internal.zzpm;
import com.google.android.gms.internal.zzpr;
import com.google.android.gms.internal.zzpt;
import com.google.android.gms.internal.zzpv;
import com.google.android.gms.internal.zzpw;
import com.google.android.gms.internal.zzpx;
import com.google.android.gms.internal.zzro;
import com.google.android.gms.internal.zzry;
import com.google.android.gms.internal.zzsb;
import com.google.android.gms.internal.zzvq;
import com.google.android.gms.internal.zzwf;
import com.google.android.gms.internal.zzwi;
import com.google.android.gms.internal.zzwr;
import com.google.android.gms.internal.zzwu;
import com.google.android.gms.internal.zzyx;
import com.google.android.gms.internal.zzzm;
import defpackage.jh;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzbb extends zzd implements zzpw {
    private final Object mLock;
    private boolean zzany;
    private boolean zzari;
    private zzamd<zzpx> zzarj;
    private zzaof zzark;
    private int zzarl;
    private zzaan zzarm;
    private final String zzarn;

    public zzbb(Context context, zzv zzv, zzko zzko, String str, zzwf zzwf, zzala zzala) {
        this(context, zzv, zzko, str, zzwf, zzala, false);
    }

    public zzbb(Context context, zzv zzv, zzko zzko, String str, zzwf zzwf, zzala zzala, boolean z) {
        super(context, zzko, str, zzwf, zzala, zzv);
        this.mLock = new Object();
        this.zzarj = new zzamd();
        this.zzarl = 1;
        this.zzarn = UUID.randomUUID().toString();
        this.zzari = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a0  */
    private static com.google.android.gms.internal.zzpr zza(com.google.android.gms.internal.zzpx r19) {
        /*
        r0 = r19;
        r1 = r0 instanceof com.google.android.gms.internal.zzpm;
        r2 = 0;
        if (r1 == 0) goto L_0x004f;
    L_0x0007:
        r0 = (com.google.android.gms.internal.zzpm) r0;
        r1 = new com.google.android.gms.internal.zzpr;
        r4 = r0.getHeadline();
        r5 = r0.getImages();
        r6 = r0.getBody();
        r7 = r0.zzkj();
        r8 = r0.getCallToAction();
        r9 = r0.getAdvertiser();
        r10 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r12 = 0;
        r13 = 0;
        r14 = r0.zzkf();
        r15 = r0.getVideoController();
        r16 = r0.zzkg();
        r17 = r0.zzkh();
        r18 = r0.getMediationAdapterClassName();
        r3 = r1;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18);
        r3 = r0.zzkd();
        if (r3 == 0) goto L_0x009c;
    L_0x0045:
        r0 = r0.zzkd();
    L_0x0049:
        r0 = com.google.android.gms.dynamic.zzn.zzy(r0);
        r2 = r0;
        goto L_0x009c;
    L_0x004f:
        r1 = r0 instanceof com.google.android.gms.internal.zzpk;
        if (r1 == 0) goto L_0x009b;
    L_0x0053:
        r0 = (com.google.android.gms.internal.zzpk) r0;
        r1 = new com.google.android.gms.internal.zzpr;
        r4 = r0.getHeadline();
        r5 = r0.getImages();
        r6 = r0.getBody();
        r7 = r0.zzkc();
        r8 = r0.getCallToAction();
        r9 = 0;
        r10 = r0.getStarRating();
        r12 = r0.getStore();
        r13 = r0.getPrice();
        r14 = r0.zzkf();
        r15 = r0.getVideoController();
        r16 = r0.zzkg();
        r17 = r0.zzkh();
        r18 = r0.getMediationAdapterClassName();
        r3 = r1;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18);
        r3 = r0.zzkd();
        if (r3 == 0) goto L_0x009c;
    L_0x0096:
        r0 = r0.zzkd();
        goto L_0x0049;
    L_0x009b:
        r1 = r2;
    L_0x009c:
        r0 = r2 instanceof com.google.android.gms.internal.zzpz;
        if (r0 == 0) goto L_0x00a5;
    L_0x00a0:
        r2 = (com.google.android.gms.internal.zzpz) r2;
        r1.zzb(r2);
    L_0x00a5:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzbb.zza(com.google.android.gms.internal.zzpx):com.google.android.gms.internal.zzpr");
    }

    private static void zza(zzbu zzbu, zzbu zzbu2) {
        if (zzbu2.zzaul == null) {
            zzbu2.zzaul = zzbu.zzaul;
        }
        if (zzbu2.zzaum == null) {
            zzbu2.zzaum = zzbu.zzaum;
        }
        if (zzbu2.zzauo == null) {
            zzbu2.zzauo = zzbu.zzauo;
        }
        if (zzbu2.zzaup == null) {
            zzbu2.zzaup = zzbu.zzaup;
        }
        if (zzbu2.zzaur == null) {
            zzbu2.zzaur = zzbu.zzaur;
        }
        if (zzbu2.zzauq == null) {
            zzbu2.zzauq = zzbu.zzauq;
        }
        if (zzbu2.zzauy == null) {
            zzbu2.zzauy = zzbu.zzauy;
        }
        if (zzbu2.zzaug == null) {
            zzbu2.zzaug = zzbu.zzaug;
        }
        if (zzbu2.zzauz == null) {
            zzbu2.zzauz = zzbu.zzauz;
        }
        if (zzbu2.zzauh == null) {
            zzbu2.zzauh = zzbu.zzauh;
        }
        if (zzbu2.zzaui == null) {
            zzbu2.zzaui = zzbu.zzaui;
        }
        if (zzbu2.zzaud == null) {
            zzbu2.zzaud = zzbu.zzaud;
        }
        if (zzbu2.zzaue == null) {
            zzbu2.zzaue = zzbu.zzaue;
        }
        if (zzbu2.zzauf == null) {
            zzbu2.zzauf = zzbu.zzauf;
        }
    }

    private final void zza(zzpk zzpk) {
        zzaij.zzdfn.post(new zzbf(this, zzpk));
    }

    private final void zza(zzpm zzpm) {
        zzaij.zzdfn.post(new zzbg(this, zzpm));
    }

    private final void zza(zzpr zzpr) {
        try {
            if (this.zzanm.zzaun != null) {
                this.zzanm.zzaun.zza(zzpr);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onUnifiedNativeAdLoadedListener.onUnifiedNativeAdLoaded().", e);
        }
    }

    private final zzvq zzcx() {
        return (this.zzanm.zzaue == null || !this.zzanm.zzaue.zzcto) ? null : this.zzanm.zzaue.zzdcj;
    }

    private final void zzdy() {
        zzaan zzds = zzds();
        if (zzds != null) {
            zzds.zzmd();
        }
    }

    public final String getAdUnitId() {
        return this.zzanm.zzatx;
    }

    public final String getUuid() {
        return this.zzarn;
    }

    public final void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void zza(zzahe zzahe, zzov zzov) {
        String str = "Exception occurred while getting an ad response";
        if (zzahe.zzaud != null) {
            this.zzanm.zzaud = zzahe.zzaud;
        }
        if (zzahe.errorCode != -2) {
            zzaij.zzdfn.post(new zzbc(this, zzahe));
            return;
        }
        int i = zzahe.zzcvm.zzctg;
        int i2 = 0;
        if (i == 1) {
            this.zzanm.zzavb = 0;
            zzbu zzbu = this.zzanm;
            zzbt.zzek();
            zzbu.zzauc = zzzm.zza(this.zzanm.zzaiq, this, zzahe, this.zzanm.zzaty, null, this.zzanu, this, zzov);
            String str2 = "AdRenderer: ";
            String valueOf = String.valueOf(this.zzanm.zzauc.getClass().getName());
            zzaky.zzby(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(zzahe.zzdcw.body).getJSONArray("slots");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i3).getJSONArray("ads");
                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                    jSONArray.put(jSONArray3.get(i4));
                }
            }
            zzdy();
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < i; i5++) {
                arrayList.add(zzaid.zza(newFixedThreadPool, new zzbd(this, i5, jSONArray, i, zzahe)));
            }
            while (i2 < arrayList.size()) {
                try {
                    zzaij.zzdfn.post(new zzbe(this, (zzpx) ((zzalt) arrayList.get(i2)).get(((Long) zzlc.zzio().zzd(zzoi.zzbrg)).longValue(), TimeUnit.MILLISECONDS), i2, arrayList));
                } catch (InterruptedException e) {
                    zzaky.zzc(str, e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e2) {
                    zzaky.zzc(str, e2);
                }
                i2++;
            }
        } catch (JSONException e3) {
            zzaky.zzc("Malformed native ad response", e3);
            zzi(0);
        }
    }

    public final void zza(zzpb zzpb) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void zza(zzpt zzpt) {
        zzaof zzaof = this.zzark;
        if (zzaof != null) {
            zzaof.zzb(zzpt);
        }
    }

    public final void zza(zzpv zzpv) {
        if (this.zzanm.zzaue.zzdch != null) {
            zzbt.zzep().zzqa().zza(this.zzanm.zzaud, this.zzanm.zzaue, new zzfx(zzpv), null);
        }
    }

    public final void zza(zzyx zzyx) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:85:0x01db in {8, 9, 12, 13, 16, 17, 24, 25, 28, 29, 35, 36, 39, 40, 46, 48, 50, 53, 57, 58, 62, 67, 71, 78, 80, 82, 84} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    protected final boolean zza(com.google.android.gms.internal.zzahd r26, com.google.android.gms.internal.zzahd r27) {
        /*
        r25 = this;
        r7 = r25;
        r8 = r27;
        r0 = 0;
        r7.zzd(r0);
        r1 = r7.zzanm;
        r1 = r1.zzfo();
        if (r1 == 0) goto L_0x01d3;
        r1 = r8.zzcto;
        r2 = 0;
        if (r1 == 0) goto L_0x0152;
        r25.zzdy();
        r1 = r8.zzcjf;	 Catch:{ RemoteException -> 0x014b }
        if (r1 == 0) goto L_0x0024;	 Catch:{ RemoteException -> 0x014b }
        r1 = r8.zzcjf;	 Catch:{ RemoteException -> 0x014b }
        r1 = r1.zzmp();	 Catch:{ RemoteException -> 0x014b }
        r5 = r1;	 Catch:{ RemoteException -> 0x014b }
        goto L_0x0025;	 Catch:{ RemoteException -> 0x014b }
        r5 = r0;	 Catch:{ RemoteException -> 0x014b }
        r1 = r8.zzcjf;	 Catch:{ RemoteException -> 0x014b }
        if (r1 == 0) goto L_0x0031;	 Catch:{ RemoteException -> 0x014b }
        r1 = r8.zzcjf;	 Catch:{ RemoteException -> 0x014b }
        r1 = r1.zzmq();	 Catch:{ RemoteException -> 0x014b }
        r6 = r1;	 Catch:{ RemoteException -> 0x014b }
        goto L_0x0032;	 Catch:{ RemoteException -> 0x014b }
        r6 = r0;	 Catch:{ RemoteException -> 0x014b }
        r1 = r8.zzcjf;	 Catch:{ RemoteException -> 0x014b }
        if (r1 == 0) goto L_0x003d;	 Catch:{ RemoteException -> 0x014b }
        r1 = r8.zzcjf;	 Catch:{ RemoteException -> 0x014b }
        r1 = r1.zzmu();	 Catch:{ RemoteException -> 0x014b }
        goto L_0x003e;	 Catch:{ RemoteException -> 0x014b }
        r1 = r0;	 Catch:{ RemoteException -> 0x014b }
        r3 = com.google.android.gms.ads.internal.zzd.zzc(r27);	 Catch:{ RemoteException -> 0x014b }
        if (r5 == 0) goto L_0x00b4;	 Catch:{ RemoteException -> 0x014b }
        r4 = r7.zzanm;	 Catch:{ RemoteException -> 0x014b }
        r4 = r4.zzaul;	 Catch:{ RemoteException -> 0x014b }
        if (r4 == 0) goto L_0x00b4;	 Catch:{ RemoteException -> 0x014b }
        r6 = new com.google.android.gms.internal.zzpk;	 Catch:{ RemoteException -> 0x014b }
        r10 = r5.getHeadline();	 Catch:{ RemoteException -> 0x014b }
        r11 = r5.getImages();	 Catch:{ RemoteException -> 0x014b }
        r12 = r5.getBody();	 Catch:{ RemoteException -> 0x014b }
        r1 = r5.zzkc();	 Catch:{ RemoteException -> 0x014b }
        if (r1 == 0) goto L_0x0064;	 Catch:{ RemoteException -> 0x014b }
        r1 = r5.zzkc();	 Catch:{ RemoteException -> 0x014b }
        r13 = r1;	 Catch:{ RemoteException -> 0x014b }
        goto L_0x0065;	 Catch:{ RemoteException -> 0x014b }
        r13 = r0;	 Catch:{ RemoteException -> 0x014b }
        r14 = r5.getCallToAction();	 Catch:{ RemoteException -> 0x014b }
        r15 = r5.getStarRating();	 Catch:{ RemoteException -> 0x014b }
        r17 = r5.getStore();	 Catch:{ RemoteException -> 0x014b }
        r18 = r5.getPrice();	 Catch:{ RemoteException -> 0x014b }
        r19 = 0;	 Catch:{ RemoteException -> 0x014b }
        r20 = r5.getExtras();	 Catch:{ RemoteException -> 0x014b }
        r21 = r5.getVideoController();	 Catch:{ RemoteException -> 0x014b }
        r1 = r5.zzmx();	 Catch:{ RemoteException -> 0x014b }
        if (r1 == 0) goto L_0x008f;	 Catch:{ RemoteException -> 0x014b }
        r0 = r5.zzmx();	 Catch:{ RemoteException -> 0x014b }
        r0 = com.google.android.gms.dynamic.zzn.zzy(r0);	 Catch:{ RemoteException -> 0x014b }
        r0 = (android.view.View) r0;	 Catch:{ RemoteException -> 0x014b }
        r22 = r0;	 Catch:{ RemoteException -> 0x014b }
        r23 = r5.zzkh();	 Catch:{ RemoteException -> 0x014b }
        r9 = r6;	 Catch:{ RemoteException -> 0x014b }
        r24 = r3;	 Catch:{ RemoteException -> 0x014b }
        r9.<init>(r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ RemoteException -> 0x014b }
        r0 = new com.google.android.gms.internal.zzpu;	 Catch:{ RemoteException -> 0x014b }
        r1 = r7.zzanm;	 Catch:{ RemoteException -> 0x014b }
        r2 = r1.zzaiq;	 Catch:{ RemoteException -> 0x014b }
        r1 = r7.zzanm;	 Catch:{ RemoteException -> 0x014b }
        r4 = r1.zzaty;	 Catch:{ RemoteException -> 0x014b }
        r1 = r0;	 Catch:{ RemoteException -> 0x014b }
        r3 = r25;	 Catch:{ RemoteException -> 0x014b }
        r9 = r6;	 Catch:{ RemoteException -> 0x014b }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RemoteException -> 0x014b }
        r9.zzb(r0);	 Catch:{ RemoteException -> 0x014b }
        r7.zza(r9);	 Catch:{ RemoteException -> 0x014b }
        goto L_0x01c5;	 Catch:{ RemoteException -> 0x014b }
        if (r6 == 0) goto L_0x0120;	 Catch:{ RemoteException -> 0x014b }
        r4 = r7.zzanm;	 Catch:{ RemoteException -> 0x014b }
        r4 = r4.zzaum;	 Catch:{ RemoteException -> 0x014b }
        if (r4 == 0) goto L_0x0120;	 Catch:{ RemoteException -> 0x014b }
        r5 = new com.google.android.gms.internal.zzpm;	 Catch:{ RemoteException -> 0x014b }
        r10 = r6.getHeadline();	 Catch:{ RemoteException -> 0x014b }
        r11 = r6.getImages();	 Catch:{ RemoteException -> 0x014b }
        r12 = r6.getBody();	 Catch:{ RemoteException -> 0x014b }
        r1 = r6.zzkj();	 Catch:{ RemoteException -> 0x014b }
        if (r1 == 0) goto L_0x00d6;	 Catch:{ RemoteException -> 0x014b }
        r1 = r6.zzkj();	 Catch:{ RemoteException -> 0x014b }
        r13 = r1;	 Catch:{ RemoteException -> 0x014b }
        goto L_0x00d7;	 Catch:{ RemoteException -> 0x014b }
        r13 = r0;	 Catch:{ RemoteException -> 0x014b }
        r14 = r6.getCallToAction();	 Catch:{ RemoteException -> 0x014b }
        r15 = r6.getAdvertiser();	 Catch:{ RemoteException -> 0x014b }
        r16 = 0;	 Catch:{ RemoteException -> 0x014b }
        r17 = r6.getExtras();	 Catch:{ RemoteException -> 0x014b }
        r18 = r6.getVideoController();	 Catch:{ RemoteException -> 0x014b }
        r1 = r6.zzmx();	 Catch:{ RemoteException -> 0x014b }
        if (r1 == 0) goto L_0x00f9;	 Catch:{ RemoteException -> 0x014b }
        r0 = r6.zzmx();	 Catch:{ RemoteException -> 0x014b }
        r0 = com.google.android.gms.dynamic.zzn.zzy(r0);	 Catch:{ RemoteException -> 0x014b }
        r0 = (android.view.View) r0;	 Catch:{ RemoteException -> 0x014b }
        r19 = r0;	 Catch:{ RemoteException -> 0x014b }
        r20 = r6.zzkh();	 Catch:{ RemoteException -> 0x014b }
        r9 = r5;	 Catch:{ RemoteException -> 0x014b }
        r21 = r3;	 Catch:{ RemoteException -> 0x014b }
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ RemoteException -> 0x014b }
        r0 = new com.google.android.gms.internal.zzpu;	 Catch:{ RemoteException -> 0x014b }
        r1 = r7.zzanm;	 Catch:{ RemoteException -> 0x014b }
        r2 = r1.zzaiq;	 Catch:{ RemoteException -> 0x014b }
        r1 = r7.zzanm;	 Catch:{ RemoteException -> 0x014b }
        r4 = r1.zzaty;	 Catch:{ RemoteException -> 0x014b }
        r1 = r0;	 Catch:{ RemoteException -> 0x014b }
        r3 = r25;	 Catch:{ RemoteException -> 0x014b }
        r9 = r5;	 Catch:{ RemoteException -> 0x014b }
        r5 = r6;	 Catch:{ RemoteException -> 0x014b }
        r6 = r9;	 Catch:{ RemoteException -> 0x014b }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RemoteException -> 0x014b }
        r9.zzb(r0);	 Catch:{ RemoteException -> 0x014b }
        r7.zza(r9);	 Catch:{ RemoteException -> 0x014b }
        goto L_0x01c5;	 Catch:{ RemoteException -> 0x014b }
        if (r1 == 0) goto L_0x0142;	 Catch:{ RemoteException -> 0x014b }
        r0 = r7.zzanm;	 Catch:{ RemoteException -> 0x014b }
        r0 = r0.zzaup;	 Catch:{ RemoteException -> 0x014b }
        if (r0 == 0) goto L_0x0142;	 Catch:{ RemoteException -> 0x014b }
        r0 = r7.zzanm;	 Catch:{ RemoteException -> 0x014b }
        r0 = r0.zzaup;	 Catch:{ RemoteException -> 0x014b }
        r3 = r1.getCustomTemplateId();	 Catch:{ RemoteException -> 0x014b }
        r0 = r0.get(r3);	 Catch:{ RemoteException -> 0x014b }
        if (r0 == 0) goto L_0x0142;	 Catch:{ RemoteException -> 0x014b }
        r0 = com.google.android.gms.internal.zzaij.zzdfn;	 Catch:{ RemoteException -> 0x014b }
        r2 = new com.google.android.gms.ads.internal.zzbi;	 Catch:{ RemoteException -> 0x014b }
        r2.<init>(r7, r1);	 Catch:{ RemoteException -> 0x014b }
        r0.post(r2);	 Catch:{ RemoteException -> 0x014b }
        goto L_0x01c5;	 Catch:{ RemoteException -> 0x014b }
        r0 = "No matching mapper/listener for retrieved native ad template.";	 Catch:{ RemoteException -> 0x014b }
        com.google.android.gms.internal.zzaky.zzcz(r0);	 Catch:{ RemoteException -> 0x014b }
        r7.zzi(r2);	 Catch:{ RemoteException -> 0x014b }
        return r2;
        r0 = move-exception;
        r1 = "Failed to get native ad mapper";
        com.google.android.gms.internal.zzaky.zzc(r1, r0);
        goto L_0x01c5;
        r0 = r8.zzdcp;
        r1 = r7.zzari;
        if (r1 == 0) goto L_0x015e;
        r1 = r7.zzarj;
        r1.set(r0);
        goto L_0x01c5;
        r1 = r0 instanceof com.google.android.gms.internal.zzpm;
        if (r1 == 0) goto L_0x0172;
        r3 = r7.zzanm;
        r3 = r3.zzaun;
        if (r3 == 0) goto L_0x0172;
        r0 = r8.zzdcp;
        r0 = zza(r0);
        r7.zza(r0);
        goto L_0x01c5;
        if (r1 == 0) goto L_0x0182;
        r1 = r7.zzanm;
        r1 = r1.zzaum;
        if (r1 == 0) goto L_0x0182;
        r0 = r8.zzdcp;
        r0 = (com.google.android.gms.internal.zzpm) r0;
        r7.zza(r0);
        goto L_0x01c5;
        r1 = r0 instanceof com.google.android.gms.internal.zzpk;
        if (r1 == 0) goto L_0x018d;
        r3 = r7.zzanm;
        r3 = r3.zzaun;
        if (r3 == 0) goto L_0x018d;
        goto L_0x0168;
        if (r1 == 0) goto L_0x019d;
        r1 = r7.zzanm;
        r1 = r1.zzaul;
        if (r1 == 0) goto L_0x019d;
        r0 = r8.zzdcp;
        r0 = (com.google.android.gms.internal.zzpk) r0;
        r7.zza(r0);
        goto L_0x01c5;
        r1 = r0 instanceof com.google.android.gms.internal.zzpo;
        if (r1 == 0) goto L_0x01ca;
        r1 = r7.zzanm;
        r1 = r1.zzaup;
        if (r1 == 0) goto L_0x01ca;
        r1 = r7.zzanm;
        r1 = r1.zzaup;
        r0 = (com.google.android.gms.internal.zzpo) r0;
        r3 = r0.getCustomTemplateId();
        r1 = r1.get(r3);
        if (r1 == 0) goto L_0x01ca;
        r0 = r0.getCustomTemplateId();
        r1 = com.google.android.gms.internal.zzaij.zzdfn;
        r2 = new com.google.android.gms.ads.internal.zzbh;
        r2.<init>(r7, r0, r8);
        r1.post(r2);
        r0 = super.zza(r26, r27);
        return r0;
        r0 = "No matching listener for retrieved native ad template.";
        com.google.android.gms.internal.zzaky.zzcz(r0);
        r7.zzi(r2);
        return r2;
        r0 = new java.lang.IllegalStateException;
        r1 = "Native ad DOES NOT have custom rendering mode.";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzbb.zza(com.google.android.gms.internal.zzahd, com.google.android.gms.internal.zzahd):boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zzkk zzkk, zzahd zzahd, boolean z) {
        return this.zzanl.zzea();
    }

    public final boolean zza(zzkk zzkk, zzov zzov) {
        try {
            zzdr();
            return super.zza(zzkk, zzov, this.zzarl);
        } catch (Exception e) {
            if (zzaky.zzae(4)) {
                Log.i("Ads", "Error initializing webview.", e);
            }
            return false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzbw() {
        zzc(false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzc(int i, boolean z) {
        zzdy();
        super.zzc(i, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzc(boolean z) {
        super.zzc(z);
        if (this.zzany) {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbst)).booleanValue()) {
                zzdu();
            }
        }
    }

    public final void zzch() {
        zzahd zzahd = this.zzanm.zzaue;
        if (zzahd.zzcjf == null) {
            super.zzch();
            return;
        }
        try {
            zzwi zzwi = zzahd.zzcjf;
            zzmm zzmm = null;
            zzwr zzmp = zzwi.zzmp();
            if (zzmp != null) {
                zzmm = zzmp.getVideoController();
            } else {
                zzwu zzmq = zzwi.zzmq();
                if (zzmq != null) {
                    zzmm = zzmq.getVideoController();
                } else {
                    zzro zzmu = zzwi.zzmu();
                    if (zzmu != null) {
                        zzmm = zzmu.getVideoController();
                    }
                }
            }
            if (zzmm != null) {
                zzmp zzis = zzmm.zzis();
                if (zzis != null) {
                    zzis.onVideoEnd();
                }
            }
        } catch (RemoteException e) {
            zzaky.zzc("Unable to call onVideoEnd()", e);
        }
    }

    public final void zzci() {
        if (this.zzanm.zzaue != null) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzanm.zzaue.zzcjg)) {
                zzby();
                return;
            }
        }
        super.zzci();
    }

    public final void zzcn() {
        if (this.zzanm.zzaue != null) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzanm.zzaue.zzcjg)) {
                zzbx();
                return;
            }
        }
        super.zzcn();
    }

    public final void zzcu() {
        zzaof zzaof = this.zzark;
        if (zzaof != null) {
            zzaof.destroy();
            this.zzark = null;
        }
    }

    public final boolean zzcv() {
        return zzcx() != null ? zzcx().zzcii : false;
    }

    public final boolean zzcw() {
        return zzcx() != null ? zzcx().zzcij : false;
    }

    public final void zzd(List<String> list) {
        zzbq.zzgn("setNativeTemplates must be called on the main UI thread.");
        this.zzanm.zzauy = list;
    }

    /* Access modifiers changed, original: final */
    public final void zzdr() {
        synchronized (this.mLock) {
            zzahw.v("Initializing webview native ads utills");
            this.zzarm = new zzaar(this.zzanm.zzaiq, this, this.zzarn, this.zzanm.zzaty, this.zzanm.zzatz);
        }
    }

    public final zzaan zzds() {
        zzaan zzaan;
        synchronized (this.mLock) {
            zzaan = this.zzarm;
        }
        return zzaan;
    }

    /* Access modifiers changed, original: protected|final */
    public final Future<zzpx> zzdt() {
        return this.zzarj;
    }

    public final void zzdu() {
        if (this.zzanm.zzaue == null || this.zzark == null) {
            this.zzany = true;
            zzaky.zzcz("Request to enable ActiveView before adState is available.");
            return;
        }
        zzbt.zzep().zzqa().zza(this.zzanm.zzaud, this.zzanm.zzaue, this.zzark.getView(), this.zzark);
        this.zzany = false;
    }

    public final void zzdv() {
        this.zzany = false;
        if (this.zzanm.zzaue == null || this.zzark == null) {
            zzaky.zzcz("Request to enable ActiveView before adState is available.");
        } else {
            zzbt.zzep().zzqa().zzh(this.zzanm.zzaue);
        }
    }

    public final jh<String, zzsb> zzdw() {
        zzbq.zzgn("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.zzanm.zzaup;
    }

    public final void zzdx() {
        zzaof zzaof = this.zzark;
        if (zzaof != null && zzaof.zzth() != null && this.zzanm.zzauq != null && this.zzanm.zzauq.zzbzn != null) {
            this.zzark.zzth().zzb(this.zzanm.zzauq.zzbzn);
        }
    }

    public final void zze(zzaof zzaof) {
        this.zzark = zzaof;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzi(int i) {
        zzc(i, false);
    }

    public final void zzj(int i) {
        zzbq.zzgn("setMaxNumberOfAds must be called on the main UI thread.");
        this.zzarl = i;
    }

    public final zzry zzs(String str) {
        zzbq.zzgn("getOnCustomClickListener must be called on the main UI thread.");
        return this.zzanm.zzauo == null ? null : (zzry) this.zzanm.zzauo.get(str);
    }
}
