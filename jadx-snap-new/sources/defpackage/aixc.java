package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aixc */
class aixc implements aiws {
    private static /* synthetic */ boolean g = (aixc.class.desiredAssertionStatus() ^ 1);
    private volatile boolean a;
    private aiwt b;
    aiws c;
    private aivw d;
    private List<Runnable> e = new ArrayList();
    private a f;

    /* renamed from: aixc$a */
    static class a implements aiwt {
        private static /* synthetic */ boolean d = (aixc.class.desiredAssertionStatus() ^ 1);
        final aiwt a;
        private volatile boolean b;
        private List<Runnable> c = new ArrayList();

        /* renamed from: aixc$a$2 */
        class 2 implements Runnable {
            2() {
            }

            public final void run() {
                a.this.a.a();
            }
        }

        public a(aiwt aiwt) {
            this.a = aiwt;
        }

        private void a(Runnable runnable) {
            synchronized (this) {
                if (this.b) {
                    runnable.run();
                    return;
                }
                this.c.add(runnable);
            }
        }

        public final void a() {
            if (this.b) {
                this.a.a();
            } else {
                a(new 2());
            }
        }

        public final void a(final aivl aivl) {
            a(new Runnable() {
                public final void run() {
                    a.this.a.a(aivl);
                }
            });
        }

        public final void a(final aivw aivw, final int i, final aivl aivl) {
            a(new Runnable() {
                public final void run() {
                    a.this.a.a(aivw, i, aivl);
                }
            });
        }

        public final void a(final aivw aivw, final aivl aivl) {
            a(new Runnable() {
                public final void run() {
                    a.this.a.a(aivw, aivl);
                }
            });
        }

        public final void a(final defpackage.aizc.a aVar) {
            if (this.b) {
                this.a.a(aVar);
            } else {
                a(new Runnable() {
                    public final void run() {
                        a.this.a.a(aVar);
                    }
                });
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0046 in {4, 6, 14, 20, 21, 25} preds:[]
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
        public final void b() {
            /*
            r3 = this;
            r0 = d;
            if (r0 != 0) goto L_0x000f;
            r0 = r3.b;
            if (r0 != 0) goto L_0x0009;
            goto L_0x000f;
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
            r0 = new java.util.ArrayList;
            r0.<init>();
            monitor-enter(r3);
            r1 = r3.c;	 Catch:{ all -> 0x0043 }
            r1 = r1.isEmpty();	 Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0025;	 Catch:{ all -> 0x0043 }
            r0 = 0;	 Catch:{ all -> 0x0043 }
            r3.c = r0;	 Catch:{ all -> 0x0043 }
            r0 = 1;	 Catch:{ all -> 0x0043 }
            r3.b = r0;	 Catch:{ all -> 0x0043 }
            monitor-exit(r3);	 Catch:{ all -> 0x0043 }
            return;	 Catch:{ all -> 0x0043 }
            r1 = r3.c;	 Catch:{ all -> 0x0043 }
            r3.c = r0;	 Catch:{ all -> 0x0043 }
            monitor-exit(r3);	 Catch:{ all -> 0x0043 }
            r0 = r1.iterator();
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x003e;
            r2 = r0.next();
            r2 = (java.lang.Runnable) r2;
            r2.run();
            goto L_0x002e;
            r1.clear();
            r0 = r1;
            goto L_0x0014;
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0043 }
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aixc$a.b():void");
        }
    }

    /* renamed from: aixc$12 */
    class 12 implements Runnable {
        12() {
        }

        public final void run() {
            aixc.this.c.d();
        }
    }

    /* renamed from: aixc$10 */
    class 10 implements Runnable {
        10() {
        }

        public final void run() {
            aixc.this.c.f();
        }
    }

    aixc() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x005c in {4, 6, 11, 13, 22, 23, 30, 31, 35} preds:[]
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
    private void a() {
        /*
        r3 = this;
        r0 = g;
        if (r0 != 0) goto L_0x000f;
        r0 = r3.c;
        if (r0 == 0) goto L_0x0009;
        goto L_0x000f;
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        r0 = g;
        if (r0 != 0) goto L_0x001e;
        r0 = r3.a;
        if (r0 != 0) goto L_0x0018;
        goto L_0x001e;
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        monitor-enter(r3);
        r1 = r3.e;	 Catch:{ all -> 0x0059 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0059 }
        if (r1 == 0) goto L_0x003b;	 Catch:{ all -> 0x0059 }
        r0 = 0;	 Catch:{ all -> 0x0059 }
        r3.e = r0;	 Catch:{ all -> 0x0059 }
        r0 = 1;	 Catch:{ all -> 0x0059 }
        r3.a = r0;	 Catch:{ all -> 0x0059 }
        r0 = r3.f;	 Catch:{ all -> 0x0059 }
        monitor-exit(r3);	 Catch:{ all -> 0x0059 }
        if (r0 == 0) goto L_0x003a;
        r0.b();
        return;
        r1 = r3.e;	 Catch:{ all -> 0x0059 }
        r3.e = r0;	 Catch:{ all -> 0x0059 }
        monitor-exit(r3);	 Catch:{ all -> 0x0059 }
        r0 = r1.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0054;
        r2 = r0.next();
        r2 = (java.lang.Runnable) r2;
        r2.run();
        goto L_0x0044;
        r1.clear();
        r0 = r1;
        goto L_0x0023;
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0059 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixc.a():void");
    }

    private void a(Runnable runnable) {
        synchronized (this) {
            if (this.a) {
                runnable.run();
                return;
            }
            this.e.add(runnable);
        }
    }

    public final void a(final int i) {
        if (this.a) {
            this.c.a(i);
        } else {
            a(new Runnable() {
                public final void run() {
                    aixc.this.c.a(i);
                }
            });
        }
    }

    public final void a(final aium aium) {
        Preconditions.checkNotNull(aium, "compressor");
        a(new Runnable() {
            public final void run() {
                aixc.this.c.a(aium);
            }
        });
    }

    public final void a(final aius aius) {
        a(new Runnable() {
            public final void run() {
                aixc.this.c.a(aius);
            }
        });
    }

    public final void a(final aiuu aiuu) {
        Preconditions.checkNotNull(aiuu, "decompressorRegistry");
        a(new Runnable() {
            public final void run() {
                aixc.this.c.a(aiuu);
            }
        });
    }

    public void a(final aivw aivw) {
        Object obj;
        aiwt aiwt;
        Preconditions.checkNotNull(aivw, "reason");
        synchronized (this) {
            if (this.c == null) {
                this.c = aiyh.a;
                obj = null;
                aiwt = this.b;
                this.d = aivw;
            } else {
                obj = 1;
                aiwt = null;
            }
        }
        if (obj != null) {
            a(new Runnable() {
                public final void run() {
                    aixc.this.c.a(aivw);
                }
            });
            return;
        }
        if (aiwt != null) {
            aiwt.a(aivw, new aivl());
        }
        a();
    }

    /* Access modifiers changed, original: final */
    public final void a(aiws aiws) {
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            this.c = (aiws) Preconditions.checkNotNull(aiws, "stream");
            a();
        }
    }

    public final void a(aiwt aiwt) {
        aivw aivw;
        boolean z;
        Preconditions.checkState(this.b == null, "already started");
        synchronized (this) {
            this.b = (aiwt) Preconditions.checkNotNull(aiwt, "listener");
            aivw = this.d;
            z = this.a;
            if (!z) {
                a aVar = new a(aiwt);
                this.f = aVar;
                aiwt = aVar;
            }
        }
        if (aivw != null) {
            aiwt.a(aivw, new aivl());
        } else if (z) {
            this.c.a(aiwt);
        } else {
            a(new Runnable() {
                public final void run() {
                    aixc.this.c.a(aiwt);
                }
            });
        }
    }

    public final void a(final InputStream inputStream) {
        Preconditions.checkNotNull(inputStream, ErrorFields.MESSAGE);
        if (this.a) {
            this.c.a(inputStream);
        } else {
            a(new Runnable() {
                public final void run() {
                    aixc.this.c.a(inputStream);
                }
            });
        }
    }

    public final void a(final String str) {
        Preconditions.checkState(this.b == null, "May only be called before start");
        Preconditions.checkNotNull(str, "authority");
        a(new Runnable() {
            public final void run() {
                aixc.this.c.a(str);
            }
        });
    }

    public final void b(final int i) {
        if (this.a) {
            this.c.b(i);
        } else {
            a(new Runnable() {
                public final void run() {
                    aixc.this.c.b(i);
                }
            });
        }
    }

    public final void c(final int i) {
        if (this.a) {
            this.c.c(i);
        } else {
            a(new Runnable() {
                public final void run() {
                    aixc.this.c.c(i);
                }
            });
        }
    }

    public final void d() {
        a(new 12());
    }

    public final void f() {
        if (this.a) {
            this.c.f();
        } else {
            a(new 10());
        }
    }
}
