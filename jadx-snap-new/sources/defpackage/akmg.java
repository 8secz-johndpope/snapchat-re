package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: akmg */
public abstract class akmg implements Serializable {
    public static final akmg a = new a();
    public static final akmg b = new e();
    private static final ThreadLocal<WeakHashMap<Object, Object>> p = new ThreadLocal();
    boolean c = true;
    boolean d = true;
    boolean e = false;
    boolean f = true;
    String g = "[";
    String h = "]";
    boolean i = false;
    String j;
    String k;
    String l;
    boolean m;
    String n;
    String o;
    private String q = "=";
    private boolean r = false;
    private boolean s;
    private String t;
    private String u;
    private String v;
    private String w;

    /* renamed from: akmg$a */
    static final class a extends akmg {
        a() {
        }
    }

    /* renamed from: akmg$b */
    static final class b extends akmg {
        b() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(aklz.a);
            stringBuilder.append("  ");
            String stringBuilder2 = stringBuilder.toString();
            if (stringBuilder2 == null) {
                stringBuilder2 = "";
            }
            this.j = stringBuilder2;
            this.i = true;
            stringBuilder = new StringBuilder();
            stringBuilder.append(aklz.a);
            stringBuilder.append("]");
            a(stringBuilder.toString());
        }
    }

    /* renamed from: akmg$c */
    static final class c extends akmg {
        c() {
        }
    }

    /* renamed from: akmg$d */
    static final class d extends akmg {
        d() {
        }
    }

    /* renamed from: akmg$e */
    static final class e extends akmg {
        e() {
            String str = "";
            this.g = str;
            a(str);
        }
    }

    static {
        b bVar = new b();
        c cVar = new c();
        d dVar = new d();
    }

    protected akmg() {
        String str = ppy.b;
        this.j = str;
        this.k = "{";
        this.l = str;
        this.m = true;
        this.n = "}";
        this.s = true;
        this.o = "<null>";
        this.t = "<size=";
        String str2 = ">";
        this.u = str2;
        this.v = "<";
        this.w = str2;
    }

    private static Map<Object, Object> a() {
        return (Map) p.get();
    }

    static void a(Object obj) {
        if (obj != null) {
            if (akmg.a() == null) {
                p.set(new WeakHashMap());
            }
            akmg.a().put(obj, null);
        }
    }

    private void a(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.t);
        stringBuffer.append(i);
        stringBuffer.append(this.u);
    }

    private void a(StringBuffer stringBuffer, Object obj) {
        stringBuffer.append(this.v);
        stringBuffer.append(akls.a(obj.getClass()));
        stringBuffer.append(this.w);
    }

    private void a(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.k);
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (i > 0) {
                stringBuffer.append(this.l);
            }
            if (obj == null) {
                a(stringBuffer);
            } else {
                a(stringBuffer, str, obj, this.m);
            }
        }
        stringBuffer.append(this.n);
    }

    private void a(StringBuffer stringBuffer, byte[] bArr) {
        stringBuffer.append(this.k);
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.l);
            }
            stringBuffer.append(bArr[i]);
        }
        stringBuffer.append(this.n);
    }

    private void a(StringBuffer stringBuffer, char[] cArr) {
        stringBuffer.append(this.k);
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.l);
            }
            stringBuffer.append(cArr[i]);
        }
        stringBuffer.append(this.n);
    }

    private void a(StringBuffer stringBuffer, double[] dArr) {
        stringBuffer.append(this.k);
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.l);
            }
            stringBuffer.append(dArr[i]);
        }
        stringBuffer.append(this.n);
    }

    private void a(StringBuffer stringBuffer, float[] fArr) {
        stringBuffer.append(this.k);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.l);
            }
            stringBuffer.append(fArr[i]);
        }
        stringBuffer.append(this.n);
    }

    private void a(StringBuffer stringBuffer, int[] iArr) {
        stringBuffer.append(this.k);
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.l);
            }
            stringBuffer.append(iArr[i]);
        }
        stringBuffer.append(this.n);
    }

    private void a(StringBuffer stringBuffer, long[] jArr) {
        stringBuffer.append(this.k);
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.l);
            }
            stringBuffer.append(jArr[i]);
        }
        stringBuffer.append(this.n);
    }

    private void a(StringBuffer stringBuffer, short[] sArr) {
        stringBuffer.append(this.k);
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.l);
            }
            stringBuffer.append(sArr[i]);
        }
        stringBuffer.append(this.n);
    }

    private void a(StringBuffer stringBuffer, boolean[] zArr) {
        stringBuffer.append(this.k);
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.l);
            }
            stringBuffer.append(zArr[i]);
        }
        stringBuffer.append(this.n);
    }

    static void b(Object obj) {
        if (obj != null) {
            Map a = akmg.a();
            if (a != null) {
                a.remove(obj);
                if (a.isEmpty()) {
                    p.remove();
                }
            }
        }
    }

    private static boolean c(Object obj) {
        Map a = akmg.a();
        return a != null && a.containsKey(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        this.h = str;
    }

    /* Access modifiers changed, original: final */
    public final void a(StringBuffer stringBuffer) {
        stringBuffer.append(this.o);
    }

    public final void a(StringBuffer stringBuffer, String str) {
        if (this.c && str != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.q);
        }
    }

    public final void a(StringBuffer stringBuffer, String str, Object obj) {
        a(stringBuffer, str);
        if (obj == null) {
            a(stringBuffer);
        } else {
            a(stringBuffer, str, obj, this.s);
        }
        b(stringBuffer);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:77:0x0106 in {9, 15, 16, 17, 18, 22, 23, 27, 28, 32, 33, 37, 38, 42, 43, 47, 48, 52, 53, 57, 58, 62, 63, 67, 68, 70, 71, 73, 76} preds:[]
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
    final void a(java.lang.StringBuffer r2, java.lang.String r3, java.lang.Object r4, boolean r5) {
        /*
        r1 = this;
        r0 = defpackage.akmg.c(r4);
        if (r0 == 0) goto L_0x0016;
        r0 = r4 instanceof java.lang.Number;
        if (r0 != 0) goto L_0x0016;
        r0 = r4 instanceof java.lang.Boolean;
        if (r0 != 0) goto L_0x0016;
        r0 = r4 instanceof java.lang.Character;
        if (r0 != 0) goto L_0x0016;
        defpackage.aklu.a(r2, r4);
        return;
        defpackage.akmg.a(r4);
        r0 = r4 instanceof java.util.Collection;	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x0033;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x0027;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0101 }
        r2.append(r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.size();	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r0 = r4 instanceof java.util.Map;	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x0045;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x003d;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (java.util.Map) r3;	 Catch:{ all -> 0x0101 }
        goto L_0x0022;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (java.util.Map) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.size();	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        r0 = r4 instanceof long[];	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x0058;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x0053;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (long[]) r3;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (long[]) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.length;	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        r0 = r4 instanceof int[];	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x006b;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x0066;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (int[]) r3;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (int[]) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.length;	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        r0 = r4 instanceof short[];	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x007e;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x0079;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (short[]) r3;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (short[]) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.length;	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        r0 = r4 instanceof byte[];	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x0090;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x008b;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (byte[]) r3;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (byte[]) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.length;	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        r0 = r4 instanceof char[];	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x00a2;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x009d;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (char[]) r3;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (char[]) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.length;	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        r0 = r4 instanceof double[];	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x00b5;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x00af;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (double[]) r3;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (double[]) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.length;	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        r0 = r4 instanceof float[];	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x00c8;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x00c2;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (float[]) r3;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (float[]) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.length;	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        r0 = r4 instanceof boolean[];	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x00db;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x00d5;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (boolean[]) r3;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (boolean[]) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.length;	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        r0 = r4.getClass();	 Catch:{ all -> 0x0101 }
        r0 = r0.isArray();	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x00f4;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x00ee;	 Catch:{ all -> 0x0101 }
        r5 = r4;	 Catch:{ all -> 0x0101 }
        r5 = (java.lang.Object[]) r5;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r3, r5);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r3 = r4;	 Catch:{ all -> 0x0101 }
        r3 = (java.lang.Object[]) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.length;	 Catch:{ all -> 0x0101 }
        goto L_0x002e;	 Catch:{ all -> 0x0101 }
        if (r5 == 0) goto L_0x00fa;	 Catch:{ all -> 0x0101 }
        r2.append(r4);	 Catch:{ all -> 0x0101 }
        goto L_0x00fd;	 Catch:{ all -> 0x0101 }
        r1.a(r2, r4);	 Catch:{ all -> 0x0101 }
        defpackage.akmg.b(r4);
        return;
        r2 = move-exception;
        defpackage.akmg.b(r4);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akmg.a(java.lang.StringBuffer, java.lang.String, java.lang.Object, boolean):void");
    }

    public final void a(StringBuffer stringBuffer, String str, boolean z) {
        a(stringBuffer, str);
        stringBuffer.append(z);
        b(stringBuffer);
    }

    public final void b(StringBuffer stringBuffer) {
        stringBuffer.append(this.j);
    }
}
