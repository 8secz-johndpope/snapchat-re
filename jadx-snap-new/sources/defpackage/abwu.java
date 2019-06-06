package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abwu */
public final class abwu implements abwx {
    private final List<abva> a;
    private final int b;
    private b c;
    private int d;
    private VelocityTracker e;
    private int f;
    private int g;
    private boolean h;

    /* renamed from: abwu$b */
    public interface b {
        boolean a(int i, int i2);

        boolean a(int i, int i2, int i3, int i4, int i5, MotionEvent motionEvent);
    }

    /* renamed from: abwu$a */
    public static class a implements b {
        public final boolean a(int i, int i2) {
            return false;
        }

        public final boolean a(int i, int i2, int i3, int i4, int i5, MotionEvent motionEvent) {
            return i4 - i2 >= i5;
        }
    }

    public abwu(Context context) {
        this(context, null);
    }

    public abwu(Context context, b bVar) {
        this.a = new ArrayList();
        this.c = bVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.b = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = viewConfiguration.getScaledTouchSlop();
    }

    private void a() {
        VelocityTracker velocityTracker = this.e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.e = null;
        }
    }

    private void b(MotionEvent motionEvent) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        this.e.addMovement(motionEvent);
    }

    private void b(View view, MotionEvent motionEvent) {
        this.h = true;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.g = (int) motionEvent.getY();
        this.f = (int) motionEvent.getX();
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ((abva) this.a.get(size)).a(this.f, this.g);
        }
        b(motionEvent);
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(abva abva) {
        this.a.add(abva);
    }

    public final void a(b bVar) {
        this.c = bVar;
    }

    public final boolean a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0 && !this.a.isEmpty();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:48:0x00e8 in {10, 15, 16, 23, 28, 33, 34, 37, 43, 45, 47} preds:[]
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
    public final boolean a(android.view.View r10, android.view.MotionEvent r11) {
        /*
        r9 = this;
        r0 = r9.c;
        if (r0 == 0) goto L_0x00e0;
        r0 = r11.getActionMasked();
        r1 = 1;
        if (r0 == 0) goto L_0x00c1;
        r2 = 0;
        if (r0 == r1) goto L_0x0086;
        r3 = 2;
        if (r0 == r3) goto L_0x0038;
        r10 = 3;
        if (r0 == r10) goto L_0x0016;
        goto L_0x00dd;
        r10 = r9.h;
        if (r10 == 0) goto L_0x00dd;
        r10 = r9.a;
        r10 = r10.size();
        r10 = r10 - r1;
        if (r10 < 0) goto L_0x0031;
        r11 = r9.a;
        r11 = r11.get(r10);
        r11 = (defpackage.abva) r11;
        r11.a();
        r10 = r10 + -1;
        goto L_0x0021;
        r9.h = r2;
        r9.a();
        goto L_0x00dd;
        r0 = r9.h;
        if (r0 != 0) goto L_0x005e;
        r0 = r11.getPointerCount();
        if (r0 > r1) goto L_0x005e;
        r2 = r9.c;
        r3 = r9.f;
        r4 = r9.g;
        r0 = r11.getX();
        r5 = (int) r0;
        r0 = r11.getY();
        r6 = (int) r0;
        r7 = r9.d;
        r8 = r11;
        r0 = r2.a(r3, r4, r5, r6, r7, r8);
        if (r0 == 0) goto L_0x005e;
        r9.b(r10, r11);
        r10 = r9.h;
        if (r10 == 0) goto L_0x00dd;
        r9.b(r11);
        r10 = r9.a;
        r10 = r10.size();
        r10 = r10 - r1;
        if (r10 < 0) goto L_0x00dd;
        r0 = r9.a;
        r0 = r0.get(r10);
        r0 = (defpackage.abva) r0;
        r1 = r11.getX();
        r1 = (int) r1;
        r2 = r11.getY();
        r2 = (int) r2;
        r0.b(r1, r2);
        r10 = r10 + -1;
        goto L_0x006c;
        r10 = r9.h;
        if (r10 == 0) goto L_0x00dd;
        r10 = r9.e;
        if (r10 != 0) goto L_0x0092;
        r10 = 0;
        r11 = 0;
        r0 = 0;
        goto L_0x00aa;
        r11 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r9.b;
        r0 = (float) r0;
        r10.computeCurrentVelocity(r11, r0);
        r11 = r10.getXVelocity();
        r11 = (int) r11;
        r10 = r10.getYVelocity();
        r10 = (int) r10;
        r0 = r9.c;
        r0 = r0.a(r11, r10);
        r3 = r9.a;
        r3 = r3.size();
        r3 = r3 - r1;
        if (r3 < 0) goto L_0x0031;
        r1 = r9.a;
        r1 = r1.get(r3);
        r1 = (defpackage.abva) r1;
        r1.a(r0, r11, r10);
        r3 = r3 + -1;
        goto L_0x00b1;
        r0 = r11.getY();
        r0 = (int) r0;
        r9.g = r0;
        r0 = r11.getX();
        r0 = (int) r0;
        r9.f = r0;
        r0 = r11.getPointerCount();
        if (r0 > r1) goto L_0x00dd;
        r0 = r9.d;
        if (r0 != 0) goto L_0x00dd;
        r9.b(r10, r11);
        return r1;
        r10 = r9.h;
        return r10;
        r10 = new java.lang.IllegalStateException;
        r11 = "ContinuousSwipestrategy: swipe predicate cannot be null";
        r10.<init>(r11);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwu.a(android.view.View, android.view.MotionEvent):boolean");
    }
}
