package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ajeo */
public final class ajeo extends RuntimeException {
    public final List<Throwable> a;
    private final String b;
    private Throwable c;

    /* renamed from: ajeo$a */
    static final class a extends RuntimeException {
        a() {
        }

        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: ajeo$b */
    static abstract class b {
        b() {
        }

        public abstract void a(Object obj);
    }

    /* renamed from: ajeo$c */
    static final class c extends b {
        private final PrintStream a;

        c(PrintStream printStream) {
            this.a = printStream;
        }

        /* Access modifiers changed, original: final */
        public final void a(Object obj) {
            this.a.println(obj);
        }
    }

    /* renamed from: ajeo$d */
    static final class d extends b {
        private final PrintWriter a;

        d(PrintWriter printWriter) {
            this.a = printWriter;
        }

        /* Access modifiers changed, original: final */
        public final void a(Object obj) {
            this.a.println(obj);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0074 in {7, 9, 10, 11, 12, 16, 18} preds:[]
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
    public ajeo(java.lang.Iterable<? extends java.lang.Throwable> r5) {
        /*
        r4 = this;
        r4.<init>();
        r0 = new java.util.LinkedHashSet;
        r0.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        if (r5 == 0) goto L_0x0039;
        r5 = r5.iterator();
        r2 = r5.hasNext();
        if (r2 == 0) goto L_0x0043;
        r2 = r5.next();
        r2 = (java.lang.Throwable) r2;
        r3 = r2 instanceof defpackage.ajeo;
        if (r3 == 0) goto L_0x002b;
        r2 = (defpackage.ajeo) r2;
        r2 = r2.a;
        r0.addAll(r2);
        goto L_0x0013;
        if (r2 == 0) goto L_0x002e;
        goto L_0x0035;
        r2 = new java.lang.NullPointerException;
        r3 = "Throwable was null!";
        r2.<init>(r3);
        r0.add(r2);
        goto L_0x0013;
        r5 = new java.lang.NullPointerException;
        r2 = "errors was null";
        r5.<init>(r2);
        r0.add(r5);
        r5 = r0.isEmpty();
        if (r5 != 0) goto L_0x006c;
        r1.addAll(r0);
        r5 = java.util.Collections.unmodifiableList(r1);
        r4.a = r5;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = r4.a;
        r0 = r0.size();
        r5.append(r0);
        r0 = " exceptions occurred. ";
        r5.append(r0);
        r5 = r5.toString();
        r4.b = r5;
        return;
        r5 = new java.lang.IllegalArgumentException;
        r0 = "errors is empty";
        r5.<init>(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajeo.<init>(java.lang.Iterable):void");
    }

    public ajeo(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    private static List<Throwable> a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                th = cause.getCause();
                if (th == null || th == cause) {
                    break;
                }
                cause = th;
            }
        }
        return arrayList;
    }

    private void a(b bVar) {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(this);
        stringBuilder.append(10);
        for (Object obj : getStackTrace()) {
            stringBuilder.append("\tat ");
            stringBuilder.append(obj);
            stringBuilder.append(10);
        }
        int i = 1;
        for (Throwable th : this.a) {
            stringBuilder.append("  ComposedException ");
            stringBuilder.append(i);
            stringBuilder.append(" :\n");
            ajeo.a(stringBuilder, th, "\t");
            i++;
        }
        bVar.a(stringBuilder.toString());
    }

    private static void a(StringBuilder stringBuilder, Throwable th, String str) {
        while (true) {
            Object th2;
            stringBuilder.append(str);
            stringBuilder.append(th2);
            stringBuilder.append(10);
            for (Object obj : th2.getStackTrace()) {
                stringBuilder.append("\t\tat ");
                stringBuilder.append(obj);
                stringBuilder.append(10);
            }
            if (th2.getCause() != null) {
                stringBuilder.append("\tCaused by: ");
                th2 = th2.getCause();
                str = "";
            } else {
                return;
            }
        }
    }

    private static Throwable b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            th = cause.getCause();
            if (th == null || th == cause) {
                return cause;
            }
            cause = th;
        }
        return cause;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0062 in {14, 16, 18, 20, 21, 24, 27} preds:[]
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
    public final synchronized java.lang.Throwable getCause() {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.c;	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x005b;	 Catch:{ all -> 0x005f }
        r0 = new ajeo$a;	 Catch:{ all -> 0x005f }
        r0.<init>();	 Catch:{ all -> 0x005f }
        r1 = new java.util.HashSet;	 Catch:{ all -> 0x005f }
        r1.<init>();	 Catch:{ all -> 0x005f }
        r2 = r8.a;	 Catch:{ all -> 0x005f }
        r2 = r2.iterator();	 Catch:{ all -> 0x005f }
        r3 = r0;	 Catch:{ all -> 0x005f }
        r4 = r2.hasNext();	 Catch:{ all -> 0x005f }
        if (r4 == 0) goto L_0x0059;	 Catch:{ all -> 0x005f }
        r4 = r2.next();	 Catch:{ all -> 0x005f }
        r4 = (java.lang.Throwable) r4;	 Catch:{ all -> 0x005f }
        r5 = r1.contains(r4);	 Catch:{ all -> 0x005f }
        if (r5 != 0) goto L_0x0016;	 Catch:{ all -> 0x005f }
        r1.add(r4);	 Catch:{ all -> 0x005f }
        r5 = defpackage.ajeo.a(r4);	 Catch:{ all -> 0x005f }
        r5 = r5.iterator();	 Catch:{ all -> 0x005f }
        r6 = r5.hasNext();	 Catch:{ all -> 0x005f }
        if (r6 == 0) goto L_0x0051;	 Catch:{ all -> 0x005f }
        r6 = r5.next();	 Catch:{ all -> 0x005f }
        r6 = (java.lang.Throwable) r6;	 Catch:{ all -> 0x005f }
        r7 = r1.contains(r6);	 Catch:{ all -> 0x005f }
        if (r7 == 0) goto L_0x004d;	 Catch:{ all -> 0x005f }
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x005f }
        r6 = "Duplicate found in causal chain so cropping to prevent loop ...";	 Catch:{ all -> 0x005f }
        r4.<init>(r6);	 Catch:{ all -> 0x005f }
        goto L_0x0033;	 Catch:{ all -> 0x005f }
        r1.add(r6);	 Catch:{ all -> 0x005f }
        goto L_0x0033;
        r3.initCause(r4);	 Catch:{ Throwable -> 0x0054 }
    L_0x0054:
        r3 = defpackage.ajeo.b(r3);	 Catch:{ all -> 0x005f }
        goto L_0x0016;	 Catch:{ all -> 0x005f }
        r8.c = r0;	 Catch:{ all -> 0x005f }
        r0 = r8.c;	 Catch:{ all -> 0x005f }
        monitor-exit(r8);
        return r0;
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajeo.getCause():java.lang.Throwable");
    }

    public final String getMessage() {
        return this.b;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        a(new c(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        a(new d(printWriter));
    }
}
