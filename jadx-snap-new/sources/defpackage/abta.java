package defpackage;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;
import com.google.common.collect.Table.Cell;
import com.google.common.collect.UnmodifiableIterator;
import defpackage.absz.a;

/* renamed from: abta */
public final class abta<S> implements absz<S> {
    public final ajwl<S> a;
    private final ImmutableTable<S, a<S, ?>, c<S, ?>> b;
    private final Thread c;
    private final String d;

    /* renamed from: abta$a */
    public static class a<S> {
        private final Builder<S, defpackage.absz.a<S, ?>, c<S, ?>> a;
        private final ajwl<S> b;
        private Thread c;
        private final a d;

        private a(S s, a aVar) {
            this.a = ImmutableTable.builder();
            this.b = ajwl.i(s);
            this.d = aVar;
        }

        /* synthetic */ a(Object obj, a aVar, byte b) {
            this(obj, aVar);
        }

        public final a<S> a(Thread thread) {
            if (this.c == null) {
                this.c = thread;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder("Can't put state machine on thread ");
            stringBuilder.append(this.c);
            stringBuilder.append(", already on thread ");
            stringBuilder.append(this.c);
            throw new IllegalStateException(stringBuilder.toString());
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0042 in {3, 6, 8} preds:[]
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
        public final <P> defpackage.abta.b<P> a(java.lang.Iterable<S> r7, defpackage.absz.a<S, P> r8, S r9) {
            /*
            r6 = this;
            r0 = new ajwo;
            r0.<init>();
            r1 = r7.iterator();
            r2 = 0;
            r3 = r1.hasNext();
            if (r3 == 0) goto L_0x0021;
            r2 = r1.next();
            r3 = 1;
            r4 = r6.a;
            r5 = new abta$c;
            r5.<init>(r9, r0);
            r4.put(r2, r8, r5);
            r2 = 1;
            goto L_0x000a;
            if (r2 == 0) goto L_0x002b;
            r7 = new abta$b;
            r8 = r6.d;
            r7.<init>(r0, r8);
            return r7;
            r8 = new java.lang.IllegalArgumentException;
            r9 = new java.lang.StringBuilder;
            r9.<init>();
            r9.append(r7);
            r7 = " is empty";
            r9.append(r7);
            r7 = r9.toString();
            r8.<init>(r7);
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abta$a.a(java.lang.Iterable, absz$a, java.lang.Object):abta$b");
        }

        public final <P> b<P> a(S s, defpackage.absz.a<S, P> aVar, S s2) {
            ajwo ajwo = new ajwo();
            this.a.put(s, aVar, new c(s2, ajwo));
            return new b(ajwo, this.d);
        }

        public final abta<S> a(String str) {
            return new abta(this.a.build(), this.b, this.c, str, (byte) 0);
        }

        public final ajdp<S> a() {
            return this.b;
        }
    }

    /* renamed from: abta$c */
    static class c<S, P> {
        final S a;
        final ajwo<P> b;

        c(S s, ajwo<P> ajwo) {
            this.a = s;
            this.b = ajwo;
        }
    }

    /* renamed from: abta$b */
    public static class b<P> {
        private final ajdp<P> a;
        private final a b;

        /* renamed from: abta$b$a */
        public interface a {
            void register(ajej ajej);
        }

        public b(ajdp<P> ajdp, a aVar) {
            this.a = ajdp;
            this.b = aVar;
        }

        public final void a(ajfb<P> ajfb) {
            this.b.register(this.a.f((ajfb) ajfb));
        }

        public final void a(Runnable runnable) {
            this.b.register(this.a.f(new -$$Lambda$abta$b$An-7I_fGv1M5CAoKRS2sPGig0mc(runnable)));
        }
    }

    private abta(ImmutableTable<S, a<S, ?>, c<S, ?>> immutableTable, ajwl<S> ajwl, Thread thread, String str) {
        this.b = immutableTable;
        this.a = ajwl;
        this.c = thread;
        this.d = str;
    }

    /* synthetic */ abta(ImmutableTable immutableTable, ajwl ajwl, Thread thread, String str, byte b) {
        this(immutableTable, ajwl, thread, str);
    }

    public static <S> a<S> a(S s, a aVar) {
        return new a(s, aVar, (byte) 0);
    }

    public static <S> a<S> a(S s, ajei ajei) {
        ajei.getClass();
        return new a(s, new -$$Lambda$mel42v5AXbZcvAypz7TBWMcjMnk(ajei), (byte) 0);
    }

    public final S a() {
        return this.a.p();
    }

    public final boolean a(a<S, absy> aVar) {
        return b(aVar, absy.VOID);
    }

    public final <P> boolean a(a<S, P> aVar, P p) {
        return b(aVar, p);
    }

    public final boolean b(a<S, absy> aVar) {
        return b(aVar, absy.VOID);
    }

    public final <P> boolean b(a<S, P> aVar, P p) {
        Thread thread = this.c;
        if (thread == null || thread.equals(Thread.currentThread())) {
            c cVar = (c) this.b.get(this.a.p(), aVar);
            if (cVar == null) {
                return false;
            }
            this.a.a(cVar.a);
            cVar.b.a((Object) p);
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder("State machine is bound to thread ");
        stringBuilder.append(this.c);
        stringBuilder.append(", can't be run on thread ");
        stringBuilder.append(Thread.currentThread());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("digraph statemachine {\n");
        stringBuilder.append("\tedge[fontsize=10]\n");
        UnmodifiableIterator it = this.b.cellSet().iterator();
        while (it.hasNext()) {
            Cell cell = (Cell) it.next();
            stringBuilder.append(String.format("\t%s -> %s [label=%s];\n", new Object[]{cell.getRowKey(), ((c) cell.getValue()).a, cell.getColumnKey()}));
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
