package com.snap.stickers.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.abpf;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvq;
import defpackage.ajvs;
import defpackage.akcr;
import defpackage.xwf;
import defpackage.ydw;
import java.util.List;

public final class BitmojiSubcategorySelectorView extends LinearLayout implements ajej {
    public final ajei a = new ajei();
    public List<xwf> b;
    public ydw c;
    public int d;
    private ajvq<ydw> e;
    private boolean f;
    private int g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b<T> implements ajfb<ydw> {
        private /* synthetic */ BitmojiSubcategorySelectorView a;

        public b(BitmojiSubcategorySelectorView bitmojiSubcategorySelectorView) {
            this.a = bitmojiSubcategorySelectorView;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ydw) obj;
            if ((akcr.a(obj, this.a.c) ^ 1) != 0) {
                ydw ydw = this.a.c;
                if (ydw != null) {
                    ydw.b(true);
                }
                obj.b.performHapticFeedback(1);
                this.a.c = obj;
            }
        }
    }

    static {
        a aVar = new a();
    }

    public BitmojiSubcategorySelectorView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        setLayoutDirection(0);
    }

    public final ajvq<ydw> a() {
        ajvq ajvq = this.e;
        if (ajvq == null) {
            Object ajvs = new ajvs();
            akcr.a(ajvs, "PublishProcessor.create<…CategorySelectorButton>()");
            ajvq = (ajvq) ajvs;
        }
        if (this.e == null) {
            this.e = ajvq;
        }
        return ajvq;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "ev");
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void dispose() {
        this.a.a();
        this.e = null;
        this.c = null;
    }

    public final boolean isDisposed() {
        return this.a.isDisposed();
    }

    /* JADX WARNING: Missing block: B:7:0x0015, code skipped:
            if (r0 != 3) goto L_0x003c;
     */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = "ev";
        defpackage.akcr.b(r6, r0);
        r0 = r6.getAction();
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = 0;
        if (r0 == 0) goto L_0x0034;
    L_0x000e:
        r3 = 1;
        if (r0 == r3) goto L_0x0031;
    L_0x0011:
        r4 = 2;
        if (r0 == r4) goto L_0x0018;
    L_0x0014:
        r6 = 3;
        if (r0 == r6) goto L_0x0031;
    L_0x0017:
        goto L_0x003c;
    L_0x0018:
        r0 = r5.f;
        if (r0 == 0) goto L_0x001d;
    L_0x001c:
        return r3;
    L_0x001d:
        r6 = r6.getX();
        r6 = r6 + r1;
        r6 = (int) r6;
        r0 = r5.g;
        r6 = r6 - r0;
        r6 = java.lang.Math.abs(r6);
        r0 = r5.d;
        if (r6 <= r0) goto L_0x003c;
    L_0x002e:
        r5.f = r3;
        return r3;
    L_0x0031:
        r5.f = r2;
        return r2;
    L_0x0034:
        r6 = r6.getX();
        r6 = r6 + r1;
        r6 = (int) r6;
        r5.g = r6;
    L_0x003c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.stickers.ui.views.BitmojiSubcategorySelectorView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        int x = (int) (motionEvent.getX() + 0.5f);
        int width = getWidth();
        List list = this.b;
        String str = "stickerPacksMetadata";
        if (list == null) {
            akcr.a(str);
        }
        x /= Math.max(width / Math.max(list.size(), 1), 1);
        list = this.b;
        if (list == null) {
            akcr.a(str);
        }
        View childAt = getChildAt(abpf.a(x, 0, list.size() - 1));
        if (!(childAt instanceof ydw)) {
            childAt = null;
        }
        ydw ydw = (ydw) childAt;
        if (ydw != null) {
            ydw.a();
        }
        return true;
    }
}
