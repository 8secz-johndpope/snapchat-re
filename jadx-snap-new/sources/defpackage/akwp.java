package defpackage;

import defpackage.akhp.b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;

/* renamed from: akwp */
abstract class akwp<T> {

    /* renamed from: akwp$a */
    static final class a<T> extends akwp<T> {
        private final akwk<T, akhu> a;

        a(akwk<T, akhu> akwk) {
            this.a = akwk;
        }

        /* Access modifiers changed, original: final */
        public final void a(akwr akwr, T t) {
            if (t != null) {
                try {
                    akwr.c = (akhu) this.a.a(t);
                    return;
                } catch (IOException e) {
                    StringBuilder stringBuilder = new StringBuilder("Unable to convert ");
                    stringBuilder.append(t);
                    stringBuilder.append(" to RequestBody");
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
            throw new IllegalArgumentException("Body parameter value must not be null.");
        }
    }

    /* renamed from: akwp$d */
    static final class d<T> extends akwp<T> {
        private final String a;
        private final akwk<T, String> b;

        d(String str, akwk<T, String> akwk) {
            this.a = (String) akwv.a((Object) str, "name == null");
            this.b = akwk;
        }

        /* Access modifiers changed, original: final */
        public final void a(akwr akwr, T t) {
            if (t != null) {
                String str = (String) this.b.a(t);
                if (str != null) {
                    akwr.a(this.a, str);
                }
            }
        }
    }

    /* renamed from: akwp$m */
    static final class m extends akwp<Object> {
        m() {
        }

        /* Access modifiers changed, original: final */
        public final void a(akwr akwr, Object obj) {
            akwv.a(obj, "@Url parameter is null.");
            akwr.a = obj.toString();
        }
    }

    /* renamed from: akwp$e */
    static final class e<T> extends akwp<Map<String, T>> {
        private final akwk<T, String> a;

        e(akwk<T, String> akwk) {
            this.a = akwk;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x005c in {9, 11, 13, 14, 16} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final /* synthetic */ void a(defpackage.akwr r4, java.lang.Object r5) {
            /*
            r3 = this;
            r5 = (java.util.Map) r5;
            if (r5 == 0) goto L_0x0054;
            r5 = r5.entrySet();
            r5 = r5.iterator();
            r0 = r5.hasNext();
            if (r0 == 0) goto L_0x0053;
            r0 = r5.next();
            r0 = (java.util.Map.Entry) r0;
            r1 = r0.getKey();
            r1 = (java.lang.String) r1;
            if (r1 == 0) goto L_0x004b;
            r0 = r0.getValue();
            if (r0 == 0) goto L_0x0032;
            r2 = r3.a;
            r0 = r2.a(r0);
            r0 = (java.lang.String) r0;
            r4.a(r1, r0);
            goto L_0x000c;
            r4 = new java.lang.IllegalArgumentException;
            r5 = new java.lang.StringBuilder;
            r0 = "Header map contained null value for key '";
            r5.<init>(r0);
            r5.append(r1);
            r0 = "'.";
            r5.append(r0);
            r5 = r5.toString();
            r4.<init>(r5);
            throw r4;
            r4 = new java.lang.IllegalArgumentException;
            r5 = "Header map contained null key.";
            r4.<init>(r5);
            throw r4;
            return;
            r4 = new java.lang.IllegalArgumentException;
            r5 = "Header map was null.";
            r4.<init>(r5);
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akwp$e.a(akwr, java.lang.Object):void");
        }
    }

    /* renamed from: akwp$1 */
    class 1 extends akwp<Iterable<T>> {
        1() {
        }

        /* Access modifiers changed, original: final|synthetic */
        public final /* synthetic */ void a(akwr akwr, Object obj) {
            Iterable<Object> iterable = (Iterable) obj;
            if (iterable != null) {
                for (Object a : iterable) {
                    akwp.this.a(akwr, a);
                }
            }
        }
    }

    /* renamed from: akwp$2 */
    class 2 extends akwp<Object> {
        2() {
        }

        /* Access modifiers changed, original: final */
        public final void a(akwr akwr, Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    akwp.this.a(akwr, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: akwp$b */
    static final class b<T> extends akwp<T> {
        private final String a;
        private final akwk<T, String> b;
        private final boolean c;

        b(String str, akwk<T, String> akwk, boolean z) {
            this.a = (String) akwv.a((Object) str, "name == null");
            this.b = akwk;
            this.c = z;
        }

        /* Access modifiers changed, original: final */
        public final void a(akwr akwr, T t) {
            if (t != null) {
                String str = (String) this.b.a(t);
                if (str != null) {
                    akwr.b(this.a, str, this.c);
                }
            }
        }
    }

    /* renamed from: akwp$c */
    static final class c<T> extends akwp<Map<String, T>> {
        private final akwk<T, String> a;
        private final boolean b;

        c(akwk<T, String> akwk, boolean z) {
            this.a = akwk;
            this.b = z;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0091 in {11, 13, 15, 17, 18, 20} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final /* synthetic */ void a(defpackage.akwr r5, java.lang.Object r6) {
            /*
            r4 = this;
            r6 = (java.util.Map) r6;
            if (r6 == 0) goto L_0x0089;
            r6 = r6.entrySet();
            r6 = r6.iterator();
            r0 = r6.hasNext();
            if (r0 == 0) goto L_0x0088;
            r0 = r6.next();
            r0 = (java.util.Map.Entry) r0;
            r1 = r0.getKey();
            r1 = (java.lang.String) r1;
            if (r1 == 0) goto L_0x0080;
            r0 = r0.getValue();
            r2 = "'.";
            if (r0 == 0) goto L_0x0069;
            r3 = r4.a;
            r3 = r3.a(r0);
            r3 = (java.lang.String) r3;
            if (r3 == 0) goto L_0x0038;
            r0 = r4.b;
            r5.b(r1, r3, r0);
            goto L_0x000c;
            r5 = new java.lang.IllegalArgumentException;
            r6 = new java.lang.StringBuilder;
            r3 = "Field map value '";
            r6.<init>(r3);
            r6.append(r0);
            r0 = "' converted to null by ";
            r6.append(r0);
            r0 = r4.a;
            r0 = r0.getClass();
            r0 = r0.getName();
            r6.append(r0);
            r0 = " for key '";
            r6.append(r0);
            r6.append(r1);
            r6.append(r2);
            r6 = r6.toString();
            r5.<init>(r6);
            throw r5;
            r5 = new java.lang.IllegalArgumentException;
            r6 = new java.lang.StringBuilder;
            r0 = "Field map contained null value for key '";
            r6.<init>(r0);
            r6.append(r1);
            r6.append(r2);
            r6 = r6.toString();
            r5.<init>(r6);
            throw r5;
            r5 = new java.lang.IllegalArgumentException;
            r6 = "Field map contained null key.";
            r5.<init>(r6);
            throw r5;
            return;
            r5 = new java.lang.IllegalArgumentException;
            r6 = "Field map was null.";
            r5.<init>(r6);
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akwp$c.a(akwr, java.lang.Object):void");
        }
    }

    /* renamed from: akwp$f */
    static final class f<T> extends akwp<T> {
        private final akhl a;
        private final akwk<T, akhu> b;

        f(akhl akhl, akwk<T, akhu> akwk) {
            this.a = akhl;
            this.b = akwk;
        }

        /* Access modifiers changed, original: final */
        public final void a(akwr akwr, T t) {
            if (t != null) {
                try {
                    akwr.a(this.a, (akhu) this.b.a(t));
                } catch (IOException e) {
                    StringBuilder stringBuilder = new StringBuilder("Unable to convert ");
                    stringBuilder.append(t);
                    stringBuilder.append(" to RequestBody");
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
        }
    }

    /* renamed from: akwp$g */
    static final class g<T> extends akwp<Map<String, T>> {
        private final akwk<T, akhu> a;
        private final String b;

        g(akwk<T, akhu> akwk, String str) {
            this.a = akwk;
            this.b = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0088 in {9, 11, 13, 14, 16} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final /* synthetic */ void a(defpackage.akwr r7, java.lang.Object r8) {
            /*
            r6 = this;
            r8 = (java.util.Map) r8;
            if (r8 == 0) goto L_0x0080;
            r8 = r8.entrySet();
            r8 = r8.iterator();
            r0 = r8.hasNext();
            if (r0 == 0) goto L_0x007f;
            r0 = r8.next();
            r0 = (java.util.Map.Entry) r0;
            r1 = r0.getKey();
            r1 = (java.lang.String) r1;
            if (r1 == 0) goto L_0x0077;
            r0 = r0.getValue();
            if (r0 == 0) goto L_0x005e;
            r2 = 4;
            r2 = new java.lang.String[r2];
            r3 = 0;
            r4 = "Content-Disposition";
            r2[r3] = r4;
            r3 = 1;
            r4 = new java.lang.StringBuilder;
            r5 = "form-data; name=\"";
            r4.<init>(r5);
            r4.append(r1);
            r1 = "\"";
            r4.append(r1);
            r1 = r4.toString();
            r2[r3] = r1;
            r1 = 2;
            r3 = "Content-Transfer-Encoding";
            r2[r1] = r3;
            r1 = 3;
            r3 = r6.b;
            r2[r1] = r3;
            r1 = defpackage.akhl.a(r2);
            r2 = r6.a;
            r0 = r2.a(r0);
            r0 = (defpackage.akhu) r0;
            r7.a(r1, r0);
            goto L_0x000c;
            r7 = new java.lang.IllegalArgumentException;
            r8 = new java.lang.StringBuilder;
            r0 = "Part map contained null value for key '";
            r8.<init>(r0);
            r8.append(r1);
            r0 = "'.";
            r8.append(r0);
            r8 = r8.toString();
            r7.<init>(r8);
            throw r7;
            r7 = new java.lang.IllegalArgumentException;
            r8 = "Part map contained null key.";
            r7.<init>(r8);
            throw r7;
            return;
            r7 = new java.lang.IllegalArgumentException;
            r8 = "Part map was null.";
            r7.<init>(r8);
            throw r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akwp$g.a(akwr, java.lang.Object):void");
        }
    }

    /* renamed from: akwp$h */
    static final class h<T> extends akwp<T> {
        private final String a;
        private final akwk<T, String> b;
        private final boolean c;

        h(String str, akwk<T, String> akwk, boolean z) {
            this.a = (String) akwv.a((Object) str, "name == null");
            this.b = akwk;
            this.c = z;
        }

        /* Access modifiers changed, original: final */
        public final void a(akwr akwr, T t) {
            if (t != null) {
                String str = this.a;
                String str2 = (String) this.b.a(t);
                boolean z = this.c;
                if (akwr.a != null) {
                    String str3 = akwr.a;
                    StringBuilder stringBuilder = new StringBuilder("{");
                    stringBuilder.append(str);
                    stringBuilder.append("}");
                    akwr.a = str3.replace(stringBuilder.toString(), akwr.a(str2, z));
                    return;
                }
                throw new AssertionError();
            }
            StringBuilder stringBuilder2 = new StringBuilder("Path parameter \"");
            stringBuilder2.append(this.a);
            stringBuilder2.append("\" value must not be null.");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: akwp$i */
    static final class i<T> extends akwp<T> {
        private final String a;
        private final akwk<T, String> b;
        private final boolean c;

        i(String str, akwk<T, String> akwk, boolean z) {
            this.a = (String) akwv.a((Object) str, "name == null");
            this.b = akwk;
            this.c = z;
        }

        /* Access modifiers changed, original: final */
        public final void a(akwr akwr, T t) {
            if (t != null) {
                String str = (String) this.b.a(t);
                if (str != null) {
                    akwr.a(this.a, str, this.c);
                }
            }
        }
    }

    /* renamed from: akwp$j */
    static final class j<T> extends akwp<Map<String, T>> {
        private final akwk<T, String> a;
        private final boolean b;

        j(akwk<T, String> akwk, boolean z) {
            this.a = akwk;
            this.b = z;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0091 in {11, 13, 15, 17, 18, 20} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final /* synthetic */ void a(defpackage.akwr r5, java.lang.Object r6) {
            /*
            r4 = this;
            r6 = (java.util.Map) r6;
            if (r6 == 0) goto L_0x0089;
            r6 = r6.entrySet();
            r6 = r6.iterator();
            r0 = r6.hasNext();
            if (r0 == 0) goto L_0x0088;
            r0 = r6.next();
            r0 = (java.util.Map.Entry) r0;
            r1 = r0.getKey();
            r1 = (java.lang.String) r1;
            if (r1 == 0) goto L_0x0080;
            r0 = r0.getValue();
            r2 = "'.";
            if (r0 == 0) goto L_0x0069;
            r3 = r4.a;
            r3 = r3.a(r0);
            r3 = (java.lang.String) r3;
            if (r3 == 0) goto L_0x0038;
            r0 = r4.b;
            r5.a(r1, r3, r0);
            goto L_0x000c;
            r5 = new java.lang.IllegalArgumentException;
            r6 = new java.lang.StringBuilder;
            r3 = "Query map value '";
            r6.<init>(r3);
            r6.append(r0);
            r0 = "' converted to null by ";
            r6.append(r0);
            r0 = r4.a;
            r0 = r0.getClass();
            r0 = r0.getName();
            r6.append(r0);
            r0 = " for key '";
            r6.append(r0);
            r6.append(r1);
            r6.append(r2);
            r6 = r6.toString();
            r5.<init>(r6);
            throw r5;
            r5 = new java.lang.IllegalArgumentException;
            r6 = new java.lang.StringBuilder;
            r0 = "Query map contained null value for key '";
            r6.<init>(r0);
            r6.append(r1);
            r6.append(r2);
            r6 = r6.toString();
            r5.<init>(r6);
            throw r5;
            r5 = new java.lang.IllegalArgumentException;
            r6 = "Query map contained null key.";
            r5.<init>(r6);
            throw r5;
            return;
            r5 = new java.lang.IllegalArgumentException;
            r6 = "Query map was null.";
            r5.<init>(r6);
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akwp$j.a(akwr, java.lang.Object):void");
        }
    }

    /* renamed from: akwp$k */
    static final class k<T> extends akwp<T> {
        private final akwk<T, String> a;
        private final boolean b;

        k(akwk<T, String> akwk, boolean z) {
            this.a = akwk;
            this.b = z;
        }

        /* Access modifiers changed, original: final */
        public final void a(akwr akwr, T t) {
            if (t != null) {
                akwr.a((String) this.a.a(t), null, this.b);
            }
        }
    }

    /* renamed from: akwp$l */
    static final class l extends akwp<b> {
        static final l a = new l();

        private l() {
        }

        /* Access modifiers changed, original: final|bridge|synthetic */
        public final /* bridge */ /* synthetic */ void a(akwr akwr, Object obj) {
            b bVar = (b) obj;
            if (bVar != null) {
                akwr.b.a(bVar);
            }
        }
    }

    akwp() {
    }

    /* Access modifiers changed, original: final */
    public final akwp<Iterable<T>> a() {
        return new 1();
    }

    public abstract void a(akwr akwr, T t);

    /* Access modifiers changed, original: final */
    public final akwp<Object> b() {
        return new 2();
    }
}
