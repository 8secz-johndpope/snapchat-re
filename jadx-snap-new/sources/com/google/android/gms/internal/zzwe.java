package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import defpackage.bbe;
import defpackage.bbh;
import defpackage.bbi;
import java.util.Map;

@zzabh
public final class zzwe extends zzwg {
    private Map<Class<? extends Object>, Object> zzcjw;

    private final <NETWORK_EXTRAS extends bbi, SERVER_PARAMETERS extends bbh> zzwi zzbi(String str) {
        try {
            Class cls = Class.forName(str, false, zzwe.class.getClassLoader());
            if (bbe.class.isAssignableFrom(cls)) {
                bbe bbe = (bbe) cls.newInstance();
                return new zzxh(bbe, (bbi) this.zzcjw.get(bbe.getAdditionalParametersType()));
            } else if (MediationAdapter.class.isAssignableFrom(cls)) {
                return new zzxc((MediationAdapter) cls.newInstance());
            } else {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 64);
                stringBuilder.append("Could not instantiate mediation adapter: ");
                stringBuilder.append(str);
                stringBuilder.append(" (not a valid adapter).");
                zzaky.zzcz(stringBuilder.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return zzbj(str);
        }
    }

    private final zzwi zzbj(String str) {
        try {
            zzaky.zzby("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzxc(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new zzxc(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzxc(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new zzxh(customEventAdapter, (CustomEventExtras) this.zzcjw.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 43);
            stringBuilder.append("Could not instantiate mediation adapter: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            zzaky.zzc(stringBuilder.toString(), th);
        }
    }

    public final zzwi zzbg(String str) {
        return zzbi(str);
    }

    public final boolean zzbh(String str) {
        Object str2;
        try {
            str2 = CustomEvent.class.isAssignableFrom(Class.forName(str2, false, zzwe.class.getClassLoader()));
            return str2;
        } catch (Throwable unused) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 80);
            stringBuilder.append("Could not load custom event implementation class: ");
            stringBuilder.append(str2);
            stringBuilder.append(", assuming old implementation.");
            zzaky.zzcz(stringBuilder.toString());
            return false;
        }
    }

    public final void zzn(Map<Class<? extends Object>, Object> map) {
        this.zzcjw = map;
    }
}
