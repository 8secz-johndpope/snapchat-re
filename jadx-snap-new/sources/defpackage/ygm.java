package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Longs;
import defpackage.yes.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.ClassModifier.removeFieldUsageFromConstructor(ClassModifier.java:119)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:77)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:50)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:41)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:12)
    	at jadx.core.ProcessClass.process(ProcessClass.java:32)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
    */
/* renamed from: ygm */
public class ygm<T extends ygp, A extends ygl<T>> {
    private long a;
    final ygn<T, A> b;
    final ScheduledExecutorService c;
    final ajwy<yex> d;
    final ajwy<yex> e;
    protected final Map<String, a> f;
    protected final Map<T, A> g;
    final Object h;
    volatile boolean i;

    /* renamed from: ygm$a */
    public class a implements defpackage.yes.a {
        public final A a;
        final ygo<T> b;
        yes c;
        public Set<d> d;
        ScheduledFuture e;
        final Object f;
        final Map<String, abpx<b<T, A>>> g;
        private final Set<T> h;
        private /* synthetic */ ygm i;

        /* renamed from: ygm$a$2 */
        class 2 implements Runnable {
            2() {
            }

            public final void run() {
                Set emptySet = Collections.emptySet();
                try {
                    yes a = a.this.a();
                    synchronized (a.this.f) {
                        a.this.e = null;
                        if (a != null) {
                            emptySet = a.this.d;
                            a.this.d = new HashSet();
                        }
                    }
                    if (a != null) {
                        for (d dVar : emptySet) {
                            a.a(dVar.a, dVar.b);
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0073 in {3, 6, 8} preds:[]
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
        public a(A r5) {
            /*
            r3 = this;
            r3.i = r4;
            r3.<init>();
            r4 = new java.util.HashSet;
            r4.<init>();
            r3.d = r4;
            r4 = new java.lang.Object;
            r4.<init>();
            r3.f = r4;
            r4 = new java.util.HashMap;
            r4.<init>();
            r3.g = r4;
            r3.a = r5;
            r4 = r5.f();
            r3.h = r4;
            r4 = r5.h();
            r3.b = r4;
            r4 = new java.util.HashSet;
            r4.<init>();
            r0 = r3.h;
            r0 = r0.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0047;
            r1 = r0.next();
            r1 = (defpackage.ygp) r1;
            r1 = r1.a();
            r4.add(r1);
            goto L_0x0033;
            r0 = r4.size();
            r1 = r3.h;
            r1 = r1.size();
            if (r0 != r1) goto L_0x0054;
            return;
            r0 = new java.lang.IllegalStateException;
            r1 = 2;
            r1 = new java.lang.Object[r1];
            r2 = 0;
            r1[r2] = r5;
            r5 = 1;
            r2 = ",";
            r2 = com.google.common.base.Joiner.on(r2);
            r4 = r2.join(r4);
            r1[r5] = r4;
            r4 = "All file extensions should be unique per group: %s [%s]";
            r4 = java.lang.String.format(r4, r1);
            r0.<init>(r4);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ygm$a.<init>(ygm, ygl):void");
        }

        public final synchronized yes a() {
            return this.c;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
        public final synchronized defpackage.yes a(boolean r14) {
            /*
            r13 = this;
            monitor-enter(r13);
            r0 = r13.c;	 Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x0091;
        L_0x0005:
            r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0093 }
            r2 = r13.i;	 Catch:{ all -> 0x0093 }
            r2 = r2.b;	 Catch:{ all -> 0x0093 }
            r3 = r13.a;	 Catch:{ all -> 0x0093 }
            r5 = r2.a(r3);	 Catch:{ all -> 0x0093 }
            r2 = r13.a;	 Catch:{ all -> 0x0093 }
            r6 = r2.c();	 Catch:{ all -> 0x0093 }
            if (r14 != 0) goto L_0x0026;
        L_0x001b:
            r14 = r13.a;	 Catch:{ all -> 0x0093 }
            r14 = r14.g();	 Catch:{ all -> 0x0093 }
            if (r14 == 0) goto L_0x0024;
        L_0x0023:
            goto L_0x0026;
        L_0x0024:
            r14 = 0;
            goto L_0x0027;
        L_0x0026:
            r14 = 1;
        L_0x0027:
            r2 = r13.i;	 Catch:{ all -> 0x0093 }
            r8 = r2.c;	 Catch:{ all -> 0x0093 }
            r10 = new ihl;	 Catch:{ all -> 0x0093 }
            r10.<init>();	 Catch:{ all -> 0x0093 }
            r2 = r13.i;	 Catch:{ all -> 0x0093 }
            r2 = r2.d;	 Catch:{ all -> 0x0093 }
            r2 = r2.get();	 Catch:{ all -> 0x0093 }
            r11 = r2;
            r11 = (defpackage.yex) r11;	 Catch:{ all -> 0x0093 }
            r2 = r13.i;	 Catch:{ all -> 0x0093 }
            r2 = r2.e;	 Catch:{ all -> 0x0093 }
            r2 = r2.get();	 Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x0052;
        L_0x0045:
            r2 = r13.i;	 Catch:{ all -> 0x0093 }
            r2 = r2.e;	 Catch:{ all -> 0x0093 }
            r2 = r2.get();	 Catch:{ all -> 0x0093 }
            r2 = com.google.common.collect.ImmutableSet.of(r2);	 Catch:{ all -> 0x0093 }
            goto L_0x0056;
        L_0x0052:
            r2 = com.google.common.collect.ImmutableSet.of();	 Catch:{ all -> 0x0093 }
        L_0x0056:
            r12 = r2;
            r2 = 0;
            r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
            if (r4 <= 0) goto L_0x0089;
        L_0x005d:
            r2 = new yes;	 Catch:{ all -> 0x0093 }
            r4 = r2;
            r9 = r13;
            r4.<init>(r5, r6, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0093 }
            r2.a(r14);	 Catch:{ all -> 0x0093 }
            r13.c = r2;	 Catch:{ all -> 0x0093 }
            r3 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0093 }
            r0 = r3 - r0;
            r5 = r13.i;	 Catch:{ all -> 0x0093 }
            r6 = r13.a;	 Catch:{ all -> 0x0093 }
            r9 = r2.b();	 Catch:{ all -> 0x0093 }
            r7 = r0;
            r5.a(r6, r7, r9);	 Catch:{ all -> 0x0093 }
            r14 = r13.i;	 Catch:{ all -> 0x0093 }
            r14 = r14.c;	 Catch:{ all -> 0x0093 }
            r3 = new ygm$a$1;	 Catch:{ all -> 0x0093 }
            r3.<init>(r0);	 Catch:{ all -> 0x0093 }
            r14.execute(r3);	 Catch:{ all -> 0x0093 }
            r0 = r2;
            goto L_0x0091;
        L_0x0089:
            r14 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0093 }
            r0 = "maxSize <= 0";
            r14.<init>(r0);	 Catch:{ all -> 0x0093 }
            throw r14;	 Catch:{ all -> 0x0093 }
        L_0x0091:
            monitor-exit(r13);
            return r0;
        L_0x0093:
            r14 = move-exception;
            monitor-exit(r13);
            throw r14;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ygm$a.a(boolean):yes");
        }

        public final void a(String str, boolean z) {
            this.i.a(this.a, str, z);
        }

        public final void a(T t, String str, long j) {
            String a = this.i.a((ygp) t, str);
            synchronized (this.f) {
                this.d.add(new d(a, j));
                if (this.e != null) {
                    return;
                }
                this.e = this.i.c.schedule(new 2(), 1000, TimeUnit.MILLISECONDS);
            }
        }

        public final boolean a(String str) {
            c c = c(str);
            boolean z = c == null || !a(c.a, c.b);
            if (!z) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c.b);
                stringBuilder.append(c.a.a());
            }
            return z;
        }

        public final synchronized boolean a(T t, String str) {
            boolean z = false;
            if (!this.i.i) {
                return false;
            }
            String a = this.i.a((ygp) t, str);
            synchronized (this.g) {
                abpx abpx = (abpx) this.g.get(a);
                if (!(abpx == null || abpx.c())) {
                    z = true;
                }
            }
            return z;
        }

        public final void b(String str) {
            c c = c(str);
            ygo ygo = this.b;
            if (ygo != null && c != null) {
                ygo.a(c.a);
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final c<T> c(String str) {
            for (ygp ygp : this.h) {
                if (str.endsWith(ygp.a())) {
                    return new c(ygp, str.substring(0, str.length() - ygp.a().length()));
                }
            }
            return null;
        }
    }

    /* renamed from: ygm$b */
    public static class b<T extends ygp, A extends ygl<T>> {
        final A a;
        final String b;
        private final ygm<T, A> c;

        protected b(A a, String str, ygm<T, A> ygm) {
            this.a = a;
            this.b = str;
            this.c = ygm;
        }

        public final void a() {
            ygm.a(this.c, this);
        }
    }

    /* renamed from: ygm$d */
    static class d {
        public final String a;
        public final long b;

        public d(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    /* renamed from: ygm$c */
    static class c<T extends ygp> {
        public final T a;
        public final String b;

        public c(T t, String str) {
            this.a = t;
            this.b = str;
        }
    }

    public ygm(ScheduledExecutorService scheduledExecutorService, ygn<T, A> ygn, ajwy<yex> ajwy, ajwy<yex> ajwy2) {
        this(scheduledExecutorService, ygn, ajwy, ajwy2, (byte) 0);
    }

    private ygm(ScheduledExecutorService scheduledExecutorService, ygn<T, A> ygn, ajwy<yex> ajwy, ajwy<yex> ajwy2, byte b) {
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new Object();
        this.i = false;
        this.b = ygn;
        this.c = scheduledExecutorService;
        this.d = ajwy;
        this.e = ajwy2;
        this.a = 1000;
    }

    /* JADX WARNING: Missing block: B:15:0x0036, code skipped:
            return;
     */
    static /* synthetic */ void a(defpackage.ygm r3, defpackage.ygm.b r4) {
        /*
        r0 = r3.i;
        if (r0 == 0) goto L_0x003a;
    L_0x0004:
        r3 = r3.f;
        r0 = r4.a;
        r0 = r0.e();
        r3 = r3.get(r0);
        r3 = (defpackage.ygm.a) r3;
        if (r3 == 0) goto L_0x003a;
    L_0x0014:
        r0 = r3.g;
        monitor-enter(r0);
        r1 = r3.g;	 Catch:{ all -> 0x0037 }
        r2 = r4.b;	 Catch:{ all -> 0x0037 }
        r1 = r1.get(r2);	 Catch:{ all -> 0x0037 }
        r1 = (defpackage.abpx) r1;	 Catch:{ all -> 0x0037 }
        if (r1 != 0) goto L_0x0025;
    L_0x0023:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x0025:
        r1.d(r4);	 Catch:{ all -> 0x0037 }
        r1 = r1.c();	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x0035;
    L_0x002e:
        r3 = r3.g;	 Catch:{ all -> 0x0037 }
        r4 = r4.b;	 Catch:{ all -> 0x0037 }
        r3.remove(r4);	 Catch:{ all -> 0x0037 }
    L_0x0035:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x0037:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        throw r3;
    L_0x003a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygm.a(ygm, ygm$b):void");
    }

    private yes b(T t) {
        return a(a((ygp) t), false);
    }

    private void b(T t, String str, long j) {
        ygl a = a((ygp) t);
        a aVar = (a) this.f.get(a.e());
        if (aVar != null) {
            aVar.a(t, str, j);
        } else {
            throw new IllegalArgumentException("Invalid file group: ".concat(String.valueOf(a)));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x001a in {7, 9, 11, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void d() {
        /*
        r2 = this;
        r0 = r2.h;
        monitor-enter(r0);
        r1 = r2.i;	 Catch:{ all -> 0x0017 }
        if (r1 != 0) goto L_0x0015;
        r1 = r2.h;	 Catch:{ InterruptedException -> 0x000d }
        r1.wait();	 Catch:{ InterruptedException -> 0x000d }
        goto L_0x0003;
    L_0x000d:
        r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0017 }
        r1.interrupt();	 Catch:{ all -> 0x0017 }
        goto L_0x0003;	 Catch:{ all -> 0x0017 }
        monitor-exit(r0);	 Catch:{ all -> 0x0017 }
        return;	 Catch:{ all -> 0x0017 }
        r1 = move-exception;	 Catch:{ all -> 0x0017 }
        monitor-exit(r0);	 Catch:{ all -> 0x0017 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygm.d():void");
    }

    private boolean m(T t, String str) {
        d();
        a aVar = (a) this.f.get(a((ygp) t).e());
        return aVar == null ? false : aVar.a((ygp) t, str);
    }

    private /* synthetic */ void n(ygp ygp, String str) {
        synchronized (this) {
            a(ygp, str);
            boolean m = m(ygp, str);
            boolean j = j(ygp, str);
            if (!(m || j)) {
                f(ygp, str);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(T t, String str) {
        d();
        boolean containsKey = this.g.containsKey(t);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(t);
        stringBuilder.append(" is not supported, did you forget to inject?");
        Preconditions.checkArgument(containsKey, stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(t.a());
        return stringBuilder2.toString();
    }

    public final ArrayList<String> a(A a) {
        yes a2 = a((ygl) a, false);
        a2.d();
        Set<String> g = a2.d.g();
        a aVar = (a) this.f.get(a.e());
        ArrayList arrayList = new ArrayList();
        for (String c : g) {
            c c2 = aVar.c(c);
            if (c2 != null) {
                arrayList.add(c2.b);
            }
        }
        return arrayList;
    }

    public final synchronized b a(T t, String str, int i) {
        IOException e;
        if (i > 0) {
            String a;
            try {
                yes b = b((ygp) t);
                a = a((ygp) t, str);
                try {
                    a = b.a(a, i);
                    return a;
                } catch (IOException e2) {
                    e = e2;
                    String.format(Locale.US, "Failed to get a file editor for key [%s, %d]: %s", new Object[]{a, Integer.valueOf(i), e.getMessage()});
                    return null;
                }
            } catch (IOException e3) {
                e = e3;
                a = null;
                String.format(Locale.US, "Failed to get a file editor for key [%s, %d]: %s", new Object[]{a, Integer.valueOf(i), e.getMessage()});
                return null;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Value count %d must be positive for id [%s] fileType [%s]", new Object[]{Integer.valueOf(i), str, t.a()}));
    }

    /* Access modifiers changed, original: protected|final */
    public final yes a(A a, boolean z) {
        a aVar;
        synchronized (this.h) {
            d();
            if (this.f.containsKey(a.e())) {
                aVar = (a) this.f.get(a.e());
            } else {
                throw new IllegalArgumentException("Invalid file group: ".concat(String.valueOf(a)));
            }
        }
        return aVar.a(z);
    }

    public final yeu a(T t, String str, long j) {
        ygl a = a((ygp) t);
        String a2 = a((ygp) t, str);
        File a3 = this.b.a(a);
        Iterable arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            File a4 = yes.a(a3, a2, i);
            if (!a4.exists()) {
                break;
            }
            arrayList.add(a4);
            arrayList2.add(Long.valueOf(a4.length()));
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        b(t, str, j);
        return new yey((File[]) Iterables.toArray(arrayList, File.class), Longs.toArray(arrayList2));
    }

    /* Access modifiers changed, original: protected|final */
    public final A a(T t) {
        d();
        if (this.g.containsKey(t)) {
            return (ygl) this.g.get(t);
        }
        throw new IllegalArgumentException("Invalid file type: ".concat(String.valueOf(t)));
    }

    public final void a() {
        if (!this.i) {
            a(null, false);
        }
    }

    public final void a(Set<A> set) {
        a((Set) set, false);
    }

    public final void a(final Set<A> set, final boolean z) {
        this.c.execute(new Runnable() {
            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:43:0x00cc in {13, 16, 18, 20, 23, 25, 35, 36, 38, 42} preds:[]
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
            public final void run() {
                /*
                r9 = this;
                r0 = defpackage.ygm.this;
                r0 = r0.h;
                monitor-enter(r0);
                r1 = defpackage.ygm.this;	 Catch:{ all -> 0x00c9 }
                r1 = r1.i;	 Catch:{ all -> 0x00c9 }
                if (r1 != 0) goto L_0x00aa;	 Catch:{ all -> 0x00c9 }
                java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00c9 }
                r1 = defpackage.ygm.this;	 Catch:{ all -> 0x00c9 }
                r1 = r1.b;	 Catch:{ all -> 0x00c9 }
                r1 = r1.a();	 Catch:{ all -> 0x00c9 }
                r1 = r1.iterator();	 Catch:{ all -> 0x00c9 }
                r2 = 0;	 Catch:{ all -> 0x00c9 }
                r3 = 0;	 Catch:{ all -> 0x00c9 }
                r4 = r1.hasNext();	 Catch:{ all -> 0x00c9 }
                r5 = 1;	 Catch:{ all -> 0x00c9 }
                if (r4 == 0) goto L_0x0089;	 Catch:{ all -> 0x00c9 }
                r4 = r1.next();	 Catch:{ all -> 0x00c9 }
                r4 = (defpackage.ygl) r4;	 Catch:{ all -> 0x00c9 }
                r6 = r4.f();	 Catch:{ all -> 0x00c9 }
                r7 = r6.isEmpty();	 Catch:{ all -> 0x00c9 }
                if (r7 != 0) goto L_0x0079;	 Catch:{ all -> 0x00c9 }
                r5 = r6.size();	 Catch:{ all -> 0x00c9 }
                r3 = r3 + r5;	 Catch:{ all -> 0x00c9 }
                r5 = r6.iterator();	 Catch:{ all -> 0x00c9 }
                r6 = r5.hasNext();	 Catch:{ all -> 0x00c9 }
                if (r6 == 0) goto L_0x0050;	 Catch:{ all -> 0x00c9 }
                r6 = r5.next();	 Catch:{ all -> 0x00c9 }
                r6 = (defpackage.ygp) r6;	 Catch:{ all -> 0x00c9 }
                r7 = defpackage.ygm.this;	 Catch:{ all -> 0x00c9 }
                r7 = r7.g;	 Catch:{ all -> 0x00c9 }
                r7.put(r6, r4);	 Catch:{ all -> 0x00c9 }
                goto L_0x003c;	 Catch:{ all -> 0x00c9 }
                r5 = defpackage.ygm.this;	 Catch:{ all -> 0x00c9 }
                r5 = r5.f;	 Catch:{ all -> 0x00c9 }
                r6 = r4.e();	 Catch:{ all -> 0x00c9 }
                r5 = r5.containsKey(r6);	 Catch:{ all -> 0x00c9 }
                if (r5 != 0) goto L_0x0071;	 Catch:{ all -> 0x00c9 }
                r5 = defpackage.ygm.this;	 Catch:{ all -> 0x00c9 }
                r5 = r5.f;	 Catch:{ all -> 0x00c9 }
                r6 = r4.e();	 Catch:{ all -> 0x00c9 }
                r7 = new ygm$a;	 Catch:{ all -> 0x00c9 }
                r8 = defpackage.ygm.this;	 Catch:{ all -> 0x00c9 }
                r7.<init>(r4);	 Catch:{ all -> 0x00c9 }
                r5.put(r6, r7);	 Catch:{ all -> 0x00c9 }
                goto L_0x001c;	 Catch:{ all -> 0x00c9 }
                r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00c9 }
                r2 = "File group keys must be unique.";	 Catch:{ all -> 0x00c9 }
                r1.<init>(r2);	 Catch:{ all -> 0x00c9 }
                throw r1;	 Catch:{ all -> 0x00c9 }
                r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00c9 }
                r3 = "File group %s is invalid as it doesn't have any files";	 Catch:{ all -> 0x00c9 }
                r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x00c9 }
                r5[r2] = r4;	 Catch:{ all -> 0x00c9 }
                r2 = java.lang.String.format(r3, r5);	 Catch:{ all -> 0x00c9 }
                r1.<init>(r2);	 Catch:{ all -> 0x00c9 }
                throw r1;	 Catch:{ all -> 0x00c9 }
                r1 = defpackage.ygm.this;	 Catch:{ all -> 0x00c9 }
                r1 = r1.g;	 Catch:{ all -> 0x00c9 }
                r1 = r1.size();	 Catch:{ all -> 0x00c9 }
                if (r1 != r3) goto L_0x00a2;	 Catch:{ all -> 0x00c9 }
                java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00c9 }
                r1 = defpackage.ygm.this;	 Catch:{ all -> 0x00c9 }
                r1.i = r5;	 Catch:{ all -> 0x00c9 }
                r1 = defpackage.ygm.this;	 Catch:{ all -> 0x00c9 }
                r1 = r1.h;	 Catch:{ all -> 0x00c9 }
                r1.notifyAll();	 Catch:{ all -> 0x00c9 }
                goto L_0x00aa;	 Catch:{ all -> 0x00c9 }
                r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00c9 }
                r2 = "Please make sure all file types are unique.";	 Catch:{ all -> 0x00c9 }
                r1.<init>(r2);	 Catch:{ all -> 0x00c9 }
                throw r1;	 Catch:{ all -> 0x00c9 }
                monitor-exit(r0);	 Catch:{ all -> 0x00c9 }
                r0 = r3;
                if (r0 == 0) goto L_0x00c8;
                r0 = r0.iterator();
                r1 = r0.hasNext();
                if (r1 == 0) goto L_0x00c8;
                r1 = r0.next();
                r1 = (defpackage.ygl) r1;
                r2 = defpackage.ygm.this;	 Catch:{ IOException -> 0x00c7 }
                r3 = r4;	 Catch:{ IOException -> 0x00c7 }
                r2.a(r1, r3);	 Catch:{ IOException -> 0x00c7 }
                goto L_0x00b3;
                goto L_0x00b3;
                return;
                r1 = move-exception;
                monitor-exit(r0);	 Catch:{ all -> 0x00c9 }
                throw r1;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ygm$1.run():void");
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void a(A a, long j, long j2) {
    }

    /* Access modifiers changed, original: protected */
    public void a(A a, String str, boolean z) {
    }

    public final boolean a(T t, String str, boolean z) {
        if (z) {
            ygl a = a((ygp) t);
            return yes.a(this.b.a(a), a((ygp) t, str), 0).exists();
        }
        boolean e;
        synchronized (this) {
            try {
                e = b((ygp) t).e(a((ygp) t, str));
            } catch (IOException unused) {
                return false;
            } catch (Throwable th) {
            }
        }
        return e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:50:0x0061 in {17, 18, 27, 31, 36, 38, 41, 46, 49} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized void b(java.util.Set<A> r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.h;	 Catch:{ all -> 0x005e }
        monitor-enter(r0);	 Catch:{ all -> 0x005e }
        r6 = r6.iterator();	 Catch:{ all -> 0x005b }
        r1 = r6.hasNext();	 Catch:{ all -> 0x005b }
        if (r1 == 0) goto L_0x0058;	 Catch:{ all -> 0x005b }
        r1 = r6.next();	 Catch:{ all -> 0x005b }
        r1 = (defpackage.ygl) r1;	 Catch:{ all -> 0x005b }
        r2 = r5.f;	 Catch:{ all -> 0x005b }
        r3 = r1.e();	 Catch:{ all -> 0x005b }
        r2 = r2.get(r3);	 Catch:{ all -> 0x005b }
        r2 = (defpackage.ygm.a) r2;	 Catch:{ all -> 0x005b }
        if (r2 == 0) goto L_0x004e;
        monitor-enter(r2);	 Catch:{ IOException -> 0x004e }
        r3 = r2.c;	 Catch:{ all -> 0x004b }
        if (r3 == 0) goto L_0x003a;	 Catch:{ all -> 0x004b }
        r3 = r2.c;	 Catch:{ all -> 0x004b }
        r4 = r3.d;	 Catch:{ all -> 0x004b }
        if (r4 == 0) goto L_0x0032;	 Catch:{ all -> 0x004b }
        r4 = r3.d;	 Catch:{ all -> 0x004b }
        r4.n();	 Catch:{ all -> 0x004b }
        r3.close();	 Catch:{ all -> 0x004b }
        r3 = r3.c;	 Catch:{ all -> 0x004b }
        defpackage.yev.b(r3);	 Catch:{ all -> 0x004b }
        r3 = 0;	 Catch:{ all -> 0x004b }
        r2.c = r3;	 Catch:{ all -> 0x004b }
        monitor-exit(r2);	 Catch:{ all -> 0x004b }
        r3 = r2.g;	 Catch:{ IOException -> 0x004e }
        monitor-enter(r3);	 Catch:{ IOException -> 0x004e }
        r2 = r2.g;	 Catch:{ all -> 0x0048 }
        r2.clear();	 Catch:{ all -> 0x0048 }
        monitor-exit(r3);	 Catch:{ all -> 0x0048 }
        goto L_0x004e;	 Catch:{ all -> 0x0048 }
        r2 = move-exception;	 Catch:{ all -> 0x0048 }
        monitor-exit(r3);	 Catch:{ all -> 0x0048 }
        throw r2;	 Catch:{ IOException -> 0x004e }
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x004b }
        throw r3;	 Catch:{ IOException -> 0x004e }
    L_0x004e:
        r2 = r5.b;	 Catch:{ all -> 0x005b }
        r1 = r2.a(r1);	 Catch:{ all -> 0x005b }
        defpackage.ygr.b(r1);	 Catch:{ all -> 0x005b }
        goto L_0x0008;	 Catch:{ all -> 0x005b }
        monitor-exit(r0);	 Catch:{ all -> 0x005b }
        monitor-exit(r5);
        return;
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005b }
        throw r6;	 Catch:{ all -> 0x005e }
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygm.b(java.util.Set):void");
    }

    public final void b(A a) {
        try {
            a((ygl) a, false).c();
        } catch (IOException unused) {
        }
    }

    public final boolean b() {
        return this.i;
    }

    public final boolean b(T t, String str) {
        return a((ygp) t, str, false);
    }

    public final yeu c(T t, String str) {
        IOException e;
        String a;
        try {
            yes b = b((ygp) t);
            a = a((ygp) t, str);
            try {
                a = b.f(a);
                return a;
            } catch (IOException e2) {
                e = e2;
                String.format(Locale.US, "Failed to get a file snapshot for key [%s]: %s", new Object[]{a, e.getMessage()});
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            a = null;
            String.format(Locale.US, "Failed to get a file snapshot for key [%s]: %s", new Object[]{a, e.getMessage()});
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0024 in {6, 8, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void c() {
        /*
        r3 = this;
        r0 = r3.h;
        monitor-enter(r0);
        r1 = r3.f;	 Catch:{ all -> 0x0021 }
        r1 = r1.values();	 Catch:{ all -> 0x0021 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0021 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0021 }
        if (r2 == 0) goto L_0x001f;	 Catch:{ all -> 0x0021 }
        r2 = r1.next();	 Catch:{ all -> 0x0021 }
        r2 = (defpackage.ygm.a) r2;	 Catch:{ all -> 0x0021 }
        r2 = r2.a;	 Catch:{ all -> 0x0021 }
        r3.b(r2);	 Catch:{ all -> 0x0021 }
        goto L_0x000d;	 Catch:{ all -> 0x0021 }
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        return;	 Catch:{ all -> 0x0021 }
        r1 = move-exception;	 Catch:{ all -> 0x0021 }
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygm.c():void");
    }

    public final yeu d(T t, String str) {
        return a((ygp) t, str, -1);
    }

    public final synchronized b e(T t, String str) {
        IOException e;
        String a;
        try {
            yes b = b((ygp) t);
            a = a((ygp) t, str);
            try {
                a = b.a(a, -2);
                return a;
            } catch (IOException e2) {
                e = e2;
                String.format(Locale.US, "Failed to get a file editor for key [%s]: %s", new Object[]{a, e.getMessage()});
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            a = null;
            String.format(Locale.US, "Failed to get a file editor for key [%s]: %s", new Object[]{a, e.getMessage()});
            return null;
        }
    }

    public final synchronized boolean f(T t, String str) {
        try {
        } catch (IOException unused) {
            return false;
        }
        return b((ygp) t).g(a((ygp) t, str));
    }

    public final void g(T t, String str) {
        this.c.execute(new -$$Lambda$ygm$D08qNM8M-9UJZ2DUgO7bmc7VQH8(this, t, str));
    }

    public final synchronized void h(T t, String str) {
        try {
            b((ygp) t).a(a((ygp) t, str));
        } catch (IOException unused) {
        }
    }

    public final synchronized void i(T t, String str) {
        try {
            b((ygp) t).b(a((ygp) t, str));
        } catch (IOException unused) {
        }
    }

    public final synchronized boolean j(T t, String str) {
        try {
        } catch (IOException unused) {
            return false;
        }
        return b((ygp) t).d(a((ygp) t, str));
    }

    public final synchronized void k(T t, String str) {
        try {
            b((ygp) t).c(a((ygp) t, str));
        } catch (IOException unused) {
        }
    }

    public final b<T, A> l(T t, String str) {
        d();
        ygl a = a((ygp) t);
        a aVar = (a) this.f.get(a.e());
        if (aVar != null) {
            b bVar = new b(a, a((ygp) t, str), this);
            synchronized (aVar.g) {
                abpx abpx = (abpx) aVar.g.get(bVar.b);
                if (abpx == null) {
                    abpx = new abpx();
                }
                abpx.c(bVar);
                aVar.g.put(bVar.b, abpx);
            }
            return bVar;
        }
        throw new IllegalArgumentException("Invalid file group: ".concat(String.valueOf(a)));
    }
}
