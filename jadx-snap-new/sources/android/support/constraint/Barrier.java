package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.az;
import defpackage.bd.b;
import defpackage.bl;

public class Barrier extends az {
    int a = 0;
    private int f = 0;
    private bl g;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    /* JADX WARNING: Missing block: B:5:0x0015, code skipped:
            if (r6 == 6) goto L_0x0017;
     */
    /* JADX WARNING: Missing block: B:14:0x0032, code skipped:
            if (r6 == 6) goto L_0x0012;
     */
    /* JADX WARNING: Missing block: B:17:0x003a, code skipped:
            if (r6 == 6) goto L_0x0017;
     */
    public final void a(int r6) {
        /*
        r5 = this;
        r5.a = r6;
        r5.f = r6;
        r6 = android.os.Build.VERSION.SDK_INT;
        r0 = 6;
        r1 = 5;
        r2 = 0;
        r3 = 1;
        r4 = 17;
        if (r6 >= r4) goto L_0x001a;
    L_0x000e:
        r6 = r5.a;
        if (r6 != r1) goto L_0x0015;
    L_0x0012:
        r5.f = r2;
        goto L_0x003d;
    L_0x0015:
        if (r6 != r0) goto L_0x003d;
    L_0x0017:
        r5.f = r3;
        goto L_0x003d;
    L_0x001a:
        r6 = r5.getResources();
        r6 = r6.getConfiguration();
        r6 = r6.getLayoutDirection();
        if (r3 != r6) goto L_0x002a;
    L_0x0028:
        r6 = 1;
        goto L_0x002b;
    L_0x002a:
        r6 = 0;
    L_0x002b:
        if (r6 == 0) goto L_0x0035;
    L_0x002d:
        r6 = r5.a;
        if (r6 != r1) goto L_0x0032;
    L_0x0031:
        goto L_0x0017;
    L_0x0032:
        if (r6 != r0) goto L_0x003d;
    L_0x0034:
        goto L_0x0012;
    L_0x0035:
        r6 = r5.a;
        if (r6 != r1) goto L_0x003a;
    L_0x0039:
        goto L_0x0012;
    L_0x003a:
        if (r6 != r0) goto L_0x003d;
    L_0x003c:
        goto L_0x0017;
    L_0x003d:
        r6 = r5.g;
        r0 = r5.f;
        r6.a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.Barrier.a(int):void");
    }

    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.g = new bl();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    a(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 5) {
                    this.g.b = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.d = this.g;
        b();
    }
}
