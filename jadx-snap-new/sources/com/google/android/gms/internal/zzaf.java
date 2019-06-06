package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class zzaf {
    public static boolean DEBUG = Log.isLoggable("Volley", 2);
    private static String TAG = "Volley";

    static class zza {
        public static final boolean zzbk = zzaf.DEBUG;
        private final List<zzag> zzbl = new ArrayList();
        private boolean zzbm = false;

        zza() {
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            if (!this.zzbm) {
                zzc("Request on the loose");
                zzaf.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        public final synchronized void zza(String str, long j) {
            if (this.zzbm) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.zzbl.add(new zzag(str, j, SystemClock.elapsedRealtime()));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0085 in {5, 7, 11, 17, 19, 22} preds:[]
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
        public final synchronized void zzc(java.lang.String r11) {
            /*
            r10 = this;
            monitor-enter(r10);
            r0 = 1;
            r10.zzbm = r0;	 Catch:{ all -> 0x0082 }
            r1 = r10.zzbl;	 Catch:{ all -> 0x0082 }
            r1 = r1.size();	 Catch:{ all -> 0x0082 }
            r2 = 0;	 Catch:{ all -> 0x0082 }
            r4 = 0;	 Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x0011;	 Catch:{ all -> 0x0082 }
            r5 = r2;	 Catch:{ all -> 0x0082 }
            goto L_0x002e;	 Catch:{ all -> 0x0082 }
            r1 = r10.zzbl;	 Catch:{ all -> 0x0082 }
            r1 = r1.get(r4);	 Catch:{ all -> 0x0082 }
            r1 = (com.google.android.gms.internal.zzag) r1;	 Catch:{ all -> 0x0082 }
            r5 = r1.time;	 Catch:{ all -> 0x0082 }
            r1 = r10.zzbl;	 Catch:{ all -> 0x0082 }
            r7 = r10.zzbl;	 Catch:{ all -> 0x0082 }
            r7 = r7.size();	 Catch:{ all -> 0x0082 }
            r7 = r7 - r0;	 Catch:{ all -> 0x0082 }
            r1 = r1.get(r7);	 Catch:{ all -> 0x0082 }
            r1 = (com.google.android.gms.internal.zzag) r1;	 Catch:{ all -> 0x0082 }
            r7 = r1.time;	 Catch:{ all -> 0x0082 }
            r5 = r7 - r5;
            r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
            if (r1 > 0) goto L_0x0034;
            monitor-exit(r10);
            return;
            r1 = r10.zzbl;	 Catch:{ all -> 0x0082 }
            r1 = r1.get(r4);	 Catch:{ all -> 0x0082 }
            r1 = (com.google.android.gms.internal.zzag) r1;	 Catch:{ all -> 0x0082 }
            r1 = r1.time;	 Catch:{ all -> 0x0082 }
            r3 = "(%-4d ms) %s";	 Catch:{ all -> 0x0082 }
            r7 = 2;	 Catch:{ all -> 0x0082 }
            r8 = new java.lang.Object[r7];	 Catch:{ all -> 0x0082 }
            r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x0082 }
            r8[r4] = r5;	 Catch:{ all -> 0x0082 }
            r8[r0] = r11;	 Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.zzaf.zzb(r3, r8);	 Catch:{ all -> 0x0082 }
            r11 = r10.zzbl;	 Catch:{ all -> 0x0082 }
            r11 = r11.iterator();	 Catch:{ all -> 0x0082 }
            r3 = r11.hasNext();	 Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0080;	 Catch:{ all -> 0x0082 }
            r3 = r11.next();	 Catch:{ all -> 0x0082 }
            r3 = (com.google.android.gms.internal.zzag) r3;	 Catch:{ all -> 0x0082 }
            r5 = r3.time;	 Catch:{ all -> 0x0082 }
            r8 = "(+%-4d) [%2d] %s";	 Catch:{ all -> 0x0082 }
            r9 = 3;	 Catch:{ all -> 0x0082 }
            r9 = new java.lang.Object[r9];	 Catch:{ all -> 0x0082 }
            r1 = r5 - r1;	 Catch:{ all -> 0x0082 }
            r1 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0082 }
            r9[r4] = r1;	 Catch:{ all -> 0x0082 }
            r1 = r3.zzbn;	 Catch:{ all -> 0x0082 }
            r1 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0082 }
            r9[r0] = r1;	 Catch:{ all -> 0x0082 }
            r1 = r3.name;	 Catch:{ all -> 0x0082 }
            r9[r7] = r1;	 Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.zzaf.zzb(r8, r9);	 Catch:{ all -> 0x0082 }
            r1 = r5;
            goto L_0x0054;
            monitor-exit(r10);
            return;
            r11 = move-exception;
            monitor-exit(r10);
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaf$zza.zzc(java.lang.String):void");
        }
    }

    public static void zza(String str, Object... objArr) {
        if (DEBUG) {
            Log.v(TAG, zzd(str, objArr));
        }
    }

    public static void zza(Throwable th, String str, Object... objArr) {
        Log.e(TAG, zzd(str, objArr), th);
    }

    public static void zzb(String str, Object... objArr) {
        Log.d(TAG, zzd(str, objArr));
    }

    public static void zzc(String str, Object... objArr) {
        Log.e(TAG, zzd(str, objArr));
    }

    private static String zzd(String str, Object... objArr) {
        String methodName;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(zzaf.class)) {
                String className = stackTrace[i].getClassName();
                className = className.substring(className.lastIndexOf(46) + 1);
                className = className.substring(className.lastIndexOf(36) + 1);
                methodName = stackTrace[i].getMethodName();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(className).length() + 1) + String.valueOf(methodName).length());
                stringBuilder.append(className);
                stringBuilder.append(".");
                stringBuilder.append(methodName);
                methodName = stringBuilder.toString();
                break;
            }
        }
        methodName = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), methodName, str});
    }
}
