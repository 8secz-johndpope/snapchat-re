package defpackage;

import com.snap.core.db.api.DbTransaction;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tnx */
public abstract class tnx {
    final tnv a = new tnv();
    public final tnw b = new tnw();
    final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: tnx$k */
    public static final class k extends akcs implements akbk<hxp> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        public k(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(this.b, this.c);
        }
    }

    /* renamed from: tnx$e */
    static final class e extends akcs implements akbk<hxp> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        e(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().h(tni.a(this.b), this.c);
        }
    }

    /* renamed from: tnx$j */
    public static final class j extends akcs implements akbk<String> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        public j(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().g(tni.a(this.b), this.c);
        }
    }

    /* renamed from: tnx$l */
    public static final class l extends akcs implements akbk<Object> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        public l(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final Object invoke() {
            tnx tnx = this.a;
            fth fth = this.b;
            tno tno = this.c;
            akcr.b(fth, "key");
            akcr.b(tno, "type");
            return tnx.a(fth, tno, (akbk) new h(tnx, fth, tno));
        }
    }

    /* renamed from: tnx$h */
    static final class h extends akcs implements akbk<Object> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        h(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final Object invoke() {
            return this.a.a().a(tni.a(this.b), this.c);
        }
    }

    /* renamed from: tnx$g */
    public static final class g extends akcs implements akbk<Integer> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        public g(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().d(tni.a(this.b), this.c);
        }
    }

    /* renamed from: tnx$c */
    public static final class c extends akcs implements akbk<Boolean> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        public c(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().b(tni.a(this.b), this.c);
        }
    }

    /* renamed from: tnx$i */
    public static final class i extends akcs implements akbk<Long> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        public i(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().c(tni.a(this.b), this.c);
        }
    }

    /* renamed from: tnx$a */
    public abstract class a {
        public abstract int a(ftg ftg, tno tno);

        public abstract ajcx a(String str, ajfb<DbTransaction> ajfb);

        public abstract Object a(tnm tnm, tno tno);

        public abstract Map<tno, Map<tnm, Object>> a(List<tnm> list);

        public abstract Map<tnm, Object> a(List<tnm> list, tno tno);

        public abstract Map<tnm, Object> a(tno tno);

        public abstract void a();

        public abstract void a(Map<tnm, ? extends Object> map, tno tno, DbTransaction dbTransaction);

        public abstract int b(List<tnm> list, tno tno);

        public abstract ajcx b(String str, ajfb<DbTransaction> ajfb);

        public abstract Boolean b(tnm tnm, tno tno);

        public abstract Map<fth, Long> b(Map<fth, ? extends hxp> map, tno tno, DbTransaction dbTransaction);

        public abstract Long c(tnm tnm, tno tno);

        public abstract Integer d(tnm tnm, tno tno);

        public abstract Float e(tnm tnm, tno tno);

        public abstract Double f(tnm tnm, tno tno);

        public abstract String g(tnm tnm, tno tno);

        public abstract hxp h(tnm tnm, tno tno);
    }

    /* renamed from: tnx$b */
    public static final class b<T> implements ajfb<DbTransaction> {
        final /* synthetic */ tnx a;

        /* renamed from: tnx$b$1 */
        static final class 1<T> implements ajfb<DbTransaction> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                tnx.a(this.a.a);
                for (tno tno : (tno[]) tno.class.getEnumConstants()) {
                    tno.name();
                    tnv tnv = this.a.a.a;
                    a a = this.a.a.a();
                    akcr.a((Object) tno, "type");
                    tnv.a(a.a(tno), tno);
                }
                this.a.a.c.set(true);
            }
        }

        public b(tnx tnx) {
            this.a = tnx;
        }

        public final /* synthetic */ void accept(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            tnx tnx = this.a;
            ajfb 1 = new 1(this);
            akcr.a((Object) dbTransaction, "tx");
            tnx.a(1, dbTransaction);
        }
    }

    /* renamed from: tnx$f */
    public static final class f extends akcs implements akbk<Float> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        public f(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().e(tni.a(this.b), this.c);
        }
    }

    /* renamed from: tnx$d */
    public static final class d extends akcs implements akbk<Double> {
        private /* synthetic */ tnx a;
        private /* synthetic */ fth b;
        private /* synthetic */ tno c;

        public d(tnx tnx, fth fth, tno tno) {
            this.a = tnx;
            this.b = fth;
            this.c = tno;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().f(tni.a(this.b), this.c);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x007f in {6, 11, 15, 23, 25, 27, 29} preds:[]
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
    private final int a(java.util.List<defpackage.tnm> r6, defpackage.tno r7) {
        /*
        r5 = this;
        r0 = "setting";
        r1 = "keys";
        r2 = r5.a;	 Catch:{ all -> 0x007d }
        defpackage.akcr.b(r6, r1);	 Catch:{ all -> 0x007d }
        defpackage.akcr.b(r7, r0);	 Catch:{ all -> 0x007d }
        r2 = r2.a;	 Catch:{ all -> 0x007b }
        r2 = r2.get(r7);	 Catch:{ all -> 0x007b }
        if (r2 != 0) goto L_0x0017;	 Catch:{ all -> 0x007b }
        defpackage.akcr.a();	 Catch:{ all -> 0x007b }
        r3 = "cache[setting]!!";	 Catch:{ all -> 0x007b }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x007b }
        r2 = (java.util.concurrent.ConcurrentMap) r2;	 Catch:{ all -> 0x007b }
        r3 = r6.iterator();	 Catch:{ all -> 0x007b }
        r4 = r3.hasNext();	 Catch:{ all -> 0x007b }
        if (r4 == 0) goto L_0x0032;	 Catch:{ all -> 0x007b }
        r4 = r3.next();	 Catch:{ all -> 0x007b }
        r4 = (defpackage.tnm) r4;	 Catch:{ all -> 0x007b }
        r2.remove(r4);	 Catch:{ all -> 0x007b }
        goto L_0x0022;
        r2 = r5.b;	 Catch:{ all -> 0x007d }
        defpackage.akcr.b(r6, r1);	 Catch:{ all -> 0x007d }
        defpackage.akcr.b(r7, r0);	 Catch:{ all -> 0x007d }
        r0 = r2.a;	 Catch:{ all -> 0x007d }
        r0 = r0.get(r7);	 Catch:{ all -> 0x007d }
        if (r0 != 0) goto L_0x0045;	 Catch:{ all -> 0x007d }
        defpackage.akcr.a();	 Catch:{ all -> 0x007d }
        r1 = "observables[setting]!!";	 Catch:{ all -> 0x007d }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x007d }
        r0 = (java.util.concurrent.ConcurrentHashMap) r0;	 Catch:{ all -> 0x007d }
        r1 = r6.iterator();	 Catch:{ all -> 0x007d }
        r2 = r1.hasNext();	 Catch:{ all -> 0x007d }
        if (r2 == 0) goto L_0x0072;	 Catch:{ all -> 0x007d }
        r2 = r1.next();	 Catch:{ all -> 0x007d }
        r2 = (defpackage.tnm) r2;	 Catch:{ all -> 0x007d }
        r2 = r0.get(r2);	 Catch:{ all -> 0x007d }
        r2 = (defpackage.ajwl) r2;	 Catch:{ all -> 0x007d }
        if (r2 == 0) goto L_0x0050;	 Catch:{ all -> 0x007d }
        r3 = r2.q();	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x0050;	 Catch:{ all -> 0x007d }
        r3 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x007d }
        r2.a(r3);	 Catch:{ all -> 0x007d }
        goto L_0x0050;	 Catch:{ all -> 0x007d }
        r0 = r5.a();	 Catch:{ all -> 0x007d }
        r6 = r0.b(r6, r7);	 Catch:{ all -> 0x007d }
        return r6;	 Catch:{ all -> 0x007d }
        r6 = move-exception;	 Catch:{ all -> 0x007d }
        throw r6;	 Catch:{ all -> 0x007d }
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnx.a(java.util.List, tno):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x0099 in {10, 16, 17, 19, 24, 27, 29, 32, 35, 37} preds:[]
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
    public final int a(defpackage.ftg r6, defpackage.tno r7) {
        /*
        r5 = this;
        r0 = "feature";
        defpackage.akcr.b(r6, r0);
        r1 = "type";
        defpackage.akcr.b(r7, r1);
        r7.name();	 Catch:{ all -> 0x0097 }
        r6.name();	 Catch:{ all -> 0x0095 }
        r1 = r5.a;	 Catch:{ all -> 0x0093 }
        defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x0093 }
        r0 = "setting";	 Catch:{ all -> 0x0093 }
        defpackage.akcr.b(r7, r0);	 Catch:{ all -> 0x0093 }
        r0 = r1.a;	 Catch:{ all -> 0x0091 }
        r0 = r0.get(r7);	 Catch:{ all -> 0x0091 }
        if (r0 != 0) goto L_0x0025;	 Catch:{ all -> 0x0091 }
        defpackage.akcr.a();	 Catch:{ all -> 0x0091 }
        r1 = "cache[setting]!!";	 Catch:{ all -> 0x0091 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0091 }
        r0 = (java.util.concurrent.ConcurrentMap) r0;	 Catch:{ all -> 0x0091 }
        r1 = r0;	 Catch:{ all -> 0x0091 }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x0091 }
        r2 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0091 }
        r2.<init>();	 Catch:{ all -> 0x0091 }
        r1 = r1.entrySet();	 Catch:{ all -> 0x0091 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0091 }
        r3 = r1.hasNext();	 Catch:{ all -> 0x0091 }
        if (r3 == 0) goto L_0x0063;	 Catch:{ all -> 0x0091 }
        r3 = r1.next();	 Catch:{ all -> 0x0091 }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ all -> 0x0091 }
        r4 = r3.getKey();	 Catch:{ all -> 0x0091 }
        r4 = (defpackage.tnm) r4;	 Catch:{ all -> 0x0091 }
        r4 = r4.a;	 Catch:{ all -> 0x0091 }
        if (r4 != r6) goto L_0x0054;	 Catch:{ all -> 0x0091 }
        r4 = 1;	 Catch:{ all -> 0x0091 }
        goto L_0x0055;	 Catch:{ all -> 0x0091 }
        r4 = 0;	 Catch:{ all -> 0x0091 }
        if (r4 == 0) goto L_0x003c;	 Catch:{ all -> 0x0091 }
        r4 = r3.getKey();	 Catch:{ all -> 0x0091 }
        r3 = r3.getValue();	 Catch:{ all -> 0x0091 }
        r2.put(r4, r3);	 Catch:{ all -> 0x0091 }
        goto L_0x003c;	 Catch:{ all -> 0x0091 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0091 }
        r1 = r2.entrySet();	 Catch:{ all -> 0x0091 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0091 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0091 }
        if (r2 == 0) goto L_0x0083;	 Catch:{ all -> 0x0091 }
        r2 = r1.next();	 Catch:{ all -> 0x0091 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0091 }
        r2 = r2.getKey();	 Catch:{ all -> 0x0091 }
        r2 = (defpackage.tnm) r2;	 Catch:{ all -> 0x0091 }
        r0.remove(r2);	 Catch:{ all -> 0x0091 }
        goto L_0x006d;
        r0 = r5.b;	 Catch:{ all -> 0x0093 }
        r0.a(r6, r7);	 Catch:{ all -> 0x0093 }
        r0 = r5.a();	 Catch:{ all -> 0x0093 }
        r6 = r0.a(r6, r7);	 Catch:{ all -> 0x0093 }
        return r6;	 Catch:{ all -> 0x0093 }
        r6 = move-exception;	 Catch:{ all -> 0x0093 }
        throw r6;	 Catch:{ all -> 0x0093 }
        r6 = move-exception;
        throw r6;	 Catch:{ all -> 0x0095 }
        r6 = move-exception;
        throw r6;	 Catch:{ all -> 0x0097 }
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnx.a(ftg, tno):int");
    }

    public final ajcx a(String str, ajfb<DbTransaction> ajfb) {
        akcr.b(str, "queryTag");
        akcr.b(ajfb, "consumer");
        return a().a(str, (ajfb) ajfb);
    }

    public final hxp a(fth fth, tno tno) {
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return (hxp) a(fth, tno, (akbk) new e(this, fth, tno));
    }

    public final <T> T a(fth fth, tno tno, akbk<? extends T> akbk) {
        tno.name();
        akcr.a(fth.name(), "key.name()");
        tnm a = tni.a(fth);
        if (!(this.c.get() || this.a.a(a, tno))) {
            Object invoke = akbk.invoke();
            if (invoke != null) {
                this.a.a(a, tno, invoke);
            }
        }
        return this.a.b(a, tno);
    }

    public final Map<tnm, Object> a(tno tno) {
        akcr.b(tno, "type");
        return this.c.get() ? this.a.a(tno) : a().a(tno);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x008e in {6, 11, 12, 13, 18, 19, 21, 23} preds:[]
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
    public final java.util.Map<defpackage.fth, java.lang.Object> a(defpackage.fth[] r10, defpackage.tno r11) {
        /*
        r9 = this;
        r0 = "keys";
        defpackage.akcr.b(r10, r0);
        r0 = "type";
        defpackage.akcr.b(r11, r0);
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x008c }
        r0.<init>();	 Catch:{ all -> 0x008c }
        r1 = r9.c;	 Catch:{ all -> 0x008c }
        r1 = r1.get();	 Catch:{ all -> 0x008c }
        r2 = 0;	 Catch:{ all -> 0x008c }
        if (r1 == 0) goto L_0x0030;	 Catch:{ all -> 0x008c }
        r1 = r10.length;	 Catch:{ all -> 0x008c }
        if (r2 >= r1) goto L_0x0089;	 Catch:{ all -> 0x008c }
        r3 = r10[r2];	 Catch:{ all -> 0x008c }
        r4 = r0;	 Catch:{ all -> 0x008c }
        r4 = (java.util.Map) r4;	 Catch:{ all -> 0x008c }
        r5 = r9.a;	 Catch:{ all -> 0x008c }
        r6 = defpackage.tni.a(r3);	 Catch:{ all -> 0x008c }
        r5 = r5.b(r6, r11);	 Catch:{ all -> 0x008c }
        r4.put(r3, r5);	 Catch:{ all -> 0x008c }
        r2 = r2 + 1;	 Catch:{ all -> 0x008c }
        goto L_0x0019;	 Catch:{ all -> 0x008c }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x008c }
        r1.<init>();	 Catch:{ all -> 0x008c }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x008c }
        r3 = r10.length;	 Catch:{ all -> 0x008c }
        r4 = 0;	 Catch:{ all -> 0x008c }
        if (r4 >= r3) goto L_0x005c;	 Catch:{ all -> 0x008c }
        r5 = r10[r4];	 Catch:{ all -> 0x008c }
        r6 = defpackage.tni.a(r5);	 Catch:{ all -> 0x008c }
        r7 = r9.a;	 Catch:{ all -> 0x008c }
        r7 = r7.a(r6, r11);	 Catch:{ all -> 0x008c }
        if (r7 == 0) goto L_0x0056;	 Catch:{ all -> 0x008c }
        r7 = r0;	 Catch:{ all -> 0x008c }
        r7 = (java.util.Map) r7;	 Catch:{ all -> 0x008c }
        r8 = r9.a;	 Catch:{ all -> 0x008c }
        r6 = r8.b(r6, r11);	 Catch:{ all -> 0x008c }
        r7.put(r5, r6);	 Catch:{ all -> 0x008c }
        goto L_0x0059;	 Catch:{ all -> 0x008c }
        r1.add(r5);	 Catch:{ all -> 0x008c }
        r4 = r4 + 1;	 Catch:{ all -> 0x008c }
        goto L_0x0039;	 Catch:{ all -> 0x008c }
        r3 = r9.a();	 Catch:{ all -> 0x008c }
        r1 = defpackage.tni.a(r1);	 Catch:{ all -> 0x008c }
        r1 = r3.a(r1, r11);	 Catch:{ all -> 0x008c }
        r3 = r9.a;	 Catch:{ all -> 0x008c }
        r3.a(r1, r11);	 Catch:{ all -> 0x008c }
        r11 = r10.length;	 Catch:{ all -> 0x008c }
        if (r2 >= r11) goto L_0x0089;	 Catch:{ all -> 0x008c }
        r3 = r10[r2];	 Catch:{ all -> 0x008c }
        r4 = defpackage.tni.a(r3);	 Catch:{ all -> 0x008c }
        r5 = r1.containsKey(r4);	 Catch:{ all -> 0x008c }
        if (r5 == 0) goto L_0x0086;	 Catch:{ all -> 0x008c }
        r5 = r0;	 Catch:{ all -> 0x008c }
        r5 = (java.util.Map) r5;	 Catch:{ all -> 0x008c }
        r4 = r1.get(r4);	 Catch:{ all -> 0x008c }
        r5.put(r3, r4);	 Catch:{ all -> 0x008c }
        r2 = r2 + 1;	 Catch:{ all -> 0x008c }
        goto L_0x006e;	 Catch:{ all -> 0x008c }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x008c }
        return r0;
        r10 = move-exception;
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnx.a(fth[], tno):java.util.Map");
    }

    public abstract a a();

    public final void a(ajfb<DbTransaction> ajfb, DbTransaction dbTransaction) {
        akcr.b(ajfb, "consumer");
        akcr.b(dbTransaction, "tx");
        a().a();
        ajfb.accept(dbTransaction);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x005b in {6, 9, 10, 12} preds:[]
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
    public final void a(java.util.Map<defpackage.tnm, ? extends java.lang.Object> r5, defpackage.tno r6, com.snap.core.db.api.DbTransaction r7) {
        /*
        r4 = this;
        r0 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0059 }
        r0.<init>();	 Catch:{ all -> 0x0059 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0059 }
        r5 = r5.entrySet();	 Catch:{ all -> 0x0059 }
        r5 = r5.iterator();	 Catch:{ all -> 0x0059 }
        r1 = r5.hasNext();	 Catch:{ all -> 0x0059 }
        if (r1 == 0) goto L_0x003f;	 Catch:{ all -> 0x0059 }
        r1 = r5.next();	 Catch:{ all -> 0x0059 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x0059 }
        r2 = r4.a;	 Catch:{ all -> 0x0059 }
        r3 = r1.getKey();	 Catch:{ all -> 0x0059 }
        r3 = (defpackage.tnm) r3;	 Catch:{ all -> 0x0059 }
        r2 = r2.b(r3, r6);	 Catch:{ all -> 0x0059 }
        r3 = r1.getValue();	 Catch:{ all -> 0x0059 }
        r2 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0059 }
        r2 = r2 ^ 1;	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x000f;	 Catch:{ all -> 0x0059 }
        r2 = r1.getKey();	 Catch:{ all -> 0x0059 }
        r1 = r1.getValue();	 Catch:{ all -> 0x0059 }
        r0.put(r2, r1);	 Catch:{ all -> 0x0059 }
        goto L_0x000f;	 Catch:{ all -> 0x0059 }
        r5 = r0.isEmpty();	 Catch:{ all -> 0x0059 }
        r5 = r5 ^ 1;	 Catch:{ all -> 0x0059 }
        if (r5 == 0) goto L_0x0058;	 Catch:{ all -> 0x0059 }
        r5 = r4.a;	 Catch:{ all -> 0x0059 }
        r5.b(r0, r6);	 Catch:{ all -> 0x0059 }
        r5 = r4.b;	 Catch:{ all -> 0x0059 }
        r5.a(r0, r6);	 Catch:{ all -> 0x0059 }
        r5 = r4.a();	 Catch:{ all -> 0x0059 }
        r5.a(r0, r6, r7);	 Catch:{ all -> 0x0059 }
        return;
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnx.a(java.util.Map, tno, com.snap.core.db.api.DbTransaction):void");
    }

    public final int b(fth[] fthArr, tno tno) {
        akcr.b(fthArr, "keys");
        akcr.b(tno, "type");
        return a(tni.a(fthArr), tno);
    }

    public final ajcx b(String str, ajfb<DbTransaction> ajfb) {
        akcr.b(str, "queryTag");
        akcr.b(ajfb, "consumer");
        return a().b(str, (ajfb) ajfb);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x00a5 in {4, 5, 13, 14, 15, 17, 19} preds:[]
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
    public final void b(java.util.Map<defpackage.fth, ? extends java.lang.Object> r9, defpackage.tno r10, com.snap.core.db.api.DbTransaction r11) {
        /*
        r8 = this;
        r0 = "data";
        defpackage.akcr.b(r9, r0);
        r0 = "type";
        defpackage.akcr.b(r10, r0);
        r0 = "tx";
        defpackage.akcr.b(r11, r0);
        r0 = defpackage.tno.FEATURE;
        if (r10 == r0) goto L_0x009b;
        r9 = defpackage.tni.a(r9);
        r0 = r8.c;
        r0 = r0.get();
        if (r0 == 0) goto L_0x0026;
        r0 = r8.a;
        r0 = r0.a(r10);
        goto L_0x002e;
        r0 = r8.a();
        r0 = r0.a(r10);
        r1 = com.google.common.collect.Maps.newHashMap();
        r2 = com.google.common.collect.Maps.newHashMap();
        r3 = com.google.common.collect.Sets.newHashSet();
        r4 = r0.keySet();
        r5 = r9.keySet();
        r5 = (java.lang.Iterable) r5;
        r4 = defpackage.ajzu.b(r4, r5);
        r4 = r4.iterator();
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0076;
        r5 = r4.next();
        r5 = (defpackage.tnm) r5;
        r6 = r9.get(r5);
        r7 = r0.get(r5);
        if (r6 == 0) goto L_0x0072;
        r7 = defpackage.akcr.a(r6, r7);
        r7 = r7 ^ 1;
        if (r7 == 0) goto L_0x006e;
        r1.put(r5, r6);
        goto L_0x004c;
        r2.put(r5, r6);
        goto L_0x004c;
        r3.add(r5);
        goto L_0x004c;
        r9 = "toSet";
        defpackage.akcr.a(r1, r9);
        r1 = (java.util.Map) r1;
        r8.a(r1, r10, r11);
        r9 = "toDelete";
        defpackage.akcr.a(r3, r9);
        r3 = (java.lang.Iterable) r3;
        r9 = defpackage.ajyu.k(r3);
        r8.a(r9, r10);
        r9 = r8.a;
        r11 = "toUpdate";
        defpackage.akcr.a(r2, r11);
        r2 = (java.util.Map) r2;
        r9.b(r2, r10);
        return;
        r9 = new java.lang.IllegalArgumentException;
        r10 = "FEATURE keys are not handled by replaceAll";
        r9.<init>(r10);
        r9 = (java.lang.Throwable) r9;
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnx.b(java.util.Map, tno, com.snap.core.db.api.DbTransaction):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0074 in {7, 10, 11, 13} preds:[]
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
    public final void c(java.util.Map<defpackage.fth, ? extends defpackage.hxp> r5, defpackage.tno r6, com.snap.core.db.api.DbTransaction r7) {
        /*
        r4 = this;
        r0 = "values";
        defpackage.akcr.b(r5, r0);
        r0 = "type";
        defpackage.akcr.b(r6, r0);
        r0 = "tx";
        defpackage.akcr.b(r7, r0);
        r0 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0072 }
        r0.<init>();	 Catch:{ all -> 0x0072 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0072 }
        r5 = r5.entrySet();	 Catch:{ all -> 0x0072 }
        r5 = r5.iterator();	 Catch:{ all -> 0x0072 }
        r1 = r5.hasNext();	 Catch:{ all -> 0x0072 }
        if (r1 == 0) goto L_0x0054;	 Catch:{ all -> 0x0072 }
        r1 = r5.next();	 Catch:{ all -> 0x0072 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x0072 }
        r2 = r4.a;	 Catch:{ all -> 0x0072 }
        r3 = r1.getKey();	 Catch:{ all -> 0x0072 }
        r3 = (defpackage.fth) r3;	 Catch:{ all -> 0x0072 }
        r3 = defpackage.tni.a(r3);	 Catch:{ all -> 0x0072 }
        r2 = r2.b(r3, r6);	 Catch:{ all -> 0x0072 }
        r3 = r1.getValue();	 Catch:{ all -> 0x0072 }
        r3 = (defpackage.hxp) r3;	 Catch:{ all -> 0x0072 }
        r2 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0072 }
        r2 = r2 ^ 1;	 Catch:{ all -> 0x0072 }
        if (r2 == 0) goto L_0x001e;	 Catch:{ all -> 0x0072 }
        r2 = r1.getKey();	 Catch:{ all -> 0x0072 }
        r1 = r1.getValue();	 Catch:{ all -> 0x0072 }
        r0.put(r2, r1);	 Catch:{ all -> 0x0072 }
        goto L_0x001e;	 Catch:{ all -> 0x0072 }
        r5 = r0.isEmpty();	 Catch:{ all -> 0x0072 }
        r5 = r5 ^ 1;	 Catch:{ all -> 0x0072 }
        if (r5 == 0) goto L_0x0071;	 Catch:{ all -> 0x0072 }
        r5 = defpackage.tni.b(r0);	 Catch:{ all -> 0x0072 }
        r1 = r4.a();	 Catch:{ all -> 0x0072 }
        r1.b(r0, r6, r7);	 Catch:{ all -> 0x0072 }
        r7 = r4.a;	 Catch:{ all -> 0x0072 }
        r7.b(r5, r6);	 Catch:{ all -> 0x0072 }
        r7 = r4.b;	 Catch:{ all -> 0x0072 }
        r7.a(r5, r6);	 Catch:{ all -> 0x0072 }
        return;
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnx.c(java.util.Map, tno, com.snap.core.db.api.DbTransaction):void");
    }
}
