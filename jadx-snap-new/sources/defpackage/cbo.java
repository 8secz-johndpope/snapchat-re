package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* renamed from: cbo */
public final class cbo {
    private static int c;
    private static PendingIntent d;
    Messenger a;
    cba b;
    private final jh<String, TaskCompletionSource<Bundle>> e = new jh();
    private final Context f;
    private final cbn g;
    private Messenger h;

    public cbo(Context context, cbn cbn) {
        this.f = context;
        this.g = cbn;
        this.h = new Messenger(new cbp(this, Looper.getMainLooper()));
    }

    private static synchronized String a() {
        String num;
        synchronized (cbo.class) {
            int i = c;
            c = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (cbo.class) {
            if (d == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                d = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", d);
        }
    }

    private final Bundle b(Bundle bundle) {
        Bundle c = c(bundle);
        if (c == null) {
            return c;
        }
        String str = "google.messenger";
        if (!c.containsKey(str)) {
            return c;
        }
        c = c(bundle);
        return (c == null || !c.containsKey(str)) ? c : null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb A:{SYNTHETIC} */
    private final android.os.Bundle c(android.os.Bundle r8) {
        /*
        r7 = this;
        r0 = defpackage.cbo.a();
        r1 = new com.google.android.gms.tasks.TaskCompletionSource;
        r1.<init>();
        r2 = r7.e;
        monitor-enter(r2);
        r3 = r7.e;	 Catch:{ all -> 0x0122 }
        r3.put(r0, r1);	 Catch:{ all -> 0x0122 }
        monitor-exit(r2);	 Catch:{ all -> 0x0122 }
        r2 = r7.g;
        r2 = r2.a();
        if (r2 == 0) goto L_0x011a;
    L_0x001a:
        r2 = new android.content.Intent;
        r2.<init>();
        r3 = "com.google.android.gms";
        r2.setPackage(r3);
        r3 = r7.g;
        r3 = r3.a();
        r4 = 2;
        if (r3 != r4) goto L_0x0030;
    L_0x002d:
        r3 = "com.google.iid.TOKEN_REQUEST";
        goto L_0x0032;
    L_0x0030:
        r3 = "com.google.android.c2dm.intent.REGISTER";
    L_0x0032:
        r2.setAction(r3);
        r2.putExtras(r8);
        r8 = r7.f;
        defpackage.cbo.a(r8, r2);
        r8 = java.lang.String.valueOf(r0);
        r8 = r8.length();
        r8 = r8 + 5;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r8);
        r8 = "|ID|";
        r3.append(r8);
        r3.append(r0);
        r8 = "|";
        r3.append(r8);
        r8 = r3.toString();
        r3 = "kid";
        r2.putExtra(r3, r8);
        r8 = 3;
        r3 = "FirebaseInstanceId";
        r3 = android.util.Log.isLoggable(r3, r8);
        if (r3 == 0) goto L_0x0093;
    L_0x006b:
        r3 = r2.getExtras();
        r3 = java.lang.String.valueOf(r3);
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r5 = r5 + 8;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "Sending ";
        r6.append(r5);
        r6.append(r3);
        r3 = r6.toString();
        r5 = "FirebaseInstanceId";
        android.util.Log.d(r5, r3);
    L_0x0093:
        r3 = r7.h;
        r5 = "google.messenger";
        r2.putExtra(r5, r3);
        r3 = r7.a;
        if (r3 != 0) goto L_0x00a2;
    L_0x009e:
        r3 = r7.b;
        if (r3 == 0) goto L_0x00c7;
    L_0x00a2:
        r3 = android.os.Message.obtain();
        r3.obj = r2;
        r5 = r7.a;	 Catch:{ RemoteException -> 0x00b8 }
        if (r5 == 0) goto L_0x00b2;
    L_0x00ac:
        r5 = r7.a;	 Catch:{ RemoteException -> 0x00b8 }
        r5.send(r3);	 Catch:{ RemoteException -> 0x00b8 }
        goto L_0x00da;
    L_0x00b2:
        r5 = r7.b;	 Catch:{ RemoteException -> 0x00b8 }
        r5.a(r3);	 Catch:{ RemoteException -> 0x00b8 }
        goto L_0x00da;
    L_0x00b8:
        r3 = "FirebaseInstanceId";
        r8 = android.util.Log.isLoggable(r3, r8);
        if (r8 == 0) goto L_0x00c7;
    L_0x00c0:
        r8 = "FirebaseInstanceId";
        r3 = "Messenger failed, fallback to startService";
        android.util.Log.d(r8, r3);
    L_0x00c7:
        r8 = r7.g;
        r8 = r8.a();
        if (r8 != r4) goto L_0x00d5;
    L_0x00cf:
        r8 = r7.f;
        r8.sendBroadcast(r2);
        goto L_0x00da;
    L_0x00d5:
        r8 = r7.f;
        r8.startService(r2);
    L_0x00da:
        r8 = r1.getTask();	 Catch:{ InterruptedException | TimeoutException -> 0x00fe, InterruptedException | TimeoutException -> 0x00fe, ExecutionException -> 0x00f7 }
        r1 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException | TimeoutException -> 0x00fe, InterruptedException | TimeoutException -> 0x00fe, ExecutionException -> 0x00f7 }
        r8 = com.google.android.gms.tasks.Tasks.await(r8, r1, r3);	 Catch:{ InterruptedException | TimeoutException -> 0x00fe, InterruptedException | TimeoutException -> 0x00fe, ExecutionException -> 0x00f7 }
        r8 = (android.os.Bundle) r8;	 Catch:{ InterruptedException | TimeoutException -> 0x00fe, InterruptedException | TimeoutException -> 0x00fe, ExecutionException -> 0x00f7 }
        r1 = r7.e;
        monitor-enter(r1);
        r2 = r7.e;	 Catch:{ all -> 0x00f2 }
        r2.remove(r0);	 Catch:{ all -> 0x00f2 }
        monitor-exit(r1);	 Catch:{ all -> 0x00f2 }
        return r8;
    L_0x00f2:
        r8 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00f2 }
        throw r8;
    L_0x00f5:
        r8 = move-exception;
        goto L_0x010d;
    L_0x00f7:
        r8 = move-exception;
        r1 = new java.io.IOException;	 Catch:{ all -> 0x00f5 }
        r1.<init>(r8);	 Catch:{ all -> 0x00f5 }
        throw r1;	 Catch:{ all -> 0x00f5 }
    L_0x00fe:
        r8 = "FirebaseInstanceId";
        r1 = "No response";
        android.util.Log.w(r8, r1);	 Catch:{ all -> 0x00f5 }
        r8 = new java.io.IOException;	 Catch:{ all -> 0x00f5 }
        r1 = "TIMEOUT";
        r8.<init>(r1);	 Catch:{ all -> 0x00f5 }
        throw r8;	 Catch:{ all -> 0x00f5 }
    L_0x010d:
        r1 = r7.e;
        monitor-enter(r1);
        r2 = r7.e;	 Catch:{ all -> 0x0117 }
        r2.remove(r0);	 Catch:{ all -> 0x0117 }
        monitor-exit(r1);	 Catch:{ all -> 0x0117 }
        throw r8;
    L_0x0117:
        r8 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0117 }
        throw r8;
    L_0x011a:
        r8 = new java.io.IOException;
        r0 = "MISSING_INSTANCEID_SERVICE";
        r8.<init>(r0);
        throw r8;
    L_0x0122:
        r8 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0122 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbo.c(android.os.Bundle):android.os.Bundle");
    }

    public final Bundle a(Bundle bundle) {
        if (this.g.d() < 12000000) {
            return b(bundle);
        }
        cbc a = cbc.a(this.f);
        try {
            return (Bundle) Tasks.await(a.a(new cbm(a.a(), bundle)));
        } catch (InterruptedException | ExecutionException e) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                stringBuilder.append("Error making request: ");
                stringBuilder.append(valueOf);
                Log.d(str, stringBuilder.toString());
            }
            return ((e.getCause() instanceof cbl) && ((cbl) e.getCause()).a == 4) ? b(bundle) : null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x00d2 in {3, 8, 9, 10, 17, 20, 22, 25, 26, 28, 35, 37, 40} preds:[]
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
    final void a(android.content.Intent r8) {
        /*
        r7 = this;
        r0 = "error";
        r0 = r8.getStringExtra(r0);
        if (r0 != 0) goto L_0x0031;
        r8 = r8.getExtras();
        r8 = java.lang.String.valueOf(r8);
        r0 = java.lang.String.valueOf(r8);
        r0 = r0.length();
        r0 = r0 + 49;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Unexpected response, no error or registration id ";
        r1.append(r0);
        r1.append(r8);
        r8 = r1.toString();
        r0 = "FirebaseInstanceId";
        android.util.Log.w(r0, r8);
        return;
        r1 = 3;
        r2 = "FirebaseInstanceId";
        r2 = android.util.Log.isLoggable(r2, r1);
        if (r2 == 0) goto L_0x0056;
        r2 = "Received InstanceID error ";
        r3 = java.lang.String.valueOf(r0);
        r4 = r3.length();
        if (r4 == 0) goto L_0x004b;
        r2 = r2.concat(r3);
        goto L_0x0051;
        r3 = new java.lang.String;
        r3.<init>(r2);
        r2 = r3;
        r3 = "FirebaseInstanceId";
        android.util.Log.d(r3, r2);
        r2 = "|";
        r2 = r0.startsWith(r2);
        if (r2 == 0) goto L_0x00af;
        r2 = "\\|";
        r2 = r0.split(r2);
        r3 = r2.length;
        r4 = 2;
        if (r3 <= r4) goto L_0x0092;
        r3 = 1;
        r5 = r2[r3];
        r6 = "ID";
        r5 = r6.equals(r5);
        if (r5 != 0) goto L_0x0074;
        goto L_0x0092;
        r0 = r2[r4];
        r1 = r2[r1];
        r2 = ":";
        r2 = r1.startsWith(r2);
        if (r2 == 0) goto L_0x0084;
        r1 = r1.substring(r3);
        r2 = "error";
        r8 = r8.putExtra(r2, r1);
        r8 = r8.getExtras();
        r7.a(r0, r8);
        return;
        r8 = "Unexpected structured response ";
        r0 = java.lang.String.valueOf(r0);
        r1 = r0.length();
        if (r1 == 0) goto L_0x00a3;
        r8 = r8.concat(r0);
        goto L_0x00a9;
        r0 = new java.lang.String;
        r0.<init>(r8);
        r8 = r0;
        r0 = "FirebaseInstanceId";
        android.util.Log.w(r0, r8);
        return;
        r0 = r7.e;
        monitor-enter(r0);
        r1 = 0;
        r2 = r7.e;	 Catch:{ all -> 0x00cf }
        r2 = r2.size();	 Catch:{ all -> 0x00cf }
        if (r1 >= r2) goto L_0x00cd;	 Catch:{ all -> 0x00cf }
        r2 = r7.e;	 Catch:{ all -> 0x00cf }
        r2 = r2.b(r1);	 Catch:{ all -> 0x00cf }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x00cf }
        r3 = r8.getExtras();	 Catch:{ all -> 0x00cf }
        r7.a(r2, r3);	 Catch:{ all -> 0x00cf }
        r1 = r1 + 1;	 Catch:{ all -> 0x00cf }
        goto L_0x00b3;	 Catch:{ all -> 0x00cf }
        monitor-exit(r0);	 Catch:{ all -> 0x00cf }
        return;	 Catch:{ all -> 0x00cf }
        r8 = move-exception;	 Catch:{ all -> 0x00cf }
        monitor-exit(r0);	 Catch:{ all -> 0x00cf }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbo.a(android.content.Intent):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, Bundle bundle) {
        synchronized (this.e) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.e.remove(str);
            if (taskCompletionSource == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                str = String.valueOf(str);
                Log.w(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
                return;
            }
            taskCompletionSource.setResult(bundle);
        }
    }
}
