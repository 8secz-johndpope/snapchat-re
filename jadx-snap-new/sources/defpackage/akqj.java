package defpackage;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: akqj */
public class akqj {
    static volatile akqj a = null;
    private static String c = "EventBus";
    private static final akqk d = new akqk();
    private static final Map<Class<?>, List<Class<?>>> e = new HashMap();
    final ExecutorService b;
    private final Map<Class<?>, CopyOnWriteArrayList<akqu>> f;
    private final Map<Object, List<Class<?>>> g;
    private final Map<Class<?>, Object> h;
    private final ThreadLocal<a> i;
    private final akqm j;
    private final akqi k;
    private final akqh l;
    private final akqt m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final int t;

    /* renamed from: akqj$1 */
    class 1 extends ThreadLocal<a> {
        1() {
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object initialValue() {
            return new a();
        }
    }

    /* renamed from: akqj$a */
    static final class a {
        final List<Object> a = new ArrayList();
        boolean b;
        boolean c;
        akqu d;
        Object e;
        boolean f;

        a() {
        }
    }

    /* renamed from: akqj$2 */
    static /* synthetic */ class 2 {
        static final /* synthetic */ int[] a = new int[ThreadMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = org.greenrobot.eventbus.ThreadMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.greenrobot.eventbus.ThreadMode.POSTING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.greenrobot.eventbus.ThreadMode.MAIN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = org.greenrobot.eventbus.ThreadMode.BACKGROUND;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = org.greenrobot.eventbus.ThreadMode.ASYNC;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akqj$2.<clinit>():void");
        }
    }

    public akqj() {
        this(d);
    }

    akqj(akqk akqk) {
        this.i = new 1();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new ConcurrentHashMap();
        this.j = new akqm(this, Looper.getMainLooper());
        this.k = new akqi(this);
        this.l = new akqh(this);
        this.t = 0;
        this.m = new akqt(null, false);
        this.o = akqk.a;
        this.p = akqk.b;
        this.q = akqk.c;
        this.r = akqk.d;
        this.n = akqk.e;
        this.s = akqk.f;
        this.b = akqk.h;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002e in {7, 8, 10, 13} preds:[]
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
    private static java.util.List<java.lang.Class<?>> a(java.lang.Class<?> r4) {
        /*
        r0 = e;
        monitor-enter(r0);
        r1 = e;	 Catch:{ all -> 0x002b }
        r1 = r1.get(r4);	 Catch:{ all -> 0x002b }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x002b }
        if (r1 != 0) goto L_0x0029;	 Catch:{ all -> 0x002b }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x002b }
        r1.<init>();	 Catch:{ all -> 0x002b }
        r2 = r4;	 Catch:{ all -> 0x002b }
        if (r2 == 0) goto L_0x0024;	 Catch:{ all -> 0x002b }
        r1.add(r2);	 Catch:{ all -> 0x002b }
        r3 = r2.getInterfaces();	 Catch:{ all -> 0x002b }
        defpackage.akqj.a(r1, r3);	 Catch:{ all -> 0x002b }
        r2 = r2.getSuperclass();	 Catch:{ all -> 0x002b }
        goto L_0x0013;	 Catch:{ all -> 0x002b }
        r2 = e;	 Catch:{ all -> 0x002b }
        r2.put(r4, r1);	 Catch:{ all -> 0x002b }
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        return r1;	 Catch:{ all -> 0x002b }
        r4 = move-exception;	 Catch:{ all -> 0x002b }
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqj.a(java.lang.Class):java.util.List");
    }

    private void a(akqu akqu, Object obj) {
        if (obj != null) {
            a(akqu, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    private void a(akqu akqu, Object obj, Throwable th) {
        String str;
        StringBuilder stringBuilder;
        if (obj instanceof akqr) {
            if (this.o) {
                str = c;
                stringBuilder = new StringBuilder("SubscriberExceptionEvent subscriber ");
                stringBuilder.append(akqu.a.getClass());
                stringBuilder.append(" threw an exception");
                Log.e(str, stringBuilder.toString(), th);
                akqr akqr = (akqr) obj;
                String str2 = c;
                StringBuilder stringBuilder2 = new StringBuilder("Initial event ");
                stringBuilder2.append(akqr.b);
                stringBuilder2.append(" caused exception in ");
                stringBuilder2.append(akqr.c);
                Log.e(str2, stringBuilder2.toString(), akqr.a);
            }
        } else if (this.n) {
            throw new akql("Invoking subscriber failed", th);
        } else {
            if (this.o) {
                str = c;
                stringBuilder = new StringBuilder("Could not dispatch event: ");
                stringBuilder.append(obj.getClass());
                stringBuilder.append(" to subscribing class ");
                stringBuilder.append(akqu.a.getClass());
                Log.e(str, stringBuilder.toString(), th);
            }
            if (this.q) {
                c(new akqr(this, th, obj, akqu.a));
            }
        }
    }

    private void a(akqu akqu, Object obj, boolean z) {
        int i = 2.a[akqu.b.b.ordinal()];
        if (i == 1) {
            b(akqu, obj);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.l.a(akqu, obj);
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder("Unknown thread mode: ");
                stringBuilder.append(akqu.b.b);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (z) {
                this.k.a(akqu, obj);
            } else {
                b(akqu, obj);
            }
        } else if (z) {
            b(akqu, obj);
        } else {
            this.j.a(akqu, obj);
        }
    }

    private void a(Object obj, a aVar) {
        int i;
        Class cls = obj.getClass();
        if (this.s) {
            List a = akqj.a(cls);
            i = 0;
            for (int i2 = 0; i2 < a.size(); i2++) {
                i |= a(obj, aVar, (Class) a.get(i2));
            }
        } else {
            i = a(obj, aVar, cls);
        }
        if (i == 0) {
            if (this.p) {
                Log.d(c, "No subscribers registered for event ".concat(String.valueOf(cls)));
            }
            if (this.r && cls != akqn.class && cls != akqr.class) {
                c(new akqn(this, obj));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00b4 in {2, 10, 11, 12, 15, 25, 26, 27, 28, 30} preds:[]
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
    private void a(java.lang.Object r8, defpackage.akqs r9) {
        /*
        r7 = this;
        r0 = r9.c;
        r1 = new akqu;
        r1.<init>(r8, r9);
        r2 = r7.f;
        r2 = r2.get(r0);
        r2 = (java.util.concurrent.CopyOnWriteArrayList) r2;
        if (r2 != 0) goto L_0x001c;
        r2 = new java.util.concurrent.CopyOnWriteArrayList;
        r2.<init>();
        r3 = r7.f;
        r3.put(r0, r2);
        goto L_0x0022;
        r3 = r2.contains(r1);
        if (r3 != 0) goto L_0x0094;
        r3 = r2.size();
        r4 = 0;
        if (r4 > r3) goto L_0x0040;
        if (r4 == r3) goto L_0x003d;
        r5 = r9.d;
        r6 = r2.get(r4);
        r6 = (defpackage.akqu) r6;
        r6 = r6.b;
        r6 = r6.d;
        if (r5 <= r6) goto L_0x003a;
        goto L_0x003d;
        r4 = r4 + 1;
        goto L_0x0027;
        r2.add(r4, r1);
        r2 = r7.g;
        r2 = r2.get(r8);
        r2 = (java.util.List) r2;
        if (r2 != 0) goto L_0x0054;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.g;
        r3.put(r8, r2);
        r2.add(r0);
        r8 = r9.e;
        if (r8 == 0) goto L_0x0093;
        r8 = r7.s;
        if (r8 == 0) goto L_0x008a;
        r8 = r7.h;
        r8 = r8.entrySet();
        r8 = r8.iterator();
        r9 = r8.hasNext();
        if (r9 == 0) goto L_0x0089;
        r9 = r8.next();
        r9 = (java.util.Map.Entry) r9;
        r2 = r9.getKey();
        r2 = (java.lang.Class) r2;
        r2 = r0.isAssignableFrom(r2);
        if (r2 == 0) goto L_0x0069;
        r9 = r9.getValue();
        r7.a(r1, r9);
        goto L_0x0069;
        return;
        r8 = r7.h;
        r8 = r8.get(r0);
        r7.a(r1, r8);
        return;
        r9 = new akql;
        r1 = new java.lang.StringBuilder;
        r2 = "Subscriber ";
        r1.<init>(r2);
        r8 = r8.getClass();
        r1.append(r8);
        r8 = " already registered to event ";
        r1.append(r8);
        r1.append(r0);
        r8 = r1.toString();
        r9.<init>(r8);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqj.a(java.lang.Object, akqs):void");
    }

    private static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Object obj : clsArr) {
            if (!list.contains(obj)) {
                list.add(obj);
                akqj.a((List) list, obj.getInterfaces());
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0042 in {14, 17, 19, 20, 24} preds:[]
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
    private boolean a(java.lang.Object r5, defpackage.akqj.a r6, java.lang.Class<?> r7) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f;	 Catch:{ all -> 0x003f }
        r7 = r0.get(r7);	 Catch:{ all -> 0x003f }
        r7 = (java.util.concurrent.CopyOnWriteArrayList) r7;	 Catch:{ all -> 0x003f }
        monitor-exit(r4);	 Catch:{ all -> 0x003f }
        r0 = 0;
        if (r7 == 0) goto L_0x003e;
        r1 = r7.isEmpty();
        if (r1 != 0) goto L_0x003e;
        r7 = r7.iterator();
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x003c;
        r1 = r7.next();
        r1 = (defpackage.akqu) r1;
        r6.e = r5;
        r6.d = r1;
        r2 = 0;
        r3 = r6.c;	 Catch:{ all -> 0x0034 }
        r4.a(r1, r5, r3);	 Catch:{ all -> 0x0034 }
        r6.e = r2;
        r6.d = r2;
        r6.f = r0;
        goto L_0x0017;
        r5 = move-exception;
        r6.e = r2;
        r6.d = r2;
        r6.f = r0;
        throw r5;
        r5 = 1;
        return r5;
        return r0;
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003f }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqj.a(java.lang.Object, akqj$a, java.lang.Class):boolean");
    }

    private void b(akqu akqu, Object obj) {
        try {
            akqu.b.a.invoke(akqu.a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            a(akqu, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(akqo akqo) {
        Object obj = akqo.a;
        akqu akqu = akqo.b;
        akqo.a(akqo);
        if (akqu.c) {
            b(akqu, obj);
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
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(java.lang.Object r3) {
        /*
        r2 = this;
        r0 = r3.getClass();
        r1 = r2.m;
        r0 = r1.a(r0);
        monitor-enter(r2);
        r0 = r0.iterator();	 Catch:{ all -> 0x0021 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0021 }
        if (r1 == 0) goto L_0x001f;	 Catch:{ all -> 0x0021 }
        r1 = r0.next();	 Catch:{ all -> 0x0021 }
        r1 = (defpackage.akqs) r1;	 Catch:{ all -> 0x0021 }
        r2.a(r3, r1);	 Catch:{ all -> 0x0021 }
        goto L_0x000f;	 Catch:{ all -> 0x0021 }
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        return;	 Catch:{ all -> 0x0021 }
        r3 = move-exception;	 Catch:{ all -> 0x0021 }
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqj.a(java.lang.Object):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0067 in {13, 14, 17, 21, 24} preds:[]
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
    public final synchronized void b(java.lang.Object r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.g;	 Catch:{ all -> 0x0064 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0064 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0064 }
        if (r0 == 0) goto L_0x004b;	 Catch:{ all -> 0x0064 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0064 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0064 }
        if (r1 == 0) goto L_0x0044;	 Catch:{ all -> 0x0064 }
        r1 = r0.next();	 Catch:{ all -> 0x0064 }
        r1 = (java.lang.Class) r1;	 Catch:{ all -> 0x0064 }
        r2 = r7.f;	 Catch:{ all -> 0x0064 }
        r1 = r2.get(r1);	 Catch:{ all -> 0x0064 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0064 }
        if (r1 == 0) goto L_0x000f;	 Catch:{ all -> 0x0064 }
        r2 = r1.size();	 Catch:{ all -> 0x0064 }
        r3 = 0;	 Catch:{ all -> 0x0064 }
        r4 = r2;	 Catch:{ all -> 0x0064 }
        r2 = 0;	 Catch:{ all -> 0x0064 }
        if (r2 >= r4) goto L_0x000f;	 Catch:{ all -> 0x0064 }
        r5 = r1.get(r2);	 Catch:{ all -> 0x0064 }
        r5 = (defpackage.akqu) r5;	 Catch:{ all -> 0x0064 }
        r6 = r5.a;	 Catch:{ all -> 0x0064 }
        if (r6 != r8) goto L_0x0041;	 Catch:{ all -> 0x0064 }
        r5.c = r3;	 Catch:{ all -> 0x0064 }
        r1.remove(r2);	 Catch:{ all -> 0x0064 }
        r2 = r2 + -1;	 Catch:{ all -> 0x0064 }
        r4 = r4 + -1;	 Catch:{ all -> 0x0064 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0064 }
        goto L_0x002c;	 Catch:{ all -> 0x0064 }
        r0 = r7.g;	 Catch:{ all -> 0x0064 }
        r0.remove(r8);	 Catch:{ all -> 0x0064 }
        monitor-exit(r7);
        return;
        r0 = c;	 Catch:{ all -> 0x0064 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0064 }
        r2 = "Subscriber to unregister was not registered before: ";	 Catch:{ all -> 0x0064 }
        r1.<init>(r2);	 Catch:{ all -> 0x0064 }
        r8 = r8.getClass();	 Catch:{ all -> 0x0064 }
        r1.append(r8);	 Catch:{ all -> 0x0064 }
        r8 = r1.toString();	 Catch:{ all -> 0x0064 }
        android.util.Log.w(r0, r8);	 Catch:{ all -> 0x0064 }
        monitor-exit(r7);
        return;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqj.b(java.lang.Object):void");
    }

    public final void c(Object obj) {
        a aVar = (a) this.i.get();
        List list = aVar.a;
        list.add(obj);
        if (!aVar.b) {
            aVar.c = Looper.getMainLooper() == Looper.myLooper();
            aVar.b = true;
            while (!list.isEmpty()) {
                try {
                    a(list.remove(0), aVar);
                } finally {
                    aVar.b = false;
                    aVar.c = false;
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("EventBus[indexCount=0");
        stringBuilder.append(", eventInheritance=");
        stringBuilder.append(this.s);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
