package defpackage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: oj */
public final class oj implements Runnable {
    public static final ThreadLocal<oj> a = new ThreadLocal();
    private static Comparator<b> f = new 1();
    public ArrayList<RecyclerView> b = new ArrayList();
    public long c;
    private long d;
    private ArrayList<b> e = new ArrayList();

    /* renamed from: oj$a */
    public static class a implements LayoutPrefetchRegistry {
        int a;
        int b;
        int[] c;
        int d;

        public final void a() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        /* Access modifiers changed, original: final */
        public final void a(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && layoutManager != null && layoutManager.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.d()) {
                        layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    layoutManager.collectAdjacentPrefetchPositions(this.a, this.b, recyclerView.mState, this);
                }
                if (this.d > layoutManager.mPrefetchMaxCountObserved) {
                    layoutManager.mPrefetchMaxCountObserved = this.d;
                    layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.mRecycler.updateViewCacheSize();
                }
            }
        }

        public final boolean a(int i) {
            if (this.c != null) {
                int i2 = this.d << 1;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final void addPosition(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.d << 1;
                int[] iArr = this.c;
                if (iArr == null) {
                    this.c = new int[4];
                    Arrays.fill(this.c, -1);
                } else if (i3 >= iArr.length) {
                    this.c = new int[(i3 << 1)];
                    System.arraycopy(iArr, 0, this.c, 0, iArr.length);
                }
                iArr = this.c;
                iArr[i3] = i;
                iArr[i3 + 1] = i2;
                this.d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }
    }

    /* renamed from: oj$1 */
    static class 1 implements Comparator<b> {
        1() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            b bVar = (b) obj;
            b bVar2 = (b) obj2;
            if ((bVar.d == null ? 1 : null) != (bVar2.d == null ? 1 : null)) {
                return bVar.d == null ? 1 : -1;
            } else {
                if (bVar.a != bVar2.a) {
                    return bVar.a ? -1 : 1;
                } else {
                    int i = bVar2.b - bVar.b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = bVar.c - bVar2.c;
                    return i2 != 0 ? i2 : 0;
                }
            }
        }
    }

    /* renamed from: oj$b */
    static class b {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        b() {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0051 in {6, 7, 8, 11, 20, 21, 23, 26} preds:[]
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
    private static android.support.v7.widget.RecyclerView.ViewHolder a(android.support.v7.widget.RecyclerView r5, int r6, long r7) {
        /*
        r0 = r5.mChildHelper;
        r0 = r0.b();
        r1 = 0;
        r2 = 0;
        if (r2 >= r0) goto L_0x0023;
        r3 = r5.mChildHelper;
        r3 = r3.c(r2);
        r3 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r3);
        r4 = r3.mPosition;
        if (r4 != r6) goto L_0x0020;
        r3 = r3.isInvalid();
        if (r3 != 0) goto L_0x0020;
        r0 = 1;
        goto L_0x0024;
        r2 = r2 + 1;
        goto L_0x0008;
        r0 = 0;
        if (r0 == 0) goto L_0x0028;
        r5 = 0;
        return r5;
        r0 = r5.mRecycler;
        r5.onEnterLayoutOrScroll();	 Catch:{ all -> 0x004c }
        r6 = r0.tryGetViewHolderForPositionByDeadline(r6, r1, r7);	 Catch:{ all -> 0x004c }
        if (r6 == 0) goto L_0x0048;	 Catch:{ all -> 0x004c }
        r7 = r6.isBound();	 Catch:{ all -> 0x004c }
        if (r7 == 0) goto L_0x0045;	 Catch:{ all -> 0x004c }
        r7 = r6.isInvalid();	 Catch:{ all -> 0x004c }
        if (r7 != 0) goto L_0x0045;	 Catch:{ all -> 0x004c }
        r7 = r6.itemView;	 Catch:{ all -> 0x004c }
        r0.recycleView(r7);	 Catch:{ all -> 0x004c }
        goto L_0x0048;	 Catch:{ all -> 0x004c }
        r0.addViewHolderToRecycledViewPool(r6, r1);	 Catch:{ all -> 0x004c }
        r5.onExitLayoutOrScroll(r1);
        return r6;
        r6 = move-exception;
        r5.onExitLayoutOrScroll(r1);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj.a(android.support.v7.widget.RecyclerView, int, long):android.support.v7.widget.RecyclerView$ViewHolder");
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.d == 0) {
            this.d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        a aVar = recyclerView.mPrefetchRegistry;
        aVar.a = i;
        aVar.b = i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:87:0x0183 in {5, 11, 12, 15, 20, 21, 32, 33, 36, 37, 39, 40, 41, 49, 50, 65, 73, 75, 78, 80, 81, 83, 84, 86} preds:[]
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
    public final void run() {
        /*
        r17 = this;
        r1 = r17;
        r2 = 0;
        r0 = "RV Prefetch";	 Catch:{ all -> 0x017c }
        defpackage.in.a(r0);	 Catch:{ all -> 0x017c }
        r0 = r1.b;	 Catch:{ all -> 0x017c }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x017c }
        if (r0 == 0) goto L_0x0017;
        r1.d = r2;
        defpackage.in.a();
        return;
        r0 = r1.b;	 Catch:{ all -> 0x017c }
        r0 = r0.size();	 Catch:{ all -> 0x017c }
        r4 = 0;	 Catch:{ all -> 0x017c }
        r6 = r2;	 Catch:{ all -> 0x017c }
        r5 = 0;	 Catch:{ all -> 0x017c }
        if (r5 >= r0) goto L_0x003b;	 Catch:{ all -> 0x017c }
        r8 = r1.b;	 Catch:{ all -> 0x017c }
        r8 = r8.get(r5);	 Catch:{ all -> 0x017c }
        r8 = (android.support.v7.widget.RecyclerView) r8;	 Catch:{ all -> 0x017c }
        r9 = r8.getWindowVisibility();	 Catch:{ all -> 0x017c }
        if (r9 != 0) goto L_0x0038;	 Catch:{ all -> 0x017c }
        r8 = r8.getDrawingTime();	 Catch:{ all -> 0x017c }
        r6 = java.lang.Math.max(r8, r6);	 Catch:{ all -> 0x017c }
        r5 = r5 + 1;	 Catch:{ all -> 0x017c }
        goto L_0x0020;	 Catch:{ all -> 0x017c }
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));	 Catch:{ all -> 0x017c }
        if (r0 != 0) goto L_0x0040;	 Catch:{ all -> 0x017c }
        goto L_0x0011;	 Catch:{ all -> 0x017c }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x017c }
        r5 = r0.toNanos(r6);	 Catch:{ all -> 0x017c }
        r7 = r1.c;	 Catch:{ all -> 0x017c }
        r5 = r5 + r7;	 Catch:{ all -> 0x017c }
        r0 = r1.b;	 Catch:{ all -> 0x017c }
        r0 = r0.size();	 Catch:{ all -> 0x017c }
        r7 = 0;	 Catch:{ all -> 0x017c }
        r8 = 0;	 Catch:{ all -> 0x017c }
        if (r7 >= r0) goto L_0x006e;	 Catch:{ all -> 0x017c }
        r9 = r1.b;	 Catch:{ all -> 0x017c }
        r9 = r9.get(r7);	 Catch:{ all -> 0x017c }
        r9 = (android.support.v7.widget.RecyclerView) r9;	 Catch:{ all -> 0x017c }
        r10 = r9.getWindowVisibility();	 Catch:{ all -> 0x017c }
        if (r10 != 0) goto L_0x006b;	 Catch:{ all -> 0x017c }
        r10 = r9.mPrefetchRegistry;	 Catch:{ all -> 0x017c }
        r10.a(r9, r4);	 Catch:{ all -> 0x017c }
        r9 = r9.mPrefetchRegistry;	 Catch:{ all -> 0x017c }
        r9 = r9.d;	 Catch:{ all -> 0x017c }
        r8 = r8 + r9;	 Catch:{ all -> 0x017c }
        r7 = r7 + 1;	 Catch:{ all -> 0x017c }
        goto L_0x0051;	 Catch:{ all -> 0x017c }
        r7 = r1.e;	 Catch:{ all -> 0x017c }
        r7.ensureCapacity(r8);	 Catch:{ all -> 0x017c }
        r7 = 0;	 Catch:{ all -> 0x017c }
        r8 = 0;	 Catch:{ all -> 0x017c }
        r9 = 1;	 Catch:{ all -> 0x017c }
        if (r7 >= r0) goto L_0x00dd;	 Catch:{ all -> 0x017c }
        r10 = r1.b;	 Catch:{ all -> 0x017c }
        r10 = r10.get(r7);	 Catch:{ all -> 0x017c }
        r10 = (android.support.v7.widget.RecyclerView) r10;	 Catch:{ all -> 0x017c }
        r11 = r10.getWindowVisibility();	 Catch:{ all -> 0x017c }
        if (r11 != 0) goto L_0x00d8;	 Catch:{ all -> 0x017c }
        r11 = r10.mPrefetchRegistry;	 Catch:{ all -> 0x017c }
        r12 = r11.a;	 Catch:{ all -> 0x017c }
        r12 = java.lang.Math.abs(r12);	 Catch:{ all -> 0x017c }
        r13 = r11.b;	 Catch:{ all -> 0x017c }
        r13 = java.lang.Math.abs(r13);	 Catch:{ all -> 0x017c }
        r12 = r12 + r13;	 Catch:{ all -> 0x017c }
        r13 = r8;	 Catch:{ all -> 0x017c }
        r8 = 0;	 Catch:{ all -> 0x017c }
        r14 = r11.d;	 Catch:{ all -> 0x017c }
        r14 = r14 << r9;	 Catch:{ all -> 0x017c }
        if (r8 >= r14) goto L_0x00d7;	 Catch:{ all -> 0x017c }
        r14 = r1.e;	 Catch:{ all -> 0x017c }
        r14 = r14.size();	 Catch:{ all -> 0x017c }
        if (r13 < r14) goto L_0x00af;	 Catch:{ all -> 0x017c }
        r14 = new oj$b;	 Catch:{ all -> 0x017c }
        r14.<init>();	 Catch:{ all -> 0x017c }
        r15 = r1.e;	 Catch:{ all -> 0x017c }
        r15.add(r14);	 Catch:{ all -> 0x017c }
        goto L_0x00b7;	 Catch:{ all -> 0x017c }
        r14 = r1.e;	 Catch:{ all -> 0x017c }
        r14 = r14.get(r13);	 Catch:{ all -> 0x017c }
        r14 = (defpackage.oj.b) r14;	 Catch:{ all -> 0x017c }
        r15 = r11.c;	 Catch:{ all -> 0x017c }
        r16 = r8 + 1;	 Catch:{ all -> 0x017c }
        r15 = r15[r16];	 Catch:{ all -> 0x017c }
        if (r15 > r12) goto L_0x00c1;
        r2 = 1;
        goto L_0x00c2;
        r2 = 0;
        r14.a = r2;	 Catch:{ all -> 0x0178 }
        r14.b = r12;	 Catch:{ all -> 0x0178 }
        r14.c = r15;	 Catch:{ all -> 0x0178 }
        r14.d = r10;	 Catch:{ all -> 0x0178 }
        r2 = r11.c;	 Catch:{ all -> 0x0178 }
        r2 = r2[r8];	 Catch:{ all -> 0x0178 }
        r14.e = r2;	 Catch:{ all -> 0x0178 }
        r13 = r13 + 1;	 Catch:{ all -> 0x0178 }
        r8 = r8 + 2;	 Catch:{ all -> 0x0178 }
        r2 = 0;	 Catch:{ all -> 0x0178 }
        goto L_0x0097;	 Catch:{ all -> 0x0178 }
        r8 = r13;	 Catch:{ all -> 0x0178 }
        r7 = r7 + 1;	 Catch:{ all -> 0x0178 }
        r2 = 0;	 Catch:{ all -> 0x0178 }
        goto L_0x0075;	 Catch:{ all -> 0x0178 }
        r0 = r1.e;	 Catch:{ all -> 0x0178 }
        r2 = f;	 Catch:{ all -> 0x0178 }
        java.util.Collections.sort(r0, r2);	 Catch:{ all -> 0x0178 }
        r0 = 0;	 Catch:{ all -> 0x0178 }
        r2 = r1.e;	 Catch:{ all -> 0x0178 }
        r2 = r2.size();	 Catch:{ all -> 0x0178 }
        if (r0 >= r2) goto L_0x0174;	 Catch:{ all -> 0x0178 }
        r2 = r1.e;	 Catch:{ all -> 0x0178 }
        r2 = r2.get(r0);	 Catch:{ all -> 0x0178 }
        r2 = (defpackage.oj.b) r2;	 Catch:{ all -> 0x0178 }
        r3 = r2.d;	 Catch:{ all -> 0x0178 }
        if (r3 == 0) goto L_0x0174;	 Catch:{ all -> 0x0178 }
        r3 = r2.a;	 Catch:{ all -> 0x0178 }
        if (r3 == 0) goto L_0x0103;	 Catch:{ all -> 0x0178 }
        r7 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ all -> 0x0178 }
        goto L_0x0104;	 Catch:{ all -> 0x0178 }
        r7 = r5;	 Catch:{ all -> 0x0178 }
        r3 = r2.d;	 Catch:{ all -> 0x0178 }
        r10 = r2.e;	 Catch:{ all -> 0x0178 }
        r3 = defpackage.oj.a(r3, r10, r7);	 Catch:{ all -> 0x0178 }
        if (r3 == 0) goto L_0x0165;	 Catch:{ all -> 0x0178 }
        r7 = r3.mNestedRecyclerView;	 Catch:{ all -> 0x0178 }
        if (r7 == 0) goto L_0x0165;	 Catch:{ all -> 0x0178 }
        r7 = r3.isBound();	 Catch:{ all -> 0x0178 }
        if (r7 == 0) goto L_0x0165;	 Catch:{ all -> 0x0178 }
        r7 = r3.isInvalid();	 Catch:{ all -> 0x0178 }
        if (r7 != 0) goto L_0x0165;	 Catch:{ all -> 0x0178 }
        r3 = r3.mNestedRecyclerView;	 Catch:{ all -> 0x0178 }
        r3 = r3.get();	 Catch:{ all -> 0x0178 }
        r3 = (android.support.v7.widget.RecyclerView) r3;	 Catch:{ all -> 0x0178 }
        if (r3 == 0) goto L_0x0165;	 Catch:{ all -> 0x0178 }
        r7 = r3.mDataSetHasChangedAfterLayout;	 Catch:{ all -> 0x0178 }
        if (r7 == 0) goto L_0x0137;	 Catch:{ all -> 0x0178 }
        r7 = r3.mChildHelper;	 Catch:{ all -> 0x0178 }
        r7 = r7.b();	 Catch:{ all -> 0x0178 }
        if (r7 == 0) goto L_0x0137;	 Catch:{ all -> 0x0178 }
        r3.removeAndRecycleViews();	 Catch:{ all -> 0x0178 }
        r7 = r3.mPrefetchRegistry;	 Catch:{ all -> 0x0178 }
        r7.a(r3, r9);	 Catch:{ all -> 0x0178 }
        r8 = r7.d;	 Catch:{ all -> 0x0178 }
        if (r8 == 0) goto L_0x0165;
        r8 = "RV Nested Prefetch";	 Catch:{ all -> 0x0160 }
        defpackage.in.a(r8);	 Catch:{ all -> 0x0160 }
        r8 = r3.mState;	 Catch:{ all -> 0x0160 }
        r10 = r3.mAdapter;	 Catch:{ all -> 0x0160 }
        r8.prepareForNestedPrefetch(r10);	 Catch:{ all -> 0x0160 }
        r8 = 0;	 Catch:{ all -> 0x0160 }
        r10 = r7.d;	 Catch:{ all -> 0x0160 }
        r10 = r10 << r9;	 Catch:{ all -> 0x0160 }
        if (r8 >= r10) goto L_0x015c;	 Catch:{ all -> 0x0160 }
        r10 = r7.c;	 Catch:{ all -> 0x0160 }
        r10 = r10[r8];	 Catch:{ all -> 0x0160 }
        defpackage.oj.a(r3, r10, r5);	 Catch:{ all -> 0x0160 }
        r8 = r8 + 2;
        goto L_0x014d;
        defpackage.in.a();	 Catch:{ all -> 0x0178 }
        goto L_0x0165;	 Catch:{ all -> 0x0178 }
        r0 = move-exception;	 Catch:{ all -> 0x0178 }
        defpackage.in.a();	 Catch:{ all -> 0x0178 }
        throw r0;	 Catch:{ all -> 0x0178 }
        r2.a = r4;	 Catch:{ all -> 0x0178 }
        r2.b = r4;	 Catch:{ all -> 0x0178 }
        r2.c = r4;	 Catch:{ all -> 0x0178 }
        r3 = 0;	 Catch:{ all -> 0x0178 }
        r2.d = r3;	 Catch:{ all -> 0x0178 }
        r2.e = r4;	 Catch:{ all -> 0x0178 }
        r0 = r0 + 1;
        goto L_0x00e5;
        r2 = 0;
        goto L_0x0011;
        r0 = move-exception;
        r2 = 0;
        goto L_0x017d;
        r0 = move-exception;
        r1.d = r2;
        defpackage.in.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj.run():void");
    }
}
