package com.snap.talk.core;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.content.ContextCompat;
import defpackage.acbm;
import defpackage.akcr;

public final class BackgroundCallService extends Service {
    static defpackage.abjg.a a;
    static boolean b;
    static boolean c;
    private static a d = new a();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final synchronized void a(Context context) {
            akcr.b(context, "context");
            acbm.c().a("BackgroundCallService");
            if (BackgroundCallService.b) {
                BackgroundCallService.c = true;
            } else {
                context.stopService(new Intent(context, BackgroundCallService.class));
            }
            defpackage.abjg.a aVar = BackgroundCallService.a;
            if (aVar != null) {
                aVar.dispose();
            }
            BackgroundCallService.a = null;
        }

        public final synchronized void a(Context context, defpackage.abjg.a aVar) {
            akcr.b(context, "context");
            akcr.b(aVar, "notification");
            defpackage.abjg.a aVar2 = BackgroundCallService.a;
            if (aVar2 != null) {
                aVar2.dispose();
            }
            BackgroundCallService.a = aVar;
            acbm.c().a("BackgroundCallService");
            ContextCompat.startForegroundService(context, new Intent(context, BackgroundCallService.class));
            BackgroundCallService.b = true;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000d in {4, 6, 7, 10} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final synchronized boolean a() {
            /*
            r1 = this;
            monitor-enter(r1);
            r0 = com.snap.talk.core.BackgroundCallService.a;	 Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x0008;
            r0 = 1;
            monitor-exit(r1);
            return r0;
            r0 = 0;
            goto L_0x0006;
            r0 = move-exception;
            monitor-exit(r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.talk.core.BackgroundCallService$a.a():boolean");
        }
    }

    public static final synchronized void a(Context context) {
        synchronized (BackgroundCallService.class) {
            d.a(context);
        }
    }

    public static final synchronized void a(Context context, defpackage.abjg.a aVar) {
        synchronized (BackgroundCallService.class) {
            d.a(context, aVar);
        }
    }

    public static final synchronized boolean a() {
        boolean a;
        synchronized (BackgroundCallService.class) {
            a = d.a();
        }
        return a;
    }

    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    public final synchronized void onCreate() {
        super.onCreate();
        defpackage.abjg.a aVar = a;
        if (aVar != null) {
            startForeground(1094994944, aVar.a());
            aVar.dispose();
        } else {
            startForeground(1094994944, new Notification());
            stopForeground(true);
        }
        if (c) {
            stopSelf();
        }
        c = false;
        b = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        defpackage.abjg.a aVar = a;
        if (aVar != null) {
            aVar.dispose();
        }
        a = null;
    }
}
