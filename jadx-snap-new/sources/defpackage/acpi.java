package defpackage;

import android.annotation.TargetApi;
import android.util.DisplayMetrics;
import defpackage.acwq.b;

@TargetApi(21)
/* renamed from: acpi */
public final class acpi implements b {
    private acwy a;
    private long b;
    private long c;
    private float d;
    private acpm e;
    private boolean f;
    private boolean g;
    private acpm h;
    private final ajwo<acpm> i;
    private final ajdp<acpm> j = this.i.f();
    private final ihh k;
    private final DisplayMetrics l;
    private final ajwy<acwy> m;

    /* renamed from: acpi$a */
    static final class a<T> implements ajfl<acpm> {
        private /* synthetic */ acpm a;

        a(acpm acpm) {
            this.a = acpm;
        }

        public final /* synthetic */ boolean test(Object obj) {
            obj = (acpm) obj;
            akcr.b(obj, "it");
            return akcr.a(obj, this.a);
        }
    }

    public acpi(ihh ihh, DisplayMetrics displayMetrics, ajwy<acwy> ajwy) {
        akcr.b(ihh, "clock");
        akcr.b(displayMetrics, "displayMetrics");
        akcr.b(ajwy, "programProvider");
        this.k = ihh;
        this.l = displayMetrics;
        this.m = ajwy;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.i = ajwo;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:59:0x02ad in {6, 7, 12, 14, 17, 25, 27, 30, 39, 40, 42, 43, 44, 45, 46, 49, 53, 55, 58} preds:[]
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
    private final boolean a(long r23, defpackage.acpm r25) {
        /*
        r22 = this;
        r1 = r22;
        r2 = r23;
        r0 = r25;
        monitor-enter(r22);
        r4 = r1.h;	 Catch:{ all -> 0x02aa }
        r4 = defpackage.akcr.a(r0, r4);	 Catch:{ all -> 0x02aa }
        r5 = 1;	 Catch:{ all -> 0x02aa }
        r4 = r4 ^ r5;	 Catch:{ all -> 0x02aa }
        r6 = 0;	 Catch:{ all -> 0x02aa }
        r8 = 0;	 Catch:{ all -> 0x02aa }
        if (r4 != 0) goto L_0x0018;	 Catch:{ all -> 0x02aa }
        r4 = r1.g;	 Catch:{ all -> 0x02aa }
        if (r4 == 0) goto L_0x0020;	 Catch:{ all -> 0x02aa }
        r1.g = r8;	 Catch:{ all -> 0x02aa }
        r1.b = r2;	 Catch:{ all -> 0x02aa }
        r1.h = r0;	 Catch:{ all -> 0x02aa }
        r1.c = r6;	 Catch:{ all -> 0x02aa }
        monitor-exit(r22);
        r9 = r1.b;
        r9 = r2 - r9;
        r11 = r0.a;
        r13 = 0;
        r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r4 == 0) goto L_0x0034;
        r11 = (double) r9;
        r13 = r0.a;
        r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r4 >= 0) goto L_0x0038;
        r4 = r1.f;
        if (r4 == 0) goto L_0x0042;
        r1.f = r5;
        r11 = r1.c;
        r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1));
        if (r4 != 0) goto L_0x0042;
        r1.c = r2;
        r4 = r1.a;
        if (r4 != 0) goto L_0x0201;
        r4 = r1.m;
        r4 = r4.get();
        r4 = (defpackage.acwy) r4;
        r11 = android.opengl.GLES20.glCreateProgram();
        r12 = new acww;
        r12.<init>();
        r4.a = r12;	 Catch:{ Exception -> 0x01f3 }
        r13 = defpackage.ackx.a();	 Catch:{ Exception -> 0x01f3 }
        r14 = defpackage.ackx.b();	 Catch:{ Exception -> 0x01f3 }
        r12.a(r11, r13, r14);	 Catch:{ Exception -> 0x01f3 }
        r11 = "vertexPart";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.a(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.F = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "particleID";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.a(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.G = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "time";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.e = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "lastParticleEmissionTime";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.f = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "maxParticleID";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.g = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "aspectRatio";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.h = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "seedOffset";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.p = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "emissionBurst";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.r = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "skipParticleProbability";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.s = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "fadeInOverTime";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.t = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "fadeOutOverTime";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.u = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "particleLifetime";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.v = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "particleLifetimeVariance";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.w = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "emissionRect";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.x = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "angle";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.y = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "angleVariance";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.z = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "velocity";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.A = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "velocityVariance";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.B = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "imageAspectRatio";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.C = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "scale";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.i = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "scaleVariance";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.j = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "flutterAmplitude";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.m = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "flutterMinPeriod";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.n = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "flutterMaxPeriod";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.o = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "rotationsPerSecond";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.D = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "rotationsPerSecondVariance";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.k = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "rotateIn3D";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.E = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "color";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.q = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "alphaVariance";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.l = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "frameCount";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.H = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = "frameDuration";	 Catch:{ Exception -> 0x01f3 }
        r11 = r12.b(r11);	 Catch:{ Exception -> 0x01f3 }
        r4.I = r11;	 Catch:{ Exception -> 0x01f3 }
        r11 = r4.J;	 Catch:{ Exception -> 0x01f3 }
        r11 = r11.b();	 Catch:{ Exception -> 0x01f3 }
        r13 = r11.d();	 Catch:{ Exception -> 0x01f3 }
        android.opengl.GLES20.glGenBuffers(r5, r13);	 Catch:{ Exception -> 0x01f3 }
        r13 = new java.util.ArrayList;	 Catch:{ Exception -> 0x01f3 }
        r13.<init>();	 Catch:{ Exception -> 0x01f3 }
        r14 = 1;	 Catch:{ Exception -> 0x01f3 }
        r15 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x01f3 }
        if (r14 > r15) goto L_0x0199;	 Catch:{ Exception -> 0x01f3 }
        r15 = 0;	 Catch:{ Exception -> 0x01f3 }
        r15 = java.lang.Float.valueOf(r15);	 Catch:{ Exception -> 0x01f3 }
        r13.add(r15);	 Catch:{ Exception -> 0x01f3 }
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ Exception -> 0x01f3 }
        r15 = java.lang.Float.valueOf(r15);	 Catch:{ Exception -> 0x01f3 }
        r13.add(r15);	 Catch:{ Exception -> 0x01f3 }
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ Exception -> 0x01f3 }
        r15 = java.lang.Float.valueOf(r15);	 Catch:{ Exception -> 0x01f3 }
        r13.add(r15);	 Catch:{ Exception -> 0x01f3 }
        r15 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;	 Catch:{ Exception -> 0x01f3 }
        r15 = java.lang.Float.valueOf(r15);	 Catch:{ Exception -> 0x01f3 }
        r13.add(r15);	 Catch:{ Exception -> 0x01f3 }
        r14 = r14 + 1;	 Catch:{ Exception -> 0x01f3 }
        goto L_0x016f;	 Catch:{ Exception -> 0x01f3 }
        r14 = r4.J;	 Catch:{ Exception -> 0x01f3 }
        r15 = r13.size();	 Catch:{ Exception -> 0x01f3 }
        r14 = r14.b(r15);	 Catch:{ Exception -> 0x01f3 }
        r15 = r14.c();	 Catch:{ Exception -> 0x01f3 }
        r13 = (java.util.Collection) r13;	 Catch:{ Exception -> 0x01f3 }
        r13 = defpackage.ajyu.e(r13);	 Catch:{ Exception -> 0x01f3 }
        r13 = r15.put(r13);	 Catch:{ Exception -> 0x01f3 }
        r13.position(r8);	 Catch:{ Exception -> 0x01f3 }
        r13 = r11.c();	 Catch:{ Exception -> 0x01f3 }
        r15 = 34962; // 0x8892 float:4.8992E-41 double:1.72735E-319;	 Catch:{ Exception -> 0x01f3 }
        android.opengl.GLES20.glBindBuffer(r15, r13);	 Catch:{ Exception -> 0x01f3 }
        r13 = r14.a();	 Catch:{ Exception -> 0x01f3 }
        r16 = r14.c();	 Catch:{ Exception -> 0x01f3 }
        r5 = r16;	 Catch:{ Exception -> 0x01f3 }
        r5 = (java.nio.Buffer) r5;	 Catch:{ Exception -> 0x01f3 }
        r6 = 35044; // 0x88e4 float:4.9107E-41 double:1.7314E-319;	 Catch:{ Exception -> 0x01f3 }
        android.opengl.GLES20.glBufferData(r15, r13, r5, r6);	 Catch:{ Exception -> 0x01f3 }
        android.opengl.GLES20.glBindBuffer(r15, r8);	 Catch:{ Exception -> 0x01f3 }
        r5 = r4.J;	 Catch:{ Exception -> 0x01f3 }
        r5.a(r14);	 Catch:{ Exception -> 0x01f3 }
        r4.c = r11;	 Catch:{ Exception -> 0x01f3 }
        r4.a();	 Catch:{ Exception -> 0x01f3 }
        r4.b();	 Catch:{ Exception -> 0x01f3 }
        r5 = r1.l;
        r1.a = r4;
        r6 = r5.widthPixels;
        r6 = (float) r6;
        r5 = r5.heightPixels;
        r5 = (float) r5;
        r6 = r6 / r5;
        r1.d = r6;
        r5 = "p";
        defpackage.akcr.a(r4, r5);
        goto L_0x0201;
        r0 = move-exception;
        r12.a();
        r2 = new java.lang.RuntimeException;
        r0 = (java.lang.Throwable) r0;
        r2.<init>(r0);
        r2 = (java.lang.Throwable) r2;
        throw r2;
        r5 = (float) r9;
        r6 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r5 = r5 / r6;
        r9 = r1.c;
        r11 = 0;
        r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r7 <= 0) goto L_0x026d;
        r11 = r1.b;
        r11 = r9 - r11;
        r2 = r2 - r9;
        r7 = (float) r11;
        r16 = r7 / r6;
        r15 = r0.c;
        r14 = r15.length;
        r9 = 0;
        r13 = 0;
        r19 = 0;
        if (r13 >= r14) goto L_0x026a;
        r10 = r15[r13];
        r20 = r19 + 1;
        r11 = r10.a;
        r23 = r9;
        r8 = r1.c;
        r17 = 0;
        r12 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1));
        if (r12 == 0) goto L_0x024a;
        r8 = r11.f;
        r9 = r11.g;
        r8 = r8 + r9;
        r8 = r8 * r6;
        r9 = r8 % r7;
        r8 = r8 - r9;
        r9 = (float) r2;
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 <= 0) goto L_0x023e;
        r8 = 1;
        goto L_0x023f;
        r8 = 0;
        if (r8 == 0) goto L_0x0242;
        goto L_0x024a;
        r9 = r23;
        r21 = r13;
        r8 = r14;
        r19 = r15;
        goto L_0x0261;
        r8 = r10.b;
        r12 = r1.d;
        r9 = r4;
        r10 = r11;
        r11 = r8;
        r8 = r12;
        r12 = r5;
        r21 = r13;
        r13 = r8;
        r8 = r14;
        r14 = r19;
        r19 = r15;
        r15 = r16;
        r9.a(r10, r11, r12, r13, r14, r15);
        r9 = 1;
        r13 = r21 + 1;
        r14 = r8;
        r15 = r19;
        r19 = r20;
        r8 = 0;
        goto L_0x021c;
        r23 = r9;
        goto L_0x028a;
        r2 = r0.c;
        r3 = r2.length;
        r6 = 0;
        r9 = 0;
        r14 = 0;
        if (r6 >= r3) goto L_0x028a;
        r7 = r2[r6];
        r8 = r14 + 1;
        r10 = r7.a;
        r11 = r7.b;
        r13 = r1.d;
        r15 = 0;
        r9 = r4;
        r12 = r5;
        r9.a(r10, r11, r12, r13, r14, r15);
        r6 = r6 + 1;
        r14 = r8;
        r9 = 1;
        goto L_0x0273;
        r2 = r4.F;
        android.opengl.GLES20.glDisableVertexAttribArray(r2);
        r2 = r4.G;
        android.opengl.GLES20.glDisableVertexAttribArray(r2);
        if (r9 != 0) goto L_0x02a8;
        r2 = 0;
        r1.e = r2;
        r1.h = r2;
        r2 = 0;
        r1.c = r2;
        r1.b = r2;
        r2 = r1.i;
        r2.a(r0);
        r0 = 0;
        return r0;
        r0 = 1;
        return r0;
        r0 = move-exception;
        monitor-exit(r22);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acpi.a(long, acpm):boolean");
    }

    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            r0 = r3.j.c(1);
            defpackage.akcr.a(r0, "hideCompleteObserver.take(1)");
     */
    /* JADX WARNING: Missing block: B:12:0x002b, code skipped:
            return r0;
     */
    public final defpackage.ajdp<defpackage.acpm> a() {
        /*
        r3 = this;
        r0 = 1;
        r3.f = r0;
        monitor-enter(r3);
        r0 = r3.g;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x001d;
    L_0x0008:
        r0 = 0;
        r3.g = r0;	 Catch:{ all -> 0x002c }
        r0 = r3.e;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x001d;
    L_0x000f:
        r1 = 0;
        r3.e = r1;	 Catch:{ all -> 0x002c }
        r0 = defpackage.ajdp.b(r0);	 Catch:{ all -> 0x002c }
        r1 = "Observable.just(it)";
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x002c }
        monitor-exit(r3);
        return r0;
    L_0x001d:
        monitor-exit(r3);
        r0 = r3.j;
        r1 = 1;
        r0 = r0.c(r1);
        r1 = "hideCompleteObserver.take(1)";
        defpackage.akcr.a(r0, r1);
        return r0;
    L_0x002c:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acpi.a():ajdp");
    }

    public final ajdp<acpm> a(acpm acpm) {
        akcr.b(acpm, "effect");
        this.f = false;
        synchronized (this) {
            this.e = acpm;
            this.g = true;
        }
        Object c = this.j.a((ajfl) new a(acpm)).c(1);
        akcr.a(c, "hideCompleteObserver.fil… { it == effect }.take(1)");
        return c;
    }

    public final boolean b() {
        acpm acpm = this.e;
        return acpm != null ? a(this.k.c(), acpm) : false;
    }

    public final void c() {
        acwy acwy = this.a;
        if (acwy != null) {
            acww acww = acwy.a;
            if (acww != null) {
                acww.a();
            }
            acyi acyi = acwy.c;
            if (acyi != null) {
                acwy.J.a(acyi);
            }
            acwy.c = null;
            acyi acyi2 = acwy.d;
            if (acyi2 != null) {
                acwy.J.a(acyi2);
            }
            acwy.d = null;
            acyi2 = acwy.b;
            if (acyi2 != null) {
                acwy.J.a(acyi2);
            }
            acwy.b = null;
            this.a = null;
        }
    }
}
