package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.snapchat.android.R;
import defpackage.nx;

public class AppCompatSeekBar extends SeekBar {
    private final nx mAppCompatSeekBarHelper;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAppCompatSeekBarHelper = new nx(this);
        this.mAppCompatSeekBarHelper.a(attributeSet, i);
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        nx nxVar = this.mAppCompatSeekBarHelper;
        Drawable drawable = nxVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(nxVar.b.getDrawableState())) {
            nxVar.b.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        nx nxVar = this.mAppCompatSeekBarHelper;
        if (nxVar.c != null) {
            nxVar.c.jumpToCurrentState();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0075 in {8, 9, 11, 14, 15, 17, 20} preds:[]
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
    protected synchronized void onDraw(android.graphics.Canvas r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        super.onDraw(r8);	 Catch:{ all -> 0x0072 }
        r0 = r7.mAppCompatSeekBarHelper;	 Catch:{ all -> 0x0072 }
        r1 = r0.c;	 Catch:{ all -> 0x0072 }
        if (r1 == 0) goto L_0x0070;	 Catch:{ all -> 0x0072 }
        r1 = r0.b;	 Catch:{ all -> 0x0072 }
        r1 = r1.getMax();	 Catch:{ all -> 0x0072 }
        r2 = 1;	 Catch:{ all -> 0x0072 }
        if (r1 <= r2) goto L_0x0070;	 Catch:{ all -> 0x0072 }
        r3 = r0.c;	 Catch:{ all -> 0x0072 }
        r3 = r3.getIntrinsicWidth();	 Catch:{ all -> 0x0072 }
        r4 = r0.c;	 Catch:{ all -> 0x0072 }
        r4 = r4.getIntrinsicHeight();	 Catch:{ all -> 0x0072 }
        if (r3 < 0) goto L_0x0024;	 Catch:{ all -> 0x0072 }
        r3 = r3 / 2;	 Catch:{ all -> 0x0072 }
        goto L_0x0025;	 Catch:{ all -> 0x0072 }
        r3 = 1;	 Catch:{ all -> 0x0072 }
        if (r4 < 0) goto L_0x0029;	 Catch:{ all -> 0x0072 }
        r2 = r4 / 2;	 Catch:{ all -> 0x0072 }
        r4 = r0.c;	 Catch:{ all -> 0x0072 }
        r5 = -r3;	 Catch:{ all -> 0x0072 }
        r6 = -r2;	 Catch:{ all -> 0x0072 }
        r4.setBounds(r5, r6, r3, r2);	 Catch:{ all -> 0x0072 }
        r2 = r0.b;	 Catch:{ all -> 0x0072 }
        r2 = r2.getWidth();	 Catch:{ all -> 0x0072 }
        r3 = r0.b;	 Catch:{ all -> 0x0072 }
        r3 = r3.getPaddingLeft();	 Catch:{ all -> 0x0072 }
        r2 = r2 - r3;	 Catch:{ all -> 0x0072 }
        r3 = r0.b;	 Catch:{ all -> 0x0072 }
        r3 = r3.getPaddingRight();	 Catch:{ all -> 0x0072 }
        r2 = r2 - r3;	 Catch:{ all -> 0x0072 }
        r2 = (float) r2;	 Catch:{ all -> 0x0072 }
        r3 = (float) r1;	 Catch:{ all -> 0x0072 }
        r2 = r2 / r3;	 Catch:{ all -> 0x0072 }
        r3 = r8.save();	 Catch:{ all -> 0x0072 }
        r4 = r0.b;	 Catch:{ all -> 0x0072 }
        r4 = r4.getPaddingLeft();	 Catch:{ all -> 0x0072 }
        r4 = (float) r4;	 Catch:{ all -> 0x0072 }
        r5 = r0.b;	 Catch:{ all -> 0x0072 }
        r5 = r5.getHeight();	 Catch:{ all -> 0x0072 }
        r5 = r5 / 2;	 Catch:{ all -> 0x0072 }
        r5 = (float) r5;	 Catch:{ all -> 0x0072 }
        r8.translate(r4, r5);	 Catch:{ all -> 0x0072 }
        r4 = 0;	 Catch:{ all -> 0x0072 }
        if (r4 > r1) goto L_0x006d;	 Catch:{ all -> 0x0072 }
        r5 = r0.c;	 Catch:{ all -> 0x0072 }
        r5.draw(r8);	 Catch:{ all -> 0x0072 }
        r5 = 0;	 Catch:{ all -> 0x0072 }
        r8.translate(r2, r5);	 Catch:{ all -> 0x0072 }
        r4 = r4 + 1;	 Catch:{ all -> 0x0072 }
        goto L_0x005f;	 Catch:{ all -> 0x0072 }
        r8.restoreToCount(r3);	 Catch:{ all -> 0x0072 }
        monitor-exit(r7);
        return;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSeekBar.onDraw(android.graphics.Canvas):void");
    }
}
