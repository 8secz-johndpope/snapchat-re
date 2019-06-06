package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.cj.a;
import defpackage.cm.b;
import defpackage.kb;

public class SnackbarContentLayout extends LinearLayout implements b {
    private TextView a;
    private Button b;
    private int c;
    private int d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    private static void a(View view, int i, int i2) {
        if (kb.a.n(view)) {
            kb.a(view, kb.a.k(view), i, kb.a.l(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        a(this.a, i2, i3);
        return true;
    }

    public final void a() {
        this.a.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        this.a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(MapboxConstants.MINIMUM_ZOOM);
            this.b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    public final void b() {
        this.a.setAlpha(1.0f);
        this.a.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(180).setStartDelay(0).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(180).setStartDelay(0).start();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing block: B:15:0x0055, code skipped:
            if (a(1, r0, r0 - r1) != false) goto L_0x0064;
     */
    /* JADX WARNING: Missing block: B:19:0x0060, code skipped:
            if (a(0, r0, r0) != false) goto L_0x0064;
     */
    public void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        super.onMeasure(r8, r9);
        r0 = r7.c;
        if (r0 <= 0) goto L_0x0018;
    L_0x0007:
        r0 = r7.getMeasuredWidth();
        r1 = r7.c;
        if (r0 <= r1) goto L_0x0018;
    L_0x000f:
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8);
        super.onMeasure(r8, r9);
    L_0x0018:
        r0 = r7.getResources();
        r1 = 2131166165; // 0x7f0703d5 float:1.7946568E38 double:1.0529359877E-314;
        r0 = r0.getDimensionPixelSize(r1);
        r1 = r7.getResources();
        r2 = 2131166164; // 0x7f0703d4 float:1.7946566E38 double:1.052935987E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r7.a;
        r2 = r2.getLayout();
        r2 = r2.getLineCount();
        r3 = 0;
        r4 = 1;
        if (r2 <= r4) goto L_0x003e;
    L_0x003c:
        r2 = 1;
        goto L_0x003f;
    L_0x003e:
        r2 = 0;
    L_0x003f:
        if (r2 == 0) goto L_0x0058;
    L_0x0041:
        r5 = r7.d;
        if (r5 <= 0) goto L_0x0058;
    L_0x0045:
        r5 = r7.b;
        r5 = r5.getMeasuredWidth();
        r6 = r7.d;
        if (r5 <= r6) goto L_0x0058;
    L_0x004f:
        r1 = r0 - r1;
        r0 = r7.a(r4, r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0057:
        goto L_0x0064;
    L_0x0058:
        if (r2 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r0 = r1;
    L_0x005c:
        r0 = r7.a(r3, r0, r0);
        if (r0 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0064;
    L_0x0063:
        r4 = 0;
    L_0x0064:
        if (r4 == 0) goto L_0x0069;
    L_0x0066:
        super.onMeasure(r8, r9);
    L_0x0069:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.internal.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
