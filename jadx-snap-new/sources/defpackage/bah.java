package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.firebase.jobdispatcher.GooglePlayReceiver;

/* renamed from: bah */
public final class bah implements bad {
    private final bav a;
    private final Context b;
    private final PendingIntent c;
    private final baj d;
    private final boolean e = true;

    public bah(Context context) {
        this.b = context;
        this.c = PendingIntent.getBroadcast(context, 0, new Intent(), 0);
        this.d = new baj();
        this.a = new bac(context);
    }

    private Intent b(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("scheduler_action", str);
        intent.putExtra("app", this.c);
        intent.putExtra("source", 8);
        intent.putExtra("source_version", 1);
        return intent;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:62:0x0182 in {6, 9, 11, 14, 15, 18, 19, 20, 25, 26, 31, 32, 35, 36, 39, 40, 43, 44, 47, 50, 53, 55, 57, 61} preds:[]
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
    public final int a(defpackage.bao r15) {
        /*
        r14 = this;
        r0 = com.firebase.jobdispatcher.GooglePlayReceiver.b;
        monitor-enter(r0);
        r1 = com.firebase.jobdispatcher.GooglePlayReceiver.b;	 Catch:{ all -> 0x017f }
        r2 = r15.a;	 Catch:{ all -> 0x017f }
        r1 = r1.get(r2);	 Catch:{ all -> 0x017f }
        r1 = (defpackage.jh) r1;	 Catch:{ all -> 0x017f }
        r2 = 0;	 Catch:{ all -> 0x017f }
        if (r1 != 0) goto L_0x0012;	 Catch:{ all -> 0x017f }
        monitor-exit(r0);	 Catch:{ all -> 0x017f }
        goto L_0x0036;	 Catch:{ all -> 0x017f }
        r3 = r15.b;	 Catch:{ all -> 0x017f }
        r1 = r1.get(r3);	 Catch:{ all -> 0x017f }
        r1 = (defpackage.bap) r1;	 Catch:{ all -> 0x017f }
        if (r1 != 0) goto L_0x001d;	 Catch:{ all -> 0x017f }
        goto L_0x0010;	 Catch:{ all -> 0x017f }
        monitor-exit(r0);	 Catch:{ all -> 0x017f }
        r0 = new bar$a;
        r0.<init>();
        r1 = r15.b;
        r0.a = r1;
        r1 = r15.a;
        r0.b = r1;
        r1 = r15.c;
        r0.c = r1;
        r0 = r0.a();
        defpackage.bae.a(r0, r2);
        r0 = r14.b;
        r1 = "SCHEDULE_TASK";
        r1 = r14.b(r1);
        r3 = r14.d;
        r4 = r1.getExtras();
        r5 = r15.e();
        r6 = "tag";
        r4.putString(r6, r5);
        r5 = r15.d();
        r6 = "update_current";
        r4.putBoolean(r6, r5);
        r5 = r15.g();
        r6 = 2;
        r7 = 1;
        if (r5 != r6) goto L_0x0060;
        r5 = 1;
        goto L_0x0061;
        r5 = 0;
        r8 = "persisted";
        r4.putBoolean(r8, r5);
        r5 = com.firebase.jobdispatcher.GooglePlayReceiver.class;
        r5 = r5.getName();
        r8 = "service";
        r4.putString(r8, r5);
        r5 = r15.f();
        r8 = defpackage.bay.a;
        if (r5 != r8) goto L_0x008d;
        r5 = "trigger_type";
        r4.putInt(r5, r6);
        r8 = 0;
        r5 = "window_start";
        r4.putLong(r5, r8);
        r8 = 1;
        r5 = "window_end";
        r4.putLong(r5, r8);
        goto L_0x00f1;
        r8 = r5 instanceof defpackage.bau.b;
        if (r8 == 0) goto L_0x00bb;
        r5 = (defpackage.bau.b) r5;
        r8 = "trigger_type";
        r4.putInt(r8, r7);
        r8 = r15.h();
        if (r8 == 0) goto L_0x00af;
        r8 = r5.b;
        r8 = (long) r8;
        r10 = "period";
        r4.putLong(r10, r8);
        r8 = r5.b;
        r5 = r5.a;
        r8 = r8 - r5;
        r8 = (long) r8;
        r5 = "period_flex";
        goto L_0x0089;
        r8 = r5.a;
        r8 = (long) r8;
        r10 = "window_start";
        r4.putLong(r10, r8);
        r5 = r5.b;
        r8 = (long) r5;
        goto L_0x0087;
        r8 = r5 instanceof defpackage.bau.a;
        if (r8 == 0) goto L_0x0167;
        r5 = (defpackage.bau.a) r5;
        r8 = 3;
        r9 = "trigger_type";
        r4.putInt(r9, r8);
        r8 = r5.a;
        r8 = r8.size();
        r9 = new int[r8];
        r10 = new android.net.Uri[r8];
        r11 = 0;
        if (r11 >= r8) goto L_0x00e7;
        r12 = r5.a;
        r12 = r12.get(r11);
        r12 = (defpackage.baw) r12;
        r13 = r12.b;
        r9[r11] = r13;
        r12 = r12.a;
        r10[r11] = r12;
        r11 = r11 + 1;
        goto L_0x00d2;
        r5 = "content_uri_flags_array";
        r4.putIntArray(r5, r9);
        r5 = "content_uri_array";
        r4.putParcelableArray(r5, r10);
        r5 = r15.a();
        r5 = defpackage.baa.a(r5);
        r8 = r5 & 4;
        r9 = 4;
        if (r8 != r9) goto L_0x0100;
        r8 = 1;
        goto L_0x0101;
        r8 = 0;
        r9 = "requiresCharging";
        r4.putBoolean(r9, r8);
        r8 = r5 & 8;
        r9 = 8;
        if (r8 != r9) goto L_0x010e;
        r8 = 1;
        goto L_0x010f;
        r8 = 0;
        r9 = "requiresIdle";
        r4.putBoolean(r9, r8);
        r8 = r5 & 2;
        if (r8 != r6) goto L_0x011a;
        r8 = 0;
        goto L_0x011b;
        r8 = 2;
        r5 = r5 & r7;
        if (r5 != r7) goto L_0x011f;
        r8 = 1;
        r5 = "requiredNetwork";
        r4.putInt(r5, r8);
        r5 = r15.c();
        r8 = new android.os.Bundle;
        r8.<init>();
        r9 = r5.c;
        if (r9 == r6) goto L_0x0132;
        r7 = 0;
        r6 = "retry_policy";
        r8.putInt(r6, r7);
        r6 = r5.d;
        r7 = "initial_backoff_seconds";
        r8.putInt(r7, r6);
        r5 = r5.e;
        r6 = "maximum_backoff_seconds";
        r8.putInt(r6, r5);
        r5 = "retryStrategy";
        r4.putBundle(r5, r8);
        r5 = r15.b();
        if (r5 != 0) goto L_0x0155;
        r5 = new android.os.Bundle;
        r5.<init>();
        r3 = r3.a;
        r15 = r3.a(r15, r5);
        r3 = "extras";
        r4.putBundle(r3, r15);
        r1.putExtras(r4);
        r0.sendBroadcast(r1);
        return r2;
        r15 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "Unknown trigger: ";
        r0.<init>(r1);
        r1 = r5.getClass();
        r0.append(r1);
        r0 = r0.toString();
        r15.<init>(r0);
        throw r15;
        r15 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x017f }
        throw r15;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bah.a(bao):int");
    }

    public final int a(String str) {
        Context context = this.b;
        Intent b = b("CANCEL_TASK");
        b.putExtra("tag", str);
        b.putExtra("component", new ComponentName(this.b, GooglePlayReceiver.class));
        context.sendBroadcast(b);
        return 0;
    }

    public final bav a() {
        return this.a;
    }
}
