package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.SeekBar;
import com.brightcove.player.R;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class BrightcoveSeekBar extends SeekBar {
    private static final String a = "BrightcoveSeekBar";
    private int b;
    private SortedSet<Integer> c;
    private Paint d;
    private boolean e;

    public BrightcoveSeekBar(Context context) {
        this(context, null);
    }

    public BrightcoveSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    public BrightcoveSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new TreeSet();
        this.d = new Paint();
        this.e = true;
        if (BrightcoveMediaController.checkTvMode(context)) {
            this.b = (int) getResources().getDimension(R.dimen.player_seekbar_stroke_width);
        }
    }

    public void addMarker(int i) {
        this.c.add(Integer.valueOf(i));
        invalidate();
    }

    public void clearMarkers() {
        this.c.clear();
    }

    public String getMarkerColor() {
        return String.valueOf(this.d.getColor());
    }

    public int getMarkerHeight() {
        return this.b;
    }

    public float getMarkerWidth() {
        return this.d.getStrokeWidth();
    }

    public List<Integer> getMarkers() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.c);
        Log.d(a, String.format("The markers are: {%s}.", new Object[]{arrayList}));
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0092 in {6, 15, 17, 19, 22} preds:[]
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
    protected synchronized void onDraw(android.graphics.Canvas r12) {
        /*
        r11 = this;
        monitor-enter(r11);
        super.onDraw(r12);	 Catch:{ all -> 0x008f }
        r0 = r11.c;	 Catch:{ all -> 0x008f }
        r0 = r0.size();	 Catch:{ all -> 0x008f }
        if (r0 <= 0) goto L_0x008d;	 Catch:{ all -> 0x008f }
        r0 = r11.getProgressDrawable();	 Catch:{ all -> 0x008f }
        r0 = r0.getBounds();	 Catch:{ all -> 0x008f }
        r1 = r0.width();	 Catch:{ all -> 0x008f }
        r1 = (float) r1;	 Catch:{ all -> 0x008f }
        r2 = r0.top;	 Catch:{ all -> 0x008f }
        r2 = (float) r2;	 Catch:{ all -> 0x008f }
        r3 = r0.height();	 Catch:{ all -> 0x008f }
        r3 = (float) r3;	 Catch:{ all -> 0x008f }
        r3 = r3 + r2;	 Catch:{ all -> 0x008f }
        r4 = r11.b;	 Catch:{ all -> 0x008f }
        if (r4 == 0) goto L_0x0032;	 Catch:{ all -> 0x008f }
        r2 = r2 + r3;	 Catch:{ all -> 0x008f }
        r3 = r11.b;	 Catch:{ all -> 0x008f }
        r3 = (float) r3;	 Catch:{ all -> 0x008f }
        r2 = r2 - r3;	 Catch:{ all -> 0x008f }
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x008f }
        r2 = r2 / r3;	 Catch:{ all -> 0x008f }
        r3 = r11.b;	 Catch:{ all -> 0x008f }
        r3 = (float) r3;	 Catch:{ all -> 0x008f }
        r3 = r3 + r2;	 Catch:{ all -> 0x008f }
        r9 = r2;	 Catch:{ all -> 0x008f }
        r8 = r3;	 Catch:{ all -> 0x008f }
        r2 = r11.c;	 Catch:{ all -> 0x008f }
        r10 = r2.iterator();	 Catch:{ all -> 0x008f }
        r2 = r10.hasNext();	 Catch:{ all -> 0x008f }
        if (r2 == 0) goto L_0x008d;	 Catch:{ all -> 0x008f }
        r2 = r10.next();	 Catch:{ all -> 0x008f }
        r2 = (java.lang.Integer) r2;	 Catch:{ all -> 0x008f }
        r2 = r2.floatValue();	 Catch:{ all -> 0x008f }
        r3 = r11.getMax();	 Catch:{ all -> 0x008f }
        r3 = (float) r3;	 Catch:{ all -> 0x008f }
        r2 = r2 / r3;	 Catch:{ all -> 0x008f }
        r2 = r2 * r1;	 Catch:{ all -> 0x008f }
        r3 = r0.left;	 Catch:{ all -> 0x008f }
        r3 = (float) r3;	 Catch:{ all -> 0x008f }
        r4 = r11.getPaddingLeft();	 Catch:{ all -> 0x008f }
        r4 = (float) r4;	 Catch:{ all -> 0x008f }
        r3 = r3 + r4;	 Catch:{ all -> 0x008f }
        r5 = r3 + r2;	 Catch:{ all -> 0x008f }
        r2 = r11.e;	 Catch:{ all -> 0x008f }
        if (r2 != 0) goto L_0x0083;	 Catch:{ all -> 0x008f }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x008f }
        r3 = 16;	 Catch:{ all -> 0x008f }
        if (r2 < r3) goto L_0x0083;	 Catch:{ all -> 0x008f }
        r2 = r11.getThumb();	 Catch:{ all -> 0x008f }
        r2 = r2.copyBounds();	 Catch:{ all -> 0x008f }
        r3 = r2.right;	 Catch:{ all -> 0x008f }
        r4 = r11.getThumbOffset();	 Catch:{ all -> 0x008f }
        r3 = r3 - r4;	 Catch:{ all -> 0x008f }
        r2.right = r3;	 Catch:{ all -> 0x008f }
        r3 = (int) r5;	 Catch:{ all -> 0x008f }
        r4 = r9 + r8;	 Catch:{ all -> 0x008f }
        r4 = (int) r4;	 Catch:{ all -> 0x008f }
        r4 = r4 / 2;	 Catch:{ all -> 0x008f }
        r2 = r2.contains(r3, r4);	 Catch:{ all -> 0x008f }
        if (r2 != 0) goto L_0x003a;	 Catch:{ all -> 0x008f }
        r7 = r11.d;	 Catch:{ all -> 0x008f }
        r2 = r12;	 Catch:{ all -> 0x008f }
        r3 = r5;	 Catch:{ all -> 0x008f }
        r4 = r9;	 Catch:{ all -> 0x008f }
        r6 = r8;	 Catch:{ all -> 0x008f }
        r2.drawLine(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x008f }
        goto L_0x003a;
        monitor-exit(r11);
        return;
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.mediacontroller.BrightcoveSeekBar.onDraw(android.graphics.Canvas):void");
    }

    public void removeMarker(Integer num) {
        this.c.remove(num);
    }

    public void setMarkerColor(int i) {
        this.d.setColor(i);
    }

    public void setMarkerHeight(int i) {
        this.b = i;
    }

    public void setMarkerWidth(float f) {
        this.d.setStrokeWidth(f);
    }

    public void setShouldMarkerOverdrawThumb(boolean z) {
        this.e = z;
    }
}
