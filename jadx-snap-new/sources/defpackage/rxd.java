package defpackage;

import com.google.common.io.BaseEncoding;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import defpackage.adsg.a;
import java.util.Map;

/* renamed from: rxd */
public final class rxd implements rxc, rxj {
    final a a;
    final a b;
    private final ajdw c;
    private final ifa d;
    private final rwv e;
    private volatile boolean f = false;
    private volatile boolean g = false;
    private volatile String h;
    private volatile String i;
    private ajej j;

    /* renamed from: rxd$a */
    public class a {
        final ajws<rxm> a = new ajwl().r();
        rxm b = rxm.UNRECOGNIZED_VALUE;
        long c = -1;
        b d;

        public a() {
            this.d = new b();
        }

        private static boolean a(long j) {
            return j >= 0 && j <= 2048000000;
        }

        public final void a(rxm rxm, long j) {
            if (this.b == rxm.UNRECOGNIZED_VALUE && rxm != rxm.UNRECOGNIZED_VALUE) {
                this.b = rxm;
            }
            if (!a.a(this.c) && a.a(j)) {
                this.c = j;
            }
        }

        public final boolean a() {
            return (this.b == rxm.UNRECOGNIZED_VALUE && this.c == -1) ? false : true;
        }

        public final void b() {
            this.c = -1;
            this.b = rxm.UNRECOGNIZED_VALUE;
            this.d.a();
        }
    }

    /* renamed from: rxd$b */
    public class b {
        rxm a;
        int b = 0;

        protected b() {
        }

        public final void a() {
            this.a = null;
            this.b = 0;
        }
    }

    public rxd(rwv rwv, ifa ifa, ajdw ajdw) {
        this.d = ifa;
        this.c = ajdw;
        this.e = rwv;
        this.a = new a();
        this.b = new a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    private /* synthetic */ void a(com.google.common.base.Optional r5) {
        /*
        r4 = this;
        r4.h();	 Catch:{ all -> 0x009f }
        r5 = r4.b;	 Catch:{ all -> 0x009f }
        r5.b();	 Catch:{ all -> 0x009f }
        r5 = r4.a;	 Catch:{ all -> 0x009f }
        r5.b();	 Catch:{ all -> 0x009f }
        r5 = "Load bandwidth cache should not run on the main thread";
        defpackage.abmr.a(r5);	 Catch:{ all -> 0x009f }
        r5 = r4.d;	 Catch:{ all -> 0x009d }
        r5 = r5.k();	 Catch:{ all -> 0x009d }
        r0 = 1;
        r1 = 0;
        r2 = 0;
        if (r5 == 0) goto L_0x0033;
    L_0x001d:
        r4.f = r0;	 Catch:{ all -> 0x009d }
        r4.g = r2;	 Catch:{ all -> 0x009d }
        r5 = r4.d;	 Catch:{ all -> 0x009d }
        r5 = r5.h();	 Catch:{ all -> 0x009d }
        if (r5 != 0) goto L_0x002a;
    L_0x0029:
        goto L_0x006d;
    L_0x002a:
        r5 = r5.getBSSID();	 Catch:{ all -> 0x009d }
        r4.h = r5;	 Catch:{ all -> 0x009d }
        r5 = r4.h;	 Catch:{ all -> 0x009d }
        goto L_0x006e;
    L_0x0033:
        r5 = r4.d;	 Catch:{ all -> 0x009d }
        r5 = r5.i();	 Catch:{ all -> 0x009d }
        if (r5 == 0) goto L_0x0069;
    L_0x003b:
        r4.g = r0;	 Catch:{ all -> 0x009d }
        r4.f = r2;	 Catch:{ all -> 0x009d }
        r5 = r4.d;	 Catch:{ all -> 0x009d }
        r5 = r5.c();	 Catch:{ all -> 0x009d }
        r0 = r4.d;	 Catch:{ all -> 0x009d }
        r0 = r0.b();	 Catch:{ all -> 0x009d }
        if (r5 == 0) goto L_0x006d;
    L_0x004d:
        if (r0 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x006d;
    L_0x0050:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009d }
        r2.<init>();	 Catch:{ all -> 0x009d }
        r2.append(r5);	 Catch:{ all -> 0x009d }
        r5 = "-";
        r2.append(r5);	 Catch:{ all -> 0x009d }
        r2.append(r0);	 Catch:{ all -> 0x009d }
        r5 = r2.toString();	 Catch:{ all -> 0x009d }
        r4.i = r5;	 Catch:{ all -> 0x009d }
        r5 = r4.i;	 Catch:{ all -> 0x009d }
        goto L_0x006e;
    L_0x0069:
        r4.f = r2;	 Catch:{ all -> 0x009d }
        r4.g = r2;	 Catch:{ all -> 0x009d }
    L_0x006d:
        r5 = r1;
    L_0x006e:
        if (r5 != 0) goto L_0x0071;
    L_0x0070:
        return;
    L_0x0071:
        r0 = r4.e;	 Catch:{ all -> 0x009d }
        r2 = r0.a();	 Catch:{ all -> 0x009d }
        if (r2 != 0) goto L_0x007a;
    L_0x0079:
        goto L_0x0087;
    L_0x007a:
        r0 = r0.a;	 Catch:{ all -> 0x009d }
        r5 = defpackage.rwv.a(r5);	 Catch:{ all -> 0x009d }
        r5 = r0.get(r5);	 Catch:{ all -> 0x009d }
        r1 = r5;
        r1 = (defpackage.rwv.a) r1;	 Catch:{ all -> 0x009d }
    L_0x0087:
        if (r1 != 0) goto L_0x008a;
    L_0x0089:
        return;
    L_0x008a:
        r5 = r4.b;	 Catch:{ all -> 0x009d }
        r0 = r1.b;	 Catch:{ all -> 0x009d }
        r2 = r1.a;	 Catch:{ all -> 0x009d }
        r5.a(r0, r2);	 Catch:{ all -> 0x009d }
        r5 = r4.a;	 Catch:{ all -> 0x009d }
        r0 = r1.d;	 Catch:{ all -> 0x009d }
        r1 = r1.c;	 Catch:{ all -> 0x009d }
        r5.a(r0, r1);	 Catch:{ all -> 0x009d }
        return;
    L_0x009d:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x009f }
    L_0x009f:
        r5 = move-exception;
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.a(com.google.common.base.Optional):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002d  */
    private void h() {
        /*
        r11 = this;
        r0 = "Save bandwidth cache should not run on the main thread";
        defpackage.abmr.a(r0);
        r0 = r11.f;	 Catch:{ all -> 0x005c }
        if (r0 == 0) goto L_0x000c;
    L_0x0009:
        r0 = r11.h;	 Catch:{ all -> 0x005c }
        goto L_0x0014;
    L_0x000c:
        r0 = r11.g;	 Catch:{ all -> 0x005c }
        if (r0 == 0) goto L_0x0013;
    L_0x0010:
        r0 = r11.i;	 Catch:{ all -> 0x005c }
        goto L_0x0014;
    L_0x0013:
        r0 = 0;
    L_0x0014:
        if (r0 != 0) goto L_0x0017;
    L_0x0016:
        return;
    L_0x0017:
        r1 = r11.a;	 Catch:{ all -> 0x005c }
        r1 = r1.a();	 Catch:{ all -> 0x005c }
        if (r1 != 0) goto L_0x002a;
    L_0x001f:
        r1 = r11.b;	 Catch:{ all -> 0x005c }
        r1 = r1.a();	 Catch:{ all -> 0x005c }
        if (r1 == 0) goto L_0x0028;
    L_0x0027:
        goto L_0x002a;
    L_0x0028:
        r1 = 0;
        goto L_0x002b;
    L_0x002a:
        r1 = 1;
    L_0x002b:
        if (r1 == 0) goto L_0x005b;
    L_0x002d:
        r1 = new rwv$a;	 Catch:{ all -> 0x005c }
        r2 = r11.b;	 Catch:{ all -> 0x005c }
        r3 = r2.c;	 Catch:{ all -> 0x005c }
        r2 = r11.b;	 Catch:{ all -> 0x005c }
        r5 = r2.b;	 Catch:{ all -> 0x005c }
        r2 = r11.a;	 Catch:{ all -> 0x005c }
        r6 = r2.c;	 Catch:{ all -> 0x005c }
        r2 = r11.a;	 Catch:{ all -> 0x005c }
        r8 = r2.b;	 Catch:{ all -> 0x005c }
        r9 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x005c }
        r2 = r1;
        r2.<init>(r3, r5, r6, r8, r9);	 Catch:{ all -> 0x005c }
        r2 = r11.e;	 Catch:{ all -> 0x005c }
        r3 = r2.a();	 Catch:{ all -> 0x005c }
        if (r3 == 0) goto L_0x005b;
    L_0x004f:
        if (r0 != 0) goto L_0x0052;
    L_0x0051:
        goto L_0x005b;
    L_0x0052:
        r2 = r2.a;	 Catch:{ all -> 0x005c }
        r0 = defpackage.rwv.a(r0);	 Catch:{ all -> 0x005c }
        r2.put(r0, r1);	 Catch:{ all -> 0x005c }
    L_0x005b:
        return;
    L_0x005c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.h():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x00fd in {8, 10, 11, 13, 15, 24, 27, 30, 32, 34} preds:[]
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
    private /* synthetic */ void i() {
        /*
        r8 = this;
        r8.h();
        r0 = r8.e;
        r1 = new java.util.HashSet;	 Catch:{ all -> 0x00fb }
        r1.<init>();	 Catch:{ all -> 0x00fb }
        r2 = r0.a;	 Catch:{ all -> 0x00fb }
        r2 = r2.entrySet();	 Catch:{ all -> 0x00fb }
        r2 = r2.iterator();	 Catch:{ all -> 0x00fb }
        r3 = r2.hasNext();	 Catch:{ all -> 0x00fb }
        if (r3 == 0) goto L_0x0092;	 Catch:{ all -> 0x00fb }
        r3 = r2.next();	 Catch:{ all -> 0x00fb }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ all -> 0x00fb }
        r4 = r3.getKey();	 Catch:{ all -> 0x00fb }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x00fb }
        r3 = r3.getValue();	 Catch:{ all -> 0x00fb }
        r3 = (defpackage.rwv.a) r3;	 Catch:{ all -> 0x00fb }
        r5 = new adsg$a;	 Catch:{ all -> 0x00fb }
        r5.<init>();	 Catch:{ all -> 0x00fb }
        r6 = r3.e;	 Catch:{ all -> 0x00fb }
        r6 = r0.a(r6);	 Catch:{ all -> 0x00fb }
        if (r6 != 0) goto L_0x0084;	 Catch:{ all -> 0x00fb }
        if (r4 == 0) goto L_0x007e;	 Catch:{ all -> 0x00fb }
        r5.b = r4;	 Catch:{ all -> 0x00fb }
        r4 = r5.a;	 Catch:{ all -> 0x00fb }
        r4 = r4 | 1;	 Catch:{ all -> 0x00fb }
        r5.a = r4;	 Catch:{ all -> 0x00fb }
        r6 = r3.a;	 Catch:{ all -> 0x00fb }
        r5.c = r6;	 Catch:{ all -> 0x00fb }
        r4 = r5.a;	 Catch:{ all -> 0x00fb }
        r4 = r4 | 2;	 Catch:{ all -> 0x00fb }
        r5.a = r4;	 Catch:{ all -> 0x00fb }
        r4 = r3.b;	 Catch:{ all -> 0x00fb }
        r4 = r4.ordinal();	 Catch:{ all -> 0x00fb }
        r5.d = r4;	 Catch:{ all -> 0x00fb }
        r4 = r5.a;	 Catch:{ all -> 0x00fb }
        r4 = r4 | 4;	 Catch:{ all -> 0x00fb }
        r5.a = r4;	 Catch:{ all -> 0x00fb }
        r6 = r3.c;	 Catch:{ all -> 0x00fb }
        r5.e = r6;	 Catch:{ all -> 0x00fb }
        r4 = r5.a;	 Catch:{ all -> 0x00fb }
        r4 = r4 | 8;	 Catch:{ all -> 0x00fb }
        r5.a = r4;	 Catch:{ all -> 0x00fb }
        r4 = r3.d;	 Catch:{ all -> 0x00fb }
        r4 = r4.ordinal();	 Catch:{ all -> 0x00fb }
        r5.f = r4;	 Catch:{ all -> 0x00fb }
        r4 = r5.a;	 Catch:{ all -> 0x00fb }
        r4 = r4 | 16;	 Catch:{ all -> 0x00fb }
        r5.a = r4;	 Catch:{ all -> 0x00fb }
        r3 = r3.e;	 Catch:{ all -> 0x00fb }
        r5.g = r3;	 Catch:{ all -> 0x00fb }
        r3 = r5.a;	 Catch:{ all -> 0x00fb }
        r3 = r3 | 32;	 Catch:{ all -> 0x00fb }
        r5.a = r3;	 Catch:{ all -> 0x00fb }
        goto L_0x0085;	 Catch:{ all -> 0x00fb }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x00fb }
        r0.<init>();	 Catch:{ all -> 0x00fb }
        throw r0;	 Catch:{ all -> 0x00fb }
        r5 = 0;	 Catch:{ all -> 0x00fb }
        if (r5 == 0) goto L_0x008a;	 Catch:{ all -> 0x00fb }
        r1.add(r5);	 Catch:{ all -> 0x00fb }
        r3 = r1.size();	 Catch:{ all -> 0x00fb }
        r4 = 50;	 Catch:{ all -> 0x00fb }
        if (r3 < r4) goto L_0x0014;	 Catch:{ all -> 0x00fb }
        r2 = new adsg;	 Catch:{ all -> 0x00fb }
        r2.<init>();	 Catch:{ all -> 0x00fb }
        r3 = r1.size();	 Catch:{ all -> 0x00fb }
        r3 = new defpackage.adsg.a[r3];	 Catch:{ all -> 0x00fb }
        r1 = r1.toArray(r3);	 Catch:{ all -> 0x00fb }
        r1 = (defpackage.adsg.a[]) r1;	 Catch:{ all -> 0x00fb }
        r2.a = r1;	 Catch:{ all -> 0x00fb }
        r1 = com.google.protobuf.nano.MessageNano.toByteArray(r2);	 Catch:{ all -> 0x00fb }
        r2 = r1.length;	 Catch:{ all -> 0x00fb }
        r3 = "";
        if (r2 <= 0) goto L_0x00c4;
        r2 = com.google.common.io.BaseEncoding.base64();	 Catch:{ all -> 0x00fb }
        r1 = r2.encode(r1);	 Catch:{ all -> 0x00fb }
        r1 = r1.getBytes();	 Catch:{ all -> 0x00fb }
        if (r1 == 0) goto L_0x00c4;	 Catch:{ all -> 0x00fb }
        r2 = r1.length;	 Catch:{ all -> 0x00fb }
        if (r2 <= 0) goto L_0x00c4;	 Catch:{ all -> 0x00fb }
        r3 = new java.lang.String;	 Catch:{ all -> 0x00fb }
        r3.<init>(r1);	 Catch:{ all -> 0x00fb }
        r1 = r3.isEmpty();	 Catch:{ all -> 0x00fb }
        if (r1 == 0) goto L_0x00cb;	 Catch:{ all -> 0x00fb }
        goto L_0x00e2;	 Catch:{ all -> 0x00fb }
        r0 = r0.c;	 Catch:{ all -> 0x00fb }
        r0 = r0.get();	 Catch:{ all -> 0x00fb }
        r0 = (defpackage.tnj) r0;	 Catch:{ all -> 0x00fb }
        r0 = r0.b();	 Catch:{ all -> 0x00fb }
        r1 = defpackage.rxp.BANDWIDTH_HISTORY;	 Catch:{ all -> 0x00fb }
        r0 = r0.a(r1, r3);	 Catch:{ all -> 0x00fb }
        if (r0 == 0) goto L_0x00e2;	 Catch:{ all -> 0x00fb }
        r0.b();	 Catch:{ all -> 0x00fb }
        r0 = r8.e;
        r0 = r0.b;
        r0 = r0.get();
        r0 = (defpackage.ygi) r0;
        r1 = defpackage.rwv.b.DEFAULT;
        r1 = com.google.common.collect.ImmutableSet.of(r1);
        r0.b(r1);
        r0 = r8.j;
        r0.dispose();
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.i():void");
    }

    private /* synthetic */ void j() {
        this.j = this.d.e().j(ajfu.a).a(this.c).f(new -$$Lambda$rxd$LUbECfjvjpPUb1THvXxS16EB5kM(this));
        rwv rwv = this.e;
        if (!rwv.f) {
            try {
                a[] aVarArr = ((adsg) MessageNano.mergeFrom(new adsg(), BaseEncoding.base64().decode(((ftl) rwv.d.get()).j(rxp.BANDWIDTH_HISTORY)))).a;
                int length = aVarArr.length;
                int i = 0;
                while (i < length) {
                    a[] aVarArr2;
                    a aVar = aVarArr[i];
                    if (rwv.a(aVar.g)) {
                        aVarArr2 = aVarArr;
                    } else {
                        Map map = rwv.a;
                        String str = aVar.b;
                        long j = aVar.c;
                        rxm a = rxm.a(aVar.d);
                        long j2 = aVar.e;
                        rxm a2 = rxm.a(aVar.f);
                        aVarArr2 = aVarArr;
                        long j3 = aVar.g;
                        rwv.a aVar2 = r8;
                        rwv.a aVar3 = new rwv.a(j, a, j2, a2, j3);
                        map.put(str, aVar2);
                    }
                    i++;
                    aVarArr = aVarArr2;
                }
            } catch (InvalidProtocolBufferNanoException e) {
                idd callsite = iew.a.callsite("BandwidthCacheLoader");
                ((gqr) rwv.e.get()).a(gqt.NORMAL, e, callsite, callsite.a());
            }
            rwv.f = true;
        }
    }

    public final rxm a() {
        return this.b.b;
    }

    public final void a(long j, boolean z) {
        this.c.a(new -$$Lambda$rxd$IAQFWKQwL5p4-6iQsFmRjfbj4x0(this, z, j));
    }

    public final rxm b() {
        return this.a.b;
    }

    public final ajdp<rxm> c() {
        return this.b.a.f();
    }

    public final long d() {
        return this.b.c;
    }

    public final long e() {
        return this.a.c;
    }

    public final void f() {
        this.c.a(new -$$Lambda$rxd$Dwkmy_6Y7pMp2uOmZ4qHR5LCNoA(this));
    }

    public final void g() {
        this.c.a(new -$$Lambda$rxd$l0cPaV6YSAajzYcFNxRNxNA8Wv0(this));
    }
}
