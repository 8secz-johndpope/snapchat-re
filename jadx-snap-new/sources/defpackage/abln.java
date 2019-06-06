package defpackage;

import android.os.SystemClock;
import com.google.common.collect.Sets;
import java.util.HashSet;

/* renamed from: abln */
public abstract class abln {
    private final aipn<ablh> a;
    private final HashSet<abll> b = Sets.newHashSet();
    private boolean c;
    private ablm d;
    private g e;

    /* renamed from: abln$e */
    public interface e extends c {
    }

    /* renamed from: abln$c */
    public interface c {
        String a();
    }

    /* renamed from: abln$a */
    public interface a {
        String name();
    }

    /* renamed from: abln$b */
    public interface b extends c {
    }

    /* renamed from: abln$d */
    public interface d extends c {
    }

    /* renamed from: abln$h */
    public interface h {
        String name();
    }

    /* renamed from: abln$g */
    public interface g {
    }

    /* renamed from: abln$f */
    public interface f extends c {
    }

    protected abln(aipn<ablh> aipn) {
        this.a = aipn;
    }

    /* JADX WARNING: Missing block: B:12:0x0032, code skipped:
            return;
     */
    private synchronized void a(defpackage.abln.d r2, long r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.d;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0031;
    L_0x0005:
        r0 = r1.d;	 Catch:{ all -> 0x0033 }
        r0 = r0.d;	 Catch:{ all -> 0x0033 }
        r0 = r0.containsKey(r2);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0020;
    L_0x000f:
        r3 = "instant %s duplicate";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0033 }
        r0 = 0;
        r2 = r2.a();	 Catch:{ all -> 0x0033 }
        r4[r0] = r2;	 Catch:{ all -> 0x0033 }
        r1.a(r3, r4);	 Catch:{ all -> 0x0033 }
        monitor-exit(r1);
        return;
    L_0x0020:
        r2.a();	 Catch:{ all -> 0x0033 }
        defpackage.zgo.b();	 Catch:{ all -> 0x0033 }
        r0 = r1.d;	 Catch:{ all -> 0x0033 }
        r0 = r0.d;	 Catch:{ all -> 0x0033 }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0033 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0033 }
    L_0x0031:
        monitor-exit(r1);
        return;
    L_0x0033:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abln.a(abln$d, long):void");
    }

    private void a(String str, Object... objArr) {
        str = String.format(str, objArr);
        if (this.d.j.length() < 256) {
            StringBuilder stringBuilder = this.d.j;
            stringBuilder.append('|');
            stringBuilder.append(str);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0066 in {4, 5, 8, 9, 11, 13, 16, 19} preds:[]
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
    public synchronized defpackage.abll a(defpackage.abln.a r5, defpackage.abln.e r6, defpackage.abln.g r7) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.a;	 Catch:{ all -> 0x0063 }
        r0 = r0.get();	 Catch:{ all -> 0x0063 }
        r0 = (defpackage.ablh) r0;	 Catch:{ all -> 0x0063 }
        r0.a();	 Catch:{ all -> 0x0063 }
        if (r6 == 0) goto L_0x0013;	 Catch:{ all -> 0x0063 }
        r6 = defpackage.abll.a(r6);	 Catch:{ all -> 0x0063 }
        goto L_0x0014;	 Catch:{ all -> 0x0063 }
        r6 = 0;	 Catch:{ all -> 0x0063 }
        r0 = r4.d;	 Catch:{ all -> 0x0063 }
        if (r0 != 0) goto L_0x0020;	 Catch:{ all -> 0x0063 }
        r0 = new ablm;	 Catch:{ all -> 0x0063 }
        r0.<init>();	 Catch:{ all -> 0x0063 }
        r4.d = r0;	 Catch:{ all -> 0x0063 }
        goto L_0x003a;	 Catch:{ all -> 0x0063 }
        r0 = r4.d;	 Catch:{ all -> 0x0063 }
        r0 = r0.j;	 Catch:{ all -> 0x0063 }
        r0 = r0.toString();	 Catch:{ all -> 0x0063 }
        r1 = new ablm;	 Catch:{ all -> 0x0063 }
        r1.<init>();	 Catch:{ all -> 0x0063 }
        r4.d = r1;	 Catch:{ all -> 0x0063 }
        r1 = "starting launch measurement without closing previous:(%s)";	 Catch:{ all -> 0x0063 }
        r2 = 1;	 Catch:{ all -> 0x0063 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0063 }
        r3 = 0;	 Catch:{ all -> 0x0063 }
        r2[r3] = r0;	 Catch:{ all -> 0x0063 }
        r4.a(r1, r2);	 Catch:{ all -> 0x0063 }
        if (r6 == 0) goto L_0x0047;	 Catch:{ all -> 0x0063 }
        r0 = r4.d;	 Catch:{ all -> 0x0063 }
        r1 = r6.d;	 Catch:{ all -> 0x0063 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0063 }
        r0.a = r1;	 Catch:{ all -> 0x0063 }
        goto L_0x0052;	 Catch:{ all -> 0x0063 }
        r0 = r4.d;	 Catch:{ all -> 0x0063 }
        r1 = android.os.SystemClock.elapsedRealtimeNanos();	 Catch:{ all -> 0x0063 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0063 }
        goto L_0x0044;	 Catch:{ all -> 0x0063 }
        r0 = r4.d;	 Catch:{ all -> 0x0063 }
        r0.b = r5;	 Catch:{ all -> 0x0063 }
        r5 = r4.d;	 Catch:{ all -> 0x0063 }
        r5 = r5.e;	 Catch:{ all -> 0x0063 }
        r0 = r4.b;	 Catch:{ all -> 0x0063 }
        r5.addAll(r0);	 Catch:{ all -> 0x0063 }
        r4.e = r7;	 Catch:{ all -> 0x0063 }
        monitor-exit(r4);
        return r6;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abln.a(abln$a, abln$e, abln$g):abll");
    }

    public final synchronized void a(abll abll) {
        this.b.add(new abll(abll));
    }

    /* JADX WARNING: Missing block: B:12:0x0028, code skipped:
            return;
     */
    public final synchronized void a(defpackage.abln.c r3, java.lang.Object r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.d;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0027;
    L_0x0005:
        r0 = r2.d;	 Catch:{ all -> 0x0029 }
        r0 = r0.g;	 Catch:{ all -> 0x0029 }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0020;
    L_0x000f:
        r4 = "series %s duplicate";
        r0 = 1;
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0029 }
        r1 = 0;
        r3 = r3.a();	 Catch:{ all -> 0x0029 }
        r0[r1] = r3;	 Catch:{ all -> 0x0029 }
        r2.a(r4, r0);	 Catch:{ all -> 0x0029 }
        monitor-exit(r2);
        return;
    L_0x0020:
        r0 = r2.d;	 Catch:{ all -> 0x0029 }
        r0 = r0.g;	 Catch:{ all -> 0x0029 }
        r0.put(r3, r4);	 Catch:{ all -> 0x0029 }
    L_0x0027:
        monitor-exit(r2);
        return;
    L_0x0029:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abln.a(abln$c, java.lang.Object):void");
    }

    public final synchronized void a(d dVar) {
        a(dVar, SystemClock.elapsedRealtimeNanos());
    }

    public final synchronized void a(h hVar, long j) {
        if (this.d != null) {
            this.d.h = hVar;
            this.d.i = Long.valueOf(j);
            if (this.c) {
                hVar.name();
                zgo.b();
                ((ablh) this.a.get()).a(this.d);
            }
            e();
        }
    }

    /* JADX WARNING: Missing block: B:18:0x0044, code skipped:
            return;
     */
    public final synchronized void b(defpackage.abll r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.d;	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x0043;
    L_0x0005:
        r0 = r3.d;	 Catch:{ all -> 0x0045 }
        r0 = r0.e;	 Catch:{ all -> 0x0045 }
        r0 = r0.contains(r4);	 Catch:{ all -> 0x0045 }
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0022;
    L_0x0011:
        r0 = "section %s duplicate";
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0045 }
        r4 = r4.c;	 Catch:{ all -> 0x0045 }
        r4 = r4.a();	 Catch:{ all -> 0x0045 }
        r2[r1] = r4;	 Catch:{ all -> 0x0045 }
        r3.a(r0, r2);	 Catch:{ all -> 0x0045 }
        monitor-exit(r3);
        return;
    L_0x0022:
        r0 = r4.f;	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x0037;
    L_0x0026:
        r0 = "section %s not closed";
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0045 }
        r4 = r4.c;	 Catch:{ all -> 0x0045 }
        r4 = r4.a();	 Catch:{ all -> 0x0045 }
        r2[r1] = r4;	 Catch:{ all -> 0x0045 }
        r3.a(r0, r2);	 Catch:{ all -> 0x0045 }
        monitor-exit(r3);
        return;
    L_0x0037:
        r0 = r3.d;	 Catch:{ all -> 0x0045 }
        r0 = r0.e;	 Catch:{ all -> 0x0045 }
        r1 = new abll;	 Catch:{ all -> 0x0045 }
        r1.<init>(r4);	 Catch:{ all -> 0x0045 }
        r0.add(r1);	 Catch:{ all -> 0x0045 }
    L_0x0043:
        monitor-exit(r3);
        return;
    L_0x0045:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abln.b(abll):void");
    }

    public synchronized void e() {
        this.d = null;
        this.c = false;
        this.e = null;
    }

    public final synchronized ablm f() {
        return this.d;
    }

    public final synchronized void g() {
        if (this.d != null) {
            this.c = true;
        }
    }
}
