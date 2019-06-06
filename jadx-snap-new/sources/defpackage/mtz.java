package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import defpackage.mwe.a;
import defpackage.mwe.a.b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: mtz */
public final class mtz implements mwe {
    final Gson a;
    final akbl<String, String> b;
    final akbl<String, String> c;
    final akbk<InputStream> d;
    final zfw e;
    private final ajxe f;

    /* renamed from: mtz$a */
    static final class a extends akcs implements akbk<ajde<List<? extends mux>>> {
        final /* synthetic */ mtz a;

        /* renamed from: mtz$a$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x0122 in {9, 11, 17, 18, 25, 26, 27, 28, 29, 32, 38, 40} preds:[]
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            private java.util.List<defpackage.mux> a() {
                /*
                r23 = this;
                r1 = r23;
                r0 = new java.io.InputStreamReader;
                r2 = r1.a;
                r2 = r2.a;
                r2 = r2.d;
                r2 = r2.invoke();
                r2 = (java.io.InputStream) r2;
                r0.<init>(r2);
                r2 = r0;
                r2 = (java.io.Closeable) r2;
                r3 = 0;
                r0 = r2;	 Catch:{ Throwable -> 0x011b }
                r0 = (java.io.InputStreamReader) r0;	 Catch:{ Throwable -> 0x011b }
                r4 = r1.a;	 Catch:{ Throwable -> 0x011b }
                r4 = r4.a;	 Catch:{ Throwable -> 0x011b }
                r4 = r4.a;	 Catch:{ Throwable -> 0x011b }
                r0 = (java.io.Reader) r0;	 Catch:{ Throwable -> 0x011b }
                r5 = defpackage.mua.a;	 Catch:{ Throwable -> 0x011b }
                r0 = r4.fromJson(r0, r5);	 Catch:{ Throwable -> 0x011b }
                r0 = (java.util.List) r0;	 Catch:{ Throwable -> 0x011b }
                r4 = "jsonLenses";	 Catch:{ Throwable -> 0x011b }
                defpackage.akcr.a(r0, r4);	 Catch:{ Throwable -> 0x011b }
                r0 = (java.lang.Iterable) r0;	 Catch:{ Throwable -> 0x011b }
                r4 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x011b }
                r4.<init>();	 Catch:{ Throwable -> 0x011b }
                r4 = (java.util.Collection) r4;	 Catch:{ Throwable -> 0x011b }
                r0 = r0.iterator();	 Catch:{ Throwable -> 0x011b }
                r5 = r0.hasNext();	 Catch:{ Throwable -> 0x011b }
                r6 = 0;	 Catch:{ Throwable -> 0x011b }
                if (r5 == 0) goto L_0x0061;	 Catch:{ Throwable -> 0x011b }
                r5 = r0.next();	 Catch:{ Throwable -> 0x011b }
                r7 = r5;	 Catch:{ Throwable -> 0x011b }
                r7 = (defpackage.mus) r7;	 Catch:{ Throwable -> 0x011b }
                r8 = r7.c;	 Catch:{ Throwable -> 0x011b }
                r9 = 1;	 Catch:{ Throwable -> 0x011b }
                if (r8 == 0) goto L_0x005b;	 Catch:{ Throwable -> 0x011b }
                r7 = r7.a;	 Catch:{ Throwable -> 0x011b }
                r7 = (java.lang.CharSequence) r7;	 Catch:{ Throwable -> 0x011b }
                r7 = defpackage.akgb.a(r7);	 Catch:{ Throwable -> 0x011b }
                r7 = r7 ^ r9;	 Catch:{ Throwable -> 0x011b }
                if (r7 == 0) goto L_0x005b;	 Catch:{ Throwable -> 0x011b }
                r6 = 1;	 Catch:{ Throwable -> 0x011b }
                if (r6 == 0) goto L_0x003c;	 Catch:{ Throwable -> 0x011b }
                r4.add(r5);	 Catch:{ Throwable -> 0x011b }
                goto L_0x003c;	 Catch:{ Throwable -> 0x011b }
                r4 = (java.util.List) r4;	 Catch:{ Throwable -> 0x011b }
                r4 = (java.lang.Iterable) r4;	 Catch:{ Throwable -> 0x011b }
                r0 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x011b }
                r5 = 10;	 Catch:{ Throwable -> 0x011b }
                r5 = defpackage.ajyn.a(r4, r5);	 Catch:{ Throwable -> 0x011b }
                r0.<init>(r5);	 Catch:{ Throwable -> 0x011b }
                r0 = (java.util.Collection) r0;	 Catch:{ Throwable -> 0x011b }
                r4 = r4.iterator();	 Catch:{ Throwable -> 0x011b }
                r5 = r4.hasNext();	 Catch:{ Throwable -> 0x011b }
                if (r5 == 0) goto L_0x0113;	 Catch:{ Throwable -> 0x011b }
                r5 = r4.next();	 Catch:{ Throwable -> 0x011b }
                r5 = (defpackage.mus) r5;	 Catch:{ Throwable -> 0x011b }
                r7 = r1.a;	 Catch:{ Throwable -> 0x011b }
                r7 = r7.a;	 Catch:{ Throwable -> 0x011b }
                r7 = r7.b;	 Catch:{ Throwable -> 0x011b }
                r8 = r5.b;	 Catch:{ Throwable -> 0x011b }
                r7 = r7.invoke(r8);	 Catch:{ Throwable -> 0x011b }
                r7 = (java.lang.String) r7;	 Catch:{ Throwable -> 0x011b }
                r10 = defpackage.miq.a.b(r7);	 Catch:{ Throwable -> 0x011b }
                r7 = r5.d;	 Catch:{ Throwable -> 0x011b }
                if (r7 == 0) goto L_0x00ab;	 Catch:{ Throwable -> 0x011b }
                r7 = r1.a;	 Catch:{ Throwable -> 0x011b }
                r7 = r7.a;	 Catch:{ Throwable -> 0x011b }
                r7 = r7.c;	 Catch:{ Throwable -> 0x011b }
                r8 = r5.d;	 Catch:{ Throwable -> 0x011b }
                r7 = r7.invoke(r8);	 Catch:{ Throwable -> 0x011b }
                r7 = (java.lang.String) r7;	 Catch:{ Throwable -> 0x011b }
                r7 = defpackage.miq.a.b(r7);	 Catch:{ Throwable -> 0x011b }
                goto L_0x00af;	 Catch:{ Throwable -> 0x011b }
                r7 = defpackage.miq.b.a;	 Catch:{ Throwable -> 0x011b }
                r7 = (defpackage.miq) r7;	 Catch:{ Throwable -> 0x011b }
                r11 = r7;	 Catch:{ Throwable -> 0x011b }
                r7 = r5.e;	 Catch:{ Throwable -> 0x011b }
                if (r7 == 0) goto L_0x00e8;	 Catch:{ Throwable -> 0x011b }
                r8 = r7.a;	 Catch:{ Throwable -> 0x011b }
                r8 = defpackage.ajyi.i(r8);	 Catch:{ Throwable -> 0x011b }
                r8 = defpackage.mvb.a.a(r8);	 Catch:{ Throwable -> 0x011b }
                r7 = r7.b;	 Catch:{ Throwable -> 0x011b }
                r9 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x011b }
                r9.<init>();	 Catch:{ Throwable -> 0x011b }
                r9 = (java.util.Collection) r9;	 Catch:{ Throwable -> 0x011b }
                r12 = r7.length;	 Catch:{ Throwable -> 0x011b }
                r13 = 0;	 Catch:{ Throwable -> 0x011b }
                if (r13 >= r12) goto L_0x00d9;	 Catch:{ Throwable -> 0x011b }
                r14 = r7[r13];	 Catch:{ Throwable -> 0x011b }
                r14 = defpackage.muz.a.a(r14);	 Catch:{ Throwable -> 0x011b }
                if (r14 == 0) goto L_0x00d6;	 Catch:{ Throwable -> 0x011b }
                r9.add(r14);	 Catch:{ Throwable -> 0x011b }
                r13 = r13 + 1;	 Catch:{ Throwable -> 0x011b }
                goto L_0x00c9;	 Catch:{ Throwable -> 0x011b }
                r9 = (java.util.List) r9;	 Catch:{ Throwable -> 0x011b }
                r9 = (java.lang.Iterable) r9;	 Catch:{ Throwable -> 0x011b }
                r7 = defpackage.ajyu.m(r9);	 Catch:{ Throwable -> 0x011b }
                r9 = new mvy;	 Catch:{ Throwable -> 0x011b }
                r9.<init>(r8, r7);	 Catch:{ Throwable -> 0x011b }
                r14 = r9;	 Catch:{ Throwable -> 0x011b }
                goto L_0x00eb;	 Catch:{ Throwable -> 0x011b }
                r7 = defpackage.mvy.c;	 Catch:{ Throwable -> 0x011b }
                r14 = r7;	 Catch:{ Throwable -> 0x011b }
                r7 = new mux;	 Catch:{ Throwable -> 0x011b }
                r9 = new mhs$b;	 Catch:{ Throwable -> 0x011b }
                r5 = r5.a;	 Catch:{ Throwable -> 0x011b }
                r9.<init>(r5);	 Catch:{ Throwable -> 0x011b }
                r12 = 0;	 Catch:{ Throwable -> 0x011b }
                r13 = 0;	 Catch:{ Throwable -> 0x011b }
                r5 = defpackage.muu.BUNDLED;	 Catch:{ Throwable -> 0x011b }
                r16 = r5;	 Catch:{ Throwable -> 0x011b }
                r16 = (defpackage.mwg) r16;	 Catch:{ Throwable -> 0x011b }
                r15 = 0;	 Catch:{ Throwable -> 0x011b }
                r17 = 0;	 Catch:{ Throwable -> 0x011b }
                r18 = 0;	 Catch:{ Throwable -> 0x011b }
                r19 = 0;	 Catch:{ Throwable -> 0x011b }
                r20 = 0;	 Catch:{ Throwable -> 0x011b }
                r21 = 0;	 Catch:{ Throwable -> 0x011b }
                r22 = 2095836; // 0x1ffadc float:2.936892E-39 double:1.0354806E-317;	 Catch:{ Throwable -> 0x011b }
                r8 = r7;	 Catch:{ Throwable -> 0x011b }
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);	 Catch:{ Throwable -> 0x011b }
                r0.add(r7);	 Catch:{ Throwable -> 0x011b }
                goto L_0x0076;	 Catch:{ Throwable -> 0x011b }
                r0 = (java.util.List) r0;	 Catch:{ Throwable -> 0x011b }
                defpackage.akax.a(r2, r3);
                return r0;
                r0 = move-exception;
                goto L_0x011e;
                r0 = move-exception;
                r3 = r0;
                throw r3;	 Catch:{ all -> 0x0119 }
                defpackage.akax.a(r2, r3);
                throw r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mtz$a$1.a():java.util.List");
            }

            public final /* synthetic */ Object call() {
                return a();
            }
        }

        a(mtz mtz) {
            this.a = mtz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajde b = ajde.b((Callable) new 1(this)).b((ajdw) this.a.e.f());
            ajfv.a(16, "initialCapacity");
            return ajvo.a(new ajir(b));
        }
    }

    /* renamed from: mtz$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ defpackage.mhs.b a;

        b(defpackage.mhs.b bVar) {
            this.a = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (akcr.a(((mux) next).a, this.a)) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mtz.class), "allAssetLenses", "getAllAssetLenses()Lio/reactivex/Flowable;");
    }

    public mtz(akbl<? super String, String> akbl, akbl<? super String, String> akbl2, akbk<? extends InputStream> akbk, zfw zfw, Gson gson) {
        akcr.b(akbl, "contentUriResolver");
        akcr.b(akbl2, "drawableResourceUriResolver");
        akcr.b(akbk, "assetInputStreamFactory");
        akcr.b(zfw, "qualifiedSchedulers");
        this.b = akbl;
        this.c = akbl2;
        this.d = akbk;
        this.e = zfw;
        if (gson == null) {
            gson = new GsonBuilder().create();
        }
        this.a = gson;
        this.f = ajxh.a(new a(this));
    }

    private final ajde<List<mux>> a() {
        return (ajde) this.f.b();
    }

    public final ajde<List<mux>> a(a aVar) {
        Object a;
        String str;
        akcr.b(aVar, "queryCriteria");
        if (akcr.a((Object) aVar, a.a.a)) {
            a = a();
            str = "allAssetLenses";
        } else if (aVar instanceof b) {
            a = a().d((ajfc) new b(((b) aVar).a));
            str = "allAssetLenses.map { it.… -> lens.id == lensId } }";
        } else {
            a = ajvo.a(ajjl.b);
            str = "empty()";
        }
        akcr.a(a, str);
        return a;
    }
}
