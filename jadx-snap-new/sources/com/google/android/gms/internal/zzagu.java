package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@zzabh
public final class zzagu {
    private final AtomicReference<ThreadPoolExecutor> zzdbv = new AtomicReference(null);
    private final Object zzdbw = new Object();
    private String zzdbx = null;
    private AtomicBoolean zzdby = new AtomicBoolean(false);
    private final AtomicInteger zzdbz = new AtomicInteger(-1);
    private final AtomicReference<Object> zzdca = new AtomicReference(null);
    private final AtomicReference<Object> zzdcb = new AtomicReference(null);
    private ConcurrentMap<String, Method> zzdcc = new ConcurrentHashMap(9);

    private static Bundle zza(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String str2 = "Invalid event ID: ";
            str = String.valueOf(str);
            zzaky.zzb(str.length() != 0 ? str2.concat(str) : new String(str2), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Object zza(String str, Context context) {
        Object obj = null;
        if (!zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdca, true)) {
            return null;
        }
        try {
            obj = zzi(context, str).invoke(this.zzdca.get(), new Object[0]);
        } catch (Exception e) {
            zza(e, str, true);
        }
        return obj;
    }

    private final void zza(Context context, String str, Bundle bundle) {
        if (zzq(context)) {
            if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdca, true)) {
                Method zzaa = zzaa(context);
                try {
                    zzaa.invoke(this.zzdca.get(), new Object[]{"am", str, bundle});
                } catch (Exception e) {
                    zza(e, "logEventInternal", true);
                }
            }
        }
    }

    private final void zza(Exception exception, String str, boolean z) {
        if (!this.zzdby.get()) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
            stringBuilder.append("Invoke Firebase method ");
            stringBuilder.append(str);
            stringBuilder.append(" error.");
            zzaky.zzcz(stringBuilder.toString());
            if (z) {
                zzaky.zzcz("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zzdby.set(true);
            }
        }
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        String str2 = "getInstance";
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod(str2, new Class[]{Context.class}).invoke(null, new Object[]{context}));
            } catch (Exception e) {
                zza(e, str2, z);
                return false;
            }
        }
        return true;
    }

    private final Method zzaa(Context context) {
        String str = "logEventInternal";
        Method method = (Method) this.zzdcc.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class, String.class, Bundle.class});
            this.zzdcc.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, true);
            return null;
        }
    }

    private final void zzb(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdca, true)) {
            Method zzh = zzh(context, str2);
            try {
                zzh.invoke(this.zzdca.get(), new Object[]{str});
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 37) + String.valueOf(str).length());
                stringBuilder.append("Invoke Firebase method ");
                stringBuilder.append(str2);
                stringBuilder.append(", Ad Unit Id: ");
                stringBuilder.append(str);
                zzahw.v(stringBuilder.toString());
            } catch (Exception e) {
                zza(e, str2, false);
            }
        }
    }

    private final Method zzh(Context context, String str) {
        Method method = (Method) this.zzdcc.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.zzdcc.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzi(Context context, String str) {
        Method method = (Method) this.zzdcc.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzdcc.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzj(Context context, String str) {
        Method method = (Method) this.zzdcc.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.zzdcc.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    public final void zza(Context context, String str, String str2) {
        if (zzq(context)) {
            zza(context, str, zza(context, str2, "_ac".equals(str)));
        }
    }

    public final void zza(Context context, String str, String str2, String str3, int i) {
        if (zzq(context)) {
            Bundle zza = zza(context, str, false);
            zza.putString("_ai", str2);
            zza.putString("type", str3);
            zza.putInt("value", i);
            zza(context, "_ar", zza);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 75);
            stringBuilder.append("Log a Firebase reward video event, reward type: ");
            stringBuilder.append(str3);
            stringBuilder.append(", reward value: ");
            stringBuilder.append(i);
            zzahw.v(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ String zzab(Context context) {
        return (String) zza("getAppInstanceId", context);
    }

    public final void zzb(Context context, String str) {
        if (zzq(context)) {
            zzb(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzc(Context context, String str) {
        if (zzq(context)) {
            zzb(context, str, "endAdUnitExposure");
        }
    }

    public final void zzd(Context context, String str) {
        if (zzq(context) && (context instanceof Activity)) {
            if (zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzdcb, false)) {
                String str2 = "setCurrentScreen";
                Method zzj = zzj(context, str2);
                try {
                    Activity activity = (Activity) context;
                    zzj.invoke(this.zzdcb.get(), new Object[]{activity, str, context.getPackageName()});
                } catch (Exception e) {
                    zza(e, str2, false);
                }
            }
        }
    }

    public final void zze(Context context, String str) {
        zza(context, "_ac", str);
    }

    public final void zzf(Context context, String str) {
        zza(context, "_ai", str);
    }

    public final void zzg(Context context, String str) {
        zza(context, "_aq", str);
    }

    public final boolean zzq(Context context) {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbog)).booleanValue() && !this.zzdby.get()) {
            if (this.zzdbz.get() == -1) {
                zzlc.zzij();
                if (!zzako.zzbb(context)) {
                    zzlc.zzij();
                    if (zzako.zzbe(context)) {
                        zzaky.zzcz("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzdbz.set(0);
                    }
                }
                this.zzdbz.set(1);
            }
            if (this.zzdbz.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzr(Context context) {
        return ((Boolean) zzlc.zzio().zzd(zzoi.zzboh)).booleanValue() && zzq(context);
    }

    public final boolean zzs(Context context) {
        return ((Boolean) zzlc.zzio().zzd(zzoi.zzboi)).booleanValue() && zzq(context);
    }

    public final boolean zzt(Context context) {
        return ((Boolean) zzlc.zzio().zzd(zzoi.zzboj)).booleanValue() && zzq(context);
    }

    public final boolean zzu(Context context) {
        return ((Boolean) zzlc.zzio().zzd(zzoi.zzbok)).booleanValue() && zzq(context);
    }

    public final boolean zzv(Context context) {
        return ((Boolean) zzlc.zzio().zzd(zzoi.zzbon)).booleanValue() && zzq(context);
    }

    public final String zzw(Context context) {
        String str = "getCurrentScreenName";
        String str2 = "";
        if (!zzq(context)) {
            return str2;
        }
        if (!zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdca, true)) {
            return str2;
        }
        try {
            String str3 = (String) zzi(context, str).invoke(this.zzdca.get(), new Object[0]);
            if (str3 == null) {
                str3 = (String) zzi(context, "getCurrentScreenClass").invoke(this.zzdca.get(), new Object[0]);
            }
            return str3 != null ? str3 : str2;
        } catch (Exception e) {
            zza(e, str, false);
            return str2;
        }
    }

    public final String zzx(Context context) {
        if (!zzq(context)) {
            return null;
        }
        synchronized (this.zzdbw) {
            String str;
            if (this.zzdbx != null) {
                str = this.zzdbx;
                return str;
            }
            this.zzdbx = (String) zza("getGmpAppId", context);
            str = this.zzdbx;
            return str;
        }
    }

    public final String zzy(Context context) {
        if (!zzq(context)) {
            return null;
        }
        long longValue = ((Long) zzlc.zzio().zzd(zzoi.zzboq)).longValue();
        if (longValue < 0) {
            return (String) zza("getAppInstanceId", context);
        }
        if (this.zzdbv.get() == null) {
            this.zzdbv.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzlc.zzio().zzd(zzoi.zzbor)).intValue(), ((Integer) zzlc.zzio().zzd(zzoi.zzbor)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzagw(this)));
        }
        Future submit = ((ThreadPoolExecutor) this.zzdbv.get()).submit(new zzagv(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            submit.cancel(true);
            return e instanceof TimeoutException ? "TIME_OUT" : null;
        }
    }

    public final String zzz(Context context) {
        if (!zzq(context)) {
            return null;
        }
        Object zza = zza("generateEventId", context);
        return zza != null ? zza.toString() : null;
    }
}
