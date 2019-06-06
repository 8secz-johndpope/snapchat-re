package defpackage;

import android.util.Log;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.aaj.d;
import defpackage.aar.a;

/* renamed from: aam */
public final class aam implements aao, a, abx.a {
    private static final boolean a = Log.isLoggable("Engine", 2);
    private final aau b;
    private final aaq c;
    private final abx d;
    private final b e;
    private final aba f;
    private final c g;
    private final a h;
    private final aac i;

    /* renamed from: aam$a */
    static class a {
        final d a;
        final defpackage.jf.a<aaj<?>> b = ahn.a((int) MapboxConstants.ANIMATION_DURATION_SHORT, new 1());
        int c;

        /* renamed from: aam$a$1 */
        class 1 implements defpackage.ahn.a<aaj<?>> {
            1() {
            }

            public final /* synthetic */ Object a() {
                return new aaj(a.this.a, a.this.b);
            }
        }

        a(d dVar) {
            this.a = dVar;
        }
    }

    /* renamed from: aam$b */
    static class b {
        final aca a;
        final aca b;
        final aca c;
        final aca d;
        final aao e;
        final jf.a<aan<?>> f = ahn.a((int) MapboxConstants.ANIMATION_DURATION_SHORT, new 1());

        /* renamed from: aam$b$1 */
        class 1 implements ahn.a<aan<?>> {
            1() {
            }

            public final /* synthetic */ Object a() {
                return new aan(b.this.a, b.this.b, b.this.c, b.this.d, b.this.e, b.this.f);
            }
        }

        b(aca aca, aca aca2, aca aca3, aca aca4, aao aao) {
            this.a = aca;
            this.b = aca2;
            this.c = aca3;
            this.d = aca4;
            this.e = aao;
        }
    }

    /* renamed from: aam$d */
    public class d {
        public final aan<?> a;
        public final agj b;

        d(agj agj, aan<?> aan) {
            this.b = agj;
            this.a = aan;
        }
    }

    /* renamed from: aam$c */
    static class c implements d {
        private final abq.a a;
        private volatile abq b;

        c(abq.a aVar) {
            this.a = aVar;
        }

        public final abq a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.a();
                    }
                    if (this.b == null) {
                        this.b = new abr();
                    }
                }
            }
            return this.b;
        }
    }

    public aam(abx abx, abq.a aVar, aca aca, aca aca2, aca aca3, aca aca4) {
        this(abx, aVar, aca, aca2, aca3, aca4, false);
    }

    private aam(abx abx, abq.a aVar, aca aca, aca aca2, aca aca3, aca aca4, boolean z) {
        this.d = abx;
        this.g = new c(aVar);
        aac aac = new aac(false);
        this.i = aac;
        synchronized (this) {
            synchronized (aac) {
                aac.b = this;
            }
        }
        this.c = new aaq();
        this.b = new aau();
        this.e = new b(aca, aca2, aca3, aca4, this);
        this.h = new a(this.g);
        this.f = new aba();
        abx.a((abx.a) this);
    }

    public static void a(aax<?> aax) {
        if (aax instanceof aar) {
            ((aar) aax).f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    private static void a(String str, long j, zd zdVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(ahh.a(j));
        stringBuilder.append("ms, key: ");
        stringBuilder.append(zdVar);
        Log.v("Engine", stringBuilder.toString());
    }

    /* JADX WARNING: Missing block: B:18:0x0061, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:36:0x0099, code skipped:
            return null;
     */
    public final synchronized <R> defpackage.aam.d a(com.bumptech.glide.GlideContext r18, java.lang.Object r19, defpackage.zd r20, int r21, int r22, java.lang.Class<?> r23, java.lang.Class<R> r24, defpackage.yk r25, defpackage.aal r26, java.util.Map<java.lang.Class<?>, defpackage.zi<?>> r27, boolean r28, boolean r29, defpackage.zf r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.agj r35, java.util.concurrent.Executor r36) {
        /*
        r17 = this;
        r1 = r17;
        r0 = r18;
        r11 = r19;
        r12 = r20;
        r13 = r21;
        r14 = r22;
        r15 = r25;
        r10 = r26;
        r9 = r30;
        r8 = r34;
        r7 = r35;
        r6 = r36;
        monitor-enter(r17);
        r2 = a;	 Catch:{ all -> 0x0178 }
        if (r2 == 0) goto L_0x0022;
    L_0x001d:
        r2 = defpackage.ahh.a();	 Catch:{ all -> 0x0178 }
        goto L_0x0024;
    L_0x0022:
        r2 = 0;
    L_0x0024:
        r4 = r2;
        r3 = new aap;	 Catch:{ all -> 0x0178 }
        r2 = r3;
        r15 = r3;
        r3 = r19;
        r13 = r4;
        r4 = r20;
        r5 = r21;
        r12 = r6;
        r6 = r22;
        r11 = r7;
        r7 = r27;
        r0 = r8;
        r8 = r23;
        r9 = r24;
        r10 = r30;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0178 }
        r2 = 0;
        if (r31 != 0) goto L_0x0045;
    L_0x0043:
        r3 = r2;
        goto L_0x0050;
    L_0x0045:
        r3 = r1.i;	 Catch:{ all -> 0x0178 }
        r3 = r3.b(r15);	 Catch:{ all -> 0x0178 }
        if (r3 == 0) goto L_0x0050;
    L_0x004d:
        r3.e();	 Catch:{ all -> 0x0178 }
    L_0x0050:
        if (r3 == 0) goto L_0x0062;
    L_0x0052:
        r0 = defpackage.yx.MEMORY_CACHE;	 Catch:{ all -> 0x0178 }
        r11.a(r3, r0);	 Catch:{ all -> 0x0178 }
        r0 = a;	 Catch:{ all -> 0x0178 }
        if (r0 == 0) goto L_0x0060;
    L_0x005b:
        r0 = "Loaded resource from active resources";
        defpackage.aam.a(r0, r13, r15);	 Catch:{ all -> 0x0178 }
    L_0x0060:
        monitor-exit(r17);
        return r2;
    L_0x0062:
        if (r31 != 0) goto L_0x0066;
    L_0x0064:
        r3 = r2;
        goto L_0x0088;
    L_0x0066:
        r3 = r1.d;	 Catch:{ all -> 0x0178 }
        r3 = r3.a(r15);	 Catch:{ all -> 0x0178 }
        if (r3 != 0) goto L_0x0070;
    L_0x006e:
        r3 = r2;
        goto L_0x007e;
    L_0x0070:
        r4 = r3 instanceof defpackage.aar;	 Catch:{ all -> 0x0178 }
        if (r4 == 0) goto L_0x0077;
    L_0x0074:
        r3 = (defpackage.aar) r3;	 Catch:{ all -> 0x0178 }
        goto L_0x007e;
    L_0x0077:
        r4 = new aar;	 Catch:{ all -> 0x0178 }
        r5 = 1;
        r4.<init>(r3, r5, r5);	 Catch:{ all -> 0x0178 }
        r3 = r4;
    L_0x007e:
        if (r3 == 0) goto L_0x0088;
    L_0x0080:
        r3.e();	 Catch:{ all -> 0x0178 }
        r4 = r1.i;	 Catch:{ all -> 0x0178 }
        r4.a(r15, r3);	 Catch:{ all -> 0x0178 }
    L_0x0088:
        if (r3 == 0) goto L_0x009a;
    L_0x008a:
        r0 = defpackage.yx.MEMORY_CACHE;	 Catch:{ all -> 0x0178 }
        r11.a(r3, r0);	 Catch:{ all -> 0x0178 }
        r0 = a;	 Catch:{ all -> 0x0178 }
        if (r0 == 0) goto L_0x0098;
    L_0x0093:
        r0 = "Loaded resource from cache";
        defpackage.aam.a(r0, r13, r15);	 Catch:{ all -> 0x0178 }
    L_0x0098:
        monitor-exit(r17);
        return r2;
    L_0x009a:
        r2 = r1.b;	 Catch:{ all -> 0x0178 }
        r2 = r2.a(r0);	 Catch:{ all -> 0x0178 }
        r2 = r2.get(r15);	 Catch:{ all -> 0x0178 }
        r2 = (defpackage.aan) r2;	 Catch:{ all -> 0x0178 }
        if (r2 == 0) goto L_0x00bb;
    L_0x00a8:
        r2.a(r11, r12);	 Catch:{ all -> 0x0178 }
        r0 = a;	 Catch:{ all -> 0x0178 }
        if (r0 == 0) goto L_0x00b4;
    L_0x00af:
        r0 = "Added to existing load";
        defpackage.aam.a(r0, r13, r15);	 Catch:{ all -> 0x0178 }
    L_0x00b4:
        r0 = new aam$d;	 Catch:{ all -> 0x0178 }
        r0.<init>(r11, r2);	 Catch:{ all -> 0x0178 }
        monitor-exit(r17);
        return r0;
    L_0x00bb:
        r2 = r1.e;	 Catch:{ all -> 0x0178 }
        r2 = r2.f;	 Catch:{ all -> 0x0178 }
        r2 = r2.a();	 Catch:{ all -> 0x0178 }
        r2 = (defpackage.aan) r2;	 Catch:{ all -> 0x0178 }
        r3 = "Argument must not be null";
        r2 = defpackage.ahl.a(r2, r3);	 Catch:{ all -> 0x0178 }
        r2 = (defpackage.aan) r2;	 Catch:{ all -> 0x0178 }
        r3 = r15;
        r4 = r31;
        r5 = r32;
        r6 = r33;
        r7 = r34;
        r2 = r2.a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0178 }
        r3 = r1.h;	 Catch:{ all -> 0x0178 }
        r4 = r3.b;	 Catch:{ all -> 0x0178 }
        r4 = r4.a();	 Catch:{ all -> 0x0178 }
        r4 = (defpackage.aaj) r4;	 Catch:{ all -> 0x0178 }
        r5 = "Argument must not be null";
        r4 = defpackage.ahl.a(r4, r5);	 Catch:{ all -> 0x0178 }
        r4 = (defpackage.aaj) r4;	 Catch:{ all -> 0x0178 }
        r5 = r3.c;	 Catch:{ all -> 0x0178 }
        r6 = r5 + 1;
        r3.c = r6;	 Catch:{ all -> 0x0178 }
        r3 = r4.a;	 Catch:{ all -> 0x0178 }
        r6 = r4.b;	 Catch:{ all -> 0x0178 }
        r7 = r0;
        r0 = r18;
        r3.a = r0;	 Catch:{ all -> 0x0178 }
        r8 = r19;
        r9 = r11;
        r3.b = r8;	 Catch:{ all -> 0x0178 }
        r10 = r20;
        r11 = r12;
        r3.j = r10;	 Catch:{ all -> 0x0178 }
        r12 = r21;
        r3.c = r12;	 Catch:{ all -> 0x0178 }
        r16 = r15;
        r15 = r22;
        r3.d = r15;	 Catch:{ all -> 0x0178 }
        r31 = r13;
        r13 = r26;
        r3.l = r13;	 Catch:{ all -> 0x0178 }
        r14 = r23;
        r3.e = r14;	 Catch:{ all -> 0x0178 }
        r3.f = r6;	 Catch:{ all -> 0x0178 }
        r6 = r24;
        r3.i = r6;	 Catch:{ all -> 0x0178 }
        r6 = r25;
        r14 = r16;
        r3.k = r6;	 Catch:{ all -> 0x0178 }
        r9 = r30;
        r3.g = r9;	 Catch:{ all -> 0x0178 }
        r11 = r27;
        r3.h = r11;	 Catch:{ all -> 0x0178 }
        r11 = r28;
        r3.m = r11;	 Catch:{ all -> 0x0178 }
        r11 = r29;
        r3.n = r11;	 Catch:{ all -> 0x0178 }
        r4.e = r0;	 Catch:{ all -> 0x0178 }
        r4.f = r10;	 Catch:{ all -> 0x0178 }
        r4.g = r6;	 Catch:{ all -> 0x0178 }
        r4.h = r14;	 Catch:{ all -> 0x0178 }
        r4.i = r12;	 Catch:{ all -> 0x0178 }
        r4.j = r15;	 Catch:{ all -> 0x0178 }
        r4.k = r13;	 Catch:{ all -> 0x0178 }
        r4.p = r7;	 Catch:{ all -> 0x0178 }
        r4.l = r9;	 Catch:{ all -> 0x0178 }
        r4.m = r2;	 Catch:{ all -> 0x0178 }
        r4.n = r5;	 Catch:{ all -> 0x0178 }
        r0 = defpackage.aaj.f.INITIALIZE;	 Catch:{ all -> 0x0178 }
        r4.o = r0;	 Catch:{ all -> 0x0178 }
        r4.q = r8;	 Catch:{ all -> 0x0178 }
        r0 = r1.b;	 Catch:{ all -> 0x0178 }
        r3 = r2.b;	 Catch:{ all -> 0x0178 }
        r0 = r0.a(r3);	 Catch:{ all -> 0x0178 }
        r0.put(r14, r2);	 Catch:{ all -> 0x0178 }
        r0 = r35;
        r3 = r36;
        r2.a(r0, r3);	 Catch:{ all -> 0x0178 }
        r2.b(r4);	 Catch:{ all -> 0x0178 }
        r3 = a;	 Catch:{ all -> 0x0178 }
        if (r3 == 0) goto L_0x0171;
    L_0x016a:
        r3 = "Started new load";
        r4 = r31;
        defpackage.aam.a(r3, r4, r14);	 Catch:{ all -> 0x0178 }
    L_0x0171:
        r3 = new aam$d;	 Catch:{ all -> 0x0178 }
        r3.<init>(r0, r2);	 Catch:{ all -> 0x0178 }
        monitor-exit(r17);
        return r3;
    L_0x0178:
        r0 = move-exception;
        monitor-exit(r17);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aam.a(com.bumptech.glide.GlideContext, java.lang.Object, zd, int, int, java.lang.Class, java.lang.Class, yk, aal, java.util.Map, boolean, boolean, zf, boolean, boolean, boolean, boolean, agj, java.util.concurrent.Executor):aam$d");
    }

    public final synchronized void a(aan<?> aan, zd zdVar) {
        this.b.a(zdVar, aan);
    }

    public final synchronized void a(aan<?> aan, zd zdVar, aar<?> aar) {
        if (aar != null) {
            aar.a(zdVar, this);
            if (aar.a) {
                this.i.a(zdVar, aar);
            }
        }
        this.b.a(zdVar, aan);
    }

    public final synchronized void a(zd zdVar, aar<?> aar) {
        this.i.a(zdVar);
        if (aar.a) {
            this.d.a(zdVar, aar);
        } else {
            this.f.a(aar);
        }
    }

    public final void b(aax<?> aax) {
        this.f.a(aax);
    }
}
