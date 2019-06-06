package defpackage;

import defpackage.akgx.a;
import defpackage.akwg.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: akwt */
public final class akwt {
    final a a;
    final akhm b;
    final List<akwk.a> c;
    final List<akwi.a> d;
    final Executor e;
    final boolean f;
    private final Map<Method, akwu<?, ?>> g = new ConcurrentHashMap();

    /* renamed from: akwt$a */
    public static final class a {
        private final akwq a;
        private defpackage.akgx.a b;
        private akhm c;
        private final List<defpackage.akwk.a> d;
        private final List<defpackage.akwi.a> e;
        private Executor f;
        private boolean g;

        public a() {
            this(akwq.a);
        }

        private a(akwq akwq) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = akwq;
            this.d.add(new akwg());
        }

        a(akwt akwt) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = akwq.a;
            this.b = akwt.a;
            this.c = akwt.b;
            this.d.addAll(akwt.c);
            this.e.addAll(akwt.d);
            List list = this.e;
            list.remove(list.size() - 1);
            this.f = akwt.e;
            this.g = akwt.f;
        }

        private a a(akhm akhm) {
            akwv.a((Object) akhm, "baseUrl == null");
            List list = akhm.d;
            if ("".equals(list.get(list.size() - 1))) {
                this.c = akhm;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: ".concat(String.valueOf(akhm)));
        }

        public final a a(defpackage.akgx.a aVar) {
            this.b = (defpackage.akgx.a) akwv.a((Object) aVar, "factory == null");
            return this;
        }

        public final a a(defpackage.akwi.a aVar) {
            this.e.add(akwv.a((Object) aVar, "factory == null"));
            return this;
        }

        public final a a(defpackage.akwk.a aVar) {
            this.d.add(akwv.a((Object) aVar, "factory == null"));
            return this;
        }

        public final a a(String str) {
            akwv.a((Object) str, "baseUrl == null");
            akhm e = akhm.e(str);
            if (e != null) {
                return a(e);
            }
            throw new IllegalArgumentException("Illegal URL: ".concat(String.valueOf(str)));
        }

        public final akwt a() {
            if (this.c != null) {
                defpackage.akgx.a aVar = this.b;
                if (aVar == null) {
                    aVar = new akhq();
                }
                defpackage.akgx.a aVar2 = aVar;
                Executor executor = this.f;
                if (executor == null) {
                    executor = this.a.a();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.e);
                arrayList.add(this.a.a(executor2));
                return new akwt(aVar2, this.c, new ArrayList(this.d), arrayList, executor2, this.g);
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    akwt(a aVar, akhm akhm, List<akwk.a> list, List<akwi.a> list2, Executor executor, boolean z) {
        this.a = aVar;
        this.b = akhm;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = executor;
        this.f = z;
    }

    private void b(Class<?> cls) {
        akwq akwq = akwq.a;
        for (Method method : cls.getDeclaredMethods()) {
            if (!akwq.a(method)) {
                a(method);
            }
        }
    }

    public final <T> akwk<T, String> a(Type type, Annotation[] annotationArr) {
        akwv.a((Object) type, "type == null");
        akwv.a((Object) annotationArr, "annotations == null");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            akwk a = ((akwk.a) this.c.get(i)).a(annotationArr);
            if (a != null) {
                return a;
            }
        }
        return d.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0074 in {4, 5, 8, 10} preds:[]
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
    public final <T> defpackage.akwk<T, defpackage.akhu> a(java.lang.reflect.Type r5, java.lang.annotation.Annotation[] r6, java.lang.annotation.Annotation[] r7) {
        /*
        r4 = this;
        r0 = "type == null";
        defpackage.akwv.a(r5, r0);
        r0 = "parameterAnnotations == null";
        defpackage.akwv.a(r6, r0);
        r0 = "methodAnnotations == null";
        defpackage.akwv.a(r7, r0);
        r0 = r4.c;
        r1 = 0;
        r0 = r0.indexOf(r1);
        r0 = r0 + 1;
        r1 = r4.c;
        r1 = r1.size();
        r2 = r0;
        if (r2 >= r1) goto L_0x0033;
        r3 = r4.c;
        r3 = r3.get(r2);
        r3 = (defpackage.akwk.a) r3;
        r3 = r3.a(r5, r6, r7, r4);
        if (r3 == 0) goto L_0x0030;
        return r3;
        r2 = r2 + 1;
        goto L_0x001f;
        r6 = new java.lang.StringBuilder;
        r7 = "Could not locate RequestBody converter for ";
        r6.<init>(r7);
        r6.append(r5);
        r5 = ".\n";
        r6.append(r5);
        r5 = "  Tried:";
        r6.append(r5);
        r5 = r4.c;
        r5 = r5.size();
        if (r0 >= r5) goto L_0x006a;
        r7 = "\n   * ";
        r6.append(r7);
        r7 = r4.c;
        r7 = r7.get(r0);
        r7 = (defpackage.akwk.a) r7;
        r7 = r7.getClass();
        r7 = r7.getName();
        r6.append(r7);
        r0 = r0 + 1;
        goto L_0x004d;
        r5 = new java.lang.IllegalArgumentException;
        r6 = r6.toString();
        r5.<init>(r6);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwt.a(java.lang.reflect.Type, java.lang.annotation.Annotation[], java.lang.annotation.Annotation[]):akwk");
    }

    public final a a() {
        return new a(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:133:0x020f in {2, 17, 18, 21, 26, 28, 31, 32, 35, 38, 41, 44, 49, 51, 56, 58, 63, 65, 66, 75, 77, 79, 86, 88, 90, 95, 97, 106, 108, 113, 115, 120, 122, 123, 125, 127, 129, 132} preds:[]
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
    final defpackage.akwu<?, ?> a(java.lang.reflect.Method r11) {
        /*
        r10 = this;
        r0 = r10.g;
        r0 = r0.get(r11);
        r0 = (defpackage.akwu) r0;
        if (r0 == 0) goto L_0x000b;
        return r0;
        r0 = r10.g;
        monitor-enter(r0);
        r1 = r10.g;	 Catch:{ all -> 0x020c }
        r1 = r1.get(r11);	 Catch:{ all -> 0x020c }
        r1 = (defpackage.akwu) r1;	 Catch:{ all -> 0x020c }
        if (r1 != 0) goto L_0x020a;	 Catch:{ all -> 0x020c }
        r1 = new akwu$a;	 Catch:{ all -> 0x020c }
        r1.<init>(r10, r11);	 Catch:{ all -> 0x020c }
        r2 = r1.a();	 Catch:{ all -> 0x020c }
        r1.s = r2;	 Catch:{ all -> 0x020c }
        r2 = r1.s;	 Catch:{ all -> 0x020c }
        r2 = r2.a();	 Catch:{ all -> 0x020c }
        r1.e = r2;	 Catch:{ all -> 0x020c }
        r2 = r1.e;	 Catch:{ all -> 0x020c }
        r3 = defpackage.akws.class;	 Catch:{ all -> 0x020c }
        r4 = 0;	 Catch:{ all -> 0x020c }
        r5 = 0;	 Catch:{ all -> 0x020c }
        if (r2 == r3) goto L_0x01e6;	 Catch:{ all -> 0x020c }
        r2 = r1.e;	 Catch:{ all -> 0x020c }
        r3 = defpackage.akhv.class;	 Catch:{ all -> 0x020c }
        if (r2 == r3) goto L_0x01e6;	 Catch:{ all -> 0x020c }
        r2 = r1.b();	 Catch:{ all -> 0x020c }
        r1.r = r2;	 Catch:{ all -> 0x020c }
        r2 = r1.b;	 Catch:{ all -> 0x020c }
        r3 = r2.length;	 Catch:{ all -> 0x020c }
        r6 = 0;	 Catch:{ all -> 0x020c }
        r7 = 1;	 Catch:{ all -> 0x020c }
        if (r6 >= r3) goto L_0x0121;	 Catch:{ all -> 0x020c }
        r8 = r2[r6];	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxl;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x0059;	 Catch:{ all -> 0x020c }
        r7 = "DELETE";	 Catch:{ all -> 0x020c }
        r8 = (defpackage.akxl) r8;	 Catch:{ all -> 0x020c }
        r8 = r8.a();	 Catch:{ all -> 0x020c }
        r1.a(r7, r8, r5);	 Catch:{ all -> 0x020c }
        goto L_0x011d;	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxp;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x0066;	 Catch:{ all -> 0x020c }
        r7 = "GET";	 Catch:{ all -> 0x020c }
        r8 = (defpackage.akxp) r8;	 Catch:{ all -> 0x020c }
        r8 = r8.a();	 Catch:{ all -> 0x020c }
        goto L_0x0054;	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxq;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x008a;	 Catch:{ all -> 0x020c }
        r7 = "HEAD";	 Catch:{ all -> 0x020c }
        r8 = (defpackage.akxq) r8;	 Catch:{ all -> 0x020c }
        r8 = r8.a();	 Catch:{ all -> 0x020c }
        r1.a(r7, r8, r5);	 Catch:{ all -> 0x020c }
        r7 = java.lang.Void.class;	 Catch:{ all -> 0x020c }
        r8 = r1.e;	 Catch:{ all -> 0x020c }
        r7 = r7.equals(r8);	 Catch:{ all -> 0x020c }
        if (r7 == 0) goto L_0x0081;	 Catch:{ all -> 0x020c }
        goto L_0x011d;	 Catch:{ all -> 0x020c }
        r11 = "HEAD method must use Void as response type.";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxx;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x009b;	 Catch:{ all -> 0x020c }
        r9 = "PATCH";	 Catch:{ all -> 0x020c }
        r8 = (defpackage.akxx) r8;	 Catch:{ all -> 0x020c }
        r8 = r8.a();	 Catch:{ all -> 0x020c }
        r1.a(r9, r8, r7);	 Catch:{ all -> 0x020c }
        goto L_0x011d;	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxy;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x00a8;	 Catch:{ all -> 0x020c }
        r9 = "POST";	 Catch:{ all -> 0x020c }
        r8 = (defpackage.akxy) r8;	 Catch:{ all -> 0x020c }
        r8 = r8.a();	 Catch:{ all -> 0x020c }
        goto L_0x0096;	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxz;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x00b5;	 Catch:{ all -> 0x020c }
        r9 = "PUT";	 Catch:{ all -> 0x020c }
        r8 = (defpackage.akxz) r8;	 Catch:{ all -> 0x020c }
        r8 = r8.a();	 Catch:{ all -> 0x020c }
        goto L_0x0096;	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxw;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x00c2;	 Catch:{ all -> 0x020c }
        r7 = "OPTIONS";	 Catch:{ all -> 0x020c }
        r8 = (defpackage.akxw) r8;	 Catch:{ all -> 0x020c }
        r8 = r8.a();	 Catch:{ all -> 0x020c }
        goto L_0x0054;	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxr;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x00d8;	 Catch:{ all -> 0x020c }
        r8 = (defpackage.akxr) r8;	 Catch:{ all -> 0x020c }
        r7 = r8.a();	 Catch:{ all -> 0x020c }
        r9 = r8.b();	 Catch:{ all -> 0x020c }
        r8 = r8.c();	 Catch:{ all -> 0x020c }
        r1.a(r7, r9, r8);	 Catch:{ all -> 0x020c }
        goto L_0x011d;	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxu;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x00f5;	 Catch:{ all -> 0x020c }
        r8 = (defpackage.akxu) r8;	 Catch:{ all -> 0x020c }
        r7 = r8.a();	 Catch:{ all -> 0x020c }
        r8 = r7.length;	 Catch:{ all -> 0x020c }
        if (r8 == 0) goto L_0x00ec;	 Catch:{ all -> 0x020c }
        r7 = r1.a(r7);	 Catch:{ all -> 0x020c }
        r1.o = r7;	 Catch:{ all -> 0x020c }
        goto L_0x011d;	 Catch:{ all -> 0x020c }
        r11 = "@Headers annotation is empty.";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r9 = r8 instanceof defpackage.akxv;	 Catch:{ all -> 0x020c }
        if (r9 == 0) goto L_0x0109;	 Catch:{ all -> 0x020c }
        r8 = r1.l;	 Catch:{ all -> 0x020c }
        if (r8 != 0) goto L_0x0100;	 Catch:{ all -> 0x020c }
        r1.m = r7;	 Catch:{ all -> 0x020c }
        goto L_0x011d;	 Catch:{ all -> 0x020c }
        r11 = "Only one encoding annotation is allowed.";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r8 = r8 instanceof defpackage.akxo;	 Catch:{ all -> 0x020c }
        if (r8 == 0) goto L_0x011d;	 Catch:{ all -> 0x020c }
        r8 = r1.m;	 Catch:{ all -> 0x020c }
        if (r8 != 0) goto L_0x0114;	 Catch:{ all -> 0x020c }
        r1.l = r7;	 Catch:{ all -> 0x020c }
        goto L_0x011d;	 Catch:{ all -> 0x020c }
        r11 = "Only one encoding annotation is allowed.";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r6 = r6 + 1;	 Catch:{ all -> 0x020c }
        goto L_0x0043;	 Catch:{ all -> 0x020c }
        r2 = r1.j;	 Catch:{ all -> 0x020c }
        if (r2 == 0) goto L_0x01dd;	 Catch:{ all -> 0x020c }
        r2 = r1.k;	 Catch:{ all -> 0x020c }
        if (r2 != 0) goto L_0x0144;	 Catch:{ all -> 0x020c }
        r2 = r1.m;	 Catch:{ all -> 0x020c }
        if (r2 != 0) goto L_0x013b;	 Catch:{ all -> 0x020c }
        r2 = r1.l;	 Catch:{ all -> 0x020c }
        if (r2 != 0) goto L_0x0132;	 Catch:{ all -> 0x020c }
        goto L_0x0144;	 Catch:{ all -> 0x020c }
        r11 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r11 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST).";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r2 = r1.c;	 Catch:{ all -> 0x020c }
        r2 = r2.length;	 Catch:{ all -> 0x020c }
        r3 = new defpackage.akwp[r2];	 Catch:{ all -> 0x020c }
        r1.q = r3;	 Catch:{ all -> 0x020c }
        r3 = 0;	 Catch:{ all -> 0x020c }
        if (r3 >= r2) goto L_0x017d;	 Catch:{ all -> 0x020c }
        r6 = r1.d;	 Catch:{ all -> 0x020c }
        r6 = r6[r3];	 Catch:{ all -> 0x020c }
        r8 = defpackage.akwv.d(r6);	 Catch:{ all -> 0x020c }
        if (r8 != 0) goto L_0x0172;	 Catch:{ all -> 0x020c }
        r8 = r1.c;	 Catch:{ all -> 0x020c }
        r8 = r8[r3];	 Catch:{ all -> 0x020c }
        if (r8 == 0) goto L_0x0169;	 Catch:{ all -> 0x020c }
        r9 = r1.q;	 Catch:{ all -> 0x020c }
        r6 = r1.a(r3, r6, r8);	 Catch:{ all -> 0x020c }
        r9[r3] = r6;	 Catch:{ all -> 0x020c }
        r3 = r3 + 1;	 Catch:{ all -> 0x020c }
        goto L_0x014c;	 Catch:{ all -> 0x020c }
        r11 = "No Retrofit annotation found.";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r3, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r11 = "Parameter type must not include a type variable or wildcard: %s";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r7];	 Catch:{ all -> 0x020c }
        r2[r5] = r6;	 Catch:{ all -> 0x020c }
        r11 = r1.a(r3, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r2 = r1.n;	 Catch:{ all -> 0x020c }
        if (r2 != 0) goto L_0x0193;	 Catch:{ all -> 0x020c }
        r2 = r1.i;	 Catch:{ all -> 0x020c }
        if (r2 == 0) goto L_0x0186;	 Catch:{ all -> 0x020c }
        goto L_0x0193;	 Catch:{ all -> 0x020c }
        r11 = "Missing either @%s URL or @Url parameter.";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r7];	 Catch:{ all -> 0x020c }
        r3 = r1.j;	 Catch:{ all -> 0x020c }
        r2[r5] = r3;	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r2 = r1.l;	 Catch:{ all -> 0x020c }
        if (r2 != 0) goto L_0x01ad;	 Catch:{ all -> 0x020c }
        r2 = r1.m;	 Catch:{ all -> 0x020c }
        if (r2 != 0) goto L_0x01ad;	 Catch:{ all -> 0x020c }
        r2 = r1.k;	 Catch:{ all -> 0x020c }
        if (r2 != 0) goto L_0x01ad;	 Catch:{ all -> 0x020c }
        r2 = r1.h;	 Catch:{ all -> 0x020c }
        if (r2 != 0) goto L_0x01a4;	 Catch:{ all -> 0x020c }
        goto L_0x01ad;	 Catch:{ all -> 0x020c }
        r11 = "Non-body HTTP method cannot contain @Body.";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r2 = r1.l;	 Catch:{ all -> 0x020c }
        if (r2 == 0) goto L_0x01bf;	 Catch:{ all -> 0x020c }
        r2 = r1.f;	 Catch:{ all -> 0x020c }
        if (r2 == 0) goto L_0x01b6;	 Catch:{ all -> 0x020c }
        goto L_0x01bf;	 Catch:{ all -> 0x020c }
        r11 = "Form-encoded method must contain at least one @Field.";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r2 = r1.m;	 Catch:{ all -> 0x020c }
        if (r2 == 0) goto L_0x01d1;	 Catch:{ all -> 0x020c }
        r2 = r1.g;	 Catch:{ all -> 0x020c }
        if (r2 == 0) goto L_0x01c8;	 Catch:{ all -> 0x020c }
        goto L_0x01d1;	 Catch:{ all -> 0x020c }
        r11 = "Multipart method must contain at least one @Part.";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r2 = new akwu;	 Catch:{ all -> 0x020c }
        r2.<init>(r1);	 Catch:{ all -> 0x020c }
        r1 = r10.g;	 Catch:{ all -> 0x020c }
        r1.put(r11, r2);	 Catch:{ all -> 0x020c }
        r1 = r2;	 Catch:{ all -> 0x020c }
        goto L_0x020a;	 Catch:{ all -> 0x020c }
        r11 = "HTTP method annotation is required (e.g., @GET, @POST, etc.).";	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x020c }
        r2 = "'";	 Catch:{ all -> 0x020c }
        r11.<init>(r2);	 Catch:{ all -> 0x020c }
        r2 = r1.e;	 Catch:{ all -> 0x020c }
        r2 = defpackage.akwv.a(r2);	 Catch:{ all -> 0x020c }
        r2 = r2.getName();	 Catch:{ all -> 0x020c }
        r11.append(r2);	 Catch:{ all -> 0x020c }
        r2 = "' is not a valid response body type. Did you mean ResponseBody?";	 Catch:{ all -> 0x020c }
        r11.append(r2);	 Catch:{ all -> 0x020c }
        r11 = r11.toString();	 Catch:{ all -> 0x020c }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x020c }
        r11 = r1.a(r4, r11, r2);	 Catch:{ all -> 0x020c }
        throw r11;	 Catch:{ all -> 0x020c }
        monitor-exit(r0);	 Catch:{ all -> 0x020c }
        return r1;	 Catch:{ all -> 0x020c }
        r11 = move-exception;	 Catch:{ all -> 0x020c }
        monitor-exit(r0);	 Catch:{ all -> 0x020c }
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwt.a(java.lang.reflect.Method):akwu");
    }

    public final <T> T a(final Class<T> cls) {
        akwv.a((Class) cls);
        if (this.f) {
            b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            private final akwq a = akwq.a;

            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.a.a(method)) {
                    return this.a.a(method, cls, obj, objArr);
                }
                akwu a = akwt.this.a(method);
                return a.d.a(new akwo(a, objArr));
            }
        });
    }
}
