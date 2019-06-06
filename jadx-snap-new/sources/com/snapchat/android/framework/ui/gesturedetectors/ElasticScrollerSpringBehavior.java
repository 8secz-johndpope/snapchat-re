package com.snapchat.android.framework.ui.gesturedetectors;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.kb;

public class ElasticScrollerSpringBehavior extends android.support.design.widget.CoordinatorLayout.b<View> {
    private static final a d = a.TOP;
    final float a;
    int b;
    c c;
    private final float e;
    private final a f;
    private b g;
    private boolean h;

    /* renamed from: com.snapchat.android.framework.ui.gesturedetectors.ElasticScrollerSpringBehavior$1 */
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
            r0 = com.snapchat.android.framework.ui.gesturedetectors.ElasticScrollerSpringBehavior.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.snapchat.android.framework.ui.gesturedetectors.ElasticScrollerSpringBehavior.a.TOP;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.snapchat.android.framework.ui.gesturedetectors.ElasticScrollerSpringBehavior.a.BOTTOM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.snapchat.android.framework.ui.gesturedetectors.ElasticScrollerSpringBehavior.a.LEFT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.snapchat.android.framework.ui.gesturedetectors.ElasticScrollerSpringBehavior.a.RIGHT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.android.framework.ui.gesturedetectors.ElasticScrollerSpringBehavior$AnonymousClass1.<clinit>():void");
        }
    }

    public enum a {
        TOP(0),
        BOTTOM(1),
        LEFT(2),
        RIGHT(3);
        
        int id;

        private a(int i) {
            this.id = i;
        }
    }

    public interface b {
    }

    class c implements Runnable {
        private View a;
        private View b;
        private boolean c = false;

        c(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public final void a() {
            this.c = true;
            ElasticScrollerSpringBehavior.this.c = null;
        }

        public final void b() {
            kb.a(this.a, (Runnable) this);
        }

        public final void run() {
            if (!this.c) {
                ElasticScrollerSpringBehavior elasticScrollerSpringBehavior = ElasticScrollerSpringBehavior.this;
                elasticScrollerSpringBehavior.b = (int) (((float) elasticScrollerSpringBehavior.b) * (1.0f - ElasticScrollerSpringBehavior.this.a));
                ElasticScrollerSpringBehavior.this.b(this.b);
                if (ElasticScrollerSpringBehavior.this.b > 0) {
                    b();
                } else {
                    a();
                }
            }
        }
    }

    public ElasticScrollerSpringBehavior() {
        this(d);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0050 in {5, 6, 8} preds:[]
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
    public ElasticScrollerSpringBehavior(android.content.Context r7, android.util.AttributeSet r8) {
        /*
        r6 = this;
        r6.<init>(r7, r8);
        r0 = 0;
        r6.b = r0;
        r1 = 0;
        r6.c = r1;
        r6.g = r1;
        r1 = 1;
        r6.h = r1;
        r7 = r7.getTheme();
        r2 = defpackage.abkw.a.a;
        r7 = r7.obtainStyledAttributes(r8, r2, r0, r0);
        r8 = d;
        r8 = r8.id;
        r8 = r7.getInt(r1, r8);
        r1 = com.snapchat.android.framework.ui.gesturedetectors.ElasticScrollerSpringBehavior.a.values();
        r2 = r1.length;
        r3 = 0;
        if (r3 >= r2) goto L_0x004a;
        r4 = r1[r3];
        r5 = r4.id;
        if (r5 != r8) goto L_0x0047;
        r6.f = r4;
        r8 = 2;
        r1 = 1041865114; // 0x3e19999a float:0.15 double:5.147497604E-315;
        r8 = r7.getFloat(r8, r1);
        r6.a = r8;
        r8 = 990057071; // 0x3b03126f float:0.002 double:4.89153186E-315;
        r8 = r7.getFloat(r0, r8);
        r6.e = r8;
        r7.recycle();
        return;
        r3 = r3 + 1;
        goto L_0x0026;
        r7 = new java.lang.IllegalArgumentException;
        r7.<init>();
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.android.framework.ui.gesturedetectors.ElasticScrollerSpringBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ElasticScrollerSpringBehavior(a aVar) {
        this.b = 0;
        this.c = null;
        this.g = null;
        this.h = true;
        this.f = aVar;
        this.a = 0.15f;
        this.e = 0.002f;
    }

    private float a(float f) {
        return f / ((((float) this.b) * this.e) + 1.0f);
    }

    private int a(int i, int i2) {
        int i3 = AnonymousClass1.a[this.f.ordinal()];
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

    private void b(View view, View view2) {
        if (this.c == null && this.b > 0) {
            this.c = new c(view, view2);
            this.c.b();
            if (view2 instanceof RecyclerView) {
                ((RecyclerView) view2).stopScroll();
            }
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (this.h && i == 0) {
            b(view, view2);
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (this.h) {
            float a;
            float f;
            int a2 = a(i3, i4);
            if (i5 != 0 || a2 <= 0) {
                if (i5 == 1 && this.c == null) {
                    a = a((float) a2);
                    i = this.b;
                    a -= ((float) i) * this.a;
                    if (a > MapboxConstants.MINIMUM_ZOOM) {
                        f = (float) i;
                    } else {
                        b(view, view2);
                    }
                }
                return;
            }
            f = (float) this.b;
            a = a((float) a2);
            this.b = (int) (f + a);
            b(view2);
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (this.h) {
            int a = a(i, i2);
            int i4 = this.b;
            if (i4 != 0 && i3 == 0) {
                this.b = (int) Math.max(MapboxConstants.MINIMUM_ZOOM, ((float) i4) + a((float) a));
                i4 = AnonymousClass1.a[this.f.ordinal()];
                if (i4 == 1) {
                    iArr[1] = -a;
                } else if (i4 == 2) {
                    iArr[1] = a;
                } else if (i4 == 3) {
                    iArr[0] = -a;
                } else if (i4 == 4) {
                    iArr[0] = a;
                }
                b(view2);
            }
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (!this.h) {
            return false;
        }
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
            this.c = null;
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void b(View view) {
        int i = AnonymousClass1.a[this.f.ordinal()];
        if (i == 1) {
            view.setTranslationY((float) this.b);
        } else if (i == 2) {
            view.setTranslationY((float) (-this.b));
        } else if (i != 3) {
            if (i == 4) {
                view.setTranslationX((float) (-this.b));
            }
        } else {
            view.setTranslationX((float) this.b);
        }
    }
}
