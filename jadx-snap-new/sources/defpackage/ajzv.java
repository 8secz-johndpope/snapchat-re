package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: ajzv */
public final class ajzv {

    @akao(b = "SlidingWindow.kt", c = {26, 36, 44, 49, 55, 59}, d = "invokeSuspend", e = "kotlin/collections/SlidingWindowKt$windowedIterator$1")
    /* renamed from: ajzv$a */
    static final class a extends akar implements akbw<akfb<? super List<? extends T>>, akad<? super ajxw>, Object> {
        private akfb b;
        private Object c;
        private Object d;
        private Object e;
        private Object f;
        private int g;
        private int h;
        private int i;
        private /* synthetic */ int j;
        private /* synthetic */ int k;
        private /* synthetic */ Iterator l;
        private /* synthetic */ boolean m;
        private /* synthetic */ boolean n;

        a(int i, int i2, Iterator it, boolean z, boolean z2, akad akad) {
            this.j = i;
            this.k = i2;
            this.l = it;
            this.m = z;
            this.n = z2;
            super(akad);
        }

        public final akad<ajxw> a(Object obj, akad<?> akad) {
            akcr.b(akad, "completion");
            a aVar = new a(this.j, this.k, this.l, this.m, this.n, akad);
            aVar.b = (akfb) obj;
            return aVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:102:0x01be in {9, 11, 13, 16, 18, 21, 23, 26, 28, 31, 33, 38, 43, 48, 51, 52, 53, 59, 62, 63, 72, 73, 76, 77, 79, 82, 87, 88, 91, 92, 97, 99, 101} preds:[]
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
        public final java.lang.Object a(java.lang.Object r15) {
            /*
            r14 = this;
            r0 = defpackage.akah.COROUTINE_SUSPENDED;
            r1 = r14.i;
            r2 = 5;
            r3 = 4;
            r4 = 3;
            r5 = 2;
            r6 = 1;
            if (r1 == 0) goto L_0x007e;
            if (r1 == r6) goto L_0x0063;
            if (r1 == r5) goto L_0x0058;
            if (r1 == r4) goto L_0x003e;
            if (r1 == r3) goto L_0x0028;
            if (r1 != r2) goto L_0x0020;
            r0 = r15 instanceof defpackage.ajxn.b;
            if (r0 != 0) goto L_0x001b;
            goto L_0x01b6;
            r15 = (defpackage.ajxn.b) r15;
            r15 = r15.a;
            throw r15;
            r15 = new java.lang.IllegalStateException;
            r0 = "call to 'resume' before 'invoke' with coroutine";
            r15.<init>(r0);
            throw r15;
            r1 = r14.d;
            r1 = (defpackage.ajzq) r1;
            r4 = r14.g;
            r5 = r14.c;
            r5 = (defpackage.akfb) r5;
            r7 = r15 instanceof defpackage.ajxn.b;
            if (r7 != 0) goto L_0x0039;
            r15 = r14;
            goto L_0x0199;
            r15 = (defpackage.ajxn.b) r15;
            r15 = r15.a;
            throw r15;
            r1 = r14.f;
            r1 = (java.util.Iterator) r1;
            r5 = r14.d;
            r5 = (defpackage.ajzq) r5;
            r7 = r14.g;
            r8 = r14.c;
            r8 = (defpackage.akfb) r8;
            r9 = r15 instanceof defpackage.ajxn.b;
            if (r9 != 0) goto L_0x0053;
            r15 = r14;
            goto L_0x0159;
            r15 = (defpackage.ajxn.b) r15;
            r15 = r15.a;
            throw r15;
            r0 = r15 instanceof defpackage.ajxn.b;
            if (r0 != 0) goto L_0x005e;
            goto L_0x01b6;
            r15 = (defpackage.ajxn.b) r15;
            r15 = r15.a;
            throw r15;
            r1 = r14.f;
            r1 = (java.util.Iterator) r1;
            r2 = r14.d;
            r2 = (java.util.ArrayList) r2;
            r3 = r14.g;
            r4 = r14.c;
            r4 = (defpackage.akfb) r4;
            r7 = r15 instanceof defpackage.ajxn.b;
            if (r7 != 0) goto L_0x0079;
            r15 = r14;
            r7 = r0;
            r0 = r3;
            goto L_0x00c7;
            r15 = (defpackage.ajxn.b) r15;
            r15 = r15.a;
            throw r15;
            r1 = r15 instanceof defpackage.ajxn.b;
            if (r1 != 0) goto L_0x01b9;
            r15 = r14.b;
            r1 = r14.j;
            r7 = r14.k;
            r1 = r1 - r7;
            if (r1 < 0) goto L_0x00fd;
            r2 = new java.util.ArrayList;
            r2.<init>(r7);
            r3 = 0;
            r4 = r14.l;
            r7 = r0;
            r0 = r1;
            r1 = r4;
            r4 = r15;
            r15 = r14;
            r8 = r1.hasNext();
            if (r8 == 0) goto L_0x00d8;
            r8 = r1.next();
            if (r3 <= 0) goto L_0x00a7;
            r3 = r3 + -1;
            goto L_0x0098;
            r2.add(r8);
            r9 = r2.size();
            r10 = r15.k;
            if (r9 != r10) goto L_0x0098;
            r15.c = r4;
            r15.g = r0;
            r15.d = r2;
            r15.h = r3;
            r15.e = r8;
            r15.f = r1;
            r15.i = r6;
            r3 = r4.a(r2, r15);
            if (r3 != r7) goto L_0x00c7;
            return r7;
            r3 = r15.m;
            if (r3 == 0) goto L_0x00cf;
            r2.clear();
            goto L_0x00d6;
            r2 = new java.util.ArrayList;
            r3 = r15.k;
            r2.<init>(r3);
            r3 = r0;
            goto L_0x0098;
            r1 = r2;
            r1 = (java.util.Collection) r1;
            r1 = r1.isEmpty();
            r1 = r1 ^ r6;
            if (r1 == 0) goto L_0x01b6;
            r1 = r15.n;
            if (r1 != 0) goto L_0x00ee;
            r1 = r2.size();
            r6 = r15.k;
            if (r1 != r6) goto L_0x01b6;
            r15.g = r0;
            r15.c = r2;
            r15.h = r3;
            r15.i = r5;
            r15 = r4.a(r2, r15);
            if (r15 != r7) goto L_0x01b6;
            return r7;
            r5 = new ajzq;
            r5.<init>(r7);
            r7 = r14.l;
            r8 = r15;
            r15 = r14;
            r13 = r7;
            r7 = r1;
            r1 = r13;
            r9 = r1.hasNext();
            if (r9 == 0) goto L_0x0169;
            r9 = r1.next();
            r10 = r5.b();
            if (r10 != 0) goto L_0x015f;
            r10 = r5.a;
            r11 = r5.b;
            r12 = r5.size();
            r11 = r11 + r12;
            r12 = r5.d;
            r11 = r11 % r12;
            r10[r11] = r9;
            r10 = r5.size();
            r10 = r10 + r6;
            r5.c = r10;
            r10 = r5.b();
            if (r10 == 0) goto L_0x0109;
            r10 = r15.m;
            if (r10 == 0) goto L_0x013c;
            r10 = r5;
            r10 = (java.util.List) r10;
            goto L_0x0146;
            r10 = new java.util.ArrayList;
            r11 = r5;
            r11 = (java.util.Collection) r11;
            r10.<init>(r11);
            r10 = (java.util.List) r10;
            r15.c = r8;
            r15.g = r7;
            r15.d = r5;
            r15.e = r9;
            r15.f = r1;
            r15.i = r4;
            r9 = r8.a(r10, r15);
            if (r9 != r0) goto L_0x0159;
            return r0;
            r9 = r15.j;
            r5.a(r9);
            goto L_0x0109;
            r15 = new java.lang.IllegalStateException;
            r0 = "ring buffer is full";
            r15.<init>(r0);
            r15 = (java.lang.Throwable) r15;
            throw r15;
            r1 = r15.n;
            if (r1 == 0) goto L_0x01b6;
            r1 = r5;
            r4 = r7;
            r5 = r8;
            r7 = r1.size();
            r8 = r15.j;
            if (r7 <= r8) goto L_0x019f;
            r7 = r15.m;
            if (r7 == 0) goto L_0x0180;
            r7 = r1;
            r7 = (java.util.List) r7;
            goto L_0x018a;
            r7 = new java.util.ArrayList;
            r8 = r1;
            r8 = (java.util.Collection) r8;
            r7.<init>(r8);
            r7 = (java.util.List) r7;
            r15.c = r5;
            r15.g = r4;
            r15.d = r1;
            r15.i = r3;
            r7 = r5.a(r7, r15);
            if (r7 != r0) goto L_0x0199;
            return r0;
            r7 = r15.j;
            r1.a(r7);
            goto L_0x0170;
            r3 = r1;
            r3 = (java.util.Collection) r3;
            r3 = r3.isEmpty();
            r3 = r3 ^ r6;
            if (r3 == 0) goto L_0x01b6;
            r15.g = r4;
            r15.c = r1;
            r15.i = r2;
            r15 = r5.a(r1, r15);
            if (r15 != r0) goto L_0x01b6;
            return r0;
            r15 = defpackage.ajxw.a;
            return r15;
            r15 = (defpackage.ajxn.b) r15;
            r15 = r15.a;
            throw r15;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzv$a.a(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) a(obj, (akad) obj2)).a(ajxw.a);
        }
    }

    public static final <T> Iterator<List<T>> a(Iterator<? extends T> it, int i, int i2, boolean z) {
        akcr.b(it, "iterator");
        return !it.hasNext() ? ajyv.a : akfd.a(new a(i2, i, it, z, true, null));
    }

    public static final void a(int i, int i2) {
        Object obj = (i <= 0 || i2 <= 0) ? null : 1;
        if (obj == null) {
            Object stringBuilder;
            String str = " must be greater than zero.";
            if (i != i2) {
                StringBuilder stringBuilder2 = new StringBuilder("Both size ");
                stringBuilder2.append(i);
                stringBuilder2.append(" and step ");
                stringBuilder2.append(i2);
                stringBuilder2.append(str);
                stringBuilder = stringBuilder2.toString();
            } else {
                StringBuilder stringBuilder3 = new StringBuilder("size ");
                stringBuilder3.append(i);
                stringBuilder3.append(str);
                stringBuilder = stringBuilder3.toString();
            }
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
