package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: abl */
public final class abl implements abd {
    private final abj<a, Object> a;
    private final b b;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c;
    private final Map<Class<?>, abc<?>> d;
    private final int e;
    private int f;

    /* renamed from: abl$a */
    static final class a implements abo {
        int a;
        private final b b;
        private Class<?> c;

        a(b bVar) {
            this.b = bVar;
        }

        public final void a() {
            this.b.a(this);
        }

        /* Access modifiers changed, original: final */
        public final void a(int i, Class<?> cls) {
            this.a = i;
            this.c = cls;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.a * 31;
            Class cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Key{size=");
            stringBuilder.append(this.a);
            stringBuilder.append("array=");
            stringBuilder.append(this.c);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: abl$b */
    static final class b extends abf<a> {
        b() {
        }

        /* Access modifiers changed, original: final */
        public final a a(int i, Class<?> cls) {
            a aVar = (a) b();
            aVar.a(i, cls);
            return aVar;
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ abo a() {
            return new a(this);
        }
    }

    public abl() {
        this.a = new abj();
        this.b = new b();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    public abl(int i) {
        this.a = new abj();
        this.b = new b();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }

    private <T> T a(a aVar) {
        return this.a.a((abo) aVar);
    }

    private <T> T a(a aVar, Class<T> cls) {
        abc c = c(cls);
        Object a = a(aVar);
        if (a != null) {
            this.f -= c.a(a) * c.b();
            b(c.a(a), cls);
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(c.a(), 2)) {
            String a2 = c.a();
            StringBuilder stringBuilder = new StringBuilder("Allocated ");
            stringBuilder.append(aVar.a);
            stringBuilder.append(" bytes");
            Log.v(a2, stringBuilder.toString());
        }
        return c.a(aVar.a);
    }

    private <T> abc<T> b(T t) {
        return c(t.getClass());
    }

    private NavigableMap<Integer, Integer> b(Class<?> cls) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private void b(int i) {
        while (this.f > i) {
            Object a = this.a.a();
            ahl.a(a, "Argument must not be null");
            abc b = b(a);
            this.f -= b.a(a) * b.b();
            b(b.a(a), a.getClass());
            if (Log.isLoggable(b.a(), 2)) {
                String a2 = b.a();
                StringBuilder stringBuilder = new StringBuilder("evicted: ");
                stringBuilder.append(b.a(a));
                Log.v(a2, stringBuilder.toString());
            }
        }
    }

    private void b(int i, Class<?> cls) {
        NavigableMap b = b((Class) cls);
        Integer num = (Integer) b.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder stringBuilder = new StringBuilder("Tried to decrement empty size, size: ");
            stringBuilder.append(i);
            stringBuilder.append(", this: ");
            stringBuilder.append(this);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num.intValue() == 1) {
            b.remove(Integer.valueOf(i));
        } else {
            b.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    private <T> abc<T> c(Class<T> cls) {
        abc<T> abc = (abc) this.d.get(cls);
        if (abc == null) {
            if (cls.equals(int[].class)) {
                abc = new abk();
            } else if (cls.equals(byte[].class)) {
                abc = new abi();
            } else {
                StringBuilder stringBuilder = new StringBuilder("No array pool found for: ");
                stringBuilder.append(cls.getSimpleName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.d.put(cls, abc);
        }
        return abc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    public final synchronized <T> T a(int r6, java.lang.Class<T> r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.b(r7);	 Catch:{ all -> 0x0048 }
        r1 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0048 }
        r0 = r0.ceilingKey(r1);	 Catch:{ all -> 0x0048 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x0048 }
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x002e;
    L_0x0013:
        r3 = r5.f;	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0022;
    L_0x0017:
        r3 = r5.e;	 Catch:{ all -> 0x0048 }
        r4 = r5.f;	 Catch:{ all -> 0x0048 }
        r3 = r3 / r4;
        r4 = 2;
        if (r3 < r4) goto L_0x0020;
    L_0x001f:
        goto L_0x0022;
    L_0x0020:
        r3 = 0;
        goto L_0x0023;
    L_0x0022:
        r3 = 1;
    L_0x0023:
        if (r3 != 0) goto L_0x002f;
    L_0x0025:
        r3 = r0.intValue();	 Catch:{ all -> 0x0048 }
        r4 = r6 << 3;
        if (r3 > r4) goto L_0x002e;
    L_0x002d:
        goto L_0x002f;
    L_0x002e:
        r1 = 0;
    L_0x002f:
        if (r1 == 0) goto L_0x003c;
    L_0x0031:
        r6 = r5.b;	 Catch:{ all -> 0x0048 }
        r0 = r0.intValue();	 Catch:{ all -> 0x0048 }
        r6 = r6.a(r0, r7);	 Catch:{ all -> 0x0048 }
        goto L_0x0042;
    L_0x003c:
        r0 = r5.b;	 Catch:{ all -> 0x0048 }
        r6 = r0.a(r6, r7);	 Catch:{ all -> 0x0048 }
    L_0x0042:
        r6 = r5.a(r6, r7);	 Catch:{ all -> 0x0048 }
        monitor-exit(r5);
        return r6;
    L_0x0048:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abl.a(int, java.lang.Class):java.lang.Object");
    }

    public final synchronized <T> T a(Class<T> cls) {
        return a(this.b.a(8, cls), (Class) cls);
    }

    public final synchronized void a() {
        b(0);
    }

    /* JADX WARNING: Missing block: B:15:0x001c, code skipped:
            return;
     */
    public final synchronized void a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = 40;
        if (r2 < r0) goto L_0x000c;
    L_0x0005:
        r1.a();	 Catch:{ all -> 0x000a }
        monitor-exit(r1);
        return;
    L_0x000a:
        r2 = move-exception;
        goto L_0x001d;
    L_0x000c:
        r0 = 20;
        if (r2 >= r0) goto L_0x0014;
    L_0x0010:
        r0 = 15;
        if (r2 != r0) goto L_0x001b;
    L_0x0014:
        r2 = r1.e;	 Catch:{ all -> 0x000a }
        r2 = r2 / 2;
        r1.b(r2);	 Catch:{ all -> 0x000a }
    L_0x001b:
        monitor-exit(r1);
        return;
    L_0x001d:
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abl.a(int):void");
    }

    public final synchronized <T> void a(T t) {
        Class cls = t.getClass();
        abc c = c(cls);
        int a = c.a((Object) t);
        int b = c.b() * a;
        int i = 1;
        if ((b <= this.e / 2 ? 1 : null) != null) {
            a a2 = this.b.a(a, cls);
            this.a.a(a2, t);
            NavigableMap b2 = b(cls);
            Integer num = (Integer) b2.get(Integer.valueOf(a2.a));
            Integer valueOf = Integer.valueOf(a2.a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            b2.put(valueOf, Integer.valueOf(i));
            this.f += b;
            b(this.e);
        }
    }
}
