package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: aiww */
public final class aiww extends aiwd {
    int a;
    private final Queue<aiyo> b = new ArrayDeque();

    /* renamed from: aiww$a */
    static abstract class a {
        int a;
        private IOException b;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public abstract int a(aiyo aiyo, int i);

        /* Access modifiers changed, original: final */
        public final boolean a() {
            return this.b != null;
        }

        /* Access modifiers changed, original: final */
        public final void b(aiyo aiyo, int i) {
            try {
                this.a = a(aiyo, i);
            } catch (IOException e) {
                this.b = e;
            }
        }
    }

    /* renamed from: aiww$1 */
    class 1 extends a {
        1() {
            super();
        }

        /* Access modifiers changed, original: final */
        public final int a(aiyo aiyo, int i) {
            return aiyo.c();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0045 in {2, 8, 9, 10, 12, 14} preds:[]
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
    private void a(defpackage.aiww.a r3, int r4) {
        /*
        r2 = this;
        r2.a(r4);
        r0 = r2.b;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x000c;
        goto L_0x0036;
        if (r4 <= 0) goto L_0x003a;
        r0 = r2.b;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x003a;
        r0 = r2.b;
        r0 = r0.peek();
        r0 = (defpackage.aiyo) r0;
        r1 = r0.b();
        r1 = java.lang.Math.min(r4, r1);
        r3.b(r0, r1);
        r0 = r3.a();
        if (r0 == 0) goto L_0x0030;
        return;
        r4 = r4 - r1;
        r0 = r2.a;
        r0 = r0 - r1;
        r2.a = r0;
        r2.d();
        goto L_0x000c;
        if (r4 > 0) goto L_0x003d;
        return;
        r3 = new java.lang.AssertionError;
        r4 = "Failed executing read operation";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiww.a(aiww$a, int):void");
    }

    private void d() {
        if (((aiyo) this.b.peek()).b() == 0) {
            ((aiyo) this.b.remove()).close();
        }
    }

    public final void a(aiyo aiyo) {
        if (aiyo instanceof aiww) {
            aiww aiww = (aiww) aiyo;
            while (!aiww.b.isEmpty()) {
                this.b.add((aiyo) aiww.b.remove());
            }
            this.a += aiww.a;
            aiww.a = 0;
            aiww.close();
            return;
        }
        this.b.add(aiyo);
        this.a += aiyo.b();
    }

    public final void a(final byte[] bArr, final int i, int i2) {
        a(new a() {
            private int b = i;

            public final int a(aiyo aiyo, int i) {
                aiyo.a(bArr, this.b, i);
                this.b += i;
                return 0;
            }
        }, i2);
    }

    public final int b() {
        return this.a;
    }

    /* renamed from: b */
    public final aiww c(int i) {
        a(i);
        this.a -= i;
        aiww aiww = new aiww();
        while (i > 0) {
            aiyo aiyo = (aiyo) this.b.peek();
            if (aiyo.b() > i) {
                aiww.a(aiyo.c(i));
                i = 0;
            } else {
                aiww.a((aiyo) this.b.poll());
                i -= aiyo.b();
            }
        }
        return aiww;
    }

    public final int c() {
        1 1 = new 1();
        a(1, 1);
        return 1.a;
    }

    public final void close() {
        while (!this.b.isEmpty()) {
            ((aiyo) this.b.remove()).close();
        }
    }
}
