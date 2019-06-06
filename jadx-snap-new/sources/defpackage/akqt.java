package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: akqt */
final class akqt {
    private static final Map<Class<?>, List<akqs>> a = new ConcurrentHashMap();
    private static final a[] e = new a[4];
    private List<akqw> b = null;
    private final boolean c = false;
    private final boolean d = false;

    /* renamed from: akqt$a */
    static class a {
        final List<akqs> a = new ArrayList();
        final Map<Class, Object> b = new HashMap();
        final Map<String, Class> c = new HashMap();
        final StringBuilder d = new StringBuilder(128);
        Class<?> e;
        Class<?> f;
        boolean g;
        akqv h;

        a() {
        }

        private boolean b(Method method, Class<?> cls) {
            this.d.setLength(0);
            this.d.append(method.getName());
            StringBuilder stringBuilder = this.d;
            stringBuilder.append('>');
            stringBuilder.append(cls.getName());
            String stringBuilder2 = this.d.toString();
            Class declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.c.put(stringBuilder2, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.c.put(stringBuilder2, cls2);
            return false;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            if (!this.g) {
                this.f = this.f.getSuperclass();
                String name = this.f.getName();
                if (!(name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android."))) {
                    return;
                }
            }
            this.f = null;
        }

        /* Access modifiers changed, original: final */
        public final void a(Class<?> cls) {
            this.f = cls;
            this.e = cls;
            this.g = false;
            this.h = null;
        }

        /* Access modifiers changed, original: final */
        public final boolean a(Method method, Class<?> cls) {
            Object put = this.b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }
    }

    akqt(List<akqw> list, boolean z) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0021 in {10, 11, 14, 18} preds:[]
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
    private static defpackage.akqt.a a() {
        /*
        r0 = e;
        monitor-enter(r0);
        r1 = 0;
        r2 = 4;
        if (r1 >= r2) goto L_0x0017;
        r2 = e;	 Catch:{ all -> 0x001e }
        r2 = r2[r1];	 Catch:{ all -> 0x001e }
        if (r2 == 0) goto L_0x0014;	 Catch:{ all -> 0x001e }
        r3 = e;	 Catch:{ all -> 0x001e }
        r4 = 0;	 Catch:{ all -> 0x001e }
        r3[r1] = r4;	 Catch:{ all -> 0x001e }
        monitor-exit(r0);	 Catch:{ all -> 0x001e }
        return r2;	 Catch:{ all -> 0x001e }
        r1 = r1 + 1;	 Catch:{ all -> 0x001e }
        goto L_0x0004;	 Catch:{ all -> 0x001e }
        monitor-exit(r0);	 Catch:{ all -> 0x001e }
        r0 = new akqt$a;
        r0.<init>();
        return r0;
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001e }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqt.a():akqt$a");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x003e in {7, 8, 10, 13} preds:[]
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
    private static java.util.List<defpackage.akqs> a(defpackage.akqt.a r4) {
        /*
        r0 = new java.util.ArrayList;
        r1 = r4.a;
        r0.<init>(r1);
        r1 = r4.a;
        r1.clear();
        r1 = r4.b;
        r1.clear();
        r1 = r4.c;
        r1.clear();
        r1 = r4.d;
        r2 = 0;
        r1.setLength(r2);
        r1 = 0;
        r4.e = r1;
        r4.f = r1;
        r4.g = r2;
        r4.h = r1;
        r1 = e;
        monitor-enter(r1);
        r3 = 4;
        if (r2 >= r3) goto L_0x0039;
        r3 = e;	 Catch:{ all -> 0x003b }
        r3 = r3[r2];	 Catch:{ all -> 0x003b }
        if (r3 != 0) goto L_0x0036;	 Catch:{ all -> 0x003b }
        r3 = e;	 Catch:{ all -> 0x003b }
        r3[r2] = r4;	 Catch:{ all -> 0x003b }
        goto L_0x0039;	 Catch:{ all -> 0x003b }
        r2 = r2 + 1;	 Catch:{ all -> 0x003b }
        goto L_0x0028;	 Catch:{ all -> 0x003b }
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
        return r0;	 Catch:{ all -> 0x003b }
        r4 = move-exception;	 Catch:{ all -> 0x003b }
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqt.a(akqt$a):java.util.List");
    }

    private akqv b(a aVar) {
        akqv c;
        if (!(aVar.h == null || aVar.h.c() == null)) {
            c = aVar.h.c();
            if (aVar.f == c.a()) {
                return c;
            }
        }
        List<akqw> list = this.b;
        if (list != null) {
            for (akqw a : list) {
                c = a.a();
                if (c != null) {
                    return c;
                }
            }
        }
        return null;
    }

    private List<akqs> b(Class<?> cls) {
        a a = akqt.a();
        a.a(cls);
        while (a.f != null) {
            a.h = b(a);
            if (a.h != null) {
                for (akqs akqs : a.h.b()) {
                    if (a.a(akqs.a, akqs.c)) {
                        a.a.add(akqs);
                    }
                }
            } else {
                c(a);
            }
            a.a();
        }
        return akqt.a(a);
    }

    private void c(a aVar) {
        Method[] declaredMethods;
        try {
            declaredMethods = aVar.f.getDeclaredMethods();
        } catch (Throwable unused) {
            declaredMethods = aVar.f.getMethods();
            aVar.g = true;
        }
        for (Method method : declaredMethods) {
            int modifiers = method.getModifiers();
            String str = ".";
            StringBuilder stringBuilder;
            String stringBuilder2;
            StringBuilder stringBuilder3;
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    akqq akqq = (akqq) method.getAnnotation(akqq.class);
                    if (akqq != null) {
                        Class cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.a.add(new akqs(method, cls, akqq.a(), akqq.c(), akqq.b()));
                        }
                    }
                } else if (this.c && method.isAnnotationPresent(akqq.class)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(method.getDeclaringClass().getName());
                    stringBuilder.append(str);
                    stringBuilder.append(method.getName());
                    stringBuilder2 = stringBuilder.toString();
                    stringBuilder3 = new StringBuilder("@Subscribe method ");
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append("must have exactly 1 parameter but has ");
                    stringBuilder3.append(parameterTypes.length);
                    throw new akql(stringBuilder3.toString());
                }
            } else if (this.c && method.isAnnotationPresent(akqq.class)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(method.getDeclaringClass().getName());
                stringBuilder.append(str);
                stringBuilder.append(method.getName());
                stringBuilder2 = stringBuilder.toString();
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(" is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                throw new akql(stringBuilder3.toString());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final List<akqs> a(Class<?> cls) {
        List list = (List) a.get(cls);
        if (list != null) {
            return list;
        }
        list = b((Class) cls);
        if (list.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder("Subscriber ");
            stringBuilder.append(cls);
            stringBuilder.append(" and its super classes have no public methods with the @Subscribe annotation");
            throw new akql(stringBuilder.toString());
        }
        a.put(cls, list);
        return list;
    }
}
