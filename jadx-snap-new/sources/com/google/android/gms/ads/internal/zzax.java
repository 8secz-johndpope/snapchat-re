package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaer;
import com.google.android.gms.internal.zzafy;
import com.google.android.gms.internal.zzajc;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzmi;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzvp;
import com.google.android.gms.internal.zzvq;
import com.google.android.gms.internal.zzwi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@zzabh
public final class zzax extends zzmi {
    private static final Object sLock = new Object();
    private static zzax zzare;
    private final Context mContext;
    private final Object mLock = new Object();
    private boolean zzarf;
    private zzala zzarg;

    private zzax(Context context, zzala zzala) {
        this.mContext = context;
        this.zzarg = zzala;
        this.zzarf = false;
    }

    public static zzax zza(Context context, zzala zzala) {
        zzax zzax;
        synchronized (sLock) {
            if (zzare == null) {
                zzare = new zzax(context.getApplicationContext(), zzala);
            }
            zzax = zzare;
        }
        return zzax;
    }

    public final void initialize() {
        synchronized (sLock) {
            if (this.zzarf) {
                zzaky.zzcz("Mobile ads is initialized already.");
                return;
            }
            this.zzarf = true;
            zzoi.initialize(this.mContext);
            zzbt.zzep().zzd(this.mContext, this.zzarg);
            zzbt.zzer().initialize(this.mContext);
        }
    }

    public final void setAppMuted(boolean z) {
        zzbt.zzfj().setAppMuted(z);
    }

    public final void setAppVolume(float f) {
        zzbt.zzfj().setAppVolume(f);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zza(Runnable runnable) {
        Context context = this.mContext;
        zzbq.zzgn("Adapters must be initialized on the main thread.");
        Map zzpt = zzbt.zzep().zzqe().zzqv().zzpt();
        if (!(zzpt == null || zzpt.isEmpty())) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzaky.zzc("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            zzaer zzou = zzaer.zzou();
            if (zzou != null) {
                Collection<zzvq> values = zzpt.values();
                HashMap hashMap = new HashMap();
                IObjectWrapper zzz = zzn.zzz(context);
                for (zzvq zzvq : values) {
                    for (zzvp zzvp : zzvq.zzchv) {
                        String str = zzvp.zzchk;
                        for (String str2 : zzvp.zzchd) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                for (Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzafy zzbq = zzou.zzbq(str3);
                        if (zzbq != null) {
                            zzwi zzpc = zzbq.zzpc();
                            if (!zzpc.isInitialized()) {
                                if (zzpc.zzmt()) {
                                    zzpc.zza(zzz, zzbq.zzpd(), (List) entry.getValue());
                                    String str4 = "Initialized rewarded video mediation adapter ";
                                    String valueOf = String.valueOf(str3);
                                    zzaky.zzby(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 56);
                        stringBuilder.append("Failed to initialize rewarded video mediation adapter \"");
                        stringBuilder.append(str3);
                        stringBuilder.append("\"");
                        zzaky.zzc(stringBuilder.toString(), th2);
                    }
                }
            }
        }
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        if (!TextUtils.isEmpty(str)) {
            zzoi.initialize(this.mContext);
            int booleanValue = ((Boolean) zzlc.zzio().zzd(zzoi.zzbti)).booleanValue() | ((Boolean) zzlc.zzio().zzd(zzoi.zzboy)).booleanValue();
            Runnable runnable = null;
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzboy)).booleanValue()) {
                booleanValue = 1;
                runnable = new zzay(this, (Runnable) zzn.zzy(iObjectWrapper));
            }
            if (booleanValue != 0) {
                zzbt.zzet().zza(this.mContext, this.zzarg, str, runnable);
            }
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzaky.e("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) zzn.zzy(iObjectWrapper);
        if (context == null) {
            zzaky.e("Context is null. Failed to open debug menu.");
            return;
        }
        zzajc zzajc = new zzajc(context);
        zzajc.setAdUnitId(str);
        zzajc.zzcq(this.zzarg.zzcu);
        zzajc.showDialog();
    }

    public final float zzdp() {
        return zzbt.zzfj().zzdp();
    }

    public final boolean zzdq() {
        return zzbt.zzfj().zzdq();
    }

    public final void zzu(String str) {
        zzoi.initialize(this.mContext);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbti)).booleanValue()) {
                zzbt.zzet().zza(this.mContext, this.zzarg, str, null);
            }
        }
    }
}
