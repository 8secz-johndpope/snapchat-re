package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snap.core.db.record.UploadedMediaModel;
import defpackage.ppy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@zzabh
public final class zzabb implements zzabf {
    private static final Object sLock = new Object();
    private static zzabf zzcqv = null;
    private static zzabf zzcqw = null;
    private final ExecutorService zzair;
    private final zzala zzarg;
    private final Context zzbky;
    private final Object zzcqx;
    private final WeakHashMap<Thread, Boolean> zzcqy;

    private zzabb(Context context) {
        this(context, zzala.zzse());
    }

    private zzabb(Context context, zzala zzala) {
        this.zzcqx = new Object();
        this.zzcqy = new WeakHashMap();
        this.zzair = Executors.newCachedThreadPool();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzbky = context;
        this.zzarg = zzala;
    }

    private final Builder zza(String str, String str2, String str3, int i) {
        boolean zzaoe;
        String packageName;
        try {
            zzaoe = zzbih.zzdd(this.zzbky).zzaoe();
        } catch (Throwable th) {
            zzaky.zzb("Error fetching instant app info", th);
            zzaoe = false;
        }
        try {
            packageName = this.zzbky.getPackageName();
        } catch (Throwable unused) {
            zzaky.zzcz("Cannot obtain package name, proceeding.");
            packageName = "unknown";
        }
        String str4 = "os";
        str4 = "api";
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zzaoe)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(str4, VERSION.RELEASE).appendQueryParameter(str4, String.valueOf(VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        str4 = Build.MODEL;
        if (!str4.startsWith(str5)) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str5).length() + 1) + String.valueOf(str4).length());
            stringBuilder.append(str5);
            stringBuilder.append(" ");
            stringBuilder.append(str4);
            str4 = stringBuilder.toString();
        }
        str3 = "sampling_rate";
        return appendQueryParameter.appendQueryParameter(MapboxNavigationEvent.KEY_DEVICE, str4).appendQueryParameter("js", this.zzarg.zzcu).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(ppy.b, zzoi.zzjf())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "190237664").appendQueryParameter("rc", "dev").appendQueryParameter(UploadedMediaModel.SESSION_ID, zzlc.zzil()).appendQueryParameter(str3, Integer.toString(1)).appendQueryParameter("pb_tm", String.valueOf(zzlc.zzio().zzd(zzoi.zzbvt)));
    }

    public static zzabf zzc(Context context, zzala zzala) {
        synchronized (sLock) {
            if (zzcqw == null) {
                if (((Boolean) zzlc.zzio().zzd(zzoi.zzbli)).booleanValue()) {
                    zzabb zzabb = new zzabb(context, zzala);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (zzabb.zzcqx) {
                            zzabb.zzcqy.put(thread, Boolean.TRUE);
                        }
                        thread.setUncaughtExceptionHandler(new zzabd(zzabb, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new zzabc(zzabb, Thread.getDefaultUncaughtExceptionHandler()));
                    zzcqw = zzabb;
                } else {
                    zzcqw = new zzabg();
                }
            }
        }
        return zzcqw;
    }

    public static zzabf zzj(Context context) {
        synchronized (sLock) {
            if (zzcqv == null) {
                if (((Boolean) zzlc.zzio().zzd(zzoi.zzbli)).booleanValue()) {
                    zzcqv = new zzabb(context);
                } else {
                    zzcqv = new zzabg();
                }
            }
        }
        return zzcqv;
    }

    private final void zzo(List<String> list) {
        for (String str : list) {
            this.zzair.submit(new zzabe(this, new zzakz(), str));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(Thread thread, Throwable th) {
        Object obj;
        Object obj2 = null;
        if (th != null) {
            Throwable th2 = th;
            Object obj3 = null;
            Object obj4 = null;
            while (th2 != null) {
                Object obj5 = obj4;
                obj4 = obj3;
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (zzako.zzcv(stackTraceElement.getClassName())) {
                        obj4 = 1;
                    }
                    if (getClass().getName().equals(stackTraceElement.getClassName())) {
                        obj5 = 1;
                    }
                }
                th2 = th2.getCause();
                obj3 = obj4;
                obj4 = obj5;
            }
            if (obj3 != null && obj4 == null) {
                obj = 1;
                if (obj != null && zzako.zzc(th) != null) {
                    String name = th.getClass().getName();
                    StringWriter stringWriter = new StringWriter();
                    zzdyq.zza(th, new PrintWriter(stringWriter));
                    String stringWriter2 = stringWriter.toString();
                    if (Math.random() < 1.0d) {
                        obj2 = 1;
                    }
                    if (obj2 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zza(name, stringWriter2, "", 1).toString());
                        zzo(arrayList);
                        return;
                    }
                    return;
                }
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    public final void zza(Throwable th, String str) {
        if (zzako.zzc(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            zzdyq.zza(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if ((Math.random() < 1.0d ? 1 : null) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(zza(name, stringWriter2, str, 1).toString());
                zzo(arrayList);
            }
        }
    }
}
