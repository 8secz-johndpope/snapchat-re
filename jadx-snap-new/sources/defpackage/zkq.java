package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.BadTokenException;
import android.view.WindowManager.LayoutParams;

/* renamed from: zkq */
public class zkq implements zkr {
    final zko a;
    final zkn b;
    public final ajwl<Rect> c;
    final ajwl<Rect> d;
    private View e;

    /* renamed from: zkq$a */
    class a extends View {
        private final Rect a = new Rect();
        private final Rect b = new Rect();

        public a(Context context) {
            super(context);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0072 in {3, 4, 7, 9, 11, 13} preds:[]
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
        public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
            /*
            r6 = this;
            r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0070 }
            r1 = 23;	 Catch:{ all -> 0x0070 }
            if (r0 < r1) goto L_0x000b;	 Catch:{ all -> 0x0070 }
            r0 = r6.getRootWindowInsets();	 Catch:{ all -> 0x0070 }
            goto L_0x000c;	 Catch:{ all -> 0x0070 }
            r0 = 0;	 Catch:{ all -> 0x0070 }
            r1 = defpackage.zkq.this;	 Catch:{ all -> 0x0070 }
            r1 = r1.a;	 Catch:{ all -> 0x0070 }
            r0 = r1.a(r0);	 Catch:{ all -> 0x0070 }
            r1 = r6.a;	 Catch:{ all -> 0x0070 }
            r2 = r7.getSystemWindowInsetLeft();	 Catch:{ all -> 0x0070 }
            r3 = r7.getSystemWindowInsetTop();	 Catch:{ all -> 0x0070 }
            r4 = r7.getSystemWindowInsetRight();	 Catch:{ all -> 0x0070 }
            r5 = r7.getSystemWindowInsetBottom();	 Catch:{ all -> 0x0070 }
            r1.set(r2, r3, r4, r5);	 Catch:{ all -> 0x0070 }
            r1 = r6.b;	 Catch:{ all -> 0x0070 }
            r2 = r7.getSystemWindowInsetLeft();	 Catch:{ all -> 0x0070 }
            r3 = r7.getSystemWindowInsetRight();	 Catch:{ all -> 0x0070 }
            r4 = r7.getSystemWindowInsetBottom();	 Catch:{ all -> 0x0070 }
            r1.set(r2, r0, r3, r4);	 Catch:{ all -> 0x0070 }
            r0 = defpackage.zkq.this;	 Catch:{ all -> 0x0070 }
            r0 = r0.b;	 Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x005b;	 Catch:{ all -> 0x0070 }
            r0 = defpackage.zkq.this;	 Catch:{ all -> 0x0070 }
            r0 = r0.c;	 Catch:{ all -> 0x0070 }
            r1 = defpackage.zkq.this;	 Catch:{ all -> 0x0070 }
            r1 = r1.b;	 Catch:{ all -> 0x0070 }
            r2 = r6.a;	 Catch:{ all -> 0x0070 }
            r1 = r1.a(r2);	 Catch:{ all -> 0x0070 }
            r0.a(r1);	 Catch:{ all -> 0x0070 }
            r0 = defpackage.zkq.this;	 Catch:{ all -> 0x0070 }
            r0 = r0.d;	 Catch:{ all -> 0x0070 }
            r1 = r6.b;	 Catch:{ all -> 0x0070 }
            r0.a(r1);	 Catch:{ all -> 0x0070 }
            goto L_0x006b;	 Catch:{ all -> 0x0070 }
            r0 = defpackage.zkq.this;	 Catch:{ all -> 0x0070 }
            r0 = r0.c;	 Catch:{ all -> 0x0070 }
            r1 = r6.a;	 Catch:{ all -> 0x0070 }
            r0.a(r1);	 Catch:{ all -> 0x0070 }
            r0 = defpackage.zkq.this;	 Catch:{ all -> 0x0070 }
            r0 = r0.d;	 Catch:{ all -> 0x0070 }
            r1 = r6.b;	 Catch:{ all -> 0x0070 }
            goto L_0x0057;	 Catch:{ all -> 0x0070 }
            r7 = super.onApplyWindowInsets(r7);	 Catch:{ all -> 0x0070 }
            return r7;
            r7 = move-exception;
            throw r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zkq$a.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
        }
    }

    /* renamed from: zkq$b */
    class b extends View {
        public b(Context context) {
            super(context);
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean fitSystemWindows(Rect rect) {
            if (zkq.this.b != null) {
                zkq.this.c.a(zkq.this.b.a(rect));
            } else {
                zkq.this.c.a((Object) rect);
            }
            return super.fitSystemWindows(rect);
        }
    }

    public zkq(zko zko) {
        this(zko, null);
    }

    public zkq(zko zko, zkn zkn) {
        this.c = new ajwl();
        this.d = new ajwl();
        this.a = zko;
        this.b = zkn;
    }

    private void c() {
        try {
            if (this.e != null) {
                WindowManager windowManager = (WindowManager) this.e.getContext().getSystemService("window");
                if (windowManager != null) {
                    windowManager.removeViewImmediate(this.e);
                }
            }
            this.e = null;
        } catch (Exception unused) {
        }
        this.c.a();
        this.d.a();
    }

    public final ajdp<Rect> a() {
        return this.c;
    }

    public final ajej a(Activity activity) {
        if (this.e == null) {
            this.e = VERSION.SDK_INT >= 20 ? new a(activity) : new b(activity);
            try {
                WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                if (windowManager != null) {
                    View view = this.e;
                    LayoutParams layoutParams = new LayoutParams();
                    layoutParams.gravity = 8388661;
                    layoutParams.x = 0;
                    layoutParams.y = 0;
                    layoutParams.height = -1;
                    layoutParams.width = 0;
                    layoutParams.flags = -2147417832;
                    layoutParams.systemUiVisibility = 0;
                    layoutParams.format = -1;
                    layoutParams.windowAnimations = 0;
                    windowManager.addView(view, layoutParams);
                } else {
                    throw new IllegalStateException();
                }
            } catch (BadTokenException | IllegalStateException unused) {
                this.e = null;
            }
        }
        if (VERSION.SDK_INT >= 28) {
            Window window = activity.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        return ajek.a(new -$$Lambda$zkq$Vj-39NfhGpuyU_34Prl2CJOqw_A(this));
    }

    public final ajdp<Rect> b() {
        return this.d;
    }
}
