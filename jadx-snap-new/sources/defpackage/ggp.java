package defpackage;

import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ggp */
public final class ggp {
    ajej a;
    rzb<ryz> b;
    final HashMap<ajdy<gej>, geg> c = new HashMap();
    final HashSet<gdy> d = new HashSet();
    gdz e = new gdz(0, 0, false, 7);
    ifl f;
    ifl g;
    final String h = this.i.a();
    final geg i;
    final gea j;
    final gfl k;
    final ihh l;
    private gej m;
    private ajdy<gej> n;
    private final ifl o = new ifl(this.l);
    private final akbl<ggp, ajxw> p;

    /* renamed from: ggp$a */
    static final class a implements ajfa {
        private /* synthetic */ ggp a;
        private /* synthetic */ geg b;
        private /* synthetic */ ajdy c;

        a(ggp ggp, geg geg, ajdy ajdy) {
            this.a = ggp;
            this.b = geg;
            this.c = ajdy;
        }

        public final void cancel() {
            Object obj;
            akcr.a(Looper.myLooper(), Looper.getMainLooper());
            ggp ggp = this.a;
            ajdy ajdy = this.c;
            akcr.b(ajdy, "subscriber");
            synchronized (ggp) {
                obj = ggp.c.remove(ajdy) != null ? 1 : null;
            }
            if (obj != null) {
                ggp.a(defpackage.ghx.a.a(ggp.i));
            }
        }
    }

    public ggp(geg geg, gea gea, gfl gfl, ihh ihh, akbl<? super ggp, ajxw> akbl) {
        akcr.b(geg, "initRequest");
        akcr.b(gea, "cachePolicy");
        akcr.b(gfl, "payloadProcessor");
        akcr.b(ihh, "clock");
        akcr.b(akbl, "doFinally");
        this.i = geg;
        this.j = gea;
        this.k = gfl;
        this.l = ihh;
        this.p = akbl;
    }

    private synchronized gff a(sat<sai> sat, ifl ifl, gdv gdv) {
        gff gff;
        sat<sai> sat2 = sat;
        synchronized (this) {
            long j;
            int c;
            akcr.b(sat2, "result");
            Object ifl2 = ifl == null ? new ifl(this.l) : ifl;
            ifl ifl3 = new ifl(this.l);
            gfc gfc = gfc.NETWORK;
            long a = ifl3.a(this.o);
            akcr.b(sat2, "result");
            akcr.b(ifl2, "resultReceivedTime");
            akcr.b(ifl3, "processEndTimestamp");
            Object a2 = sat.a();
            akcr.a(a2, "result.response");
            int a3 = a2.a();
            long a4 = ifl3.a(sat.c().d);
            long a5 = sat.c().a();
            long a6 = ifl2.a(sat.c().e);
            a2 = sat.a();
            akcr.a(a2, "result.response");
            sai sai = (sai) a2.g();
            if (sai != null) {
                j = a;
                c = (int) sai.c();
            } else {
                j = a;
                c = -1;
            }
            long a7 = ifl3.a(ifl2);
            ifl2 = sat.b();
            akcr.a(ifl2, "result.request");
            String i = ifl2.i();
            akcr.a((Object) i, "result.request.url");
            Object a8 = sat.a();
            akcr.a(a8, "result.response");
            a8 = a8.h();
            akcr.a(a8, "result.response.headers");
            gff = new gff(gfc, false, j, new gfj(a3, a4, a5, a6, c, a7, i, ajzm.c((Map) a8)), this.e, null, gdv, 98);
        }
        return gff;
    }

    public final synchronized gff a(ifl ifl) {
        ifl ifl2;
        ifl ifl3;
        ifl2 = this.g;
        if (ifl2 == null) {
            ifl2 = new ifl(this.l);
        }
        if (ifl == null) {
            ifl = new ifl(this.l);
        }
        ifl3 = new ifl(this.l);
        return new gff(gfc.IMPORT, false, ifl3.a(this.o), null, this.e, new gfa(ifl3.a(ifl2), ifl3.a(ifl)), null, 202);
    }

    public final ggp a(geg geg, ajdy<gej> ajdy) {
        akcr.b(geg, "request");
        akcr.b(ajdy, "subscriber");
        synchronized (this) {
            if (a()) {
                return null;
            }
            this.c.put(ajdy, geg);
            if (this.n == null) {
                this.n = ajdy;
            }
            this.d.addAll(geg.h());
            ajdy.a((ajfa) new a(this, geg, ajdy));
            return this;
        }
    }

    public final ryz a(String str, gdw gdw) {
        akcr.b(str, "url");
        akcr.b(gdw, "boltRequest");
        return a(str, sac.GET, gdw.b, null, gdw.c);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x00a5 in {5, 7, 9} preds:[]
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
    final defpackage.ryz a(java.lang.String r5, defpackage.sac r6, java.util.Map<java.lang.String, java.lang.String> r7, java.lang.Object r8, java.util.Map<java.lang.String, ?> r9) {
        /*
        r4 = this;
        r0 = r4.c;
        r0 = r0.values();
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x009b;
        r0 = r4.c;
        r0 = r0.values();
        r1 = "subscriberRequests.values";
        defpackage.akcr.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r0 = defpackage.ajyu.d(r0);
        r2 = "subscriberRequests.values.first()";
        defpackage.akcr.a(r0, r2);
        r0 = (defpackage.geg) r0;
        r2 = new java.util.HashSet;
        r2.<init>();
        r3 = r4.c;
        r3 = r3.values();
        defpackage.akcr.a(r3, r1);
        r3 = (java.lang.Iterable) r3;
        r1 = r3.iterator();
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x004e;
        r3 = r1.next();
        r3 = (defpackage.geg) r3;
        r3 = r3.g();
        r3 = (java.util.Collection) r3;
        r2.addAll(r3);
        goto L_0x0038;
        r1 = new ryz$a;
        r3 = r0.f();
        r3 = r3.b();
        r2 = (java.util.Set) r2;
        r1.<init>(r5, r6, r3, r2);
        r5 = r1.a(r7);
        r5 = r5.a(r8);
        r5 = r5.b(r9);
        r6 = "it";
        defpackage.akcr.a(r5, r6);
        r6 = r5;
        r6 = (defpackage.sak.a) r6;
        r7 = r4.h;
        defpackage.sbr.a(r6, r7);
        r7 = r4.i;
        r7 = r7.i();
        defpackage.sbr.a(r6, r7);
        r7 = r0.f();
        r7 = r7.c();
        defpackage.sbr.b(r6, r7);
        r7 = defpackage.gei.b(r0);
        defpackage.sbr.c(r6, r7);
        r5 = r5.e();
        r6 = "NetworkRequest.Builder(u…                }.build()";
        defpackage.akcr.a(r5, r6);
        return r5;
        r5 = new java.lang.IllegalArgumentException;
        r6 = "Empty subscriber requests";
        r5.<init>(r6);
        r5 = (java.lang.Throwable) r5;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggp.a(java.lang.String, sac, java.util.Map, java.lang.Object, java.util.Map):ryz");
    }

    /* JADX WARNING: Missing block: B:24:0x0052, code skipped:
            r3.p.invoke(r3);
     */
    /* JADX WARNING: Missing block: B:25:0x005b, code skipped:
            if (defpackage.ggu.a(r0, r1, r4) != false) goto L_0x0060;
     */
    /* JADX WARNING: Missing block: B:26:0x005d, code skipped:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:27:0x0060, code skipped:
            return;
     */
    public final void a(defpackage.gej r4) {
        /*
        r3 = this;
        r0 = "contentResult";
        defpackage.akcr.b(r4, r0);
        java.util.Collections.emptySet();
        monitor-enter(r3);
        r0 = r3.a();	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r4.close();	 Catch:{ all -> 0x0061 }
        monitor-exit(r3);
        return;
    L_0x0014:
        r0 = defpackage.ghx.a.a(r4);	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0032;
    L_0x001a:
        r0 = r3.c;	 Catch:{ all -> 0x0061 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x0024;
    L_0x0022:
        monitor-exit(r3);
        return;
    L_0x0024:
        r0 = r3.b;	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r0.b();	 Catch:{ all -> 0x0061 }
    L_0x002b:
        r0 = r3.a;	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0032;
    L_0x002f:
        r0.dispose();	 Catch:{ all -> 0x0061 }
    L_0x0032:
        r3.m = r4;	 Catch:{ all -> 0x0061 }
        r0 = 0;
        r3.b = r0;	 Catch:{ all -> 0x0061 }
        r3.a = r0;	 Catch:{ all -> 0x0061 }
        r1 = r3.n;	 Catch:{ all -> 0x0061 }
        r3.n = r0;	 Catch:{ all -> 0x0061 }
        r0 = new java.util.HashSet;	 Catch:{ all -> 0x0061 }
        r2 = r3.c;	 Catch:{ all -> 0x0061 }
        r2 = r2.keySet();	 Catch:{ all -> 0x0061 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0061 }
        r0.<init>(r2);	 Catch:{ all -> 0x0061 }
        r0 = (java.util.Set) r0;	 Catch:{ all -> 0x0061 }
        r2 = r3.c;	 Catch:{ all -> 0x0061 }
        r2.clear();	 Catch:{ all -> 0x0061 }
        monitor-exit(r3);
        r2 = r3.p;
        r2.invoke(r3);
        r0 = defpackage.ggu.b(r0, r1, r4);
        if (r0 != 0) goto L_0x0060;
    L_0x005d:
        r4.close();
    L_0x0060:
        return;
    L_0x0061:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggp.a(gej):void");
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.m != null;
    }
}
