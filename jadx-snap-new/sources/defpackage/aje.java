package defpackage;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.util.Log;
import defpackage.ajj.a;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: aje */
public final class aje implements ajg, a, akg.a {
    private final Map<aio, ajf> a;
    private final aji b;
    private final akg c;
    private final a d;
    private final Map<aio, WeakReference<ajj<?>>> e;
    private final ajo f;
    private final b g;
    private ReferenceQueue<ajj<?>> h;

    /* renamed from: aje$b */
    static class b implements ajc.a {
        private final ajz.a a;
        private volatile ajz b;

        public b(ajz.a aVar) {
            this.a = aVar;
        }

        public final ajz a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.build();
                    }
                    if (this.b == null) {
                        this.b = new aka();
                    }
                }
            }
            return this.b;
        }
    }

    /* renamed from: aje$a */
    static class a {
        final ExecutorService a;
        final ExecutorService b;
        final ajg c;

        public a(ExecutorService executorService, ExecutorService executorService2, ajg ajg) {
            this.a = executorService;
            this.b = executorService2;
            this.c = ajg;
        }
    }

    /* renamed from: aje$e */
    static class e extends WeakReference<ajj<?>> {
        final aio a;

        public e(aio aio, ajj<?> ajj, ReferenceQueue<? super ajj<?>> referenceQueue) {
            super(ajj, referenceQueue);
            this.a = aio;
        }
    }

    /* renamed from: aje$c */
    public static class c {
        public final ajf a;
        public final aoo b;

        public c(aoo aoo, ajf ajf) {
            this.b = aoo;
            this.a = ajf;
        }
    }

    /* renamed from: aje$d */
    static class d implements IdleHandler {
        private final Map<aio, WeakReference<ajj<?>>> a;
        private final ReferenceQueue<ajj<?>> b;

        public d(Map<aio, WeakReference<ajj<?>>> map, ReferenceQueue<ajj<?>> referenceQueue) {
            this.a = map;
            this.b = referenceQueue;
        }

        public final boolean queueIdle() {
            e eVar = (e) this.b.poll();
            if (eVar != null) {
                this.a.remove(eVar.a);
            }
            return true;
        }
    }

    public aje(akg akg, ajz.a aVar, ExecutorService executorService, ExecutorService executorService2) {
        this(akg, aVar, executorService, executorService2, (byte) 0);
    }

    private aje(akg akg, ajz.a aVar, ExecutorService executorService, ExecutorService executorService2, byte b) {
        this.c = akg;
        this.g = new b(aVar);
        this.e = new HashMap();
        this.b = new aji();
        this.a = new HashMap();
        this.d = new a(executorService, executorService2, this);
        this.f = new ajo();
        akg.a((akg.a) this);
    }

    private ReferenceQueue<ajj<?>> a() {
        if (this.h == null) {
            this.h = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new d(this.e, this.h));
        }
        return this.h;
    }

    public static void a(ajn ajn) {
        aps.a();
        if (ajn instanceof ajj) {
            ((ajj) ajn).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    private static void a(String str, long j, aio aio) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(apo.a(j));
        stringBuilder.append("ms, key: ");
        stringBuilder.append(aio);
        Log.v("Engine", stringBuilder.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    public final <T, Z, R> defpackage.aje.c a(defpackage.aio r33, int r34, int r35, defpackage.aiv<T> r36, defpackage.aof<T, Z> r37, defpackage.ais<Z> r38, defpackage.anm<Z, R> r39, defpackage.aia r40, boolean r41, defpackage.ajd r42, defpackage.aoo r43) {
        /*
        r32 = this;
        r0 = r32;
        r7 = r43;
        defpackage.aps.a();
        r8 = defpackage.apo.a();
        r11 = r36.b();
        r15 = r37.a();
        r16 = r37.b();
        r18 = r37.d();
        r20 = r37.c();
        r6 = new ajh;
        r10 = r6;
        r12 = r33;
        r13 = r34;
        r14 = r35;
        r17 = r38;
        r19 = r39;
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r10 = 1;
        r1 = 0;
        if (r41 != 0) goto L_0x0035;
    L_0x0033:
        r2 = r1;
        goto L_0x005f;
    L_0x0035:
        r2 = r0.c;
        r2 = r2.a(r6);
        if (r2 != 0) goto L_0x003f;
    L_0x003d:
        r2 = r1;
        goto L_0x004c;
    L_0x003f:
        r3 = r2 instanceof defpackage.ajj;
        if (r3 == 0) goto L_0x0046;
    L_0x0043:
        r2 = (defpackage.ajj) r2;
        goto L_0x004c;
    L_0x0046:
        r3 = new ajj;
        r3.<init>(r2, r10);
        r2 = r3;
    L_0x004c:
        if (r2 == 0) goto L_0x005f;
    L_0x004e:
        r2.d();
        r3 = r0.e;
        r4 = new aje$e;
        r5 = r32.a();
        r4.<init>(r6, r2, r5);
        r3.put(r6, r4);
    L_0x005f:
        r11 = 2;
        r12 = "Engine";
        if (r2 == 0) goto L_0x0073;
    L_0x0064:
        r7.a(r2);
        r2 = android.util.Log.isLoggable(r12, r11);
        if (r2 == 0) goto L_0x0072;
    L_0x006d:
        r2 = "Loaded resource from cache";
        defpackage.aje.a(r2, r8, r6);
    L_0x0072:
        return r1;
    L_0x0073:
        if (r41 != 0) goto L_0x0077;
    L_0x0075:
        r2 = r1;
        goto L_0x0092;
    L_0x0077:
        r2 = r0.e;
        r2 = r2.get(r6);
        r2 = (java.lang.ref.WeakReference) r2;
        if (r2 == 0) goto L_0x0075;
    L_0x0081:
        r2 = r2.get();
        r2 = (defpackage.ajj) r2;
        if (r2 == 0) goto L_0x008d;
    L_0x0089:
        r2.d();
        goto L_0x0092;
    L_0x008d:
        r3 = r0.e;
        r3.remove(r6);
    L_0x0092:
        if (r2 == 0) goto L_0x00a3;
    L_0x0094:
        r7.a(r2);
        r2 = android.util.Log.isLoggable(r12, r11);
        if (r2 == 0) goto L_0x00a2;
    L_0x009d:
        r2 = "Loaded resource from active resources";
        defpackage.aje.a(r2, r8, r6);
    L_0x00a2:
        return r1;
    L_0x00a3:
        r1 = r0.a;
        r1 = r1.get(r6);
        r1 = (defpackage.ajf) r1;
        if (r1 == 0) goto L_0x00c1;
    L_0x00ad:
        r1.a(r7);
        r2 = android.util.Log.isLoggable(r12, r11);
        if (r2 == 0) goto L_0x00bb;
    L_0x00b6:
        r2 = "Added to existing load";
        defpackage.aje.a(r2, r8, r6);
    L_0x00bb:
        r2 = new aje$c;
        r2.<init>(r7, r1);
        return r2;
    L_0x00c1:
        r1 = r0.d;
        r13 = new ajf;
        r3 = r1.a;
        r4 = r1.b;
        r14 = r1.c;
        r1 = r13;
        r2 = r6;
        r5 = r41;
        r15 = r6;
        r6 = r14;
        r1.<init>(r2, r3, r4, r5, r6);
        r1 = new ajc;
        r2 = r0.g;
        r21 = r1;
        r22 = r15;
        r23 = r34;
        r24 = r35;
        r25 = r36;
        r26 = r37;
        r27 = r38;
        r28 = r39;
        r29 = r2;
        r30 = r42;
        r31 = r40;
        r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
        r2 = new ajk;
        r3 = r40;
        r2.<init>(r13, r1, r3);
        r1 = r0.a;
        r1.put(r15, r13);
        r13.a(r7);
        r13.k = r2;
        r1 = r13.k;
        r1 = r1.a;
        r3 = r1.c;
        r3 = r3.cacheResult;
        if (r3 != 0) goto L_0x0113;
    L_0x010c:
        r1 = r1.c;
        r1 = r1.cacheSource;
        if (r1 != 0) goto L_0x0113;
    L_0x0112:
        goto L_0x0114;
    L_0x0113:
        r10 = 0;
    L_0x0114:
        if (r10 == 0) goto L_0x0121;
    L_0x0116:
        r1 = new java.lang.RuntimeException;
        r3 = "Skipping disk decode";
        r1.<init>(r3);
        r2.a(r1);
        goto L_0x0129;
    L_0x0121:
        r1 = r13.d;
        r1 = r1.submit(r2);
        r13.m = r1;
    L_0x0129:
        r1 = android.util.Log.isLoggable(r12, r11);
        if (r1 == 0) goto L_0x0134;
    L_0x012f:
        r1 = "Started new load";
        defpackage.aje.a(r1, r8, r15);
    L_0x0134:
        r1 = new aje$c;
        r1.<init>(r7, r13);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aje.a(aio, int, int, aiv, aof, ais, anm, aia, boolean, ajd, aoo):aje$c");
    }

    public final void a(aio aio, ajj<?> ajj) {
        aps.a();
        if (ajj != null) {
            ajj.c = aio;
            ajj.b = this;
            if (ajj.a) {
                this.e.put(aio, new e(aio, ajj, a()));
            }
        }
        this.a.remove(aio);
    }

    public final void a(ajf ajf, aio aio) {
        aps.a();
        if (ajf.equals((ajf) this.a.get(aio))) {
            this.a.remove(aio);
        }
    }

    public final void b(aio aio, ajj ajj) {
        aps.a();
        this.e.remove(aio);
        if (ajj.a) {
            this.c.a(aio, ajj);
        } else {
            this.f.a(ajj);
        }
    }

    public final void b(ajn<?> ajn) {
        aps.a();
        this.f.a(ajn);
    }
}
