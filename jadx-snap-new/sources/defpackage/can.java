package defpackage;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Log;
import com.brightcove.player.media.MediaService;
import com.google.android.gms.common.api.internal.zzk;
import com.google.android.gms.common.internal.zzbg;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.internal.zzca;
import com.google.android.gms.common.util.zzu;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: can */
public class can {
    static final List<String> a = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    static final List<String> b = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    static final List<String> c = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    static final Object d = new Object();
    static final Map<String, can> e = new iv();
    private static final List<String> h = Arrays.asList(new String[0]);
    private static final Set<String> i = Collections.emptySet();
    final Context f;
    final AtomicBoolean g = new AtomicBoolean(false);
    private final String j;
    private final cao k;
    private final AtomicBoolean l = new AtomicBoolean();
    private final List<Object> m = new CopyOnWriteArrayList();
    private final List<Object> n = new CopyOnWriteArrayList();
    private final List<Object> o = new CopyOnWriteArrayList();
    private a p;

    /* renamed from: can$a */
    public interface a {
    }

    @TargetApi(24)
    /* renamed from: can$b */
    static class b extends BroadcastReceiver {
        static AtomicReference<b> a = new AtomicReference();
        private final Context b;

        b(Context context) {
            this.b = context;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0041 in {8, 11, 15} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
            r4 = this;
            r5 = defpackage.can.d;
            monitor-enter(r5);
            r6 = defpackage.can.e;	 Catch:{ all -> 0x003e }
            r6 = r6.values();	 Catch:{ all -> 0x003e }
            r6 = r6.iterator();	 Catch:{ all -> 0x003e }
            r0 = r6.hasNext();	 Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0037;	 Catch:{ all -> 0x003e }
            r0 = r6.next();	 Catch:{ all -> 0x003e }
            r0 = (defpackage.can) r0;	 Catch:{ all -> 0x003e }
            r1 = defpackage.can.class;	 Catch:{ all -> 0x003e }
            r2 = defpackage.can.a;	 Catch:{ all -> 0x003e }
            r0.a(r1, r0, r2);	 Catch:{ all -> 0x003e }
            r1 = r0.d();	 Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x000d;	 Catch:{ all -> 0x003e }
            r1 = defpackage.can.class;	 Catch:{ all -> 0x003e }
            r2 = defpackage.can.b;	 Catch:{ all -> 0x003e }
            r0.a(r1, r0, r2);	 Catch:{ all -> 0x003e }
            r1 = android.content.Context.class;	 Catch:{ all -> 0x003e }
            r2 = r0.f;	 Catch:{ all -> 0x003e }
            r3 = defpackage.can.c;	 Catch:{ all -> 0x003e }
            r0.a(r1, r2, r3);	 Catch:{ all -> 0x003e }
            goto L_0x000d;	 Catch:{ all -> 0x003e }
            monitor-exit(r5);	 Catch:{ all -> 0x003e }
            r5 = r4.b;
            r5.unregisterReceiver(r4);
            return;
            r6 = move-exception;
            monitor-exit(r5);	 Catch:{ all -> 0x003e }
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.can$b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    private can(Context context, String str, cao cao) {
        this.f = (Context) zzbq.checkNotNull(context);
        this.j = zzbq.zzgv(str);
        this.k = (cao) zzbq.checkNotNull(cao);
        this.p = new cbr();
    }

    public static can a(Context context) {
        synchronized (d) {
            can c;
            if (e.containsKey("[DEFAULT]")) {
                c = can.c();
                return c;
            }
            cao cao;
            zzca zzca = new zzca(context);
            String string = zzca.getString("google_app_id");
            if (TextUtils.isEmpty(string)) {
                cao = null;
            } else {
                cao cao2 = new cao(string, zzca.getString("google_api_key"), zzca.getString("firebase_database_url"), zzca.getString("ga_trackingId"), zzca.getString("gcm_defaultSenderId"), zzca.getString("google_storage_bucket"), zzca.getString("project_id"));
            }
            if (cao == null) {
                return null;
            }
            c = can.a(context, cao, "[DEFAULT]");
            return c;
        }
    }

    private static can a(Context context, cao cao, String str) {
        Object context2;
        Object can;
        cbs.a.compareAndSet(null, new cbs());
        cbs.a.get();
        if (context2.getApplicationContext() instanceof Application) {
            zzk.zza((Application) context2.getApplicationContext());
            zzk.zzaij().zza(new ccb());
        }
        str = str.trim();
        if (context2.getApplicationContext() != null) {
            context2 = context2.getApplicationContext();
        }
        synchronized (d) {
            boolean z = !e.containsKey(str);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 33);
            stringBuilder.append("FirebaseApp name ");
            stringBuilder.append(str);
            stringBuilder.append(" already exists!");
            zzbq.zza(z, stringBuilder.toString());
            zzbq.checkNotNull(context2, "Application context cannot be null.");
            can = new can(context2, str, cao);
            e.put(str, can);
        }
        can.a(can.class, can, a);
        if (can.d()) {
            can.a(can.class, can, b);
            can.a(Context.class, can.a(), c);
        }
        return can;
    }

    public static can c() {
        can can;
        synchronized (d) {
            can = (can) e.get("[DEFAULT]");
            if (can != null) {
            } else {
                String zzany = zzu.zzany();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzany).length() + 116);
                stringBuilder.append("Default FirebaseApp is not initialized in this process ");
                stringBuilder.append(zzany);
                stringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return can;
    }

    private String f() {
        g();
        return this.j;
    }

    private final void g() {
        zzbq.zza(this.l.get() ^ 1, "FirebaseApp was deleted");
    }

    public final Context a() {
        g();
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final <T> void a(Class<T> cls, T t, Iterable<String> iterable) {
        boolean isDeviceProtectedStorage = ContextCompat.isDeviceProtectedStorage(this.f);
        if (isDeviceProtectedStorage) {
            Context context = this.f;
            if (b.a.get() == null) {
                b bVar = new b(context);
                if (b.a.compareAndSet(null, bVar)) {
                    context.registerReceiver(bVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }
        for (String str : iterable) {
            String str2;
            String str3 = "FirebaseApp";
            if (isDeviceProtectedStorage) {
                try {
                    if (!h.contains(str2)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (i.contains(str2)) {
                        throw new IllegalStateException(String.valueOf(str2).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    Log.d(str3, String.valueOf(str2).concat(" is not linked. Skipping initialization."));
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(String.valueOf(str2).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e) {
                    Log.wtf(str3, "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    String str4 = "Failed to initialize ";
                    str2 = String.valueOf(str2);
                    Log.wtf(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4), e2);
                }
            }
            Method method = Class.forName(str2).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }

    public final cao b() {
        g();
        return this.k;
    }

    public final boolean d() {
        return "[DEFAULT]".equals(f());
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public boolean equals(Object obj) {
        return !(obj instanceof can) ? false : this.j.equals(((can) obj).f());
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public String toString() {
        return zzbg.zzx(this).zzg("name", this.j).zzg(MediaService.OPTIONS, this.k).toString();
    }
}
