package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abxl.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: abxr */
public final class abxr<T> implements b, abxq<T> {
    private final abqo a = new abqo();
    private long b = abqo.c();
    private final Map<abxp, b<T>> c;
    private abxp d;
    private final akca<T, T, Float, T> e;
    private final boolean f;

    /* renamed from: abxr$a */
    public static final class a<S> {
        final List<abxl> a;
        final Map<abxp, b<S>> b;
        final akca<S, S, Float, S> c;
        final boolean d;

        public /* synthetic */ a(akca akca) {
            this(akca, false);
        }

        public a(akca<? super S, ? super S, ? super Float, ? extends S> akca, boolean z) {
            akcr.b(akca, "interpolator");
            this.c = akca;
            this.d = z;
            this.a = new ArrayList();
            this.b = new LinkedHashMap();
        }

        public final a<S> a(abxl... abxlArr) {
            akcr.b(abxlArr, "dfa");
            a aVar = this;
            ajyr.a((Collection) aVar.a, (Object[]) abxlArr);
            return aVar;
        }

        public final b<S> a(abxp... abxpArr) {
            akcr.b(abxpArr, "states");
            b bVar = new b();
            for (Object obj : abxpArr) {
                if (this.b.containsKey(obj)) {
                    StringBuilder stringBuilder = new StringBuilder("You cannot add state: ");
                    stringBuilder.append(obj);
                    stringBuilder.append(" since it already contains the state");
                    throw new IllegalStateException(stringBuilder.toString());
                }
                this.b.put(obj, bVar);
            }
            return bVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:48:0x00eb in {11, 17, 18, 22, 26, 32, 33, 35, 37, 39, 41, 43, 45, 47} preds:[]
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
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final defpackage.abxr<S> a() {
            /*
            r10 = this;
            r0 = r10.a;
            r0 = r0.isEmpty();
            if (r0 != 0) goto L_0x00e1;
            r0 = r10.b;
            r0 = r0.isEmpty();
            if (r0 != 0) goto L_0x00d7;
            r0 = r10.b;
            r0 = r0.entrySet();
            r0 = r0.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x00d1;
            r1 = r0.next();
            r1 = (java.util.Map.Entry) r1;
            r2 = r1.getKey();
            r2 = (defpackage.abxp) r2;
            r1 = r1.getValue();
            r1 = (defpackage.abxr.b) r1;
            r3 = 4;
            r3 = new java.lang.Object[r3];
            r4 = r1.a;
            r5 = 0;
            r3[r5] = r4;
            r1 = r1.b;
            r4 = 1;
            r3[r4] = r1;
            r1 = 2;
            r6 = 0;
            r3[r1] = r6;
            r1 = 3;
            r3[r1] = r6;
            r1 = defpackage.ajym.b(r3);
            r3 = r1;
            r3 = (java.lang.Iterable) r3;
            r6 = r3 instanceof java.util.Collection;
            if (r6 == 0) goto L_0x005c;
            r7 = r3;
            r7 = (java.util.Collection) r7;
            r7 = r7.isEmpty();
            if (r7 == 0) goto L_0x005c;
            r8 = 0;
            goto L_0x007a;
            r7 = r3.iterator();
            r8 = 0;
            r9 = r7.hasNext();
            if (r9 == 0) goto L_0x007a;
            r9 = r7.next();
            if (r9 == 0) goto L_0x006f;
            r9 = 1;
            goto L_0x0070;
            r9 = 0;
            if (r9 == 0) goto L_0x0061;
            r8 = r8 + 1;
            if (r8 >= 0) goto L_0x0061;
            defpackage.ajym.b();
            goto L_0x0061;
            if (r8 > r4) goto L_0x00b3;
            if (r6 == 0) goto L_0x0087;
            r1 = r3;
            r1 = (java.util.Collection) r1;
            r1 = r1.isEmpty();
            if (r1 != 0) goto L_0x009d;
            r1 = r3.iterator();
            r3 = r1.hasNext();
            if (r3 == 0) goto L_0x009d;
            r3 = r1.next();
            if (r3 != 0) goto L_0x0099;
            r3 = 1;
            goto L_0x009a;
            r3 = 0;
            if (r3 != 0) goto L_0x008b;
            r4 = 0;
            if (r4 != 0) goto L_0x00a1;
            goto L_0x001a;
            r0 = new java.lang.IllegalStateException;
            r1 = java.lang.String.valueOf(r2);
            r2 = "You must set a value for state: ";
            r1 = r2.concat(r1);
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            r0 = new java.lang.IllegalStateException;
            r3 = new java.lang.StringBuilder;
            r4 = "You cannot have state: ";
            r3.<init>(r4);
            r3.append(r2);
            r2 = " be more than one value: ";
            r3.append(r2);
            r3.append(r1);
            r1 = r3.toString();
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            r0 = new abxr;
            r0.<init>(r10);
            return r0;
            r0 = new java.lang.IllegalStateException;
            r1 = "You must have a value in the state to value map.";
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            r0 = new java.lang.IllegalStateException;
            r1 = "You must have your value be dependent on a DFA";
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abxr$a.a():abxr");
        }
    }

    /* renamed from: abxr$b */
    public static final class b<U> {
        public U a;
        U b;
        U c;
        long d;

        public final void a(U u, U u2, long j) {
            this.b = u;
            this.c = u2;
            this.d = j;
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0040, code skipped:
            if (r0 == null) goto L_0x0042;
     */
    public abxr(defpackage.abxr.a<T> r5) {
        /*
        r4 = this;
        r0 = "builder";
        defpackage.akcr.b(r5, r0);
        r4.<init>();
        r0 = new abqo;
        r0.<init>();
        r4.a = r0;
        r0 = defpackage.abqo.c();
        r4.b = r0;
        r0 = r5.b;
        r4.c = r0;
        r0 = r5.a;
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
    L_0x0021:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0039;
    L_0x0027:
        r1 = r0.next();
        r2 = r1;
        r2 = (defpackage.abxl) r2;
        r3 = r4.c;
        r2 = r2.a;
        r2 = r3.containsKey(r2);
        if (r2 == 0) goto L_0x0021;
    L_0x0038:
        goto L_0x003a;
    L_0x0039:
        r1 = 0;
    L_0x003a:
        r1 = (defpackage.abxl) r1;
        if (r1 == 0) goto L_0x0042;
    L_0x003e:
        r0 = r1.a;
        if (r0 != 0) goto L_0x0056;
    L_0x0042:
        r0 = r4.c;
        r0 = r0.entrySet();
        r0 = (java.lang.Iterable) r0;
        r0 = defpackage.ajyu.d(r0);
        r0 = (java.util.Map.Entry) r0;
        r0 = r0.getKey();
        r0 = (defpackage.abxp) r0;
    L_0x0056:
        r4.d = r0;
        r0 = r5.c;
        r4.e = r0;
        r0 = r5.d;
        r4.f = r0;
        r5 = r5.a;
        r5 = (java.lang.Iterable) r5;
        r5 = r5.iterator();
    L_0x0068:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x007b;
    L_0x006e:
        r0 = r5.next();
        r0 = (defpackage.abxl) r0;
        r1 = r4;
        r1 = (defpackage.abxl.b) r1;
        r0.a(r1);
        goto L_0x0068;
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abxr.<init>(abxr$a):void");
    }

    public final T a() {
        Object obj = this.c.get(this.d);
        if (obj != null) {
            b bVar = (b) obj;
            T t = bVar.a;
            T t2 = null;
            if (t == null) {
                t = t2;
            }
            if (t != null) {
                return t;
            }
            akca akca = this.e;
            Object obj2 = bVar.b;
            if (obj2 == null) {
                akcr.a();
                obj2 = t2.invoke();
            }
            Object obj3 = bVar.c;
            if (obj3 == null) {
                akcr.a();
                obj3 = t2.invoke();
            }
            return akca.invoke(obj2, obj3, Float.valueOf(abpf.a(((float) (abqo.c() - this.b)) / ((float) bVar.d), (float) MapboxConstants.MINIMUM_ZOOM, 1.0f)));
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.android.framework.ui.views.openview.layer2.stateful.TimeOfStateInterpolatedValue.StateValue<T>");
    }

    public final void a(abxp abxp) {
        akcr.b(abxp, "newState");
        if (this.c.containsKey(abxp)) {
            this.b = abqo.c();
            this.d = abxp;
        }
    }
}
