package com.snap.identity.api.sharedui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.snap.ui.view.SnapFontTextView;
import defpackage.ajdp;
import defpackage.ajfu;
import defpackage.ajwl;
import defpackage.ajyn;
import defpackage.ajzg;
import defpackage.akcr;
import defpackage.akef;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AlphabeticScrollbar extends FrameLayout {
    public static final String a = a;
    public static final String b = b;
    public static final String c = c;
    public static final String d = d;
    public static final String e = e;
    private static final String j = j;
    private final LinearLayout f;
    private final ajwl<String> g;
    private final int h;
    private String i;

    /* renamed from: com.snap.identity.api.sharedui.AlphabeticScrollbar$1 */
    static final class AnonymousClass1 implements Runnable {
        private /* synthetic */ AlphabeticScrollbar a;

        AnonymousClass1(AlphabeticScrollbar alphabeticScrollbar) {
            this.a = alphabeticScrollbar;
        }

        public final void run() {
            AlphabeticScrollbar alphabeticScrollbar = this.a;
            AlphabeticScrollbar.a(alphabeticScrollbar, alphabeticScrollbar.getWidth(), this.a.getHeight());
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b implements Runnable {
        private /* synthetic */ AlphabeticScrollbar a;
        private /* synthetic */ int b;
        private /* synthetic */ int c;

        b(AlphabeticScrollbar alphabeticScrollbar, int i, int i2) {
            this.a = alphabeticScrollbar;
            this.b = i;
            this.c = i2;
        }

        public final void run() {
            AlphabeticScrollbar.a(this.a, this.b, this.c);
        }
    }

    static {
        a aVar = new a();
    }

    public AlphabeticScrollbar(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private AlphabeticScrollbar(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.irt.a.a, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            View.inflate(context, resourceId, this);
            Object findViewById = findViewById(resourceId2);
            akcr.a(findViewById, "this.findViewById(scrollbarInternalLayoutId)");
            this.f = (LinearLayout) findViewById;
            findViewById = new ajwl();
            akcr.a(findViewById, "BehaviorSubject.create<String>()");
            this.g = findViewById;
            this.h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            post(new AnonymousClass1(this));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static final /* synthetic */ void a(AlphabeticScrollbar alphabeticScrollbar, int i, int i2) {
        i = Math.min(i2 / (alphabeticScrollbar.f.getChildCount() + 25), i) - (alphabeticScrollbar.h << 1);
        Iterable a = akef.a(0, alphabeticScrollbar.f.getChildCount());
        Collection arrayList = new ArrayList(ajyn.a(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(alphabeticScrollbar.f.getChildAt(((ajzg) it).a()));
        }
        for (View view : (List) arrayList) {
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                imageView.getLayoutParams().width = i;
                imageView.getLayoutParams().height = i;
            } else if (view instanceof SnapFontTextView) {
                SnapFontTextView snapFontTextView = (SnapFontTextView) view;
                snapFontTextView.getLayoutParams().width = i;
                snapFontTextView.getLayoutParams().height = -2;
                snapFontTextView.setTextSize(0, ((float) i) * 0.8f);
            }
        }
        alphabeticScrollbar.requestLayout();
    }

    public final ajdp<String> a() {
        Object j = this.g.j(ajfu.a);
        akcr.a(j, "touchedIconTypeObservable.distinctUntilChanged()");
        return j;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        onTouchEvent(motionEvent);
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new b(this, i, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d2 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d2 A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:25:0x00a0, code skipped:
            if (r9 > r7.getTop()) goto L_0x00a2;
     */
    /* JADX WARNING: Missing block: B:32:0x00b7, code skipped:
            if (r9 < r7.getBottom()) goto L_0x00b9;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        r11 = this;
        r0 = "event";
        defpackage.akcr.b(r12, r0);
        r0 = r12.getAction();
        r1 = 3;
        r2 = 0;
        r3 = 0;
        r4 = 1;
        if (r0 != 0) goto L_0x0015;
    L_0x000f:
        r0 = r11.f;
        r0.setPressed(r4);
        goto L_0x002f;
    L_0x0015:
        r0 = r12.getAction();
        if (r0 == r4) goto L_0x0021;
    L_0x001b:
        r0 = r12.getAction();
        if (r0 != r1) goto L_0x002f;
    L_0x0021:
        r0 = r11.f;
        r0.setPressed(r2);
        r0 = r11.g;
        r5 = j;
        r0.a(r5);
        r11.i = r3;
    L_0x002f:
        r0 = r12.getAction();
        if (r0 == 0) goto L_0x003c;
    L_0x0035:
        r0 = r12.getAction();
        r5 = 2;
        if (r0 != r5) goto L_0x0167;
    L_0x003c:
        r0 = r12.getY();
        r5 = r11.f;
        r5 = r5.getChildCount();
        r2 = defpackage.akef.a(r2, r5);
        r2 = (java.lang.Iterable) r2;
        r5 = new java.util.ArrayList;
        r6 = 10;
        r6 = defpackage.ajyn.a(r2, r6);
        r5.<init>(r6);
        r5 = (java.util.Collection) r5;
        r2 = r2.iterator();
    L_0x005d:
        r6 = r2.hasNext();
        if (r6 == 0) goto L_0x0074;
    L_0x0063:
        r6 = r2;
        r6 = (defpackage.ajzg) r6;
        r6 = r6.a();
        r7 = r11.f;
        r6 = r7.getChildAt(r6);
        r5.add(r6);
        goto L_0x005d;
    L_0x0074:
        r5 = (java.util.List) r5;
        r5 = (java.lang.Iterable) r5;
        r2 = r5.iterator();
        r5 = r3;
        r6 = r5;
    L_0x007e:
        r7 = r2.hasNext();
        if (r7 == 0) goto L_0x00d4;
    L_0x0084:
        r7 = r2.next();
        r7 = (android.view.View) r7;
        r8 = "it";
        if (r5 == 0) goto L_0x00a2;
    L_0x008e:
        if (r5 == 0) goto L_0x00a3;
    L_0x0090:
        if (r5 != 0) goto L_0x0095;
    L_0x0092:
        defpackage.akcr.a();
    L_0x0095:
        r9 = r5.getTop();
        defpackage.akcr.a(r7, r8);
        r10 = r7.getTop();
        if (r9 <= r10) goto L_0x00a3;
    L_0x00a2:
        r5 = r7;
    L_0x00a3:
        if (r6 == 0) goto L_0x00b9;
    L_0x00a5:
        if (r6 == 0) goto L_0x00ba;
    L_0x00a7:
        if (r6 != 0) goto L_0x00ac;
    L_0x00a9:
        defpackage.akcr.a();
    L_0x00ac:
        r9 = r6.getBottom();
        defpackage.akcr.a(r7, r8);
        r10 = r7.getBottom();
        if (r9 >= r10) goto L_0x00ba;
    L_0x00b9:
        r6 = r7;
    L_0x00ba:
        defpackage.akcr.a(r7, r8);
        r8 = r7.getTop();
        r9 = new akdy;
        r10 = r7.getBottom();
        r9.<init>(r8, r10);
        r9 = (defpackage.akdv) r9;
        r8 = defpackage.akef.a(r9, r0);
        if (r8 == 0) goto L_0x007e;
    L_0x00d2:
        r5 = r7;
        goto L_0x00f4;
    L_0x00d4:
        if (r5 != 0) goto L_0x00d9;
    L_0x00d6:
        defpackage.akcr.a();
    L_0x00d9:
        r2 = r5.getTop();
        r2 = (float) r2;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x00e3;
    L_0x00e2:
        goto L_0x00f4;
    L_0x00e3:
        if (r6 != 0) goto L_0x00e8;
    L_0x00e5:
        defpackage.akcr.a();
    L_0x00e8:
        r2 = r6.getBottom();
        r2 = (float) r2;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x00f3;
    L_0x00f1:
        r5 = r6;
        goto L_0x00f4;
    L_0x00f3:
        r5 = r3;
    L_0x00f4:
        if (r5 == 0) goto L_0x0167;
    L_0x00f6:
        r0 = r5 instanceof android.widget.TextView;
        if (r0 == 0) goto L_0x0146;
    L_0x00fa:
        r0 = r12.getX();
        r2 = r5;
        r2 = (android.widget.TextView) r2;
        r6 = r2.getX();
        r0 = r0 - r6;
        r12 = r12.getY();
        r6 = r2.getY();
        r12 = r12 - r6;
        r12 = r2.getOffsetForPosition(r0, r12);
        r0 = r2.getText();
        if (r12 < 0) goto L_0x0137;
    L_0x0119:
        r2 = r0.length();
        if (r12 >= r2) goto L_0x0137;
    L_0x011f:
        r2 = r0.charAt(r12);
        r3 = 90;
        r6 = 65;
        if (r6 <= r2) goto L_0x012a;
    L_0x0129:
        goto L_0x012d;
    L_0x012a:
        if (r3 < r2) goto L_0x012d;
    L_0x012c:
        goto L_0x012e;
    L_0x012d:
        r12 = r12 - r4;
    L_0x012e:
        r12 = r0.charAt(r12);
        r12 = java.lang.String.valueOf(r12);
        goto L_0x014e;
    L_0x0137:
        if (r12 >= 0) goto L_0x013c;
    L_0x0139:
        r12 = "A";
        goto L_0x014e;
    L_0x013c:
        r0 = r0.length();
        if (r12 < r0) goto L_0x0144;
    L_0x0142:
        r3 = "Z";
    L_0x0144:
        r12 = r3;
        goto L_0x014e;
    L_0x0146:
        r12 = r5.getTag();
        r12 = r12.toString();
    L_0x014e:
        r0 = r11.i;
        r0 = defpackage.akcr.a(r0, r12);
        r0 = r0 ^ r4;
        if (r0 == 0) goto L_0x0167;
    L_0x0157:
        r11.i = r12;
        r12 = r11.g;
        r0 = r11.i;
        r0 = java.lang.String.valueOf(r0);
        r12.a(r0);
        r5.performHapticFeedback(r1);
    L_0x0167:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.api.sharedui.AlphabeticScrollbar.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
