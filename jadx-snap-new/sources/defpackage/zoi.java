package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: zoi */
public abstract class zoi extends zob {
    private static final String[] a = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    private int b = 3;
    private boolean c = true;

    /* renamed from: zoi$a */
    static class a {
        boolean a;
        boolean b;
        int c;
        boolean d;
        int e;
        boolean f;
        ViewGroup g;
        ViewGroup h;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX WARNING: Missing block: B:30:0x00ad, code skipped:
            if (r0.f != false) goto L_0x00ca;
     */
    /* JADX WARNING: Missing block: B:36:0x00bd, code skipped:
            if (r0.g == null) goto L_0x00ca;
     */
    /* JADX WARNING: Missing block: B:48:0x00d7, code skipped:
            if (r0.d != false) goto L_0x00d9;
     */
    private static defpackage.zoi.a b(defpackage.zog r8, defpackage.zog r9) {
        /*
        r0 = new zoi$a;
        r1 = 0;
        r0.<init>(r1);
        r0.a = r1;
        r0.b = r1;
        r2 = "android:visibility:parent";
        r3 = "android:visibility:parent_visible";
        r4 = 0;
        r5 = -1;
        r6 = "android:visibility:visibility";
        if (r8 == 0) goto L_0x0043;
    L_0x0014:
        r7 = r8.b;
        r7 = r7.containsKey(r6);
        if (r7 == 0) goto L_0x0043;
    L_0x001c:
        r7 = r8.b;
        r7 = r7.get(r6);
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        r0.c = r7;
        r7 = r8.b;
        r7 = r7.get(r3);
        r7 = (java.lang.Boolean) r7;
        r7 = r7.booleanValue();
        r0.d = r7;
        r7 = r8.b;
        r7 = r7.get(r2);
        r7 = (android.view.ViewGroup) r7;
        r0.g = r7;
        goto L_0x0049;
    L_0x0043:
        r0.c = r5;
        r0.d = r1;
        r0.g = r4;
    L_0x0049:
        if (r9 == 0) goto L_0x007a;
    L_0x004b:
        r7 = r9.b;
        r7 = r7.containsKey(r6);
        if (r7 == 0) goto L_0x007a;
    L_0x0053:
        r4 = r9.b;
        r4 = r4.get(r6);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r0.e = r4;
        r4 = r9.b;
        r3 = r4.get(r3);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        r0.f = r3;
        r3 = r9.b;
        r2 = r3.get(r2);
        r2 = (android.view.ViewGroup) r2;
        r0.h = r2;
        goto L_0x0080;
    L_0x007a:
        r0.e = r5;
        r0.f = r1;
        r0.h = r4;
    L_0x0080:
        r2 = 1;
        if (r8 == 0) goto L_0x00c0;
    L_0x0083:
        if (r9 == 0) goto L_0x00c0;
    L_0x0085:
        r8 = r0.c;
        r9 = r0.e;
        if (r8 != r9) goto L_0x0098;
    L_0x008b:
        r8 = r0.d;
        r9 = r0.f;
        if (r8 != r9) goto L_0x0098;
    L_0x0091:
        r8 = r0.g;
        r9 = r0.h;
        if (r8 != r9) goto L_0x0098;
    L_0x0097:
        return r0;
    L_0x0098:
        r8 = r0.c;
        r9 = r0.e;
        if (r8 == r9) goto L_0x00b0;
    L_0x009e:
        r8 = r0.c;
        if (r8 != 0) goto L_0x00a7;
    L_0x00a2:
        r8 = r0.d;
        if (r8 == 0) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00d9;
    L_0x00a7:
        r8 = r0.e;
        if (r8 != 0) goto L_0x00dc;
    L_0x00ab:
        r8 = r0.f;
        if (r8 == 0) goto L_0x00dc;
    L_0x00af:
        goto L_0x00ca;
    L_0x00b0:
        r8 = r0.g;
        r9 = r0.h;
        if (r8 == r9) goto L_0x00dc;
    L_0x00b6:
        r8 = r0.h;
        if (r8 != 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00d9;
    L_0x00bb:
        r8 = r0.g;
        if (r8 != 0) goto L_0x00dc;
    L_0x00bf:
        goto L_0x00ca;
    L_0x00c0:
        if (r8 != 0) goto L_0x00cf;
    L_0x00c2:
        r8 = r0.e;
        if (r8 != 0) goto L_0x00cf;
    L_0x00c6:
        r8 = r0.f;
        if (r8 == 0) goto L_0x00cf;
    L_0x00ca:
        r0.b = r2;
    L_0x00cc:
        r0.a = r2;
        goto L_0x00dc;
    L_0x00cf:
        if (r9 != 0) goto L_0x00dc;
    L_0x00d1:
        r8 = r0.c;
        if (r8 != 0) goto L_0x00dc;
    L_0x00d5:
        r8 = r0.d;
        if (r8 == 0) goto L_0x00dc;
    L_0x00d9:
        r0.b = r1;
        goto L_0x00cc;
    L_0x00dc:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zoi.b(zog, zog):zoi$a");
    }

    private static void d(zog zog) {
        int visibility = zog.a.getVisibility();
        String str = "android:visibility:parent_visible";
        zog.b.put(str, Boolean.valueOf(zog.a.isShown()));
        zog.b.put("android:visibility:visibility", Integer.valueOf(visibility));
        zog.b.put("android:visibility:parent", zog.a.getParent());
        int[] iArr = new int[2];
        zog.a.getLocationOnScreen(iArr);
        zog.b.put("android:visibility:screenLocation", iArr);
    }

    public Animator a(ViewGroup viewGroup, View view, zog zog) {
        return null;
    }

    public Animator a(ViewGroup viewGroup, View view, zog zog, zog zog2) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARNING: Missing block: B:31:0x006c, code skipped:
            if (r5 == r3) goto L_0x016c;
     */
    /* JADX WARNING: Missing block: B:56:0x0162, code skipped:
            if (r0.o != false) goto L_0x0167;
     */
    public final android.animation.Animator a(android.view.ViewGroup r19, defpackage.zog r20, defpackage.zog r21) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r4 = defpackage.zoi.b(r20, r21);
        r5 = r4.a;
        r6 = 0;
        if (r5 == 0) goto L_0x01d9;
    L_0x0011:
        r5 = r4.g;
        if (r5 != 0) goto L_0x0019;
    L_0x0015:
        r5 = r4.h;
        if (r5 == 0) goto L_0x01d9;
    L_0x0019:
        r5 = r4.b;
        r7 = 0;
        r8 = 1;
        if (r5 == 0) goto L_0x004a;
    L_0x001f:
        r4 = r0.b;
        r4 = r4 & r8;
        if (r4 != r8) goto L_0x0049;
    L_0x0024:
        if (r3 != 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0049;
    L_0x0027:
        if (r2 != 0) goto L_0x0042;
    L_0x0029:
        r4 = r3.a;
        r4 = r4.getParent();
        r4 = (android.view.View) r4;
        r5 = r0.b(r4, r7);
        r4 = r0.a(r4, r7);
        r4 = defpackage.zoi.b(r5, r4);
        r4 = r4.a;
        if (r4 == 0) goto L_0x0042;
    L_0x0041:
        return r6;
    L_0x0042:
        r4 = r3.a;
        r1 = r0.a(r1, r4, r2, r3);
        return r1;
    L_0x0049:
        return r6;
    L_0x004a:
        r4 = r4.e;
        r5 = r0.b;
        r9 = 2;
        r5 = r5 & r9;
        if (r5 != r9) goto L_0x01d7;
    L_0x0052:
        if (r2 == 0) goto L_0x0057;
    L_0x0054:
        r5 = r2.a;
        goto L_0x0058;
    L_0x0057:
        r5 = r6;
    L_0x0058:
        if (r3 == 0) goto L_0x005d;
    L_0x005a:
        r3 = r3.a;
        goto L_0x005e;
    L_0x005d:
        r3 = r6;
    L_0x005e:
        if (r3 == 0) goto L_0x0070;
    L_0x0060:
        r10 = r3.getParent();
        if (r10 != 0) goto L_0x0067;
    L_0x0066:
        goto L_0x0070;
    L_0x0067:
        r10 = 4;
        if (r4 != r10) goto L_0x006c;
    L_0x006a:
        goto L_0x016c;
    L_0x006c:
        if (r5 != r3) goto L_0x0167;
    L_0x006e:
        goto L_0x016c;
    L_0x0070:
        if (r3 == 0) goto L_0x0079;
    L_0x0072:
        r17 = r6;
        r6 = r3;
        r3 = r17;
        goto L_0x016c;
    L_0x0079:
        if (r5 == 0) goto L_0x016a;
    L_0x007b:
        r3 = r5.getParent();
        if (r3 == 0) goto L_0x0167;
    L_0x0081:
        r3 = r5.getParent();
        r3 = r3 instanceof android.view.View;
        if (r3 == 0) goto L_0x016a;
    L_0x0089:
        r3 = r5.getParent();
        r3 = (android.view.View) r3;
        r4 = r0.a(r3, r8);
        r10 = r0.b(r3, r8);
        r4 = defpackage.zoi.b(r4, r10);
        r4 = r4.a;
        if (r4 != 0) goto L_0x014d;
    L_0x009f:
        r4 = new android.graphics.Matrix;
        r4.<init>();
        r10 = r3.getScrollX();
        r10 = -r10;
        r10 = (float) r10;
        r3 = r3.getScrollY();
        r3 = -r3;
        r3 = (float) r3;
        r4.setTranslate(r10, r3);
        r3 = new android.graphics.RectF;
        r10 = r5.getWidth();
        r10 = (float) r10;
        r11 = r5.getHeight();
        r11 = (float) r11;
        r12 = 0;
        r3.<init>(r12, r12, r10, r11);
        r4.mapRect(r3);
        r10 = r3.left;
        r10 = java.lang.Math.round(r10);
        r11 = r3.top;
        r11 = java.lang.Math.round(r11);
        r12 = r3.right;
        r12 = java.lang.Math.round(r12);
        r13 = r3.bottom;
        r13 = java.lang.Math.round(r13);
        r14 = new android.widget.ImageView;
        r15 = r5.getContext();
        r14.<init>(r15);
        r15 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r14.setScaleType(r15);
        r15 = r3.width();
        r15 = java.lang.Math.round(r15);
        r16 = r3.height();
        r6 = java.lang.Math.round(r16);
        if (r15 <= 0) goto L_0x0131;
    L_0x00fe:
        if (r6 <= 0) goto L_0x0131;
    L_0x0100:
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = defpackage.zof.a;
        r8 = (float) r8;
        r7 = r15 * r6;
        r7 = (float) r7;
        r8 = r8 / r7;
        r7 = java.lang.Math.min(r9, r8);
        r8 = (float) r15;
        r8 = r8 * r7;
        r8 = (int) r8;
        r6 = (float) r6;
        r6 = r6 * r7;
        r6 = (int) r6;
        r9 = r3.left;
        r9 = -r9;
        r3 = r3.top;
        r3 = -r3;
        r4.postTranslate(r9, r3);
        r4.postScale(r7, r7);
        r3 = android.graphics.Bitmap.Config.ARGB_8888;
        r6 = android.graphics.Bitmap.createBitmap(r8, r6, r3);
        r3 = new android.graphics.Canvas;
        r3.<init>(r6);
        r3.concat(r4);
        r5.draw(r3);
        goto L_0x0132;
    L_0x0131:
        r6 = 0;
    L_0x0132:
        if (r6 == 0) goto L_0x0137;
    L_0x0134:
        r14.setImageBitmap(r6);
    L_0x0137:
        r3 = r12 - r10;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4);
        r5 = r13 - r11;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4);
        r14.measure(r3, r4);
        r14.layout(r10, r11, r12, r13);
        r6 = r14;
        goto L_0x0168;
    L_0x014d:
        r4 = r3.getParent();
        if (r4 != 0) goto L_0x0165;
    L_0x0153:
        r3 = r3.getId();
        r4 = -1;
        if (r3 == r4) goto L_0x0165;
    L_0x015a:
        r3 = r1.findViewById(r3);
        if (r3 == 0) goto L_0x0165;
    L_0x0160:
        r3 = r0.o;
        if (r3 == 0) goto L_0x0165;
    L_0x0164:
        goto L_0x0167;
    L_0x0165:
        r6 = 0;
        goto L_0x0168;
    L_0x0167:
        r6 = r5;
    L_0x0168:
        r3 = 0;
        goto L_0x016c;
    L_0x016a:
        r3 = 0;
        r6 = 0;
    L_0x016c:
        if (r6 == 0) goto L_0x01b8;
    L_0x016e:
        r3 = r2.b;
        r4 = "android:visibility:screenLocation";
        r3 = r3.get(r4);
        r3 = (int[]) r3;
        r4 = 0;
        r5 = r3[r4];
        r7 = 1;
        r3 = r3[r7];
        r8 = 2;
        r8 = new int[r8];
        r1.getLocationOnScreen(r8);
        r4 = r8[r4];
        r5 = r5 - r4;
        r4 = r6.getLeft();
        r5 = r5 - r4;
        r6.offsetLeftAndRight(r5);
        r4 = r8[r7];
        r3 = r3 - r4;
        r4 = r6.getTop();
        r3 = r3 - r4;
        r6.offsetTopAndBottom(r3);
        r3 = r19.getOverlay();
        r3.add(r6);
        r2 = r0.a(r1, r6, r2);
        if (r2 != 0) goto L_0x01af;
    L_0x01a7:
        r1 = r19.getOverlay();
        r1.remove(r6);
        goto L_0x01b7;
    L_0x01af:
        r3 = new zoi$1;
        r3.<init>(r1, r6);
        r0.a(r3);
    L_0x01b7:
        return r2;
    L_0x01b8:
        if (r3 == 0) goto L_0x01d5;
    L_0x01ba:
        r4 = r3.getVisibility();
        r5 = 0;
        r3.setVisibility(r5);
        r1 = r0.a(r1, r3, r2);
        if (r1 != 0) goto L_0x01cc;
    L_0x01c8:
        r3.setVisibility(r4);
        goto L_0x01d4;
    L_0x01cc:
        r2 = new zoi$2;
        r2.<init>(r3, r4);
        r1.addListener(r2);
    L_0x01d4:
        return r1;
    L_0x01d5:
        r1 = 0;
        goto L_0x01d8;
    L_0x01d7:
        r1 = r6;
    L_0x01d8:
        return r1;
    L_0x01d9:
        r1 = r6;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zoi.a(android.view.ViewGroup, zog, zog):android.animation.Animator");
    }

    public void a(zog zog) {
        zoi.d(zog);
    }

    public final boolean a(zog zog, zog zog2) {
        if (zog == null && zog2 == null) {
            return false;
        }
        if (!(zog == null || zog2 == null)) {
            String str = "android:visibility:visibility";
            if (zog2.b.containsKey(str) != zog.b.containsKey(str)) {
                return false;
            }
        }
        a b = zoi.b(zog, zog2);
        return b.a && (b.c == 0 || b.e == 0);
    }

    public final String[] a() {
        return a;
    }

    public void b(zog zog) {
        zoi.d(zog);
    }
}
