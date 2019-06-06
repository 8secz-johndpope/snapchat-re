package com.snapchat.android.framework.ui.views.openlayout;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.abvb;
import defpackage.abvf;
import defpackage.abvp;
import java.util.ArrayList;
import java.util.List;

public class OpenLayout extends FrameLayout {
    private final List<abvf> a;
    private final List<abvp> b;
    private final List<abvb> c;
    private abvp d;
    private int e;
    protected final RuntimeException j;

    public OpenLayout(Context context) {
        this(context, null);
    }

    public OpenLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = null;
        this.e = 0;
        this.j = new RuntimeException("OpenLayout created here");
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(View view) {
        StringBuilder stringBuilder;
        if (view instanceof ImageView) {
            int id = view.getId();
            if (id == -1) {
                return "NoId ";
            }
            try {
                stringBuilder = new StringBuilder();
                stringBuilder.append(getResources().getResourceEntryName(id));
                stringBuilder.append(" ");
                return stringBuilder.toString();
            } catch (NotFoundException unused) {
                return "NotFound ";
            }
        } else if (!(view instanceof ViewGroup)) {
            return "";
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            stringBuilder = new StringBuilder();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                stringBuilder.append(a(viewGroup.getChildAt(i)));
            }
            return stringBuilder.toString();
        }
    }

    public final void a(abvb abvb) {
        this.c.add(abvb);
    }

    public final void a(abvf abvf) {
        if (!this.a.contains(abvf)) {
            this.a.add(abvf);
            this.e = this.a.size();
        }
    }

    public final void a(abvp abvp) {
        if (!this.b.contains(abvp)) {
            this.b.add(abvp);
        }
    }

    public final void b(abvb abvb) {
        this.c.remove(abvb);
    }

    public final void b(abvf abvf) {
        this.a.remove(abvf);
        this.e = this.a.size();
    }

    public final void b(abvp abvp) {
        this.b.remove(abvp);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.c.isEmpty()) {
            return super.canScrollHorizontally(i);
        }
        i = this.c.size();
        for (int i2 = 0; i2 < i; i2++) {
            if (((abvb) this.c.get(i2)).a()) {
                return true;
            }
        }
        return false;
    }

    public boolean canScrollVertically(int i) {
        if (this.c.isEmpty()) {
            return super.canScrollVertically(i);
        }
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((abvb) this.c.get(i2)).a(i)) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0055 in {2, 8, 9, 14, 16} preds:[]
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
    public void dispatchDraw(android.graphics.Canvas r4) {
        /*
        r3 = this;
        r0 = r3.e;
        r0 = r0 + -1;
        if (r0 < 0) goto L_0x0014;
        r1 = r3.a;
        r1 = r1.get(r0);
        r1 = (defpackage.abvf) r1;
        r1.a(r4);
        r0 = r0 + -1;
        goto L_0x0004;
        super.dispatchDraw(r4);	 Catch:{ Exception -> 0x002b }
        r0 = 0;
        r1 = r3.e;
        if (r0 >= r1) goto L_0x002a;
        r1 = r3.a;
        r1 = r1.get(r0);
        r1 = (defpackage.abvf) r1;
        r1.b(r4);
        r0 = r0 + 1;
        goto L_0x0018;
        return;
        r4 = move-exception;
        r0 = r4;
        r1 = r0.getCause();
        if (r1 == 0) goto L_0x0038;
        r0 = r0.getCause();
        goto L_0x002d;
        r1 = r3.j;
        r0.initCause(r1);
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r2 = "Drawing failed, image view IDs = ";
        r1.<init>(r2);
        r2 = r3.a(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1, r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.android.framework.ui.views.openlayout.OpenLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.d = null;
        }
        for (int size = this.b.size() - 1; size >= 0; size--) {
            if (((abvp) this.b.get(size)).a(this, motionEvent)) {
                this.d = (abvp) this.b.get(size);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        abvp abvp = this.d;
        if (abvp != null) {
            abvp.b(this, motionEvent);
            return true;
        }
        int size = this.b.size() - 1;
        Object obj = null;
        while (size >= 0) {
            if (((abvp) this.b.get(size)).b(this, motionEvent)) {
                this.d = (abvp) this.b.get(size);
                return true;
            }
            if (obj == null && ((abvp) this.b.get(size)).a(motionEvent)) {
                obj = 1;
            }
            size--;
        }
        return super.onTouchEvent(motionEvent) || obj != null;
    }
}
