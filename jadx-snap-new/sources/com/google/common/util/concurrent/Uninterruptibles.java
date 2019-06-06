package com.google.common.util.concurrent;

import java.util.concurrent.Future;

public final class Uninterruptibles {
    public static <V> V getUninterruptibly(Future<V> future) {
        Future future2;
        Object obj = null;
        while (true) {
            try {
                future2 = future2.get();
                break;
            } catch (InterruptedException unused) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
        return future2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x002d in {7, 8, 13, 16, 17} preds:[]
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
    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> r3, long r4, java.util.concurrent.TimeUnit r6) {
        /*
        r0 = 0;
        r4 = r6.toNanos(r4);	 Catch:{ all -> 0x0022 }
        r1 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0022 }
        r1 = r1 + r4;
        r6 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ InterruptedException -> 0x001a }
        r3 = r3.get(r4, r6);	 Catch:{ InterruptedException -> 0x001a }
        if (r0 == 0) goto L_0x0019;
        r4 = java.lang.Thread.currentThread();
        r4.interrupt();
        return r3;
        r0 = 1;
        r4 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0022 }
        r4 = r1 - r4;
        goto L_0x000a;
        r3 = move-exception;
        if (r0 == 0) goto L_0x002c;
        r4 = java.lang.Thread.currentThread();
        r4.interrupt();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(java.util.concurrent.Future, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public static void joinUninterruptibly(Thread thread) {
        Object obj = null;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
    }
}
