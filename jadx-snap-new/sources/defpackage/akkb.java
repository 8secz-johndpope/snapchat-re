package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: akkb */
public class akkb extends akkw {
    static final long a = TimeUnit.SECONDS.toMillis(60);
    static final long b = TimeUnit.MILLISECONDS.toNanos(a);
    static akkb c;
    akkb d;
    long e;
    private boolean g;

    /* renamed from: akkb$a */
    static final class a extends Thread {
        a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x0064 in {10, 16, 17, 18, 21, 26, 30, 35} preds:[]
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
        public final void run() {
            /*
            r9 = this;
        L_0x0000:
            r0 = defpackage.akkb.class;	 Catch:{ InterruptedException -> 0x0000 }
            monitor-enter(r0);	 Catch:{ InterruptedException -> 0x0000 }
            r1 = defpackage.akkb.c;	 Catch:{ all -> 0x0061 }
            r1 = r1.d;	 Catch:{ all -> 0x0061 }
            r2 = 0;	 Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0029;	 Catch:{ all -> 0x0061 }
            r3 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0061 }
            r1 = defpackage.akkb.class;	 Catch:{ all -> 0x0061 }
            r5 = defpackage.akkb.a;	 Catch:{ all -> 0x0061 }
            r1.wait(r5);	 Catch:{ all -> 0x0061 }
            r1 = defpackage.akkb.c;	 Catch:{ all -> 0x0061 }
            r1 = r1.d;	 Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0046;	 Catch:{ all -> 0x0061 }
            r5 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0061 }
            r5 = r5 - r3;	 Catch:{ all -> 0x0061 }
            r3 = defpackage.akkb.b;	 Catch:{ all -> 0x0061 }
            r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));	 Catch:{ all -> 0x0061 }
            if (r1 < 0) goto L_0x0046;	 Catch:{ all -> 0x0061 }
            r1 = defpackage.akkb.c;	 Catch:{ all -> 0x0061 }
            goto L_0x0050;	 Catch:{ all -> 0x0061 }
            r3 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0061 }
            r5 = r1.e;	 Catch:{ all -> 0x0061 }
            r5 = r5 - r3;	 Catch:{ all -> 0x0061 }
            r3 = 0;	 Catch:{ all -> 0x0061 }
            r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));	 Catch:{ all -> 0x0061 }
            if (r7 <= 0) goto L_0x0048;	 Catch:{ all -> 0x0061 }
            r3 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;	 Catch:{ all -> 0x0061 }
            r7 = r5 / r3;	 Catch:{ all -> 0x0061 }
            java.lang.Long.signum(r7);
            r3 = r3 * r7;
            r5 = r5 - r3;
            r1 = defpackage.akkb.class;	 Catch:{ all -> 0x0061 }
            r3 = (int) r5;	 Catch:{ all -> 0x0061 }
            r1.wait(r7, r3);	 Catch:{ all -> 0x0061 }
            r1 = r2;	 Catch:{ all -> 0x0061 }
            goto L_0x0050;	 Catch:{ all -> 0x0061 }
            r3 = defpackage.akkb.c;	 Catch:{ all -> 0x0061 }
            r4 = r1.d;	 Catch:{ all -> 0x0061 }
            r3.d = r4;	 Catch:{ all -> 0x0061 }
            r1.d = r2;	 Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0054;	 Catch:{ all -> 0x0061 }
            monitor-exit(r0);	 Catch:{ all -> 0x0061 }
            goto L_0x0000;	 Catch:{ all -> 0x0061 }
            r3 = defpackage.akkb.c;	 Catch:{ all -> 0x0061 }
            if (r1 != r3) goto L_0x005c;	 Catch:{ all -> 0x0061 }
            defpackage.akkb.c = r2;	 Catch:{ all -> 0x0061 }
            monitor-exit(r0);	 Catch:{ all -> 0x0061 }
            return;	 Catch:{ all -> 0x0061 }
            monitor-exit(r0);	 Catch:{ all -> 0x0061 }
            r1.a();	 Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000;
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0061 }
            throw r1;	 Catch:{ InterruptedException -> 0x0000 }
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akkb$a.run():void");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x006e in {5, 9, 10, 13, 15, 21, 22, 27, 29, 32, 35} preds:[]
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
    private static synchronized void a(defpackage.akkb r6, long r7, boolean r9) {
        /*
        r0 = defpackage.akkb.class;
        monitor-enter(r0);
        r1 = c;	 Catch:{ all -> 0x006b }
        if (r1 != 0) goto L_0x0016;	 Catch:{ all -> 0x006b }
        r1 = new akkb;	 Catch:{ all -> 0x006b }
        r1.<init>();	 Catch:{ all -> 0x006b }
        c = r1;	 Catch:{ all -> 0x006b }
        r1 = new akkb$a;	 Catch:{ all -> 0x006b }
        r1.<init>();	 Catch:{ all -> 0x006b }
        r1.start();	 Catch:{ all -> 0x006b }
        r1 = java.lang.System.nanoTime();	 Catch:{ all -> 0x006b }
        r3 = 0;	 Catch:{ all -> 0x006b }
        r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));	 Catch:{ all -> 0x006b }
        if (r5 == 0) goto L_0x002f;	 Catch:{ all -> 0x006b }
        if (r9 == 0) goto L_0x002f;	 Catch:{ all -> 0x006b }
        r3 = r6.c();	 Catch:{ all -> 0x006b }
        r3 = r3 - r1;	 Catch:{ all -> 0x006b }
        r7 = java.lang.Math.min(r7, r3);	 Catch:{ all -> 0x006b }
        r7 = r7 + r1;	 Catch:{ all -> 0x006b }
        r6.e = r7;	 Catch:{ all -> 0x006b }
        goto L_0x003c;	 Catch:{ all -> 0x006b }
        r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));	 Catch:{ all -> 0x006b }
        if (r5 == 0) goto L_0x0034;	 Catch:{ all -> 0x006b }
        goto L_0x002b;	 Catch:{ all -> 0x006b }
        if (r9 == 0) goto L_0x0065;	 Catch:{ all -> 0x006b }
        r7 = r6.c();	 Catch:{ all -> 0x006b }
        r6.e = r7;	 Catch:{ all -> 0x006b }
        r7 = r6.e;	 Catch:{ all -> 0x006b }
        r7 = r7 - r1;	 Catch:{ all -> 0x006b }
        r9 = c;	 Catch:{ all -> 0x006b }
        r3 = r9.d;	 Catch:{ all -> 0x006b }
        if (r3 == 0) goto L_0x0052;	 Catch:{ all -> 0x006b }
        r3 = r9.d;	 Catch:{ all -> 0x006b }
        r3 = r3.e;	 Catch:{ all -> 0x006b }
        r3 = r3 - r1;	 Catch:{ all -> 0x006b }
        r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));	 Catch:{ all -> 0x006b }
        if (r5 >= 0) goto L_0x004f;	 Catch:{ all -> 0x006b }
        goto L_0x0052;	 Catch:{ all -> 0x006b }
        r9 = r9.d;	 Catch:{ all -> 0x006b }
        goto L_0x0041;	 Catch:{ all -> 0x006b }
        r7 = r9.d;	 Catch:{ all -> 0x006b }
        r6.d = r7;	 Catch:{ all -> 0x006b }
        r9.d = r6;	 Catch:{ all -> 0x006b }
        r6 = c;	 Catch:{ all -> 0x006b }
        if (r9 != r6) goto L_0x0063;	 Catch:{ all -> 0x006b }
        r6 = defpackage.akkb.class;	 Catch:{ all -> 0x006b }
        r6.notify();	 Catch:{ all -> 0x006b }
        monitor-exit(r0);
        return;
        monitor-exit(r0);
        return;
        r6 = new java.lang.AssertionError;	 Catch:{ all -> 0x006b }
        r6.<init>();	 Catch:{ all -> 0x006b }
        throw r6;	 Catch:{ all -> 0x006b }
        r6 = move-exception;
        monitor-exit(r0);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkb.a(akkb, long, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x001d in {8, 10, 13, 14, 17} preds:[]
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
    private static synchronized boolean a(defpackage.akkb r3) {
        /*
        r0 = defpackage.akkb.class;
        monitor-enter(r0);
        r1 = c;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0018;	 Catch:{ all -> 0x001a }
        r2 = r1.d;	 Catch:{ all -> 0x001a }
        if (r2 != r3) goto L_0x0015;	 Catch:{ all -> 0x001a }
        r2 = r3.d;	 Catch:{ all -> 0x001a }
        r1.d = r2;	 Catch:{ all -> 0x001a }
        r1 = 0;	 Catch:{ all -> 0x001a }
        r3.d = r1;	 Catch:{ all -> 0x001a }
        r3 = 0;
        monitor-exit(r0);
        return r3;
        r1 = r1.d;	 Catch:{ all -> 0x001a }
        goto L_0x0005;
        r3 = 1;
        goto L_0x0013;
        r3 = move-exception;
        monitor-exit(r0);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkb.a(akkb):boolean");
    }

    public final akku a(final akku akku) {
        return new akku() {
            public final akkw a() {
                return akkb.this;
            }

            public final void a_(akkd akkd, long j) {
                akkx.a(akkd.b, 0, j);
                while (true) {
                    long j2 = 0;
                    if (j > 0) {
                        while (j2 < 65536) {
                            j2 += (long) (akkd.a.c - akkd.a.b);
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                        }
                        akkb.this.aq_();
                        try {
                            akku.a_(akkd, j2);
                            j -= j2;
                            akkb.this.a(true);
                        } catch (IOException e) {
                            throw akkb.this.b(e);
                        } catch (Throwable th) {
                            akkb.this.a(false);
                        }
                    } else {
                        return;
                    }
                }
            }

            public final void close() {
                akkb.this.aq_();
                try {
                    akku.close();
                    akkb.this.a(true);
                } catch (IOException e) {
                    throw akkb.this.b(e);
                } catch (Throwable th) {
                    akkb.this.a(false);
                }
            }

            public final void flush() {
                akkb.this.aq_();
                try {
                    akku.flush();
                    akkb.this.a(true);
                } catch (IOException e) {
                    throw akkb.this.b(e);
                } catch (Throwable th) {
                    akkb.this.a(false);
                }
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.sink(");
                stringBuilder.append(akku);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    public final akkv a(final akkv akkv) {
        return new akkv() {
            public final long a(akkd akkd, long j) {
                akkb.this.aq_();
                try {
                    long a = akkv.a(akkd, j);
                    akkb.this.a(true);
                    return a;
                } catch (IOException e) {
                    throw akkb.this.b(e);
                } catch (Throwable th) {
                    akkb.this.a(false);
                }
            }

            public final akkw a() {
                return akkb.this;
            }

            public final void close() {
                try {
                    akkv.close();
                    akkb.this.a(true);
                } catch (IOException e) {
                    throw akkb.this.b(e);
                } catch (Throwable th) {
                    akkb.this.a(false);
                }
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.source(");
                stringBuilder.append(akkv);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    /* Access modifiers changed, original: protected */
    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (ar_() && z) {
            throw a(null);
        }
    }

    public final void aq_() {
        if (this.g) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long as_ = as_();
        boolean at_ = at_();
        if (as_ != 0 || at_) {
            this.g = true;
            akkb.a(this, as_, at_);
        }
    }

    public final boolean ar_() {
        if (!this.g) {
            return false;
        }
        this.g = false;
        return akkb.a(this);
    }

    /* Access modifiers changed, original: final */
    public final IOException b(IOException iOException) {
        return !ar_() ? iOException : a(iOException);
    }
}
