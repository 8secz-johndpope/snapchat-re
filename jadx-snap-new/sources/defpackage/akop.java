package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: akop */
public class akop<E> implements Iterable<E> {
    public static final /* synthetic */ boolean e = (akop.class.desiredAssertionStatus() ^ 1);
    public final List<E> a = new ArrayList();
    public int b;
    public int c;
    public boolean d;

    /* renamed from: akop$a */
    class a implements b<E> {
        private int a;
        private int b;
        private boolean c;

        private a() {
            r2.b++;
            this.a = akop.this.a.size();
        }

        /* synthetic */ a(akop akop, byte b) {
            this();
        }

        private void a() {
            if (!this.c) {
                this.c = true;
                akop.a(akop.this);
            }
        }

        public final boolean hasNext() {
            int i = this.b;
            while (i < this.a && akop.this.a.get(i) == null) {
                i++;
            }
            if (i < this.a) {
                return true;
            }
            a();
            return false;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x002f in {4, 8, 10} preds:[]
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
        public final E next() {
            /*
            r3 = this;
            r0 = r3.b;
            r1 = r3.a;
            if (r0 >= r1) goto L_0x0015;
            r1 = defpackage.akop.this;
            r0 = r1.a.get(r0);
            if (r0 != 0) goto L_0x0015;
            r0 = r3.b;
            r0 = r0 + 1;
            r3.b = r0;
            goto L_0x0000;
            r0 = r3.b;
            r1 = r3.a;
            if (r0 >= r1) goto L_0x0026;
            r1 = defpackage.akop.this;
            r2 = r0 + 1;
            r3.b = r2;
            r0 = r1.a.get(r0);
            return r0;
            r3.a();
            r0 = new java.util.NoSuchElementException;
            r0.<init>();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akop$a.next():java.lang.Object");
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: akop$b */
    public interface b extends Iterator {
    }

    private void a() {
        if (e || this.b == 0) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                if (this.a.get(size) == null) {
                    this.a.remove(size);
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public final boolean a(E e) {
        if (e == null || this.a.contains(e)) {
            return false;
        }
        boolean add = this.a.add(e);
        if (e || add) {
            this.c++;
            return true;
        }
        throw new AssertionError();
    }

    public Iterator<E> iterator() {
        return new a(this, (byte) 0);
    }
}
