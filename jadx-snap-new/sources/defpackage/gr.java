package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.gk.a.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: gr */
public final class gr {
    private static final Object a = new Object();
    private static String b;
    private static Set<String> c = new HashSet();
    private static final Object f = new Object();
    private static d g;
    private final Context d;
    private final NotificationManager e = ((NotificationManager) this.d.getSystemService("notification"));

    /* renamed from: gr$e */
    interface e {
        void a(gk gkVar);
    }

    /* renamed from: gr$d */
    static class d implements ServiceConnection, Callback {
        private final Context a;
        private final HandlerThread b;
        private final Handler c;
        private final Map<ComponentName, a> d = new HashMap();
        private Set<String> e = new HashSet();

        /* renamed from: gr$d$a */
        static class a {
            final ComponentName a;
            boolean b = false;
            gk c;
            ArrayDeque<e> d = new ArrayDeque();
            int e = 0;

            a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        d(Context context) {
            this.a = context;
            this.b = new HandlerThread("NotificationManagerCompat");
            this.b.start();
            this.c = new Handler(this.b.getLooper(), this);
        }

        private void a(a aVar) {
            if (aVar.b) {
                this.a.unbindService(this);
                aVar.b = false;
            }
            aVar.c = null;
        }

        private void b(a aVar) {
            if (!this.c.hasMessages(3, aVar.a)) {
                aVar.e++;
                String str = "NotifManCompat";
                if (aVar.e > 6) {
                    StringBuilder stringBuilder = new StringBuilder("Giving up on delivering ");
                    stringBuilder.append(aVar.d.size());
                    stringBuilder.append(" tasks to ");
                    stringBuilder.append(aVar.a);
                    stringBuilder.append(" after ");
                    stringBuilder.append(aVar.e);
                    stringBuilder.append(" retries");
                    Log.w(str, stringBuilder.toString());
                    aVar.d.clear();
                    return;
                }
                int i = (1 << (aVar.e - 1)) * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
                if (Log.isLoggable(str, 3)) {
                    StringBuilder stringBuilder2 = new StringBuilder("Scheduling retry for ");
                    stringBuilder2.append(i);
                    stringBuilder2.append(" ms");
                    Log.d(str, stringBuilder2.toString());
                }
                this.c.sendMessageDelayed(this.c.obtainMessage(3, aVar.a), (long) i);
            }
        }

        private void c(a aVar) {
            StringBuilder stringBuilder;
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                stringBuilder = new StringBuilder("Processing component ");
                stringBuilder.append(aVar.a);
                stringBuilder.append(ppy.d);
                stringBuilder.append(aVar.d.size());
                stringBuilder.append(" queued tasks");
                Log.d(str, stringBuilder.toString());
            }
            if (!aVar.d.isEmpty()) {
                boolean z;
                if (aVar.b) {
                    z = true;
                } else {
                    aVar.b = this.a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.a), this, 33);
                    if (aVar.b) {
                        aVar.e = 0;
                    } else {
                        stringBuilder = new StringBuilder("Unable to bind to listener ");
                        stringBuilder.append(aVar.a);
                        Log.w(str, stringBuilder.toString());
                        this.a.unbindService(this);
                    }
                    z = aVar.b;
                }
                if (!z || aVar.c == null) {
                    b(aVar);
                    return;
                }
                while (true) {
                    e eVar = (e) aVar.d.peek();
                    if (eVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(str, 3)) {
                            Log.d(str, "Sending task ".concat(String.valueOf(eVar)));
                        }
                        eVar.a(aVar.c);
                        aVar.d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder stringBuilder2 = new StringBuilder("Remote service has died: ");
                            stringBuilder2.append(aVar.a);
                            Log.d(str, stringBuilder2.toString());
                        }
                    } catch (RemoteException e) {
                        stringBuilder = new StringBuilder("RemoteException communicating with ");
                        stringBuilder.append(aVar.a);
                        Log.w(str, stringBuilder.toString(), e);
                    }
                }
                if (!aVar.d.isEmpty()) {
                    b(aVar);
                }
            }
        }

        public final void a(e eVar) {
            this.c.obtainMessage(0, eVar).sendToTarget();
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            a aVar;
            if (i == 0) {
                Iterator it;
                e eVar = (e) message.obj;
                Set b = gr.b(this.a);
                if (!b.equals(this.e)) {
                    String str;
                    StringBuilder stringBuilder;
                    this.e = b;
                    List queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet = new HashSet();
                    Iterator it2 = queryIntentServices.iterator();
                    while (true) {
                        str = "NotifManCompat";
                        if (!it2.hasNext()) {
                            break;
                        }
                        ResolveInfo resolveInfo = (ResolveInfo) it2.next();
                        if (b.contains(resolveInfo.serviceInfo.packageName)) {
                            ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                stringBuilder = new StringBuilder("Permission present on component ");
                                stringBuilder.append(componentName);
                                stringBuilder.append(", not adding listener record.");
                                Log.w(str, stringBuilder.toString());
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet) {
                        if (!this.d.containsKey(componentName2)) {
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Adding listener record for ".concat(String.valueOf(componentName2)));
                            }
                            this.d.put(componentName2, new a(componentName2));
                        }
                    }
                    it = this.d.entrySet().iterator();
                    while (it.hasNext()) {
                        Entry entry = (Entry) it.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable(str, 3)) {
                                stringBuilder = new StringBuilder("Removing listener record for ");
                                stringBuilder.append(entry.getKey());
                                Log.d(str, stringBuilder.toString());
                            }
                            a((a) entry.getValue());
                            it.remove();
                        }
                    }
                }
                for (a aVar2 : this.d.values()) {
                    aVar2.d.add(eVar);
                    c(aVar2);
                }
                return true;
            } else if (i == 1) {
                c cVar = (c) message.obj;
                ComponentName componentName3 = cVar.a;
                IBinder iBinder = cVar.b;
                a aVar3 = (a) this.d.get(componentName3);
                if (aVar3 != null) {
                    gk gkVar;
                    if (iBinder == null) {
                        gkVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        gkVar = (queryLocalInterface == null || !(queryLocalInterface instanceof gk)) ? new a(iBinder) : (gk) queryLocalInterface;
                    }
                    aVar3.c = gkVar;
                    aVar3.e = 0;
                    c(aVar3);
                }
                return true;
            } else if (i == 2) {
                aVar = (a) this.d.get((ComponentName) message.obj);
                if (aVar != null) {
                    a(aVar);
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                aVar = (a) this.d.get((ComponentName) message.obj);
                if (aVar != null) {
                    c(aVar);
                }
                return true;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Connected to service ".concat(String.valueOf(componentName)));
            }
            this.c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Disconnected from service ".concat(String.valueOf(componentName)));
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: gr$a */
    static class a implements e {
        private String a;
        private int b;
        private String c;
        private boolean d;

        a(String str) {
            this.a = str;
            this.b = 0;
            this.c = null;
            this.d = true;
        }

        a(String str, int i) {
            this.a = str;
            this.b = i;
            this.c = null;
            this.d = false;
        }

        public final void a(gk gkVar) {
            if (this.d) {
                gkVar.a(this.a);
            } else {
                gkVar.a(this.a, this.b, null);
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CancelTask[");
            stringBuilder.append("packageName:");
            stringBuilder.append(this.a);
            stringBuilder.append(", id:");
            stringBuilder.append(this.b);
            stringBuilder.append(", tag:");
            stringBuilder.append(null);
            stringBuilder.append(", all:");
            stringBuilder.append(this.d);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: gr$b */
    static class b implements e {
        private String a;
        private int b;
        private String c = null;
        private Notification d;

        b(String str, int i, Notification notification) {
            this.a = str;
            this.b = i;
            this.d = notification;
        }

        public final void a(gk gkVar) {
            gkVar.a(this.a, this.b, null, this.d);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("NotifyTask[");
            stringBuilder.append("packageName:");
            stringBuilder.append(this.a);
            stringBuilder.append(", id:");
            stringBuilder.append(this.b);
            stringBuilder.append(", tag:");
            stringBuilder.append(null);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: gr$c */
    static class c {
        final ComponentName a;
        final IBinder b;

        c(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    private gr(Context context) {
        this.d = context;
    }

    public static gr a(Context context) {
        return new gr(context);
    }

    private void a(e eVar) {
        synchronized (f) {
            if (g == null) {
                g = new d(this.d.getApplicationContext());
            }
            g.a(eVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0044 in {10, 11, 12, 15, 18} preds:[]
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
    public static java.util.Set<java.lang.String> b(android.content.Context r6) {
        /*
        r6 = r6.getContentResolver();
        r0 = "enabled_notification_listeners";
        r6 = android.provider.Settings.Secure.getString(r6, r0);
        r0 = a;
        monitor-enter(r0);
        if (r6 == 0) goto L_0x003d;
        r1 = b;	 Catch:{ all -> 0x0041 }
        r1 = r6.equals(r1);	 Catch:{ all -> 0x0041 }
        if (r1 != 0) goto L_0x003d;	 Catch:{ all -> 0x0041 }
        r1 = ":";	 Catch:{ all -> 0x0041 }
        r1 = r6.split(r1);	 Catch:{ all -> 0x0041 }
        r2 = new java.util.HashSet;	 Catch:{ all -> 0x0041 }
        r3 = r1.length;	 Catch:{ all -> 0x0041 }
        r2.<init>(r3);	 Catch:{ all -> 0x0041 }
        r3 = r1.length;	 Catch:{ all -> 0x0041 }
        r4 = 0;	 Catch:{ all -> 0x0041 }
        if (r4 >= r3) goto L_0x0039;	 Catch:{ all -> 0x0041 }
        r5 = r1[r4];	 Catch:{ all -> 0x0041 }
        r5 = android.content.ComponentName.unflattenFromString(r5);	 Catch:{ all -> 0x0041 }
        if (r5 == 0) goto L_0x0036;	 Catch:{ all -> 0x0041 }
        r5 = r5.getPackageName();	 Catch:{ all -> 0x0041 }
        r2.add(r5);	 Catch:{ all -> 0x0041 }
        r4 = r4 + 1;	 Catch:{ all -> 0x0041 }
        goto L_0x0025;	 Catch:{ all -> 0x0041 }
        c = r2;	 Catch:{ all -> 0x0041 }
        b = r6;	 Catch:{ all -> 0x0041 }
        r6 = c;	 Catch:{ all -> 0x0041 }
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        return r6;	 Catch:{ all -> 0x0041 }
        r6 = move-exception;	 Catch:{ all -> 0x0041 }
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr.b(android.content.Context):java.util.Set");
    }

    public final void a() {
        this.e.cancelAll();
        if (VERSION.SDK_INT <= 19) {
            a(new a(this.d.getPackageName()));
        }
    }

    public final void a(int i) {
        this.e.cancel(null, i);
        if (VERSION.SDK_INT <= 19) {
            a(new a(this.d.getPackageName(), i));
        }
    }

    public final void a(int i, Notification notification) {
        Bundle a = go.a(notification);
        Object obj = (a == null || !a.getBoolean("android.support.useSideChannel")) ? null : 1;
        if (obj != null) {
            a(new b(this.d.getPackageName(), i, notification));
            this.e.cancel(null, i);
            return;
        }
        this.e.notify(null, i, notification);
    }

    public final boolean b() {
        if (VERSION.SDK_INT >= 24) {
            return this.e.areNotificationsEnabled();
        }
        if (VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.d.getSystemService("appops");
            ApplicationInfo applicationInfo = this.d.getApplicationInfo();
            String packageName = this.d.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            try {
                return ((Integer) Class.forName(AppOpsManager.class.getName()).getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) Class.forName(AppOpsManager.class.getName()).getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return true;
    }
}
