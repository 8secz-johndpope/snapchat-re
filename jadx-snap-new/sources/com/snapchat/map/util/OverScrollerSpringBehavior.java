package com.snapchat.map.util;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.e;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class OverScrollerSpringBehavior extends android.support.design.widget.CoordinatorLayout.b<View> {
    private static final a b = a.TOP;
    public b a;
    private final float c;
    private final float d;
    private final a e;
    private int f;
    private boolean g;

    /* renamed from: com.snapchat.map.util.OverScrollerSpringBehavior$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.snapchat.map.util.OverScrollerSpringBehavior.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.snapchat.map.util.OverScrollerSpringBehavior.a.TOP;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.snapchat.map.util.OverScrollerSpringBehavior.a.BOTTOM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.snapchat.map.util.OverScrollerSpringBehavior.a.LEFT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.snapchat.map.util.OverScrollerSpringBehavior.a.RIGHT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.map.util.OverScrollerSpringBehavior$AnonymousClass1.<clinit>():void");
        }
    }

    public enum a {
        TOP(0),
        BOTTOM(1),
        LEFT(2),
        RIGHT(3);
        
        final int id;

        private a(int i) {
            this.id = i;
        }
    }

    public interface b {
        void a(float f);

        void a(float f, boolean z);
    }

    public OverScrollerSpringBehavior() {
        this(b);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x004e in {5, 6, 8} preds:[]
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
    public OverScrollerSpringBehavior(android.content.Context r7, android.util.AttributeSet r8) {
        /*
        r6 = this;
        r6.<init>(r7, r8);
        r0 = 0;
        r6.f = r0;
        r1 = 0;
        r6.a = r1;
        r6.g = r0;
        r7 = r7.getTheme();
        r1 = defpackage.aclf.a.a;
        r7 = r7.obtainStyledAttributes(r8, r1, r0, r0);
        r8 = b;
        r8 = r8.id;
        r1 = 1;
        r8 = r7.getInt(r1, r8);
        r1 = com.snapchat.map.util.OverScrollerSpringBehavior.a.values();
        r2 = r1.length;
        r3 = 0;
        if (r3 >= r2) goto L_0x0048;
        r4 = r1[r3];
        r5 = r4.id;
        if (r5 != r8) goto L_0x0045;
        r6.e = r4;
        r8 = 2;
        r1 = 1041865114; // 0x3e19999a float:0.15 double:5.147497604E-315;
        r8 = r7.getFloat(r8, r1);
        r6.c = r8;
        r8 = 990057071; // 0x3b03126f float:0.002 double:4.89153186E-315;
        r8 = r7.getFloat(r0, r8);
        r6.d = r8;
        r7.recycle();
        return;
        r3 = r3 + 1;
        goto L_0x0024;
        r7 = new java.lang.IllegalArgumentException;
        r7.<init>();
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.map.util.OverScrollerSpringBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private OverScrollerSpringBehavior(a aVar) {
        this.f = 0;
        this.a = null;
        this.g = false;
        this.e = aVar;
        this.c = 0.15f;
        this.d = 0.002f;
    }

    private float a(float f) {
        return f / ((((float) this.f) * this.d) + 1.0f);
    }

    private int a(int i, int i2) {
        int i3 = AnonymousClass1.a[this.e.ordinal()];
        if (i3 == 1) {
            return -i2;
        }
        if (i3 == 2) {
            return i2;
        }
        if (i3 == 3) {
            return -i;
        }
        if (i3 != 4) {
            i = 0;
        }
        return i;
    }

    public static OverScrollerSpringBehavior a(View view, int i) {
        return (OverScrollerSpringBehavior) ((e) view.findViewById(i).getLayoutParams()).a;
    }

    private void a() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a((float) this.f);
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (i == 0) {
            int i2 = this.f;
            if (i2 > 0) {
                b bVar = this.a;
                if (bVar != null) {
                    bVar.a((float) i2, this.g);
                }
                this.f = 0;
            }
        }
        this.g = false;
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        int a = a(i3, i4);
        if (i2 != 0) {
            this.g = true;
        }
        if (i5 == 0 && a > 0) {
            this.f = (int) (((float) this.f) + a((float) a));
            a();
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int a = a(i, i2);
        int i4 = this.f;
        if (i4 != 0 && i3 == 0) {
            this.f = (int) Math.max(MapboxConstants.MINIMUM_ZOOM, ((float) i4) + a((float) a));
            i4 = AnonymousClass1.a[this.e.ordinal()];
            if (i4 == 1) {
                iArr[1] = -a;
            } else if (i4 == 2) {
                iArr[1] = a;
            } else if (i4 == 3) {
                iArr[0] = -a;
            } else if (i4 == 4) {
                iArr[0] = a;
            }
            a();
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.g = false;
        return true;
    }
}
