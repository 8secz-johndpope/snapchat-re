package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import defpackage.abjw.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: rbm */
public final class rbm implements rbe {
    private final ajdx<abiq> a;
    private final ajwl<rbf> b;
    private final DbClient c;
    private final ajwy<iqx> d;
    private final ajwy<qvd> e;
    private final ajwy<qxl> f;
    private final Map<String, rbd> g;
    private final Map<String, rbg> h;
    private final ajwy<quk> i;
    private final ajwy<qus> j;
    private final ajwy<ezd> k;
    private final ajwy<eyn> l;
    private final zfw m;
    private ajej n = ajfq.INSTANCE;
    private ajei o = new ajei();

    /* renamed from: rbm$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.abjw.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.abjw.a.TYPING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.abjw.a.PAUSED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.abjw.a.FINISHED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.abjw.a.NONE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rbm$1.<clinit>():void");
        }
    }

    public rbm(ajdx<abiq> ajdx, ajwy<SnapDb> ajwy, ajwy<iqx> ajwy2, ajwy<qvd> ajwy3, ajwy<qxl> ajwy4, ajwy<quk> ajwy5, ajwy<qus> ajwy6, ajwy<ezd> ajwy7, ajwy<eyn> ajwy8) {
        this.i = ajwy5;
        this.j = ajwy6;
        idd callsite = pry.a.callsite("ScActiveConversationManager");
        this.c = ((SnapDb) ajwy.get()).getDbClient(callsite);
        this.a = ajdx;
        this.d = ajwy2;
        this.e = ajwy3;
        this.f = ajwy4;
        this.g = Maps.newHashMap();
        this.h = Maps.newHashMap();
        this.b = ajwl.i(e());
        this.m = zgb.a(callsite);
        this.k = ajwy7;
        this.l = ajwy8;
    }

    private static a a(Map<String, a> map, String str) {
        return (a) MoreObjects.firstNonNull(map.get(str), a.NONE);
    }

    private ajcx a(rbf rbf) {
        if (rbf.b.isEmpty()) {
            return ajvo.a(ajhn.a);
        }
        return this.c.runInTransactionCompat("ScActiveConversationManager:updateDisplayInfo", new -$$Lambda$rbm$KuRsq1ZKU8yVJ_dqxmJ9ON0F-Dg(this, rbf));
    }

    private static String a(abie abie) {
        for (abjw abjw : abie.c()) {
            if (rbm.a(abjw.b())) {
                return abjw.a();
            }
        }
        return null;
    }

    private List<String> a(String str, List<abjk> list) {
        if (list.isEmpty() || str == null) {
            return new ArrayList();
        }
        List arrayList = new ArrayList();
        for (abjk abjk : list) {
            if (str.equals(abjk.b())) {
                arrayList.add(((iqx) this.d.get()).d(abjk.a()));
            }
        }
        return res.a(arrayList, new ArrayList());
    }

    private List<String> a(List<String> list) {
        return FluentIterable.from(list).transform(new -$$Lambda$rbm$kCasLfbb1Kvjo27S8Q2AQOMltWs(this)).toList();
    }

    private rbd a(String str, abie abie) {
        String a = rbm.a(abie);
        String d = rbm.d(abie.d());
        return new rbd(rbm.a(str), abie.a(), a(abie.b()), a, a != null ? ((iqx) this.d.get()).d(a) : null, b(abie.c()), rbm.c(abie.c()), a(d, abie.d()), d);
    }

    private /* synthetic */ rbf a(String str, String str2, rbg rbg, rbd rbd, Optional optional) {
        if (optional.isPresent() && str.equals(((fgk) optional.get()).d)) {
            this.h.put(str2, rbg);
            this.g.put(str2, rbd);
        }
        return e();
    }

    private void a(String str, rbd rbd, rbg rbg) {
        String str2 = rbd.h;
        if (str2 == null) {
            this.h.put(str, rbg);
            this.g.put(str, rbd);
        } else if (((eyn) this.l.get()).a(str, str2) != null) {
            this.h.put(str, rbg);
            this.g.put(str, rbd);
        } else {
            this.o.a(((eyn) this.l.get()).b(str, str2).f(new -$$Lambda$rbm$9L6yY-dECQJ5ByOWl24AOC6-2yU(this, str2, str, rbg, rbd)).e(new -$$Lambda$rbm$W1blzVORPUyG40ZiWqXV2T34sE0(this)).a(new -$$Lambda$nbaFxFkiQzqejipSHoYMp2mOqZE(this), new -$$Lambda$rbm$HnioDs2j1fz_XePS5WpWUdH33g8(str, str2)));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x003a in {5, 8, 11} preds:[]
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
    private synchronized void a(java.util.Map<java.lang.String, defpackage.abie> r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r2.b(r3);	 Catch:{ all -> 0x0037 }
        r3 = r2.e();	 Catch:{ all -> 0x0037 }
        r0 = r3.b;	 Catch:{ all -> 0x0037 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0037 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0037 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x0025;	 Catch:{ all -> 0x0037 }
        r1 = r0.next();	 Catch:{ all -> 0x0037 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x0037 }
        r1.getKey();	 Catch:{ all -> 0x0037 }
        r1.getValue();	 Catch:{ all -> 0x0037 }
        goto L_0x0012;	 Catch:{ all -> 0x0037 }
        r3 = r2.a(r3);	 Catch:{ all -> 0x0037 }
        r0 = new -$$Lambda$nbaFxFkiQzqejipSHoYMp2mOqZE;	 Catch:{ all -> 0x0037 }
        r0.<init>(r2);	 Catch:{ all -> 0x0037 }
        r3 = r3.g(r0);	 Catch:{ all -> 0x0037 }
        r3.isDisposed();	 Catch:{ all -> 0x0037 }
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbm.a(java.util.Map):void");
    }

    private static boolean a(a aVar) {
        return aVar == a.TYPING || aVar == a.PAUSED;
    }

    private static boolean a(String str) {
        return !str.contains("~");
    }

    private List<String> b(List<abjw> list) {
        return FluentIterable.from(list).filter(new -$$Lambda$rbm$3Rk4vAu5AfkCStAnP2PqO_3ODs0(this)).transform(new -$$Lambda$rbm$pSrx8Kg2xIikDwDvfjML3uQBJRo(this)).toList();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:135:0x023f in {13, 14, 15, 21, 24, 25, 26, 27, 36, 37, 38, 45, 46, 53, 58, 59, 60, 61, 65, 70, 71, 72, 79, 80, 86, 87, 88, 89, 92, 93, 96, 101, 102, 103, 111, 112, 115, 120, 123, 124, 129, 131, 134} preds:[]
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
    private synchronized void b(java.util.Map<java.lang.String, defpackage.abie> r12) {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = com.google.common.collect.Lists.newLinkedList();	 Catch:{ all -> 0x023c }
        r1 = r11.g;	 Catch:{ all -> 0x023c }
        r1 = r1.entrySet();	 Catch:{ all -> 0x023c }
        r1 = r1.iterator();	 Catch:{ all -> 0x023c }
        r2 = r1.hasNext();	 Catch:{ all -> 0x023c }
        r3 = 1;	 Catch:{ all -> 0x023c }
        if (r2 == 0) goto L_0x01a1;	 Catch:{ all -> 0x023c }
        r2 = r1.next();	 Catch:{ all -> 0x023c }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x023c }
        r4 = r2.getKey();	 Catch:{ all -> 0x023c }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x023c }
        r2 = r2.getValue();	 Catch:{ all -> 0x023c }
        r2 = (defpackage.rbd) r2;	 Catch:{ all -> 0x023c }
        r5 = r12.containsKey(r4);	 Catch:{ all -> 0x023c }
        if (r5 == 0) goto L_0x0163;	 Catch:{ all -> 0x023c }
        r5 = r12.get(r4);	 Catch:{ all -> 0x023c }
        r5 = (defpackage.abie) r5;	 Catch:{ all -> 0x023c }
        r5 = r11.a(r4, r5);	 Catch:{ all -> 0x023c }
        r6 = r2.equals(r5);	 Catch:{ all -> 0x023c }
        if (r6 != 0) goto L_0x000f;	 Catch:{ all -> 0x023c }
        r6 = r2.a;	 Catch:{ all -> 0x023c }
        r7 = r5.a;	 Catch:{ all -> 0x023c }
        r6 = android.text.TextUtils.equals(r6, r7);	 Catch:{ all -> 0x023c }
        r7 = 0;	 Catch:{ all -> 0x023c }
        if (r6 == 0) goto L_0x0056;	 Catch:{ all -> 0x023c }
        r6 = r2.b;	 Catch:{ all -> 0x023c }
        r8 = r5.b;	 Catch:{ all -> 0x023c }
        r6 = r6.equals(r8);	 Catch:{ all -> 0x023c }
        if (r6 != 0) goto L_0x0054;	 Catch:{ all -> 0x023c }
        goto L_0x0056;	 Catch:{ all -> 0x023c }
        r6 = 0;	 Catch:{ all -> 0x023c }
        goto L_0x0057;	 Catch:{ all -> 0x023c }
        r6 = 1;	 Catch:{ all -> 0x023c }
        if (r6 == 0) goto L_0x0084;	 Catch:{ all -> 0x023c }
        r6 = r11.h;	 Catch:{ all -> 0x023c }
        r2 = r2.b;	 Catch:{ all -> 0x023c }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x023c }
        if (r2 == 0) goto L_0x006e;	 Catch:{ all -> 0x023c }
        r2 = r5.b;	 Catch:{ all -> 0x023c }
        r2 = r2.size();	 Catch:{ all -> 0x023c }
        if (r2 != r3) goto L_0x006e;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.CALL_INCOMING;	 Catch:{ all -> 0x023c }
        goto L_0x007b;	 Catch:{ all -> 0x023c }
        r2 = r5.b;	 Catch:{ all -> 0x023c }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x023c }
        if (r2 == 0) goto L_0x0079;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.CALL_END;	 Catch:{ all -> 0x023c }
        goto L_0x007b;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.CALL_UPDATE;	 Catch:{ all -> 0x023c }
        r6.put(r4, r2);	 Catch:{ all -> 0x023c }
        r2 = r11.g;	 Catch:{ all -> 0x023c }
        r2.put(r4, r5);	 Catch:{ all -> 0x023c }
        goto L_0x000f;	 Catch:{ all -> 0x023c }
        r6 = r2.c;	 Catch:{ all -> 0x023c }
        r8 = r5.c;	 Catch:{ all -> 0x023c }
        r6 = android.text.TextUtils.equals(r6, r8);	 Catch:{ all -> 0x023c }
        if (r6 == 0) goto L_0x00af;	 Catch:{ all -> 0x023c }
        r6 = r2.d;	 Catch:{ all -> 0x023c }
        r8 = r5.d;	 Catch:{ all -> 0x023c }
        r6 = android.text.TextUtils.equals(r6, r8);	 Catch:{ all -> 0x023c }
        if (r6 == 0) goto L_0x00af;	 Catch:{ all -> 0x023c }
        r6 = r2.e;	 Catch:{ all -> 0x023c }
        r8 = r5.e;	 Catch:{ all -> 0x023c }
        r6 = r6.equals(r8);	 Catch:{ all -> 0x023c }
        if (r6 == 0) goto L_0x00af;	 Catch:{ all -> 0x023c }
        r6 = r2.f;	 Catch:{ all -> 0x023c }
        r8 = r5.f;	 Catch:{ all -> 0x023c }
        r6 = r6.equals(r8);	 Catch:{ all -> 0x023c }
        if (r6 != 0) goto L_0x00ad;	 Catch:{ all -> 0x023c }
        goto L_0x00af;	 Catch:{ all -> 0x023c }
        r6 = 0;	 Catch:{ all -> 0x023c }
        goto L_0x00b0;	 Catch:{ all -> 0x023c }
        r6 = 1;	 Catch:{ all -> 0x023c }
        if (r6 == 0) goto L_0x0126;	 Catch:{ all -> 0x023c }
        r6 = r5.g;	 Catch:{ all -> 0x023c }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x023c }
        if (r6 == 0) goto L_0x000f;	 Catch:{ all -> 0x023c }
        r6 = r11.h;	 Catch:{ all -> 0x023c }
        r7 = r5.c;	 Catch:{ all -> 0x023c }
        if (r7 != 0) goto L_0x00c7;	 Catch:{ all -> 0x023c }
        r7 = r2.c;	 Catch:{ all -> 0x023c }
        if (r7 != 0) goto L_0x00c7;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.TYPING_CANCEL;	 Catch:{ all -> 0x023c }
        goto L_0x011f;	 Catch:{ all -> 0x023c }
        r2 = r2.f;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbm.a(r2, r7);	 Catch:{ all -> 0x023c }
        r8 = r5.f;	 Catch:{ all -> 0x023c }
        r7 = defpackage.rbm.a(r8, r7);	 Catch:{ all -> 0x023c }
        r8 = defpackage.rbm.1.a;	 Catch:{ all -> 0x023c }
        r2 = r2.ordinal();	 Catch:{ all -> 0x023c }
        r2 = r8[r2];	 Catch:{ all -> 0x023c }
        r8 = 3;	 Catch:{ all -> 0x023c }
        r9 = 2;	 Catch:{ all -> 0x023c }
        if (r2 == r3) goto L_0x010e;	 Catch:{ all -> 0x023c }
        if (r2 == r9) goto L_0x010e;	 Catch:{ all -> 0x023c }
        if (r2 == r8) goto L_0x0101;	 Catch:{ all -> 0x023c }
        r10 = 4;	 Catch:{ all -> 0x023c }
        if (r2 == r10) goto L_0x00e9;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.NONE;	 Catch:{ all -> 0x023c }
        goto L_0x011f;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbm.1.a;	 Catch:{ all -> 0x023c }
        r7 = r7.ordinal();	 Catch:{ all -> 0x023c }
        r2 = r2[r7];	 Catch:{ all -> 0x023c }
        if (r2 == r3) goto L_0x00fe;	 Catch:{ all -> 0x023c }
        if (r2 == r9) goto L_0x00fb;	 Catch:{ all -> 0x023c }
        if (r2 == r8) goto L_0x00f8;	 Catch:{ all -> 0x023c }
        goto L_0x00e6;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.TYPING_RECEIVE;	 Catch:{ all -> 0x023c }
        goto L_0x011f;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.TYPING_PAUSE;	 Catch:{ all -> 0x023c }
        goto L_0x011f;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.TYPING_ENTER;	 Catch:{ all -> 0x023c }
        goto L_0x011f;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbm.1.a;	 Catch:{ all -> 0x023c }
        r7 = r7.ordinal();	 Catch:{ all -> 0x023c }
        r2 = r2[r7];	 Catch:{ all -> 0x023c }
        if (r2 == r3) goto L_0x00fe;	 Catch:{ all -> 0x023c }
        if (r2 == r9) goto L_0x00fb;	 Catch:{ all -> 0x023c }
        goto L_0x00e6;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbm.1.a;	 Catch:{ all -> 0x023c }
        r7 = r7.ordinal();	 Catch:{ all -> 0x023c }
        r2 = r2[r7];	 Catch:{ all -> 0x023c }
        if (r2 == r3) goto L_0x011d;	 Catch:{ all -> 0x023c }
        if (r2 == r9) goto L_0x00fb;	 Catch:{ all -> 0x023c }
        if (r2 == r8) goto L_0x00f8;	 Catch:{ all -> 0x023c }
        goto L_0x00c4;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.TYPING_IN_PROGRESS;	 Catch:{ all -> 0x023c }
        r6.put(r4, r2);	 Catch:{ all -> 0x023c }
        r2 = r11.g;	 Catch:{ all -> 0x023c }
        goto L_0x0080;	 Catch:{ all -> 0x023c }
        r6 = r11.k;	 Catch:{ all -> 0x023c }
        r6 = r6.get();	 Catch:{ all -> 0x023c }
        r6 = (defpackage.ezd) r6;	 Catch:{ all -> 0x023c }
        r6 = r6.d();	 Catch:{ all -> 0x023c }
        if (r6 == 0) goto L_0x000f;	 Catch:{ all -> 0x023c }
        r6 = r2.h;	 Catch:{ all -> 0x023c }
        r8 = r5.h;	 Catch:{ all -> 0x023c }
        r6 = android.text.TextUtils.equals(r6, r8);	 Catch:{ all -> 0x023c }
        if (r6 == 0) goto L_0x014a;	 Catch:{ all -> 0x023c }
        r2 = r2.g;	 Catch:{ all -> 0x023c }
        r6 = r5.g;	 Catch:{ all -> 0x023c }
        r2 = r2.equals(r6);	 Catch:{ all -> 0x023c }
        if (r2 != 0) goto L_0x0149;	 Catch:{ all -> 0x023c }
        goto L_0x014a;	 Catch:{ all -> 0x023c }
        r3 = 0;	 Catch:{ all -> 0x023c }
        if (r3 == 0) goto L_0x000f;	 Catch:{ all -> 0x023c }
        r2 = r5.g;	 Catch:{ all -> 0x023c }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x023c }
        if (r2 != 0) goto L_0x015c;	 Catch:{ all -> 0x023c }
        r2 = r5.h;	 Catch:{ all -> 0x023c }
        if (r2 != 0) goto L_0x0159;	 Catch:{ all -> 0x023c }
        goto L_0x015c;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.COGNAC_ACTIVE;	 Catch:{ all -> 0x023c }
        goto L_0x015e;	 Catch:{ all -> 0x023c }
        r2 = defpackage.rbg.COGNAC_END;	 Catch:{ all -> 0x023c }
        r11.a(r4, r5, r2);	 Catch:{ all -> 0x023c }
        goto L_0x000f;	 Catch:{ all -> 0x023c }
        r3 = r2.b;	 Catch:{ all -> 0x023c }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x023c }
        if (r3 != 0) goto L_0x0173;	 Catch:{ all -> 0x023c }
        r2 = r11.h;	 Catch:{ all -> 0x023c }
        r3 = defpackage.rbg.CALL_END;	 Catch:{ all -> 0x023c }
        r2.put(r4, r3);	 Catch:{ all -> 0x023c }
        goto L_0x019c;	 Catch:{ all -> 0x023c }
        r3 = r2.c;	 Catch:{ all -> 0x023c }
        if (r3 == 0) goto L_0x017c;	 Catch:{ all -> 0x023c }
        r2 = r11.h;	 Catch:{ all -> 0x023c }
        r3 = defpackage.rbg.TYPING_CANCEL;	 Catch:{ all -> 0x023c }
        goto L_0x016f;	 Catch:{ all -> 0x023c }
        r3 = r11.k;	 Catch:{ all -> 0x023c }
        r3 = r3.get();	 Catch:{ all -> 0x023c }
        r3 = (defpackage.ezd) r3;	 Catch:{ all -> 0x023c }
        r3 = r3.d();	 Catch:{ all -> 0x023c }
        if (r3 == 0) goto L_0x0197;	 Catch:{ all -> 0x023c }
        r2 = r2.g;	 Catch:{ all -> 0x023c }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x023c }
        if (r2 != 0) goto L_0x0197;	 Catch:{ all -> 0x023c }
        r2 = r11.h;	 Catch:{ all -> 0x023c }
        r3 = defpackage.rbg.COGNAC_END;	 Catch:{ all -> 0x023c }
        goto L_0x016f;	 Catch:{ all -> 0x023c }
        r2 = r11.h;	 Catch:{ all -> 0x023c }
        r2.remove(r4);	 Catch:{ all -> 0x023c }
        r0.add(r4);	 Catch:{ all -> 0x023c }
        goto L_0x000f;	 Catch:{ all -> 0x023c }
        r12 = r12.entrySet();	 Catch:{ all -> 0x023c }
        r12 = r12.iterator();	 Catch:{ all -> 0x023c }
        r1 = r12.hasNext();	 Catch:{ all -> 0x023c }
        if (r1 == 0) goto L_0x0224;	 Catch:{ all -> 0x023c }
        r1 = r12.next();	 Catch:{ all -> 0x023c }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x023c }
        r2 = r1.getKey();	 Catch:{ all -> 0x023c }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x023c }
        r1 = r1.getValue();	 Catch:{ all -> 0x023c }
        r1 = (defpackage.abie) r1;	 Catch:{ all -> 0x023c }
        r4 = r11.g;	 Catch:{ all -> 0x023c }
        r4 = r4.containsKey(r2);	 Catch:{ all -> 0x023c }
        if (r4 != 0) goto L_0x01a9;	 Catch:{ all -> 0x023c }
        r1 = r11.a(r2, r1);	 Catch:{ all -> 0x023c }
        r4 = r1.b;	 Catch:{ all -> 0x023c }
        r4 = r4.size();	 Catch:{ all -> 0x023c }
        if (r4 != r3) goto L_0x01e2;	 Catch:{ all -> 0x023c }
        r4 = r11.h;	 Catch:{ all -> 0x023c }
        r5 = defpackage.rbg.CALL_INCOMING;	 Catch:{ all -> 0x023c }
        r4.put(r2, r5);	 Catch:{ all -> 0x023c }
        r4 = r11.g;	 Catch:{ all -> 0x023c }
        r4.put(r2, r1);	 Catch:{ all -> 0x023c }
        goto L_0x01a9;	 Catch:{ all -> 0x023c }
        r4 = r1.b;	 Catch:{ all -> 0x023c }
        r4 = r4.size();	 Catch:{ all -> 0x023c }
        if (r4 <= r3) goto L_0x01f4;	 Catch:{ all -> 0x023c }
        r4 = r11.h;	 Catch:{ all -> 0x023c }
        r5 = defpackage.rbg.CALL_UPDATE;	 Catch:{ all -> 0x023c }
        r4.put(r2, r5);	 Catch:{ all -> 0x023c }
        r4 = r11.g;	 Catch:{ all -> 0x023c }
        goto L_0x01de;	 Catch:{ all -> 0x023c }
        r4 = r11.k;	 Catch:{ all -> 0x023c }
        r4 = r4.get();	 Catch:{ all -> 0x023c }
        r4 = (defpackage.ezd) r4;	 Catch:{ all -> 0x023c }
        r4 = r4.d();	 Catch:{ all -> 0x023c }
        if (r4 == 0) goto L_0x0210;	 Catch:{ all -> 0x023c }
        r4 = r1.g;	 Catch:{ all -> 0x023c }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x023c }
        if (r4 != 0) goto L_0x0210;	 Catch:{ all -> 0x023c }
        r4 = defpackage.rbg.COGNAC_ACTIVE;	 Catch:{ all -> 0x023c }
        r11.a(r2, r1, r4);	 Catch:{ all -> 0x023c }
        goto L_0x01a9;	 Catch:{ all -> 0x023c }
        r4 = r1.c;	 Catch:{ all -> 0x023c }
        if (r4 == 0) goto L_0x021e;	 Catch:{ all -> 0x023c }
        r4 = r11.h;	 Catch:{ all -> 0x023c }
        r5 = defpackage.rbg.TYPING_ENTER;	 Catch:{ all -> 0x023c }
        r4.put(r2, r5);	 Catch:{ all -> 0x023c }
        r4 = r11.g;	 Catch:{ all -> 0x023c }
        goto L_0x01de;	 Catch:{ all -> 0x023c }
        r1 = r11.h;	 Catch:{ all -> 0x023c }
        r1.remove(r2);	 Catch:{ all -> 0x023c }
        goto L_0x01a9;	 Catch:{ all -> 0x023c }
        r12 = r0.iterator();	 Catch:{ all -> 0x023c }
        r0 = r12.hasNext();	 Catch:{ all -> 0x023c }
        if (r0 == 0) goto L_0x023a;	 Catch:{ all -> 0x023c }
        r0 = r12.next();	 Catch:{ all -> 0x023c }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x023c }
        r1 = r11.g;	 Catch:{ all -> 0x023c }
        r1.remove(r0);	 Catch:{ all -> 0x023c }
        goto L_0x0228;
        monitor-exit(r11);
        return;
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbm.b(java.util.Map):void");
    }

    private static Map<String, a> c(List<abjw> list) {
        HashMap newHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(list.size());
        for (abjw abjw : list) {
            newHashMapWithExpectedSize.put(abjw.a(), abjw.b());
        }
        return newHashMapWithExpectedSize;
    }

    private static String d(List<abjk> list) {
        return list.isEmpty() ? null : ((abjk) list.get(0)).b();
    }

    private synchronized rbf e() {
        return new rbf(ImmutableMap.copyOf(this.g), ImmutableMap.copyOf(this.h));
    }

    public final ajdp<rbf> a() {
        return this.b;
    }

    public final void b() {
        this.n = this.a.b((ajdw) this.m.b()).d(-$$Lambda$SU94okCFLtC6gmIhZwmVZi2pdi8.INSTANCE).f(new -$$Lambda$rbm$KK-EekT3sF9zRmS--uk2Jk3hSdQ(this));
    }

    public final void c() {
        this.n.dispose();
        this.o.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        this.b.a(e());
    }
}
