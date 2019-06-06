package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@zzabh
public final class zzxc extends zzwj {
    private final MediationAdapter zzcjz;
    private zzxd zzcka;

    public zzxc(MediationAdapter mediationAdapter) {
        this.zzcjz = mediationAdapter;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0064 in {2, 3, 11, 12, 17, 18, 21} preds:[]
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
    private final android.os.Bundle zza(java.lang.String r5, com.google.android.gms.internal.zzkk r6, java.lang.String r7) {
        /*
        r4 = this;
        r0 = java.lang.String.valueOf(r5);
        r1 = r0.length();
        r2 = "Server parameters: ";
        if (r1 == 0) goto L_0x0011;
        r0 = r2.concat(r0);
        goto L_0x0016;
        r0 = new java.lang.String;
        r0.<init>(r2);
        com.google.android.gms.internal.zzaky.zzcz(r0);
        r0 = new android.os.Bundle;	 Catch:{ Throwable -> 0x0058 }
        r0.<init>();	 Catch:{ Throwable -> 0x0058 }
        if (r5 == 0) goto L_0x0042;	 Catch:{ Throwable -> 0x0058 }
        r0 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0058 }
        r0.<init>(r5);	 Catch:{ Throwable -> 0x0058 }
        r5 = new android.os.Bundle;	 Catch:{ Throwable -> 0x0058 }
        r5.<init>();	 Catch:{ Throwable -> 0x0058 }
        r1 = r0.keys();	 Catch:{ Throwable -> 0x0058 }
        r2 = r1.hasNext();	 Catch:{ Throwable -> 0x0058 }
        if (r2 == 0) goto L_0x0043;	 Catch:{ Throwable -> 0x0058 }
        r2 = r1.next();	 Catch:{ Throwable -> 0x0058 }
        r2 = (java.lang.String) r2;	 Catch:{ Throwable -> 0x0058 }
        r3 = r0.getString(r2);	 Catch:{ Throwable -> 0x0058 }
        r5.putString(r2, r3);	 Catch:{ Throwable -> 0x0058 }
        goto L_0x002e;	 Catch:{ Throwable -> 0x0058 }
        r5 = r0;	 Catch:{ Throwable -> 0x0058 }
        r0 = r4.zzcjz;	 Catch:{ Throwable -> 0x0058 }
        r0 = r0 instanceof com.google.ads.mediation.admob.AdMobAdapter;	 Catch:{ Throwable -> 0x0058 }
        if (r0 == 0) goto L_0x0057;	 Catch:{ Throwable -> 0x0058 }
        r0 = "adJson";	 Catch:{ Throwable -> 0x0058 }
        r5.putString(r0, r7);	 Catch:{ Throwable -> 0x0058 }
        if (r6 == 0) goto L_0x0057;	 Catch:{ Throwable -> 0x0058 }
        r7 = "tagForChildDirectedTreatment";	 Catch:{ Throwable -> 0x0058 }
        r6 = r6.zzbgz;	 Catch:{ Throwable -> 0x0058 }
        r5.putInt(r7, r6);	 Catch:{ Throwable -> 0x0058 }
        return r5;
        r5 = move-exception;
        r6 = "Could not get Server Parameters Bundle.";
        com.google.android.gms.internal.zzaky.zzc(r6, r5);
        r5 = new android.os.RemoteException;
        r5.<init>();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzxc.zza(java.lang.String, com.google.android.gms.internal.zzkk, java.lang.String):android.os.Bundle");
    }

    private static boolean zzm(zzkk zzkk) {
        if (!zzkk.zzbgy) {
            zzlc.zzij();
            if (!zzako.zzrz()) {
                return false;
            }
        }
        return true;
    }

    public final void destroy() {
        try {
            this.zzcjz.onDestroy();
        } catch (Throwable th) {
            zzaky.zzc("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof zzaqk) {
            return ((zzaqk) mediationAdapter).getInterstitialAdapterInfo();
        }
        String str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public final zzmm getVideoController() {
        MediationAdapter mediationAdapter = this.zzcjz;
        if (!(mediationAdapter instanceof zzb)) {
            return null;
        }
        try {
            return ((zzb) mediationAdapter).getVideoController();
        } catch (Throwable th) {
            zzaky.zzc("Could not get video controller.", th);
            return null;
        }
    }

    public final IObjectWrapper getView() {
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof MediationBannerAdapter) {
            try {
                return zzn.zzz(((MediationBannerAdapter) mediationAdapter).getBannerView());
            } catch (Throwable th) {
                zzaky.zzc("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() {
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof MediationRewardedVideoAdAdapter) {
            zzaky.zzby("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.zzcjz).isInitialized();
            } catch (Throwable th) {
                zzaky.zzc("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void pause() {
        try {
            this.zzcjz.onPause();
        } catch (Throwable th) {
            zzaky.zzc("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void resume() {
        try {
            this.zzcjz.onResume();
        } catch (Throwable th) {
            zzaky.zzc("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void setImmersiveMode(boolean z) {
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) mediationAdapter).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzaky.zzc("Could not set immersive mode.", th);
                return;
            }
        }
        String str = "MediationAdapter is not an OnImmersiveModeUpdatedListener: ";
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzaky.zzcy(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final void showInterstitial() {
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof MediationInterstitialAdapter) {
            zzaky.zzby("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zzcjz).showInterstitial();
            } catch (Throwable th) {
                zzaky.zzc("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void showVideo() {
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof MediationRewardedVideoAdAdapter) {
            zzaky.zzby("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.zzcjz).showVideo();
            } catch (Throwable th) {
                zzaky.zzc("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0070 in {4, 5, 7, 13, 15, 18} preds:[]
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
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.zzafz r6, java.util.List<java.lang.String> r7) {
        /*
        r4 = this;
        r0 = r4.zzcjz;
        r1 = r0 instanceof com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
        if (r1 != 0) goto L_0x002e;
        r5 = "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ";
        r6 = r0.getClass();
        r6 = r6.getCanonicalName();
        r6 = java.lang.String.valueOf(r6);
        r7 = r6.length();
        if (r7 == 0) goto L_0x001f;
        r5 = r5.concat(r6);
        goto L_0x0025;
        r6 = new java.lang.String;
        r6.<init>(r5);
        r5 = r6;
        com.google.android.gms.internal.zzaky.zzcz(r5);
        r5 = new android.os.RemoteException;
        r5.<init>();
        throw r5;
        r0 = "Initialize rewarded video adapter.";
        com.google.android.gms.internal.zzaky.zzby(r0);
        r0 = r4.zzcjz;	 Catch:{ Throwable -> 0x0064 }
        r0 = (com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter) r0;	 Catch:{ Throwable -> 0x0064 }
        r1 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x0064 }
        r1.<init>();	 Catch:{ Throwable -> 0x0064 }
        r7 = r7.iterator();	 Catch:{ Throwable -> 0x0064 }
        r2 = r7.hasNext();	 Catch:{ Throwable -> 0x0064 }
        if (r2 == 0) goto L_0x0055;	 Catch:{ Throwable -> 0x0064 }
        r2 = r7.next();	 Catch:{ Throwable -> 0x0064 }
        r2 = (java.lang.String) r2;	 Catch:{ Throwable -> 0x0064 }
        r3 = 0;	 Catch:{ Throwable -> 0x0064 }
        r2 = r4.zza(r2, r3, r3);	 Catch:{ Throwable -> 0x0064 }
        r1.add(r2);	 Catch:{ Throwable -> 0x0064 }
        goto L_0x0040;	 Catch:{ Throwable -> 0x0064 }
        r5 = com.google.android.gms.dynamic.zzn.zzy(r5);	 Catch:{ Throwable -> 0x0064 }
        r5 = (android.content.Context) r5;	 Catch:{ Throwable -> 0x0064 }
        r7 = new com.google.android.gms.internal.zzagc;	 Catch:{ Throwable -> 0x0064 }
        r7.<init>(r6);	 Catch:{ Throwable -> 0x0064 }
        r0.initialize(r5, r7, r1);	 Catch:{ Throwable -> 0x0064 }
        return;
        r5 = move-exception;
        r6 = "Could not initialize rewarded video adapter.";
        com.google.android.gms.internal.zzaky.zzc(r6, r5);
        r5 = new android.os.RemoteException;
        r5.<init>();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzxc.zza(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.zzafz, java.util.List):void");
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, zzafz zzafz, String str2) {
        zzkk zzkk2 = zzkk;
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof MediationRewardedVideoAdAdapter) {
            zzaky.zzby("Initialize rewarded video adapter.");
            try {
                Bundle bundle;
                MediationAdRequest mediationAdRequest;
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzcjz;
                Bundle zza = zza(str2, zzkk2, null);
                if (zzkk2 != null) {
                    zzxb zzxb = new zzxb(zzkk2.zzbgv == -1 ? null : new Date(zzkk2.zzbgv), zzkk2.zzbgw, zzkk2.zzbgx != null ? new HashSet(zzkk2.zzbgx) : null, zzkk2.zzbhd, zzm(zzkk), zzkk2.zzbgz, zzkk2.zzbhk);
                    bundle = zzkk2.zzbhf != null ? zzkk2.zzbhf.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    mediationAdRequest = zzxb;
                } else {
                    mediationAdRequest = null;
                    bundle = mediationAdRequest;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) zzn.zzy(iObjectWrapper), mediationAdRequest, str, new zzagc(zzafz), zza, bundle);
            } catch (Throwable th) {
                zzaky.zzc("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, zzwl zzwl) {
        zza(iObjectWrapper, zzkk, str, null, zzwl);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, String str2, zzwl zzwl) {
        zzkk zzkk2 = zzkk;
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof MediationInterstitialAdapter) {
            zzaky.zzby("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzcjz;
                Bundle bundle = null;
                zzxb zzxb = new zzxb(zzkk2.zzbgv == -1 ? null : new Date(zzkk2.zzbgv), zzkk2.zzbgw, zzkk2.zzbgx != null ? new HashSet(zzkk2.zzbgx) : null, zzkk2.zzbhd, zzm(zzkk), zzkk2.zzbgz, zzkk2.zzbhk);
                if (zzkk2.zzbhf != null) {
                    bundle = zzkk2.zzbhf.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) zzn.zzy(iObjectWrapper), new zzxd(zzwl), zza(str, zzkk2, str2), zzxb, bundle);
            } catch (Throwable th) {
                zzaky.zzc("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, String str2, zzwl zzwl, zzqh zzqh, List<String> list) {
        zzkk zzkk2 = zzkk;
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationAdapter;
                Bundle bundle = null;
                zzxg zzxg = new zzxg(zzkk2.zzbgv == -1 ? null : new Date(zzkk2.zzbgv), zzkk2.zzbgw, zzkk2.zzbgx != null ? new HashSet(zzkk2.zzbgx) : null, zzkk2.zzbhd, zzm(zzkk), zzkk2.zzbgz, zzqh, list, zzkk2.zzbhk);
                if (zzkk2.zzbhf != null) {
                    bundle = zzkk2.zzbhf.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.zzcka = new zzxd(zzwl);
                mediationNativeAdapter.requestNativeAd((Context) zzn.zzy(iObjectWrapper), this.zzcka, zza(str, zzkk2, str2), zzxg, bundle);
            } catch (Throwable th) {
                zzaky.zzc("Could not request native ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzko zzko, zzkk zzkk, String str, zzwl zzwl) {
        zza(iObjectWrapper, zzko, zzkk, str, null, zzwl);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzko zzko, zzkk zzkk, String str, String str2, zzwl zzwl) {
        zzko zzko2 = zzko;
        zzkk zzkk2 = zzkk;
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof MediationBannerAdapter) {
            zzaky.zzby("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzcjz;
                Bundle bundle = null;
                zzxb zzxb = new zzxb(zzkk2.zzbgv == -1 ? null : new Date(zzkk2.zzbgv), zzkk2.zzbgw, zzkk2.zzbgx != null ? new HashSet(zzkk2.zzbgx) : null, zzkk2.zzbhd, zzm(zzkk), zzkk2.zzbgz, zzkk2.zzbhk);
                if (zzkk2.zzbhf != null) {
                    bundle = zzkk2.zzbhf.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) zzn.zzy(iObjectWrapper), new zzxd(zzwl), zza(str, zzkk2, str2), com.google.android.gms.ads.zzb.zza(zzko2.width, zzko2.height, zzko2.zzbia), zzxb, bundle);
            } catch (Throwable th) {
                zzaky.zzc("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(zzkk zzkk, String str, String str2) {
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof MediationRewardedVideoAdAdapter) {
            zzaky.zzby("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzcjz;
                Bundle bundle = null;
                zzxb zzxb = new zzxb(zzkk.zzbgv == -1 ? null : new Date(zzkk.zzbgv), zzkk.zzbgw, zzkk.zzbgx != null ? new HashSet(zzkk.zzbgx) : null, zzkk.zzbhd, zzm(zzkk), zzkk.zzbgz, zzkk.zzbhk);
                if (zzkk.zzbhf != null) {
                    bundle = zzkk.zzbhf.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(zzxb, zza(str, zzkk, str2), bundle);
            } catch (Throwable th) {
                zzaky.zzc("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            str = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaky.zzcz(str.length() != 0 ? str3.concat(str) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zzc(zzkk zzkk, String str) {
        zza(zzkk, str, null);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        try {
            ((OnContextChangedListener) this.zzcjz).onContextChanged((Context) zzn.zzy(iObjectWrapper));
        } catch (Throwable th) {
            zzaky.zza("Could not inform adapter of changed context", th);
        }
    }

    public final zzwr zzmp() {
        NativeAdMapper zzmy = this.zzcka.zzmy();
        return zzmy instanceof NativeAppInstallAdMapper ? new zzxe((NativeAppInstallAdMapper) zzmy) : null;
    }

    public final zzwu zzmq() {
        NativeAdMapper zzmy = this.zzcka.zzmy();
        return zzmy instanceof NativeContentAdMapper ? new zzxf((NativeContentAdMapper) zzmy) : null;
    }

    public final Bundle zzmr() {
        MediationAdapter mediationAdapter = this.zzcjz;
        if (mediationAdapter instanceof zzaqj) {
            return ((zzaqj) mediationAdapter).zzmr();
        }
        String str = "MediationAdapter is not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public final Bundle zzms() {
        return new Bundle();
    }

    public final boolean zzmt() {
        return this.zzcjz instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final zzro zzmu() {
        NativeCustomTemplateAd zzna = this.zzcka.zzna();
        return zzna instanceof zzrr ? ((zzrr) zzna).zzkx() : null;
    }

    public final zzwx zzmv() {
        zza zzmz = this.zzcka.zzmz();
        return zzmz != null ? new zzxw(zzmz) : null;
    }
}
