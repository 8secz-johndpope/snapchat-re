package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.snap.blizzard.BlizzardDurableJob;
import com.snap.framework.developer.BuildConfigInfo;
import defpackage.dit.a;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dic */
public final class dic implements dib {
    private long A = System.currentTimeMillis();
    private ajwy<Context> B;
    private volatile boolean a = false;
    private final ajwm b;
    private final dii c;
    private final dje d;
    private final aipn<dig> e;
    private final dij f;
    private final ajdw g;
    private final djc h;
    private final ilv i;
    private final abss j;
    private div k;
    private final ajwy<div> l;
    private final ajwy<abrk> m;
    private final aipn<diz> n;
    private final aipn<hwl> o;
    private final BuildConfigInfo p;
    private final abqo q;
    private Set<String> r;
    private zym s;
    private AtomicBoolean t = new AtomicBoolean();
    private LinkedList<Runnable> u = new LinkedList();
    private boolean v;
    private AtomicBoolean w = new AtomicBoolean();
    private boolean x;
    private int y;
    private SharedPreferences z;

    public dic(dii dii, dje dje, dij dij, ajdw ajdw, aipn<dig> aipn, djc djc, ilv ilv, abss abss, ajwy<div> ajwy, ajwy<abrk> ajwy2, aipn<diz> aipn2, aipn<hwl> aipn3, BuildConfigInfo buildConfigInfo, abqo abqo, ajwy<Context> ajwy3) {
        this.c = dii;
        this.d = dje;
        this.f = dij;
        this.g = ajdw;
        this.e = aipn;
        this.h = djc;
        this.i = ilv;
        this.j = abss;
        this.l = ajwy;
        this.m = ajwy2;
        this.n = aipn2;
        this.o = aipn3;
        this.p = buildConfigInfo;
        this.q = abqo;
        this.b = new ajwm();
        this.B = ajwy3;
    }

    private void a(aajt aajt, boolean z) {
        if (!this.a) {
            synchronized (this.u) {
                if (!this.a) {
                    this.u.add(new -$$Lambda$dic$xZ5MczR7a_MHt1GnynZCwZhUPX0(this, aajt));
                    return;
                }
            }
        }
        if (b(aajt)) {
            b(aajt, z);
        }
    }

    private void b(aajt aajt, boolean z) {
        Runnable e = e(aajt);
        if (z) {
            this.f.a(e);
        } else if (this.f.b()) {
            e.run();
        } else {
            throw new RuntimeException("logRunnable should be executed on the log thread!");
        }
    }

    private Runnable e(aajt aajt) {
        return new -$$Lambda$dic$kbGfPEPzyCJT43b5XQVs3KUWcB8(this, aajt, System.currentTimeMillis());
    }

    private boolean f(aajt aajt) {
        String eventName = aajt.getEventName();
        return eventName != null && this.s.c.contains(eventName);
    }

    private /* synthetic */ Boolean g(aajt aajt) {
        return Boolean.valueOf(b(aajt));
    }

    /* Access modifiers changed, original: final */
    public final ajdx<Boolean> a(dit dit, Set<String> set) {
        return !this.a ? ajdx.b(Boolean.FALSE) : ajdp.b(((dig) this.e.get()).a()).a(new -$$Lambda$dic$ma6dknyF0IfkGqvKvHgO0w2lDVM(set)).p(new -$$Lambda$dic$ftmG8Pw_GNPapjuIoKeY2ugdKAk(dit)).a(16).a(-$$Lambda$dic$Gs3PqotdX7uGSewTxnjM7g3gh9E.INSTANCE);
    }

    public final void a() {
        if (this.v) {
            dia dia = dia.ON_BACKGROUNDING;
            ((hwl) this.o.get()).a(BlizzardDurableJob.a(dia, (long) this.y, TimeUnit.SECONDS)).a(new -$$Lambda$dic$KkMsfl4qDNE96TC7ZdwN40U8bDs(dia), new -$$Lambda$dic$fTUl0a51Np1WpQjYsfipvhAbEMQ(dia));
        }
        if (this.a) {
            for (dif dif : ((dig) this.e.get()).a()) {
                dif.d.set(true);
                dif.b.b(dif.g);
                if (dif.f()) {
                    a.a("onPause");
                    dif.e();
                } else {
                    dif.b.a(dif.g);
                }
            }
            this.k.a(false);
        }
    }

    /* renamed from: a */
    public final void h(aajt aajt) {
        a(aajt, true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00aa in {4, 5, 7, 11, 15, 19, 21, 24, 26, 29} preds:[]
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
    public final void a(android.content.Context r12, defpackage.aahz r13) {
        /*
        r11 = this;
        r0 = 0;
        r2 = r11.A;	 Catch:{ all -> 0x00a6 }
        r4 = 1;	 Catch:{ all -> 0x00a6 }
        r5 = 0;	 Catch:{ all -> 0x00a6 }
        r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ all -> 0x00a6 }
        if (r6 <= 0) goto L_0x000c;	 Catch:{ all -> 0x00a6 }
        r2 = 1;	 Catch:{ all -> 0x00a6 }
        goto L_0x000d;	 Catch:{ all -> 0x00a6 }
        r2 = 0;	 Catch:{ all -> 0x00a6 }
        if (r2 == 0) goto L_0x001d;	 Catch:{ all -> 0x00a6 }
        r3 = r11.i;	 Catch:{ all -> 0x00a6 }
        r6 = defpackage.ino.TIME_TO_FIRST_RESUME;	 Catch:{ all -> 0x00a6 }
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00a6 }
        r9 = r11.A;	 Catch:{ all -> 0x00a6 }
        r7 = r7 - r9;	 Catch:{ all -> 0x00a6 }
        r3.a(r6, r7);	 Catch:{ all -> 0x00a6 }
        r3 = r11.a;	 Catch:{ all -> 0x00a6 }
        if (r3 != 0) goto L_0x0024;
        r11.A = r0;
        return;
        r3 = r11.k;	 Catch:{ all -> 0x00a6 }
        r3.a(r12, r13);	 Catch:{ all -> 0x00a6 }
        if (r2 == 0) goto L_0x0039;	 Catch:{ all -> 0x00a6 }
        r12 = r11.i;	 Catch:{ all -> 0x00a6 }
        r13 = defpackage.ino.TIME_TO_FIRST_SESSION_INIT;	 Catch:{ all -> 0x00a6 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00a6 }
        r8 = r11.A;	 Catch:{ all -> 0x00a6 }
        r6 = r6 - r8;	 Catch:{ all -> 0x00a6 }
        r12.a(r13, r6);	 Catch:{ all -> 0x00a6 }
        r12 = r11.e;	 Catch:{ all -> 0x00a6 }
        r12 = r12.get();	 Catch:{ all -> 0x00a6 }
        r12 = (defpackage.dig) r12;	 Catch:{ all -> 0x00a6 }
        r12 = r12.a();	 Catch:{ all -> 0x00a6 }
        r12 = r12.iterator();	 Catch:{ all -> 0x00a6 }
        r13 = r12.hasNext();	 Catch:{ all -> 0x00a6 }
        if (r13 == 0) goto L_0x0059;	 Catch:{ all -> 0x00a6 }
        r13 = r12.next();	 Catch:{ all -> 0x00a6 }
        r13 = (defpackage.dif) r13;	 Catch:{ all -> 0x00a6 }
        r13.b();	 Catch:{ all -> 0x00a6 }
        goto L_0x0049;	 Catch:{ all -> 0x00a6 }
        if (r2 == 0) goto L_0x0069;	 Catch:{ all -> 0x00a6 }
        r12 = r11.i;	 Catch:{ all -> 0x00a6 }
        r13 = defpackage.ino.TIME_TO_FIRST_COMPLETE_INIT;	 Catch:{ all -> 0x00a6 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00a6 }
        r6 = r11.A;	 Catch:{ all -> 0x00a6 }
        r2 = r2 - r6;	 Catch:{ all -> 0x00a6 }
        r12.a(r13, r2);	 Catch:{ all -> 0x00a6 }
        r12 = r11.n;	 Catch:{ all -> 0x00a6 }
        r12 = r12.get();	 Catch:{ all -> 0x00a6 }
        r12 = (defpackage.diz) r12;	 Catch:{ all -> 0x00a6 }
        r12.e();	 Catch:{ all -> 0x00a6 }
        r12 = r11.w;	 Catch:{ all -> 0x00a6 }
        r12 = r12.compareAndSet(r5, r4);	 Catch:{ all -> 0x00a6 }
        if (r12 == 0) goto L_0x00a3;	 Catch:{ all -> 0x00a6 }
        r12 = defpackage.dia.PERIODIC;	 Catch:{ all -> 0x00a6 }
        r2 = 30;	 Catch:{ all -> 0x00a6 }
        r13 = java.util.concurrent.TimeUnit.MINUTES;	 Catch:{ all -> 0x00a6 }
        r12 = com.snap.blizzard.BlizzardDurableJob.a(r12, r2, r13);	 Catch:{ all -> 0x00a6 }
        r13 = r11.o;	 Catch:{ all -> 0x00a6 }
        r13 = r13.get();	 Catch:{ all -> 0x00a6 }
        r13 = (defpackage.hwl) r13;	 Catch:{ all -> 0x00a6 }
        r2 = r12.b();	 Catch:{ all -> 0x00a6 }
        r13 = r13.a(r2);	 Catch:{ all -> 0x00a6 }
        r2 = new -$$Lambda$dic$yQh3ZJdDPaa1rpQu2wYqRdEkLv0;	 Catch:{ all -> 0x00a6 }
        r2.<init>(r12);	 Catch:{ all -> 0x00a6 }
        r3 = new -$$Lambda$dic$jtYJfqWOba1gkUlHkOpMpucQWOk;	 Catch:{ all -> 0x00a6 }
        r3.<init>(r12);	 Catch:{ all -> 0x00a6 }
        r13.a(r2, r3);	 Catch:{ all -> 0x00a6 }
        r11.A = r0;
        return;
        r12 = move-exception;
        r11.A = r0;
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dic.a(android.content.Context, aahz):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x00d4 in {4, 5, 19, 23, 26, 31, 34, 38} preds:[]
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
    public final void a(java.util.Set<java.lang.String> r7) {
        /*
        r6 = this;
        r6.r = r7;
        r7 = r6.d;
        r7 = r7.b();
        r6.s = r7;
        r7 = r6.l;
        r7 = r7.get();
        r7 = (defpackage.div) r7;
        r6.k = r7;
        r7 = r6.n;
        r7 = r7.get();
        r7 = (defpackage.diz) r7;
        r7 = r7.i();
        r6.v = r7;
        r7 = r6.n;
        r7 = r7.get();
        r7 = (defpackage.diz) r7;
        r7 = r7.j();
        r6.y = r7;
        r7 = r6.n;
        r7 = r7.get();
        r7 = (defpackage.diz) r7;
        r7 = r7.d();
        r0 = 1;
        r1 = 0;
        if (r7 != 0) goto L_0x0050;
        r7 = r6.n;
        r7 = r7.get();
        r7 = (defpackage.diz) r7;
        r7 = r7.a();
        if (r7 == 0) goto L_0x0050;
        r7 = 1;
        goto L_0x0051;
        r7 = 0;
        r6.x = r7;
        r7 = r6.u;
        monitor-enter(r7);
        r6.a = r0;	 Catch:{ all -> 0x00d1 }
        monitor-exit(r7);	 Catch:{ all -> 0x00d1 }
        r7 = r6.a;
        com.google.common.base.Preconditions.checkArgument(r7);
        r7 = r6.u;
        r7 = r7.size();
        r2 = 0;
        r3 = r6.u;	 Catch:{ all -> 0x00c0 }
        monitor-enter(r3);	 Catch:{ all -> 0x00c0 }
        r4 = r6.u;	 Catch:{ all -> 0x00bd }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x00bd }
        if (r4 != 0) goto L_0x0078;	 Catch:{ all -> 0x00bd }
        r2 = r6.u;	 Catch:{ all -> 0x00bd }
        r2 = r2.remove();	 Catch:{ all -> 0x00bd }
        r2 = (java.lang.Runnable) r2;	 Catch:{ all -> 0x00bd }
        monitor-exit(r3);	 Catch:{ all -> 0x00bd }
        if (r2 != 0) goto L_0x00b9;
        r2 = r6.i;
        r3 = defpackage.ino.PRE_INIT_LOGGED;
        r4 = (long) r7;
        r2.c(r3, r4);
        r7 = r6.i;
        r2 = defpackage.ino.PRE_INIT_LOGGED;
        r7.b(r2, r4);
        r7 = r6.b;
        r7.a();
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r2 = "com.snapchat.android.analytics.framework";
        r7[r1] = r2;
        r2 = r6.B;
        r2 = r2.get();
        r2 = (android.content.Context) r2;
        r2 = r2.getPackageName();
        r7[r0] = r2;
        r0 = "%s.%s";
        r7 = java.lang.String.format(r0, r7);
        r0 = r6.B;
        r0 = r0.get();
        r0 = (android.content.Context) r0;
        r7 = r0.getSharedPreferences(r7, r1);
        r6.z = r7;
        return;
        r2.run();	 Catch:{ all -> 0x00c0 }
        goto L_0x0064;
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00bd }
        throw r0;	 Catch:{ all -> 0x00c0 }
        r0 = move-exception;
        r1 = r6.i;
        r2 = defpackage.ino.PRE_INIT_LOGGED;
        r3 = (long) r7;
        r1.c(r2, r3);
        r7 = r6.i;
        r1 = defpackage.ino.PRE_INIT_LOGGED;
        r7.b(r1, r3);
        throw r0;
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x00d1 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dic.a(java.util.Set):void");
    }

    public final void a(boolean z) {
        if (!this.t.getAndSet(z) || z) {
            aajt zzk = new zzk();
            String str = "com.snapchat.android.analytics.framework.openClientTs";
            long j = this.z.getLong(str, 0);
            if (j == 0) {
                j = ((abrk) this.m.get()).c(abro.APP_APPLICATION_OPEN_CLIENT_TS);
                this.z.edit().putLong(str, j).apply();
                this.i.c(ino.PROPERTY_STORE_USED_APP_OPEN_TS, 1);
            }
            double d = (double) j;
            Double.isNaN(d);
            zzk.a = Double.valueOf(d / 1000.0d);
            if (z) {
                a(zzk, false);
                return;
            }
            h(zzk);
        }
    }

    /* renamed from: b */
    public final void e() {
        if (this.a) {
            this.k.a(true);
            return;
        }
        this.i.c(ino.END_SESSION_BEFORE_INIT.a("onLogout", true), 1);
        this.u.add(new -$$Lambda$dic$Z9fzHjLcaMVrPAeyllocWbsKXpg(this));
    }

    public final boolean b(aajt aajt) {
        return this.a && !f(aajt) && this.h.a(aajt, this.s) && !djc.a(aajt);
    }

    public final ajdx<Boolean> c(aajt aajt) {
        return this.b.c(new -$$Lambda$dic$LLZ4qtZU7Cr_ed_gu7BaeX70rBs(this, aajt)).c(Boolean.FALSE).a();
    }

    public final void c() {
        for (dif dif : ((dig) this.e.get()).a()) {
            dif.b.c();
            if (!dif.f()) {
                dif.e(a.a("afterSessionEnd()", true));
            }
        }
    }

    public final ajcx d() {
        return this.b;
    }

    @Deprecated
    public final void d(aajt aajt) {
        a(aajt, false);
    }
}
