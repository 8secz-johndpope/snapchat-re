package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import defpackage.bbe;
import defpackage.bbh;
import defpackage.bbi;
import java.util.List;

@zzabh
public final class zzxh<NETWORK_EXTRAS extends bbi, SERVER_PARAMETERS extends bbh> extends zzwj {
    private final bbe<NETWORK_EXTRAS, SERVER_PARAMETERS> zzcki;
    private final NETWORK_EXTRAS zzckj;

    public zzxh(bbe<NETWORK_EXTRAS, SERVER_PARAMETERS> bbe, NETWORK_EXTRAS network_extras) {
        this.zzcki = bbe;
        this.zzckj = network_extras;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x004e in {5, 6, 9, 10, 13} preds:[]
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
    private final SERVER_PARAMETERS zza(java.lang.String r3, int r4, java.lang.String r5) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0028;
        r4 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0042 }
        r4.<init>(r3);	 Catch:{ Throwable -> 0x0042 }
        r3 = new java.util.HashMap;	 Catch:{ Throwable -> 0x0042 }
        r5 = r4.length();	 Catch:{ Throwable -> 0x0042 }
        r3.<init>(r5);	 Catch:{ Throwable -> 0x0042 }
        r5 = r4.keys();	 Catch:{ Throwable -> 0x0042 }
        r0 = r5.hasNext();	 Catch:{ Throwable -> 0x0042 }
        if (r0 == 0) goto L_0x002e;	 Catch:{ Throwable -> 0x0042 }
        r0 = r5.next();	 Catch:{ Throwable -> 0x0042 }
        r0 = (java.lang.String) r0;	 Catch:{ Throwable -> 0x0042 }
        r1 = r4.getString(r0);	 Catch:{ Throwable -> 0x0042 }
        r3.put(r0, r1);	 Catch:{ Throwable -> 0x0042 }
        goto L_0x0014;	 Catch:{ Throwable -> 0x0042 }
        r3 = new java.util.HashMap;	 Catch:{ Throwable -> 0x0042 }
        r4 = 0;	 Catch:{ Throwable -> 0x0042 }
        r3.<init>(r4);	 Catch:{ Throwable -> 0x0042 }
        r4 = r2.zzcki;	 Catch:{ Throwable -> 0x0042 }
        r4 = r4.getServerParametersType();	 Catch:{ Throwable -> 0x0042 }
        r5 = 0;	 Catch:{ Throwable -> 0x0042 }
        if (r4 == 0) goto L_0x0041;	 Catch:{ Throwable -> 0x0042 }
        r4 = r4.newInstance();	 Catch:{ Throwable -> 0x0042 }
        r5 = r4;	 Catch:{ Throwable -> 0x0042 }
        r5 = (defpackage.bbh) r5;	 Catch:{ Throwable -> 0x0042 }
        r5.a(r3);	 Catch:{ Throwable -> 0x0042 }
        return r5;
        r3 = move-exception;
        r4 = "Could not get MediationServerParameters.";
        com.google.android.gms.internal.zzaky.zzc(r4, r3);
        r3 = new android.os.RemoteException;
        r3.<init>();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzxh.zza(java.lang.String, int, java.lang.String):bbh");
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
            this.zzcki.destroy();
        } catch (Throwable th) {
            zzaky.zzc("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final zzmm getVideoController() {
        return null;
    }

    public final IObjectWrapper getView() {
        bbe bbe = this.zzcki;
        if (bbe instanceof MediationBannerAdapter) {
            try {
                return zzn.zzz(((MediationBannerAdapter) bbe).getBannerView());
            } catch (Throwable th) {
                zzaky.zzc("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(bbe.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() {
        return true;
    }

    public final void pause() {
        throw new RemoteException();
    }

    public final void resume() {
        throw new RemoteException();
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void showInterstitial() {
        bbe bbe = this.zzcki;
        if (bbe instanceof MediationInterstitialAdapter) {
            zzaky.zzby("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zzcki).showInterstitial();
            } catch (Throwable th) {
                zzaky.zzc("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(bbe.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void showVideo() {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzafz zzafz, List<String> list) {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, zzafz zzafz, String str2) {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, zzwl zzwl) {
        zza(iObjectWrapper, zzkk, str, null, zzwl);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, String str2, zzwl zzwl) {
        bbe bbe = this.zzcki;
        if (bbe instanceof MediationInterstitialAdapter) {
            zzaky.zzby("Requesting interstitial ad from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zzcki).requestInterstitialAd(new zzxi(zzwl), (Activity) zzn.zzy(iObjectWrapper), zza(str, zzkk.zzbgz, str2), zzxu.zza(zzkk, zzm(zzkk)), this.zzckj);
            } catch (Throwable th) {
                zzaky.zzc("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(bbe.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, String str2, zzwl zzwl, zzqh zzqh, List<String> list) {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzko zzko, zzkk zzkk, String str, zzwl zzwl) {
        zza(iObjectWrapper, zzko, zzkk, str, null, zzwl);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzko zzko, zzkk zzkk, String str, String str2, zzwl zzwl) {
        bbe bbe = this.zzcki;
        if (bbe instanceof MediationBannerAdapter) {
            zzaky.zzby("Requesting banner ad from adapter.");
            try {
                ((MediationBannerAdapter) this.zzcki).requestBannerAd(new zzxi(zzwl), (Activity) zzn.zzy(iObjectWrapper), zza(str, zzkk.zzbgz, str2), zzxu.zzb(zzko), zzxu.zza(zzkk, zzm(zzkk)), this.zzckj);
            } catch (Throwable th) {
                zzaky.zzc("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(bbe.getClass().getCanonicalName());
            zzaky.zzcz(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(zzkk zzkk, String str, String str2) {
    }

    public final void zzc(zzkk zzkk, String str) {
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
    }

    public final zzwr zzmp() {
        return null;
    }

    public final zzwu zzmq() {
        return null;
    }

    public final Bundle zzmr() {
        return new Bundle();
    }

    public final Bundle zzms() {
        return new Bundle();
    }

    public final boolean zzmt() {
        return false;
    }

    public final zzro zzmu() {
        return null;
    }

    public final zzwx zzmv() {
        return null;
    }
}
