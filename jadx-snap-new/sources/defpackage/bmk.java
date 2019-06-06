package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bmk */
final class bmk implements bmf {
    int[] b;
    private int c = -1;
    private int d = -1;
    private boolean e;
    private int[] f;
    private ByteBuffer g = a;
    private ByteBuffer h = a;
    private boolean i;

    public final void a(ByteBuffer byteBuffer) {
        byo.b(this.f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.c * 2)) * this.f.length) << 1;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i : this.f) {
                this.g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.c << 1;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    public final boolean a() {
        return this.e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x0056 in {3, 11, 14, 15, 23, 24, 25, 27, 28, 30} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final boolean a(int r6, int r7, int r8) {
        /*
        r5 = this;
        r0 = r5.b;
        r1 = r5.f;
        r0 = java.util.Arrays.equals(r0, r1);
        r1 = 1;
        r0 = r0 ^ r1;
        r2 = r5.b;
        r5.f = r2;
        r2 = r5.f;
        r3 = 0;
        if (r2 != 0) goto L_0x0016;
        r5.e = r3;
        return r0;
        r2 = 2;
        if (r8 != r2) goto L_0x0050;
        if (r0 != 0) goto L_0x0024;
        r0 = r5.d;
        if (r0 != r6) goto L_0x0024;
        r0 = r5.c;
        if (r0 != r7) goto L_0x0024;
        return r3;
        r5.d = r6;
        r5.c = r7;
        r0 = r5.f;
        r0 = r0.length;
        if (r7 == r0) goto L_0x002f;
        r0 = 1;
        goto L_0x0030;
        r0 = 0;
        r5.e = r0;
        r0 = 0;
        r2 = r5.f;
        r4 = r2.length;
        if (r0 >= r4) goto L_0x004f;
        r2 = r2[r0];
        if (r2 >= r7) goto L_0x0049;
        r4 = r5.e;
        if (r2 == r0) goto L_0x0042;
        r2 = 1;
        goto L_0x0043;
        r2 = 0;
        r2 = r2 | r4;
        r5.e = r2;
        r0 = r0 + 1;
        goto L_0x0033;
        r0 = new bmf$a;
        r0.<init>(r6, r7, r8);
        throw r0;
        return r1;
        r0 = new bmf$a;
        r0.<init>(r6, r7, r8);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmk.a(int, int, int):boolean");
    }

    public final int b() {
        int[] iArr = this.f;
        return iArr == null ? this.c : iArr.length;
    }

    public final int c() {
        return 2;
    }

    public final int d() {
        return this.d;
    }

    public final void e() {
        this.i = true;
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.h;
        this.h = a;
        return byteBuffer;
    }

    public final boolean g() {
        return this.i && this.h == a;
    }

    public final void h() {
        this.h = a;
        this.i = false;
    }

    public final void i() {
        h();
        this.g = a;
        this.c = -1;
        this.d = -1;
        this.f = null;
        this.b = null;
        this.e = false;
    }
}
